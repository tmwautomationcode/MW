package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class PerfectFitRewardsPage extends PopupWindows
{
	public PerfectFitRewardsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_Perfect_Fit_Rewards="Perfect Fit Rewards Program label#xpath=//span[text()='PERFECT FIT REWARDS PROGRAM']";
	public static final String txt_Breadcrumb_PerfectFitRewards = "Perfect Fit Rewards Breadcrumb#xpath=//*[contains(@class,'breadcrumb')]";//*[contains(text(),'PERFECT FIT REWARDS PROGRAM') or contains(text(),'Perfect Fit Rewards')]";
	
//	public void verifyPerfectFitRewardsPage()
//	{
//		try
//		{
//			waitForElement(txt_Breadcrumb_PerfectFitRewards);
//			verifyElement(txt_Breadcrumb_PerfectFitRewards);
//		}
//		catch(Exception e)
//		{
//			testStepFailed(e.toString());
//		}			
//	}
//	
	public void verifyPerfectFitRewardsPage()
	{
			waitForElement(txt_Breadcrumb_PerfectFitRewards);
			if(isElementDisplayed(txt_Breadcrumb_PerfectFitRewards)){
				testStepPassed("PerfectFitRewards Link is navigated to its corresponding page");			
			}else{
				testStepFailed("PerfectFitRewards Link is navigated to its corresponding page");
			}
	}
	
	
	public void verifyPerfectFitPayOnlinePage()
	{
			waitTime(3);
			if (driver.findElement(By.xpath("//h1[contains(text(),'Manage Your Perfect Fit')]")).isDisplayed()) {
				testStepPassed("Perfect Fit Pay Online page is displayed");
			}
			else {
				testStepFailed("Perfect Fit Pay Online page is displayed");
			}
			driver.close();
	}
	
}