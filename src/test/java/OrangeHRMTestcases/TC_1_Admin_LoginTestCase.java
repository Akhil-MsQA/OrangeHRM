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
		Thread.sleep(2000);
		LP.SetPassword(AdminPassword);
		Thread.sleep(2000);
		LP.LoginButton();
		Thread.sleep(2000);
		LP.ProfileClick();
		Thread.sleep(2000);
		LP.Validation(AdminName);
		LP.Logout();
		
	}

}
