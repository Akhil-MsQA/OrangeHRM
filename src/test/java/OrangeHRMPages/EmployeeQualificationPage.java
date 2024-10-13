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
	
	
	
	
	public void Qualificationlink() {
		Qualification.click();
	}
	public void AddButton() {
		if(AddButton.size()>1) {
			WebElement Element = AddButton.get(0);
			Element.click();
		}
		
	}
	
	

}
