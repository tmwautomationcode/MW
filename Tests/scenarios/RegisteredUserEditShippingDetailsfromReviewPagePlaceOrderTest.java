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




public class RegisteredUserEditShippingDetailsfromReviewPagePlaceOrderTest extends PopupWindows{

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
	

	public RegisteredUserEditShippingDetailsfromReviewPagePlaceOrderTest(BaseClass obj) {
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
		departmentNavigation = new DepartmentNavigation(obj);
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

	
	String FistNameinEditShippingModal;
	String LastNameinEditShippingModal;
	String AddressStreetinEditShippingModal;
	String AddressCityinEditShippingModal;
	String AddressStateinEditShippingModal;
	String AddressZipinEditShippingModal;
	String AddressPhoneNoinEditShippingModal;
	
	public void RegisteredUserEditShippingDetailsfromReviewPagePlaceOrderTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
				
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
			
			//testStepPassed("AccountDashboardShipppingAddressFirstName : "+AccountDashboardShipppingAddressFirstName);
			
			String AccountDashboardShipppingAddressLastName = myAccountPage.getShipppingAddressLastName();
			
			//testStepPassed("AccountDashboardShipppingAddressLastName : "+AccountDashboardShipppingAddressLastName);
			
			String AccountDashboardShipppingAddressStreet = myAccountPage.getShipppingAddressStreet();
			
			//testStepPassed("AccountDashboardShipppingAddressStreet : "+AccountDashboardShipppingAddressStreet);
			
			String AccountDashboardShipppingAddressCity = myAccountPage.getShipppingAddressCity();
			
			//testStepPassed("AccountDashboardShipppingAddressCity : "+AccountDashboardShipppingAddressCity);
			
			String AccountDashboardShipppingAddressState = myAccountPage.getShipppingAddressState();
			
			//testStepPassed("AccountDashboardShipppingAddressState : "+AccountDashboardShipppingAddressState);
			
			String AccountDashboardShipppingAddressZip = myAccountPage.getShipppingAddressZip();
			
			//testStepPassed("AccountDashboardShipppingAddressZip : "+AccountDashboardShipppingAddressZip);
			
			String AccountDashboardShipppingAddressPhone = myAccountPage.getShipppingAddressPhone();
			
			//testStepPassed("AccountDashboardShipppingAddressPhone : "+AccountDashboardShipppingAddressPhone);

			
			
			
			
			


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




			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
				
			}


			else
			{
				searchProductnew(retrieve("SkuID"));

				waitTime(3);

			}


			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

			String PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();

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
			
			//testStepPassed("ReviewTabProductName : "+ReviewTabProductName);
			
			if (PDPProductName.equalsIgnoreCase(ReviewTabProductName)) 
			{
				testStepInfo("Product added to the cart and review tab are same");
			}
			
			else 
			{
				testStepFailed("Product added to the cart and review tab are not same");
			}
			
			
			
			String ReviewTabShippingAddressFirstName = checkoutPage.getReviewTabShippingAddressFirstName();
			
			//testStepPassed("ReviewTabShippingAddressFirstName : "+ReviewTabShippingAddressFirstName);
			
			String ReviewTabShippingAddressLastName = checkoutPage.getReviewTabShippingAddressLastName();
			
			//testStepPassed("ReviewTabShippingAddressLastName : "+ReviewTabShippingAddressLastName);
			
			String ReviewTabShippingAddressStreet = checkoutPage.getReviewTabShippingAddressStreet();
			
			//testStepPassed("ReviewTabShippingAddressStreet : "+ReviewTabShippingAddressStreet);
			
			String ReviewTabShippingAddressCity = checkoutPage.getReviewTabShippingAddressCity();
			
			//testStepPassed("ReviewTabShippingAddressCity : "+ReviewTabShippingAddressCity);
			
			String ReviewTabShippingAddressState =  checkoutPage.getReviewTabShippingAddressState();
			
			//testStepPassed("ReviewTabShippingAddressState : "+ReviewTabShippingAddressState);
			
			String ReviewTabShippingAddressZip  = checkoutPage.getReviewTabShippingAddressZip();
			
			//testStepPassed("ReviewTabShippingAddressZip : "+ReviewTabShippingAddressZip);
			
			String ReviewTabShippingAddressPhoneNo =  checkoutPage.getReviewTabShippingAddressPhoneNo();
			
			//testStepPassed("ReviewTabShippingAddressPhoneNo : "+ReviewTabShippingAddressPhoneNo);

			
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
			
			
			String ShippingModeStandardAddress = checkoutPage.getShippingModeStandardAddressinReviewTab();
			
			testStepPassed("ShippingModeStandardAddress : "+ShippingModeStandardAddress);
			
			
			
			checkoutPage.VerifyShippingDetailsSectionisDisplayedinReviewTab();
			
			checkoutPage.clickShippingEditLinkinReviewTab();
			
			waitTime(2);
			
			if (checkoutPage.verifyEditShippingModalisdisplayedinReviewTab()) 
			{
				/*FistNameinEditShippingModal = checkoutPage.getFistNameinEditShippingModalinReviewTab();
				
				LastNameinEditShippingModal = checkoutPage.getLastNameinEditShippingModalinReviewTab();
				
				AddressStreetinEditShippingModal = checkoutPage.getAddressStreetinEditShippingModalinReviewTab();
				
				AddressCityinEditShippingModal = checkoutPage.getAddressCityinEditShippingModalinReviewTab();
				
				AddressStateinEditShippingModal = checkoutPage.getAddressStateinEditShippingModalinReviewTab();
				
				AddressZipinEditShippingModal = checkoutPage.getAddressZipinEditShippingModalinReviewTab();
				
				AddressPhoneNoinEditShippingModal = checkoutPage.getAddressPhoneinEditShippingModalinReviewTab();*/
				
				checkoutPage.verifySavedAddressDropdownisDispalyedWithValuesinEditShippingModalinReviewTab();
				
				checkoutPage.verifySavedAddressinSavedAddressSectionisDisplayedinEditShippingModalinReviewTab();
				
				checkoutPage.verifyChangeAddressLinkisDisplayedinEditShippingModalinReviewTab();

				checkoutPage.verifyCreateNewAddressLinkisDisplayedinEditShippingModalinReviewTab();
				
				//checkoutPage.verifyShippingModeDropdownWithValueisDisplayedinEditShippingModalinReviewTab();
				
				checkoutPage.ClickChangeAddressLinkinEditShippingModalinReviewTab();
				
				checkoutPage.VerifyChangeAddressFormisPrefilledwithDatainEditShippingModalinReviewTab();
				
				checkoutPage.EnterNewAddressinChangeAddressForminEditShippingModalinReviewTab(retrieve("ChangeAddressFirstname"), retrieve("ChangeAddressLastname"), retrieve("ChangeAddressStreet"), retrieve("ChangeAddressCity"), retrieve("ChangeAddressState"), retrieve("ChangeAddressZip"), retrieve("ChangeAddressPhone"));
				
				waitTime(3);
							
			}
			
			else 
			{
				testStepFailed("Edit Shipping Modal is not displayed");
			}
			
			
			
			String ReviewTabShippingAddressFirstName_Changed = checkoutPage.getReviewTabShippingAddressFirstName();
			
			//testStepPassed("ReviewTabShippingAddressFirstName_Changed : "+ReviewTabShippingAddressFirstName_Changed);
			
			String ReviewTabShippingAddressLastName_Changed = checkoutPage.getReviewTabShippingAddressLastName();
			
			//testStepPassed("ReviewTabShippingAddressLastName_Changed : "+ReviewTabShippingAddressLastName_Changed);
			
			//String ReviewTabShippingAddressStreet_Changed = checkoutPage.getReviewTabShippingAddressStreet();
			
			//testStepPassed("ReviewTabShippingAddressStreet_Changed : "+ReviewTabShippingAddressStreet_Changed);
			
			String ReviewTabShippingAddressCity_Changed = checkoutPage.getReviewTabShippingAddressCity();
			
			//testStepPassed("ReviewTabShippingAddressCity_Changed : "+ReviewTabShippingAddressCity_Changed);
			
			//String ReviewTabShippingAddressState_Changed =  checkoutPage.getReviewTabShippingAddressState();
			
			//testStepPassed("ReviewTabShippingAddressState_Changed : "+ReviewTabShippingAddressState_Changed);
			
			String ReviewTabShippingAddressZip_Changed  = checkoutPage.getReviewTabShippingAddressZip();
			
			//testStepPassed("ReviewTabShippingAddressZip_Changed : "+ReviewTabShippingAddressZip_Changed);
			
			//String ReviewTabShippingAddressPhoneNo_Changed =  checkoutPage.getReviewTabShippingAddressPhoneNo();
			
			//testStepPassed("ReviewTabShippingAddressPhoneNo_Changed : "+ReviewTabShippingAddressPhoneNo_Changed);

			
			if (ReviewTabShippingAddressFirstName_Changed.equalsIgnoreCase(retrieve("ChangeAddressFirstname"))) 
			{
				if (ReviewTabShippingAddressLastName_Changed.equalsIgnoreCase(retrieve("ChangeAddressLastname"))) 
				{
					if (ReviewTabShippingAddressCity_Changed.equalsIgnoreCase(retrieve("ChangeAddressCity"))) 
					{
						if (ReviewTabShippingAddressZip_Changed.equalsIgnoreCase(retrieve("ChangeAddressZip"))) 
						{
							
								testStepInfo("Changed Shipping Address is Updated in Review Tab");
							
						}
					}
				}
			}
			
			else 
			{
				testStepFailed("Changed Shipping Address is not Updated in Review Tab");
			}
			
			
			
			String ShippingModeExpressAddress = checkoutPage.getShippingModeExpressAddressinReviewTab();
			
			testStepPassed("ShippingModeExpressAddress : "+ShippingModeExpressAddress);
			
			if (ShippingModeExpressAddress.equalsIgnoreCase("EXPRESS SHIPPING")) 
			{
				testStepInfo("Shipping Mode is Changed from "+ShippingModeStandardAddress+" to "+ShippingModeExpressAddress);
			}
			
			else 
			{
				testStepFailed("Shipping Mode is not Changed");
			}
			
			
			checkoutPage.clickShippingEditLinkinReviewTab();
			
			waitTime(2);
			
			if (checkoutPage.verifyEditShippingModalisdisplayedinReviewTab()) 
			{
				checkoutPage.ClickCreateNewAddressLinkinEditShippingModalinReviewTab();
				
				checkoutPage.EnterNewAddressinCreatenewAddressForminEditShippingModalinReviewTab(retrieve("CreateAddressFirstname"), retrieve("CreateAddressLastname"), retrieve("CreateAddressStreet"), retrieve("CreateAddressCity"), retrieve("CreateAddressState"), retrieve("CreateAddressZip"), retrieve("CreateAddressPhone"));
				
				waitTime(3);
							
			}
			
			else 
			{
				testStepFailed("Edit Shipping Modal is not displayed");
			}

			
			
			String ReviewTabShippingAddressFirstName_New = checkoutPage.getReviewTabShippingAddressFirstName();
			
			//testStepPassed("ReviewTabShippingAddressFirstName_New : "+ReviewTabShippingAddressFirstName_New);
			
			String ReviewTabShippingAddressLastName_New = checkoutPage.getReviewTabShippingAddressLastName();
			
			//testStepPassed("ReviewTabShippingAddressLastName_New : "+ReviewTabShippingAddressLastName_New);
			
			String ReviewTabShippingAddressStreet_New = checkoutPage.getReviewTabShippingAddressStreet();
			
			//testStepPassed("ReviewTabShippingAddressStreet2 : "+ReviewTabShippingAddressStreet_New);
			
			String ReviewTabShippingAddressCity_New = checkoutPage.getReviewTabShippingAddressCity();
			
			//testStepPassed("ReviewTabShippingAddressCity_New : "+ReviewTabShippingAddressCity_New);
			
			String ReviewTabShippingAddressState_New =  checkoutPage.getReviewTabShippingAddressState();
			
			//testStepPassed("ReviewTabShippingAddressState_New : "+ReviewTabShippingAddressState_New);
			
			String ReviewTabShippingAddressZip_New  = checkoutPage.getReviewTabShippingAddressZip();
			
			//testStepPassed("ReviewTabShippingAddressZip_New : "+ReviewTabShippingAddressZip_New);
			
			String ReviewTabShippingAddressPhoneNo_New =  checkoutPage.getReviewTabShippingAddressPhoneNo();
			
			//testStepPassed("ReviewTabShippingAddressPhoneNo_New : "+ReviewTabShippingAddressPhoneNo_New);

			
			if (ReviewTabShippingAddressFirstName_New.equalsIgnoreCase(retrieve("CreateAddressFirstname"))) 
			{
				if (ReviewTabShippingAddressLastName_New.equalsIgnoreCase(retrieve("CreateAddressLastname"))) 
				{
					if (ReviewTabShippingAddressCity_New.equalsIgnoreCase(retrieve("CreateAddressCity"))) 
					{
						if (ReviewTabShippingAddressZip_New.equalsIgnoreCase(retrieve("CreateAddressZip"))) 
						{
							
								testStepInfo("New Shipping Address is Updated in Review Tab");
							
						}
					}
				}
			}
			
			else 
			{
				testStepFailed("New Shipping Address is not Updated in Review Tab");
			}

				
			homePage.ClickonCheckOutHomePageLogo();
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.ClickonIEAccountHeaderlinkgreetinglink();

			} 
			
			
			else if (browser.equalsIgnoreCase("Safari")) 
			{
				homePage.ClickonSafariHeaderlinkgreetinglink();
				waitTime(2);
			}
			
			else 
			{

				homePage.ClickonHeaderlinkgreetinglink();

			}
			
			
			myAccountPage.verifyAccountDashBoardPageisDisplayed();
			
			myAccountPage.clickOnAddressBookLink();
			
			
			
			
			String AccountDashboardShipppingAddressFirstName_New = myAccountPage.getShipppingAddressFirstName();
			
			//testStepPassed("AccountDashboardShipppingAddressFirstName_New : "+AccountDashboardShipppingAddressFirstName_New);
			
			String AccountDashboardShipppingAddressLastName_New = myAccountPage.getShipppingAddressLastName();
			
			//testStepPassed("AccountDashboardShipppingAddressLastName_New : "+AccountDashboardShipppingAddressLastName_New);
			
			String AccountDashboardShipppingAddressStreet_New = myAccountPage.getShipppingAddressStreet();
			
			//testStepPassed("AccountDashboardShipppingAddressStreet_New : "+AccountDashboardShipppingAddressStreet_New);
			
			String AccountDashboardShipppingAddressCity_New = myAccountPage.getShipppingAddressCity();
			
			//testStepPassed("AccountDashboardShipppingAddressCity_New : "+AccountDashboardShipppingAddressCity_New);
			
			String AccountDashboardShipppingAddressState_New = myAccountPage.getShipppingAddressState();
			
			//testStepPassed("AccountDashboardShipppingAddressState_New : "+AccountDashboardShipppingAddressState_New);
			
			String AccountDashboardShipppingAddressZip_New = myAccountPage.getShipppingAddressZip();
			
			//testStepPassed("AccountDashboardShipppingAddressZip_New : "+AccountDashboardShipppingAddressZip_New);
			
			String AccountDashboardShipppingAddressPhone_New = myAccountPage.getShipppingAddressPhone();
			
			//testStepPassed("AccountDashboardShipppingAddressPhone_New : "+AccountDashboardShipppingAddressPhone_New);

			
			
			
			if (AccountDashboardShipppingAddressFirstName_New.equalsIgnoreCase(ReviewTabShippingAddressFirstName_New)) 
			{		
				if (AccountDashboardShipppingAddressLastName_New.equalsIgnoreCase(ReviewTabShippingAddressLastName_New)) 
				{
					if (AccountDashboardShipppingAddressStreet_New.equalsIgnoreCase(ReviewTabShippingAddressStreet_New)) 
					{
						if (AccountDashboardShipppingAddressCity_New.equalsIgnoreCase(ReviewTabShippingAddressCity_New)) 
						{
							if (AccountDashboardShipppingAddressState_New.equalsIgnoreCase(ReviewTabShippingAddressState_New)) 
							{
								if (AccountDashboardShipppingAddressZip_New.equalsIgnoreCase(ReviewTabShippingAddressZip_New)) 
								{
									if (AccountDashboardShipppingAddressPhone_New.equalsIgnoreCase(ReviewTabShippingAddressPhoneNo_New)) 
									{
										testStepInfo("New Shipping Address in Review Tab and Account Dashboard are same");
									}
								}
							}
						}
					}
				}
				
			}
			
			else 
			{
				testStepFailed("New Shipping Address in Review Tab and Account Dashboard are not same");
			}
			
			
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				
				//clickonChromeFirefoxCheckout();
				viewshoppingbag();
				shoppingcartPage.clickOnCheckoutButtonregistereduser();

			}
			
			
			checkoutPage.VerifyReviewTab();
			
			
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

			

			

		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		finally
		{
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