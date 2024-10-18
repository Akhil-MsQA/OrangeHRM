package OrangeHRMTestcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import OrangeHRMPages.loginPage;

public class TC_3_EmployeeLogin extends baseClass {
	
	@Test
	public void EmployeeLogin() throws InterruptedException, IOException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd) ;
		LP.SetUsername(EmployeeId);
		Thread.sleep(3000);
		logger.info("Entering the Employee Username");
		ScreenShot("T3EmployeeUserName.png");   
		
		LP.SetPassword(EmployeePassword);
		Thread.sleep(3000);
		logger.info("Entering the Employee Password");
		ScreenShot("T3EmployeePassword.png");   

		LP.LoginButton();
		Thread.sleep(3000);
		logger.info("Clicked On the LoginButton");
		ScreenShot("T3LoginButton.png");   

		LP.Validation("Raymond Neelamkavil");
		Thread.sleep(3000);
		logger.info("Validating the Username is Correct");
		ScreenShot("T3EmployeeUserName.png");   

		LP.ProfileClick();
		logger.info("Clicking on the Profile Icon");
		Thread.sleep(3000);
		ScreenShot("T3Profile.png");   

		LP.Logout();
		Thread.sleep(3000);
		logger.info("Successfully Logged Out");
		ScreenShot("T3Logout.png");   

		Row row = Sheet.getRow(3);
		row.createCell(12).setCellValue("Logged In Success");
		FileOutputStream Fout = new FileOutputStream("C:\\Users\\akhil\\eclipse-workspace\\MavenProject\\QAAutomationFrameWork\\TestingData\\TestData.xlsx");
		   book.write(Fout);
		   book.close();
		
	
		
	}
}
