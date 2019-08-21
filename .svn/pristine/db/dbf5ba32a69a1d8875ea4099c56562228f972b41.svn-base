package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class OnlineReturnsPage extends PopupWindows
{
	public OnlineReturnsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_Returns = "RETURNS #xpath=//div[contains(@id,'returns-container')]//h2[contains(text(),'Returns')]";
	
	public void verifyOnlineReturnsPage()
	{
		try
		{
			if (driver.findElement(By.xpath("//h2[contains(text(),'Returns')]")).isDisplayed()) 
			{
				testStepPassed("Online Returns page is displayed");
			}
			else if (driver.findElement(By.xpath("//h1[contains(text(),'Returns')]")).isDisplayed()) 
			{
				testStepPassed("Online Returns page is displayed");
			}
		}
		catch(Exception e)
		{
			testStepFailed("Online Returns page is not displayed");
		}	
		
	}
}
