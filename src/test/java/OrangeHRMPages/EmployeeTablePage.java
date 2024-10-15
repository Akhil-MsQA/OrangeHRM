package OrangeHRMPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeTablePage {
	
	
	WebDriver wd;
	
	
	public EmployeeTablePage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewPimModule']")
	WebElement PIM;
	@FindBy(xpath="//li[@class='oxd-topbar-body-nav-tab --visited']")
	WebElement EmployeeList;
	@FindBy(xpath="//div[@class='orangehrm-container']")
	WebElement Table;
	
	
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
	public void TableData() {
		List<WebElement> rows = Table.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
					for (WebElement col :cols) {
						System.out.println(col.getText());
						
					}
		}
	}
	

}
