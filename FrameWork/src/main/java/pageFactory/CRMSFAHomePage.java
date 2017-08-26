package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.EclipseInterface;

public class CRMSFAHomePage extends AbstractPage{
	
	public CRMSFAHomePage(){
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	WebElement CRMSFALink;
	
	public CRMSFAMyHomePage clickCRMSFA(){
		eleclick(CRMSFALink);
		return new CRMSFAMyHomePage();
	}
	
}
