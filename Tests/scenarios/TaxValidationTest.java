package scenarios;

import java.text.DecimalFormat;

import org.apache.log4j.nt.NTEventLogAppender;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.MyAccountAddressBookPage;
import mwPages.MyAccountPage;
import mwPages.MyAccountPaymentMethodsPage;
import mwPages.HomePage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.CheckOutPage;
import mwPages.DepartmentNavigation;
import mwPages.GiftCardsPage;
import mwPages.OrderConfirmationPage;
import mwPages.ShoppingCartPage;

public class TaxValidationTest extends PopupWindows {
	private MyAccountPage myAccountPage;
	private MyAccountAddressBookPage myAccountAddressBookPage;
	private MyAccountPaymentMethodsPage myAccountPaymentMethodsPage;
	private ShoppingCartPage shoppingcartPage;
	private HomePage homePage;
	private GiftCardsPage giftcardPage;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private DepartmentNavigation departmentNavigation;
	private MyAccountAddressBookPage myAccountAddressBookpage;
	private CheckOutPage checkoutPage;

	private OrderConfirmationPage orderConfirmationPage;
	BaseClass obj;

	public TaxValidationTest(BaseClass obj) {
		super(obj);
		this.obj = obj;

		// TODO Auto-generated constructor stub
	}

	public void createObjects(String browser) {
		obj.driver = driver;
		obj.currentBrowser = browser;
		productGridPage = new ProductGridPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		giftcardPage = new	GiftCardsPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		homePage = new HomePage(obj);
		checkoutPage = new CheckOutPage(obj);
		myAccountPage = new MyAccountPage(obj);
		myAccountAddressBookpage = new MyAccountAddressBookPage(obj);
		myAccountPage = new MyAccountPage(obj);
		myAccountAddressBookPage = new MyAccountAddressBookPage(obj);
		myAccountPaymentMethodsPage = new MyAccountPaymentMethodsPage(obj);
	}

	public void destroyObjects() {
		departmentNavigation = null;
		productGridPage = null;
		productDescriptionPage = null;
		shoppingcartPage = null;
		homePage = null;
		giftcardPage = null;
		checkoutPage = null;
		myAccountPage = null;
		myAccountAddressBookPage = null;
		myAccountPaymentMethodsPage = null;
		myAccountAddressBookpage = null;
		
	}

	private static DecimalFormat df2 = new DecimalFormat(".##");
	private String dynamicUsername,username;

	public void taxValidationTestScenario(String machineName, String host, String port, String browser, String os,
			String browserVersion, String osVersion, String tcId) {

		// Verify add to cart of Each product (
		// suits,ties,accessory,pant,shoes,physical gift card and egift card)
		// works correctly

		try {
			//openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			
			String Scenario = retrieve("Description");
			String Address = retrieve("ShippingAddress");
			String City = retrieve("ShippingCity");
			String Zip = retrieve("EditStoreZipCode");
			//String SkuId = retrieve("Color");
			//String OrderNumber = retrieve("Price");
			//String SubTotal = retrieve("URL");
			String TaxRates = retrieve("TaxRates");
			String State = retrieve("ShippingState"); 
			String OrderNumber = null, TaxCalculatedintheSite= null, TaxCalculatedManually=null, SubTotal=null, SkuID = null;


			if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
				getJSESSIONIDOnceBrowserInitiated();
				getCLONEIDOnceBrowserInitiated();
			}
			verifyUSFlagSelected();

			//clickOnBackToTopLinkInFooter();


			if (retrieve("AccountType").equalsIgnoreCase("PF")) {
				if (retrieve("UserType").equalsIgnoreCase("Register")) {

					signInToApp(retrieve("UserName"),retrieve("Password"));
					waitTime(4);
					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();
					waitTime(4);
					homePage.ClickonHomePageLogo();

					String description = retrieve("Description");
					testStepInfo("Scenario Name: " + description);

					switch (description) {
					case "Store Order With 2 Lines":

						homePage.ClickonHeaderlinkgreetinglink();

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
						waitTime(3);
						homePage.ClickonHomePageLogo();
						waitTime(2);

						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentNameOne"),retrieve("SubCategoryNameOne"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						String PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();

						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
						productDescriptionPage.clickPDPAddtoShoppingBagButton();

						
						departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentNameTwo"),retrieve("SubCategoryNameTwo"));

						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
						productDescriptionPage.clickPDPAddtoShoppingBagButton();

						viewshoppingbag();

						shoppingcartPage.clickOnCheckoutButtonregistereduser();

						checkoutPage.clickShippingEditLinkinReviewTab();
						
						checkoutPage.verifyShippingEditModelOverlayisDisplayedinReviewTab();
						
						checkoutPage.ClickonShipttoStoreinShippingEditModelinReviewTab();
						
						checkoutPage.ClickonSelectDifferentStoreinShipttoStoreinShippingEditModelinReviewTab();
						
						checkoutPage.FillZipCodeforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab(retrieve("EditStoreZipCode"));
						
						checkoutPage.ClickOnFindAddressforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab();
						
						if(checkoutPage.VerifyStoreResultsforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab())
						{
						
							checkoutPage.selectFirstStoreFromStoreSearchListDisplayed();
							
						}
						
									
						checkoutPage.ClickonContinueinShippingEditModelinReviewTab();
						
						checkoutPage.VerifyReviewTab();

						break;

					case "Ship To Address":

						homePage.ClickonHeaderlinkgreetinglink();

						myAccountPage.clickOnAddressBookInMyAccountPage();

						if(myAccountAddressBookpage.isAddressDetailAvailableInMyAccountPaymentMethodsPage()){
							waitTime(2);
							myAccountAddressBookpage.removeAllAddressInAddressBookPage();
						}
						waitTime(2);		
						myAccountPage.clickOnAccountInfoLink();

						myAccountPage.clickOnAccountInfo_PaymentMethodsLink();

						if(myAccountPaymentMethodsPage.isPaymentDetailAvailableInMyAccountPaymentMethodsPage()){
							waitTime(2);
							myAccountPaymentMethodsPage.removeAllCardDetailsInMyAccountPaymentMethodsPage();
						}
						waitTime(3);
						homePage.ClickonHomePageLogo();
						waitTime(2);

						departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentNameOne"),retrieve("SubCategoryNameOne"));

						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						

						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
						//String PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();
						
						productDescriptionPage.clickPDPAddtoShoppingBagButton();

						viewshoppingbag();

						shoppingcartPage.clickOnCheckoutButtonregistereduser();

						checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));
						checkoutPage.clickShippingContinue();

						myAccountPage.SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue();
						checkoutPage.fillCreditCardDetails(retrieve("PaymentCardType"), retrieve("PaymentCardNumber"), retrieve("PaymentExpireMonth"), retrieve("PaymentExpireYear"), retrieve("PaymentCvv"));

						checkoutPage.clickOnSameAsShippingCheckBoxFromCheckOutPage();

						checkoutPage.clickPaymentContinue();

						break;

					case "Store Order With 1 Line":

						homePage.ClickonHeaderlinkgreetinglink();

						myAccountPage.clickOnAddressBookInMyAccountPage();
						waitTime(2);
						myAccountPage.clickOnAddressBook_AddNewAddressButton();

						myAccountPage.fillDetails_AddressBook_AddNewAddress1(retrieve("AccountDashboard_ShippingAddr_FirstName"), retrieve("AccountDashboard_ShippingAddr_LastName"), retrieve("AccountDashboard_ShippingAddr_Address"), retrieve("AccountDashboard_ShippingAddr_City"));

						myAccountPage.select_AddressBook_AddNewAddress_State(retrieve("AccountDashboard_ShippingAddr_State"));

						myAccountPage.fillDetails_AddressBook_AddNewAddress2(retrieve("AccountDashboard_ShippingAddr_Zip"), retrieve("AccountDashboard_ShippingAddr_Telephone"));

						myAccountPage.clickOnAddressBook_AddNewAddress_SubmitButton();
						myAccountPage.SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue();
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
						waitTime(3);
						homePage.ClickonHomePageLogo();
						waitTime(2);

						departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentNameOne"),retrieve("SubCategoryNameOne"));

						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						//String PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();

						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
						productDescriptionPage.clickPDPAddtoShoppingBagButton();

						viewshoppingbag();

						shoppingcartPage.clickOnCheckoutButtonregistereduser();

						checkoutPage.verifyShippingEditModelOverlayisDisplayedinReviewTab();
						
						checkoutPage.ClickonShipttoStoreinShippingEditModelinReviewTab();
						
						checkoutPage.ClickonSelectDifferentStoreinShipttoStoreinShippingEditModelinReviewTab();
						
						checkoutPage.FillZipCodeforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab(retrieve("EditStoreZipCode"));
						
						checkoutPage.ClickOnFindAddressforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab();
						
						if(checkoutPage.VerifyStoreResultsforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab())
						{
						
							checkoutPage.selectFirstStoreFromStoreSearchListDisplayed();
							
						}
						
									
						checkoutPage.ClickonContinueinShippingEditModelinReviewTab();
						
						checkoutPage.VerifyReviewTab();

						break;

					case "Ship To Address with 3 Line Items out of which 1 should be Physical Gift Card":

						homePage.ClickonHeaderlinkgreetinglink();

						myAccountPage.clickOnAddressBookInMyAccountPage();

						if(myAccountAddressBookpage.isAddressDetailAvailableInMyAccountPaymentMethodsPage()){
							waitTime(2);
							myAccountAddressBookpage.removeAllAddressInAddressBookPage();
						}
						waitTime(2);		
						myAccountPage.clickOnAccountInfoLink();

						myAccountPage.clickOnAccountInfo_PaymentMethodsLink();

						if(myAccountPaymentMethodsPage.isPaymentDetailAvailableInMyAccountPaymentMethodsPage()){
							waitTime(2);
							myAccountPaymentMethodsPage.removeAllCardDetailsInMyAccountPaymentMethodsPage();
						}
						waitTime(3);
						homePage.ClickonHomePageLogo();
						waitTime(2);

						String FooterLink = retrieve("FooterLink");

						String GiftCardtype = retrieve("GiftCardType"); 

						if (FooterLink.equalsIgnoreCase("Gift Cards")) {

							homePage.ClickonGiftCardsFooterLink();

						if (GiftCardtype.equalsIgnoreCase("Classic Gift Card")) {

							giftcardPage.clickPhysicalGiftCardCustomizeButton();
							
							giftcardPage.fillPhysicalGiftCardDetails(retrieve("ReceipientName"), retrieve("SenderName"), retrieve("GiftAmount"), retrieve("GiftMessage"));
							giftcardPage.clickPhysicalGiftCardAddToShoppingBagButton();

							}
						}
						departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentNameOne"),retrieve("SubCategoryNameOne"));

						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						//String PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();

						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
						productDescriptionPage.clickPDPAddtoShoppingBagButton();

						
						departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentNameTwo"),retrieve("SubCategoryNameTwo"));

						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
						productDescriptionPage.clickPDPAddtoShoppingBagButton();

						viewshoppingbag();

						shoppingcartPage.clickOnCheckoutButtonregistereduser();

						checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));
						checkoutPage.clickShippingContinue();

						myAccountPage.SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue();
						checkoutPage.fillCreditCardDetails(retrieve("PaymentCardType"), retrieve("PaymentCardNumber"), retrieve("PaymentExpireMonth"), retrieve("PaymentExpireYear"), retrieve("PaymentCvv"));

						checkoutPage.clickOnSameAsShippingCheckBoxFromCheckOutPage();

						checkoutPage.clickPaymentContinue();
						waitTime(4);
						break;



					default:
					}
				} else {
					if (retrieve("UserType").equalsIgnoreCase("Guest")) {
						
						shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();
						
						homePage.ClickonHomePageLogo();
						
						String description = retrieve("Description");
						testStepInfo("Scenario Name: " + description);

						switch (description) {
						case "Guest user (With PF ID linked to the email) with product price less than $50":
							
							
							departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentNameOne"),retrieve("SubCategoryNameOne"));

							productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
							
							//String PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();

							productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
							
							productDescriptionPage.clickPDPAddtoShoppingBagButton();
							
							clickOnBackToTopLinkInFooter();
							
							shoppingcartPage.clickCheckoutasGuestToggle();



							username=retrieve("GuestEmail");
							dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
							System.out.println("The random email: "+dynamicUsername);
							
							shoppingcartPage.fillEmailCheckoutasGuest(dynamicUsername);
							
							shoppingcartPage.clickCheckoutasGuestButton();
							
														
							checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));
							checkoutPage.clickShippingContinue();

							myAccountPage.SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue();
							checkoutPage.fillCreditCardDetails(retrieve("PaymentCardType"), retrieve("PaymentCardNumber"), retrieve("PaymentExpireMonth"), retrieve("PaymentExpireYear"), retrieve("PaymentCvv"));

							checkoutPage.clickOnSameAsShippingCheckBoxFromCheckOutPage();

							checkoutPage.clickPaymentContinue();
							waitTime(4);
							break;
					}
					
				}
				}
			}
			else {
				if (retrieve("AccountType").equalsIgnoreCase("Non-PF")) {
					if (retrieve("UserType").equalsIgnoreCase("Guest")) {
						
						shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();
						
						homePage.ClickonHomePageLogo();
						
						String description = retrieve("Description");
						testStepInfo("Scenario Name: " + description);

						switch (description) {
						case "Guest user (not a PF user) with product price less than $50 ":
							
							
							departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentNameOne"),retrieve("SubCategoryNameOne"));

							productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
							
							//String PDPProductName = productDescriptionPage.getProductNameInProductDescriptionPage();

							productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
							
							productDescriptionPage.clickPDPAddtoShoppingBagButton();
							
							clickOnBackToTopLinkInFooter();
							
							shoppingcartPage.clickCheckoutasGuestToggle();



							username=retrieve("GuestEmail");
							dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
							System.out.println("The random email: "+dynamicUsername);
							
							shoppingcartPage.fillEmailCheckoutasGuest(dynamicUsername);
							
							shoppingcartPage.clickCheckoutasGuestButton();
							
														
							checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));
							checkoutPage.clickShippingContinue();

							myAccountPage.SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue();
							checkoutPage.fillCreditCardDetails(retrieve("PaymentCardType"), retrieve("PaymentCardNumber"), retrieve("PaymentExpireMonth"), retrieve("PaymentExpireYear"), retrieve("PaymentCvv"));

							checkoutPage.clickOnSameAsShippingCheckBoxFromCheckOutPage();

							checkoutPage.clickPaymentContinue();
							waitTime(4);
							break;
					}

					}
				}

			}

			waitTime(3);
			String subTotalPrice = checkoutPage.getSubTotalPrice();
			testStepPassed("price of all product: " +subTotalPrice);
			String estTaxes = checkoutPage.getEstTaxes();

			String taxRate = retrieve("TaxRates");
			testStepPassed("tax rate: " + taxRate);
			double subTotall = Double.parseDouble(subTotalPrice);
			double taxRates = Double.parseDouble(taxRate);

			double taxCalculation = subTotall * taxRates;

			testStepInfo("Tax calculated from the site: " +estTaxes);
			

			String calculatedTax = Double.toString(taxCalculation);
			//testStepPassed("calculatedTax" + calculatedTax);
			if(calculatedTax.equals("0.0")) {
				calculatedTax = calculatedTax+"00";
			}
			String taxFromAutomation = String.format ("%.2f", taxCalculation);
			//String taxFromAutomation = calculatedTax.substring(0, calculatedTax.lastIndexOf(".")+2);
			String taxFromUI = estTaxes.substring(0,5);

			//String taxFromAutomation = df2.format(taxCalculation);
			testStepInfo("Tax Calculated through automation: " + taxFromAutomation);
			System.out.println("Calculated Tax before"+calculatedTax);
			System.out.println("Calculated Tax After"+taxFromAutomation);
			System.out.println("Tax from UI Before"+estTaxes);
			System.out.println("Tax from UI After"+taxFromUI);
			if(estTaxes.equalsIgnoreCase(taxFromAutomation)) {
				testStepInfo("Tax calculated through automation and Tax calulated in the site are same");
			}
			else {
				testStepFailed("Tax calculated through automation and Tax calulated in the site are different");
			}

			waitTime(3);
			checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));

			checkoutPage.verifyPlaceOrderButtonisDisabled();

			if (checkoutPage.clickOnPlaceOrder()) {

				OrderNumber = orderConfirmationPage.getOrderNumber();
				SkuID = orderConfirmationPage.getSKUID();
				homePage.ClickonHomePageLogo();

			}
			

			else {
				homePage.ClickonHomePageLogo();
				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();
			}
			
			SubTotal = Double.toString(subTotall);
			
			TaxCalculatedManually = taxFromAutomation;
			TaxCalculatedintheSite = estTaxes;
			
			CreateNewRowandEnterValuesTaxValidation(Scenario, Address, City, State, Zip, SkuID, OrderNumber, SubTotal, TaxCalculatedintheSite, TaxRates, TaxCalculatedManually);


			homePage.ClickonSignoutinHeaderlinkgreetinglink();
			homePage.verifyUserLoggedOutSuccessfully();

		} catch (Exception e) {
			testStepFailed("Exception occured : " + e.toString());
		} finally {
			if (myAccountPage.testCaseExecutionStatus || productGridPage.testCaseExecutionStatus
					|| productDescriptionPage.testCaseExecutionStatus || shoppingcartPage.testCaseExecutionStatus
					||departmentNavigation.testCaseExecutionStatus || myAccountAddressBookpage.testCaseExecutionStatus
					||checkoutPage.testCaseExecutionStatus || orderConfirmationPage.testCaseExecutionStatus
					|| homePage.testCaseExecutionStatus || giftcardPage.testCaseExecutionStatus) {
				this.testCaseExecutionStatus = true;
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