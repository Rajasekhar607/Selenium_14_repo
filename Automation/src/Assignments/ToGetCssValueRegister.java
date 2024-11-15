package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCssValueRegister {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.linkText("Register"));
		String color = register.getCssValue("color");
	    String fontsize = register.getCssValue("font-size");
	    String background = register.getCssValue("background");
		
		System.out.println(color);
		System.out.println(fontsize);
		System.out.println(background);

	}

}
