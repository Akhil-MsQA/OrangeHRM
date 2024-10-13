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
		LP.SetPassword(EmployeePassword);
		LP.LoginButton();
		LP.Validation("Raymond Neelamkavil");
		
	
		
	}
}
