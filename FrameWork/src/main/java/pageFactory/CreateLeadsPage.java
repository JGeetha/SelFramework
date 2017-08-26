package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadsPage extends AbstractPage{
	
	public CreateLeadsPage() {
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement CompName;
	public CreateLeadsPage CompNameCL(String cN){
		type(CompName, cN);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement firstName;
	public CreateLeadsPage firstName(String fN){
		type(firstName,fN);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement lastName;
	public CreateLeadsPage lastName(String lN){
		type(lastName,lN);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	WebElement sourceId;
	public CreateLeadsPage sourceId(){
		selectByVisibleText(sourceId, "Direct Mail");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	WebElement marketingId;
	public CreateLeadsPage marketingId(){
		selectByVisibleText(marketingId, "Automobile");
		
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	WebElement phNo;
	public CreateLeadsPage phNo(){
		type(phNo, "9876767676");
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	WebElement email;
	public CreateLeadsPage email(){
		type(email, "jaygeetha@gmail.com");
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	WebElement submitButton;
	public ViewLeadPage submitButton(){
		eleclick(submitButton);
		return new ViewLeadPage();
	}
	
	
	
	
}


