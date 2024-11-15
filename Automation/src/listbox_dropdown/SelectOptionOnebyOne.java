package listbox_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionOnebyOne {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthselect = new Select(monthDropdown);
		List<WebElement> allOptions = monthselect.getOptions();
		
	//	for(int i=0;i<allOptions.size();i++)
	//	{
	//		monthselect.selectByIndex(i);
	//		String text = allOptions.get(i).getText();
	//		monthselect.selectByVisibleText(text);
		
		for(WebElement ele:allOptions) {
			monthselect.selectByVisibleText(ele.getText());
	//		System.out.println(ele.getText());
		if(ele.isSelected())	{
		System.out.println(ele.getText()+"....>Selected");
	   }
			
		}
		}

	

}
