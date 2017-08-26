package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends AbstractPage {
	
	public ViewLeadPage(){
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='viewLead_companyName_sp']")
	WebElement CompName;
	public ViewLeadPage CmpName(){
		getText(CompName);
		return this;
	}
	
	
	

}
