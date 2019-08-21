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

public class SubcategoryBreadcrumbVerificationTest extends PopupWindows {

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

	public SubcategoryBreadcrumbVerificationTest(BaseClass obj) {
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





	public void subcategoryBreadcrumbVerificationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{	
			//1.Verify add to cart of Each product ( suits,ties,accessory,pant,shoes,physical gift card and egift card) works correctly
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			
			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {

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
			
			
					
			//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			
			departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

			productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
			
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			
			String departmentBreadcrumb = productDescriptionPage.getDepartmentBreadCrumbinPDP();
			System.out.println(departmentBreadcrumb);
			
			String departmentBreadcrumbinPGP = productGridPage.getDepartmentBreadCrumbinPGP();
			
			System.out.println(departmentBreadcrumbinPGP);
		
			if(departmentBreadcrumb.equalsIgnoreCase(departmentBreadcrumbinPGP)) {
				testStepPassed("Department breadcrumb is same in PGP and PDP and navigated correctly");
			}
			else{
				testStepFailed("Department Bread crumb is not navigated correctly");
			}
			
			waitTime(2);
		
			departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));

			productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
			
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
			
			String subcategoryBreadcrumb = productDescriptionPage.getSubCategoryBreadCrumbinPDP();
			System.out.println(subcategoryBreadcrumb);
			
			String subcategoryBreadcrumbinPGP = productGridPage.getSubCategoryBreadCrumbinPGP();
			System.out.println(subcategoryBreadcrumbinPGP);
			
			if(subcategoryBreadcrumb.equalsIgnoreCase(subcategoryBreadcrumbinPGP)) {
				testStepPassed("Subcategory breadcrumb is same in PGP and PDP and navigated correctly");
			}
			else{
				testStepFailed("Subcategory Bread crumb is not navigated correctly");
			}
			
			waitTime(2);
				
						
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