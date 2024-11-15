package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCssselector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("rajasekharbandrevu@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Raj@555");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
      
	}
}
