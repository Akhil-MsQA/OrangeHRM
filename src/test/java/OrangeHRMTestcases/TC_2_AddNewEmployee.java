package OrangeHRMTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import OrangeHRMPages.EmployeePage;
import OrangeHRMPages.loginPage;

public class TC_2_AddNewEmployee extends baseClass{
	
	
	
	@Test
	public void AddEmployee() throws InterruptedException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(AdminUsername);
		Thread.sleep(2000);
		logger.info("Entering Admin Username");
		LP.SetPassword(AdminPassword);
		Thread.sleep(2000);
		logger.info("Entering the Admin Password");
		LP.LoginButton();
		Thread.sleep(2000);
		logger.info("Clicked the Login Button");
		EmployeePage EMP = new EmployeePage(wd);
		EMP.PIM();
		Thread.sleep(2000);
		logger.info("Clicked on the PIM");
		EMP.AddNewEmployee();
		Thread.sleep(2000);
		logger.info("Clicked on the AddEmployee tab");
		EMP.SetFirstName("Raymond");
		Thread.sleep(2000);
		logger.info("Entering Employee first name");
		EMP.SetMiddleName("Lorence");
		Thread.sleep(2000);
		logger.info("Entering Employee Middle Name");
		EMP.SetLastname("Neelamkavil");
		Thread.sleep(2000);
		logger.info("Entering Employee Last Name");
		EMP.Employeeid("1155846");
		Thread.sleep(2000);
		logger.info("Entering Employee ID Number");
		EMP.Checkbox();
		logger.info("Clicked on the CheckBox");
		EMP.SetUsername(EmployeeId);
		Thread.sleep(2000);
		logger.info("Entering Employee Username");
		EMP.SetPassword(EmployeePassword);
		Thread.sleep(4000);
		logger.info("Entering Employee Password");
		EMP.SetConfirmPassword(EmployeePassword);
		Thread.sleep(4000);
		logger.info("Entering Employee Password Again");
		EMP.save();
		logger.info("Clicked on the Save Button");
		Thread.sleep(7000);
		LP.ProfileClick();
		logger.info("Clicked on the Profile icon");
		Thread.sleep(2000);
		LP.Logout();
		logger.info("SuccessFully Logged Out");

		
	}

}
