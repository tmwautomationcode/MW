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


public class RegisteredUserSavedAddressandSavedBillingPlaceOrderTest extends PopupWindows{

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
	

	public RegisteredUserSavedAddressandSavedBillingPlaceOrderTest(BaseClass obj) {
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

	
	String PDPProductName;
	
	public void RegisteredUserSavedAddressandSavedBillingPlaceOrderTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
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
			
			//retrieve("AccountDashboard_ShippingAddr_City");
			
			
			
			/*String URL = getConfigProperty("AppURL");
			
			String trimUrl = URL.substring(7, 10);
			
			String sample = prefix.concat(URL);
			
			System.out.println("The prefix : "+sample);
			
			System.out.println("Trimmed URL : "+trimUrl);
			
			System.out.println("THe Application URL : "+URL);*/
			
			//popupwindows.welcomesigninpopup();

			

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
			
			myAccountPage.SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue();
			
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
			
			
			
			
			
			checkoutPage.verifyOrderSummarySectionisdisplayedinReviewTab();
			
			checkoutPage.verifyEstTaxesinOrderSummarySectionisdisplayedinReviewTab();
			
			checkoutPage.verifyEstShippinginOrderSummarySectionisdisplayedinReviewTab();
			
			
			checkoutPage.verifyShippingEditOptionisdisplayedinReviewTab();
			
			checkoutPage.verifyPaymentEditOptionisdisplayedinReviewTab();
			
			
			
			
			checkoutPage.verifyPerfitRewardsReedemSectionisdisplayedinReviewTab();
			
			checkoutPage.verifyGiftCardReedemSectionisdisplayedinReviewTab();
			
			checkoutPage.verifyPromoCodeReedemSectionisdisplayedinReviewTab();
			
			
			
			
			
			String ReviewTabShippingAddressFirstName = checkoutPage.getReviewTabShippingAddressFirstName();
			
			testStepPassed("ReviewTabShippingAddressFirstName : "+ReviewTabShippingAddressFirstName);
			
			String ReviewTabShippingAddressLastName = checkoutPage.getReviewTabShippingAddressLastName();
			
			testStepPassed("ReviewTabShippingAddressLastName : "+ReviewTabShippingAddressLastName);
			
			String ReviewTabShippingAddressStreet = checkoutPage.getReviewTabShippingAddressStreet();
			
			testStepPassed("ReviewTabShippingAddressStreet : "+ReviewTabShippingAddressStreet);
			
			String ReviewTabShippingAddressCity = checkoutPage.getReviewTabShippingAddressCity();
			
			testStepPassed("ReviewTabShippingAddressCity : "+ReviewTabShippingAddressCity);
			
			String ReviewTabShippingAddressState =  checkoutPage.getReviewTabShippingAddressState();
			
			testStepPassed("ReviewTabShippingAddressState : "+ReviewTabShippingAddressState);
			
			String ReviewTabShippingAddressZip  = checkoutPage.getReviewTabShippingAddressZip();
			
			testStepPassed("ReviewTabShippingAddressZip : "+ReviewTabShippingAddressZip);
			
			String ReviewTabShippingAddressPhoneNo =  checkoutPage.getReviewTabShippingAddressPhoneNo();
			
			testStepPassed("ReviewTabShippingAddressPhoneNo : "+ReviewTabShippingAddressPhoneNo);

			
			if (AccountDashboardShipppingAddressFirstName.equalsIgnoreCase(ReviewTabShippingAddressFirstName)) 
			{		
				if (AccountDashboardShipppingAddressLastName.equalsIgnoreCase(ReviewTabShippingAddressLastName)) 
				{
					if (AccountDashboardShipppingAddressStreet.equalsIgnoreCase(ReviewTabShippingAddressStreet)) 
					{
						if (AccountDashboardShipppingAddressCity.equalsIgnoreCase(ReviewTabShippingAddressCity)) 
						{
							if (AccountDashboardShipppingAddressState.equalsIgnoreCase(ReviewTabShippingAddressState)) 
							{
								if (AccountDashboardShipppingAddressZip.equalsIgnoreCase(ReviewTabShippingAddressZip)) 
								{
									if (AccountDashboardShipppingAddressPhone.equalsIgnoreCase(ReviewTabShippingAddressPhoneNo)) 
									{
										testStepInfo("Shipping Address in Account Dashboard and Review Tab are same");
									}
								}
							}
						}
					}
				}
				
			}
			
			else 
			{
				testStepFailed("Shipping Address in Account Dashboard and Review Tab are not same");
			}
			
			
			
			
			String ReviewTabPaymentDetailsCardType = checkoutPage.getReviewTabPaymentDetailsCardType();
			
			testStepPassed("ReviewTabPaymentDetailsCardType : "+ReviewTabPaymentDetailsCardType);
			
			String ReviewTabPaymentDetailsCardNo = checkoutPage.getReviewTabPaymentDetailsCardNo();
			
			testStepPassed("ReviewTabPaymentDetailsCardNo : "+ReviewTabPaymentDetailsCardNo);

			String ReviewTabPaymentDetailsCardExpiryDateYear = checkoutPage.getReviewTabPaymentDetailsCardExpiryDateYear();
			
			testStepPassed("ReviewTabPaymentDetailsCardExpiryDateYear : "+ReviewTabPaymentDetailsCardExpiryDateYear);

			
			
			
			if (AccountDashboardPaymentDetailsCardType.equalsIgnoreCase(ReviewTabPaymentDetailsCardType)) 
			{
				if (AccountDashboardPaymentDetailsCardNo.equalsIgnoreCase(ReviewTabPaymentDetailsCardNo)) 
				{
					if (AccountDashboardPaymentDetailsCardMonthYear.equalsIgnoreCase(ReviewTabPaymentDetailsCardExpiryDateYear)) 
					{
						testStepInfo("Card Details in Account Dashboard and Review Tab are same");
					}
				}
			}
			
			else 
			{
				testStepFailed("Card Details in Account Dashboard and Review Tab are not same");
			}
			
			
			
			checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTabSafari();
			
			
			
			
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

			
			
			
			
			
			/*
			
			
			
			
			
			
			if ((orderPlacementFlag==true)) 
			{

				if (browser.equalsIgnoreCase("InternetExplorer")) 
				{

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

				}
				else 
				{

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}
				
				
				homePage.ClickonHomePageLogo();
				if (getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")) {
					waitTime(2);
					searchProductnew(retrieve("SearchKey"));
					productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				} else {
					searchProductnew(retrieve("SkuID"));
					productDescriptionPage.verifyProductDescriptionPage();
				}
				productGridPage.clickOnQuickViewFromProductGridPage(retrieve("ProductOne"));
				
				productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("Size"));
				popupwindows.clickOnAddToShoppingBagFromQVPopup();
				//waitTime(5);


				if (browser.equalsIgnoreCase("InternetExplorer")) {

					homePage.clickonIECheckoutonHomepageMiniBagwithCountforRegisteredUser();

				}
				else {

					viewshoppingbag();
					
					shoppingcartPage.clickOnCheckoutButtonregistereduser();
					
	

				}
				
				checkoutPage.verifyReveiwTabIsDisplayed();
				
				checkoutPage.verifyPlaceOrderButtonIsEnabled();
				
				checkoutPage.getItemsForPurchase();
				
				checkoutPage.VerifyOrderTotalinCheckoutPageReviewTab(); 
				
				checkoutPage.VerifyShippingTabTitleinReviewTab();
				
				//String ShippingAddressInReviewPage = checkoutPage.verifyShippingAddressinReviewTab();
				
				if(ShippingAddress.contains(ShippingAddressInReviewPage))
				{
					
					testStepInfo("Shipping details in Review tab and Default Address are same");
					
				}
				
				else
				{
					testStepFailed("Shipping details in Review tab and Default Address are different");
				}	
				
				checkoutPage.verifyGroundShippinginReviewTab();
				
				checkoutPage.verifyEditButtonIsDisplayedForShippingAndGiftInfo();
				
				checkoutPage.VerifyPaymentTabTitleinReviewTab();
				
				checkoutPage.verifyPerfectFitRewardsIsDisplayedInReveiwTab();
				checkoutPage.verifyGiftCardIsDisplayedInReveiwTab();
				checkoutPage.verifyPromoCodeIsDisplayedInReveiwTab();
				
				
				String billingInformationinReviewPage = checkoutPage.verifyBillinginformationinReviewTab();
				if(billingInfo.contains(billingInformationinReviewPage))
				{
					
					testStepInfo("Billing details in Review tab and Payment Address are same");
					
				}
				
				else
				{
					testStepFailed("Billing details in Review tab and Payment Address are different");
				}
				
				//checkoutPage.fillCVVinReviewTab(retrieve("CreditCardCvv"));
				
				checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));
				
				checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));
				
				checkoutPage.verifyPlaceOrderButtonIsEnabled();
				if(checkoutPage.clickPlaceOrderButton())
				{
					orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();
					orderConfirmationPage.getOrderNumber();
					homePage.ClickonHomePageLogo();
				}
				
				else {
					testStepPassed("Order could not be placed. Execution is happening in Production environment");
				}
				homePage.ClickonHomePageLogo();
				
				if (browser.equalsIgnoreCase("InternetExplorer")) {

					homePage.ClickonIEAccountHeaderlinkgreetinglink();

				} else {

					homePage.ClickonHeaderlinkgreetinglink();

				}
			}
			


			homePage.verifyUserLoggedOutSuccessfully();*/
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