package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import dataprovider.EexcelDP;

public class TestNGAnnotations extends WDMethods {
	
	public String dataSheetName;
	
	@BeforeSuite
	public void beforeSuite(){
	}
	
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod");
		invokeApp("chrome", "http://leaftaps.com/opentaps");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
		quitApp();
	}
	

	@DataProvider(name= "fetchdata")
	public Object[][] getData(){
		
		return EexcelDP.getSheet(dataSheetName);	
	}
	

}
