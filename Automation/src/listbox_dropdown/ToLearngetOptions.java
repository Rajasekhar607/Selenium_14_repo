package listbox_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearngetOptions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListbox = driver.findElement(By.id("cars"));
       Select priceSelect = new Select(priceListbox);
       
       List<WebElement> allSelectedOptions = priceSelect.getOptions();
       System.out.println(allSelectedOptions.size());
       
       for(WebElement ele:allSelectedOptions)
       {
    	   System.out.println(ele.getText());
       }
	}

}
