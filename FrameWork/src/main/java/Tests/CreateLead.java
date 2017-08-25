package Tests;

import org.testng.annotations.Test;
import java.text.Annotation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrappers.TestNGAnnotations;
import wrappers.WDMethods;

public class CreateLead extends TestNGAnnotations{
		@Test
		public void sam(){
		//invokeApp("chrome","http://leaftaps.com/opentaps");
		type(locateElement("id","username"), "DemoSalesManager");
		type(locateElement("id","password"), "crmsfa");
		eleclick(locateElement("className","decorativeSubmit"));
		eleclick(locateElement("linkText","CRM/SFA"));
		eleclick(locateElement("linkText", "Create Lead"));
		type(locateElement("id","createLeadForm_companyName"),"ABCD");
		type(locateElement("id","createLeadForm_firstName"),"Jaya");
		type(locateElement("id","createLeadForm_lastName"),"geetha");
		selectByVisibleText(locateElement("id", "createLeadForm_dataSourceId"), "Direct Mail");
		selectByVisibleText(locateElement("id","createLeadForm_marketingCampaignId"),"Automobile");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9876565656");
		type(locateElement("id", "createLeadForm_primaryEmail"),"jaygeethaj@gmail.com");
		//eleclick(locateElement("name","submitButton"));
		//getText(locateElement("xpath", "//*[@id='viewLead_companyName_sp']"));
		//quitApp();
		
	}

}
