package scenarios;

import mwPages.DepartmentNavigation;
import mwPages.ProductGridPage;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.HomePage;
import mwPages.ProductBundlePage;
import mwPages.ProductDescriptionPage;
import mwPages.GiftCardsPage;


public class ColorSwatchVerificationTest extends PopupWindows 
{
	private BaseClass obj;
	private HomePage homePage;
	private DepartmentNavigation departmentNavigation;
	private ProductGridPage productGridPage;
	private PopupWindows popupWindows;
	private ProductDescriptionPage productDescriptionPage;
	private ProductBundlePage productBundlePage;
	private GiftCardsPage giftCardsPage;


	public ColorSwatchVerificationTest(BaseClass obj) 
	{
		super(obj);
		this.obj=obj;
	}


	public void createObjects(String browser)
	{
		obj.driver=driver;
		obj.currentBrowser=browser;
		departmentNavigation = new DepartmentNavigation(obj);
		productGridPage = new ProductGridPage(obj);
		homePage= new HomePage(obj);
		popupWindows=new PopupWindows(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		productBundlePage = new ProductBundlePage(obj);
		giftCardsPage = new GiftCardsPage(obj);
		homePage= new HomePage(obj);
	}


	public void destroyObjects()
	{
		departmentNavigation = null;
		popupWindows=null;
		productGridPage = null;
		productDescriptionPage = null;
		productBundlePage = null;
		giftCardsPage = null;
		homePage= null;
	}


	private String parentWindow;
	String currentWindow;
	int startFromDepartment = 0; 
	int endAtDepartment = 0;




	public void ColorSwatchVerificationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId)
	{
		try
		{
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);

			createObjects(browser);

			selectUSFlag();

			homePage.ClickonHomePageLogo();
			
			waitTime(2);
			
			homePage.submitFeedbackForm("Make a purchase", "Navigation");
			
			//homePage.submitFeedbackFormFromFooter("Make a purchase", "Navigation");

			String departmentName = retrieve("DepartmentName");

			String subCategoryName = retrieve("SubCategoryName");
			
			testStepInfo("Department Name : "+departmentName);
			
			testStepInfo("SubCategory Name : "+subCategoryName);

			String department = "(//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')])[1]";

			//mouseOver(department);
			
			
			mouseHover("(//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')])[1]");
			

			waitTime(2);

			WebElement SubcategoryLink = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+departmentName+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+subCategoryName+"')])[1]"));

			SubcategoryLink.click();

			waitTime(2);

			if (productGridPage.checkProductGridPageisDisplayed()) 
			{
				testStepPassed("Product Grid Page is displayed");

				productGridPage.validatingColorSwatch();

			}

			else 
			{
				testStepFailed("Product Grid Page is not displayed");
			}


			homePage.ClickonHomePageLogo();

		}
		catch(Exception e)
		{
			testStepFailed("Failure Description: " +e);
		}

		finally
		{
			if(departmentNavigation.testCaseExecutionStatus ||
					popupWindows.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productBundlePage.testCaseExecutionStatus||
					homePage.testCaseExecutionStatus)
			{
				this.testCaseExecutionStatus=true;
			}
			driver.quit();
			destroyObjects();
		}

		testStepInfo("");
		testStepInfo("*******************************");
		testStepInfo("Test Execution Completed");
		testStepInfo("*******************************");
	}
}