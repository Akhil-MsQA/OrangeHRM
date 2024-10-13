package OrangeHRMTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import OrangeHRMPages.PersonalInfoPage;
import OrangeHRMPages.loginPage;

public class TC_4_AddEmployeeInfo extends baseClass{
	
	
	
	
	@Test
	public void AddDetails() throws InterruptedException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd) ;
		LP.SetUsername(EmployeeId);
		LP.SetPassword(EmployeePassword);
		LP.LoginButton();
		PersonalInfoPage PIP = new PersonalInfoPage(wd);
		PIP.Info();
		Thread.sleep(4000);
		PIP.Nationality();
		Thread.sleep(2000);
		PIP.NationalValue();
		Thread.sleep(2000);
		PIP.MaritalStatus();
		Thread.sleep(2000);
		PIP.MaritalValue();
		Thread.sleep(2000);
		PIP.Gender();
		Thread.sleep(2000);
		PIP.SaveButton();
		Thread.sleep(3000);
		PIP.BloodGroup();
		Thread.sleep(2000);
		PIP.BloodGroupValue();
		Thread.sleep(2000);
		PIP.SaveButton();
		System.out.println("HI the pagesource");
		System.out.println(wd.getPageSource());
		

		
		
		
		
	}

}
