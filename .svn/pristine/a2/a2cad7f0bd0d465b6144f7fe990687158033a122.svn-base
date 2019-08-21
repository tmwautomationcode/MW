package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class PerfectFitCreditCardPaymentsPage extends  PopupWindows
{
	public PerfectFitCreditCardPaymentsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_Perfect_Fit_CreditCard_Payments="Perfect Fit Credit Card Payments - UserId #xpath=//input[@name='userId']";
	
	public void verifyPerfectFitCreditCardPaymentsPage()
	{
		try
		{
			waitTime(10);
			switchToWindow("Men’s Wearhouse");
			waitForElement(lbl_Perfect_Fit_CreditCard_Payments);
			verifyElement(lbl_Perfect_Fit_CreditCard_Payments);	
			driver.close();
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}	
	}	
}
