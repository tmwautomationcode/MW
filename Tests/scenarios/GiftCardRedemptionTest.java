package scenarios;

import mwPages.CheckOutPage;
//import mwPages.DepartmentNavigation;
import mwPages.MyAccountAddressBookPage;
import mwPages.MyAccountPage;
import mwPages.MyAccountPaymentMethodsPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.HomePage;
import mwPages.DepartmentNavigation;



public class GiftCardRedemptionTest extends PopupWindows{

	private BaseClass obj;

	private ProductGridPage productGridPage;
	private ProductDescriptionPage productDescriptionPage;
	private OrderConfirmationPage orderConfirmationPage;
	private CheckOutPage checkoutPage;
	private ShoppingCartPage shoppingcartPage;
	private MyAccountPage myAccountPage;
	private MyAccountAddressBookPage myAccountAddressBookPage;
	private MyAccountPaymentMethodsPage myAccountPaymentMethodsPage;
	private HomePage homePage;
	private DepartmentNavigation departmentNavigation;


	public GiftCardRedemptionTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		myAccountPage = new	MyAccountPage(obj);
		myAccountAddressBookPage = new	MyAccountAddressBookPage(obj);
		myAccountPaymentMethodsPage = new	MyAccountPaymentMethodsPage(obj);
		homePage= new HomePage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);

	}


	public void destroyObjects(){


		checkoutPage = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		myAccountPage = null;
		myAccountAddressBookPage = null;
		myAccountPaymentMethodsPage = null;
		homePage= null;
		departmentNavigation = null;

	}

	public void GiftCardRedemptionTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{
			//1.Open Site
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			
			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {

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

			
			
			
			
			
			waitTime(1);
			
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


			//shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			//homePage.ClickonHomePageLogo();
			
			
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				if (browser.equalsIgnoreCase("Safari")) 
				{
					//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
					
					departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				} 

				else 
				{
					searchProductnew(retrieve("SearchProduct"));
				}
				

				productGridPage.verifyProductGridPageListedProducts();
				
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				productGridPage.selectSortFilterinPGPPage(retrieve("PGPPageSortByFilter"));
				
				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

			}

			else
			{
				searchProductnew(retrieve("SkuID"));
				
				//productDescriptionPage.verifyProductDescriptionPage();
			}

			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//productDescriptionPage.clickHomePageLogoinPDPPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.clickonIECheckoutonHomepageMiniBagwithCountforRegisteredUser();

			} 
			else 
			{

				viewshoppingbag();
				
				shoppingcartPage.clickOnCheckoutButtonregistereduser();
				
				//clickonChromeFirefoxCheckout();

			}		
			
			checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkoutPage.clickShippingContinue();
			
			
			
			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

			checkoutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
			
			checkoutPage.clickPaymentContinue();
			
			checkoutPage.GetOrderSummaryTotalBeforeGiftCardReedemtion();

			checkoutPage.checkGiftCardNumberPinNoisDisplayedinReviewTab();

			checkoutPage.fillGiftCardReedemtionGiftCarddetailsinReviewTab(retrieve("GiftCardNo"), retrieve("GiftCardPin"));

			checkoutPage.clickGiftCardReedemtionGiftCardApplyinReviewTab();
			
			//checkoutPage.VerifyGiftCardReedemed();
			
			checkoutPage.GetGiftCardReedemedAmount();
			
			checkoutPage.GetOrderSummaryTotalAfterGiftCardReedemtion();
			
			checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTabSafari();
			
			//checkoutPage.EnterSavedCvvinReviewTab_new(retrieve("CreditCardCvv"));

			if(checkoutPage.clickPlaceOrderButton())
			{
				
				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();
				
				orderConfirmationPage.getOrderNumber();
				
				checkoutPage.clickOrderConfirmationPageApplicationLogo();
				
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
				waitTime(4);
				if (browser.equalsIgnoreCase("InternetExplorer")) {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

				}
				
				else if (browser.equalsIgnoreCase("Safari")) {
					shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
				}
				
				
				else {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}
				homePage.ClickonHomePageLogo();
				
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































			/*continueShoppingPopupClose();
			verifyUSFlagSelected();

			//2.Sign In using a existing user
			signInToApp(retrieve("UserName"),retrieve("Password"));
			shoppingcartPage.emptyTheProductsInCart();
			clickOnAccountInformation();
			myAccountPage.clickOnAddressBookInMyAccountPage();
			if(myAccountAddressBookPage.isAddressDetailAvailableInMyAccountPaymentMethodsPage()){
				myAccountAddressBookPage.removeAllAddressInAddressBookPage();
			}	
			myAccountPage.clickOnPaymentMethodsInMyAccountPage();
			if(myAccountPaymentMethodsPage.isPaymentDetailAvailableInMyAccountPaymentMethodsPage()){
				myAccountPaymentMethodsPage.removeAllCardDetailsInMyAccountPaymentMethodsPage();				
			}
			clickOnCart();
			shoppingcartPage.emptyTheProductsInCart();

			//3.Search for a Product
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")){
				searchProduct(retrieve("Product"));
				waitTime(8);
				try{
					if(isAlertWindowPresent()){
						alertOk();
					}
				}
				catch(Exception e){
					testStepFailed("Exception Occured:"+e);
				}
				waitTime(8);
				productGridPage.selectProductInProductGridPage(retrieve("ProductOne"));
			}else searchProduct(retrieve("SkuID"));


			//4.Add product to cart
			productDescriptionPage.clickOnAddToCartFromProductDescriptionPage();

			//5.Checkout to Shopping Cart
			productDescriptionPage.clickOnCart();

			//6.Checkout from Shopping Cart
			//shoppingcartPage.clickOnCheckout();
			shoppingcartPage.clickOnCheckoutButton();

			//7.Make the complete payment using the gift card present with the user
			checkoutPage.fillShippingDetails(retrieve("FirstName"),retrieve("LastName"),retrieve("Address"),retrieve("City"),retrieve("State"),retrieve("ZipCode"),retrieve("PhoneNo"));
			checkoutPage.clickOnContinueShippingButtonFromCheckOutPage();

			checkoutPage.clickOnAddaGiftCardFromCheckOutPage();
			checkoutPage.fillAddaGiftCardDetailFromCheckOutPage(retrieve("cardnumber"),retrieve("pinnumber"));
			checkoutPage.clickOnApplyFromCheckOutPage();
			checkoutPage.fillCreditCardDetails(retrieve("CardType"), retrieve("CardNumber"), retrieve("CardCvv"), retrieve("CardExpireMonth"), retrieve("CardExpireYear"));

			checkoutPage.clickOnSameAsShippingCheckBoxFromCheckOutPage();
			checkoutPage.clickOnContinueFromBillingInCheckOutPage();

			//8.Place order
			if(checkoutPage.clickOnPlaceOrder()){
				orderConfirmationPage.getOrderNumber();
			}else{
				clickOnMensWearhouseLogo();
				clickOnCart();
				shoppingcartPage.emptyTheProductsInCart();
			}*/
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
		finally{
			if(checkoutPage.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					myAccountPage.testCaseExecutionStatus ||
					myAccountAddressBookPage.testCaseExecutionStatus ||
					myAccountPaymentMethodsPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus ){
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