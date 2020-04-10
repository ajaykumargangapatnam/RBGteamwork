package com.surveillance.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class CameraPage
{
PropertySingleton _instance = null;
	
	public CameraPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("CameraPage");
	
	public CameraPage clickOnLiveUnit()
	{
		keywords.jsClick("xpath", _instance.getValue("CameraPage.LiveUnit1"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnSubLiveUnit()
	{
		keywords.jsClick("xpath", _instance.getValue("CameraPage.LiveSubUnit1"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnCameraLink()
	{
		keywords.jsClick("xpath", _instance.getValue("CameraPage.LinkCameraLink"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnAdditionalButtons() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.AdditionalButtons"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.AdditionalButtons"));
		keywords.waitForPageLoad();
		return this;
	}

	public CameraPage clickOnGoToLiveUnit() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_GoToLiveUnit"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_GoToLiveUnit"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnDeactive() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_Deactive"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_Deactive"));
//		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnActive() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_Active"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_Active"));
//		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage enterSerialNumber(String SerialNumber) throws Throwable
	{
//		keywords.EntertextInAlert("MAC00232");
		
		Robot rb =new Robot();
		
		String string="MAC00232";
		rb.keyPress(KeyEvent.VK_CAPS_LOCK);
		rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
		for (int i = 0; i < string.length (); ++i) {
			
		    char c = string.charAt(i);
		    
		    int j = (int)c;
		    System.out.println("ASCII OF "+c +" = " + j + ".");
		    rb.keyPress(j);
			rb.keyRelease(j);
		}
		rb.keyPress(KeyEvent.VK_CAPS_LOCK);
		rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
		
		return this;
	}
	
	public CameraPage DismisOrActivePopUp(String confirm) throws Throwable
	{
		
		keywords.handleAlert(confirm);

		
		return this;
	}
	
	public String getSerialNumber() throws Throwable 
	{
		
		String text=keywords.getText("xpath", _instance.getValue("CameraPage.SerialNumber"));
		
		return text;
	}
	
	public boolean verifyActiveButton() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_Active"));
	boolean active=	keywords.isDisplayed("xpath", _instance.getValue("CameraPage.BTN_Active"));

		
		return active;
	}
	public boolean verifyDeActiveButton() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_Deactive"));
	boolean active=	keywords.isDisplayed("xpath", _instance.getValue("CameraPage.BTN_Deactive"));

		
		return active;
	}
	
	public CameraPage clickOnInvoiceDataReport() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
//		keywords.waitForPageLoad();
		return this;
	}
	
	public boolean verifyInvoiceDataReport() throws Throwable
	{
	keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
	boolean invoice=	keywords.isDisplayed("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
	return invoice;
	}
	
	public CameraPage clickOnReturntoLiveUnit() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.ReturntoLiveUnit"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.ReturntoLiveUnit"));
//		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage verifyInvoicePage() throws Throwable
	{
		keywords.verifyTitle("LiveView Technologies QA - System Management - Billing Transactions");
//		keywords.waitForPageLoad();
		return this;
	}
	/*public boolean VerifyActiveOrDeactive(String ActiveDeactive) throws Throwable
	{
		if(ActiveDeactive.equals("Active"))
		{
			keywords.isDisplayed("xpath", _instance.getValue("Archives.BTN_Active"));
		}
		else if(ActiveDeactive.equals("Deactive"))
		{
			keywords.isDisplayed("xpath", _instance.getValue("Archives.BTN_Active"));
		}
		
		
		return this;
	}*/
}
