/*******************************************************************************************************************************************************************************************************************************************************************/
	//Function Name : AddFilterVerificationTest
	//Purpose		: To verify applied add filter button is displayed or not
	//Created By	: Aishwarya L V
	//Created Date	: 07/19/2018
	//Modified By	: Aishwarya L V
	
/*******************************************************************************************************************************************************************************************************************************************************************/
package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.HomePage;
import mwPages.DepartmentNavigation;
import mwPages.ShoppingCartPage;


public class AddFilterVerificationTest extends PopupWindows{

	private BaseClass obj;

	private ProductGridPage productGridPage;
	private ProductDescriptionPage productDescriptionPage;
	private DepartmentNavigation departmentNavigation;
	private ShoppingCartPage shoppingcartPage;
	private HomePage homePage;
	

	String productName=null;

	public AddFilterVerificationTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}


	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;
		productGridPage = new	ProductGridPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		shoppingcartPage = new ShoppingCartPage(obj);
		homePage= new HomePage(obj);

	}


	public void destroyObjects(){
		productGridPage = null;
		productDescriptionPage = null;
		departmentNavigation = null;
		shoppingcartPage= null;
		homePage= null;
	}



	public void addFilterVerificationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion){
		try{

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
									
			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) 
			{

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

			homePage.ClickonHomePageLogo();
			
			//clickOnBackToTopLinkInFooter();
			
			

			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}

						
			testStepInfo("");
			testStepInfo("Checking the Filter Options from different departments");
			testStepInfo("***********************************************************************");
			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				}
			else
			{
				searchProductnew(retrieve("SkuID"));
			
				waitTime(3);
			}
			
			productGridPage.VerifyAddFilterButton(retrieve("FilterType"));
			
			driver.manage().deleteAllCookies();
		}

		catch(Exception e)
		{
			testStepFailed(e.toString());

		}

		finally
		{
			if(productGridPage.testCaseExecutionStatus || productDescriptionPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus  ){
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