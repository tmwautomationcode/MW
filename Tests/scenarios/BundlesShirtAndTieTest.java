package scenarios;

import java.util.ArrayList;
import java.util.List;

import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.ProductBundlePage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import baseClass.BaseClass;
import baseClass.PopupWindows;



public class BundlesShirtAndTieTest extends PopupWindows{

	private BaseClass obj;

	private ShoppingCartPage shoppingcartPage;
	private DepartmentNavigation departmentNavigation;
	private ProductGridPage productGridPage;
	private ProductBundlePage productbundlePage;
	private HomePage homePage;




	public BundlesShirtAndTieTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		departmentNavigation = new	DepartmentNavigation(obj);
		productbundlePage = new	ProductBundlePage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);

	}


	public void destroyObjects()
	{


		departmentNavigation = null;
		productbundlePage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage= null;

	}
	
	
	
	
	ArrayList<String> productAddedToCart = new ArrayList<String>();
	private List<String> productList;
	

	public void BundlesShirtAndTieTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{
			//1.Open site
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}



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

			//homePage.ClickonHomePageLogo();

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}

			else if (browser.equalsIgnoreCase("Safari")) {
				shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
			}

			else {

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			//homePage.ClickonHomePageLogo();


			//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"), retrieve("SubCategoryName"));
			
			departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

			productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

			productbundlePage.verifyBundleProductPageDisplayedIfNotRefreshThePage();



			productList=productbundlePage.getListOfProductListedInBundleProductPage();
			
			for(int i=1;i<=productList.size();i++)
			{

				productbundlePage.selectSizeFromBundleProductPage_New(i, retrieve("ProductSize"));

				productbundlePage.clickOnAddToCartFromBundleProductPage_New(i);

			}

			

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				viewshoppingbag();

			}



			else if (browser.equalsIgnoreCase("Safari")) 
			{
				Safariviewshoppingbag();
			}


			else 
			{

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();

			}		

			shoppingcartPage.verifyShoppingCartPage();
			
			
			String ProductCount = shoppingcartPage.getProductCountinShoppingCartPage("ProductCount");

			if (ProductCount.equalsIgnoreCase("2 item(s)")) 
			{
				testStepInfo("Product Count is 2");
			}

			else 
			{
				testStepFailed("Product Count is not 2. Product Count in Bag is "+ProductCount);
			}
			
			
			shoppingcartPage.removeAllItemsfromShoppingCart();

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
		catch(Exception e){
			testStepFailed(e.toString());
		}
		finally{
			if(departmentNavigation.testCaseExecutionStatus ||
					productbundlePage.testCaseExecutionStatus ||
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