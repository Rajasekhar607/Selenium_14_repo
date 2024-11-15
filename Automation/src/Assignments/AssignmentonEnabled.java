package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentonEnabled {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 Rectangle subscribe = driver.findElement(By.id("newsletter-subscribe-button")).getRect();
		
		
		
		 System.out.println("height : "+subscribe.getHeight());
		System.out.println("width : "+subscribe.getWidth());
        System.out.println("X :"+subscribe.getX());
        System.out.println("Y : "+subscribe.getY());
	}

}
