package com.surveillance.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class ContactRepo {
	PropertySingleton _instance = null;
	WebDriver driver ;
	public ContactRepo() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("ContactRepo");
	
	//======================================CREATE CONTACT REPO================================================
	
// Mouse Hover on Contact Menu
	public ContactRepo mousehoverContactMenu() throws Exception {
		keywords.movetoElement("xpath", _instance.getValue("createcontact.mousehoveroncontact"));
		return this;
	}
// Click on Create Contact Menu
	public ContactRepo clickCreateContactMenu() throws Exception {
		keywords.click("xpath", _instance.getValue("createcontact.createcontactmenu"));
		return this;
	}

// Click on outside 
	public ContactRepo clickout() throws Exception {
		keywords.click("xpath", _instance.getValue("createcontact.clickoutside"));
		return this;
	}
// Message on Create Contact
	public String createContactHeadnig() throws Exception {
		WebElement heading = keywords.elementFind("xpath",  _instance.getValue("createcontact.getcreatecontact"));
		String messageNote = heading.getText();					
		return messageNote;
	}
// 	Select PREFIX		
			public ContactRepo selectPrefix(String value) throws Exception {
				keywords.SelectDropDown("xpath", _instance.getValue("createcontact.prefix"),value);
				return this;			
			}
// Enter First Name 	
			public ContactRepo enterFirstName(String value) throws Exception {			
				keywords.clearEnter("xpath", _instance.getValue("createcontact.firstname"),value);	
				return this;
			}
// Enter Last Name 	
			public ContactRepo enterLastName(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("createcontact.lastname"),value);	
							return this;
						}
// Select SuffiX			
						public ContactRepo selectSufix(String value) throws Exception {
							keywords.SelectDropDown("xpath", _instance.getValue("createcontact.suffix"),value);
							return this;			
						}		
// Enter CRD	
						public ContactRepo enterCRD(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("createcontact.crd"),value);	
							return this;
						}										
// Enter Dealer Code	
						public ContactRepo enterDealerCode(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("createcontact.dealercode"),value);	
							return this;
						}	
						
// Select 2nd Address Radio Button by Loquate 
						public ContactRepo addressRadio() throws Exception {			
							keywords.radioClick("id", _instance.getValue("createcontact.radioaddress"));	
							return this;
							}								
// Enter Branch Code	
						public ContactRepo enterBranchCode(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("createcontact.branchcode"),value);	
							return this;
						}															
// Enter Rep Code	
						public ContactRepo enterrepCode(String value) throws Exception {			
							keywords.clearEnter("id", _instance.getValue("createcontact.repcode"),value);	
							return this;
						}									
// Enter Rep Name	
						public ContactRepo enterrepName(String value) throws Exception {			
							keywords.clearEnter("id", _instance.getValue("createcontact.repname"),value);	
							return this;
						}
						
// Enter company Name	
						public ContactRepo enterComName(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("createcontact.companyname"),value);	
							return this;
						}										
// Click on Next Button 		
						public ContactRepo nextButton() throws Exception {			
						keywords.click("xpath",  _instance.getValue("createcontact.next"));			
						return this;
						}						
// 	Click on Validate Address					
						public ContactRepo validateAddress() throws Exception {			
						keywords.click("xpath", _instance.getValue("createcontact.validateaddress"));			
						return this;
						}						
//	Click on Cleansed  Address		
						public ContactRepo cleansedAddress() throws Exception {			
						keywords.click("xpath",  _instance.getValue("createcontact.usecleansedaddress"));			
						return this;
						}							
//	Click on Create Button					
						public ContactRepo createButton() throws Exception {
							keywords.jsClick("id", _instance.getValue("createcontact.createbutton"));
						//keywords.click("id",  _instance.getValue("createcontact.createbutton"));			
						return this;
						}																	
//	Click on Create Float Button					
						public ContactRepo createFloatButton() throws Exception {			
						keywords.click("id",  _instance.getValue("createcontact.floatcreatebutton"));			
						return this;
						}							
						
// Click on outside 
						public ContactRepo clickoutsec() throws Exception {
							keywords.click("xpath", _instance.getValue("createcontact.clickoutsecond"));
							return this;
						}
// get value of company name 
						public String getcompany() throws Exception {
							WebElement getcm = keywords.elementFind("xpath",  _instance.getValue("createcontact.companyname"));
							String getcomval = getcm.getText();					
							return getcomval;
						}					
// get value of error message with invalid Dealer Code
						public String geterrormessage() throws Exception {
							WebElement geterr = keywords.elementFind("xpath",  _instance.getValue("createcontact.geterror"));
							String geterrval = geterr.getText();					
							return geterrval;
						}		
// get value of error message with valid Dealer Code and Invalid Branch Code		
						public String geterrormess() throws Exception {
							WebElement geterr = keywords.elementFind("xpath",  _instance.getValue("createcontact.getbrancherror"));
							String geterrval = geterr.getText();					
							return geterrval;
	}	
//   Get Dealer code Value
						public String getdealrcodefrmcontact() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("createcontact.getdealercodeforcontact"));
							String messageNote = heading.getText();					
							return messageNote;
						}
		//======================================SEARCH CONTACT REPO================================================
														
// Click on Search Contact Menu
						
						public ContactRepo clickSearchContactMenu() throws Exception {
							keywords.click("xpath", _instance.getValue("searchcontact.searchmenu"));
							return this;
						}
// Enter Express Number 	
						public ContactRepo enterExpressNo(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("searchcontact.expressnum"),value);	
							return this;
						}	
// Enter Express Number 	
						public ContactRepo enterCRDnum(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("searchcontact.crdnum"),value);	
							return this;
						}	
// Enter First Name 	
						public ContactRepo enterFName(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("searchcontact.firstname"),value);	
							return this;
						}	
// Enter Last Name 	
						public ContactRepo enterLName(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("searchcontact.lastname"),value);	
							return this;
						}
// Enter Company Name 	
						public ContactRepo entercomName(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("searchcontact.companyname"),value);	
							return this;
						}

// Enter Dealer Name 	
						public ContactRepo enterdealerName(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("searchcontact.dealername"),value);	
							return this;
						}
// Enter Dealer Code 	
						public ContactRepo enterdealerCode(String value) throws Exception {			
							keywords.clearEnter("xpath", _instance.getValue("searchcontact.dealercode"),value);	
							return this;
						}
// Click on Search Button 		
						public ContactRepo searchButton() throws Exception {			
						keywords.click("xpath",  _instance.getValue("searchcontact.searchbutton"));			
						return this;
						}	
					
						
//   Get Search Contact Heading	
						public String searchContactHeadnig() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.headingsearch"));
							String messageNote = heading.getText();					
							return messageNote;
						}
						
//   Get Express Value
						public String getExpressVal() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.getexpressvalue"));
							String messageNote = heading.getText();					
							return messageNote;
						}
//   Get crd Value
						public String getcrdVal() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.getcrdval"));
							String messageNote = heading.getText();					
							return messageNote;
						}
//   Get First Name Value
						public String getfnameVal() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.getfnameval"));
							String messageNote = heading.getText();					
							return messageNote;
						}
//   Get Last Name Value
						public String getlnameVal() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.getlname"));
							String messageNote = heading.getText();	
				
							return messageNote;
						}				

						
// Click on Checkbox					
						public ContactRepo checkbox() throws Exception {			
							keywords.click("xpath",  _instance.getValue("searchcontact.checkbox"));	
							//keywords.click("xpath",  _instance.getValue("searchcontact.checkboxvalue"));
							return this;
							}										
//   Get Company Name Value
						public String getcomnameVal() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.getcomname"));
							String messageNote = heading.getText();					
							return messageNote;
						}
//   Get Dealer Name Value
						public String getdealrnameVal() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.getdealrname"));
							String messageNote = heading.getText();					
							return messageNote;
						}
// Click on Express link 		
						public String getexpressVal() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.getexpress"));
							String messageNote = heading.getText();					
							return messageNote;
						}
//   Get Dealer Name Value
						public String getdealrcodeVal() throws Exception {
							WebElement heading = keywords.elementFind("xpath",  _instance.getValue("searchcontact.getdealercode"));
							String messageNote = heading.getText();					
							return messageNote;
						}
						

//======================================CREATE PLAN SPONSOR CONTACT REPOSITORY================================================					

						
//Click on Sponsor Menu

public ContactRepo clickSponsorMenu() throws Exception {
keywords.click("xpath", _instance.getValue("createsponsor.sponsormenu"));
return this;
}

//Get Sponsor Contact Heading	
public String getSponsorHeadnig() throws Exception {
	WebElement heading = keywords.elementFind("xpath",  _instance.getValue("createsponsor.heading"));
	String messageNote = heading.getText();					
	return messageNote;
}

// Enter Sponsor/GlobalId
public ContactRepo enterGobalId(String value) throws Exception {			
	keywords.clearEnter("xpath", _instance.getValue("createsponsor.globalid"),value);	
	return this;
}		
//Enter FName
public ContactRepo enterfsponsorname(String value) throws Exception {			
	keywords.clearEnter("xpath", _instance.getValue("createsponsor.fname"),value);	
	return this;
}
//Enter LName
public ContactRepo enterLsponsorname(String value) throws Exception {			
	keywords.clearEnter("xpath", _instance.getValue("createsponsor.lname"),value);	
	return this;
}
//Click on outside 
	public ContactRepo sponsorclickout() throws Exception {
		keywords.click("xpath", _instance.getValue("createsponsor.clickout"));
		return this;
	}
	
	// Select radio on sponsor 
	public ContactRepo clickRadio() throws Exception {			
		keywords.radioClick("xpath", _instance.getValue("createsponsor.clickradio"));	
		return this;
		}		
	
	// get value of Global Num
	public String getglobalnum() throws Exception {
		WebElement getspon = keywords.elementFind("xpath",  _instance.getValue("createsponsor.getglobalnum"));
		String getcomval = getspon.getText();					
		return getcomval;
	}	
	// get value of Global In after execute
	public String getglobalactual() throws Exception {
		WebElement getspon = keywords.elementFind("xpath",  _instance.getValue("createsponsor.getactglobal"));
		String getcomval = getspon.getText();					
		return getcomval;
	}	
//======================================NEW  SEARCH  CONTACT ================================================	

	//Click on New Search Contact Menu
	public ContactRepo clicknewSearchMenu() throws Exception {
	keywords.click("xpath", _instance.getValue("newsearchcontact.menusearch"));
	return this;
	}
	//Get New Search Contact Heading	
	public String getnewsearchcontactHeadnig() throws Exception {
		WebElement heading = keywords.elementFind("xpath",  _instance.getValue("newsearchcontact.searchheading"));
		String messageNote = heading.getText();					
		return messageNote;
	}
	
   // Enter First Name 	
	public ContactRepo enternewsearchFName(String value) throws Exception {			
		keywords.clearEnter("xpath", _instance.getValue("newsearchcontact.firstname"),value);	
		return this;
	}	
	//Click on  Search button
	public ContactRepo clicknewSearchbutton() throws Exception {
	keywords.click("xpath", _instance.getValue("newsearchcontact.searchbutton"));
	return this;
	}
	
	//Click on  Search Table Below
	public ContactRepo clickSearchtableBelow() throws Exception {
	keywords.click("xpath", _instance.getValue("newsearchcontact.searchtablebelow"));
	return this;
	}
	
// 	Select Status - Activate or Terminate		
			public ContactRepo newsearchselectstatus(String value) throws Exception {
				keywords.SelectDropDown("xpath", _instance.getValue("newsearchcontact.selectnewsearchatstatus"),value);
				return this;			
			}
//Click on  Reset button
			public ContactRepo clickresetbutton() throws Exception {
			keywords.click("xpath", _instance.getValue("newsearchcontact.resetbutton"));
			return this;
			}	
//Get the status	
			public String getnewsearchstatus() throws Exception {
				WebElement heading = keywords.elementFind("xpath",  _instance.getValue("newsearchcontact.getstatus"));
				String messageNote = heading.getText();					
				return messageNote;
			}
//Get the status text	
			public String getnewsearchfnameafterreset() throws Exception {
				WebElement heading = keywords.elementFind("xpath",  _instance.getValue("newsearchcontact.firstname"));
				String messageNote = heading.getText();					
				return messageNote;
			}					
//======================================POTENTIAL DUPLICATE================================================	
			
			//Click on Potential Duplicate Menu
			public ContactRepo clickpotentialduplicateMenu() throws Exception {
			keywords.click("xpath", _instance.getValue("potentialduplicate.menu"));
			return this;
			}		
			//Get potential Duplicate	
			public String getpotentialHeadnig() throws Exception {
				WebElement heading = keywords.elementFind("xpath",  _instance.getValue("potentialduplicate.getheading"));
				String messageNote = heading.getText();					
				return messageNote;
			}
					
			//Click on  Go to merge
			public ContactRepo clickpdgotomerge() throws Exception {
			keywords.click("xpath", _instance.getValue("potentialduplicate.gotomerge"));
			return this;
			}	
			  // Enter 	Express Number
			public ContactRepo enterpdexpressnum(String value) throws Exception {			
				keywords.clearEnter("xpath", _instance.getValue("potentialduplicate.expressnum"),value);	
				return this;
			}	
			//Click on  Add to Merge Button
			public ContactRepo clickpdaddtomergebutton() throws Exception {
			keywords.click("xpath", _instance.getValue("potentialduplicate.pdaddtomergebutton"));
			return this;
			}		
			//Click on  Next Button
			public ContactRepo clickpdnextbutton() throws Exception {
			keywords.click("xpath", _instance.getValue("potentialduplicate.pdnextbutton"));
			return this;
			}
			//Click on  Apply Merge
			public ContactRepo clickpdapplymergebutton() throws Exception {
			keywords.click("xpath", _instance.getValue("potentialduplicate.applymerge"));
			return this;
			}
			//Click on  checkbox
			public ContactRepo clickpdcheckbox() throws Exception {
			keywords.click("xpath", _instance.getValue("potentialduplicate.selectcheck"));
			return this;
			}	
			//Click on  CR Territory Menu
			public ContactRepo clickcrterritoryMenu() throws Exception {
			keywords.click("xpath", _instance.getValue("crterritory.menu"));
			return this;
			}
			
			//Get potential Duplicate	
			public String getcrterritoryheading() throws Exception {
				WebElement heading = keywords.elementFind("xpath",  _instance.getValue("crterritory.heading"));
				String messageNote = heading.getText();					
				return messageNote;
			}
			 // Enter 	Express Number
			public ContactRepo entercrexpress(String value) throws Exception {			
				keywords.clearEnter("xpath", _instance.getValue("crterritory.crexpress"),value);	
				return this;
			}	
			//Click on  Search Button
			public ContactRepo crsearchbutton() throws Exception {
			keywords.click("xpath", _instance.getValue("crterritory.searchbutton"));
			return this;
			}
			//Click on  Remove Override Button
			public ContactRepo crremoveoverridebutton() throws Exception {
			keywords.click("xpath", _instance.getValue("crterritory.removeoverridebutton"));
			return this;
			}
			//======================================UPDATE CONTACT================================================	
			//Click on  Below express link
			public ContactRepo clickbelowExpressLink() throws Exception {
			keywords.click("xpath", _instance.getValue("updatecontact.clickbelowexpress"));
			return this;
			}
			//Click on  Update Button
			public ContactRepo clickUpdate() throws Exception {
			keywords.jsClick("xpath", _instance.getValue("updatecontact.clickUpdate"));
			return this;
			}	
			
			//Get the status text	
			public String getUpdateSuccess() throws Exception {
				WebElement heading = keywords.elementFind("xpath",  _instance.getValue("updatecontact.getUpdateSuccess"));
				String messageNote = heading.getText();					
				return messageNote;
			}	
			// Update Successful Link
			public ContactRepo elementupdateSuccessfulLink() throws Exception {
				WebElement heading = keywords.elementFind("xpath",  _instance.getValue("updatecontact.getUpdateSuccess"));
				return this;		
			}
			
			// Fluent Wait
			public ContactRepo Fluent() throws Exception {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			        .withTimeout(30, TimeUnit.SECONDS)
			        .pollingEvery(5, TimeUnit.SECONDS)
			        .ignoring(NoSuchElementException.class);
			return this;
}
//		 	Select Contact Type	
					public ContactRepo contactType(String value) throws Exception {
						keywords.SelectDropDown("xpath", _instance.getValue("updatecontact.contactType"),value);
						return this;			
					}
					public ContactRepo wait7() throws Exception {
						Thread.sleep(7000);
						return this;
					}
					// Click on outside 
					public ContactRepo clickoutcompanysection() throws Exception {
						keywords.click("xpath", _instance.getValue("updatecontact.sectioncompany"));
						return this;
					}
					
			
}







						
						
						
						
	
