package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("9014219102");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Contact uploading')]")).click();
		List<WebElement> head = driver.findElements(By.tagName("a"));
        for(WebElement Head: head)
        {
        	System.out.println(Head.getText());
        }
	}

}
