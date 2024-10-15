package OrangeHRMTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import OrangeHRMPages.loginPage;

public class TC_3_EmployeeLogin extends baseClass {
	
	@Test
	public void EmployeeLogin() throws InterruptedException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd) ;
		LP.SetUsername(EmployeeId);
		logger.info("Entering the Employee Username");
		LP.SetPassword(EmployeePassword);
		logger.info("Entering the Employee Password");
		LP.LoginButton();
		logger.info("Clicked On the LoginButton");
		LP.Validation("Raymond Neelamkavil");
		logger.info("Validating the Username is Correct");
		LP.ProfileClick();
		logger.info("Clicking on the Profile Icon");
		Thread.sleep(2000);
		LP.Logout();
		logger.info("Successfully Logged Out");
		
	
		
	}
}
