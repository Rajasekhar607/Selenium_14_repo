package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	// driver.get("https://www.redbus.in/");   // get(string url);
	
    // driver.navigate().to("https://www.redbus.in/"); // to(string url);
	
	driver.navigate().to(new URL("https://www.redbus.in/"));// to (URL url);
	
	 //Thread.sleep(2000);
	 //  driver.navigate().back();
	 //  driver.navigate().forward();
     //  driver.navigate().refresh();
	
	}
	

}
