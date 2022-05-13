package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibraryValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://html.com/tags/table/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement table = driver.findElement(By.tagName("table"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
//	      String text = rows.get(1).getText();
//	      
//	      System.out.println(text);
//	      
//	      String text2 = rows.get(2).getText();
//	      
//	      System.out.println(text2);
//		
		for (int i=1;i<rows.size()-1;i++)
		{
			String data = rows.get(i).getText();
			
			System.out.println(data);
	}
	
		
	}

}
