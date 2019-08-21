package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class RecommendationsForYouPage extends PopupWindows
{
	public RecommendationsForYouPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_MW_Recommendations="MW Recommendations label #xpath=//li[text()='MW Recommendations']";
	
	public void verifyRecommendationsPage()
	{
		try
		{
			waitForElement(lbl_MW_Recommendations);
			verifyElement(lbl_MW_Recommendations);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
	}
}
