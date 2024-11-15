package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.ClickAndHold;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		// driver.switchTo().frame(0);
	// 	driver.switchTo().frame("send-sms-iframe");//id or name of tag
		WebElement frameExample = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frameExample);
		driver.findElement(By.id("regEmail")).sendKeys("9014219102");
		driver.findElement(By.id("regUser")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();	
		driver.findElement(By.id("hamburger")).click();
	}

}
