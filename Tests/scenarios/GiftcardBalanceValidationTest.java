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


public class GiftcardBalanceValidationTest extends PopupWindows 
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
	
	public GiftcardBalanceValidationTest(BaseClass obj) {
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
		new MyAccountPage(obj);
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


	public void giftcardBalanceValidationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{	
			
			//1.Open Site			
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);


			/*	if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
			
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

			//signInToApp(retrieve("UserName"),retrieve("Password"));
			
			waitTime(3);
			
			//myAccountPage.verifyAccountDashBoardPageisDisplayed();
			
			clickOnFooterLinks("Gift Cards");
			
			giftcardPage.verifyGiftCardspage();
			waitTime(3);
			
			giftcardPage.enterGiftCardNoWithPintoCheckBalance(retrieve("GiftCardNo"), retrieve("GiftCardPinNo"));

			giftcardPage.clickCheckBalanceLink();
			
			giftcardPage.verifyGiftCardBalanceisdisplayed();
			
						
			homePage.ClickonHomePageLogo();
			
			
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