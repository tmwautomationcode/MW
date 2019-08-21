package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class CATransparencyInSupplyChainsActPage extends PopupWindows
{
	public CATransparencyInSupplyChainsActPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
public static final String lbl_CA_TransparencyinSupplyChainsAct = "CA Transparency in Supply Chains Act #xpath=//div[@id='acct-right']//h2[contains(text(),'CALIFORNIA TRANSPARENCY ')]";
	
	public void verifyCATransparencyINSupplyChainActPage()
	{		
		try
		{
			waitTime(5);
			switchToWindow("California Transparency in Supply Chain Act| Men's Wearhouse");
			waitForElement(lbl_CA_TransparencyinSupplyChainsAct);
			verifyElement(lbl_CA_TransparencyinSupplyChainsAct);	
			driver.close();
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	
	
	public void VerifyCALIFORNIATRANSPARENCYINSUPPLYCHAINSACTPageisDisplayed(){
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@id,'acct-right')]//h2[contains(text(),'CALIFORNIA TRANSPARENCY IN SUPPLY CHAINS ACT')]")).isDisplayed()) {
				testStepPassed("CALIFORNIA TRANSPARENCY IN SUPPLY CHAINS ACT Page is displayed");
			}
		} catch (Exception e) {
			testStepFailed("CALIFORNIA TRANSPARENCY IN SUPPLY CHAINS ACT Page is not displayed");
		}
	}
	
}
