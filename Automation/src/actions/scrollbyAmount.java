package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class scrollbyAmount {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/sql-cheat-sheet/");
		Actions art=new Actions(driver);
		
		art.scrollByAmount(0, 500).perform();
		art.scrollByAmount(0, 400).perform();
		

	}

}
