package wrappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WDMethods extends WebListners implements WDInterface{
	public WebDriver driver;
	public static EventFiringWebDriver eventdriver;
	
	public WebElement locateElement(String how,String using){
		WebElement ele = null;
		switch(how){
		case("id"):
			ele =eventdriver.findElement(By.id(using));
			break;
		case("name"):
			ele =eventdriver.findElement(By.name(using));
			break;
		case("className"):
			ele =eventdriver.findElement(By.className(using));
			break;
		case("tagName"):
			ele =eventdriver.findElement(By.tagName(using));
			break;
		case("linkText"):
			ele =eventdriver.findElement(By.linkText(using));
			break;
		case("cssSelector"):
			ele =eventdriver.findElement(By.cssSelector(using));
			break;
		case("partialLinkText"):
			ele =eventdriver.findElement(By.partialLinkText(using));
			break;
		case("xpath"):
			ele =eventdriver.findElement(By.xpath(using));
			break;
			default:
				System.out.println("The given locator"+how+"is not correct");
				break;
		}
		
		return ele;
	
	}
	
	public void type(WebElement ele,String value){
		
		ele.sendKeys(value);
	
	}
	
	public void eleclick(WebElement ele){
		ele.click();
		
	
	}
	public void selectByVisibleText(WebElement ele,String txt){
		Select seldd = new Select(ele);
		seldd.selectByVisibleText(txt);
		
	}
	
	public void selectByIndex(WebElement ele,int value){
		Select seldd = new Select(ele);
		seldd.selectByIndex(value);
		
	}
	public void selectByValue(WebElement ele,String txt){
		Select seldd = new Select(ele);
		seldd.selectByValue(txt);
		
	}
	public void switchToWindow(int windowName){
		Set<String> allwins = driver.getWindowHandles();
		List<String> allwindows = new ArrayList<>();
		allwindows.addAll(allwins);
		driver.switchTo().window(allwindows.get(windowName));
		}
		
	
	public void alertAccept(){
		driver.switchTo().alert().accept();
		
	}
	public void alertDismiss(){
		driver.switchTo().alert().dismiss();
	
	}
	public String alertText()	{
		String str = driver.switchTo().alert().getText();
		return str;
	
	}
	public void switchToFrame(WebElement ele){
		
	}
	public Boolean verifyTitle(WebElement ele,String txt){
		String tit = eventdriver.getTitle();
		if(tit.equals(txt))
		{
			System.out.println("Title matches");
			return true;
		}
			else
			{
				System.out.println("TitleMismatch");
				return false;
			}
	}
		
	public Boolean verifyText(WebElement ele,String txt){
		String tit = ele.getText();
		if(tit.equals(txt))
		{
			System.out.println("text matches");
			return true;
		}
			else
			{
				System.out.println("text Mismatch");
				return false;
			}
		
	}
	public String getAttribute(WebElement ele,String txt){
		String str = ele.getAttribute(txt);
		return str;
	}
	public String getText(WebElement ele){
		String str = ele.getText();
		System.out.println("Text"+str);
		return str;
	}
	public void takesnap(String path){
		
	}
	public void invokeApp(String browser,String url){
		//driver = new ChromeDriver();
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			eventdriver = new EventFiringWebDriver(driver);
			WebListners handler = new WebListners();
			eventdriver.register(handler);
		}else{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			eventdriver = new EventFiringWebDriver(driver);
			WebListners handler = new WebListners();
			eventdriver.register(handler);
		}
		
		eventdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		eventdriver.get(url);
		System.out.println("The browser:" + browser + " launched successfully");
	}
	public void quitApp(){
		eventdriver.quit();		
	}

}
