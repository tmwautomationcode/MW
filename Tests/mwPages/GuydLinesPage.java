package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class GuydLinesPage extends  PopupWindows
{
	public GuydLinesPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_GuydLines = "Guy'd Lines #xpath=//h1[contains(text(),\"Guy'd Lines&reg;\")]";
	
	public void verifyGuydLinesPage()
	{
		try
		{
			waitForElement(lbl_GuydLines);
			verifyElement(lbl_GuydLines);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	
	}
}
