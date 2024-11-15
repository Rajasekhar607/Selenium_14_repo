package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  fis=new FileInputStream("./testData/login.properties");
        Properties prop=new Properties();
        prop.load(fis);
        String url = prop.getProperty("url");
       String userName = prop.getProperty("username");
       String pasw = prop.getProperty("password");
       
       System.out.println(url);
       System.out.println(userName);
       System.out.println(pasw);
       
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.get(url);
       driver.findElement(By.id("Email")).sendKeys(userName);
       driver.findElement(By.id("Password")).sendKeys(pasw);
	}

}
