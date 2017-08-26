package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CRMSFAMyHomePage extends AbstractPage{
	
	public CRMSFAMyHomePage(){
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement CreateLeadLink;
	public CreateLeadsPage clickCreateLead(){
		eleclick(CreateLeadLink);
		return new CreateLeadsPage();
	}
}
