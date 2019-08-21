package scenarios;


import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ReserveOnlinePayInStorePage;
import mwPages.StoreLocatorPage;

public class ROPISReserveUnavailableStoreCertonaProductTest extends PopupWindows{
	
	private HomePage homePage;
	private StoreLocatorPage storeLocatorPage;
	private ReserveOnlinePayInStorePage reserveOnlinePayInStorePage; 
	private ProductGridPage productGridPage;
	private ProductDescriptionPage pdp;
	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;

	BaseClass obj;
	private	String productName=null;
	private String size = null;
	String newPDPSize =  null;
	String ROPISRecommendedSize = null;
	public ROPISReserveUnavailableStoreCertonaProductTest(BaseClass obj) {
		super(obj);
		this.obj=obj;


		// TODO Auto-generated constructor stub
	}
	public void createObjects(String browser)
	{
		obj.driver=driver;
		obj.currentBrowser=browser;
		homePage=new HomePage(obj);
		storeLocatorPage = new StoreLocatorPage(obj);
		reserveOnlinePayInStorePage = new ReserveOnlinePayInStorePage(obj);		
		productGridPage = new ProductGridPage(obj);
		pdp = new ProductDescriptionPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);

	}
	
	
	public void destroyObjects()
	{
		homePage=null;
		storeLocatorPage = null;
		reserveOnlinePayInStorePage = null;
		pdp = null;
		departmentNavigation = null;
		productDescriptionPage = null;

	}

	private String dynamicUsername, username;

	public void rOPISReserveUnavailableStoreCertonaProductTestScenario(String machineName, String host, String port, String browser, String os, String browserVersion, String osVersion) {
		try{

			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			
			
			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
				getJSESSIONIDOnceBrowserInitiated();
				getCLONEIDOnceBrowserInitiated();
			}*/
			
			if (browser.equalsIgnoreCase("Safari")) 
			{
				waitTime(5);
				verifySafariUSFlagSelected();
				homePage.ClickonHomePageLogo();
				waitTime(5);
			} 

			else 
			{
				verifyUSFlagSelected();
			}

			homePage.ClickonHomePageLogo();
			
			//clickOnBackToTopLinkInFooter();
			


			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}


		
			
			
			/*clickOnShopMyStore();
			
			reserveOnlinePayInStorePage.verifyReserveOnlinePayInStorePage();
			
			
			reserveOnlinePayInStorePage.getCategoryNameandCount();
			reserveOnlinePayInStorePage.selectCategory(retrieve("CategoryName"));
			productGridPage.verifyShopMyStoreTab();
			waitTime(2);
			productGridPage.selectProductFromShopMyStoreTab(retrieve("ProductName"));*/
			
			departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"), retrieve("SubCategoryName"));
			
			productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
			
			productName=productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
			
			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

			size = pdp.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
			
			ROPISRecommendedSize = productDescriptionPage.selectproductfromROPISPDPcertona();
			
			if(size.equalsIgnoreCase(ROPISRecommendedSize)) {
				testStepPassed("PDP product selected size & ROPIS recommended size both same");
			}
			else{
				testStepFailed("PDP product selected size & ROPIS recommended size both different");
			}
			newPDPSize = productDescriptionPage.GetPDPselectedSize();
			
			if(size.equalsIgnoreCase(newPDPSize)) {
				testStepPassed("PDP product selected size & new product size both same");
			}
			else{
				testStepFailed("PDP product selected size & new product size both different");
			}
			
			username = retrieve("Email");
			dynamicUsername = username.split("@")[0] + "_" + getCurrentDateAndTimeStamp() + "@"
					+ username.split("@")[1];
			pdp.reserveProduct(retrieve("FirstName"), retrieve("LastName"), dynamicUsername, retrieve("PhoneNumber"), retrieve("EditStoreZipCode1"), retrieve("EditStoreZipCode2"));
			waitTime(3);
			verifyROPISOrderConfirmation();		
			waitTime(3);
			clickOnSpecialElement("ROPIS Order confirmation close link #xpath=(//a[contains(@class,'close-reveal-modal')])[2]");
			testStepPassed("Browser navigate to back");
			clickOnBackButton();
			
			newPDPSize = productDescriptionPage.GetPDPselectedSize();
			System.out.println(newPDPSize);
			
			if(size.equalsIgnoreCase(newPDPSize)) {
				testStepPassed("PDP product selected size & new product size both same");
			}
			else{
				testStepFailed("PDP product selected size & new product size both different");
			}

		}catch(Exception e){
			testStepFailed("Exception occured :"+e);
		}finally{
			if (homePage.testCaseExecutionStatus || storeLocatorPage.testCaseExecutionStatus ||
					reserveOnlinePayInStorePage.testCaseExecutionStatus ||productGridPage.testCaseExecutionStatus ||
					pdp.testCaseExecutionStatus || departmentNavigation.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus) {
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
