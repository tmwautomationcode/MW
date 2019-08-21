package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.ClassicGiftCardPage;
import mwPages.GiftCardsPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.HomePage;
import mwPages.DepartmentNavigation;

public class PhysicalGiftCardAndAnyOneProductOrderPlacementTest extends PopupWindows{

	private BaseClass obj;

	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private GiftCardsPage giftcardPage;
	private ClassicGiftCardPage classicGiftcardPage;
	private ShoppingCartPage shoppingcartPage;
	private CheckOutPage checkoutPage;
	private OrderConfirmationPage orderConfirmationPage;
	private HomePage homePage;
	private DepartmentNavigation departmentNavigation;

	private String username=null, dynamicUsername=null;

	public PhysicalGiftCardAndAnyOneProductOrderPlacementTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		checkoutPage = new	CheckOutPage(obj);
		classicGiftcardPage = new	ClassicGiftCardPage(obj);
		giftcardPage = new	GiftCardsPage(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
	}

	
	public void destroyObjects(){
		
		checkoutPage = null;
		classicGiftcardPage = null;
		giftcardPage = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage= null;
		departmentNavigation = null;
	}
	
	
	
	
	public void PhysicalGiftCardAndAnyOneProductOrderPlacementTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{

			
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
			}
			else
			{
				searchProductnew(retrieve("SkuID"));
				
				waitTime(3);
				
				//productDescriptionPage.getProductNameInProductDescriptionPage();
			}
			
			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
			
			productDescriptionPage.clickPDPAddtoShoppingBagButton();
			
			//productDescriptionPage.clickHomePageLogoinPDPPage();
			
			/*
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else {

				//viewshoppingbag();
				clickonChromeFirefoxCheckout();

			}
			
			homePage.ClickonHomePageLogo();*/
			
			homePage.ClickonGiftCardsFooterLink();
			
			giftcardPage.clickPhysicalGiftCardCustomizeButton();
			
			giftcardPage.fillPhysicalGiftCardDetails(retrieve("ReceipientName"), retrieve("SenderName"), retrieve("GiftAmount"), retrieve("GiftMessage"));
			
			if (browser.equalsIgnoreCase("Firefox")) {

				homePage.mouseoverApplicationLogo();

			}
			
			giftcardPage.clickPhysicalGiftCardAddToShoppingBagButton();
			
			//homePage.ClickonHomePageLogo();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else {

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}
			
			//shoppingcartPage.clickBackToTopButton();
			
			String ProductCount = shoppingcartPage.getProductCountinShoppingCartPage("ProductCount");

			if (ProductCount.equalsIgnoreCase("2 item(s)")) 
			{	
				testStepInfo("Product Count is 2");
			}

			else 
			{
				testStepFailed("Product count is not 2");
			}
			
			shoppingcartPage.clickCheckoutasGuestToggle();
			
			username=retrieve("GuestEmail");
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			System.out.println("The random email: "+dynamicUsername);
			
			//shoppingcartPage.clickBackToTopButton();
			
			//shoppingcartPage.fillEmailCheckoutasGuest(dynamicUsername);
			
			//shoppingcartPage.clickBackToTopButton();
			
			//shoppingcartPage.clickCheckoutasGuestButton();
			
			checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkoutPage.clickShippingContinue();
			
			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));
			
			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));
			
			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));
			
			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));
			
			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));
			
			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));
			

            checkoutPage.fillpaymentpageemailaddress(dynamicUsername);
            
			checkoutPage.clickPaymentContinue();
			
			
			
			
			
		
			
			/*checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTabSafari();*/
			
			if(checkoutPage.clickPlaceOrderButton())
			{
				
				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();
				
				orderConfirmationPage.getOrderNumber();
				
				homePage.ClickonCheckOutHomePageLogo();
				
			}
			else{
				homePage.ClickonHomePageLogo();
								
				if (browser.equalsIgnoreCase("InternetExplorer")) {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

				}
				
				
				else if (browser.equalsIgnoreCase("Safari")) {
					shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
				}
				
				else {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}
				
				 clickOnMensWearhouseLogo();
				
			}
			
			
			
		}catch(Exception e){
			testStepFailed(e.toString());
		}finally{
			if(		checkoutPage.testCaseExecutionStatus ||
					classicGiftcardPage.testCaseExecutionStatus ||
					giftcardPage.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
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