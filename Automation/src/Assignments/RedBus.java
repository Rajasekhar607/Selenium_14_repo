package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		    String title = driver.getTitle();
		    System.out.println(title);
		    driver.manage().window().maximize();
		  Dimension size = driver.manage().window().getSize();
		    System.out.println("height="+ size.getHeight());
		    System.out.println("width="+ size.getWidth());
		    driver.close();
		      

	}

}
