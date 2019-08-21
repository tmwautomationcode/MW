package scenarios;

import mwPages.CheckOutPage;
import mwPages.EGiftCardPage;

import mwPages.GiftCardsPage;
import mwPages.MyAccountAddressBookPage;
import mwPages.MyAccountPage;
import mwPages.MyAccountPaymentMethodsPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ShoppingCartPage;
import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.HomePage;


public class EGiftCardMemberTest extends PopupWindows{

	private BaseClass obj;

	private EGiftCardPage eGiftcardPage;
	private CheckOutPage checkoutPage;
	private ShoppingCartPage shoppingcartPage;
	private OrderConfirmationPage orderConfirmationPage;
	private GiftCardsPage giftcardPage;
	private ProductDescriptionPage productDescriptionPage;
	private MyAccountPage myAccountPage;
	private MyAccountAddressBookPage myAccountAddressBookPage;
	private MyAccountPaymentMethodsPage myAccountPaymentMethodsPage;
	private HomePage homePage;
	

	public EGiftCardMemberTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		eGiftcardPage = new	EGiftCardPage(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		giftcardPage=new GiftCardsPage(obj);
		myAccountPage=new MyAccountPage(obj);
		myAccountAddressBookPage=new MyAccountAddressBookPage(obj);
		myAccountPaymentMethodsPage=new MyAccountPaymentMethodsPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		homePage= new HomePage(obj);
	}


	public void destroyObjects(){
		checkoutPage = null;
		eGiftcardPage = null;
		orderConfirmationPage = null;
		shoppingcartPage = null;
		giftcardPage=null;
		myAccountPage=null;
		myAccountAddressBookPage=null;
		myAccountPaymentMethodsPage=null;
		productDescriptionPage = null;
		homePage= null;
	}





	public void EGiftCardMemberTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{
			//1.Open site
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {

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
			
			else {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			//shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			//homePage.ClickonHomePageLogo();

			homePage.ClickonGiftCardsFooterLink();

			giftcardPage.clickEGiftCardCustomizeButton();

			giftcardPage.fillEGiftCardDetails(retrieve("ReceipientName"), retrieve("SenderName"), retrieve("ReceipientEmail"), retrieve("ReceipientConfirmEmail"), retrieve("GiftAmount"), retrieve("GiftMessage"));

			/*giftcardPage.fillEGiftCardDetails1(retrieve("ReceipientName"), retrieve("SenderName"), retrieve("ReceipientEmail"), retrieve("ReceipientConfirmEmail"));

			giftcardPage.selectEGiftCardAmount(retrieve("GiftAmount"));

			giftcardPage.fillEGiftCardDetails2(retrieve("GiftMessage"));*/

			if (browser.equalsIgnoreCase("Firefox")) {

				homePage.mouseoverApplicationLogo();

			}

			giftcardPage.clickEGiftCardAddToShoppingBagButton();

			homePage.ClickonHomePageLogo();
			
			

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{				
				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}


			//shoppingcartPage.clickCheckoutasRegisteredUserToggleButton();
			
			//shoppingcartPage.clickBackToTopButton();
			
			shoppingcartPage.VerifyGiftCardShippingChargeFreeinShoppingCartOrderTotalWidget();

			shoppingcartPage.fillCheckoutasRegisteredUserDetails(retrieve("Username"), retrieve("Password"));

			shoppingcartPage.clickSignInToCheckoutButton();

			shoppingcartPage.verifyProductCountinShoppingBagHeadingandIfCountismorethan1RemoveOtherItemsandCheckout();

			//checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			//checkoutPage.clickShippingContinue();

			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			//checkoutPage.clickBillingSameasShippingCheckbox();

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

			/*checkoutPage.fillPaymentBillingDetails1(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"));

			checkoutPage.selectPaymentBillingState(retrieve("BillingState"));

			checkoutPage.fillPaymentBillingDetails2(retrieve("BillingZipCode"), retrieve("BillingTelephone"));*/
			
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
			else
			{
				homePage.ClickonHomePageLogo();
				
				
				waitTime(3);
				
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
				homePage.ClickonHomePageLogo();
				waitTime(3);

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

		}catch(Exception e){
			testStepFailed(e.toString());
		}finally{
			if(checkoutPage.testCaseExecutionStatus ||
					eGiftcardPage.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					myAccountPage.testCaseExecutionStatus ||
					myAccountAddressBookPage.testCaseExecutionStatus ||
					myAccountPaymentMethodsPage.testCaseExecutionStatus ||
					giftcardPage.testCaseExecutionStatus ){
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
