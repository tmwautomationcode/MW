package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class HelpFAQsPage extends PopupWindows
{
	public HelpFAQsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_FQA_HelpCenterFAQs = "HELP CENTER FAQs #xpath=//h2[text()='HELP CENTER FAQs']";	
	public static final String lbl_FAQ_Returns_Exchanges = "HELP CENTER FAQs #xpath=//div[@id='-MW4FAQonlineReturnsPolicy']";
	public static final String lbl_FAQ_Promotion = "Promotional Terms FAQs #xpath=//*[text()='PROMOTIONS' or contains(text(),'ONLINE PROMO CODES')]";
	
	
	public void verifyHelpFAQsPage()
	{

		try
		{
			waitTime(5);
			switchToWindow("FAQs");
			waitTime(6);
			waitForElement(lbl_FQA_HelpCenterFAQs);
			verifyElement(lbl_FQA_HelpCenterFAQs);
			
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	
		
	}
	
	public void verifyReturnsAndExchanges()
	{

		try
		{
			waitTime(10);
			switchToWindow("FAQs");
			waitForElement(lbl_FAQ_Returns_Exchanges);
			verifyElement(lbl_FAQ_Returns_Exchanges);
			//driver.close();
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	
		
	}
	
	public void verifyPromotionalTerms()
	{
		try
		{
			waitTime(5);
			/*switchToWindow("FAQs");
			waitTime(6);*/
			waitForElement(lbl_FAQ_Promotion);
			verifyElement(lbl_FAQ_Promotion);
			//driver.close();
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	
		
	}
}
