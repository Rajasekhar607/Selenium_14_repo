package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Ass28_2 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		Actions act=new Actions(driver);
        WebElement button = driver.findElement(By.id("btn20"));
        act.doubleClick(button).perform();
        
        TakesScreenshot ts=(TakesScreenshot) driver;
      File temp = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("./screenshot/img.png");
            FileHandler.copy(temp, dest);
	
        
	}

}
