package listbox_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetFirstSelectedOption {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListBox = driver.findElement(By.id("cars"));
		Select priceselect = new Select(priceListBox);
		priceselect.selectByIndex(2);
		priceselect.selectByIndex(0);
		priceselect.selectByIndex(1);
		
		WebElement selectedoption = priceselect.getFirstSelectedOption();
		System.out.println(selectedoption.getText());
		
		List<WebElement> allSelectedOptions = priceselect.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());
		for(WebElement opt:allSelectedOptions)
		{
			System.out.println(opt.getText());
		}
		
		

	}

}
