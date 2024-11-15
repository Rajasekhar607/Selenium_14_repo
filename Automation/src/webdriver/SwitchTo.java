package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			System.out.println(url);
		
			if(url.contains("ebay"))
			{
				   Dimension size = driver.manage().window().getSize();
				   System.out.println(size);
				
			}
			if(url.contains("flipkart"))
				driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).sendKeys("mobiles");
		}
	}

	
}
