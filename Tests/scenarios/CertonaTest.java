package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.QuickViewPopup;
import mwPages.StoreLocatorPage;
import mwPages.ZeroResultsPage;

public class CertonaTest extends PopupWindows{

	private BaseClass obj;

	private OrderConfirmationPage orderConfirmationPage;
	private QuickViewPopup quickViewPopup;
	private CheckOutPage checkoutPage;
	private ShoppingCartPage shoppingcartPage;
	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private HomePage homePage;
	private StoreLocatorPage storeLocatorPage;
	private ZeroResultsPage zeroResultsPage;

	private	String dynamicUsername=null,username=null;

	public CertonaTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		quickViewPopup = new QuickViewPopup(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);
		storeLocatorPage = new StoreLocatorPage(obj);
		zeroResultsPage = new ZeroResultsPage(obj);
	}




	public void destroyObjects(){
		checkoutPage = null;
		departmentNavigation = null;
		quickViewPopup = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage= null;
		storeLocatorPage = null;
		zeroResultsPage = null;
	}


	public void CertonaTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{


			testStepInfo("");
			testStepInfo("Opening "+browser+" browser and hitting the Url");
			testStepInfo("**************************************************************");
			
			
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);


			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
				
				getJSESSIONIDOnceBrowserInitiated();
				
				getCLONEIDOnceBrowserInitiated();
				
			}
			
			


			if (browser.equalsIgnoreCase("Safari")) 
			{
				verifySafariUSFlagSelected();
				waitTime(5);
			} 

			else 
			{
				verifyUSFlagSelected();
			}

			clickOnBackToTopLinkInFooter();
			
			homePage.ClickonHomePageLogo();
			

			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}

			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}
			else {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			homePage.ClickonHomePageLogo();
			
			
			testStepInfo("");
			
			testStepInfo("Home Page Certona Starts Here");
			
			homePage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
			
			//homePage.verifyCertonaisDisplayedandGetthenames();
			
			testStepInfo("Home Page Certona Ends Here");
			
			testStepInfo("");

			
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				
				testStepInfo("");
				
				testStepInfo("PGP Certona Starts Here");
				
				productGridPage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
				
				//productGridPage.verifyCertonaisDisplayedandGetthenames();
				
				testStepInfo("PGP Certona Ends Here");
				
				testStepInfo("");
				
				
				productGridPage.clickOnQuickViewFromProductGridPage(retrieve("ProductName"));
				
				quickViewPopup.verifyQVPopupisDisplayed();
				
				
				
				testStepInfo("");
				
				testStepInfo("QV Certona Starts Here");
				
				quickViewPopup.verifyCertonaisDisplayedandGetthenames();
				
				testStepInfo("QV Certona Ends Here");
				
				testStepInfo("");
				
				
				
				quickViewPopup.clickOnViewProductDescription();

				//productGridPage.selectProductInProductGridPage(retrieve("ProductOne"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
				
				
				
				
				testStepInfo("");
				
				testStepInfo("PDP Certona Starts Here");
				
				productDescriptionPage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
				
				//productDescriptionPage.verifyCertonaisDisplayedinandGetthenames();
				
				testStepInfo("PDP Certona Ends Here");
				
				testStepInfo("");
				
				
				
			}
			else
			{
				searchProduct(retrieve("SkuID"));
				//waitTime(5);

				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

				productDescriptionPage.getProductNameInProductDescriptionPage();
				
				productDescriptionPage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
				
				testStepInfo("");
				
				testStepInfo("PDP Certona Starts Here");
				
				
				
				//productDescriptionPage.verifyCertonaisDisplayedinandGetthenames();
				
				testStepInfo("PDP Certona Ends Here");
				
				testStepInfo("");
				
			}
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {
				

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}
			
			

			testStepInfo("");
			
			testStepInfo("Shopping Cart Page Certona Starts Here");
			
			shoppingcartPage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
			
			//shoppingcartPage.verifyCertonaisDisplayedinandGetthenames();
			
			testStepInfo("Shopping Cart Page Certona Ends Here");
			
			testStepInfo("");	
			
			/*shoppingcartPage.clickBackToTopButton();
			
			shoppingcartPage.removeItemsfromShoppingCarttoCountOne();*/
			
			/*shoppingcartPage.removeAllItemsfromShoppingCart2();
			
			shoppingcartPage.removeAllItemsfromShoppingCart2();*/
			
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}
			else 
			{

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			
			//homePage.ClickonHomePageLogo();
			
			departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));

			productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
			
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
			
			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
			
			productDescriptionPage.clickPDPAddtoShoppingBagButton();
			
			productDescriptionPage.clickHomePageLogoinPDPPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}
					
			//shoppingcartPage.clickBackToTopButton();
			
			waitTime(3);
			
			shoppingcartPage.VerifyOrderTotalinShoppingBagPage();

			shoppingcartPage.clickCheckoutasGuestToggle();

			
			username=retrieve("GuestEmail");
			
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			
			System.out.println("The random email: "+dynamicUsername);



			//shoppingcartPage.clickBackToTopButton();

			shoppingcartPage.fillEmailCheckoutasGuest(dynamicUsername);

			//shoppingcartPage.clickBackToTopButton();

			//shoppingcartPage.clickCheckoutasGuestButton();
			


			checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkoutPage.clickShippingContinue();
			
			//checkoutPage.VerifyOrderTotalinCheckoutPagePaymentTab();
			
			/*checkoutPage.GetOrderSummaryTotalBeforePromocode();
			
			checkoutPage.fillPromocodeandApply(retrieve("PromocodeNo"));
			
			checkoutPage.GetPromodeReedemedAmount();
			
			checkoutPage.GetOrderSummaryTotalAfterPromocode();
			
			checkoutPage.VerifyOrderTotalinCheckoutPagePaymentTab();*/

			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

			checkoutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
			
			checkoutPage.clickPaymentContinue();
			
			//checkoutPage.VerifyOrderTotalinCheckoutPageReviewTab();

			if(checkoutPage.clickPlaceOrderButton())
			{

				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();
				
				
				testStepInfo("");
				
				testStepInfo("Order Confirmation Page Certona Starts Here");
				
				orderConfirmationPage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
				
				//orderConfirmationPage.verifyCertonaisDisplayedinandGetthenames();
				
				testStepInfo("Order Confirmation Page Certona Ends Here");
				
				testStepInfo("");
				
				//checkoutPage.clickOrderConfirmationPageApplicationLogo();

				homePage.ClickonCheckOutHomePageLogo();

			}
			else{
				homePage.ClickonCheckOutHomePageLogo();
				//waitTime(3);

				/*if (browser.equalsIgnoreCase("InternetExplorer")) {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

				}
				else {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}
				homePage.ClickonHomePageLogo();*/
			}

			searchProductnew(retrieve("SearchProduct"));

			verifyZeroSearchResultsPageisDisplayed();
			
			
			testStepInfo("");
			
			testStepInfo("Zero Search Results Page Certona Starts Here");
			
			zeroResultsPage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
			
			//homePage.verifyCertonaisDisplayedandGetthenames();
			
			testStepInfo("Zero Search Results Page Certona Ends Here");
			
			testStepInfo("");


			homePage.ClickonHomePageLogo();
			
			waitTime(3);
			
			getURLandPostJunkDatainURL();
			
			verify404PageisDisplayed();
			
			testStepInfo("");
			
			testStepInfo("404 Page Certona Starts Here");
			
			zeroResultsPage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
			
			//homePage.verifyCertonaisDisplayedandGetthenames();
			
			testStepInfo("404 Page Certona Ends Here");
			
			testStepInfo("");


			
			homePage.ClickonHomePageLogo();
			
			testStepInfo("");
			
			testStepInfo("Store Locator Certona Starts Here");
			
			//clickOnFindStoreorEditStoreLink();
			clickOnFindStoreLink();
			
			storeLocatorPage.verifyFindStorepageisDisplayed();
			
			storeLocatorPage.verifyCertonaisDisplayedandAddProductthroughQVandPDP(retrieve("ProductSize"));
			
			testStepInfo("Store Locator Certona Ends Here");
			
			homePage.ClickonHomePageLogo();
			

			
		}
		catch(Exception e){
			testStepFailed("Exception Occured:"+e);
		}
		finally{
			if(checkoutPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus){
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