package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment {
	
	@Test(priority = 1,invocationCount  = 4)
	public void createAccount() {
		Reporter.log("Account Created Successfully");
	}
	
	@Test(priority = 3)
	public void deleteAccount(){
		Reporter.log("Account deleted");
	}
	@Test(priority = 2,invocationCount = 3,threadPoolSize = 3)
	public void editAccount() {
		Reporter.log("Account edited");
	}

}
