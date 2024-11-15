package crossbrowser;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass2{
	@Test
	public void saleshistory() {
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		Assert.assertEquals(driver.getTitle(),"SkillRary Ecommerce","sales history is not displayed");
		Reporter.log("sales page is displayed",true);
	}

}
