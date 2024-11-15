package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation1.class)
public class TestScript1 extends BaseClass {
	
	@Test
	public void login() {
		Reporter.log("click on login",true);
		driver.findElement(By.linkText("Log in")).click();
		
		Reporter.log("enter valid credentials",true);
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		
		Reporter.log("click on login",true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web ","home page is not displayed");
		Reporter.log("home page is displayed",true);
		
	}
	}


