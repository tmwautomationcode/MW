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


import baseClass.BaseClass;
import baseClass.PopupWindows;

public class AccountDashboardTest extends PopupWindows{

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
	private PopupWindows popupwindows;



	public AccountDashboardTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		myAccountAddressBookPage = new	MyAccountAddressBookPage(obj);
		myAccountOrderHistoryPage = new	MyAccountOrderHistoryPage(obj);
		myAccountPage = new	MyAccountPage(obj);
		myAccountPayMentmethodsPage = new	MyAccountPaymentMethodsPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		orderConfirmationPage =new OrderConfirmationPage(obj);
		myAccountOrderDetailPage = new MyAccountOrderDetailPage(obj);
		myAccountPaymentMethodsPage = new MyAccountPaymentMethodsPage(obj);
		popupwindows=new PopupWindows(obj);
		homePage= new HomePage(obj);
	}



	public void destroyObjects(){	
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
		popupwindows =null;
		homePage = null;
	}


	public void accountDashboardTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String tcId){



		try{

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}*/

			/*String URL = getConfigProperty("AppURL");

			String trimUrl = URL.substring(7, 10);

			String sample = prefix.concat(URL);

			System.out.println("The prefix : "+sample);

			System.out.println("Trimmed URL : "+trimUrl);

			System.out.println("THe Application URL : "+URL);*/



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

			homePage.ClickonHomePageLogo();
			
			//clickOnBackToTopLinkInFooter();
			


			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}


		
			


			signInToApp(retrieve("UserName"),retrieve("Password"));
			waitTime(3);



			testStepInfo("");
			testStepInfo("Placing Order and getting the Order Number");
			testStepInfo("****************************************************");
			if ((orderPlacementFlag==true)) {

				if (browser.equalsIgnoreCase("InternetExplorer")) {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

				}
				
				else if (browser.equalsIgnoreCase("Safari")) {
					shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
				}
				
				else {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}

				//homePage.ClickonHomePageLogo();
								
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
									
				productGridPage.clickOnQuickViewFromProductGridPage(retrieve("ProductName"));

				productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
				
				popupwindows.clickOnAddToShoppingBagFromQVPopup();
				
				homePage.ClickonHomePageLogo();

				if (browser.equalsIgnoreCase("InternetExplorer")) {

					homePage.clickonIECheckoutonHomepageMiniBagwithCountforRegisteredUser();

				}
				else if (browser.equalsIgnoreCase("Safari")) {
					
					homePage.ClickonHomePageLogo();
					
					clickonChromeFirefoxCheckout();
				}
				
				else {

					viewshoppingbag();

					shoppingcartPage.clickOnCheckoutButtonregistereduser();


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
				checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));
				checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));
				checkoutPage.EnterSavedCvvinReviewTabSafari();
				if(checkoutPage.clickPlaceOrderButton())
				{
					
					orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();
					
					orderConfirmationPage.getOrderNumber();
					
					homePage.ClickonCheckOutHomePageLogo();
				}
				else{
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

				testStepInfo("");
				testStepInfo("Checking the Order History in Account Page");
				testStepInfo("**************************************************");


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


				myAccountPage.clickOnOrderHistoryLink();
				waitTime(5);
				myAccountPage.clickOnOrderNoLink();
				myAccountPage.getorderhistoryproductdetails();
				productDescriptionPage.verifyProductDescriptionPagenew();
				homePage.ClickonHomePageLogo();

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
			}
			else 
			{
				testStepPassed("Order could not be placed. Execution is happening in Production environment");
			}


			testStepInfo("");
			testStepInfo("Updating Account Info Details in Account Information Page");
			testStepInfo("*********************************************************************");

			myAccountPage.clickOnAccountInfoLink();

			myAccountPage.clickOnAccountInfo_SignInInfoLink();

			myAccountPage.clear_AccountInfo_SignInInfo_details();

			myAccountPage.fill_AccountInfo_SignInInfo_EmailPasswordDetails(retrieve("AccInfo_Email"), retrieve("AccInfo_Password"), retrieve("AccInfo_ConfirmEmail"), retrieve("AccInfo_ConfirmPassword"));

			if (browser.equalsIgnoreCase("Safari")) 
			{
				myAccountPage.clickOnSafariAccountInfo_SignInInfo_Savechanges_Button();
			}
			
			else {
				myAccountPage.clickOnAccountInfo_SignInInfo_Savechanges_Button();
			}
			

			//myAccountPage.verify_AccountInfo_SignInInfo_Savedchanges_MessageandClose();

			/*myAccountPage.clickOnAccountInfo_PaymentMethodsLink();

					myAccountPage.clickOnAccountInfo_PaymentMethods_AddNewPaymentMethod_Button();

					myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardType(retrieve("Payment_CreditCardType"));

					myAccountPage.fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardNo(retrieve("Payment_CreditCardNo"));

					myAccountPage.select_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address(retrieve("Payment_Address"));

					myAccountPage.clickOnAccountInfo_PaymentMethods_AddNewPaymentMethod_SaveButton();

					myAccountPage.verify_AccountInfo_PaymentMethods_Savedchanges_MessageandClose();

					myAccountPage.clickOnAccountInfo_PaymentMethods_DeleteButton();

					myAccountPage.verify_AccountInfo_PaymentMethods_deleted_MessageandClose();
			 */			

			testStepInfo("");
			testStepInfo("Adding New Address, Editing & Deleting the Address");
			testStepInfo("****************************************************************");

			myAccountPage.clickOnAddressBookLink();

			myAccountPage.clickOnAddressBook_AddNewAddressButton();

			myAccountPage.fillDetails_AddressBook_AddNewAddress1(retrieve("ShipAddr_Firstname"), retrieve("ShipAddr_Lastname"), retrieve("ShipAddr_Address"), retrieve("ShipAddr_City"));

			myAccountPage.select_AddressBook_AddNewAddress_State(retrieve("ShipAddr_State"));

			myAccountPage.fillDetails_AddressBook_AddNewAddress2(retrieve("ShipAddr_Zip"), retrieve("ShipAddr_Telephone"));

			myAccountPage.clickOnAddressBook_AddNewAddress_SubmitButton();

			//myAccountPage.verify_AddressBook_NewAddress_Saved_MessageandClose();

			homePage.ClickonHomePageLogo();

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

			myAccountPage.clickOnAddressBookLink();

			myAccountPage.clickOnAddressBook_EditAddress_Link();

			myAccountPage.clear_AddressBook_EditAddress_details();

			myAccountPage.fillDetails_AddressBook_AddNewAddress1(retrieve("ShipAddr_Edit_Firstname"), retrieve("ShipAddr_Edit_Lastname"), retrieve("ShipAddr_Edit_Address"), retrieve("ShipAddr_Edit_City"));

			myAccountPage.select_AddressBook_AddNewAddress_State(retrieve("ShipAddr_Edit_State"));

			myAccountPage.fillDetails_AddressBook_AddNewAddress2(retrieve("ShipAddr_Edit_Zip"), retrieve("ShipAddr_Edit_Telephone"));

			myAccountPage.clickOnAddressBook_UpdateAddress_Button();

			myAccountPage.verify_AddressBook_EditAddress_Saved_MessageandClose();

			homePage.ClickonHomePageLogo();


			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.ClickonIEAccountHeaderlinkgreetinglink();

			} 
			
			else if (browser.equalsIgnoreCase("Safari")) {
				
				homePage.ClickonSafariHeaderlinkgreetinglink();
				
				waitTime(2);
			}
			
			else {

				homePage.ClickonHeaderlinkgreetinglink();

			}

			myAccountPage.clickOnAddressBookLink();	

			myAccountPage.clickOnAddressBook_DeleteAddress_Link();

			myAccountPage.clickOnAddressBook_DeleteAddressDialog_DeleteButton();

			myAccountPage.verify_AddressBook_DeleteAddress_Delete_MessageandClose();

			homePage.ClickonHomePageLogo();

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
			testStepFailed("Exception occured: "+e);
		}
		finally{
			if(checkoutPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus ||
					myAccountAddressBookPage.testCaseExecutionStatus ||
					myAccountOrderHistoryPage.testCaseExecutionStatus ||
					myAccountPage.testCaseExecutionStatus ||
					myAccountPayMentmethodsPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
					myAccountOrderDetailPage.testCaseExecutionStatus ||
					myAccountPaymentMethodsPage.testCaseExecutionStatus ||
					homePage.testCaseExecutionStatus){
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