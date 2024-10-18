package OrangeHRMTestcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.testng.annotations.Test;

import OrangeHRMPages.loginPage;

public class TC_1_Admin_LoginTestCase extends baseClass{
	
	
	
	
	@Test
	public void Adminlogintest() throws InterruptedException, IOException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(AdminUsername);
		logger.info("Entering the Admin Username");
		Thread.sleep(2000);
		ScreenShot("AdminUsername.png");
		
		LP.SetPassword(AdminPassword);
		logger.info("Entering the Admin Password");
		Thread.sleep(2000);
		ScreenShot("AdminPassword.png");
		
		LP.LoginButton();
		Thread.sleep(4000);
		logger.info("Clicked on the Login Button");
		ScreenShot("LoginButton.png");
		
		LP.ProfileClick();
		logger.info("Clicked on the Profile");
		Thread.sleep(2000);
		ScreenShot("Profile.png");
		
		LP.Logout();
		logger.info("Successfully Logged Out");
		Thread.sleep(3000);
		ScreenShot("Logout.png");
		
		XSSFRow row = Sheet.getRow(1);
		row.createCell(12).setCellValue("SuccessFullyLogin");
		FileOutputStream Fout = new FileOutputStream("C:\\Users\\akhil\\eclipse-workspace\\MavenProject\\QAAutomationFrameWork\\TestingData\\TestData.xlsx");
		   book.write(Fout);
		   book.close();
		
	}

}
