package OrangeHRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage {
	
	
	
	WebDriver wd;
	
	
	
	public loginPage(WebDriver wd) {
		this.wd =wd;
		PageFactory.initElements(wd,this);
		
	}
	
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement Button;
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement Profilename;
	@FindBy(xpath="//*[text()='Logout']")
	WebElement Logout;
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement Profile;
	
	
	public void SetUsername(String Name) {
		username.sendKeys(Name);
	}
	public void SetPassword(String password) {
		Password.sendKeys(password);
	}
	public void LoginButton() {
		Button.click();
		
	}
	public void Validation(String Name) {
		String name = Profilename.getText();
		Assert.assertEquals(name, Name);
		
	}
	public void Logout() {
		Logout.click();
	}
	public void ProfileClick() {
		Profile.click();
	}

}
