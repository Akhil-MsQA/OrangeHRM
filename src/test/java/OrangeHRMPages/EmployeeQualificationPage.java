package OrangeHRMPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeQualificationPage {
	
	WebDriver wd;
	
	public EmployeeQualificationPage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
		
	}
	@FindBy(xpath="//*[text()='Qualifications']")
	WebElement Qualification;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--text']")
	List<WebElement> AddButton;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	List<WebElement> InputData;
	@FindBy(xpath="//button[@type='submit']")
	WebElement SaveButton;
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	WebElement Dropdown;
	@FindBy(xpath="//*[text()=concat('Master', \"'\", 's Degree')]")
	WebElement EducationalValue;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	List<WebElement> Date;
	
	
	
	
	public void Qualificationlink() {
		Qualification.click();
	}
	public void AddButton() {
		if(AddButton.size()>1) {
			WebElement Element = AddButton.get(0);
			Element.click();
		}
		
	}
	public void CompanyName(String CompanyName) {
		if(InputData.size()>1) {
			WebElement Element = InputData.get(1);
			Element.sendKeys(CompanyName);
		}
	}
	public void JobTitle(String JobTitle) {
		if(InputData.size()>1) {
			WebElement Element = InputData.get(1);
			Element.sendKeys(JobTitle);
		}
	}
	public void FromDate(String FDate) {
		if(InputData.size()>1) {
			WebElement Element = InputData.get(2);
			Element.sendKeys(FDate);
		}
	}
	public void ToDate(String ToDate) {
		if(InputData.size()>1) {
			WebElement Element = InputData.get(3);
			Element.sendKeys(ToDate);
		}
	}
	public void EducationAddbutton() {
		if(AddButton.size()>1) {
			WebElement Element = AddButton.get(1);
			Element.click();
		}	
	}
	public void EducationLevel() {
		Dropdown.click();
	}
	public void EducationalValue() {
		EducationalValue.click();
	}
	public void InstituteName(String InstituteName) {
		if(InputData.size()>=6) {
			WebElement Element = InputData.get(1);
			Element.sendKeys(InstituteName);
		}
	}
	public void Course(String CourseName) {
		if(InputData.size()>=6) {
			WebElement Element = InputData.get(1);
			Element.sendKeys(CourseName);
		}
	}
	public void Year(String Year) {
		if(InputData.size()>=6) {
			WebElement Element = InputData.get(2);
			Element.sendKeys(Year);
		}
	}
	public void Score(String Score) {
		if(InputData.size()>=6) {
			WebElement Element = InputData.get(3);
			Element.sendKeys(Score);
		}
	}
	public void EduFromDate(String FDate) {
		if(InputData.size()>=6) {
			WebElement Element = Date.get(4);
			Element.sendKeys(FDate);
		}
	}
	public void EduToDate(String TDate) {
		if(InputData.size()>=6) {
			WebElement Element = InputData.get(5);
			Element.sendKeys(TDate);
		}
	}
	public void SaveButton() {
		SaveButton.click();
	}

}
