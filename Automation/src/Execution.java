import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Execution {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/image.png");
		   FileHandler.copy(temp, dest)  ; 
		   driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		   
		    Set<String> ids = driver.getWindowHandles();
		    for(String Id:ids)
		   driver.switchTo().window(Id);
		
		  WebElement companylink = driver.findElement(By.partialLinkText("Company"));
		  Actions act=new Actions(driver);
		  act.moveToElement(companylink).perform();
		 driver.findElement(By.partialLinkText("Contact Us")).click();
		WebElement num = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/..//p[@class='font-size-sm mb-0']"));
	     System.out.println(num.getText());
	}

}
