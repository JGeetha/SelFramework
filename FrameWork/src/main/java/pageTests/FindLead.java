package pageTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.EexcelDP;
import pageFactory.LeadsPage;
import pageFactory.LoginPage;
import wrappers.TestNGAnnotations;

public class FindLead extends TestNGAnnotations {
	@BeforeClass
	public void setValues(){
		dataSheetName="TC002";
	}
	
	@Test(dataProvider = "fetchdata")
	public void createLead(String UN,String PWD,String EID){
		new LoginPage()
		.UName(UN)
		.Passwd(PWD)
		.submit()
		.clickCRMSFA();
		new LeadsPage()
		.clickLeads()
		.clickFindLeads()
		.clickEmail()
		.typeemailid(EID)
		.clickFindLeadsbtn();
			
	}
	
	
	@DataProvider(name= "fetchdata")
	public Object[][] getData(){
		return EexcelDP.getSheet("TC002");	
	}

}
