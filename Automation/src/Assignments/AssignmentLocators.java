package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		 WebElement value = driver.findElement(By.id("gender-male"));
		value.click();
		driver.findElement(By.name("FirstName")).sendKeys("Raju");
		driver.findElement(By.id("LastName")).sendKeys("Sekhar");
		driver.findElement(By.id("Email")).sendKeys("sampreeth123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raj@323266");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Raj@323266");
		driver.findElement(By.id("register-button")).click();
		
		
		
		

	}

}
