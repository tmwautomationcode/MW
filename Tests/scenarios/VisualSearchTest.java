package scenarios;

import mwPages.CheckOutPage;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.MyAccountAddressBookPage;
import mwPages.MyAccountOrderDetailPage;
import mwPages.MyAccountOrderHistoryPage;
import mwPages.MyAccountPage;
import mwPages.MyAccountPaymentMethodsPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.StoreLocatorPage;


import baseClass.BaseClass;
import baseClass.PopupWindows;

public class VisualSearchTest extends PopupWindows {

	private BaseClass obj;

	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingcartPage;
	private CheckOutPage checkoutPage;
	private MyAccountOrderHistoryPage myAccountOrderHistoryPage;
	private MyAccountPage myAccountPage;
	private MyAccountPaymentMethodsPage myAccountPayMentmethodsPage;
	private MyAccountAddressBookPage myAccountAddressBookPage;
	private MyAccountPaymentMethodsPage myAccountPaymentMethodsPage;
	private OrderConfirmationPage orderConfirmationPage;
	private MyAccountOrderDetailPage myAccountOrderDetailPage;
	private HomePage homePage;
	private StoreLocatorPage storeLocatorPage;
	

	public VisualSearchTest(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	public void createObjects(String browser) {
		obj.driver = driver;
		obj.currentBrowser = browser;

		checkoutPage = new CheckOutPage(obj);
		departmentNavigation = new DepartmentNavigation(obj);
		myAccountAddressBookPage = new MyAccountAddressBookPage(obj);
		myAccountOrderHistoryPage = new MyAccountOrderHistoryPage(obj);
		myAccountPage = new MyAccountPage(obj);
		myAccountPayMentmethodsPage = new MyAccountPaymentMethodsPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		productGridPage = new ProductGridPage(obj);
		shoppingcartPage = new ShoppingCartPage(obj);
		orderConfirmationPage = new OrderConfirmationPage(obj);
		myAccountOrderDetailPage = new MyAccountOrderDetailPage(obj);
		myAccountPaymentMethodsPage = new MyAccountPaymentMethodsPage(obj);
		homePage = new HomePage(obj);
		storeLocatorPage = new StoreLocatorPage(obj);
	}

	public void destroyObjects() {
		checkoutPage = null;
		departmentNavigation = null;
		myAccountAddressBookPage = null;
		myAccountOrderHistoryPage = null;
		myAccountPage = null;
		myAccountPayMentmethodsPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		orderConfirmationPage = null;
		myAccountOrderDetailPage = null;
		myAccountPaymentMethodsPage = null;
		homePage = null;
		storeLocatorPage = null;
	}

	String CurrentURL;

	public void visualSearchTestScenario(String machineName, String host, String port, String browser, String os,
			String browserVersion, String osVersion, String tcId) {

		try {

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")|| browser.equalsIgnoreCase("Safari")) 
			{

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}*/


			String ExecutionURL = driver.getCurrentUrl();

			testStepPassed("Execution URL : "+ExecutionURL);

			if (browser.equalsIgnoreCase("Safari")) 
			{
				waitTime(5);
				verifySafariUSFlagSelected();
				homePage.ClickonHomePageLogo();
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


			waitTime(3);

			testStepInfo("");

			testStepInfo("Home Page Visual Search Starts Here");


			if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {

				visualSearchProduct(retrieve("SearchProduct"));

			} 
			else {

				visualSearchProduct(retrieve("SkuID"));
			}

			waitTime(2);

			homePage.CheckingVisualSearchPanelisDisplayedandGettingTitleNames();

			homePage.AddingProductFromVisualSearchSuggestedSearchesPanel(retrieve("ProductName"), retrieve("ProductSize"));

			waitTime(2);

			driver.navigate().to(ExecutionURL);

			waitTime(2);

			CurrentURL = driver.getCurrentUrl();

			if (CurrentURL.equalsIgnoreCase(ExecutionURL)) 
			{

				testStepPassed("It navigated back to the correct execution URL");

			}

			else 
			{

				testStepFailed("It navigated back to the wrong URL");

			}

			if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {

				visualSearchProduct(retrieve("SearchProduct"));

			} 
			else 
			{

				visualSearchProduct(retrieve("SkuID"));

			}


			waitTime(2);

			homePage.AddingProductFromVisualSearchRecommendedProductsPanel(retrieve("ProductName"), retrieve("ProductSize"));



		/*	if (browser.equalsIgnoreCase("InternetExplorer")) {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}

			else if (browser.equalsIgnoreCase("Safari")) {

				shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();

			}

			else {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			
			homePage.ClickonHomePageLogo();*/
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}
			
			waitTime(3);
			
			shoppingcartPage.removeAllItemsfromShoppingCart();
			
			
			
			
			
			
			
			
			
			
			//shoppingcartPage.removeAllItemsfromShoppingCart();

			
			
			/*if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else {

				//viewshoppingbag();
				clickonChromeFirefoxCheckout2();

			}
			
			shoppingcartPage.removeAllItemsfromShoppingCart();*/
			
			waitTime(2);

			driver.navigate().to(ExecutionURL);

			waitTime(2);

			CurrentURL = driver.getCurrentUrl();

			if (CurrentURL.equalsIgnoreCase(ExecutionURL)) {

				testStepPassed("It navigated back to the correct execution URL");

			}

			else {

				testStepFailed("It navigated back to the wrong URL");

			}

			testStepInfo("Home Page Visual Search Ends Here");

			testStepInfo("");








				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				
				
				

				testStepInfo("");

				testStepInfo("PGP Visual Search Starts Here");

				if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {

					visualSearchProduct(retrieve("SearchProduct"));

				} 
				else {

					visualSearchProduct(retrieve("SkuID"));
				}

				waitTime(2);

				homePage.CheckingVisualSearchPanelisDisplayedandGettingTitleNames();

				testStepInfo("PGP Visual Search Ends Here");

				testStepInfo("");
				
				
				


				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

		



			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();




			testStepInfo("");

			testStepInfo("PDP Visual Search Starts Here");
			
			if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) 
			{

				visualSearchProduct(retrieve("SearchProduct"));

			} 
			else 
			{

				visualSearchProduct(retrieve("SkuID"));
			}

			waitTime(2);

			homePage.CheckingVisualSearchPanelisDisplayedandGettingTitleNames();

			testStepInfo("PDP Visual Search Ends Here");

			testStepInfo("");

			//public static final String suggestedSearchesProductLink = "Suggested Searches First Product link#xpath=(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a)[1]";
			//clickOn(suggestedSearchesProductLink);
			
			productDescriptionPage.suggestedSearchesProductLink();
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();
			
			

		/*	if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else {

				//viewshoppingbag();
				clickonChromeFirefoxCheckout2();

			}
			
			
			waitTime(2);
			
			shoppingcartPage.removeAllItemsfromShoppingCart();
			*/
			
			
			/*waitTime(3);
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}

			else if (browser.equalsIgnoreCase("Safari")) {

				shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();

			}

			else {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			
			
			clickOnEmptyShoppingBag();*/
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}
			
			waitTime(3);
			
			shoppingcartPage.removeAllItemsfromShoppingCart();
			
			
			testStepInfo("");

			testStepInfo("Shopping Cart Page Visual Search Starts Here");
			
			if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {

				visualSearchProduct(retrieve("SearchProduct"));

			} 
			else {

				visualSearchProduct(retrieve("SkuID"));
			}

			waitTime(2);

			homePage.CheckingVisualSearchPanelisDisplayedandGettingTitleNames();

			testStepInfo("Shopping Cart Page Visual Search Ends Here");

			testStepInfo("");
			
			
			
			
			homePage.ClickonHomePageLogo();

			
			waitTime(2);
			
			searchProductnew(retrieve("SearchZeroResultsProduct"));

			verifyZeroSearchResultsPageisDisplayed();
			
			
			
			
			testStepInfo("");

			testStepInfo("Zero Search Results Page Visual Search Starts Here");
			
			if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {

				ZerosearchProduct(retrieve("SearchProduct"));

			} 
			else {

				ZerosearchProduct(retrieve("SkuID"));
			}

			waitTime(2);

			homePage.CheckingVisualSearchPanelisDisplayedandGettingTitleNames();

			testStepInfo("Zero Search Results Page Visual Search Ends Here");

			testStepInfo("");
			
			
			
			
			
			homePage.ClickonHomePageLogo();
			
			waitTime(3);
			
			getURLandPostJunkDatainURL();
			
			verify404PageisDisplayed();
			
			
			
			
			testStepInfo("");

			testStepInfo("404 Page Visual Search Starts Here");
			
			if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {

				visualSearchProduct(retrieve("SearchProduct"));

			} 
			else {

				visualSearchProduct(retrieve("SkuID"));
			}

			waitTime(2);

			homePage.CheckingVisualSearchPanelisDisplayedandGettingTitleNames();

			testStepInfo("404 Page Visual Search Ends Here");

			testStepInfo("");
			
			
			
			
			
			homePage.ClickonHomePageLogo();
			
			waitTime(2);
			
			clickOnFindStoreorEditStoreLink();
			
			storeLocatorPage.verifyFindStorepageisDisplayed();
			
			
			
			
			
			testStepInfo("");
			
			testStepInfo("Store Locator page Visual Search Starts Here");
			
			if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {

				visualSearchProduct(retrieve("SearchProduct"));

			} 
			else {

				visualSearchProduct(retrieve("SkuID"));
			}

			waitTime(2);
			
			homePage.CheckingVisualSearchPanelisDisplayedandGettingTitleNames();
			
			testStepInfo("Store Locator page Visual Search Ends Here");
			
			testStepInfo("");
			
			
			
			
			
			homePage.ClickonHomePageLogo();
			
			waitTime(2);
//
//			signInToApp(retrieve("UserName"),retrieve("Password"));
//			
//			waitTime(3);
//			
//			myAccountPage.verifyAccountDashBoardPageisDisplayed();
//			
//			
//			
//			
//			
//			
//			testStepInfo("");
//			
//			testStepInfo("Account Dashboard Page Visual Search Starts Here");
//			
//			if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {
//
//				visualSearchProduct(retrieve("SearchProduct"));
//
//			} 
//			else {
//
//				visualSearchProduct(retrieve("SkuID"));
//			}
//
//			waitTime(2);
//			
//			homePage.CheckingVisualSearchPanelisDisplayedandGettingTitleNames();
//			
//			testStepInfo("Account Dashboard Page Visual Search Ends Here");
//			
//			testStepInfo("");
//
//			
//			
//			homePage.ClickonHomePageLogo();
//			
//			
//			
//			
//			
//			if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
//				
//				homePage.ClickonSignoutinHeaderlinkgreetinglink();
//				
//			} 
//			
//			else if (browser.equalsIgnoreCase("Safari")) {
//				
//				homePage.ClickonSafariSignOutlink();
//			}
//			
//			else {
//				
//				homePage.ClickonIESignoutinHeaderlinkgreetinglink();
//			}
//
//			homePage.verifyUserLoggedOutSuccessfully();


		} 



		catch (Exception e) 
		{
			testStepFailed("Exception occured: " + e);
		} 

		finally 
		{
			if (checkoutPage.testCaseExecutionStatus || departmentNavigation.testCaseExecutionStatus
					|| myAccountAddressBookPage.testCaseExecutionStatus
					|| myAccountOrderHistoryPage.testCaseExecutionStatus || myAccountPage.testCaseExecutionStatus
					|| myAccountPayMentmethodsPage.testCaseExecutionStatus
					|| productDescriptionPage.testCaseExecutionStatus || productGridPage.testCaseExecutionStatus
					|| shoppingcartPage.testCaseExecutionStatus || orderConfirmationPage.testCaseExecutionStatus
					|| myAccountOrderDetailPage.testCaseExecutionStatus
					|| myAccountPaymentMethodsPage.testCaseExecutionStatus || homePage.testCaseExecutionStatus) {
				this.testCaseExecutionStatus = true;
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