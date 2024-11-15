package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisabledElementsAssandWebelementSS {

	public static void main(String[] args) throws IOException {
		
		String time = LocalDate.now().toString().replace(":","-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/index.php");
		WebElement disabledElement = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='AutomationTesting'",disabledElement);
		
		File temp = driver.findElement(By.xpath("(//input[@type='text'])[2]")).getScreenshotAs(OutputType.FILE);
	
		File dest = new File("./screenshot/element"+time+".png");
		FileHandler.copy(temp, dest);
	}

}
