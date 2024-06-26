package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenStorepage2
{

	public OpenStorepage2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}



	


	@FindBy(xpath = "//a[text()='iPhone']")
	WebElement iphone;

	@FindBy(xpath = "//a[text()='Write a review']")
	WebElement writereview;

	@FindBy(xpath ="//input[@id='input-name']")
	WebElement name;


	@FindBy(id="input-text")
	WebElement reviewdiscription;

	@FindBy(xpath ="(//input[@class='form-check-input'])[5]")
	WebElement radio;


	@FindBy(xpath="//button[@id='button-review']")
	WebElement continuebutton;
	
	


	GenericKeywordsWithPage key = new GenericKeywordsWithPage("openstore2");





	


	public void iphoneButton()
	{
		key.jsClick(iphone);
	}

	public void reviewButton()
	{
		key.jsClick(writereview);
	}


	public void nameButton(String data)
	{
		key.enterData(name, data);
	}


	public void reviewDiscription(String data)
	{
		key.enterData(reviewdiscription, data);
	}

	public void ratioButton()
	{
		key.jsClick(radio);
	}

	public void continueButton()
	{
		key.jsClick(continuebutton);
	}

	

	







}
