package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/gunas/OneDrive/Desktop/Table.html");
		
		String collection = driver.findElement(By.xpath("//td[text()=' KGF ']/following-sibling::td[1]")).getText();
        System.out.println(collection);
        String collection2 = driver.findElement(By.xpath("//td[text()=' Devara ']/following-sibling::td[2]")).getText();
	    System.out.println(collection2);
	}
	

}
