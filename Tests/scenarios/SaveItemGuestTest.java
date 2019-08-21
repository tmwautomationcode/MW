package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.DepartmentNavigation;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.HomePage;

public class SaveItemGuestTest extends PopupWindows{
	private BaseClass obj;

	private ShoppingCartPage shoppingcartPage;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private DepartmentNavigation departmentNavigation;
	private HomePage homePage;
	
	private	String productName=null;

	public SaveItemGuestTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		departmentNavigation = new	DepartmentNavigation(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);
	}


	public void destroyObjects(){


		departmentNavigation = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage= null;
	}


	public void SaveItemUserTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
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

			
			
			
			
			signInToApp(retrieve("UserName"), retrieve("Password"));
			waitTime(3);
			
			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();
				shoppingcartPage.checkingtheshoppingbagsaveditemisemptyandifnotemptyingthesavediteminshoppingbag();
			}
			
			else if (browser.equalsIgnoreCase("Safari")) 
			{
				shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
			}
			
			else 
			{

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();
				shoppingcartPage.checkingtheshoppingbagsaveditemisemptyandifnotemptyingthesavediteminshoppingbag();

			}
			
			//homePage.ClickonHomePageLogo();
			
			
			
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
			
			
			
			
			
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{	
				
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"), retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				productName=productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			}
			else
			{
				searchProductnew(retrieve("SkuID"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
				
				productName=productDescriptionPage.getProductNameInProductDescriptionPage();
			}

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
			
			productDescriptionPage.clickOnSaveItemFromProductDescriptionPage();
			
			guestSignIn(retrieve("UserName"), retrieve("Password"));

			//productDescriptionPage.VerifyItemSavedMessageDisplayedandClosed();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.ClickonIEViewShoppingBaglink();
			
			}
			else {

				homePage.ClickonBagNoCountlink();
				//clickonChromeFirefoxCheckout();

			}
			
			shoppingcartPage.verifyShoppingCartWithSaveItem();
			
			shoppingcartPage.verifySavedItemWithProductNameInShoppingCart(productName);
			
			waitTime(2);
			
			shoppingcartPage.deteleSavedItemWithProductNameInShoppingCart(productName);	
			
			waitTime(2);
						
			shoppingcartPage.verifyEmptySaveItemMessageInShoppingCart();

			
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
		catch(Exception e){
			testStepFailed(e.toString());
		}
		finally{
			if(departmentNavigation.testCaseExecutionStatus ||
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