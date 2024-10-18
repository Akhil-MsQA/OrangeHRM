package OrangeHRMTestcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import OrangeHRMPages.PersonalInfoPage;
import OrangeHRMPages.loginPage;

public class TC_4_AddEmployeeInfo extends baseClass{
	
	
	
	
	@Test
	public void AddDetails() throws InterruptedException, IOException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd) ;
		LP.SetUsername(EmployeeId);
		Thread.sleep(3000);
		ScreenShot("T4EmployeeUserName.png");   
		logger.info("Entering the Username");
		
		LP.SetPassword(EmployeePassword);
		Thread.sleep(3000);
		logger.info("Entering the Password");
		ScreenShot("T4EmployeePassword.png");   

		LP.LoginButton();
		Thread.sleep(3000);
		logger.info("Clicked on the login Button");
		ScreenShot("T4LoginButton.png");   

		PersonalInfoPage PIP = new PersonalInfoPage(wd);
		PIP.Info();
		ScreenShot("T4PIM.png");   
		logger.info("Clicked on Information");
		Thread.sleep(4000);
		ScreenShot("T4PIM.png");   

		PIP.Nationality();
		Thread.sleep(4000);
		logger.info("Clicked on the Nationality");
		ScreenShot("T4Nationality.png");   

		PIP.NationalValue();
		Thread.sleep(3000);
		logger.info("Selected the Nationality ");
		ScreenShot("T4Indian.png");   

		PIP.MaritalStatus();
		Thread.sleep(3000);
		logger.info("Clicked on the Marital Status");
		ScreenShot("T4Marital.png");   

		PIP.MaritalValue();
		Thread.sleep(3000);
		logger.info("Selected Marital Status value");
		ScreenShot("T4Single.png");   

		PIP.Gender();
		Thread.sleep(3000);
		logger.info("Selected the Gender");
		ScreenShot("T4Gender.png");   

		PIP.SaveButton();
		Thread.sleep(5000);
		logger.info("Clicked on Save");
		ScreenShot("T4Save.png");   

		PIP.BloodGroup();
		Thread.sleep(4000);
		logger.info("Clicked on the BloodGroup");
		ScreenShot("T4BloodGroup.png");   

		PIP.BloodGroupValue();
		Thread.sleep(3000);
		logger.info("Selected the BloodGroup Value");
		ScreenShot("T4BloodValue.png");   

		PIP.SaveButton();
		Thread.sleep(3000);
		logger.info("Clicked on the Save Button");
		ScreenShot("T4Save2.png");   

		Row row = Sheet2.getRow(4);
		row.createCell(11).setCellValue("Added Personal Data");
		FileOutputStream Fout = new FileOutputStream("C:\\Users\\akhil\\eclipse-workspace\\MavenProject\\QAAutomationFrameWork\\TestingData\\TestData.xlsx");
		   book.write(Fout);
		   book.close();


		
		
		
		
	}

}
