package practiceExercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import webelement.ToLearnSendkeys;

public class RegisterUser {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		FileInputStream fis=new FileInputStream("./testData/Register.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String email = prop.getProperty("Email");
		String name = prop.getProperty("name");
		String pwd = prop.getProperty("password");
		System.out.println(url);
		System.out.println(email);
		System.out.println(name);
		System.out.println(pwd);
		
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
        if(title.equals("Automation Exercise")) {
        	System.out.println("Homepage visible succesfully");
        }
        else {
        	System.out.println("Homepage is not visible");
        }
        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
        String signupTitle = driver.getTitle();
        System.out.println(signupTitle);
        if(signupTitle.equals("Automation Exercise - Signup / Login")) {
        	System.out.println("New user signup is visible");
        }
        	else {
        		System.out.println("New user signup is not visible");
        	}
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys(email);
        driver.findElement(By.xpath("//button[text()='Signup']")).click();
       String enterAccInformation = driver.getTitle();
       System.out.println(enterAccInformation);
       if(enterAccInformation.equals("Automation Exercise - Signup")) {
    	   System.out.println("Enter Account Information is visible");
       }
       else {
    	   System.out.println("Enter Account Information is not visible");
       }
       driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
       driver.findElement(By.id("password")).sendKeys(pwd);
       WebElement dayDropDown = driver.findElement(By.id("days"));
       Select ref=new Select(dayDropDown);
       ref.selectByVisibleText("10");
       WebElement monthDropDown = driver.findElement(By.id("months"));
       Select ref1=new Select(monthDropDown);
       ref1.selectByVisibleText("July");
      WebElement yearDropDown = driver.findElement(By.id("years"));
      Select ref2=new Select(yearDropDown);
      ref2.selectByVisibleText("2000");
      driver.findElement(By.id("newsletter")).click();
      driver.findElement(By.id("optin")).click();
      driver.findElement(By.id("first_name")).sendKeys("Bandrevu");
      driver.findElement(By.id("last_name")).sendKeys("Rajsekhar");
      driver.findElement(By.id("company")).sendKeys("Travel Tourists");
      driver.findElement(By.id("address1")).sendKeys("madanaplle,chittoor dist,ap,India");
      driver.findElement(By.id("address2")).sendKeys("bangolore,bngl,karnataka");
      driver.findElement(By.id("state")).sendKeys("Andhrapradesh");
      driver.findElement(By.id("city")).sendKeys("tirupati");
      driver.findElement(By.id("zipcode")).sendKeys("517297");
      driver.findElement(By.id("mobile_number")).sendKeys("9014219108");
      driver.findElement(By.xpath("//button[text()='Create Account']")).click();
      String accCreated = driver.getCurrentUrl();
      System.out.println(accCreated);
     if(accCreated.equals("https://automationexercise.com/account_created")) {
    	 System.out.println("Account Created is visible");
     }
     else {
    	 System.out.println("Account created is not visible");
     }
     driver.findElement(By.xpath("//a[text()='Continue']")).click();
     String loggedInasUsername = driver.getTitle();
     System.out.println(loggedInasUsername);
    if(loggedInasUsername.equals("Automation Exercise")) {
    	System.out.println("Logged in as Username visible");
    }
    else {
    	System.out.println("Logged in as Username is not visible");
    }
        driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
        String accountDeleted = driver.getTitle();
        System.out.println(accountDeleted);
        if(accountDeleted.equals("Automation Exercise - Account Created")){
      System.out.println("Account Deleted is visible");}
      else {
    	  System.out.println("Account deleted is not visible");
      }
        driver.findElement(By.xpath("//a[text()='Continue']")).click();
        
}  
	}


	
