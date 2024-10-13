package OrangeHRMUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties Pro;
	
	public ReadConfig()  {
		File file = new File("./Configuration\\Config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Pro = new Properties();
			Pro.load(fis);	
		}catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
			
		}

	public String getApplicationURL() {
		String url = Pro.getProperty("BaseURL");
		return url;
	}
	public String getUsername() {
		String username= Pro.getProperty("Username");
		return username;
	}
	public String getPassword() {
		String password=Pro.getProperty("Password");
		return password;
	}
	public String getChromeDriver() {
		String chromedriver=Pro.getProperty("Chromedriver");
		return chromedriver;
	}
	public String getMsedgeDriver() {
		String msedgedriver=Pro.getProperty("Edgedriver");
		return msedgedriver;
	}
	public String getAdminName() {
		String AdminName=Pro.getProperty("AdminName");
		return AdminName;
	}
	public String getEpmloyeeUsername() {
		String EmployeeName=Pro.getProperty("EmployeeUsername");
		return EmployeeName;
	}
	public String getEmployeePassword() {
		String EmployeePassword=Pro.getProperty("EmployeePassword");
		return EmployeePassword;
				
	}
	
	
	}


