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
import mwPages.PayPalPage;
import mwPages.DepartmentNavigation;



public class RegisteredUserEditBillingDetailsPaypalPlaceOrderTest extends PopupWindows{

	private BaseClass obj;
	private CreateAccountPage createAccountPage;
	private PayPalPage payPalPage;
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
	

	public RegisteredUserEditBillingDetailsPaypalPlaceOrderTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		createAccountPage = new	CreateAccountPage(obj);
		payPalPage = new PayPalPage(obj);
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
		payPalPage = null;
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

	
	String PDPProductName;
	
	public void RegisteredUserEditBillingDetailsPaypalPlaceOrderTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) 
			{
				
				getJSESSIONIDOnceBrowserInitiated();
				
				getCLONEIDOnceBrowserInitiated();
				
			}
			
			
			
			
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
			
			
			
			clickOnSignIn();
			
			popupwindows.clickOnCreateAccount();
			
			//waitTime(3);

			username=retrieve("EmailId");
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			
			createAccountPage.fillSignUpForm(retrieve("FirstName"), retrieve("LastName"), dynamicUsername, retrieve("Password"), retrieve("PasswordAgain"));
			
			//waitTime(3);

			createAccountPage.clickOnCreateAccountButtonInRegistrationPage();

			waitTime(3);
			
			myAccountPage.verifyAccountDashBoardPageisDisplayed();
			
			//clickOnBackToTopLinkInFooter();
			
			myAccountPage.clickOnAddressBookLink();

			myAccountPage.clickOnAddressBook_AddNewAddressButton();
			
					
			

			myAccountPage.fillDetails_AddressBook_AddNewAddress1(retrieve("AccountDashboard_ShippingAddr_FirstName"), retrieve("AccountDashboard_ShippingAddr_LastName"), retrieve("AccountDashboard_ShippingAddr_Address"), retrieve("AccountDashboard_ShippingAddr_City"));

			myAccountPage.select_AddressBook_AddNewAddress_State(retrieve("AccountDashboard_ShippingAddr_State"));

			myAccountPage.fillDetails_AddressBook_AddNewAddress2(retrieve("AccountDashboard_ShippingAddr_Zip"), retrieve("AccountDashboard_ShippingAddr_Telephone"));

			myAccountPage.clickOnAddressBook_AddNewAddress_SubmitButton();
			
			//clickOnBackToTopLinkInFooter();
			
			//myAccountPage.SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue();
			
			myAccountPage.verify_AddressBook_NewAddress_Saved_MessageandClose();
			
			//clickOnBackToTopLinkInFooter();
			
			myAccountPage.clickOnAddressBook_MakeDefault_Link();
			
			
			
			
			
			
			
			
			String AccountDashboardShipppingAddressFirstName = myAccountPage.getShipppingAddressFirstName();
			
			testStepPassed("AccountDashboardShipppingAddressFirstName : "+AccountDashboardShipppingAddressFirstName);
			
			String AccountDashboardShipppingAddressLastName = myAccountPage.getShipppingAddressLastName();
			
			testStepPassed("AccountDashboardShipppingAddressLastName : "+AccountDashboardShipppingAddressLastName);
			
			String AccountDashboardShipppingAddressStreet = myAccountPage.getShipppingAddressStreet();
			
			testStepPassed("AccountDashboardShipppingAddressStreet : "+AccountDashboardShipppingAddressStreet);
			
			String AccountDashboardShipppingAddressCity = myAccountPage.getShipppingAddressCity();
			
			testStepPassed("AccountDashboardShipppingAddressCity : "+AccountDashboardShipppingAddressCity);
			
			String AccountDashboardShipppingAddressState = myAccountPage.getShipppingAddressState();
			
			testStepPassed("AccountDashboardShipppingAddressState : "+AccountDashboardShipppingAddressState);
			
			String AccountDashboardShipppingAddressZip = myAccountPage.getShipppingAddressZip();
			
			testStepPassed("AccountDashboardShipppingAddressZip : "+AccountDashboardShipppingAddressZip);
			
			String AccountDashboardShipppingAddressPhone = myAccountPage.getShipppingAddressPhone();
			
			testStepPassed("AccountDashboardShipppingAddressPhone : "+AccountDashboardShipppingAddressPhone);

			
			
			
			
			//String ShippingAddress = myAccountPage.getAddressFromAddressBook();
			
			myAccountPage.clickOnAccountInfoLink();
			
			myAccountPage.clickOnAccountInfo_PaymentMethodsLink();
			
			//clickOnBackToTopLinkInFooter();

			myAccountPage.clickOnAccountInfo_PaymentMethods_AddNewPaymentMethod_Button();

			myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardType(retrieve("AccountDashboard_PaymentDetails_CardType"));

			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardNo(retrieve("AccountDashboard_PaymentDetails_CardNo"));

			myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardMonth(retrieve("AccountDashboard_PaymentDetails_CardExpiryMonth"));

			myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardExpiryYear(retrieve("AccountDashboard_PaymentDetails_CardExpiryYear"));

			//myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address(retrieve("Payment_Address"));
			
			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_FirstName(retrieve("AccountDashboard_PaymentDetails_FirstName"));

			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_LastName(retrieve("AccountDashboard_PaymentDetails_LastName"));

			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address1(retrieve("AccountDashboard_PaymentDetails_Address"));

			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_City(retrieve("AccountDashboard_PaymentDetails_City"));

			myAccountPage.Select_AccountInfo_PaymentMethods_AddNewPaymentMethod_State(retrieve("AccountDashboard_PaymentDetails_State"));

			myAccountPage.txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Zip(retrieve("AccountDashboard_PaymentDetails_Zip"));

			myAccountPage.txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_PhoneNo(retrieve("AccountDashboard_PaymentDetails_Telephone"));
			
			myAccountPage.clickOnAccountInfo_PaymentMethods_AddNewPaymentMethod_SaveButton();
			
			//clickOnBackToTopLinkInFooter();

			myAccountPage.verify_AccountInfo_PaymentMethods_Savedchanges_MessageandClose();
			
			//clickOnBackToTopLinkInFooter();
			
			myAccountPage.clickOnPayment_MakeDefault_Link();
			
			//String billingInfo = myAccountPage.getBillingInfoFromAccountInfo();
			
			
			
			
			
			
			String AccountDashboardPaymentDetailsCardType = myAccountPage.getPaymentDetailsCardType();
			
			testStepPassed("AccountDashboardPaymentDetailsCardType : "+AccountDashboardPaymentDetailsCardType);
			
			String AccountDashboardPaymentDetailsCardNo = myAccountPage.getPaymentDetailsCardNo();
			
			testStepPassed("AccountDashboardPaymentDetailsCardNo : "+AccountDashboardPaymentDetailsCardNo);
			
			String AccountDashboardPaymentDetailsCardMonthYear = myAccountPage.getPaymentDetailsCardExpiryMonthYear();
			
			testStepPassed("AccountDashboardPaymentDetailsCardMonthYear : "+AccountDashboardPaymentDetailsCardMonthYear);

			
			
			//homePage.ClickonHomePageLogo();
			
				
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
				
				PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();
				
			}
			else
			{
					searchProductnew(retrieve("SkuID"));
					
					waitTime(3);
				

				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

				PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();
			}

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				viewshoppingbag();
				shoppingcartPage.clickOnCheckoutButtonregistereduser();
				//clickonChromeFirefoxCheckout();

			}
			
			

			
			checkoutPage.VerifyReviewTab();
			
			
			String ReviewTabProductName = checkoutPage.getReviewTabProductName();
			
			testStepPassed("ReviewTabProductName : "+ReviewTabProductName);
			
			if (PDPProductName.equalsIgnoreCase(ReviewTabProductName)) 
			{
				testStepInfo("Product added to the cart and review tab are same");
			}
			
			else 
			{
				testStepFailed("Product added to the cart and review tab are not same");
			}

			
			
			
			checkoutPage.VerifyOrderDetailsSectionisDisplayedinReviewTab();
						
			checkoutPage.VerifyShippingDetailsSectionisDisplayedinReviewTab();
			
			checkoutPage.VerifyPaymentDetailsSectionisDisplayedinReviewTab();
			
			checkoutPage.VerifyOrderSummaryDetailsSectionisDisplayedinReviewTab();
			
			
			
			
			String ReviewTabPaymentDetailsCardType = checkoutPage.getReviewTabPaymentDetailsCardType();
			
			testStepPassed("ReviewTabPaymentDetailsCardType : "+ReviewTabPaymentDetailsCardType);
			
			String ReviewTabPaymentDetailsCardNo = checkoutPage.getReviewTabPaymentDetailsCardNo();
			
			testStepPassed("ReviewTabPaymentDetailsCardNo : "+ReviewTabPaymentDetailsCardNo);

			String ReviewTabPaymentDetailsCardExpiryDateYear = checkoutPage.getReviewTabPaymentDetailsCardExpiryDateYear();
			
			testStepPassed("ReviewTabPaymentDetailsCardExpiryDateYear : "+ReviewTabPaymentDetailsCardExpiryDateYear);

			
				
			
			checkoutPage.clickEditBillingLinkinReviewTab();
			
			checkoutPage.verifyEditBillingOverlayisDisplayedinReviewTab();
			
			checkoutPage.clickPayPalinEditBillingOverlayinReviewTab();
			
			checkoutPage.clickonContinuePayPalinEditBillingOverlayinReviewTab();
			
			payPalPage.verifyPayPalPage();

			payPalPage.fillSignInPayPalCheckOutPage(retrieve("PayPalUserName"),retrieve("PayPalPassword"));
			
			payPalPage.payPalShippingContinue();
			
			
			
			
			checkoutPage.VerifyReviewTab();
			
			
			String ReviewTabPaymentDetailsPaymentModeAfterChanged = checkoutPage.getReviewTabPaymentDetailsPayPalDetails();
			
			testStepPassed("ReviewTabPaymentDetailsPaymentModeAfterChanged : "+ReviewTabPaymentDetailsPaymentModeAfterChanged);
			
			String ReviewTabPaymentDetailsPaymentPayPalAccountEmailId = checkoutPage.getReviewTabPayPalPaymentAccountEmailId();
			
			testStepPassed("ReviewTabPaymentDetailsPaymentPayPalAccountEmailId : "+ReviewTabPaymentDetailsPaymentPayPalAccountEmailId);

			
			
			if (!ReviewTabPaymentDetailsPaymentModeAfterChanged.equalsIgnoreCase(ReviewTabPaymentDetailsCardType)) 
			{
				if (!ReviewTabPaymentDetailsPaymentPayPalAccountEmailId.equalsIgnoreCase(ReviewTabPaymentDetailsCardNo)) 
				{
					testStepInfo("Payment Mode is Changed from "+ReviewTabPaymentDetailsCardType+" to "+ReviewTabPaymentDetailsPaymentModeAfterChanged);
				}
			}
			
			else 
			{
				testStepFailed("Payment Mode is not Changed");
			}

			
			
			if(checkoutPage.clickPlaceOrderButton())
			{

				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();

				homePage.ClickonCheckOutHomePageLogo();
			}
			else
			{
				homePage.ClickonHomePageLogo();
				waitTime(2);
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



			if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.ClickonSignoutinHeaderlinkgreetinglink();
			} 


			else if (browser.equalsIgnoreCase("Safari")) 
			{
				homePage.ClickonSafariSignOutlink();
			}

			else 
			{
				homePage.ClickonIESignoutinHeaderlinkgreetinglink();
			}

			homePage.verifyUserLoggedOutSuccessfully();

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
/*			popupwindows.verifyUSFlagSelected();
			
			clickOnBackToTopLinkInFooter();
			
			checkPromotionsSignupPopupisdisplayedandclosed();
			
			
			homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();


			waitTime(3);

			clickOnSignIn();
			popupwindows.clickOnCreateAccount();
			waitTime(3);

			username=retrieve("EmailId");
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			createAccountPage.fillSignUpForm(retrieve("FirstName"), retrieve("LastName"), dynamicUsername, retrieve("Password"), retrieve("Password"));
			waitTime(5);

			createAccountPage.clickOnCreateAccountButtonInRegistrationPage();

			myAccountPage.verifyAccountDashBoardPageisDisplayed();
			
			
			
			
			myAccountPage.clickOnAddressBookLink();

			myAccountPage.clickOnAddressBook_AddNewAddressButton();

			myAccountPage.fillDetails_AddressBook_AddNewAddress1(retrieve("ShipAddr_Firstname"), retrieve("ShipAddr_Lastname"), retrieve("ShipAddr_Address"), retrieve("ShipAddr_City"));

			myAccountPage.select_AddressBook_AddNewAddress_State(retrieve("ShipAddr_State"));

			myAccountPage.fillDetails_AddressBook_AddNewAddress2(retrieve("ShipAddr_Zip"), retrieve("ShipAddr_Telephone"));
			
			myAccountPage.clickOnAddressBook_AddNewAddress_SubmitButton();
			
			//myAccountPage.clickOnAddressBook_AddNewAddress_SaveButton();
			
			myAccountPage.verifyAVPopupinAccountDashBoardPageisDisplayedSelectAddressandContinue();
			
			myAccountPage.verify_AddressBook_NewAddress_Saved_MessageandClose();
			
			clickOnBackToTopLinkInFooter();
			
			myAccountPage.clickOnAddressBook_MakeDefault_Link();
			
			myAccountPage.ShipppingAddress();
			
			
			
			
			
			
			
			
			
			myAccountPage.clickOnAccountInfoLink();
			
			myAccountPage.clickOnAccountInfo_PaymentMethodsLink();

			myAccountPage.clickOnAccountInfo_PaymentMethods_AddNewPaymentMethod_Button();

			myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardType(retrieve("Payment_CreditCardType"));

			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardNo(retrieve("Payment_CreditCardNo"));
			
			myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryMonth(retrieve("Payment_CreditCardExpiryMonth"));
			
			myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryYear(retrieve("Payment_CreditCardExpiryYear"));

			//myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_SelectAddress(retrieve("Payment_SelectAddress"));
			
			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_FirstName(retrieve("Payment_FirstName"));
			
			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_LastName(retrieve("Payment_LastName"));
			
			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address1(retrieve("Payment_Address1"));
			
			myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_City(retrieve("Payment_City"));
			
			myAccountPage.Select_AccountInfo_PaymentMethods_AddNewPaymentMethod_State(retrieve("Payment_State"));
			
			myAccountPage.txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Zip(retrieve("Payment_Zip"));
			
			myAccountPage.txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_PhoneNo(retrieve("Payment_PhoneNo"));

			myAccountPage.clickOnAccountInfo_PaymentMethods_AddNewPaymentMethod_SaveButton();

			myAccountPage.verify_AccountInfo_PaymentMethods_Savedchanges_MessageandClose();
			
			clickOnBackToTopLinkInFooter();
			
			myAccountPage.clickOnPayment_MakeDefault_Link();
			
			
			
			
			
			
			
			
			
			

			homePage.ClickonHomePageLogo();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}
			else {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			homePage.ClickonHomePageLogo();

			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")){
				searchProductnew(retrieve("SearchKey"));
				productGridPage.verifyProductGridPageListedProducts();
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
				//productGridPage.selectSortFilterinPGPPage(retrieve("PGPPageSortByFilter"));
				productGridPage.selectProductInProductGridPage(retrieve("ProductOne"));
			}else{
				searchProductnew(retrieve("SkuID"));
				productDescriptionPage.verifyProductDescriptionPage();
			}

			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("Size"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			productDescriptionPage.clickHomePageLogoinPDPPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else {

				viewshoppingbag();

				shoppingcartPage.clickOnCheckoutButtonregistereduser();
				
				clickonChromeFirefoxCheckout();
			}

			

			checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkoutPage.clickShippingContinue();

			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

			checkoutPage.clickPaymentContinue();
			
			checkoutPage.verifyReviewTabisDisplayedandactive();
			
			checkoutPage.verifyItemAddedisDisplayedinReviewtab();
			
			checkoutPage.VerifyOrderTotalinCheckoutPageReviewTab();
			
			checkoutPage.VerifyShippingTabTitleinReviewTab();
			
			checkoutPage.clickEditBillingLinkinReviewTab();
			
			checkoutPage.verifyEditBillingOverlayisDisplayedinReviewTab();
			
			checkoutPage.clickPayPalinEditBillingOverlayinReviewTab();
			
			checkoutPage.clickonContinuePayPalinEditBillingOverlayinReviewTab();
			
			payPalPage.verifyPayPalPage();

			payPalPage.fillSignInPayPalCheckOutPage(retrieve("PayPalUserName"),retrieve("PayPalPassword"));
			
			payPalPage.payPalShippingContinue();
			
			checkoutPage.verifyReviewTabisDisplayedandactive();
			
			if(checkoutPage.clickPlaceOrderButton())
			{
				
				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();
				orderConfirmationPage.getOrderNumber();
				checkoutPage.clickOrderConfirmationPageApplicationLogo();
				waitTime(3);

				if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
					homePage.ClickonSignoutinHeaderlinkgreetinglink();
				} else {
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
				else {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}
				homePage.ClickonHomePageLogo();

				if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
					homePage.ClickonSignoutinHeaderlinkgreetinglink();
				} else {
					homePage.ClickonIESignoutinHeaderlinkgreetinglink();
				}
				
				homePage.verifyUserLoggedOutSuccessfully();
				
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