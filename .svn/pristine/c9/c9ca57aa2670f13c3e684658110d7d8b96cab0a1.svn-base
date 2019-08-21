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


public class StatusCodeCheckTest extends PopupWindows {

	private BaseClass obj;


	private PopupWindows popupWindows;
	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingcartPage;
	private GiftCardsPage giftcardPage;
	private EGiftCardPage eGiftcardPage;
	private ClassicGiftCardPage classicGiftcardPage;


	public StatusCodeCheckTest(BaseClass obj) {
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
	}





	public void statusCodeCheckTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{	

			//openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);


			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) 
			{

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}

			String Url = retrieve("URL");

			int StatusCode = getResponseCode(retrieve("URL"));

			if ((StatusCode==200)||(StatusCode==302)) 
			{

				//testStepInfo("");
				testStepPassed("Url : "+Url);
				testStepPassed("Status Code : "+StatusCode);

			}

			else 
			{
				//testStepInfo("");
				testStepWarning("Url : "+Url);
				testStepWarning("Status Code : "+StatusCode);
			}


			

		}
		catch(Exception e)
		{
			e.printStackTrace();
			testStepFailed(e.toString());
		}
		finally
		{
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