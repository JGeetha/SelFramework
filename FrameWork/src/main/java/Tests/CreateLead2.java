package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrappers.TestNGAnnotations;
import wrappers.WDMethods;


public class CreateLead2 extends TestNGAnnotations{
@Test
	public void createLeads() throws InterruptedException {
		// TODO Auto-generated method stub


//invokeApp("chrome", "http://leaftaps.com/opentaps");
type(locateElement("id", "username"),"DemoSalesManager");
type(locateElement("id", "password"),"crmsfa");
eleclick(locateElement("xpath", "//*[@id='login']/p[3]/input"));
//eleclick crm/sfa
eleclick(locateElement("xpath", "//*[@id='button']/a/img"));
//eleclick Leads tab
eleclick(locateElement("linkText", "Leads"));
//eleclick find Leads
eleclick(locateElement("linkText", "Find Leads"));
//eleclick on Email
eleclick(locateElement("linkText", "Email"));
//enter mail id 
type(locateElement("xpath", "//*[@name='emailAddress']"),"abc@mail.com");
//eleclick FindLeads button
eleclick(locateElement("xpath", "//*/button[text()='Find Leads']"));
Thread.sleep(10000);
String name1 =getText(locateElement("xpath", "//*[@class='x-grid3-row-table']/tbody/tr[1]/td[3]/div/a"));
//eleclick the fname
eleclick(locateElement("xpath", "//*[@class='x-grid3-row-table']/tbody/tr[1]/td[3]/div/a"));
//eleclick duplicate
eleclick(locateElement("xpath", "//*[@class='frameSectionExtra']/a"));
//get Header 
String sectionheader=getText(locateElement("id", "sectionHeaderTitle_leads"));
eleclick(locateElement("xpath","//*[@value='Create Lead']"));
String name2 =getText(locateElement("id", "viewLead_firstName_sp"));
verifyText(locateElement("id", "viewLead_firstName_sp"),name1);
//quitApp();

}

	}

