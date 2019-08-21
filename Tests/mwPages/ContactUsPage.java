package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class ContactUsPage extends PopupWindows
{
	public ContactUsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}

	public static final String lbl_ContactUS = "Contact Us #xpath=//h2[text()='Contact us']";

	//	public void verifyContactUsPage()
	//	{
	//		waitForElement(lbl_ContactUS);
	//		verifyElement(lbl_ContactUS);
	//		try
	//		{
	//			waitForElement(lbl_ContactUS);
	//			verifyElement(lbl_ContactUS);		
	//		}
	//		catch(Exception e)
	//		{
	//			testStepFailed(e.toString());
	//		}
	//		
	//	}

	public void verifyContactUsPage()
	{
		waitForElement(lbl_ContactUS);
		
		if(isElementDisplayed(lbl_ContactUS)){
			testStepPassed("Contact Us Link is navigated to its corresponding page");			
		}else{
			testStepFailed("Contact Us Link is navigated to its corresponding page");
		}

	}
}