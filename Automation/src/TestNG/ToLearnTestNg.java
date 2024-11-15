package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class ToLearnTestNg {//TestNG class
	@Test
	public void Sample() {//Testcase
		//test steps
		Reporter.log("sample test case executed",true);
	}
	@Test
	public void demo() {
		Reporter.log("demo testcase executed",true);
		
	}
	@Test
	public void add() {
		Reporter.log("add testcase executed",true);
	
}
}