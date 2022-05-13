package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOfRowsCols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://html.com/tags/table/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement table = driver.findElement(By.xpath("//table[@class='attributes-list']"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		System.out.println("the number of rows is" + " " + rows.size());

		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));

		System.out.println("The number of columns" + " " + cols.size());

	}

}
