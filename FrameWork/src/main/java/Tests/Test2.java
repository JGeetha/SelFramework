package Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch Browser
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps");
		//driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		driver.findElementById("createLeadForm_firstName").sendKeys("Jayageetha");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jayaraman");
		WebElement a = driver.findElementById("createLeadForm_dataSourceId");
		Select sourcedd = new Select(a);
		sourcedd.selectByVisibleText("Direct Mail");
		WebElement b = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingCamp = new Select(b);
		marketingCamp.selectByVisibleText("Automobile");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9876565656");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("jaygeethaj@gmail.com");
		driver.findElementByName("submitButton").click();
		String compId = driver.findElementByXPath("//*[@id='viewLead_companyName_sp']").getText();
		System.out.println("Company id:"+compId);
		//driver.close();
		driver.quit();

	}

}
