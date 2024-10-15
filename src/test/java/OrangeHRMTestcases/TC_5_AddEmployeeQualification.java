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
		logger.info("Entering the UserName");
		LP.SetPassword(EmployeePassword);
		logger.info("Entering the Password");
		LP.LoginButton();
		logger.info("Clicked on the Login Button");
		PersonalInfoPage PIP = new PersonalInfoPage(wd);
		PIP.Info();
		logger.info("Clicked on the Personal Information tab");
		EmployeeQualificationPage EQP = new EmployeeQualificationPage(wd);
		EQP.Qualificationlink();
		logger.info("Clicked on the Qualification Link");
		EQP.AddButton();
		logger.info("Clicked on the WorkExperience AddButton");
		EQP.CompanyName("ABCLimited");
		Thread.sleep(2000);
		logger.info("Entered the Company Name");
		EQP.JobTitle("QA Engineer");
		Thread.sleep(2000);
		logger.info("Entered the Job Position");
		EQP.FromDate("2021-21-07");
		Thread.sleep(2000);
		logger.info("Entered the FromDate");
		EQP.ToDate("2023-08-08");
		Thread.sleep(2000);
		logger.info("Entered the ToDate");
		EQP.SaveButton();
		Thread.sleep(5000);
		logger.info("Clicked on the Save Button");
		EQP.EducationAddbutton();
		Thread.sleep(2000);
		logger.info("Clicked on the Education Add Button");
		EQP.EducationLevel();
		Thread.sleep(2000);
		logger.info("Clicked on the Education Level");
		EQP.EducationalValue();
		Thread.sleep(2000);
		logger.info("Entered the Education Level");
		EQP.InstituteName("Jain University");
		Thread.sleep(2000);
		logger.info("Entered the Institution name");
		EQP.Course("Computer Science");
		Thread.sleep(1000);
		logger.info("Entered the Course Name");
		EQP.Year("2023");
		Thread.sleep(1000);
		logger.info("Entered the Completed Year");
		EQP.Score("82%");
		Thread.sleep(1000);
		logger.info("Entered the CGPA");
		EQP.EduFromDate("2018-21-07");
		Thread.sleep(1000);
		logger.info("Entered the From Date");
		EQP.EduToDate("2021-21-07");
		Thread.sleep(2000);
		logger.info("Entered the To Date");
		EQP.SaveButton();
		logger.info("Clicked the Save Button");

		
	}

}
