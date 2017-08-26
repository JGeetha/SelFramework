package wrappers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface WDInterface {
	/**
	 * This method will locate the element based on the type (id,name,class,xpath)
	 * 
	 * @param how - Type of the webelement
	 * @param String - The data to be sent to the webelement
	 * @author Jayageetha
	 */
		public WebElement locateElement(String how,String using);
		
		/**
		 * This method will enter the value to the text field using webelement to locate
		 * 
		 * @param ele - The webelement using locateElement method
		 * @param value - The data to be sent to the webelement
		 * @author Jayageetha
		 * @return 
		 * @throws Exception 
		 */
		
		public void type(WebElement ele,String value);
		
		/**
		 * This method will click the webelement
		 * 
		 * @param ele - The webelement using locateElement method
		 * @param value - The data to be sent to the webelement
		 * @author Jayageetha
		 * @return 
		 * @throws Exception 
		 */
	
		public void eleclick(WebElement ele);
		/**
		 * This method will select the visible text from the drop down
		 * @param ele - The webelement using locateElement method
		 * @param txt - The value to be selected
		 * @author Jayageetha
		 */
		
		public void selectByVisibleText(WebElement ele,String txt);
		
		
		public void selectByIndex(WebElement ele,int value);
		public void selectByValue(WebElement ele,String txt);
		public void switchToWindow(int windowName);
			
		
		public void alertAccept();
		public void alertDismiss();
		public String alertText();
		public void switchToFrame(WebElement ele);
		public Boolean verifyTitle(WebElement ele,String txt);
			
		public Boolean verifyText(WebElement ele,String txt);
		public String getAttribute(WebElement ele,String txt);
		public String getText(WebElement ele);
		public void takesnap(String path);
		/**
		 * This method will launch the given browser and maximise the browser and set the
		 * wait for 30 seconds and load the url
		 * @author Jayageetha
		 * @param browser - The browser of the application to be launched
		 * @param url - The url with http or https
		 ** 
		 */
		public void invokeApp(String browser,String url);
		
		public void quitApp();
	

}
