package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.InternationalCheckoutPage;
import mwPages.InternationalOrdersPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;


public class InternationalShippingTest extends PopupWindows{

	private BaseClass obj;

	
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private DepartmentNavigation departmentNavigation;
	private DepartmentNavigation departmentnavigation;
	private InternationalCheckoutPage internationalCheckoutPage;
	private CheckOutPage checkoutPage;
	private InternationalOrdersPage internationalOrdersPage;
	private OrderConfirmationPage orderConfirmationPage;
	private ShoppingCartPage shoppingcartPage;
	private HomePage homePage;
	private PopupWindows popupwindows;

	String currency=null;
	String productName=null;

	public InternationalShippingTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		internationalCheckoutPage = new	InternationalCheckoutPage(obj);
		internationalOrdersPage = new	InternationalOrdersPage(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage= new ShoppingCartPage(obj);
		popupwindows=new PopupWindows(obj);
		homePage= new HomePage(obj);
	}

	
	public void destroyObjects(){

		checkoutPage = null;
		departmentNavigation = null;
		internationalCheckoutPage = null;
		internationalOrdersPage = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage= null;
		popupwindows=null;
		homePage= null;
	}
	
	
	
	public void internationalShippingTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{

			//1.Open Browser and navigate to URL
			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
				
				getJSESSIONIDOnceBrowserInitiated();
				
				getCLONEIDOnceBrowserInitiated();
				
			}
*/
	

			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}
			
					

			
			testStepInfo("");
			testStepInfo("Changing the Ship To as INDIA Customer & handling Continue Shipping Popup window");
			testStepInfo("******************************************************************************************************");
			currency = selectCountryAndReturnDefaultCurrency(retrieve("Country"));
			
			waitTime(5);
			
			popupwindows.continueShopping();
			
			//clickOnBackToTopLinkInFooter();
			
			homePage.ClickonHomePageLogo();
			
			waitTime(4);

			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}
			
			
			
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}
			
			
			else if (browser.equalsIgnoreCase("Safari")) {
				shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
			}
			
			else {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}
			
			
			testStepInfo("");
			testStepInfo("Adding the Product from the PDP Page to the Shopping Bag");
			testStepInfo("***********************************************************************");
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				//departmentnavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				productName = productGridPage.selectProductInProductGridPagenew(retrieve("ProductName"));
			}
			else
			{
				searchProductnew(retrieve("SkuID"));
			
				waitTime(3);
				
				//productName=productDescriptionPage.getProductNameInProductDescriptionPage();
			}
			
			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
			
			productDescriptionPage.clickPDPAddtoShoppingBagButton();
			
			//productDescriptionPage.clickOnAddToShoppingBagFromProductDescriptionPagenew();


			testStepInfo("");
			testStepInfo("Open Shopping Bag and verifying the Prodoct currency is matched to the country");
			testStepInfo("**********************************************************************************************");
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else {

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}
			
			shoppingcartPage.verifyingcurrency();

			testStepInfo("");
			testStepInfo("Checkout from Shopping Bag & Verifying International Border free page is displayed");
			testStepInfo("**************************************************************************************************");

			shoppingcartPage.clickOnCheckoutButton();
			
			internationalCheckoutPage.verifyBorderFreePageDisplayed();

			testStepInfo("");
			testStepInfo("Entering the User Details & Payment Details");
			testStepInfo("*****************************************************");
			waitTime(4);
			
			String txt1 = retrieve("FirstName");
			String txt2 = retrieve("LastName");
			String txt3 = retrieve("Address");
			String txt4 = retrieve("City");
			String txt5 = retrieve("PostalCode");
			String txt6 = retrieve("PhoneNumber");
			String txt7 = retrieve("EmailAddress");
			String txt8 = retrieve("CreditCardNo");
			String txt9 = retrieve("CardExpiryMonth");
			String txt10 = retrieve("CardExpiryYear");
			String txt11 = retrieve("CardCVV");
			String txt12 = retrieve("CardExpiryDate");
			
			
			internationalCheckoutPage.internationalCheckOut(txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12);
			
			if(checkoutPage.clickOnInternationalSubmitOrder())
			{
				
				orderConfirmationPage.InternationalCheckoutgetOrderNumber();

				clickOnMensWearhouseLogo();
			    
			}
			else{
				
				clickOnMensWearhouseLogo();
				
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
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}finally{
			if(checkoutPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus ||
					internationalCheckoutPage.testCaseExecutionStatus ||
					internationalOrdersPage.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					popupwindows.testCaseExecutionStatus ||
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