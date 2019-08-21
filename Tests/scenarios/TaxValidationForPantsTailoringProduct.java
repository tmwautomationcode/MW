package scenarios;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.MyAccountPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.DepartmentNavigation;
import mwPages.CheckOutPage;



public class TaxValidationForPantsTailoringProduct extends PopupWindows{

	private BaseClass obj;
	private PopupWindows popupWindows;
	private ProductGridPage productGridPage;
	private ProductDescriptionPage productDescriptionPage;
	private ShoppingCartPage shoppingCartPage;
	private CheckOutPage checkOutPage;
	private OrderConfirmationPage orderConfirmationPage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private ShoppingCartPage shoppingcartPage;
	private DepartmentNavigation departmentNavigation;
	private CheckOutPage checkoutPage;

	public TaxValidationForPantsTailoringProduct(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		popupWindows=new PopupWindows(obj);
		productGridPage = new ProductGridPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		shoppingCartPage = new ShoppingCartPage(obj);
		checkOutPage = new CheckOutPage(obj);
		orderConfirmationPage = new OrderConfirmationPage(obj);
		homePage = new HomePage(obj);
		myAccountPage = new	MyAccountPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		checkoutPage = new CheckOutPage(obj);
	}

	public void destroyObjects(){
		popupWindows= null;
		productGridPage = null;
		productDescriptionPage = null;
		shoppingCartPage = null;
		checkOutPage = null;
		orderConfirmationPage = null;
		homePage = null;
		shoppingcartPage = null;
		departmentNavigation = null;
		checkoutPage = null;
	}

	String productNameInPGP = null;
	String productNameInPDP = null;
	double productPriceInPDP,tailorAndHemPriceInPDP, totalPriceInPDP;
	int productCount = 0;

	public void taxvalidationforpantsTailoringProductScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{


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

				shoppingCartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}

			else if (browser.equalsIgnoreCase("Safari")) 
			{
				shoppingCartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
			}

			else 
			{

				shoppingCartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

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
			
			waitTime(5);
			
			try {
				if (driver.findElement(By.xpath("//ul[@class='addys clearfix']/li")).isDisplayed()){

				myAccountPage.clickOnAddressBook_DeleteAddress_Link();

				myAccountPage.clickOnAddressBook_DeleteAddressDialog_DeleteButton();

				myAccountPage.verify_AddressBook_DeleteAddress_Delete_MessageandClose();
				
				}
				else{
				testStepInfo("address is not present in address book");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				testStepInfo("address is not present in address book");
			}
		
			waitTime(2);	
			
			/*myAccountPage.clickOnAccountInfoLink();

			myAccountPage.clickOnAccountInfo_PaymentMethodsLink();
			if (driver.findElement(By.xpath("//ul[@class='payment-methods clearfix']")).isDisplayed()){
				
				myAccountPage.clickOnPaymentmethod_removePayment();

				myAccountPage.clickOnPaymentmethod_DeletepaymentDialog_DeleteButton();

				myAccountPage.verify_Payment_DeletePayment_Delete_MessageandClose();
				
				*/
				
				
		
		

			
			
				/*myAccountPage.clickOnAddressBookLink();

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

*/





				/*myAccountPage.clickOnAccountInfoLink();

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
				waitTime(3);*/
				homePage.ClickonHomePageLogo();
				waitTime(2);

				
				
				
				String description = retrieve("Description");
				testStepInfo("Scenario Name: " + description);

				switch (description) {
				case "order with 1 service line item (dress shirt)":
	
					if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
					{
						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNameone"),retrieve("SubCategoryNameone"));
						
						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
					}
					else
					{
						searchProductnew(retrieve("SkuID"));
						
						waitTime(5);
						
						productDescriptionPage.getProductNameInProductDescriptionPage();
					}
					
					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
					
					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

					    //productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} 
					else 
					{
						testStepInfo("Tailor & Hem Checkbox is not displayed");
					}


					//homePage.ClickonHomePageLogo();

					productDescriptionPage.clickPDPAddtoShoppingBagButton();
					
					if (browser.equalsIgnoreCase("InternetExplorer")) {

						homePage.RegisteredUserProceedtoCheckoutinIE();

					}
					else {

						viewshoppingbagwithcheckout();

					}
					
					

					checkOutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

					checkOutPage.clickShippingContinue();

					checkOutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

					checkOutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

					checkOutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

					checkOutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

					checkOutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

					checkOutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

					checkOutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
					
					checkOutPage.clickPaymentContinue();

					break;

				case "order with 3 service line items (dress shirt + dress pant+ suit)":
					
					if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
					{
						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNameone"),retrieve("SubCategoryNameone"));
						
						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
					}
					else
					{
						searchProductnew(retrieve("SkuID"));
						
						waitTime(5);
						
						productDescriptionPage.getProductNameInProductDescriptionPage();
					}
					
					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
					
					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

						//productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} 
					else 
					{
						testStepInfo("Tailor & Hem Checkbox is not displayed");
					}


					//homePage.ClickonHomePageLogo();
					productDescriptionPage.clickPDPAddtoShoppingBagButton();
					
					if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
					{
						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNametwo"),retrieve("SubCategoryNametwo"));
						
						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
					}
					else
					{
						searchProductnew(retrieve("SkuID"));
						
						waitTime(5);
						
						productDescriptionPage.getProductNameInProductDescriptionPage();
					}
					
					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
					
					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

					    //productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} 
					else 
					{
						testStepInfo("Tailor & Hem Checkbox is not displayed");
					}


					//homePage.ClickonHomePageLogo();

					productDescriptionPage.clickPDPAddtoShoppingBagButton();
					if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
					{
						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNamethree"),retrieve("SubCategoryNamethree"));
						
						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
					}
					else
					{
						searchProductnew(retrieve("SkuID"));
						
						waitTime(5);
						
						productDescriptionPage.getProductNameInProductDescriptionPage();
					}
					
					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
					
					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

					    //productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} 
					else 
					{
						testStepInfo("Tailor & Hem Checkbox is not displayed");
					}


					//homePage.ClickonHomePageLogo();

					productDescriptionPage.clickPDPAddtoShoppingBagButton();
					
					

					if (browser.equalsIgnoreCase("InternetExplorer")) {

						homePage.RegisteredUserProceedtoCheckoutinIE();

					}
					else {

						viewshoppingbagwithcheckout();

					}
					
					

					checkOutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

					checkOutPage.clickShippingContinue();

					checkOutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

					checkOutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

					checkOutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

					checkOutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

					checkOutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

					checkOutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

					checkOutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
					
					checkOutPage.clickPaymentContinue();

					break;

				case "order with 1 service line item (suit)":
					
					if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
					{
						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNameone"),retrieve("SubCategoryNameone"));
						
						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
					}
					else
					{
						searchProductnew(retrieve("SkuID"));
						
						waitTime(5);
						
						productDescriptionPage.getProductNameInProductDescriptionPage();
					}
					
					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
					
					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

						//productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} 
					else 
					{
						testStepInfo("Tailor & Hem Checkbox is not displayed");
					}


					//homePage.ClickonHomePageLogo();

					productDescriptionPage.clickPDPAddtoShoppingBagButton();
					if (browser.equalsIgnoreCase("InternetExplorer")) {

						homePage.RegisteredUserProceedtoCheckoutinIE();

					}
					else {

						viewshoppingbagwithcheckout();

					}
					
					

					checkOutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

					checkOutPage.clickShippingContinue();

					checkOutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

					checkOutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

					checkOutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

					checkOutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

					checkOutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

					checkOutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

					checkOutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
					
					checkOutPage.clickPaymentContinue();

					
				case "order with 3 service line items":
					
					if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
					{
						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNameone"),retrieve("SubCategoryNameone"));
						
						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
					}
					else
					{
						searchProductnew(retrieve("SkuID"));
						
						waitTime(5);
						
						productDescriptionPage.getProductNameInProductDescriptionPage();
					}
					
					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
					
					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

						//productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} 
					else 
					{
						testStepInfo("Tailor & Hem Checkbox is not displayed");
					}


					//homePage.ClickonHomePageLogo();
					productDescriptionPage.clickPDPAddtoShoppingBagButton();
					
					if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
					{
						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNametwo"),retrieve("SubCategoryNametwo"));
						
						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
					}
					else
					{
						searchProductnew(retrieve("SkuID"));
						
						waitTime(5);
						
						productDescriptionPage.getProductNameInProductDescriptionPage();
					}
					
					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
					
					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

					    //productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} 
					else 
					{
						testStepInfo("Tailor & Hem Checkbox is not displayed");
					}


					//homePage.ClickonHomePageLogo();

					productDescriptionPage.clickPDPAddtoShoppingBagButton();
					

					if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
					{
						//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
						
						departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNamethree"),retrieve("SubCategoryNamethree"));
						
						productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
						
						productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
						
					}
					else
					{
						searchProductnew(retrieve("SkuID"));
						
						waitTime(5);
						
						productDescriptionPage.getProductNameInProductDescriptionPage();
					}
					
					productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
					
					productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
					
					if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
					{

						productDescriptionPage.selectTailorAndHemCheckbox();

						tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

						productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

						productDescriptionPage.selectInseam(retrieve("Inseam"));

					    //productDescriptionPage.clickPDPAddtoShoppingBagButton();

					} 
					else 
					{
						testStepInfo("Tailor & Hem Checkbox is not displayed");
					}


					//homePage.ClickonHomePageLogo();

					productDescriptionPage.clickPDPAddtoShoppingBagButton();
					
					if (browser.equalsIgnoreCase("InternetExplorer")) {

						homePage.RegisteredUserProceedtoCheckoutinIE();

					}
					else {

						viewshoppingbagwithcheckout();

					}
					
					

					checkOutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

					checkOutPage.clickShippingContinue();

					checkOutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

					checkOutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

					checkOutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

					checkOutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

					checkOutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

					checkOutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

					checkOutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
					
					checkOutPage.clickPaymentContinue();

					break;
										

		case "order with 1 service line item":
			
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentNameone"),retrieve("SubCategoryNameone"));
				
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
			}
			else
			{
				searchProductnew(retrieve("SkuID"));
				
				waitTime(5);
				
				productDescriptionPage.getProductNameInProductDescriptionPage();
			}
			
			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
			
			if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
			{

				productDescriptionPage.selectTailorAndHemCheckbox();

				tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

				productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

				productDescriptionPage.selectInseam(retrieve("Inseam"));

				//productDescriptionPage.clickPDPAddtoShoppingBagButton();

			} 
			else 
			{
				testStepInfo("Tailor & Hem Checkbox is not displayed");
			}


			//homePage.ClickonHomePageLogo();

			productDescriptionPage.clickPDPAddtoShoppingBagButton();
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else {

				viewshoppingbagwithcheckout();

			}
			
			

			checkOutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkOutPage.clickShippingContinue();

			checkOutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkOutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkOutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkOutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkOutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkOutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

			checkOutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
			
			checkOutPage.clickPaymentContinue();
			break;
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
				//String taxFromAutomation = String.format ("%.2f", taxCalculation);
				String taxFromAutomation = calculatedTax.substring(0, calculatedTax.lastIndexOf(".")+2);
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

				/*waitTime(3);
				checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));

				checkoutPage.verifyPlaceOrderButtonisDisabled();

				if (checkoutPage.clickOnPlaceOrder()) {

					orderConfirmationPage.getOrderNumber();
					homePage.ClickonHomePageLogo();

				}

				else {
					homePage.ClickonHomePageLogo();
					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();
				}

				homePage.ClickonSignoutinHeaderlinkgreetinglink();
				homePage.verifyUserLoggedOutSuccessfully();
				
				
	*/
				//homePage.ClickonHomePageLogo();
				homePage.ClickonHomePageLogoreviewpage();
		
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
		
		}catch(Exception e){
			testStepFailed("Exception occured :"+e);
		}finally{
			if(popupWindows.testCaseExecutionStatus||
					productGridPage.testCaseExecutionStatus||
					productDescriptionPage.testCaseExecutionStatus||
					shoppingCartPage.testCaseExecutionStatus||
					checkOutPage.testCaseExecutionStatus||
					orderConfirmationPage.testCaseExecutionStatus||
					homePage.testCaseExecutionStatus){
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

	private void testStepInfo() {
		// TODO Auto-generated method stub
		
	}

	private void teststepinfo() {
		// TODO Auto-generated method stub
		
	}

}