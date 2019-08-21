package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class MensWearhouseHomePage extends PopupWindows
{
	public MensWearhouseHomePage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String img_MenswearHome="Men's Wearhouse Homepage #xpath=//h2[text()='Just for You']";
	public static final String lnk_BacktoTop="Back to Top page #xpath=//a[contains(text(),\"Back to Top\")]";
	public static final String txt_Email_Id="Email Id text box#xpath=//input[@id='emailUpdatesEmail']";
	public static final String btn_Submit="Submit button#xpath=//div[contains(@class,'sign-up')][1]//button[contains(@class,'button primary postfix')]";//*[@id='JoinEmailFormFooter']//*[text()='Sign up']";//input[@value='Submit']";
	public static final String btn_Close="Close button#xpath=//div[@id='infoModal']/a[text()='Close']";
	public static final String lnk_SignIn="Sign In Link#xpath=//a[@id='sign-in-link-header']";
	
	
	public void enterEmailAndSubmit(String emailId)
	{
		try
		{
			driver.navigate().refresh();
			waitForElement(txt_Email_Id);
			typeIn(txt_Email_Id,emailId);
			waitForElement(btn_Submit);
			clickOn(btn_Submit);
			waitTime(1);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
	}
	 
	public void verifyMensWearhouseHomePage()
	{
		try
		{
			waitForElement(img_MenswearHome);
			verifyElement(img_MenswearHome);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}		
	}
	
	public void clickOnBacktoTop()
	{
		try
		{
				waitForElement(lnk_BacktoTop);
				clickOn(lnk_BacktoTop);		
			
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
		  
	}
	public void clickOnClosePopUp()
	{
		waitForElement(btn_Close);
		clickOn(btn_Close);
	}
	
}
