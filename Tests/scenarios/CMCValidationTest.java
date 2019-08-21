package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CMCPage;
import mwPages.CheckOutPage;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.MyAccountAddressBookPage;
import mwPages.MyAccountOrderDetailPage;
import mwPages.MyAccountOrderHistoryPage;
import mwPages.MyAccountPage;
import mwPages.MyAccountPaymentMethodsPage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;

public class CMCValidationTest extends PopupWindows{

	private BaseClass obj;


	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingcartPage;
	private CheckOutPage checkoutPage;
	private MyAccountOrderHistoryPage myAccountOrderHistoryPage;
	private MyAccountPage myAccountPage;
	private MyAccountPaymentMethodsPage myAccountPayMentmethodsPage;
	private MyAccountAddressBookPage myAccountAddressBookPage;
	private MyAccountPaymentMethodsPage myAccountPaymentMethodsPage;
	private OrderConfirmationPage orderConfirmationPage;
	private MyAccountOrderDetailPage myAccountOrderDetailPage;
	private HomePage homePage;
	private PopupWindows popupwindows;
	private CMCPage cmcPage;



	public CMCValidationTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		myAccountAddressBookPage = new	MyAccountAddressBookPage(obj);
		myAccountOrderHistoryPage = new	MyAccountOrderHistoryPage(obj);
		myAccountPage = new	MyAccountPage(obj);
		myAccountPayMentmethodsPage = new	MyAccountPaymentMethodsPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		orderConfirmationPage =new OrderConfirmationPage(obj);
		myAccountOrderDetailPage = new MyAccountOrderDetailPage(obj);
		myAccountPaymentMethodsPage = new MyAccountPaymentMethodsPage(obj);
		popupwindows=new PopupWindows(obj);
		homePage= new HomePage(obj);
		cmcPage = new CMCPage(obj);
	}



	public void destroyObjects(){	
		checkoutPage = null;
		departmentNavigation = null;
		myAccountAddressBookPage = null;
		myAccountOrderHistoryPage = null;
		myAccountPage = null;
		myAccountPayMentmethodsPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		orderConfirmationPage = null;
		myAccountOrderDetailPage = null;
		myAccountPaymentMethodsPage = null;
		popupwindows =null;
		homePage = null;
		cmcPage = null;
	}

	private String parentWindow;
	String currentWindow;
	String promotionNameInPGP,  promotionNameInPDP, promotionNameInShoppingCartPage;
	
	public void cmcValidationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String tcId){



		try{

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			parentWindow=driver.getWindowHandle();
			currentWindow=driver.getWindowHandle();
			
			String promotionName = retrieve("SubCategoryName");
			
			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}*/

			/*String URL = getConfigProperty("AppURL");

			String trimUrl = URL.substring(7, 10);

			String sample = prefix.concat(URL);

			System.out.println("The prefix : "+sample);

			System.out.println("Trimmed URL : "+trimUrl);

			System.out.println("THe Application URL : "+URL);*/
			System.out.println(driver.getCurrentUrl());
			
			switchToSpecificWindow(currentWindow);
			driver.manage().window().maximize();
			/*System.out.println(driver.getCurrentUrl());
			switchToWindowUsingWindowHandle(parentWindow);
			System.out.println(driver.getCurrentUrl());
*/
			cmcPage.signInToCMC(retrieve("UserName"), retrieve("Password"));
			cmcPage.approveContent();
			cmcPage.clickOnPromotionsMenu();
			cmcPage.clickOnStorePreview();
			
			//selectStore(retrieve("StoreName"));
			selectDate(retrieve("YearMonthDate"), retrieve("Time"));
			
			switchToSpecificWindow(currentWindow);
			System.out.println(driver.getCurrentUrl());
			driver.manage().window().maximize();
			
			waitTime(4);
			if(retrieve("SubCategoryName").equalsIgnoreCase("Daily Deal") && !retrieve("PromotionName").isEmpty()) {
				
				departmentNavigation.clickOnDepartmentLink(retrieve("DepartmentName"));
				departmentNavigation.clickOnSubCategoryLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			
			//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
			waitTime(2);
				
			String promotion = retrieve("PromotionName");
			
			promotionNameInPGP = productGridPage.getProductPromotionNameInPGP(promotion);
				
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
			
			promotionNameInPDP = productDescriptionPage.getProductPromotionNameInPDP(promotion);
				
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();
				
			viewshoppingbag();
				
			promotionNameInShoppingCartPage = shoppingcartPage.getProductPromotionNameInShoppingCartPage(promotion);
			}
			
			else 
			{
				departmentNavigation.clickOnDepartmentLink(retrieve("DepartmentName"));
				departmentNavigation.clickOnSubCategoryLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			
			waitTime(2);
			
			promotionNameInPGP = productGridPage.getProductPromotionNameInPGP(promotionName);
			
			productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
			
			promotionNameInPDP = productDescriptionPage.getProductPromotionNameInPDP(promotionName);
			
			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();
			
			viewshoppingbag();
			
			promotionNameInShoppingCartPage = shoppingcartPage.getProductPromotionNameInShoppingCartPage(promotionName);
			
			}
			
			if(promotionNameInPGP.equalsIgnoreCase("promotionNameInPDP") && promotionNameInPDP.equalsIgnoreCase("promotionNameInShoppingCartPage")) {
				testStepPassed("Promotion is same in PGP, PDP and Shopping cart page");
			}
			else {
				testStepFailed("Promotion is different in PGP, PDP and Shopping cart page");
			}
			
		}
		catch(Exception e)
		{
			testStepFailed("Exception occured: "+e);
		}
		finally{
			if(checkoutPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus ||
					myAccountAddressBookPage.testCaseExecutionStatus ||
					myAccountOrderHistoryPage.testCaseExecutionStatus ||
					myAccountPage.testCaseExecutionStatus ||
					myAccountPayMentmethodsPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
					myAccountOrderDetailPage.testCaseExecutionStatus ||
					myAccountPaymentMethodsPage.testCaseExecutionStatus ||
					homePage.testCaseExecutionStatus){
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