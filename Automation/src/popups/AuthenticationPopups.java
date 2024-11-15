package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AuthenticationPopups {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		                   //username:password@ we have to use to handle authentication popups.
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
