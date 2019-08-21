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
import mwPages.MyAccountPage;


public class UserGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest extends PopupWindows 
{
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
	private MyAccountPage myAccountPage;
	

	public UserGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest(BaseClass obj) {
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
		myAccountPage = new MyAccountPage(obj);
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
		myAccountPage = null;
	}

	String dynamicUsername=null;
	String username=null;
	
	String JSESSIONIDFromApplication;
	String JSESSIONIDAfterNewValue;
	String JSESSIONIDAfterAddingProduct;
	String CLONEIDFromApplication;
	String CLONEIDAfterAddingProduct;
	String CLONEIDAfterNewValue;
	String JSESSIONIDAfterPageRefresh;
	String CLONEIDAfterPageRefresh;


	public void userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{	
			
			//openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);


			JSESSIONIDFromApplication = getJSESSIONIDOnceBrowserInitiated();
			
			CLONEIDFromApplication = getCLONEIDOnceBrowserInitiated();

			setJSESSIONID();

			//pageRefresh();

			JSESSIONIDAfterNewValue = getJSESSIONIDAfterNewValueChanged();
			
			CLONEIDAfterNewValue = getCLONEIDAfterNewValueChanged();
			
			
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
			
			myAccountPage.verifyAccountDashBoardPageisDisplayed();
			
			clickOnFooterLinks("Gift Cards");
			
			giftcardPage.verifyGiftCardspage();
			
			giftcardPage.enterGiftCardNoWithPintoCheckBalance(retrieve("GiftCardNo"), retrieve("GiftCardPinNo"));

			giftcardPage.clickCheckBalanceLink();
			
			giftcardPage.verifyGiftCardBalanceisdisplayed();
			
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			}
			else
			{
				searchProductnew(retrieve("SkuID"));
				
				waitTime(3);

				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

				productDescriptionPage.getProductNameInProductDescriptionPage();
			}

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//productDescriptionPage.clickHomePageLogoinPDPPage();

			
			if (browser.equalsIgnoreCase("Safari")) 
			{
				
				Safariviewshoppingbag();
			}
			
			else if (browser.equalsIgnoreCase("InternetExplorer")) 
			{				
				viewshoppingbagIE();
			}
			
			else 
			{
				viewshoppingbag_New();
			}

			
			shoppingcartPage.clickPromoCodeExpandLink();
			
			shoppingcartPage.enterPromoCodedetailsandClickApply(retrieve("PromoCode"));
			
			shoppingcartPage.verifyPromoCodeisApplied();

			shoppingcartPage.removeAllItemsfromShoppingCart2();
			
			//homePage.ClickonHomePageLogo();
			
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
		e.printStackTrace();
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
		//destroyObjects();
		//driver.quit();
	}
	testStepInfo("");
	testStepInfo("*******************************");
	testStepInfo("Test Execution Completed");
	testStepInfo("*******************************");
}


}