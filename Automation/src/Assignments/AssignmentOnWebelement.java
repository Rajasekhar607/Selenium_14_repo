package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webelement.GetText;



public class AssignmentOnWebelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
	    WebElement usernameTF = driver.findElement(By.name("username"));
	    
	    Thread.sleep(2000);
	    
	    usernameTF.clear();
	    usernameTF.sendKeys("Rajasekhar");
	    
	   WebElement passwordTF = driver.findElement(By.name("password"));
	   
	   passwordTF.clear();
	   passwordTF.sendKeys("Raj@323");
	   
	   driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();
	   
	      WebElement errormsg = driver.findElement(By.xpath("//span[@id='validationMessage']"));
	      String result = errormsg.getText();
	   System.out.println(result);
	   
	 if(result.equals("Invalid credentials"))
		 
		   System.out.println("Error msg Displayed");
	   else
		   System.out.println("Error msg not displayed");
	   
	      String color = errormsg.getCssValue("color");
 
	       System.out.println(color);
	       if(color.contains("255"))
	    		   
	    		   System.out.println("color is matched");
	       else
	    	   System.out.println("color is not matched");

	  
	   
	   
	   
	   
	}
          
}

