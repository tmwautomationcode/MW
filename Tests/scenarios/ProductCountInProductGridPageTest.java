package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.DepartmentNavigation;
import mwPages.ProductGridPage;

public class ProductCountInProductGridPageTest extends PopupWindows {

	private DepartmentNavigation departmentNavigation;
	private ProductGridPage productGridPage;

	BaseClass obj;

	public ProductCountInProductGridPageTest(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	public void createObjects(String browser) {
		obj.driver = driver;
		obj.currentBrowser = browser;

		productGridPage = new ProductGridPage(obj);
		departmentNavigation = new DepartmentNavigation(obj);

	}

	public void destroyObjects() {

		productGridPage = null;
		departmentNavigation = null;
	}

	int shopAllItems, shopMyStore;

	public void productCountInProductGridPageTestScenario(String machineName, String host, String port, String browser,
			String os, String browserVersion, String osVersion, String tcId) {
		try {
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
				getJSESSIONIDOnceBrowserInitiated();
				getCLONEIDOnceBrowserInitiated();
			}

			//verifyUSFlagSelected();

			//clickOnBackToTopLinkInFooter();

			testStepInfo("*********************************");
			testStepInfo("Shop All Items Product Count");
			testStepInfo("*********************************");
			
			departmentNavigation.clickOnDepartmentLink(retrieve("DepartmentName"));
				//productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
			

			productGridPage.verifyShopAllItemsTab();
			waitTime(4);

			shopAllItems = Integer.parseInt(productGridPage.shopAllItemsCount());
			testStepPassed("Shop All Items Product count before applying filter : "+ shopAllItems);
			
			productGridPage.VerifyDifferentFilterOption(retrieve("FilterType"),retrieve("FilterValue"));
			
			int shopAllItemsAfterApplyingFilter = Integer.parseInt(productGridPage.shopAllItemsCount());
			testStepPassed("Shop All Items Product count after applying '" +retrieve("FilterValue" )+"' filter: " +shopAllItemsAfterApplyingFilter);

			waitTime(2);
			departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),
						retrieve("SubCategoryName"));
			
			waitTime(4);
			int shopAllItemsInSpecificPGP = Integer.parseInt(productGridPage.shopAllItemsCount());
			testStepPassed("Shop All Items Product count in '"+retrieve("DepartmentName")+"' and '"+retrieve("SubCategoryName")+"': " +shopAllItemsInSpecificPGP);
			
			waitTime(2);
			if(shopAllItemsAfterApplyingFilter == shopAllItemsInSpecificPGP) {
				testStepPassed("Shop All Items Product count is same");
			}
			
			else {
				testStepFailed("Shop All Items Product count is different");
			}
			
			testStepInfo("*********************************");
			testStepInfo("Shop My Store Product Count");
			testStepInfo("*********************************");
			waitTime(2);
			
			departmentNavigation.clickOnDepartmentLink(retrieve("DepartmentName"));

			//productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
		
			productGridPage.clickShopMyStoreTab();
			waitTime(4);
			shopMyStore = Integer.parseInt(productGridPage.shopMyStoreCount());
			testStepPassed("Shop My Store Product count before applying filter : " + shopMyStore);

			productGridPage.VerifyDifferentFilterOption(retrieve("FilterType"),retrieve("FilterValue"));
			
			waitTime(2);
			int shopMyStoreAfterApplyingFilter = Integer.parseInt(productGridPage.shopMyStoreCount());
			testStepPassed("Shop My Store Product count after applying '" +retrieve("FilterValue" )+"' filter: " +shopMyStoreAfterApplyingFilter);

			
			departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),
						retrieve("SubCategoryName"));
			waitTime(4);

			productGridPage.clickShopMyStoreTab();
			waitTime(2);

			int shopMyStoreInSpecificPGP = Integer.parseInt(productGridPage.shopMyStoreCount());
			testStepPassed("Shop My Store Product count in '"+retrieve("DepartmentName")+"' and '"+retrieve("SubCategoryName")+"': " +shopMyStoreInSpecificPGP);
			waitTime(2);
			if(shopMyStoreAfterApplyingFilter == shopMyStoreInSpecificPGP) {
				testStepPassed("Shop My Store Product count is same");
			}
			
			else {
				testStepFailed("Shop My Store Product count is different");
			}
			
			
		} catch (Exception e) {
			testStepFailed("Exception " + e.toString());
		} finally {
			if (departmentNavigation.testCaseExecutionStatus || productGridPage.testCaseExecutionStatus) {
				this.testCaseExecutionStatus = true;
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