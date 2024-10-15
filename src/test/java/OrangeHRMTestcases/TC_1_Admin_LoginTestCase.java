package OrangeHRMTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import OrangeHRMPages.loginPage;

public class TC_1_Admin_LoginTestCase extends baseClass{
	
	
	
	
	@Test
	public void Adminlogintest() throws InterruptedException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(AdminUsername);
		logger.info("Entering the Admin Username");
		Thread.sleep(2000);
		LP.SetPassword(AdminPassword);
		logger.info("Entering the Admin Password");
		Thread.sleep(2000);
		LP.LoginButton();
		logger.info("Clicked on the Login Button");
		Thread.sleep(2000);
		LP.ProfileClick();
		logger.info("Clicked on the Profile");
		Thread.sleep(2000);
		//LP.Validation(AdminName);
		LP.Logout();
		logger.info("Successfully Logged Out");
		
	}

}
