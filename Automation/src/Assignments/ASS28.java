package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ASS28 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
        driver.findElement(By.xpath("//section[text()='Button']")).click();
        driver.findElement(By.linkText("Right Click")).click();
        Actions act=new Actions(driver);
      //  WebElement rightClick = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
        act.contextClick(driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"))).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Yes']")).click();
      WebElement succesmsg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
      String result = succesmsg.getText();
      System.out.println(result);
      String colour = succesmsg.getCssValue("color");
      System.out.println(colour);
	}

}
