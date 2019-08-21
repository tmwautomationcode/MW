package scenarios;


import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ReserveOnlinePayInStorePage;
import mwPages.StoreLocatorPage;

public class ROPISReserveMoreThanTenProductsTest extends PopupWindows{
	
	private HomePage homePage;
	private StoreLocatorPage storeLocatorPage;
	private DepartmentNavigation departmentNavigation;
	private ReserveOnlinePayInStorePage reserveOnlinePayInStorePage;
	private ProductGridPage productGridPage;
	private ProductDescriptionPage pdp;
	private ProductDescriptionPage productDescriptionPage;

	BaseClass obj;
	String newPDPSize =  null;
	String SizeFiltervalue = null;
	String ColorFiltervalue = null;
	public ROPISReserveMoreThanTenProductsTest(BaseClass obj) {
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
		departmentNavigation = new DepartmentNavigation(obj);
		pdp = new ProductDescriptionPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);

	}
	
	
	public void destroyObjects() 
	{
		homePage=null;
		departmentNavigation = null;
		storeLocatorPage = null;
		reserveOnlinePayInStorePage = null;
		pdp = null;
		productDescriptionPage = null;

	}

	private String dynamicUsername, username;

	public void rOPISReserveMoreThanTenProductsTestScenario(String machineName, String host, String port, String browser, String os, String browserVersion, String osVersion) {
		try{

			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			
			
			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
				getJSESSIONIDOnceBrowserInitiated();
				getCLONEIDOnceBrowserInitiated();
			}
			
			verifyUSFlagSelected();

			clickOnBackToTopLinkInFooter();
			
			if(!retrieve("CategoryName").isEmpty()) {
			
			clickOnShopMyStore();
			
			reserveOnlinePayInStorePage.verifyReserveOnlinePayInStorePage();
			
			
			reserveOnlinePayInStorePage.getCategoryNameandCount();
			reserveOnlinePayInStorePage.selectCategory(retrieve("CategoryName"));
			productGridPage.verifyShopMyStoreTab();
			waitTime(2);
			}
			else if(!retrieve("DepartmentName").isEmpty() && !retrieve("SubCategoryName").isEmpty()) {
			
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no")){
				
				departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				//productGridPage.selectProduct(retrieve("ProductName"));
					
			}
			else{
				
				searchProduct(retrieve("SkuID"));
				
				waitTime(2);
			}
			
			productGridPage.verifyShopAllItemsTab();
			waitTime(2);
			}
			
			clickOnBackToTopLinkInFooter(); 
			
			SizeFiltervalue = productGridPage.selectSizeFilter(retrieve("SizeFilterValue"));
			waitTime(5);
			
			
			productGridPage.clickShopMyStoreTab();
			
			productGridPage.selectProductFromShopMyStoreTab(retrieve("ProductName"));
			
			newPDPSize = productDescriptionPage.GetPDPselectedSize();
			
			if(SizeFiltervalue.equalsIgnoreCase(newPDPSize)) {
				testStepPassed("PGP selected filter size & new product selected size both are same");
			}
			else{
				testStepFailed("PGP selected filter size & new product selected size both are not same");
			}
			username = retrieve("Email");
			dynamicUsername = username.split("@")[0] + "_" + getCurrentDateAndTimeStamp() + "@"
					+ username.split("@")[1];
			pdp.reserveProduct(retrieve("FirstName"), retrieve("LastName"), dynamicUsername, retrieve("PhoneNumber"), retrieve("EditStoreZipCode1"), retrieve("EditStoreZipCode2"));
			waitTime(3);
			verifyROPISOrderConfirmation();	
			waitTime(3);
			//productDescriptionPage.AddProductFromROPISReservationConfirmpageFromOneCertonaWidget(retrieve("ProductCount"));
			productDescriptionPage.addMoreThanTenProductFromROPISReservationConfirmpageAndVerifyErrorMessage(retrieve("ProductCount"));
			////div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]//button[contains(@aria-label,'Load Next Set of products')]
			
			productDescriptionPage.verifyRemoveProductcountinROPISReservationPage();
			
		}catch(Exception e){
			testStepFailed("Exception occured :"+e); 
		}finally{
			if (homePage.testCaseExecutionStatus || storeLocatorPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus || reserveOnlinePayInStorePage.testCaseExecutionStatus ||
					pdp.testCaseExecutionStatus || productDescriptionPage.testCaseExecutionStatus) {
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