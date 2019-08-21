package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class CorporateWearPage extends PopupWindows
{
	public CorporateWearPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_CorporateApparel = "Corporate Apparel label #xpath=//strong[contains(text(),\"Corporate Apparel for every business\")]";

	public void verifyCorporateWearPage()
	{
		try
		{			
			waitTime(10);				
			switchToWindow("Twin Hill");	
			waitForElement(lbl_CorporateApparel);
			verifyElement(lbl_CorporateApparel);	
			driver.close();			
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
	}
}
