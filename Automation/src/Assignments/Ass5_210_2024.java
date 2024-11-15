package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass5_210_2024 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/products_page/18");
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String id:allwindowIds)
		{
			driver.switchTo().window(id);// switch to any window
			String url = driver.getCurrentUrl();//capture url
			if(url.contains("amazon")) //compare a url
			break;
	}
		Actions act=new Actions(driver);
		act.scrollByAmount(300, 500).perform();
		driver.manage().window().maximize();

}
}
