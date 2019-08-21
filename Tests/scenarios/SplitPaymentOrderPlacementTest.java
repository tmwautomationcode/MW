package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.HomePage;
import mwPages.DepartmentNavigation;


public class SplitPaymentOrderPlacementTest extends PopupWindows{

	private BaseClass obj;

	private OrderConfirmationPage orderconfirmationPage;
	private DepartmentNavigation departmentNavigation;
	private CheckOutPage checkoutPage;
	private ShoppingCartPage shoppingcartPage;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private HomePage homePage;
	private String dynamicUsername=null,username=null;

	public SplitPaymentOrderPlacementTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		orderconfirmationPage = new	OrderConfirmationPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);
	}

	public void destroyObjects(){


		checkoutPage = null;
		orderconfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage = null;
		departmentNavigation = null;
	}

	public void SplitPaymentOrderPlacementTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			/*
			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) 
			{
				
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
				
				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
				
			}
			
			else
			{
				searchProductnew(retrieve("SkuID"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
				
				productDescriptionPage.getProductNameInProductDescriptionPage();
			}
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
			
			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//productDescriptionPage.clickHomePageLogoinPDPPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else 
			{

				//viewshoppingbag();
				clickonChromeFirefoxCheckout();

			}


			//shoppingcartPage.clickBackToTopButton();

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
			
			checkoutPage.GetOrderSummaryTotalBeforeGiftCardReedemtion();
			
			checkoutPage.checkGiftCardNumberPinNoisDisplayed();

			checkoutPage.fillGiftCardReedemtionGiftCarddetails(retrieve("GiftCardNo"), retrieve("GiftCardPin"));

			checkoutPage.clickGiftCardReedemtionGiftCardApply();
			
			checkoutPage.GetGiftCardReedemedAmount();
			
			checkoutPage.GetOrderSummaryTotalAfterGiftCardReedemtion();
			
			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));


            checkoutPage.fillpaymentpageemailaddress(dynamicUsername);
			 
            checkoutPage.clickPaymentContinue();
			
			checkoutPage.checkGiftCardCollapseLink();

			if(checkoutPage.clickPlaceOrderButton())
			{
				
				orderconfirmationPage.clickOnCloseButtonInSurveyFormPopup();
				
				orderconfirmationPage.getOrderNumber();
				
				checkoutPage.clickOrderConfirmationPageApplicationLogo();

			}
			else{
				clickOnMensWearhouseLogo();
				waitTime(3);


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

		}
		catch(Exception e){
			testStepFailed("Exception Occured:" +e);
		}
		finally{
			if(checkoutPage.testCaseExecutionStatus ||
					orderconfirmationPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus){
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