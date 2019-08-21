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


public class RegisteredUserShoppingCartUpdateProductfromReviewPageTest extends PopupWindows{

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
	
	public RegisteredUserShoppingCartUpdateProductfromReviewPageTest(BaseClass obj) {
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
		departmentNavigation = null;
		homePage= null;
		popupwindows=null;
		departmentNavigation = null;
	}

	

	String TailoringAmountinPDP; String TailoringAmountinReviewTab; String TailoringAmountinShoppingCartPage;

	public void RegisteredUserShoppingCartUpdateProductfromReviewPageTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
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




			/*welcomesigninpopup();

			popupwindows.continueShoppingPopupClose();
			 */

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

			/*if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
			{

				productDescriptionPage.selectTailorAndHemCheckbox();

				TailoringAmountinPDP = productDescriptionPage.getTailoringAmountinPDP();

				productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

				productDescriptionPage.selectInseam(retrieve("Inseam"));

				productDescriptionPage.clickPDPAddtoShoppingBagButton();

			} 
			else 
			{
				productDescriptionPage.clickPDPAddtoShoppingBagButton();

				testStepFailed("Tailor & Hem Checkbox is not displayed");
			}*/





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
			
			checkoutPage.verifyDefaultStandardShippingisDisplayedinReviewTab();
			
			checkoutPage.verifyPlaceOrderButtonisDisabled();
			
			

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



			
			
			/*checkoutPage.verifyTailoringOptionisAddedtoProductandDisplayedinReviewTab();

			if (checkoutPage.verifyTailoringOptionisAddedtoProductandDisplayedinReviewTab()) 
			{
				TailoringAmountinReviewTab = checkoutPage.getTailoringAmountAddedtoProductinReviewTab();


				testStepPassed("TailoringAmountinReviewTab : "+TailoringAmountinReviewTab);

				if (TailoringAmountinReviewTab.contains(TailoringAmountinPDP)) 
				{
					testStepInfo("Tailoring Amount in PDP and Review Tab are same");
				}

				else 
				{
					testStepFailed("Tailoring Amount in PDP and Review Tab are not same");
				}
			}

			else 
			{
				testStepFailed("Tailoring Option is not Added to the Product and displayed in Review Tab");
			}*/

			
			String ProductCountinReviewTab = checkoutPage.getProductCartCountinReviewTab("ProductCount");
			
			testStepPassed("ProductCountinReviewTab : "+ProductCountinReviewTab);

			if (ProductCountinReviewTab.equalsIgnoreCase("1 ITEM")) 
			{	
				testStepInfo("Product Count in Review Tab is 1");
			}

			else 
			{
				testStepFailed("Product Count in Review Tab is not 1. Product count in bag "+ProductCountinReviewTab);
			}
			
			
			
			

			checkoutPage.clickShoppingCartEditLinkinReviewTab();
			
			
			
			

			String ProductCount = shoppingcartPage.getProductCountinShoppingCartPage("ProductCount");

			if (ProductCount.equalsIgnoreCase("1 item(s)")) 
			{	
				testStepInfo("Product Count in Shopping Cart is 1");
			}

			else 
			{
				testStepFailed("Product Count in Shopping Cart is not 1. Product count in bag "+ProductCount);
			}


			/*if (shoppingcartPage.verifyTailoringOptionisAddedtoProductandDisplayedinShoppingCartPage()) 
			{
				TailoringAmountinShoppingCartPage = shoppingcartPage.getTailoringAmountAddedtoProductinShoppingCartPage();

				testStepPassed("TailoringAmountinShoppingCartPage : "+TailoringAmountinShoppingCartPage);
			}

			else 
			{
				testStepFailed("Tailoring Option is not Added to the Product and displayed in Shopping Cart Page");
			}*/


			shoppingcartPage.clickEditIteminShoppingCart();

			//shoppingcartPage.UnCheckTailorAndHemOption();

			shoppingcartPage.entereditproductvalues(retrieve("ProductQuantity"));

			shoppingcartPage.clickUpdateButton();
			
			
			

			String ProductCount2 = shoppingcartPage.getProductCountinShoppingCartPage("ProductCount");

			if (ProductCount2.equalsIgnoreCase("2 item(s)")) 
			{
				testStepInfo("Product Count is updated to 2");
			}

			else 
			{
				testStepFailed("Product Count is not updated to 2. Product count in bag "+ProductCount);
			}


			//shoppingcartPage.verifyTailoringOptionisRemovedtoProductandNotDisplayedinShoppingCartPage();
			
			/*if (shoppingcartPage.verifyTailoringOptionisRemovedtoProductandDisplayedinShoppingCartPage()) 
			{
				testStepPassed("Tailoring for the Product is Removed in Shopping cart Page");
			}

			else 
			{
				testStepFailed("Tailoring for the Product is not Removed in Shopping cart Page");
			}*/


			shoppingcartPage.clickRegisteredUserChekoutButton();

			checkoutPage.VerifyReviewTab();
			
			
			
			
			String ProductCountinReviewTab2 = checkoutPage.getProductCartCountinReviewTab("ProductCount");
			
			testStepPassed("ProductCountinReviewTab2 : "+ProductCountinReviewTab2);

			if (ProductCountinReviewTab2.equalsIgnoreCase("2 ITEMS")) 
			{	
				testStepInfo("Product Count in Review Tab is 2");
			}

			else 
			{
				testStepFailed("Product Count in Review Tab is not 2. Product count in bag "+ProductCountinReviewTab);
			}
			
			//checkoutPage.verifyTailoringOptionisRemovedtoProductandNotDisplayedinReviewTab();
			
			
			
			
			checkoutPage.clickShoppingCartEditLinkinReviewTab();
			
			shoppingcartPage.removeItemsfromShoppingCarttoCountOne_New();

			String ProductCount3 = shoppingcartPage.getProductCountinShoppingCartPage("ProductCount");

			if (ProductCount3.equalsIgnoreCase("1 item(s)")) 
			{	
				testStepInfo("Product Count is reduced to 1");
			}

			else 
			{
				testStepFailed("Product Count is not reduced to 1. Product count in bag "+ProductCount3);
			}

			
			
			shoppingcartPage.clickRegisteredUserChekoutButton();

			checkoutPage.VerifyReviewTab();
			
			
			
			String ProductCountinReviewTab3 = checkoutPage.getProductCartCountinReviewTab("ProductCount");

			if (ProductCountinReviewTab3.equalsIgnoreCase("1 ITEM")) 
			{	
				testStepInfo("Product Count in Review Tab is 1");
			}

			else 
			{
				testStepFailed("Product Count in Review Tab is not 1. Product count in bag "+ProductCountinReviewTab);
			}
			
			
			
			
			
			
			

			checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));

			checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));

			checkoutPage.EnterSavedCvvinReviewTabSafari();
			
			checkoutPage.verifyPlaceOrderButtonIsEnabled();


			if(checkoutPage.clickPlaceOrderButton())
			{

				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();

				homePage.ClickonHomePageLogo();
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