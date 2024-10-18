package OrangeHRMPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeSearchPage {
	
	
	WebDriver wd;
	
	
	public EmployeeSearchPage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewPimModule']")
	WebElement PIM;
	@FindBy(xpath="//li[@class='oxd-topbar-body-nav-tab --visited']")
	WebElement EmployeeList;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	List<WebElement> Search;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit;
	@FindBy(xpath="//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")
	WebElement TxtMsg;
	@FindBy(xpath="//div[@class='oxd-table-card']")
	WebElement Data;
	@FindBy(xpath="//i[@class='oxd-icon bi-trash']")
	WebElement Delete;
	@FindBy(xpath="//i[@class='oxd-icon bi-trash oxd-button-icon']")
	WebElement PopUp;
	
	
	
	public void PIM() {
		PIM.click();
	}
	public void EmployeeList() {
		String attribute = EmployeeList.getAttribute("class");
		if(attribute.contains("visited")) {
			System.out.println("The Element is Already Selected");
		}
		else {
			EmployeeList.click();
		}
	}
	public void SearchName(String Name) {
		if (Search.size()>1) {
			WebElement Element = Search.get(0);
			Element.click();
			Element.sendKeys(Name);
		}
		}

	
	public void SubmitButton() {
		Submit.click();
	}
	public void Message() {
		JavascriptExecutor Js = (JavascriptExecutor)wd;
        Js.executeScript("arguments[0].scrollIntoView(true);",TxtMsg);
		String Msg = TxtMsg.getText();
		if (Msg.equals("No Records Found")){
			System.out.println("Sorry Name is not Found.........");
			wd.close();
		}
		else {
			System.out.println("The Data ");
			System.out.println(Data.getText());
		}
		
	}
	public void Validation(String id) {
		if (Data.getText().contains(id)) {
			System.out.println("The Data is Correct....");
		}
		else {
			wd.close();
		}
	}
	public void Delete() {
		Delete.click();
	}
	public void ConfirmMethod() {
		PopUp.click();
		
		}
	public void UpdateMessage() {
		JavascriptExecutor Js = (JavascriptExecutor)wd;
        Js.executeScript("arguments[0].scrollIntoView(true);",TxtMsg);
		String Msg = TxtMsg.getText();
		if (Msg.equals("No Records Found")){
			System.out.println("The Data is Successfully Deleted");
		}
	}
}

