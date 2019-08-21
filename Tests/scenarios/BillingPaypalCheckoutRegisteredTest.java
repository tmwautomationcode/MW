package scenarios;

//import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.MyAccountAddressBookPage;
import mwPages.MyAccountPage;
import mwPages.OrderConfirmationPage;
import mwPages.PayPalPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.HomePage;
import mwPages.DepartmentNavigation;


public class BillingPaypalCheckoutRegisteredTest extends PopupWindows{

	private BaseClass obj;

	private ProductDescriptionPage productDescriptionPage;
	private DepartmentNavigation departmentNavigation;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingcartPage;
	private CheckOutPage checkoutPage;
	private OrderConfirmationPage orderConfirmationPage;
	private MyAccountAddressBookPage myAccountAddressBookPage;
	private MyAccountPage myAccountPage;
	private PayPalPage payPalPage;
	private HomePage homePage;

	public BillingPaypalCheckoutRegisteredTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		checkoutPage = new	CheckOutPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		myAccountAddressBookPage = new	MyAccountAddressBookPage(obj);
		myAccountPage = new	MyAccountPage(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		payPalPage=new PayPalPage(obj);
		homePage= new HomePage(obj);
	}



	public void destroyObjects(){

		checkoutPage = null;
		myAccountAddressBookPage = null;
		myAccountPage = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		payPalPage=null;
		homePage= null;
		departmentNavigation = null;
	}

	private	String dynamicUsername=null,username=null;
	//private String productName;
	public void billingPaypalCheckoutRegisteredTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{
			//1.Open site and login as member who has shipping address in the list
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

				else if (browser.equalsIgnoreCase("Chrome")||(browser.equalsIgnoreCase("Firefox")||(browser.equalsIgnoreCase("InternetExplorer")))) 
				{

					searchProductnew(retrieve("SearchProduct"));

					productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				}



				//homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();

				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

			}
			else 
			{
				searchProductnew(retrieve("SkuID"));

				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			}

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			//productDescriptionPage.clickOnAddToShoppingBagFromProductDescriptionPage();

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//homePage.ClickonHomePageLogo();


			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else {

				//clickonChromeFirefoxCheckout();
				viewshoppingbag();

			}


			//shoppingcartPage.clickBackToTopButton();

			shoppingcartPage.VerifyOrderTotalinShoppingBagPage();

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

			checkoutPage.clickOnPaypalTab();

			checkoutPage.clickOnContinueWithPayPalBillingInCheckOutPage();

			payPalPage.verifyPayPalPage();

			payPalPage.fillSignInPayPalCheckOutPage(retrieve("PayPalUserName"),retrieve("PayPalPassword"));

			payPalPage.payPalShippingContinue();

			/*	if((orderPlacementFlag==true)){		

				payPalPage.payPalPlaceOrder();*/

			if(checkoutPage.clickPlaceOrderButton())
			{


				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();

				homePage.ClickonCheckOutHomePageLogo();
			}
			else
			{
				homePage.ClickonHomePageLogo();

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
				homePage.ClickonHomePageLogo();	
			}

		}
		catch(Exception e){
			testStepFailed("Failure description: "+e);
		}
		finally
		{
			if(checkoutPage.testCaseExecutionStatus ||
					myAccountAddressBookPage.testCaseExecutionStatus ||
					myAccountPage.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
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
