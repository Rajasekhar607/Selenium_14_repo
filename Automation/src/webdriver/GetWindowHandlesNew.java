package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesNew {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		     Set<String> allWindowids = driver.getWindowHandles();
		     System.out.println(allWindowids);
		     
		     for(String id:allWindowids)
		     {
		    	 System.out.println(id);
		     }

	}

}
