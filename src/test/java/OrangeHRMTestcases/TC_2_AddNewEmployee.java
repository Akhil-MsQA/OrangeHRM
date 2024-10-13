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
		LP.SetPassword(AdminPassword);
		Thread.sleep(2000);
		LP.LoginButton();
		Thread.sleep(2000);
		EmployeePage EMP = new EmployeePage(wd);
		EMP.PIM();
		Thread.sleep(2000);
		EMP.AddNewEmployee();
		Thread.sleep(2000);
		EMP.SetFirstName("Raymond");
		Thread.sleep(2000);
		EMP.SetMiddleName("Lorence");
		Thread.sleep(2000);
		EMP.SetLastname("Neelamkavil");
		Thread.sleep(2000);
		EMP.Employeeid("1155846");
		Thread.sleep(2000);
		EMP.Checkbox();
		EMP.SetUsername(EmployeeId);
		Thread.sleep(2000);
		EMP.SetPassword(EmployeePassword);
		Thread.sleep(4000);
		EMP.SetConfirmPassword(EmployeePassword);
		Thread.sleep(4000);
		EMP.save();
		Thread.sleep(7000);
		LP.ProfileClick();
		Thread.sleep(2000);
		LP.Logout();
		
	}

}
