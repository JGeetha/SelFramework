package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebListners implements WebDriverEventListener{

	/*public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		String str1 = arg0.toString().replace("]"," ");
		String[] strsplit = str1.split(":");
		System.out.println("The value for"+strsplit[2]+"entered successfully");
		//System.out.println("The value"+arg0+"entered success");
		
	}*/

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		String str1 = arg0.toString().replace("]"," ");
		String[] strsplit = str1.split(":");
		System.out.println("The element"+strsplit[2]+"clicked success");
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		String str1 = arg0.toString().replace("]"," ");
		String[] strsplit = str1.split(":");
		System.out.println("The element"+strsplit[1]+"found success");
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Message afterNavigateBack");
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Message afterNavigateForward");
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		//System.out.println("Message afterNavigateTo ");
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof NoSuchElementException){
			System.out.println("The element could not found"+arg0.getMessage());
		}else if (arg0 instanceof NoSuchWindowException){
			System.out.println("The window could not be found"+arg0.getMessage());
		}else if (arg0 instanceof InvalidSelectorException){
			System.out.println("The Xpath is wrong"+arg0.getMessage());
		}else if (arg0 instanceof StaleElementReferenceException){
			System.out.println("The element not present");
		}else if (arg0 instanceof TimeoutException){
			System.out.println("TimeoutException");
			
		}
		
	}

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		String str1 = arg0.toString().replace("]"," ");
		String[] strsplit = str1.split(":");
		System.out.println("The value for"+strsplit[2]+"entered successfully as "+arg2[0]);
		//System.out.println("The value"+arg0+"entered success");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

}
