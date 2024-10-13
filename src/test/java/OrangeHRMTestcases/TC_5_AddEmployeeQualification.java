package OrangeHRMTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import OrangeHRMPages.EmployeeQualificationPage;
import OrangeHRMPages.loginPage;

public class TC_5_AddEmployeeQualification extends baseClass{
	
	
	
	@Test
	public void EmployeeQualification() {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(EmployeeId);
		LP.SetPassword(EmployeePassword);
		LP.LoginButton();
		EmployeeQualificationPage EQP = new EmployeeQualificationPage(wd);
		EQP.Qualificationlink();
		EQP.AddButton();
	}

}
