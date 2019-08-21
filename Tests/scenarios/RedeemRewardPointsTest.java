package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.MyAccountAddressBookPage;
import mwPages.MyAccountPage;
import mwPages.MyAccountPaymentMethodsPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.HomePage;
import mwPages.CreateAccountPage;
import mwPages.DepartmentNavigation;


public class RedeemRewardPointsTest extends PopupWindows{

	private BaseClass obj;
	private CreateAccountPage createAccountPage;
	private OrderConfirmationPage orderConfirmationPage;
	private CheckOutPage checkoutPage;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingcartPage;
	private MyAccountPage myAccountPage;
	private MyAccountAddressBookPage myAccountAddressBookPage;
	private MyAccountPaymentMethodsPage myAccountPaymentMethodsPage;
	private HomePage homePage;
	private PopupWindows popupwindows;
	private DepartmentNavigation departmentNavigation;
	
	
	
	

	private String username=null, dynamicUsername=null;
	

	public RedeemRewardPointsTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		createAccountPage = new	CreateAccountPage(obj);
		checkoutPage = new CheckOutPage(obj);
		orderConfirmationPage = new OrderConfirmationPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		productGridPage = new ProductGridPage(obj);
		shoppingcartPage = new ShoppingCartPage(obj);
		myAccountPage = new MyAccountPage(obj);
		myAccountAddressBookPage = new MyAccountAddressBookPage(obj);
		myAccountPaymentMethodsPage = new MyAccountPaymentMethodsPage(obj);
		homePage= new HomePage(obj);
		popupwindows=new PopupWindows(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
	}


	public void destroyObjects(){
		checkoutPage = null;
		createAccountPage = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		myAccountPage = null;
		myAccountAddressBookPage = null;
		myAccountPaymentMethodsPage = null;
		homePage= null;
		popupwindows=null;
		departmentNavigation = null;
	}

	public void RedeemRewardPointsTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
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

			
			
			
			

			clickOnSignIn();
			popupwindows.clickOnCreateAccount();
			waitTime(2);

			username=retrieve("EmailId");
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			createAccountPage.fillSignUpForm(retrieve("FirstName"), retrieve("LastName"), dynamicUsername, retrieve("Password"), retrieve("PasswordAgain"));
			waitTime(5);

			createAccountPage.clickOnCreateAccountButtonInRegistrationPage();

			myAccountPage.verifyAccountDashBoardPageisDisplayed();

			//homePage.ClickonHomePageLogo();

			/*if (browser.equalsIgnoreCase("InternetExplorer")) {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}
			else {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			homePage.ClickonHomePageLogo();*/

			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				if (browser.equalsIgnoreCase("Safari")) 
				{
					//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
					
					departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));
					
				} 
				
				else if (browser.equalsIgnoreCase("Chrome")||(browser.equalsIgnoreCase("Firefox")||(browser.equalsIgnoreCase("InternetExplorer")))) {
					
					searchProductnew(retrieve("SearchProduct"));
					
				}
				
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				productGridPage.verifyProductGridPageListedProducts();
				
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
				
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

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else {

				viewshoppingbag();

				shoppingcartPage.clickOnCheckoutButtonregistereduser();
				
				//clickonChromeFirefoxCheckout();
			}

			

			checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkoutPage.clickShippingContinue();

			checkoutPage.enterPerfectFitRewardsdetailsandVerifyPFCartificateisApplied(retrieve("PFAccountID"), retrieve("PFCertificateNo"));

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
					shoppingcartPage.testCaseExecutionStatus){
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