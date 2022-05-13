package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// setup the webdriver property
		WebDriverManager.chromedriver().setup();

		// intitalize the chromedriver
		ChromeDriver driver = new ChromeDriver();

		// launch the url
		driver.get("https://www.chittorgarh.com/");

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();

		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();

		WebElement table = driver.findElement(By.xpath("//div[@class='table-responsive']"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());

		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Security name:" + " " + column.get(3).getText());
		}

		driver.quit();
	}

}
