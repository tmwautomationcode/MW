package scenarios;

import java.util.ArrayList;
import java.util.List;

import mwPages.CheckOutPage;
import mwPages.DepartmentNavigation;
import mwPages.ProductBundlePage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.HomePage;
import mwPages.OrderConfirmationPage;


public class BundlesSuitSeparatesTest extends PopupWindows{

	private BaseClass obj;

	private ShoppingCartPage shoppingcartPage;
	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private OrderConfirmationPage orderConfirmationPage;
	private CheckOutPage checkoutPage;
	private ProductGridPage productGridPage;
	private ProductBundlePage productbundlePage;
	private HomePage homePage;
	
	private	String dynamicUsername=null,username=null;

	public BundlesSuitSeparatesTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		departmentNavigation = new	DepartmentNavigation(obj);
		productbundlePage = new	ProductBundlePage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);
		
	}


	public void destroyObjects(){


		departmentNavigation = null;
		productbundlePage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage= null;
		
	}

	
	ArrayList<String> productAddedToCart = new ArrayList<String>();
	private List<String> productList;
	
	
	

	public void BundlesSuitSeparatesTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{
			
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			
			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) 
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

			homePage.ClickonHomePageLogo();
			
			//clickOnBackToTopLinkInFooter();



			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}

			
			

			//signInToApp(retrieve("UserName"), retrieve("Password"));

			waitTime(3);

			homePage.ClickonHomePageLogo();

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
			
		
			//clickOnFooterLinks("Pre-Styled Looks");
			
			//waitTime(2);
			
			//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"), retrieve("SubCategoryName"));
			
			departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			
			productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
			
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
			
			//productbundlePage.verifyBundleProductPageDisplayedIfNotRefreshThePage();
			productbundlePage.verifySuitSeparateBundleProductPageDisplayedIfNotRefreshThePage();
			
			
			productList=productbundlePage.getListOfProductListedInBundleProductPage();
			
			int ProductcountinBundlePage = productList.size();
			
			System.out.println("ProductcountinBundlePage : "+ProductcountinBundlePage);
			
			testStepInfo("Product Count in Suit Separates page : "+ProductcountinBundlePage);
			
			
			
			for(int i=1;i<=productList.size();i++) 
			{

				productbundlePage.selectSizeFromBundleProductPage_New(i, retrieve("ProductSize"));
				waitTime(3);

			}
			productbundlePage.clickOnAddToCartFromSuitSeparateProduct();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				//viewshoppingbag();
				homePage.RegisteredUserProceedtoCheckoutinIE();

			}



			else if (browser.equalsIgnoreCase("Safari")) 
			{
				Safariviewshoppingbag();
			}


			else 
			{
				waitTime(2);
				viewshoppingbag();
				//shoppingcartPage.clickOnCheckoutButtonregistereduser();
				//clickonChromeFirefoxCheckout();

			}		

			//shoppingcartPage.verifyShoppingCartPage();
			
			
			/*String ProductCountFull = shoppingcartPage.getProductCountinShoppingCartPage("ProductCount");
			
			//System.out.println("ProductCountFull : "+ProductCountFull);
			
			String ProductCountString = ProductCountFull.substring(0, ProductCountFull.lastIndexOf("I"));
			
			//System.out.println("ProductCountString : "+ProductCountString);
			
			String ProductCountStringEdited = ProductCountString.substring(0, ProductCountString.lastIndexOf(' '));
			
			//System.out.println("ProductCountStringEdited : "+ProductCountStringEdited);
			
			int ProductCountinShoppingCart = Integer.parseInt(ProductCountStringEdited);
			
			//System.out.println("ProductCountinShoppingCart : "+ProductCountinShoppingCart);
			
			if (ProductCountinShoppingCart==ProductcountinBundlePage) 
			{
				testStepInfo("Product Count in Suit Separates Page and Shopping cart page are same");
			}

			else 
			{
				testStepFailed("Product Count in Suit Separates Page and Shopping cart page are not same");
			}*/
			
			shoppingcartPage.VerifyOrderTotalinShoppingBagPage();

			shoppingcartPage.clickCheckoutasGuestToggle();
			


			



			//shoppingcartPage.clickBackToTopButton();

			//shoppingcartPage.fillEmailCheckoutasGuest(dynamicUsername);

			//shoppingcartPage.clickBackToTopButton();

			//shoppingcartPage.clickCheckoutasGuestButton();
			
			checkoutPage.VerifyOrderTotalinCheckoutPageShippingTab();
			
									


			
			checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));
			checkoutPage.clickShippingContinue();
			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));

			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

			username=retrieve("GuestEmail");
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			System.out.println("The random email: "+dynamicUsername);
			
			checkoutPage.fillpaymentpageemailaddress(dynamicUsername);
			
			checkoutPage.clickPaymentContinue();
								
			checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));
			
			checkoutPage.EnterSavedCvvinReviewTabSafari();
			
			//checkoutPage.EnterSavedCvvinReviewTab_new(retrieve("CreditCardCvv"));

			if(checkoutPage.clickPlaceOrderButton())
			{
				
				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();
				
				orderConfirmationPage.getOrderNumber();
				
				checkoutPage.clickOrderConfirmationPageApplicationLogo();
				
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
				waitTime(4);
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

	
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
		finally{
			if(	departmentNavigation.testCaseExecutionStatus ||
					productbundlePage.testCaseExecutionStatus ||
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