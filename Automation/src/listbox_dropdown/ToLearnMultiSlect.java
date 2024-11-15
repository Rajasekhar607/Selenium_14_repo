package listbox_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSlect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapp.skillrary.com/");
       WebElement priceListbox = driver.findElement(By.id("cars"));
       Select priceSelectbox = new Select(priceListbox);
       priceSelectbox.selectByIndex(0);
       priceSelectbox.selectByValue("199");
       priceSelectbox.selectByVisibleText("INR 200 - INR 299 ( 3 )");
       Thread.sleep(2000);
       priceSelectbox.deselectAll();
       
       System.out.println(priceSelectbox.isMultiple());
	}

}
