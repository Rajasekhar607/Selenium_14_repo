package crossbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass2 {

	public WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	public void launch(@Optional("chrome") String browsername) {
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(browsername.equals("edge")) {
			driver=new EdgeDriver();
		}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapp.skillrary.com/");;
		}
		@BeforeMethod
		public  void login() {
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.id("email")).sendKeys(("admin"));
			driver.findElement(By.id("password")).sendKeys(("admin"));
			driver.findElement(By.xpath("//button[text()='Login']")).click();
		}
		@AfterMethod
		public void logout() {
			driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
			driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		}
		@AfterClass
		public void closebrowser(){
			driver.quit();
	}
}
