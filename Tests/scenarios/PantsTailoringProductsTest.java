package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.HomePage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;



public class PantsTailoringProductsTest extends PopupWindows{

	private BaseClass obj;
	private PopupWindows popupWindows;
	private ProductGridPage productGridPage;
	private ProductDescriptionPage productDescriptionPage;
	private ShoppingCartPage shoppingCartPage;
	private CheckOutPage checkOutPage;
	private OrderConfirmationPage orderConfirmationPage;
	private HomePage homePage;

	public PantsTailoringProductsTest(BaseClass obj) {
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
	}

	public void destroyObjects(){
		popupWindows= null;
		productGridPage = null;
		productDescriptionPage = null;
		shoppingCartPage = null;
		checkOutPage = null;
		orderConfirmationPage = null;
		homePage = null;
	}

	String productNameInPGP = null;
	String productNameInPDP = null;
	double productPriceInPDP,tailorAndHemPriceInPDP, totalPriceInPDP;
	int productCount = 0;

	public void PantsTailoringProductsTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
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

			//homePage.ClickonHomePageLogo();


			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{

				System.out.println(retrieve("SearchProduct"));

				if (browser.equalsIgnoreCase("Safari")) 
				{
					searchProductSafari(retrieve("SearchProduct"));
				} 

				else if (browser.equalsIgnoreCase("Chrome")||(browser.equalsIgnoreCase("Firefox")||(browser.equalsIgnoreCase("InternetExplorer")))) {

					searchProductnew(retrieve("SearchProduct"));

				}

				//homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();

				/*productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				productGridPage.selectProductInProductGridPage(retrieve("ProductOne"));*/


			}
			else
			{
				searchProductnew(retrieve("SkuID"));

				waitTime(3);

			}

			//productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

			productNameInPDP = productDescriptionPage.getProductPrice();

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			if (productDescriptionPage.isTailorAndHemCheckboxDisplayed()) 
			{

				productDescriptionPage.selectTailorAndHemCheckbox();

				tailorAndHemPriceInPDP = productDescriptionPage.getTailorAndHemPriceInProductDescriptionPage();

				productDescriptionPage.chooseFinishOption(retrieve("FinishOption"));

				productDescriptionPage.selectInseam(retrieve("Inseam"));

				productDescriptionPage.clickPDPAddtoShoppingBagButton();

			} 
			else 
			{
				testStepFailed("Tailor & Hem Checkbox is not displayed");
			}


			//homePage.ClickonHomePageLogo();


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

			checkOutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));

			checkOutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));

			checkOutPage.EnterSavedCvvinReviewTabSafari();

			if (checkOutPage.CheckIfEditBillingModelisDisplayed()) 
			{

				checkOutPage.EnterSavedCardCvvandClickContinue(retrieve("CreditCardCvv"));

			}


			if(checkOutPage.clickPlaceOrderButton())
			{
				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();

				checkOutPage.clickOrderConfirmationPageApplicationLogo();
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

					shoppingCartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

				}


				else if (browser.equalsIgnoreCase("Safari")) {
					shoppingCartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
				}



				else {

					shoppingCartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}
				homePage.ClickonHomePageLogo();
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

}