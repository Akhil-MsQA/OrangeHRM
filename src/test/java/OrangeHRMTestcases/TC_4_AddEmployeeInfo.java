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
		logger.info("Entering the Username");
		LP.SetPassword(EmployeePassword);
		logger.info("Entering the Password");
		LP.LoginButton();
		logger.info("Clicked on the login Button");
		PersonalInfoPage PIP = new PersonalInfoPage(wd);
		PIP.Info();
		logger.info("Clicked on Information");
		Thread.sleep(4000);
		PIP.Nationality();
		Thread.sleep(2000);
		logger.info("Clicked on the Nationality");
		PIP.NationalValue();
		Thread.sleep(2000);
		logger.info("Selected the Nationality ");
		PIP.MaritalStatus();
		Thread.sleep(2000);
		logger.info("Clicked on the Marital Status");
		PIP.MaritalValue();
		Thread.sleep(2000);
		logger.info("Selected Marital Status value");
		PIP.Gender();
		Thread.sleep(2000);
		logger.info("Selected the Gender");
		PIP.SaveButton();
		Thread.sleep(3000);
		logger.info("Clicked on Save");
		PIP.BloodGroup();
		Thread.sleep(2000);
		logger.info("Clicked on the BloodGroup");
		PIP.BloodGroupValue();
		Thread.sleep(2000);
		logger.info("Selected the BloodGroup Value");
		PIP.SaveButton();
		logger.info("Clicked on the Save Button");


		
		
		
		
	}

}
