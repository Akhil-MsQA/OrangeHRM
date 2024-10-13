package OrangeHRMTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import OrangeHRMPages.EmployeeQualificationPage;
import OrangeHRMPages.PersonalInfoPage;
import OrangeHRMPages.loginPage;

public class TC_5_AddEmployeeQualification extends baseClass{
	
	
	
	@Test
	public void EmployeeQualification() throws InterruptedException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(EmployeeId);
		LP.SetPassword(EmployeePassword);
		LP.LoginButton();
		PersonalInfoPage PIP = new PersonalInfoPage(wd);
		PIP.Info();
		EmployeeQualificationPage EQP = new EmployeeQualificationPage(wd);
		EQP.Qualificationlink();
		EQP.AddButton();
		EQP.CompanyName("ABCLimited");
		Thread.sleep(2000);
		EQP.JobTitle("QA Engineer");
		Thread.sleep(2000);
		EQP.FromDate("2021-21-07");
		Thread.sleep(2000);
		EQP.ToDate("2023-08-08");
		Thread.sleep(2000);
		EQP.SaveButton();
		Thread.sleep(5000);
		EQP.EducationAddbutton();
		Thread.sleep(2000);
		EQP.EducationLevel();
		Thread.sleep(2000);
		EQP.EducationalValue();
		Thread.sleep(2000);
		EQP.InstituteName("Jain University");
		Thread.sleep(2000);
		EQP.Course("Computer Science");
		Thread.sleep(1000);
		EQP.Year("2023");
		Thread.sleep(1000);
		EQP.Score("82%");
		Thread.sleep(1000);
		EQP.EduFromDate("2018-21-07");
		Thread.sleep(1000);
		EQP.EduToDate("2021-21-07");
		Thread.sleep(2000);
		EQP.SaveButton();
		
	}

}
