package OrangeHRMPages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeePage {
	
	
	WebDriver wd;
	
	
	public EmployeePage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewPimModule']")
	WebElement PIM;
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-item' and text()='Add Employee']")
	WebElement AddEmployee;
	@FindBy(name="firstName")
	WebElement Firstname;
	@FindBy(name="middleName")
	WebElement MiddleName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	List<WebElement> Employeeid;
	@FindBy(xpath="//img[@src='/web/images/default-photo.png']")
	WebElement ProfilePic;
	@FindBy(xpath="//*[@type='password']")
	List<WebElement> Passwords;
	@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement Checkbox;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Save;
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	WebElement SuccessMsg;
	
	
	public void PIM() {
		PIM.click();
	}
	public void AddNewEmployee() {
		AddEmployee.click();
	}
	public void SetFirstName(String Name) {
		Firstname.sendKeys(Name);
	}
	public void SetMiddleName(String middlename) {
		MiddleName.sendKeys(middlename);
	}
	public void SetLastname(String lastname) {
		lastName.sendKeys(lastname);
		
	}
	public void Employeeid(String id ) throws InterruptedException {
		if (Employeeid.size()<=4) {
			WebElement element = Employeeid.get(1);
			element.click();
			Thread.sleep(2000);
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
			element.sendKeys(id);
			
		}
	}
	public void Checkbox() {
		Checkbox.click();
		
	}
	
	public void SetUsername(String Username) {
		if(Employeeid.size()>=3) {
			WebElement Element =Employeeid.get(2);
			Element.sendKeys(Username);
		}
	}
	public void SetPassword(String Password) {
		if(Passwords.size()>=1) {
			WebElement Element =Passwords.get(0);
			Element.sendKeys(Password);
			
		}
	}
	public void SetConfirmPassword(String CPassword) {
		if(Passwords.size()>=1) {
			WebElement Element =Passwords.get(1);
			Element.sendKeys(CPassword);
			
		}
	}
	public void SuccessMsg() {
		String Element = SuccessMsg.getText();
		System.out.println(Element);
	}
	public void save() throws InterruptedException {
		Save.click();
		
		}
		
	}
	
	
	


