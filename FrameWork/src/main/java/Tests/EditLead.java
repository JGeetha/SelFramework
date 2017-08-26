package Tests;

import org.testng.annotations.Test;

import wrappers.TestNGAnnotations;
import wrappers.WDMethods;

public class EditLead extends TestNGAnnotations {
@Test
	public void tc1() throws InterruptedException{
	//invokeApp("http://leaftaps.com/opentaps/control/main","chrome");
	type(locateElement("id", "username"), "DemoSalesManager");
	type(locateElement("id", "password"), "crmsfa");
	eleclick(locateElement("xpath", "//*[@value='Login']"));
	eleclick(locateElement("xpath", "//*[@class='crmsfa']/a/img"));
	eleclick(locateElement("linkText", "Leads"));
	eleclick(locateElement("linkText", "Find Leads"));
	type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "test");
	eleclick(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
	Thread.sleep(15000);
	eleclick(locateElement("xpath", "(//a[@class='linktext'])[4]"));
	eleclick(locateElement("linkText", "Edit"));
	//clear(locateElement("id", "updateLeadForm_companyName"));
	type(locateElement("id", "updateLeadForm_companyName"), "updated");
	eleclick(locateElement("xpath", "//input[@value='Update']"));
	Thread.sleep(1000);
	verifyText(locateElement("id", "viewLead_companyName_sp"),"test");
	//getText(locateElement("id", "viewLead_companyName_sp"))
	
	}
}

