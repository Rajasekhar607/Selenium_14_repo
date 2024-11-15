package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentonIsSelected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
        
		WebElement route = driver.findElement(By.linkText("Hyderabad to Bangalore Bus"));
		route.click();
		Thread.sleep(2000);
		WebElement type = driver.findElement(By.xpath("//div[text()='Bus Partner']"));
		type.click();
		 WebElement checkbox = driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/..//input[@type='checkbox']"));
		 checkbox.click();
		List<WebElement> busesAY = driver.findElements(By.xpath("//span[@class='buses-availability']"));
		System.out.println(busesAY);
		
	}

}