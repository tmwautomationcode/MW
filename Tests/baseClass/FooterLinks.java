package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class FooterLinks extends Common_Utilities
{
	public static final String lnk_Footer_mobileTerms="Header Link - Greeting #xpath = //div[contains(@id,'header-user-greeting')]";
	public static final String lnk_BackToTop="Footer-Back To Top Link#xpath=//*[contains(@id,'back-to-top-trigger')]";
	public FooterLinks(BaseClass obj)
	{
		super(obj);
	}
	public void clickOnFooterLinks(String link)
	{
		try
		{		
			//footer[@id='pg-footer']//a[contains(text(),'Privacy & Security Policy')]
			waitForElement("Footer Link - "+link+ "#xpath=//footer[@id='pg-footer']//a[contains(text(),'"+link+"')]");
			//clickOn("Footer Link - "+link+ "#xpath=//footer[@id='pg-footer']//a[contains(text(),'"+link+"')]");
			clickOn("Footer Link - "+link+ "#xpath=//footer[@id='pg-footer']//ul[contains(@class,'footer-categories')]//a[contains(text(),'"+link+"')]");
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}			
	}


	public void clickOnTermsandConditionsFooterLinks(String link)
	{
		try
		{		
			waitForElement("Footer Link - "+link+ "#xpath=//footer[@id='pg-footer']//a[contains(text(),'"+link+"')]");
			//clickOn("Footer Link - "+link+ "#xpath=//footer[@id='pg-footer']//a[contains(text(),'"+link+"')]");
			clickOn("Footer Link - "+link+ "#xpath=//footer[@id='pg-footer']//a[contains(text(),'"+link+"')]");
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}			
	}

	public void clickOnFooterLinksInSocialLinks(String link)
	{
		waitTime(3);
		try
		{			
			waitForElement("Footer Link - "+link+ "#xpath=//footer[@id='pg-footer']//a[contains(@title,'"+link+"')]");
			clickOn("Footer Link - "+link+ "#xpath=//footer[@id='pg-footer']//a[contains(@title,'"+link+"')]");			
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}			
	}


	public void clickOnURLNavigateBackButton(){
		waitTime(2);
		driver.navigate().back();
	}


	public void clickOnBackToTopLinkInFooter(){
		waitTime(1);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
		clickOn(lnk_BackToTop);
	}



public static final String lnk_HWP_Container_Close="HWP Container Close Link#xpath=//div[contains(@class,'hwp-container')]//div[contains(@class,'hwp-push')]//div[contains(@class,'push-close')]";

public void clickOnHwpContainer(){
	try {
		if (driver.findElement(By.xpath("//div[contains(@class,'hwp-container')]//div[contains(@class,'hwp-push')]//div[contains(@class,'push-close')]")).isDisplayed()) {
			clickOn(lnk_HWP_Container_Close);
		}
	} catch (Exception e) {
		testStepPassed("Hwp Container Close button is not displayed");
	}
}

}












