package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement goodRadiobutton = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
	    System.out.println("=====before-clicking=======");
		System.out.println(goodRadiobutton.isSelected());
		goodRadiobutton.click();
		System.out.println("=====after-clicking======");
		System.out.println(goodRadiobutton.isSelected());
	
	}
 
}
