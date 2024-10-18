package OrangeHRMTestcases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import OrangeHRMUtilities.ReadConfig;

public class baseClass {

	ReadConfig read = new ReadConfig();
	public WebDriver wd;
	public String BaseURL=read.getApplicationURL();
	public String AdminUsername=read.getUsername();
	public String AdminPassword=read.getPassword();
	public String AdminName=read.getAdminName();
	public String EmployeeId=read.getEpmloyeeUsername();
	public String EmployeePassword = read.getEmployeePassword();
	public static  Logger logger = Logger.getLogger(baseClass.class);
	public XSSFWorkbook book;
	public XSSFSheet Sheet;
	public XSSFSheet Sheet2;
	public XSSFSheet Sheet3;


	static {
	    PropertyConfigurator.configure("C:\\Users\\akhil\\eclipse-workspace\\MavenProject\\QAAutomationFrameWork\\src\\main\\Resources\\log4j.properties");
	}

	@Parameters("Browser")
	@BeforeClass
	public void setup(@Optional("chrome")String br) throws IOException {
		FileInputStream File = new FileInputStream("C:\\Users\\akhil\\eclipse-workspace\\MavenProject\\QAAutomationFrameWork\\TestingData\\TestData.xlsx");
		book = new XSSFWorkbook(File);
		Sheet = book.getSheetAt(0);
		Sheet2 = book.getSheetAt(1);
		Sheet3 = book.getSheetAt(2);
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", read.getChromeDriver());
			wd = new ChromeDriver();
			
		}
		else if(br.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", read.getMsedgeDriver());
			wd = new EdgeDriver();
			
		}
		
		wd.get(BaseURL);
		logger.info("The URL is Opening");
	}

	public void ScreenShot(String Name) throws IOException {
		TakesScreenshot src = (TakesScreenshot)wd;
		File Source = src.getScreenshotAs(OutputType.FILE);
		String path ="C:\\Users\\akhil\\eclipse-workspace\\MavenProject\\QAAutomationFrameWork\\ScreenShots";
		File Destination = new File(path + "\\" + Name);
		FileUtils.copyFile(Source, Destination);
	}
	
	@AfterClass
	public void teardown() {
		wd.close();
		logger.info("Clossing the Browser");
		wd.quit();
		
	}
	
	
	
}
