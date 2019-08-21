package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class AboutMensWearhousePage extends PopupWindows
{
	
	public AboutMensWearhousePage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}


	public static final String lbl_AboutMensWearHouse = "About Men's Wear House #xpath=//div[@class='inner clearfix']//h2";
	public static final String txt_AboutUs="About Us #xpath=//div[@class='inner clearfix']//h2";
	//public static final String txt_AboutUs="About Us #xpath=//*[@class='sub-category']//*[text()='About Us']
	public static final String txt_Guydlines="Guydlines #xpath=//h1[contains(text(),'Guy')]";
	public static final String txt_Prestylelooks="Pre-Style Loks #xpath=//div[contains(@id,'widget_breadcrumb')]/h1/span[contains(text(),'Pre-Styled Looks')]";
	public static final String txt_Allbrands="All Brands #xpath=//div[@id='main']";
	public static final String txt_Careers="Careers #xpath=//div[@class='d1 defaults']//h3[contains(text(),'PERSONALIZED, AFFORDABLE DESIGNER APPAREL')]";
	public static final String txt_returns = "About Men's Wear House #xpath=//div//h1[contains(text(),'RETURNS')]";
	
	
	

	public void verifyAboutMensWearHousePage()
	{
		waitTime(2);
		try
		{   
			waitForElement(lbl_AboutMensWearHouse);
			verifyElement(lbl_AboutMensWearHouse);		
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}

	}
	public void verifyAboutUsPage()
	{
		try
		{
			waitTime(2);
			waitForElement(txt_AboutUs);
			verifyElement(txt_AboutUs);		
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	
	public void verifyreturnspage()
	{
		try
		{
			waitTime(2);
			waitForElement(txt_returns);
			verifyElement(txt_returns);		
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	
	public void verifyCareersPage()
	{
		try
		{
			switchToWindow("Careers | Men’s Wearhouse");
			waitForElement(txt_Careers);
			verifyElement(txt_Careers);		
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	
	public void verifyGuydLinesPage()
	{
		waitTime(5);
		try
		{
			waitForElement(txt_Guydlines);
			verifyElement(txt_Guydlines);		
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	public void verifyPreStyledLooksPage()
	{
		waitTime(5);
		try
		{
			waitForElement(txt_Prestylelooks);
			verifyElement(txt_Prestylelooks);		
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	public void verifyAllBrandsPage()
	{
		waitTime(5);
		try
		{
			waitForElement(txt_Allbrands);
			verifyElement(txt_Allbrands);		
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	
}
