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

public class HomePageWithDifferentCloneIdTest extends PopupWindows {

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

	public HomePageWithDifferentCloneIdTest(BaseClass obj) {
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



	

	String JSESSIONIDFromApplication;
	String JSESSIONIDAfterNewValue;
	String JSESSIONIDAfterAddingProduct;
	String CLONEIDFromApplication;
	String CLONEIDAfterAddingProduct;
	String CLONEIDAfterNewValue;
	String JSESSIONIDAfterPageRefresh;
	String CLONEIDAfterPageRefresh;
	
	public void HomePageWithDifferentCloneIdTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{	
			//1.Verify add to cart of Each product ( suits,ties,accessory,pant,shoes,physical gift card and egift card) works correctly
			//openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);


			JSESSIONIDFromApplication = getJSESSIONIDOnceBrowserInitiated();

			CLONEIDFromApplication = getCLONEIDOnceBrowserInitiated();

			setJSESSIONID();

			pageRefresh();

			JSESSIONIDAfterNewValue = getJSESSIONIDAfterNewValueChanged();

			CLONEIDAfterNewValue = getCLONEIDAfterNewValueChanged();

			if (verifyApplicationLogoisDisplayed()) {

				JSESSIONIDAfterPageRefresh = getJSESSIONIDAfterPageRefresh();

				CLONEIDAfterPageRefresh = getCLONEIDAfterPageRefresh();

				if(CLONEIDAfterNewValue.equalsIgnoreCase(CLONEIDAfterPageRefresh))
				{

					testStepInfo("Clone Id's Before and After Page Refresh are same");

				}
				else
				{
					testStepFailed("Clone Id's Before and After Page Refresh are different");
				}	

				homePage.ClickonHomePageLogo2();
				
			}

			

		}catch(Exception e){
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