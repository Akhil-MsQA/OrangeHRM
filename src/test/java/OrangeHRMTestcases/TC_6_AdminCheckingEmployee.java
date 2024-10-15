package OrangeHRMTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import OrangeHRMPages.EmployeeTablePage;
import OrangeHRMPages.loginPage;

public class TC_6_AdminCheckingEmployee extends baseClass{
	
	
	
	
	@Test
	public void EmployeeChecking() throws InterruptedException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(AdminUsername);
		logger.info("Entered the Admin Username");
		Thread.sleep(2000);
		LP.SetPassword(AdminPassword);
		logger.info("Entered the Admin Password");
		Thread.sleep(2000);
		LP.LoginButton();
		logger.info("Clicked on the Login Button");
		Thread.sleep(2000);
		EmployeeTablePage ETP = new EmployeeTablePage(wd);
		ETP.PIM();
		logger.info("Clicked on the PIM");
		Thread.sleep(2000);
		ETP.EmployeeList();
		logger.info("Checked the EmployeeList is selected OR Not");
		Thread.sleep(2000);
		ETP.TableData();
		logger.info("Entering the Table Data");
		Thread.sleep(2000);
	
	
	
	
	

}

}