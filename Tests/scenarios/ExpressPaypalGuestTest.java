package scenarios;

import mwPages.CheckOutPage;
//import mwPages.MyAccountAddressBookPage;
//import mwPages.MyAccountPage;
import mwPages.OrderConfirmationPage;
import mwPages.PayPalPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.HomePage;
import mwPages.DepartmentNavigation;

public class ExpressPaypalGuestTest extends PopupWindows
{

	private BaseClass obj;

	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingcartPage;
	private CheckOutPage checkoutPage;
	private OrderConfirmationPage orderConfirmationPage;
	private PayPalPage payPalPage;
	private HomePage homePage;
	private DepartmentNavigation departmentNavigation;

	private String productName=null;

	public ExpressPaypalGuestTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		payPalPage=new PayPalPage(obj);
		homePage= new HomePage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
	}


	public void destroyObjects(){


		checkoutPage = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		payPalPage=null;
		homePage= null;
		departmentNavigation = null;
	}

	public void ExpressPaypalGuestTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{			
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}
*/

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
			}

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productName = productDescriptionPage.getProductNameInProductDescriptionPage();

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//homePage.ClickonHomePageLogo();	


			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				//clickonChromeFirefoxCheckout();
				viewshoppingbag();

			}


			shoppingcartPage.verifyProductInShoppingCartPage(productName);

			shoppingcartPage.verifyShoppingCartPage();

			shoppingcartPage.clickShoppingBagPayPalButton();

			payPalPage.verifyPayPalPage();

			payPalPage.fillSignInPayPalCheckOutPage(retrieve("PaypalUserName"),retrieve("PaypalPassword"));


			payPalPage.payPalShippingContinue();

			waitTime(3);
			
			//payPalPage.payPalPlaceOrder();

			if(checkoutPage.clickPlaceOrderButton())
			{

				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();

				checkoutPage.clickOrderConfirmationPageApplicationLogo();

			}
			else{
				checkoutPage.clickOnCancelAndToReturnMenswearHouseLogo();

				clickOnMensWearhouseLogo();

				waitTime(2);

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
			}
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
		finally{
			if(checkoutPage.testCaseExecutionStatus ||
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
