package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
	
	public LoginPage(){
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.ID,using="username")
	WebElement UName;
	public LoginPage UName(String UN){
		type(UName,UN);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	WebElement Passwd;
	
	public LoginPage Passwd(String PWD){
		type(Passwd, PWD);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	WebElement Submitbt;
	
	public CRMSFAHomePage submit(){
		eleclick(Submitbt);
		return new CRMSFAHomePage();
	}
	

}
