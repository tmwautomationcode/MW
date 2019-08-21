package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class PerfectFitCreditCardPage extends PopupWindows
{
	public PerfectFitCreditCardPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_Perfect_Fit_CreditCard="Perfect Fit Credit Card Program label#xpath=//span[text()='PERFECT FIT REWARDS PROGRAM']";
	
	public void verifyPerfectFitCreditCardPage()
	{
		try
		{
			waitForElement(lbl_Perfect_Fit_CreditCard);
			verifyElement(lbl_Perfect_Fit_CreditCard);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}	
	
	}	
}
