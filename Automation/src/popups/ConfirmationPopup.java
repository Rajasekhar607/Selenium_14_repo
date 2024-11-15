package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		
		Alert confirmPopup=driver.switchTo().alert();
		System.out.println(confirmPopup.getText());
		
		confirmPopup.accept();
		Thread.sleep(2000);
		System.out.println(confirmPopup.getText());
		confirmPopup.accept();
	}

}
