package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenElements {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement genderTf = driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='have a good day!!'",genderTf);
		WebElement fristName = driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].value='hello Raj'",fristName);
		

	}

}
