package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeadPage extends AbstractPage{
	
	public FindLeadPage(){
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Email")
	WebElement eleEmail;
	public FindLeadPage clickEmail(){
		eleclick(eleEmail);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@name='emailAddress']")
	WebElement eleemailid;
	public FindLeadPage typeemailid(String EID){
		type(eleemailid,EID);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*/button[text()='Find Leads']")
	WebElement btnFindLeads;
	public FindLeadPage clickFindLeadsbtn(){
		eleclick(btnFindLeads);
		return this;
	}
	
}
