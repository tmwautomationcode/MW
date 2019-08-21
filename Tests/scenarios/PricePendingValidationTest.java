package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.SearchResultsPage;


public class PricePendingValidationTest extends PopupWindows{

	private BaseClass obj;

	private ProductGridPage productGridPage;
	private ProductDescriptionPage productDescriptionPage;
	private HomePage homePage;
	private SearchResultsPage searchResultsPage;
	private DepartmentNavigation departmentNavigation;


	public PricePendingValidationTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}


	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		productGridPage = new	ProductGridPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		homePage= new HomePage(obj);
		searchResultsPage = new SearchResultsPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
	}


	public void destroyObjects(){
		productGridPage = null;
		productDescriptionPage = null;
		homePage= null;
		searchResultsPage = null;
		departmentNavigation = null;
	}



	public void pricePendingValidationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion){
		try
		{

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);


			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}


			
/*
			if (browser.equalsIgnoreCase("Safari")) 
			{
				verifySafariUSFlagSelected();
				waitTime(5);
			} 

			else 
			{
				verifyUSFlagSelected();
			}

			clickOnBackToTopLinkInFooter();*/

			if(!retrieve("SearchProduct").isEmpty()) {
				searchProductnew(retrieve("SearchProduct"));
				
				//searchResultsPage.verifySearchResultsPageisDisplayedwithProducts();
				productGridPage.verifyProductGridPageListedProducts();
				
				}
				else  {
					//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
					departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));
					productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
					testStepPassed("Product Grid Page is displayed");

				}

			searchResultsPage.SelectProductsSortByDropdownValue(retrieve("ProductsSortBy"));

			searchResultsPage.CheckProductPriceisDisplayedorPricePendingTextisDisplayed();
		
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

