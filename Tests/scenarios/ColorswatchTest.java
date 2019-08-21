package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.HomePage;
import mwPages.MyAccountPage;
import mwPages.MyAccountPaymentMethodsPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.DepartmentNavigation;


public class ColorswatchTest extends PopupWindows{

	private BaseClass obj;

	private OrderConfirmationPage orderConfirmationPage;
	private DepartmentNavigation departmentNavigation;
	private CheckOutPage checkOutPage;
	private ShoppingCartPage shoppingcartPage;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private MyAccountPage myAccountPage;
	private MyAccountPaymentMethodsPage myAccountPaymentMethodsPage;
	private HomePage homePage;
	private CheckOutPage checkoutPage;

	public ColorswatchTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkOutPage = new CheckOutPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		myAccountPage = new MyAccountPage(obj);
		myAccountPaymentMethodsPage = new MyAccountPaymentMethodsPage(obj);
		orderConfirmationPage = new OrderConfirmationPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		productGridPage = new ProductGridPage(obj);
		shoppingcartPage = new ShoppingCartPage(obj);
		homePage= new HomePage(obj);
		checkoutPage = new	CheckOutPage(obj);
	}

	public void destroyObjects(){


		checkOutPage = null;
		myAccountPage = null;
		myAccountPaymentMethodsPage = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage=null;
		checkoutPage = null;
		departmentNavigation = null;
	}



	public void ColorswatchTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
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

			signInToApp(retrieve("UserName"),retrieve("Password"));
			
			waitTime(3);

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) 
			{
				shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
			}
			
			else 
			{

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}


			//homePage.ClickonHomePageLogo();
			
			
			

			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				if (browser.equalsIgnoreCase("Safari")) 
				{
					//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
					
					departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));
					
					productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				} 
				
				else if (browser.equalsIgnoreCase("Chrome")||(browser.equalsIgnoreCase("Firefox")||(browser.equalsIgnoreCase("InternetExplorer")))) {
					
					searchProductnew(retrieve("SearchProduct"));
					
					productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
					
				}
				
				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

			}
			else
			{			
				searchProductnew(retrieve("SkuID"));
				
				//productDescriptionPage.verifyProductDescriptionPage();
			}

			//productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			productDescriptionPage.verifythecolorswatch();

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//productDescriptionPage.clickHomePageLogoinPDPPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				viewshoppingbag();

				//shoppingcartPage.clickOnCheckoutButtonregistereduser();

				//clickonChromeFirefoxCheckout();

			}


			/*checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkoutPage.clickShippingContinue();

			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

			checkoutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
			
			checkoutPage.clickPaymentContinue();

			checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));

			checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTabSafari();

			if(checkoutPage.clickPlaceOrderButton())
			{
				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();

				checkoutPage.clickOrderConfirmationPageApplicationLogo();
				
				waitTime(3);

				if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
					homePage.ClickonSignoutinHeaderlinkgreetinglink();
				} 
				
				else if (browser.equalsIgnoreCase("Safari")) {
					homePage.ClickonSafariSignOutlink();
				}
				
				else {
					homePage.ClickonIESignoutinHeaderlinkgreetinglink();
				}

				homePage.verifyUserLoggedOutSuccessfully();

			}
			else{

				homePage.ClickonHomePageLogo();
				waitTime(3);
				if (browser.equalsIgnoreCase("InternetExplorer")) {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

				}
				
				else if (browser.equalsIgnoreCase("Safari")) {
					shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
				}
				
				else {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}*/
				
			
			homePage.ClickonHomePageLogo();
				waitTime(3);

				if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
					homePage.ClickonSignoutinHeaderlinkgreetinglink();
				} 
				
				else if (browser.equalsIgnoreCase("Safari")) {
					homePage.ClickonSafariSignOutlink();
				}
				
				else {
					homePage.ClickonIESignoutinHeaderlinkgreetinglink();

				}
				homePage.verifyUserLoggedOutSuccessfully();

			}

	
			catch(Exception e){
			testStepFailed("Failure Description: "+e);
		}finally{
			if(checkOutPage.testCaseExecutionStatus ||
					myAccountPage.testCaseExecutionStatus ||
					myAccountPaymentMethodsPage.testCaseExecutionStatus ||
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
