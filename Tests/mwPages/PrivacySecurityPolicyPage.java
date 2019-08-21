package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class PrivacySecurityPolicyPage extends PopupWindows
{
	public PrivacySecurityPolicyPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_PrivacyandSecurityPolicy = " Your Privacy Rights #xpath=//div[@id='acct-right']//h2";
	
	public void verifyPrivacySecurityPolicyPage()
	{
		try
		{
			waitTime(5);
			switchToWindow("Privacy and Security Policy| Men's Wearhouse");
			waitForElement(lbl_PrivacyandSecurityPolicy);
			verifyElement(lbl_PrivacyandSecurityPolicy);
			driver.close();
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
	}
	
	public void VerifyPrivacyPolicyPageisDisplayed(){
		try {
			
			if (driver.findElement(By.xpath("//div[contains(@id,'acct-right')]//h2[contains(text(),'Privacy Policy')]")).isDisplayed()) {
				testStepPassed("Privacy Policy Page is displayed");
			}
		} catch (Exception e) {
			testStepFailed("Privacy Policy Page is not displayed");
		}
	}
}
