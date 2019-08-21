package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class SiteMapPage extends PopupWindows
{
	public SiteMapPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_SiteMap="SITE MAP label #xpath=//h1[@class='siteMapHeader']";
	
	public void verifySiteMapPage()
	{
		 try
		 {
			 waitForElement(lbl_SiteMap);
			verifyElement(lbl_SiteMap);
		 }
		 catch(Exception e)
		 {
			 testStepFailed(e.toString());
		 }

	}	
}
