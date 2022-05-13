package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyWithTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement table = driver.findElement(By.tagName("table"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		System.out.println("rows size" + " " + rows.size());

		List<WebElement> columnSize = rows.get(1).findElements(By.tagName("td"));

		System.out.println("columns size" + " " + columnSize.size());

		System.out.println("Row 2 value" + " " + rows.get(2).getText());

		System.out.println("Row 3 value" + " " + rows.get(3).getText());

		System.out.println("Row 4 value" + " " + rows.get(4).getText());

		List<WebElement> cols = rows.get(rows.size() - 1).findElements(By.tagName("td"));
		cols.get(2).click();
		
		driver.close();

	}

}
