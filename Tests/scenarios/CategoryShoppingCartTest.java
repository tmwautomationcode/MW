package scenarios;

import mwPages.DepartmentNavigation;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.HomePage;


import baseClass.BaseClass;
import baseClass.PopupWindows;

public class CategoryShoppingCartTest extends PopupWindows{

	private BaseClass obj;

	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingCartPage;
	private HomePage homePage;



	public CategoryShoppingCartTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		departmentNavigation = new	DepartmentNavigation(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingCartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);
	}


	public void destroyObjects(){

		departmentNavigation = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingCartPage = null;
		homePage = null;
	}

	String productNameInPDP = null;

	public void CategoryShoppingCartTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){

		try{

			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);

			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {

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

			//clickOnBackToTopLinkInFooter();

			homePage.ClickonHomePageLogo();



			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}





			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				shoppingCartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}


			else if (browser.equalsIgnoreCase("Safari")) 
			{
				shoppingCartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
			}

			else 
			{

				shoppingCartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}


			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{

				String ProductType = retrieve("ProductType");

				if (ProductType.equalsIgnoreCase("Pants")) 
				{

					searchProductnew(retrieve("SearchKey"));

					//productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productGridPage.selectProductInProductGridPage(retrieve("ProductName"));


				   productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) {

						productDescriptionPage.selectTailorAndHemCheckbox();

						//double tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

						productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} else {
						testStepFailed("Tailor & Hem Checkbox is not displayed");
					}

					homePage.ClickonHomePageLogo();

				}

				else {

					//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"), retrieve("SubCategoryName"));
					
					departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

					productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

					productGridPage.clickOnQuickViewFromProductGridPage(retrieve("ProductName"));

					productGridPage.clickOnViewFullProductInformation();

					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

					productDescriptionPage.clickPDPAddtoShoppingBagButton();

					homePage.ClickonHomePageLogo();
				}

			}
			else
			{
				String ProductType = retrieve("ProductType");

				if (ProductType.equalsIgnoreCase("Pants")) 
				{

					searchProductnew(retrieve("SkuID"));

					//productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						//double tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

						productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} else {
						testStepFailed("Tailor & Hem Checkbox is not displayed");
					}

					//homePage.ClickonHomePageLogo();

				}

				else {

					searchProductnew(retrieve("SkuID"));

					//productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

					productNameInPDP = productDescriptionPage.getProductNameInProductDescriptionPage();

					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

					productDescriptionPage.clickPDPAddtoShoppingBagButton();
				}

			}


			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else {

				clickonChromeFirefoxCheckout();

			}

			shoppingCartPage.clickEditIteminShoppingCart();

			shoppingCartPage.entereditproductvalues(retrieve("ProductQuantity"));

			shoppingCartPage.clickUpdateButton();

			shoppingCartPage.removeAllItemsfromShoppingCart();

			homePage.ClickonHomePageLogo();

		}
		catch(Exception e)
		{
			testStepFailed("Exception occured :"+e.toString());
		}
		finally
		{
			if(departmentNavigation.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					shoppingCartPage.testCaseExecutionStatus ){
				this.testCaseExecutionStatus=true;
			}
			destroyObjects();
			driver.quit();
		}

		testStepInfo("");
		testStepInfo("*******************************");
		testStepInfo("Test Execution Completed");
		testStepInfo("*******************************");
	}
}