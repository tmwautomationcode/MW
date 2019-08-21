package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.ContactUsPage;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.PerfectFitRewardsPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.StoreLocatorPage;
import mwPages.ChatPage;

public class HeaderLinksVerificationTest extends PopupWindows{

	private BaseClass obj;
	private PopupWindows popupWindows;
	private ChatPage chatPage;
	private ProductDescriptionPage productDescriptionPage;
	private DepartmentNavigation departmentNavigation;
	private ProductGridPage productGridPage;
	private HomePage homePage;
	private ShoppingCartPage shoppingcartPage;
	private PerfectFitRewardsPage perfectfitRewardsPage;
	private ContactUsPage contactUsPage;
	private StoreLocatorPage storeLocatorPage;

	
	public HeaderLinksVerificationTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		chatPage = new ChatPage(obj);
		popupWindows=new PopupWindows(obj);
		contactUsPage = new	ContactUsPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		homePage = new	HomePage(obj);
		perfectfitRewardsPage = new	PerfectFitRewardsPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		storeLocatorPage = new	StoreLocatorPage(obj);
	}

	
	public void destroyObjects(){
		
		contactUsPage = null;
		departmentNavigation = null;
		homePage = null;
		perfectfitRewardsPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		storeLocatorPage = null;
		popupWindows=null;
	}
	
	
	public void headerLinksVerificationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{
			
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			
			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) 
			{
				
				getJSESSIONIDOnceBrowserInitiated();
				
				getCLONEIDOnceBrowserInitiated();
				
			}*/

			
			String parentWindowHandle = driver.getWindowHandle();
			
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


			clickOnSignIn();
			
			popupWindows.verifySignInOverLay();
			
			popupWindows.closeSignInOverlay();

			
			clickOnFindaStore();

			storeLocatorPage.verifyStoreLocatorPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEContactUsHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				clickonSafariContactUsHeaderLink();
			}
			
			else {

				clickOnContactUsHeaderLink_new();

			}
			
			contactUsPage.verifyContactUsPage();
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEChatHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
			
				clickonSafariChatHeaderLink();
				
			}
			
			else {

				clickOnChatHeaderLink_new();

			}
			
			chatPage.verifyChatPage();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				URLNavigateBack();

			}
			
			else {
				
				switchToWindowUsingWindowHandle(parentWindowHandle);
				
			}
				
			
			/*if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEEmailUsHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				clickonSafariEmailHeaderLink();
			}
			
			else {

				clickOnEmailHeaderLink_new();

			}*/
			
			contactUsPage.verifyContactUsPage();
			
			homePage.ClickonHomePageLogo();
			
			
			
			
			
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				clickOnSignIn();
				
				popupWindows.verifySignInOverLay();
				
				popupWindows.closeSignInOverlay();

				
				clickOnFindaStore();

				storeLocatorPage.verifyStoreLocatorPage();

				if (browser.equalsIgnoreCase("InternetExplorer")) 
				{

					ClickonIEContactUsHeaderLink_new();

				}
				
				else if (browser.equalsIgnoreCase("Safari")) {
					
					clickonSafariContactUsHeaderLink();
				}
				
				else {

					clickOnContactUsHeaderLink_new();

				}
				
				contactUsPage.verifyContactUsPage();
				
				
				if (browser.equalsIgnoreCase("InternetExplorer")) {

					ClickonIEChatHeaderLink_new();

				}
				
				else if (browser.equalsIgnoreCase("Safari")) {
				
					clickonSafariChatHeaderLink();
					
				}
				
				else {

					clickOnChatHeaderLink_new();

				}
				
				chatPage.verifyChatPage();
				
				if (browser.equalsIgnoreCase("InternetExplorer")) {

					URLNavigateBack();

				}
				
				else {
					
					switchToWindowUsingWindowHandle(parentWindowHandle);
					
				}
				
				
				
				/*if (browser.equalsIgnoreCase("InternetExplorer")) {

					ClickonIEEmailUsHeaderLink_new();

				}
				
				else if (browser.equalsIgnoreCase("Safari")) {
					
					clickonSafariEmailHeaderLink();
				}
				
				else {

					clickOnEmailHeaderLink_new();

				}*/
				
				contactUsPage.verifyContactUsPage();
				
				homePage.ClickonHomePageLogo();
				
				departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
			}
			
			
			else
			{
				searchProductnew(retrieve("SkuID"));
				
				waitTime(2);
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
				
			}
			
			
			clickOnSignIn();
			
			popupWindows.verifySignInOverLay();
			
			popupWindows.closeSignInOverlay();

			
			clickOnFindaStore();

			storeLocatorPage.verifyStoreLocatorPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEContactUsHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				clickonSafariContactUsHeaderLink();
			}
			
			else {

				clickOnContactUsHeaderLink_new();

			}
			
			contactUsPage.verifyContactUsPage();
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEChatHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
			
				clickonSafariChatHeaderLink();
				
			}
			
			else {

				clickOnChatHeaderLink_new();

			}
			
			chatPage.verifyChatPage();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				URLNavigateBack();

			}
			
			else {
				
				switchToWindowUsingWindowHandle(parentWindowHandle);
				
			}
			
			
			
			/*if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEEmailUsHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				clickonSafariEmailHeaderLink();
			}
			
			else {

				clickOnEmailHeaderLink_new();

			}*/
			
			contactUsPage.verifyContactUsPage();
			
			homePage.ClickonHomePageLogo();
			
			departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
			
			clickOnSignIn();
			
			popupWindows.verifySignInOverLay();
			
			popupWindows.closeSignInOverlay();

			
			clickOnFindaStore();

			storeLocatorPage.verifyStoreLocatorPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEContactUsHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				clickonSafariContactUsHeaderLink();
			}
			
			else {

				clickOnContactUsHeaderLink_new();

			}
			
			contactUsPage.verifyContactUsPage();
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEChatHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
			
				clickonSafariChatHeaderLink();
				
			}
			
			else {

				clickOnChatHeaderLink_new();

			}
			
			chatPage.verifyChatPage();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				URLNavigateBack();

			}
			
			else {
				
				switchToWindowUsingWindowHandle(parentWindowHandle);
				
			}
			
			
			
			/*if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEEmailUsHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				clickonSafariEmailHeaderLink();
			}
			
			else {

				clickOnEmailHeaderLink_new();

			}*/
			
			contactUsPage.verifyContactUsPage();
			
			homePage.ClickonHomePageLogo();
			
			departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickOnAddToShoppingBagFromProductDescriptionPage();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else {

				clickonChromeFirefoxCheckout();

			}
			
			clickOnSignIn();
			
			popupWindows.verifySignInOverLay();
			
			popupWindows.closeSignInOverlay();

			
			clickOnFindaStore();

			storeLocatorPage.verifyStoreLocatorPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEContactUsHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				clickonSafariContactUsHeaderLink();
			}
			
			else {

				clickOnContactUsHeaderLink_new();

			}
			
			contactUsPage.verifyContactUsPage();
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEChatHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
			
				clickonSafariChatHeaderLink();
				
			}
			
			else {

				clickOnChatHeaderLink_new();

			}
			
			chatPage.verifyChatPage();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				URLNavigateBack();

			}
			
			else {
				
				switchToWindowUsingWindowHandle(parentWindowHandle);
				
			}
			
			
			
			/*if (browser.equalsIgnoreCase("InternetExplorer")) {

				ClickonIEEmailUsHeaderLink_new();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				clickonSafariEmailHeaderLink();
			}
			
			else {

				clickOnEmailHeaderLink_new();

			}*/
			
			contactUsPage.verifyContactUsPage();
			
			homePage.ClickonHomePageLogo();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else {

				clickonChromeFirefoxCheckout();

			}
			
			shoppingcartPage.removeAllItemsfromShoppingCart();
			
			homePage.ClickonHomePageLogo();
			

		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		finally
		{
			if(contactUsPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus ||
					homePage.testCaseExecutionStatus ||
					perfectfitRewardsPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus ||
					storeLocatorPage.testCaseExecutionStatus ){
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

	//3.Click on the header links which are mentioned below:- Contact Us, Find Store, International Shipping, Sign In, MW Recommendations, Perfect Fit Rewards Points, Cart
	//4.Verify each and every landing page for the above headers and check that they do not give a 404 error page.

	public void checkHeaderLinksAndVerifyLandingPage(){

		//1.Contact Us
		clickOnContactUs();
		contactUsPage.verifyContactUsPage();
		verify404ErrorPage();
		clickOnBackButton();

		//2.Find Store
		clickOnFindaStore();
		storeLocatorPage.verifyStoreLocatorPage_New();
		verify404ErrorPage();
		clickOnBackButton();

		//3.International Shipping- This is not present in header.

		/*	clickOnInternationalShippingLink();
		verifyInternationalShippingPoup();
		verify404ErrorPage();
		closeInternationalShippingPoup();*/

		//4.Sign In
		clickOnSignIn();
		verifySignInOverLay();
		verify404ErrorPage();
		signIn(retrieve("Username"),retrieve("Password"));


		//5.MW Recommendations - This is not present in header even before/after signing in.
		//6.Perfect Fit Rewards Points		
		waitTime(5);
		clickOnPerfectFitRewardsInHeader();
		perfectfitRewardsPage.verifyPerfectFitRewardsPage();
		verify404ErrorPage();
		clickOnBackButton();

		//7.Cart
		openShoppingCartPage();
		shoppingcartPage.verifyShoppingCartPage();
		verify404ErrorPage();
		clickOnSignOut();
		/*refreshPage();
		homePage.verifyHomePage();
		waitTime(10);*/
	}
}