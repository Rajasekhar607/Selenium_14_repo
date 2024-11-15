package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_4_10_FileUpload_popup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("(//p[@class='main-2'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\gunas\\Downloads\\RESUME RAJASEKHAR (4).pdf");
	}

}
