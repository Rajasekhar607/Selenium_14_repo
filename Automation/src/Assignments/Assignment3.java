package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoapp.skillrary.com/");
		driver.findElement(By.partialLinkText("SIGNUP")).click();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		if(currenturl.equals("https://demoapp.skillrary.com/login.php?type=register"))
		{
			System.out.println("inside if");
			driver.findElement(By.name("firstname")).sendKeys("Raju");
			driver.findElement(By.name("lastname")).sendKeys("Bqs");
			driver.findElement(By.name("email")).sendKeys("rajasekhar@123");
			driver.findElement(By.name("password")).sendKeys("Rajasek@123");
			driver.findElement(By.name("repassword")).sendKeys("Rajasek@123");
			
			
			Thread.sleep(2000);
			
			driver.findElement(By.partialLinkText("Register")).click();
			
			
		

	}

}
}
