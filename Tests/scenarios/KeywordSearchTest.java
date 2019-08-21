package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.HomePage;


public class KeywordSearchTest extends PopupWindows{

	private BaseClass obj;

	private ProductGridPage productGridPage;
	private ProductDescriptionPage productDescriptionPage;
	private HomePage homePage;
	



	public KeywordSearchTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}


	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		productGridPage = new	ProductGridPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		homePage= new HomePage(obj);

	}


	public void destroyObjects(){
		productGridPage = null;
		productDescriptionPage = null;
		homePage= null;
	}



	public void keywordSearchTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion){
		try{

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
									
			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) 
			{

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}*/


			

			if (browser.equalsIgnoreCase("Safari")) 
			{
				verifySafariUSFlagSelected();
				waitTime(5);
			} 

			else 
			{
				verifyUSFlagSelected();
			}

			homePage.ClickonHomePageLogo();
			
			//clickOnBackToTopLinkInFooter();
			
			

			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}

			
			


			testStepInfo("");
			testStepInfo("Searching a Product in Header Link Search Bar & Verifying the concerned products are displayed in the PGP Page");
			testStepInfo("*****************************************************************************************************************************************");

			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")){
				
				if (browser.equalsIgnoreCase("Safari")) 
				{
					searchProductSafari(retrieve("SearchProduct"));
				} 

				else 
				{
					searchProductnew(retrieve("SearchProduct"));
				}
				

				

				productGridPage.verifyProductGridPageListedProducts();

			}

			else
			{

				searchProductnew(retrieve("SkuID"));

				productGridPage.verifyProductGridPageListedProducts();

			}
			
			driver.manage().deleteAllCookies();
		}

		catch(Exception e)
		{
			testStepFailed(e.toString());

		}

		finally
		{
			if(productGridPage.testCaseExecutionStatus || productDescriptionPage.testCaseExecutionStatus){
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