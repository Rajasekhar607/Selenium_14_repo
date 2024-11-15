package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ducati {
	@Test(groups = {"smoke","functionality"})
	public void launch() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zigwheels.com/ducati-bikes/panigale-v4#leadform");
		Reporter.log("Ducati launched succesfull",true);

}
}