package TestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript extends BaseClass{
	@Test
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		String actualTitle = driver.getTitle();
	//	String expectedFile = "Demo Web Shop. Books";
		
		if(actualTitle.equals(workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue()))
			Reporter.log("Books page displayed",true);
		else
			System.out.println("not displayed");
	}

}
