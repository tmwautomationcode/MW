package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class InternationalOrdersPage extends PopupWindows
{
	public InternationalOrdersPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_InternationalOrder = "International Order #xpath=//div[contains(@id,'IntlShipWrapper')]";
	
	public void verifyInternationalOrdersPage()
	{
		waitTime(2);
		try
		{
			waitForElement(lbl_InternationalOrder);
			verifyElement(lbl_InternationalOrder);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

}
