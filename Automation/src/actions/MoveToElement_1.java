package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		WebElement beautyLink = driver.findElement(By.partialLinkText("BEAUTY"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(beautyLink).perform();
		driver.findElement(By.linkText("Eyeliner")).click();
		

}
}