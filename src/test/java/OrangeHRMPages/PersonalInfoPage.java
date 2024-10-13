package OrangeHRMPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonalInfoPage {
	WebDriver wd;
	
	
	
	
	public PersonalInfoPage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")
	WebElement Info;
	@FindBy(xpath="//img[@class='employee-image']")
	WebElement ProfilePic;
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']")
	WebElement Src;
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	List<WebElement> DropDowns;
	@FindBy(xpath="//*[text()='Indian']")
	WebElement ValueNational;
	@FindBy(xpath="//*[text()='Single']")
	WebElement MaritalStatus;
	@FindBy(xpath="//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")
	List<WebElement> Gender;
	@FindBy(xpath="//button[@type='submit']")
	WebElement SaveButton;
	@FindBy(xpath="//*[text()='B+']")
	WebElement BloodGroupValue;
	
	
	
	
	
	
	public void Info() {
		Info.click();
	}
	public void Nationality() {
		if (DropDowns.size()>1) {
			WebElement Element = DropDowns.get(0);
			Element.click();
		}
	}
	public void NationalValue() {
		ValueNational.click();
	}
	public void MaritalStatus() {
		if(DropDowns.size()>1) {
			WebElement Element = DropDowns.get(1);
			Element.click();
		}
	}
	public void MaritalValue() {
		MaritalStatus.click();
	}
	public void Gender() {
		if(Gender.size()>=1) {
			WebElement Element = Gender.get(0);
			Element.click();
		}
	}
	public void SaveButton() {
		SaveButton.click();
	}
	public void BloodGroup() {
		if(DropDowns.size()>1) {
			WebElement Element = DropDowns.get(2);
			Element.click();
		}
	}
	public void BloodGroupValue() {
		BloodGroupValue.click();
	}

}
