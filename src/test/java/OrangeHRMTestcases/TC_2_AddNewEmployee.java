package OrangeHRMTestcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.testng.annotations.Test;

import OrangeHRMPages.EmployeePage;
import OrangeHRMPages.loginPage;

public class TC_2_AddNewEmployee extends baseClass{
	
	
	
	@Test
	public void AddEmployee() throws InterruptedException, IOException {
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(AdminUsername);
		Thread.sleep(2000);
		ScreenShot("T2AdminUserName.png");   
		logger.info("Entering Admin Username");
		
		LP.SetPassword(AdminPassword);
		Thread.sleep(2000);
		ScreenShot("T2AdminPassword.png");   
		logger.info("Entering the Admin Password");
		
		LP.LoginButton();
		Thread.sleep(2000);
		ScreenShot("T2LoginButton.png");   
		logger.info("Clicked the Login Button");
		
		EmployeePage EMP = new EmployeePage(wd);
		EMP.PIM();
		Thread.sleep(2000);
		ScreenShot("T2PIM.png");   
		logger.info("Clicked on the PIM");
		
		EMP.AddNewEmployee();
		Thread.sleep(4000);
		ScreenShot("T2AddEmployeeTab.png");   
		logger.info("Clicked on the AddEmployee tab");
		
		EMP.SetFirstName("Raymond");
		Thread.sleep(4000);
		ScreenShot("T2EmployeeFName.png");   
		logger.info("Entering Employee first name");
		
		EMP.SetMiddleName("Lorence");
		Thread.sleep(4000);
		ScreenShot("T2EmployeeSName.png");   
		logger.info("Entering Employee Middle Name");
		
		EMP.SetLastname("Neelamkavil");
		Thread.sleep(4000);
		ScreenShot("T2EmployeeLName.png");   
		logger.info("Entering Employee Last Name");
		
		EMP.Employeeid("1155846");
		Thread.sleep(4000);
		ScreenShot("T2EmployeeId.png");   
		logger.info("Entering Employee ID Number");
		
		EMP.Checkbox();
		Thread.sleep(4000);
		ScreenShot("T2CheckBox.png");   
		logger.info("Clicked on the CheckBox");
		
		EMP.SetUsername(EmployeeId);
		Thread.sleep(2000);
		logger.info("Entering Employee Username");
		ScreenShot("T2EmployeeUserId.png");   

		EMP.SetPassword(EmployeePassword);
		Thread.sleep(4000);
		ScreenShot("T2EmployeeUserPassword.png");   
		logger.info("Entering Employee Password");
		
		EMP.SetConfirmPassword(EmployeePassword);
		Thread.sleep(4000);
		ScreenShot("T2EmployeeConfirmPassword.png");   
		logger.info("Entering Employee Password Again");
		
		EMP.save();
		ScreenShot("T2Save.png");   
		logger.info("Clicked on the Save Button");
		Thread.sleep(7000);
		
		LP.ProfileClick();
		ScreenShot("T2Profile.png");   
		logger.info("Clicked on the Profile icon");
		Thread.sleep(4000);
		
		LP.Logout();
		Thread.sleep(3000);
		ScreenShot("T2Logout.png");   
		logger.info("SuccessFully Logged Out");
		
		XSSFRow row =Sheet.getRow(2);
		row.createCell(12).setCellValue("Added A New Employee");
		FileOutputStream Fout = new FileOutputStream("C:\\Users\\akhil\\Documents\\TestData.xlsx");
		   book.write(Fout);
		   book.close();

		
	}

}
