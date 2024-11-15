package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String errormsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
        System.out.println(errormsg);
        
        if(errormsg.contains("Login was unsuccessful. Please correct the errors and try again."))
        {
        	System.out.println("Error msg is displayed");
        }
        else
        {
        	System.out.println("Error msg is not displayed");
        }
	}

}
