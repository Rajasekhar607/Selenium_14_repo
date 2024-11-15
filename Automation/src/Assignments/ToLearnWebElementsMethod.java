package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWebElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		/*String baseurl = driver.getCurrentUrl();
		System.out.println(baseurl);
	if(baseurl=="https://demo.vtiger.com/vtigercrm/index.php")*/
		if(driver.getCurrentUrl().equals("https://demo.vtiger.com/vtigercrm/index.php"))
			System.out.println("welcome page loaded");
		else
			System.out.println("welcome page not loaded");
		WebElement usernameTF = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		usernameTF.clear();
		usernameTF.sendKeys("Testing");
		WebElement passwordTF = driver.findElement(By.id("password"));
		passwordTF.clear();
		passwordTF.sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
		
		
		
	}

}
