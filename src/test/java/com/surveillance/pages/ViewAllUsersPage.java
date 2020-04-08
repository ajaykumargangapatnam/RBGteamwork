package com.surveillance.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class ViewAllUsersPage {
	
	PropertySingleton _instance = null;

	public ViewAllUsersPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("LoginPage");
	
	public String findRole(String rolename)
	{
		String roleNumber="";
		List<WebElement> namesList=keywords.elementsFind("xpath", "//table/tbody/tr/td[4]");
		
		for(int i=0;i<namesList.size();i++)
		{
			System.out.println(namesList.get(i).getText());
			if(namesList.get(i).getText().equals(rolename))
			{
				roleNumber=i+2+"";
				System.out.println("roleNumber : "+roleNumber);
				break;
			}
			
		}
				
		return roleNumber;
		}

	public ViewAllUsersPage clickOnEmailAddress(String rolename)
	{
		String rowNumber=findRole(rolename);
			keywords.elementFind("xpath", "//table/tbody/tr["+rowNumber+"]/td[1]/a").click();	


			return this;
		}

	
	
}
