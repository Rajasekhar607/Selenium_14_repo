package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindowpopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/products_page/18");
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String id:allwindowIds)
		{
			driver.switchTo().window(id);// switch to any window
			String url = driver.getCurrentUrl();//capture url
			if(url.contains("flipkart")) //compare a url
				break;
		}
        driver.manage().window().maximize();
        Thread.sleep(2000);
         driver.close();
	}

}
