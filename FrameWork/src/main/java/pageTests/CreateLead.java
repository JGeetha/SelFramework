package pageTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.EexcelDP;
import pageFactory.LoginPage;
import wrappers.TestNGAnnotations;

public class CreateLead extends TestNGAnnotations {

	@BeforeClass
	public void setValues(){
		dataSheetName="TC001";
	}
	
	@Test(dataProvider = "fetchdata")
	public void createLead(String UN,String PWD,String CN,String FN,String LN){
		new LoginPage()
		.UName(UN)
		.Passwd(PWD)
		.submit()
		.clickCRMSFA()
		.clickCreateLead()
		.CompNameCL(CN)
		.firstName(FN)
		.lastName(LN)
		.sourceId()
		.marketingId()
		.phNo()
		.email()
		.submitButton()
		.CmpName();
		
		
	}
	
	
	

}
