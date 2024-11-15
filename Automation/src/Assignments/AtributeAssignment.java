package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtributeAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement searchTF = driver.findElement(By.name("q"));
		String value = searchTF.getAttribute("title");
         System.out.println(value);
         
         if(value.equals("Search for Products, Brands and More"))
        	 
        	 System.out.println("Tool tip is displayed");
         else
        	 System.out.println("Tool tip is not displayed");
	}

}
