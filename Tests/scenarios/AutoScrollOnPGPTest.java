package scenarios;
import mwPages.DepartmentNavigation;
import mwPages.ProductGridPage;

import java.net.InetAddress;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.HomePage;

public class AutoScrollOnPGPTest extends PopupWindows {

	private BaseClass obj;
	private HomePage homePage;
	private DepartmentNavigation departmentNavigation;
	private ProductGridPage productGridPage;

	int numberOfProductsInProductGridPage = 0;
	public AutoScrollOnPGPTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		departmentNavigation = new DepartmentNavigation(obj);
		productGridPage = new ProductGridPage(obj);
		homePage= new HomePage(obj);
	}


	public void destroyObjects(){

		departmentNavigation = null;
		productGridPage = null;
		homePage= null;
	}

	int productCountInProductGridPage = 32; 
	int ProductsCount=0; 
	 
	public void AutoScrollOnPGPTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}*/

			
			System.out.println(InetAddress.getLocalHost().getHostAddress());

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



			//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			
			departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

			productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

			for(ProductsCount=0;ProductsCount<24;ProductsCount++) {

				ProductsCount=productGridPage.getProductcountinPGP();

				if (browser.equalsIgnoreCase("Safari")) {
					scrolldownSafari();
				}
				else {
					productGridPage.scrolldownProductsinPGP();
				}
				
				if (ProductsCount==24) {
					System.out.println("ProductsCount : "+ProductsCount);

					testStepPassed("ProductsCount : "+ProductsCount);

					testStepPassed("Verified that minimum 24 Products are displayed");
				}

			}

		}
		catch(Exception e){
			testStepFailed("Failure Description: " +e);
		}
		finally{
			if( departmentNavigation.testCaseExecutionStatus || productGridPage.testCaseExecutionStatus){
				this.testCaseExecutionStatus=true;
			}
			destroyObjects();
			driver.quit();
		}

		testStepInfo("");
		testStepInfo("*******************************");
		testStepInfo("Test Execution Completed");
		testStepInfo("*******************************");
	}
}