package OrangeHRMTestcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import OrangeHRMPages.EmployeeQualificationPage;
import OrangeHRMPages.PersonalInfoPage;
import OrangeHRMPages.loginPage;

public class TC_5_AddEmployeeQualification extends baseClass{
	
	
	
	@Test
	public void EmployeeQualification() throws InterruptedException, IOException {
		String CompanyName=Sheet2.getRow(5).getCell(1).getStringCellValue();
		String JobTitle=Sheet2.getRow(5).getCell(2).getStringCellValue();
		String FromDate=Sheet2.getRow(5).getCell(3).getStringCellValue();
		String ToDate=Sheet2.getRow(5).getCell(4).getStringCellValue();
		String InstituteName=Sheet2.getRow(5).getCell(5).getStringCellValue();
		String CourseName=Sheet2.getRow(5).getCell(6).getStringCellValue();
		String Year=Sheet2.getRow(5).getCell(7).getRawValue();
		String CGPA=Sheet2.getRow(5).getCell(8).getRawValue();
		String EFromDate=Sheet2.getRow(5).getCell(9).getStringCellValue();
		String EToDate=Sheet2.getRow(5).getCell(10).getStringCellValue();
		
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(EmployeeId);
		Thread.sleep(3000);
		logger.info("Entering the UserName");
		ScreenShot("T5EmployeeUsername.png");   

		LP.SetPassword(EmployeePassword);
		Thread.sleep(3000);
		logger.info("Entering the Password");
		ScreenShot("T5EmployeePassword.png");   

		LP.LoginButton();
		Thread.sleep(3000);
		logger.info("Clicked on the Login Button");
		ScreenShot("T5LoginButton.png");   

		PersonalInfoPage PIP = new PersonalInfoPage(wd);
		PIP.Info();
		Thread.sleep(3000);
		logger.info("Clicked on the Personal Information tab");
		ScreenShot("T5PIP.png");   

		EmployeeQualificationPage EQP = new EmployeeQualificationPage(wd);
		EQP.Qualificationlink();
		Thread.sleep(3000);
		logger.info("Clicked on the Qualification Link");
		ScreenShot("T5Qualification.png");   

		EQP.AddButton();
		Thread.sleep(3000);
		logger.info("Clicked on the WorkExperience AddButton");
		ScreenShot("T5WorkAddButton.png");   

		EQP.CompanyName(CompanyName);
		Thread.sleep(3000);
		logger.info("Entered the Company Name");
		ScreenShot("T5CompanyName.png");   

		EQP.JobTitle(JobTitle);
		Thread.sleep(3000);
		logger.info("Entered the Job Position");
		ScreenShot("T5JobTitle.png");   

		EQP.FromDate(FromDate);
		Thread.sleep(3000);
		logger.info("Entered the FromDate");
		ScreenShot("T5FromDate.png");   

		EQP.ToDate(ToDate);
		Thread.sleep(3000);
		logger.info("Entered the ToDate");
		ScreenShot("T5ToDate.png");   

		EQP.SaveButton();
		Thread.sleep(5000);
		logger.info("Clicked on the Save Button");
		ScreenShot("T5Save.png");   

		EQP.EducationAddbutton();
		Thread.sleep(2000);
		logger.info("Clicked on the Education Add Button");
		ScreenShot("T5Education.png");   

		EQP.EducationLevel();
		Thread.sleep(4000);
		logger.info("Clicked on the Education Level");
		ScreenShot("T5EducationLevel.png");   

		EQP.EducationalValue();
		Thread.sleep(2000);
		logger.info("Entered the Education Level");
		ScreenShot("T5EducationValue.png");   

		EQP.InstituteName(InstituteName);
		Thread.sleep(3000);
		logger.info("Entered the Institution name");
		ScreenShot("T5InstituteName.png");   

		EQP.Course(CourseName);
		Thread.sleep(3000);
		logger.info("Entered the Course Name");
		ScreenShot("T5CourseName.png");   

		EQP.Year(Year);
		Thread.sleep(3000);
		logger.info("Entered the Completed Year");
		ScreenShot("T5CourseYear.png");   

		EQP.Score(CGPA);
		Thread.sleep(3000);
		logger.info("Entered the CGPA");
		ScreenShot("T5Marks.png");   

		EQP.EduFromDate(EFromDate);
		Thread.sleep(3000);
		logger.info("Entered the From Date");
		ScreenShot("T5EFromDate.png");   

		EQP.EduToDate(EToDate);
		Thread.sleep(3000);
		logger.info("Entered the To Date");
		ScreenShot("T5EToDate.png");   

		EQP.SaveButton();
		Thread.sleep(3000);
		logger.info("Clicked the Save Button");
		ScreenShot("T5Save1.png");   

		Row row = Sheet2.getRow(5);
		row.createCell(11).setCellValue("Qualification Details Added");
		FileOutputStream Fout = new FileOutputStream("C:\\Users\\akhil\\Documents\\TestData.xlsx");
		   book.write(Fout);
		   book.close();

		
	}

}
