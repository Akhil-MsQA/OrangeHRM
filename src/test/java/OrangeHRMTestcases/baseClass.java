package OrangeHRMTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

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
	
	
	
	@Parameters("Browser")
	@BeforeClass
	public void setup(@Optional("chrome")String br) {
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", read.getChromeDriver());
			wd = new ChromeDriver();
			
		}
		else if(br.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", read.getMsedgeDriver());
			wd = new EdgeDriver();
			
		}
		wd.get(BaseURL);
	}
	
	@AfterClass
	public void teardown() {
		//wd.close();
		//wd.quit();
	}
	
	
	
}
