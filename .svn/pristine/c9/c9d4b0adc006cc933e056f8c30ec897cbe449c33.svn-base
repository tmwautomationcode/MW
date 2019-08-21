package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class LooksPage extends PopupWindows
{
	public LooksPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_Looks = "Looks #xpath=//h1[text()='Looks']";
	
	public void verifyLooksPage()
	{
		try
		{
			waitForElement(lbl_Looks);
			verifyElement(lbl_Looks);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	
	}
}
