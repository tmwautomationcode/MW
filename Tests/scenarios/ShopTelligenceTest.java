package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.ClassicGiftCardPage;
import mwPages.DepartmentNavigation;
import mwPages.EGiftCardPage;
import mwPages.GiftCardsPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.HomePage;

public class ShopTelligenceTest extends PopupWindows {

	private BaseClass obj;

	

	private PopupWindows popupWindows;
	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingcartPage;
	private GiftCardsPage giftcardPage;
	private EGiftCardPage eGiftcardPage;
	private ClassicGiftCardPage classicGiftcardPage;
	private HomePage homePage;

	public ShopTelligenceTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		classicGiftcardPage = new	ClassicGiftCardPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		eGiftcardPage = new	EGiftCardPage(obj);
		giftcardPage = new	GiftCardsPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		popupWindows=new PopupWindows(obj);
		homePage= new HomePage(obj);
	}



	public void destroyObjects(){


		classicGiftcardPage = null;
		departmentNavigation = null;
		eGiftcardPage = null;
		giftcardPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		popupWindows=null;
		homePage = null;

	}





	public void shopTelligenceTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{	
			
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) 
			{

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}



			if (browser.equalsIgnoreCase("Safari")) 
			{
				verifySafariUSFlagSelected();
				waitTime(2);
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



			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

			}
			else
			{
				searchProduct(retrieve("SkuID"));

				waitTime(5);

				//productDescriptionPage.getProductNameInProductDescriptionPage();
			}

			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			
			
			
			
			
			
			
			testStepInfo("");
			
			testStepInfo("PDP ShopTelligence Starts Here");
			
			productDescriptionPage.verifyShopTelligenceisDisplayedinPDPandTitle();
			
			productDescriptionPage.verifyShopTelligenceOuterCarouselisDisplayedandCheckingBuutonsaredisplayed();
			
			productDescriptionPage.verifyCorrespondingCarouselisDisplayedinShopTelligence();
			
			productDescriptionPage.AddingProductsfromCarouselBlockinShopTelligence(retrieve("ProductSize"));
			
			testStepInfo("PDP ShopTelligence Ends Here");
			
			testStepInfo("");
		
			
			
			
			
			clickOnHwpContainer();			
			
			clickOnBackToTopLinkInFooter();

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//productDescriptionPage.clickHomePageLogoinPDPPage();

			//homePage.ClickonHomePageLogo();

			

			if (browser.equalsIgnoreCase("InternetExplorer")) {

				homePage.clickProceedtoCheckoutMiniBaginIE();

			}
			else {

				//viewshoppingbag();
				clickonChromeFirefoxCheckout();

			}

			
			
			
			
			
			testStepInfo("");
			
			testStepInfo("Shopping Cart Page ShopTelligence Starts Here");
			
			shoppingcartPage.verifyShopTelligenceisDisplayedinPDPandTitle();
			
			shoppingcartPage.verifyShopTelligenceOuterCarouselisDisplayedandCheckingBuutonsaredisplayed();
			
			shoppingcartPage.verifyCorrespondingCarouselisDisplayedinShopTelligence();
					
			testStepInfo("Shopping Cart Page ShopTelligence Ends Here");
			
			testStepInfo("");
			
			
			
			
			
			
			clickOnHwpContainer();			
			
			//clickOnBackToTopLinkInFooter();		
			
			shoppingcartPage.removeAllItemsfromShoppingCart();
			
			homePage.ClickonHomePageLogo();


		}catch(Exception e){
			testStepFailed(e.toString());
		}finally{
			if(classicGiftcardPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus ||
					eGiftcardPage.testCaseExecutionStatus ||
					giftcardPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus ||
					popupWindows.testCaseExecutionStatus){
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