package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			 System.out.println("user navigated succesfully");
		 }
		 else {
			 System.out.println("user failed to navigate");
		 }
		 }
}


