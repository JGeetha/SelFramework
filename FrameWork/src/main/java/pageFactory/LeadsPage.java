package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends AbstractPage{
	
	public LeadsPage() {
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement eleLeads;
	
	public LeadsPage clickLeads(){
		eleclick(eleLeads);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	WebElement eleFindLeads;
	public FindLeadPage clickFindLeads(){
		eleclick(eleFindLeads);
		return new FindLeadPage();
	}
	
	
	
	
	
}


