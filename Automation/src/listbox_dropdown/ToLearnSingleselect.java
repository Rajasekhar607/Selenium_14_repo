package listbox_dropdown;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleselect {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		//WebElement monthDropdown = driver.findElement(By.id("month"));//<select>address
		
		//Select monthSelect = new Select(monthDropdown);
		//monthSelect.selectByIndex(10);
		//monthSelect.selectByValue("4");
		//monthSelect.selectByVisibleText("Mar");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		
		Select daySelect = new Select(dayDropDown);
		List<WebElement> allSelectedOPtions = daySelect.getOptions();
		//daySelect.selectByIndex(2);
		//daySelect.selectByValue("5");
		
	//	System.out.println(daySelect.isMultiple());
	/*	for(int i=0;i<allSelectedOPtions.size();i++)
		{
		  daySelect.selectByIndex(i);
		}
*/
		
	}

}
