package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign25_9Day {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
	  WebElement register = driver.findElement(By.xpath("//span[text()='REGISTER NOW']"));
      System.out.println(register.isDisplayed());
      driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
      WebElement currentCityDropDown = driver.findElement(By.id("currentCity"));
      Select cityselect = new Select(currentCityDropDown);
      cityselect.selectByValue("65");
      WebElement course = driver.findElement(By.id("course"));
      Select selectCourse = new Select(course);
      selectCourse.selectByValue("16");
	}

}
