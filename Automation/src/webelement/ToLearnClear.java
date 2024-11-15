package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement usernameTF = driver.findElement(By.name("usename"));
		Thread.sleep(2000);
		usernameTF.clear();
		usernameTF.sendKeys("testing");
		WebElement passwordTF = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordTF.clear();
		passwordTF.sendKeys("Raj");
		
				
	}

}
