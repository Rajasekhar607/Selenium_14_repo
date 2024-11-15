package practiceExercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUserwithCorrectEmailandPassword {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		FileInputStream fis=new FileInputStream("./testData/Register.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		
		driver.get(url);
       String homePage = driver.getTitle();
       System.out.println(homePage);
       if(homePage.equals("Automation Exercise")) {
    	   System.out.println("Homepage visible Succesfully");
       }
       else {
    	   System.out.println("Homepage not visble Successfully");
       }
       driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
       String signUpPage = driver.getTitle();
       if(signUpPage.equals("Automation Exercise - Signup / Login"))
       {
    	   System.out.println("signup page is visible");
       }
       else {
    	   System.out.println("signup page is not visible");
       }
       driver.findElement(By.name("email")).sendKeys("brajasekhar627@gmail.com");
       driver.findElement(By.name("password")).sendKeys("rajaS323");
       driver.findElement(By.linkText("Login")).click();
       
       
	}

}
