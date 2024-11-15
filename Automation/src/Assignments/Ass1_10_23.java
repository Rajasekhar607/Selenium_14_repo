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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass1_10_23 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement mapFrame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		
		driver.switchTo().frame(mapFrame);
		driver.findElement(By.name("Montana")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("SIGN UP")).click();
		

		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("rajasekhar132@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rajasekhar@323");
		driver.findElement(By.xpath("//input[@id='cpass']")).sendKeys("Rajasekhar@323");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rajasekhar");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bandrevu");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9014219102");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='user-type']"));
		Select ref=new Select(dropDown);
		ref.selectByValue("3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@value='Register']")).click();
        
        TakesScreenshot ts = (TakesScreenshot) driver;
         File temp = ts.getScreenshotAs(OutputType.FILE);
         File dest = new File("./screenshot/image.png");
         FileHandler.copy(temp, dest);
        
	}

}
