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
import mwPages.MyAccountPage;

public class RegistrationOnPaymentsPageTest extends PopupWindows{

	private BaseClass obj;

	private OrderConfirmationPage orderConfirmationPage;
	private CheckOutPage checkoutPage;
	private ShoppingCartPage shoppingcartPage;
	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private HomePage homePage;
	private MyAccountPage myaccountpage;

	private	String dynamicUsername=null,username=null;

	public RegistrationOnPaymentsPageTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);
		myaccountpage= new MyAccountPage(obj);
	}




	public void destroyObjects(){
		checkoutPage = null;
		departmentNavigation = null;;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage= null;
		myaccountpage= null;
	}


	public void RegistrationOnPaymentsPageTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{
			
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

/*
			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) 
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

			//clickOnBackToTopLinkInFooter();
			
			homePage.ClickonHomePageLogo();
			
			waitTime(4);

			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}
			
			
			
			

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
				
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			}
			else
			{
				searchProductnew(retrieve("SkuID"));
				
				waitTime(3);

				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

				//productDescriptionPage.getProductNameInProductDescriptionPage();
			}

			//productDescriptionPage.selectProductSizeinPDPPage(retrieve("Productsize"));

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//productDescriptionPage.clickHomePageLogoinPDPPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else {

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}

			//shoppingcartPage.clickBackToTopButton();
			
			shoppingcartPage.VerifyOrderTotalinShoppingBagPage();

			shoppingcartPage.clickCheckoutasGuestToggle();



			username=retrieve("GuestEmail");
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			System.out.println("The random email: "+dynamicUsername);



			//shoppingcartPage.clickBackToTopButton();

			//shoppingcartPage.fillEmailCheckoutasGuest(dynamicUsername);

			//shoppingcartPage.clickBackToTopButton();

			//shoppingcartPage.clickCheckoutasGuestButton();
			
			checkoutPage.VerifyOrderTotalinCheckoutPageShippingTab();
			
			checkoutPage.clickShipToStoreTab();
			
			checkoutPage.fillStoreAdrressDetails(retrieve("StoreAddress"));
			
			checkoutPage.clickFindStoreButton();
			
			if(checkoutPage.verifySearchStoreResultsDisplayed())
			{
				
				checkoutPage.selectFirstStoreFromSearchListDisplayed();
				
			}

			//checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkoutPage.clickShippingContinue();
			
			checkoutPage.VerifyOrderTotalinCheckoutPagePaymentTab();
			
			checkoutPage.GetOrderSummaryTotalBeforePromocode();
			
			checkoutPage.fillPromocodeandApply(retrieve("PromocodeNo"));
			
			checkoutPage.GetPromodeReedemedAmount();
			
			checkoutPage.GetOrderSummaryTotalAfterPromocode();
			
			checkoutPage.VerifyOrderTotalinCheckoutPagePaymentTab();

			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));
            
            checkoutPage.fillpaymentpageemailaddress(dynamicUsername);

			checkoutPage.clickPaymentContinue();
			
			checkoutPage.VerifyOrderTotalinCheckoutPageReviewTab();

			if(checkoutPage.clickPlaceOrderButton())
			{

				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();

				orderConfirmationPage.fillOrderConfirmationPagePasswordDetails(retrieve("Password"), retrieve("ConfirmPassword"));

				orderConfirmationPage.clickOrderConfirmationPageSignUpNowButton();

				myaccountpage.verifyAccountDashBoardPageisDisplayed();

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
				//waitTime(3);

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


			}
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