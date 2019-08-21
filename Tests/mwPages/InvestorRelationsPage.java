package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class InvestorRelationsPage extends  PopupWindows
{
	public InvestorRelationsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_TailoredBrands = "Tailored Brands #xpath=//img[@alt='Tailored Brands']";
	
	public void verifyInvestorRelationsPage()
	{
		try
		{
			waitTime(10);
			//switchToWindow("Tailored Brands (TLRD)");
			switchToWindow("Investor Relations :: Tailored Brands (TLRD)");
			waitForElement(lbl_TailoredBrands);
			verifyElement(lbl_TailoredBrands);
			driver.close();
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
	}
}
