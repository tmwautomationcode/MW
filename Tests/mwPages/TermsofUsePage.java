package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class TermsofUsePage extends PopupWindows
{
	public TermsofUsePage(BaseClass obj) {
		
		super(obj);
		// TODO Auto-generated constructor stub
	}
	public static final String lbl_TermsandConditionsofUse = "TERMSANDCONDITIONSOFUSE #xpath=//div[@id='acct-right']//h2";

	public void verifyTermsofUsePage()
	{

		try
		{
			waitTime(5);
			switchToWindow("Website Terms and Conditions| Men's Wearhouse");
			waitForElement(lbl_TermsandConditionsofUse);
			verifyElement(lbl_TermsandConditionsofUse);
			driver.close();
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}


	}

	
	public void TermsandConditionsOfUsePageisDisplayed(){
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@id,'acct-right')]//h2//a[contains(text(),'Terms and Conditions of Use')]")).isDisplayed()) {
				testStepPassed("Terms & Conditions of Use Page is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Terms & Conditions of Use Page is not displayed");
		}
	}
	
	
}
