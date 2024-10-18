package OrangeHRMTestcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OrangeHRMPages.EmployeeSearchPage;
import OrangeHRMPages.loginPage;

public class TC_6_AdminCheckingEmployee extends baseClass{
	
	
	
	
	@Test
	public void EmployeeChecking() throws InterruptedException, IOException {
		
		
		String Name = Sheet3.getRow(6).getCell(1).getStringCellValue();
		String id = Sheet3.getRow(6).getCell(2).getRawValue();
		
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage LP = new loginPage(wd);
		LP.SetUsername(AdminUsername);
		logger.info("Entered the Admin Username");
		Thread.sleep(3000);
		ScreenShot("T6AdminUsername.png");   

		LP.SetPassword(AdminPassword);
		logger.info("Entered the Admin Password");
		Thread.sleep(4000);
		ScreenShot("T6AdminPassword.png");   

		LP.LoginButton();
		logger.info("Clicked on the Login Button");
		Thread.sleep(4000);
		ScreenShot("T6LoginButton.png");   

		EmployeeSearchPage ESP = new EmployeeSearchPage(wd);
		ESP.PIM();
		logger.info("Clicked on the PIM");
		Thread.sleep(4000);
		ScreenShot("T6PIM.png");   

		ESP.EmployeeList();
		logger.info("Checked the EmployeeList is selected OR Not");
		Thread.sleep(3000);
		ScreenShot("T6EmployeeList.png");   

		ESP.SearchName(Name);
		Thread.sleep(3000);
		logger.info("Entered the Employee Name");
		ScreenShot("T6EmployeeName.png");   

		ESP.SubmitButton();
		Thread.sleep(3000);
		logger.info("Clicked on the Submit button");
		ScreenShot("T6Submit.png");   

		ESP.Message();
		Thread.sleep(3000);
		logger.info("Displayed the Msg");
		ScreenShot("T6Message.png");   

		ESP.Validation(id);
		Thread.sleep(3000);
		logger.info("Validated the Id is Same");
		ScreenShot("T6Validation.png");   

		ESP.Delete();
		Thread.sleep(4000);
		logger.info("Clicked on the Delete Button");
		ScreenShot("T6Delete.png");   

		ESP.ConfirmMethod();
		Thread.sleep(3000);
		logger.info("Confirm Delete");
		ScreenShot("T6ConfirmDelete.png");   

		ESP.UpdateMessage();
		Thread.sleep(5000);
		ScreenShot("T6DeleteMessage.png");   
		
		LP.Logout();
		Thread.sleep(3000);
		logger.info("Successfully Logout");
		ScreenShot("T6Logout.png");   

		

		XSSFRow row =Sheet3.getRow(6);
		row.createCell(3).setCellValue("Deleted Successfully");
		FileOutputStream Fout = new FileOutputStream("C:\\Users\\akhil\\Documents\\TestData.xlsx");
		   book.write(Fout);
		   book.close();
		}
	
	
	
	
	

}

