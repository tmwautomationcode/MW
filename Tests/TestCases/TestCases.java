

package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AutomationFramework.GenericKeywords;
import baseClass.BaseClass;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import scenarios.AccountDashboardTest;
import scenarios.AddFilterVerificationTest;
import scenarios.AddToCartBundleTest;
import scenarios.AddToCartDifferentCategoryProductsTest;
import scenarios.AddToCartDifferentCloneIdTest;
import scenarios.AutoScrollOnPGPTest;
import scenarios.AllDepartmentPDPVerificationTest;
import scenarios.AllDepartmentGetPDPURLTest;
import scenarios.AllDepartmentGetPDPURLDeleteTest;
import scenarios.BillingPaypalCheckoutRegisteredTest;
import scenarios.BundlesShirtAndTieTest;
import scenarios.BundlesSuitSeparatesTest;
import scenarios.CMCValidationTest;
import scenarios.CategoryShoppingCartTest;
import scenarios.CertonaTest;
import scenarios.ColorSwatchVerificationTest;
import scenarios.DepartmentLinksAndSubCategoryLinksNavigationTest;
import scenarios.EGiftCardMemberTest;
import scenarios.EGiftCardWithRegularProductTest;
import scenarios.ExpressPaypalGuestTest;
import scenarios.Fenixvalidation;
import scenarios.FilterValidationTest;
import scenarios.FooterLinksTest;
import scenarios.GiftCardRedemptionTest;
import scenarios.GiftcardBalanceValidationTest;
import scenarios.GuestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest;
import scenarios.GuidedShoppingTest;
import scenarios.HeaderLinksTest;
import scenarios.HeaderLinksVerificationTest;
import scenarios.HomePageWithDifferentCloneIdTest;
import scenarios.ImageSizeValidationTest;
import scenarios.InternationalShippingTest;
import scenarios.KeywordSearchTest;
import scenarios.OneToManyOrderPlacementTest;
import scenarios.PantsTailoringProductsTest;
import scenarios.PhysicalGiftCardAndAnyOneProductOrderPlacementTest;
import scenarios.PhysicalGiftCardOrderGuestTest;
import scenarios.PriceComparisonTest;
import scenarios.PricePendingValidationTest;
import scenarios.ProductCountInProductGridPageTest;
import scenarios.ROPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest;
import scenarios.ROPISFilterValidationTest;
import scenarios.ROPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest;
import scenarios.ROPISReserveMoreThanTenProductsTest;
import scenarios.ROPISReserveUnavailableStoreCertonaProductTest;
import scenarios.ROPISValidationTest;
import scenarios.ROPISValidationTest;
import scenarios.RedeemRewardPointsTest;
import scenarios.RegisteredUserEditBillingDetailsPaypalPlaceOrderTest;
import scenarios.RegisteredUserEditBillingDetailsfromReviewPageTest;
import scenarios.RegisteredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest;
import scenarios.RegisteredUserEditShippingDetailsfromReviewPagePlaceOrderTest;
import scenarios.RegisteredUserSavedAddressandSavedBillingPlaceOrderTest;
import scenarios.RegisteredUserShoppingCartUpdateProductfromReviewPageTest;
import scenarios.RegistrationOnPaymentsPageTest;
import scenarios.SaveItemGuestTest;
import scenarios.SaveItemUserTest;
import scenarios.SavedCardOrderPlacementTest;
import scenarios.SavedSizesSuitsTest;
import scenarios.ShopTelligenceTest;
import scenarios.ShoppingCartTest;
import scenarios.SocialLinksTest;
import scenarios.SplitPaymentOrderPlacementTest;
import scenarios.StatusCodeCheckTest;
import scenarios.StoreFinderMemberTest;
import scenarios.SubcategoryBreadcrumbVerificationTest;
import scenarios.TaxValidationTest;
import scenarios.UserGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest;
import scenarios.UserLoginValidationStoreFinderValidationSAPAddressValidationTest;
import scenarios.UserRegistrationThenEditPFAddressinAccountPageTest;
import scenarios.UserRegistrationThenPFRegTest;
import scenarios.UserRegistrationWithPFTest;
import scenarios.UserRegistrationWithoutPFTest;
import scenarios.UserWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest;
import scenarios.VisualSearchTest;
import scenarios.TaxValidationForPantsTailoringProduct;
import scenarios.ROPISValidationForMultipleReservationTest;
import scenarios.ColorswatchTest;
import scenarios.ViewscountTest;

/*******************************************************************************************************************************************************************************************************************************************************************/

@Listeners({Utilities.HtmlReport.class})  
public class TestCases
{
	String machineName = "";
	BaseClass obj;

	AccountDashboardTest accountDashboardTest;
	AddToCartBundleTest addtocartbundletest;
	AddToCartDifferentCategoryProductsTest addToCartDifferentCategoryProductsTest;
	AddToCartDifferentCloneIdTest addToCartDifferentCloneIdTest;
	AutoScrollOnPGPTest autoScrollOnPGPTest;
	AllDepartmentGetPDPURLTest allDepartmentGetPDPURLTest;
	AllDepartmentGetPDPURLDeleteTest allDepartmentGetPDPURLDeleteTest;
	AllDepartmentPDPVerificationTest allDepartmentPDPVerificationTest;
	BillingPaypalCheckoutRegisteredTest billingPaypalCheckoutRegisteredTest;
	BundlesShirtAndTieTest bundlesShirtAndTieTest;
	BundlesSuitSeparatesTest bundlesSuitSeparatesTest;
	CategoryShoppingCartTest categoryShoppingCartTest;
	CertonaTest certonaTest;
	ColorSwatchVerificationTest colorSwatchVerificationTest;
	DepartmentLinksAndSubCategoryLinksNavigationTest departmentLinksAndSubCategoryLinksNavigationTest;
	EGiftCardMemberTest eGiftCardMemberTest;
	EGiftCardWithRegularProductTest eGiftCardWithRegularProductTest;
	ExpressPaypalGuestTest expresspaypalguest;
	FooterLinksTest footerLinksTest;
	GiftCardRedemptionTest giftCardRedemptionTest;
	GuestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest guestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest;
	GuidedShoppingTest guidedShoppingTest;
	HeaderLinksTest headerLinksOnHomePageTest;
	HeaderLinksVerificationTest headerLinksVerificationTest;
	HomePageWithDifferentCloneIdTest homePageWithDifferentCloneIdTest;
	ImageSizeValidationTest imageSizeValidationTest;
	InternationalShippingTest internationalShippingTest;
	KeywordSearchTest keywordSearchTest;
	OneToManyOrderPlacementTest onetomanyorderplacementtest;
	PantsTailoringProductsTest pantsTailoringProductsTest;
	PhysicalGiftCardAndAnyOneProductOrderPlacementTest physicalGiftCardAndAnyOneProductOrderPlacementTest;
	PhysicalGiftCardOrderGuestTest physicalgiftcardorderguest;
	PriceComparisonTest priceComparisonTest;
	PricePendingValidationTest pricePendingValidationTest;
	RedeemRewardPointsTest redeemRewardPointsTest;
	RegistrationOnPaymentsPageTest registrationonpaymenttest;
	RegisteredUserEditBillingDetailsfromReviewPageTest registeredUserEditBillingDetailsfromReviewPageTest;
	RegisteredUserEditBillingDetailsPaypalPlaceOrderTest registeredUserEditBillingDetailsPaypalPlaceOrderTest;
	RegisteredUserEditShippingDetailsfromReviewPagePlaceOrderTest registeredUserEditShippingDetailsfromReviewPagePlaceOrderTest;
	RegisteredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest registeredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest;
	RegisteredUserSavedAddressandSavedBillingPlaceOrderTest registeredUserSavedAddressandSavedBillingPlaceOrderTest;
	RegisteredUserShoppingCartUpdateProductfromReviewPageTest registeredUserShoppingCartUpdateProductfromReviewPageTest;
	SavedCardOrderPlacementTest savedCardOrderPlacementTest;
	SaveItemGuestTest saveItemGuestTest;
	SaveItemUserTest saveItemUserTest;
	SavedSizesSuitsTest savedsizessuit;
	ShoppingCartTest shoppingCartTest;
	ShopTelligenceTest shopTelligenceTest;
	SocialLinksTest socialLinksTest;
	SplitPaymentOrderPlacementTest splitpaymentorderplacementtest;
	StoreFinderMemberTest storefindermembertest;
	UserGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest;
	UserLoginValidationStoreFinderValidationSAPAddressValidationTest userLoginValidationStoreFinderValidationSAPAddressValidationTest;
	UserRegistrationThenPFRegTest userRegistrationThenPFRegTest;
	UserRegistrationWithPFTest userRegistrationWithPFTest;
	UserWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest;
	VisualSearchTest visualSearchTest;
	StatusCodeCheckTest statusCodeCheckTest;
	UserRegistrationWithoutPFTest userRegistrationWithoutPFTest;
	GiftcardBalanceValidationTest giftcardBalanceValidationTest;
	UserRegistrationThenEditPFAddressinAccountPageTest userRegistrationThenEditPFAddressinAccountPageTest;
	SubcategoryBreadcrumbVerificationTest subcategoryBreadcrumbVerificationTest;
	FilterValidationTest filterValidationTest;
	AddFilterVerificationTest addFilterVerificationTest;
	ROPISValidationTest ropisValidationTest;
	ROPISFilterValidationTest rOPISFilterValidationTest;
	TaxValidationTest taxValidationTest;
	Fenixvalidation fenixvalidation;
	ROPISReserveUnavailableStoreCertonaProductTest rOPISReserveUnavailableStoreCertonaProductTest;
	ROPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest;
	ROPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest;
	ROPISReserveMoreThanTenProductsTest rOPISReserveMoreThanTenProductsTest;
	ProductCountInProductGridPageTest productCountInProductGridTestPage;
	CMCValidationTest cmcValidationTest;
	TaxValidationForPantsTailoringProduct taxValidationForPantsTailoringProduct;
	ROPISValidationForMultipleReservationTest rOPISValidationForMultipleReservationTest;
	ColorswatchTest colorswatchTest;
	ViewscountTest viewscountTest;

	
	
	/*******************************************************************************************************************************************************************************************************************************************************************/

	public void TestStart(String testCaseDescription,String hostName,String testCaseName)
	{	

		obj.currentTestCaseName=testCaseName;
		obj.setEnvironmentTimeouts();
		obj.reportStart(testCaseDescription,hostName);
		obj.iterationCount.clear();
		obj.iterationCountInTextData();
		/*if(!(module2functionalities.iterationCount.size()<=1))
		{
			Reporter.log(hostName+"<font size=4 color=blue>Total no.of datasets:"+module2functionalities.iterationCount.size()+"</font><br/>");
		}*/

	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@BeforeClass
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void precondition(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo)
	{

		//module2functionalities.udid="ZX1D64HN6H";
		obj=new BaseClass();
		obj.udid="ZX1D64HN6H";
		if(os.contains("Android"))
		{
			obj.startServer(host,port);
			obj.waitTime(10);
		}
		obj.setup(machineName,host, port, browser,os,browserVersion,osVersion,sheetNo);
		obj.setEnvironmentFlag();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@AfterClass
	public void closeSessions()

	{
		obj.closeAllSessions();
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AccountDashboardTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Account DashBoard Test",machineName,method.getName());

			accountDashboardTest=new AccountDashboardTest(obj);
			for(int i=0;i<accountDashboardTest.iterationCount.size();i++)
			{

				accountDashboardTest.dataRowNo=Integer.parseInt(accountDashboardTest.iterationCount.get(i).toString());
				accountDashboardTest.testStepInfo("DataSet: "+(i+1));
				accountDashboardTest.accountDashboardTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=accountDashboardTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AddToCartBundleTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Add To Cart Bundle Test",machineName,method.getName());

			addtocartbundletest=new AddToCartBundleTest(obj);
			for(int i=0;i<addtocartbundletest.iterationCount.size();i++)
			{

				addtocartbundletest.dataRowNo=Integer.parseInt(addtocartbundletest.iterationCount.get(i).toString());
				addtocartbundletest.testStepInfo("DataSet: "+(i+1));
				addtocartbundletest.AddToCartBundleTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=addtocartbundletest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AddToCartDifferentCategoryProductsTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("ADD to Cart different category Test",machineName,method.getName());

			addToCartDifferentCategoryProductsTest=new AddToCartDifferentCategoryProductsTest(obj);
			for(int i=0;i<addToCartDifferentCategoryProductsTest.iterationCount.size();i++)
			{

				addToCartDifferentCategoryProductsTest.dataRowNo=Integer.parseInt(addToCartDifferentCategoryProductsTest.iterationCount.get(i).toString());
				addToCartDifferentCategoryProductsTest.testStepInfo("DataSet: "+(i+1));
				addToCartDifferentCategoryProductsTest.addToCartDifferentCategoryProductsTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=addToCartDifferentCategoryProductsTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AddToCartDifferentCloneIdTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}
		else{
			try{
				TestStart("Add to Cart Different Clone ID Test",machineName,method.getName());

				addToCartDifferentCloneIdTest=new AddToCartDifferentCloneIdTest(obj);
				addToCartDifferentCloneIdTest.openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
				//addToCartDifferentCloneIdTest.createObjects(browser);
				for(int i=0;i<addToCartDifferentCloneIdTest.iterationCount.size();i++)
				{

					addToCartDifferentCloneIdTest.dataRowNo=Integer.parseInt(addToCartDifferentCloneIdTest.iterationCount.get(i).toString());
					addToCartDifferentCloneIdTest.testStepInfo("DataSet: "+(i+1));
					addToCartDifferentCloneIdTest.addToCartDifferentCloneIdTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.driver.quit();
				addToCartDifferentCloneIdTest.destroyObjects();
				obj.testCaseExecutionStatus=addToCartDifferentCloneIdTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}	

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AutoScrollOnPGPTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException {
		try{
			TestStart("Auto Scroll on pgp test Test",machineName,method.getName());
			autoScrollOnPGPTest=new AutoScrollOnPGPTest(obj);
			for(int i=0;i<autoScrollOnPGPTest.iterationCount.size();i++){
				autoScrollOnPGPTest.dataRowNo=Integer.parseInt(autoScrollOnPGPTest.iterationCount.get(i).toString());
				autoScrollOnPGPTest.testStepInfo("DataSet: "+(i+1));
				autoScrollOnPGPTest.AutoScrollOnPGPTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=autoScrollOnPGPTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/**
	 * @throws IOException *****************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AllDepartmentPDPVerificationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws IOException {
		try{
			TestStart("All Department PDP Verification Test",machineName,method.getName());
			allDepartmentPDPVerificationTest=new AllDepartmentPDPVerificationTest(obj);
			
			obj.CopyExcelTemplateAllDepartmentPDPVerfication3();
			
			for(int i=0;i<allDepartmentPDPVerificationTest.iterationCount.size();i++){
				allDepartmentPDPVerificationTest.dataRowNo=Integer.parseInt(allDepartmentPDPVerificationTest.iterationCount.get(i).toString());
				allDepartmentPDPVerificationTest.testStepInfo("DataSet: "+(i+1));
				allDepartmentPDPVerificationTest.AllDepartmentPDPVerificationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=allDepartmentPDPVerificationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	/**
	 * @throws IOException *****************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AllDepartmentGetPDPURLTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws IOException {
		try{
			TestStart("All Department Get PDP URL Test",machineName,method.getName());
			allDepartmentGetPDPURLTest=new AllDepartmentGetPDPURLTest(obj);
			
			obj.CopyExcelTemplateAllDepartmentPDPVerfication2();
			
			for(int i=0;i<allDepartmentGetPDPURLTest.iterationCount.size();i++){
				allDepartmentGetPDPURLTest.dataRowNo=Integer.parseInt(allDepartmentGetPDPURLTest.iterationCount.get(i).toString());
				allDepartmentGetPDPURLTest.testStepInfo("DataSet: "+(i+1));
				allDepartmentGetPDPURLTest.AllDepartmentGetPDPURLTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=allDepartmentGetPDPURLTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	/*******************************************************************************************************************************************************************************************************************************************************************/
	/**
	 * @throws IOException *****************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AllDepartmentGetPDPURLDeleteTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws IOException {
		try{
			TestStart("All Department Get PDP URL Delete Test",machineName,method.getName());
			allDepartmentGetPDPURLDeleteTest=new AllDepartmentGetPDPURLDeleteTest(obj);
			
			for(int i=0;i<allDepartmentGetPDPURLDeleteTest.iterationCount.size();i++){
				allDepartmentGetPDPURLDeleteTest.dataRowNo=Integer.parseInt(allDepartmentGetPDPURLDeleteTest.iterationCount.get(i).toString());
				allDepartmentGetPDPURLDeleteTest.testStepInfo("DataSet: "+(i+1));
				allDepartmentGetPDPURLDeleteTest.AllDepartmentGetPDPURLDeleteTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=allDepartmentGetPDPURLDeleteTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	
	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void BillingPaypalCheckoutRegisteredTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException{
		try{
			TestStart("Billing Paypal Checkout Registered Test",machineName,method.getName());
			billingPaypalCheckoutRegisteredTest = new BillingPaypalCheckoutRegisteredTest(obj);
			for(int i=0;i<billingPaypalCheckoutRegisteredTest.iterationCount.size();i++){
				billingPaypalCheckoutRegisteredTest.dataRowNo=Integer.parseInt(billingPaypalCheckoutRegisteredTest.iterationCount.get(i).toString());
				billingPaypalCheckoutRegisteredTest.testStepInfo("DataSet: "+(i+1));
				billingPaypalCheckoutRegisteredTest.billingPaypalCheckoutRegisteredTestScenario(machineName, host, port, browser, os, browserVersion, osVersion, method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=billingPaypalCheckoutRegisteredTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void BundlesShirtAndTieTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Bundles Shirt And Tie Test",machineName,method.getName());

			bundlesShirtAndTieTest=new BundlesShirtAndTieTest(obj);
			for(int i=0;i<bundlesShirtAndTieTest.iterationCount.size();i++)
			{

				bundlesShirtAndTieTest.dataRowNo=Integer.parseInt(bundlesShirtAndTieTest.iterationCount.get(i).toString());
				bundlesShirtAndTieTest.testStepInfo("DataSet: "+(i+1));
				bundlesShirtAndTieTest.BundlesShirtAndTieTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=bundlesShirtAndTieTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void BundlesSuitSeparatesTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Bundles Shirt And Tie Test",machineName,method.getName());

			bundlesSuitSeparatesTest=new BundlesSuitSeparatesTest(obj);
			for(int i=0;i<bundlesSuitSeparatesTest.iterationCount.size();i++)
			{
				bundlesSuitSeparatesTest.dataRowNo=Integer.parseInt(bundlesSuitSeparatesTest.iterationCount.get(i).toString());
				bundlesSuitSeparatesTest.testStepInfo("DataSet: "+(i+1));
				bundlesSuitSeparatesTest.BundlesSuitSeparatesTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=bundlesSuitSeparatesTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void CategoryShoppingCartTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("category Shopping Cart Test",machineName,method.getName());

			categoryShoppingCartTest=new CategoryShoppingCartTest(obj);
			for(int i=0;i<categoryShoppingCartTest.iterationCount.size();i++)
			{

				categoryShoppingCartTest.dataRowNo=Integer.parseInt(categoryShoppingCartTest.iterationCount.get(i).toString());
				categoryShoppingCartTest.testStepInfo("DataSet: "+(i+1));
				categoryShoppingCartTest.CategoryShoppingCartTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=categoryShoppingCartTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void CertonaTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Certona Test",machineName,method.getName());

			certonaTest=new CertonaTest(obj);
			for(int i=0;i<certonaTest.iterationCount.size();i++)
			{

				certonaTest.dataRowNo=Integer.parseInt(certonaTest.iterationCount.get(i).toString());
				certonaTest.testStepInfo("DataSet: "+(i+1));
				certonaTest.CertonaTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=certonaTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void CMCValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("CMC Validation Test",machineName,method.getName());

			cmcValidationTest=new CMCValidationTest(obj);
			for(int i=0;i<cmcValidationTest.iterationCount.size();i++)
			{

				cmcValidationTest.dataRowNo=Integer.parseInt(cmcValidationTest.iterationCount.get(i).toString());
				cmcValidationTest.testStepInfo("DataSet: "+(i+1));
				cmcValidationTest.cmcValidationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=cmcValidationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/
	/*******************************************************************************************************************************************************************************************************************************************************************/
	/**
	 * @throws IOException *****************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ColorSwatchVerificationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws IOException {
		try{
			TestStart("Color Swatch Verification Test",machineName,method.getName());
			colorSwatchVerificationTest=new ColorSwatchVerificationTest(obj);
			
			for(int i=0;i<colorSwatchVerificationTest.iterationCount.size();i++){
				colorSwatchVerificationTest.dataRowNo=Integer.parseInt(colorSwatchVerificationTest.iterationCount.get(i).toString());
				colorSwatchVerificationTest.testStepInfo("DataSet: "+(i+1));
				colorSwatchVerificationTest.ColorSwatchVerificationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=colorSwatchVerificationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	
	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void DepartmentLinksAndSubCategoryLinksNavigationTestPartOne(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}else{

			try{

				TestStart("Department Links and Sub Category Navigation Test Part One",machineName,method.getName());

				departmentLinksAndSubCategoryLinksNavigationTest=new DepartmentLinksAndSubCategoryLinksNavigationTest(obj);
				for(int i=0;i<departmentLinksAndSubCategoryLinksNavigationTest.iterationCount.size();i++)
				{

					departmentLinksAndSubCategoryLinksNavigationTest.dataRowNo=Integer.parseInt(departmentLinksAndSubCategoryLinksNavigationTest.iterationCount.get(i).toString());
					departmentLinksAndSubCategoryLinksNavigationTest.testStepInfo("DataSet: "+(i+1));
					departmentLinksAndSubCategoryLinksNavigationTest.departmentLinksAndSubCategoryLinksNavigationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.testCaseExecutionStatus=departmentLinksAndSubCategoryLinksNavigationTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void DepartmentLinksAndSubCategoryLinksNavigationTestPartTwo(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}else{

			try{

				TestStart("Department Links and Sub Category Navigation Test Part Two",machineName,method.getName());

				departmentLinksAndSubCategoryLinksNavigationTest=new DepartmentLinksAndSubCategoryLinksNavigationTest(obj);
				for(int i=0;i<departmentLinksAndSubCategoryLinksNavigationTest.iterationCount.size();i++)
				{

					departmentLinksAndSubCategoryLinksNavigationTest.dataRowNo=Integer.parseInt(departmentLinksAndSubCategoryLinksNavigationTest.iterationCount.get(i).toString());
					departmentLinksAndSubCategoryLinksNavigationTest.testStepInfo("DataSet: "+(i+1));
					departmentLinksAndSubCategoryLinksNavigationTest.departmentLinksAndSubCategoryLinksNavigationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.testCaseExecutionStatus=departmentLinksAndSubCategoryLinksNavigationTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void DepartmentLinksAndSubCategoryLinksNavigationTestPartThree(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}else{

			try{

				TestStart("Department Links and Sub Category Navigation Test Part Three",machineName,method.getName());

				departmentLinksAndSubCategoryLinksNavigationTest=new DepartmentLinksAndSubCategoryLinksNavigationTest(obj);
				for(int i=0;i<departmentLinksAndSubCategoryLinksNavigationTest.iterationCount.size();i++)
				{

					departmentLinksAndSubCategoryLinksNavigationTest.dataRowNo=Integer.parseInt(departmentLinksAndSubCategoryLinksNavigationTest.iterationCount.get(i).toString());
					departmentLinksAndSubCategoryLinksNavigationTest.testStepInfo("DataSet: "+(i+1));
					departmentLinksAndSubCategoryLinksNavigationTest.departmentLinksAndSubCategoryLinksNavigationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.testCaseExecutionStatus=departmentLinksAndSubCategoryLinksNavigationTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void DepartmentLinksAndSubCategoryLinksNavigationTestPartFour(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}else{

			try{

				TestStart("Department Links and Sub Category Navigation Test Part Four",machineName,method.getName());

				departmentLinksAndSubCategoryLinksNavigationTest=new DepartmentLinksAndSubCategoryLinksNavigationTest(obj);
				for(int i=0;i<departmentLinksAndSubCategoryLinksNavigationTest.iterationCount.size();i++)
				{

					departmentLinksAndSubCategoryLinksNavigationTest.dataRowNo=Integer.parseInt(departmentLinksAndSubCategoryLinksNavigationTest.iterationCount.get(i).toString());
					departmentLinksAndSubCategoryLinksNavigationTest.testStepInfo("DataSet: "+(i+1));
					departmentLinksAndSubCategoryLinksNavigationTest.departmentLinksAndSubCategoryLinksNavigationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.testCaseExecutionStatus=departmentLinksAndSubCategoryLinksNavigationTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void EGiftCardMemberTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("EGift Card Member Test",machineName,method.getName());

			eGiftCardMemberTest=new EGiftCardMemberTest(obj);
			for(int i=0;i<eGiftCardMemberTest.iterationCount.size();i++)
			{

				eGiftCardMemberTest.dataRowNo=Integer.parseInt(eGiftCardMemberTest.iterationCount.get(i).toString());
				eGiftCardMemberTest.testStepInfo("DataSet: "+(i+1));
				eGiftCardMemberTest.EGiftCardMemberTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=eGiftCardMemberTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void EGiftCardWithRegularProductTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException{
		try{
			TestStart("EGift Card With Regular Product Test",machineName,method.getName());
			eGiftCardWithRegularProductTest = new EGiftCardWithRegularProductTest(obj);
			for(int i=0;i<eGiftCardWithRegularProductTest.iterationCount.size();i++){
				eGiftCardWithRegularProductTest.dataRowNo=Integer.parseInt(eGiftCardWithRegularProductTest.iterationCount.get(i).toString());
				eGiftCardWithRegularProductTest.testStepInfo("DataSet: "+(i+1));
				eGiftCardWithRegularProductTest.eGiftCardWithRegularProductTestScenario(machineName, host, port, browser, os, browserVersion, osVersion, method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=eGiftCardWithRegularProductTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ExpressPaypalGuestTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Express Paypal Guest Test",machineName,method.getName());

			expresspaypalguest=new ExpressPaypalGuestTest(obj);
			for(int i=0;i<expresspaypalguest.iterationCount.size();i++)
			{

				expresspaypalguest.dataRowNo=Integer.parseInt(expresspaypalguest.iterationCount.get(i).toString());
				expresspaypalguest.testStepInfo("DataSet: "+(i+1));
				expresspaypalguest.ExpressPaypalGuestTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=expresspaypalguest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void FooterLinksTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Footer Links Test",machineName,method.getName());
			footerLinksTest=new FooterLinksTest(obj);
			for(int i=0;i<footerLinksTest.iterationCount.size();i++){
				footerLinksTest.dataRowNo=Integer.parseInt(footerLinksTest.iterationCount.get(i).toString());
				footerLinksTest.testStepInfo("DataSet: "+(i+1));
				footerLinksTest.footerLinkshomepageTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=footerLinksTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void GiftCardRedemptionTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("gift Card Redemption Test",machineName,method.getName());

			giftCardRedemptionTest=new GiftCardRedemptionTest(obj);
			for(int i=0;i<giftCardRedemptionTest.iterationCount.size();i++)
			{

				giftCardRedemptionTest.dataRowNo=Integer.parseInt(giftCardRedemptionTest.iterationCount.get(i).toString());
				giftCardRedemptionTest.testStepInfo("DataSet: "+(i+1));
				giftCardRedemptionTest.GiftCardRedemptionTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=giftCardRedemptionTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void GuestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Guest User Registration on Order Confirmation Page With Saved Card and PF Test",machineName,method.getName());

			guestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest=new GuestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest(obj);
			for(int i=0;i<guestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest.iterationCount.size();i++)
			{

				guestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest.dataRowNo=Integer.parseInt(guestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest.iterationCount.get(i).toString());
				guestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest.testStepInfo("DataSet: "+(i+1));
				guestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest.GuestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=guestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/**
	 * @throws IOException 
	 * @throws WriteException 
	 * @throws BiffException 
	 * @throws RowsExceededException *****************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	
	
	public void GuidedShoppingTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws RowsExceededException, BiffException, WriteException, IOException 
	{
		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}
		else{
			try{
				TestStart("Guided Shopping Test",machineName,method.getName());

				guidedShoppingTest=new GuidedShoppingTest(obj);
				guidedShoppingTest.openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
				//addToCartDifferentCloneIdTest.createObjects(browser);
				
				obj.CopyExcelTemplateGuidedShopping();
				
				for(int i=0;i<guidedShoppingTest.iterationCount.size();i++)
				{

					guidedShoppingTest.dataRowNo=Integer.parseInt(guidedShoppingTest.iterationCount.get(i).toString());
					guidedShoppingTest.testStepInfo("DataSet: "+(i+1));
					guidedShoppingTest.guidedShoppingTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.driver.quit();
				guidedShoppingTest.destroyObjects();
				obj.testCaseExecutionStatus=guidedShoppingTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}	

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void HeaderLinksTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Header Links Test",machineName,method.getName());

			headerLinksOnHomePageTest=new HeaderLinksTest(obj);
			for(int i=0;i<headerLinksOnHomePageTest.iterationCount.size();i++)
			{

				headerLinksOnHomePageTest.dataRowNo=Integer.parseInt(headerLinksOnHomePageTest.iterationCount.get(i).toString());
				headerLinksOnHomePageTest.testStepInfo("DataSet: "+(i+1));
				headerLinksOnHomePageTest.headerLinksTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=headerLinksOnHomePageTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void HeaderLinksVerificationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException{
		try{
			TestStart("Header Links Verification Test",machineName,method.getName());
			headerLinksVerificationTest = new HeaderLinksVerificationTest(obj);
			for(int i=0;i<headerLinksVerificationTest.iterationCount.size();i++){
				headerLinksVerificationTest.dataRowNo=Integer.parseInt(headerLinksVerificationTest.iterationCount.get(i).toString());
				headerLinksVerificationTest.testStepInfo("DataSet: "+(i+1));
				headerLinksVerificationTest.headerLinksVerificationTestScenario(machineName, host, port, browser, os, browserVersion, osVersion, method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=headerLinksVerificationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void HomePageWithDifferentCloneIdTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}
		else{
			try{
				TestStart("Home Page With Different CloneId Test",machineName,method.getName());

				homePageWithDifferentCloneIdTest=new HomePageWithDifferentCloneIdTest(obj);
				homePageWithDifferentCloneIdTest.openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
				//addToCartDifferentCloneIdTest.createObjects(browser);
				for(int i=0;i<homePageWithDifferentCloneIdTest.iterationCount.size();i++)
				{

					homePageWithDifferentCloneIdTest.dataRowNo=Integer.parseInt(homePageWithDifferentCloneIdTest.iterationCount.get(i).toString());
					homePageWithDifferentCloneIdTest.testStepInfo("DataSet: "+(i+1));
					homePageWithDifferentCloneIdTest.HomePageWithDifferentCloneIdTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.driver.quit();
				homePageWithDifferentCloneIdTest.destroyObjects();
				obj.testCaseExecutionStatus=homePageWithDifferentCloneIdTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ImageSizeValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Image Size Validation Test",machineName,method.getName());
			imageSizeValidationTest=new ImageSizeValidationTest(obj);
			for(int i=0;i<imageSizeValidationTest.iterationCount.size();i++){
				obj.testStepPassed("Dataset Count : "+imageSizeValidationTest.iterationCount.size());
				imageSizeValidationTest.dataRowNo=Integer.parseInt(imageSizeValidationTest.iterationCount.get(i).toString());
				imageSizeValidationTest.testStepInfo("DataSet: "+(i+1));
				imageSizeValidationTest.imageSizeValidationTestScenario(machineName, host, port, browser, os, browserVersion, osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=imageSizeValidationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void InternationalShippingTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("International Shipping Test",machineName,method.getName());

			internationalShippingTest=new InternationalShippingTest(obj);
			for(int i=0;i<internationalShippingTest.iterationCount.size();i++)
			{

				internationalShippingTest.dataRowNo=Integer.parseInt(internationalShippingTest.iterationCount.get(i).toString());
				internationalShippingTest.testStepInfo("DataSet: "+(i+1));
				internationalShippingTest.internationalShippingTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=internationalShippingTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void KeywordSeachTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Keyword Search Test",machineName,method.getName());
			keywordSearchTest=new KeywordSearchTest(obj);
			for(int i=0;i<keywordSearchTest.iterationCount.size();i++){
				obj.testStepPassed("Dataset Count : "+keywordSearchTest.iterationCount.size());
				keywordSearchTest.dataRowNo=Integer.parseInt(keywordSearchTest.iterationCount.get(i).toString());
				keywordSearchTest.testStepInfo("DataSet: "+(i+1));
				keywordSearchTest.keywordSearchTestScenario(machineName, host, port, browser, os, browserVersion, osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=keywordSearchTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void OneToManyOrderPlacementTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("One to many order placement Test",machineName,method.getName());

			onetomanyorderplacementtest=new OneToManyOrderPlacementTest(obj);
			for(int i=0;i<onetomanyorderplacementtest.iterationCount.size();i++)
			{
				onetomanyorderplacementtest.dataRowNo=Integer.parseInt(onetomanyorderplacementtest.iterationCount.get(i).toString());
				onetomanyorderplacementtest.testStepInfo("DataSet: "+(i+1));
				onetomanyorderplacementtest.OneToManyOrderPlacementTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=onetomanyorderplacementtest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void PantsTailoringProductsTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Pants Tailoring Product Test",machineName,method.getName());

			pantsTailoringProductsTest=new PantsTailoringProductsTest(obj);
			for(int i=0;i<pantsTailoringProductsTest.iterationCount.size();i++)
			{

				pantsTailoringProductsTest.dataRowNo=Integer.parseInt(pantsTailoringProductsTest.iterationCount.get(i).toString());
				pantsTailoringProductsTest.testStepInfo("DataSet: "+(i+1));
				pantsTailoringProductsTest.PantsTailoringProductsTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=pantsTailoringProductsTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void PhysicalGiftCardAndAnyOneProductOrderPlacementTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Physical Gift Card And Any One Product Order Placement Test",machineName,method.getName());

			physicalGiftCardAndAnyOneProductOrderPlacementTest=new PhysicalGiftCardAndAnyOneProductOrderPlacementTest(obj);
			for(int i=0;i<physicalGiftCardAndAnyOneProductOrderPlacementTest.iterationCount.size();i++)
			{

				physicalGiftCardAndAnyOneProductOrderPlacementTest.dataRowNo=Integer.parseInt(physicalGiftCardAndAnyOneProductOrderPlacementTest.iterationCount.get(i).toString());
				physicalGiftCardAndAnyOneProductOrderPlacementTest.testStepInfo("DataSet: "+(i+1));
				physicalGiftCardAndAnyOneProductOrderPlacementTest.PhysicalGiftCardAndAnyOneProductOrderPlacementTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=physicalGiftCardAndAnyOneProductOrderPlacementTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void PhysicalGiftCardOrderGuestTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("physical gift card ordered Test",machineName,method.getName());

			physicalgiftcardorderguest=new PhysicalGiftCardOrderGuestTest(obj) ;
			for(int i=0;i<physicalgiftcardorderguest.iterationCount.size();i++)
			{

				physicalgiftcardorderguest.dataRowNo=Integer.parseInt(physicalgiftcardorderguest.iterationCount.get(i).toString());
				physicalgiftcardorderguest.testStepInfo("DataSet: "+(i+1));
				physicalgiftcardorderguest.PhysicalGiftCardOrderGuestTestTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=physicalgiftcardorderguest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void PriceComparisonTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException{
		try{
			TestStart("Price Comparison Test",machineName,method.getName());
			priceComparisonTest = new PriceComparisonTest(obj);
			for(int i=0;i<priceComparisonTest.iterationCount.size();i++){
				priceComparisonTest.dataRowNo=Integer.parseInt(priceComparisonTest.iterationCount.get(i).toString());
				priceComparisonTest.testStepInfo("DataSet: "+(i+1));
				priceComparisonTest.priceComparisonTestScenario(machineName, host, port, browser, os, browserVersion, osVersion, method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=priceComparisonTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void PricePendingValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Price Pending Validation Test",machineName,method.getName());
			pricePendingValidationTest=new PricePendingValidationTest(obj);
			for(int i=0;i<pricePendingValidationTest.iterationCount.size();i++){
				obj.testStepPassed("Dataset Count : "+pricePendingValidationTest.iterationCount.size());
				pricePendingValidationTest.dataRowNo=Integer.parseInt(pricePendingValidationTest.iterationCount.get(i).toString());
				pricePendingValidationTest.testStepInfo("DataSet: "+(i+1));
				pricePendingValidationTest.pricePendingValidationTestScenario(machineName, host, port, browser, os, browserVersion, osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=pricePendingValidationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void RedeemRewardPointsTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Redeem reward points Test",machineName,method.getName());

			redeemRewardPointsTest=new RedeemRewardPointsTest(obj);
			for(int i=0;i<redeemRewardPointsTest.iterationCount.size();i++)
			{

				redeemRewardPointsTest.dataRowNo=Integer.parseInt(redeemRewardPointsTest.iterationCount.get(i).toString());
				redeemRewardPointsTest.testStepInfo("DataSet: "+(i+1));
				redeemRewardPointsTest.RedeemRewardPointsTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=redeemRewardPointsTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void RegistrationOnPaymentsPageTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Registatrtion Test",machineName,method.getName());

			registrationonpaymenttest=new RegistrationOnPaymentsPageTest(obj);
			for(int i=0;i<registrationonpaymenttest.iterationCount.size();i++)
			{

				registrationonpaymenttest.dataRowNo=Integer.parseInt(registrationonpaymenttest.iterationCount.get(i).toString());
				registrationonpaymenttest.testStepInfo("DataSet: "+(i+1));
				registrationonpaymenttest.RegistrationOnPaymentsPageTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=registrationonpaymenttest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void RegisteredUserSavedAddressandSavedBillingPlaceOrderTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Registered User Saved Address and Saved Billing Place Order Test",machineName,method.getName());

			registeredUserSavedAddressandSavedBillingPlaceOrderTest=new RegisteredUserSavedAddressandSavedBillingPlaceOrderTest(obj);
			for(int i=0;i<registeredUserSavedAddressandSavedBillingPlaceOrderTest.iterationCount.size();i++)
			{

				registeredUserSavedAddressandSavedBillingPlaceOrderTest.dataRowNo=Integer.parseInt(registeredUserSavedAddressandSavedBillingPlaceOrderTest.iterationCount.get(i).toString());
				registeredUserSavedAddressandSavedBillingPlaceOrderTest.testStepInfo("DataSet: "+(i+1));
				registeredUserSavedAddressandSavedBillingPlaceOrderTest.RegisteredUserSavedAddressandSavedBillingPlaceOrderTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=registeredUserSavedAddressandSavedBillingPlaceOrderTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void RegisteredUserShoppingCartUpdateProductfromReviewPageTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("RegisteredUserShoppingCartUpdateProductfromReviewPageTest",machineName,method.getName());

			registeredUserShoppingCartUpdateProductfromReviewPageTest=new RegisteredUserShoppingCartUpdateProductfromReviewPageTest(obj);
			for(int i=0;i<registeredUserShoppingCartUpdateProductfromReviewPageTest.iterationCount.size();i++)
			{

				registeredUserShoppingCartUpdateProductfromReviewPageTest.dataRowNo=Integer.parseInt(registeredUserShoppingCartUpdateProductfromReviewPageTest.iterationCount.get(i).toString());
				registeredUserShoppingCartUpdateProductfromReviewPageTest.testStepInfo("DataSet: "+(i+1));
				registeredUserShoppingCartUpdateProductfromReviewPageTest.RegisteredUserShoppingCartUpdateProductfromReviewPageTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=registeredUserShoppingCartUpdateProductfromReviewPageTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void RegisteredUserEditShippingDetailsfromReviewPagePlaceOrderTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Registered User Edit Shipping Details from Review Page Place Order Test",machineName,method.getName());

			registeredUserEditShippingDetailsfromReviewPagePlaceOrderTest=new RegisteredUserEditShippingDetailsfromReviewPagePlaceOrderTest(obj);
			for(int i=0;i<registeredUserEditShippingDetailsfromReviewPagePlaceOrderTest.iterationCount.size();i++)
			{

				registeredUserEditShippingDetailsfromReviewPagePlaceOrderTest.dataRowNo=Integer.parseInt(registeredUserEditShippingDetailsfromReviewPagePlaceOrderTest.iterationCount.get(i).toString());
				registeredUserEditShippingDetailsfromReviewPagePlaceOrderTest.testStepInfo("DataSet: "+(i+1));
				registeredUserEditShippingDetailsfromReviewPagePlaceOrderTest.RegisteredUserEditShippingDetailsfromReviewPagePlaceOrderTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=registeredUserEditShippingDetailsfromReviewPagePlaceOrderTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void RegisteredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Registered User Edit Shipping Details To Store from Review Page Place Order Test",machineName,method.getName());

			registeredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest=new RegisteredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest(obj);
			for(int i=0;i<registeredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest.iterationCount.size();i++)
			{

				registeredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest.dataRowNo=Integer.parseInt(registeredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest.iterationCount.get(i).toString());
				registeredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest.testStepInfo("DataSet: "+(i+1));
				registeredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest.RegisteredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=registeredUserEditShippingDetailsToStorefromReviewPagePlaceOrderTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void RegisteredUserEditBillingDetailsfromReviewPageTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Registered User Edit Billing Details from Review Page Test",machineName,method.getName());

			registeredUserEditBillingDetailsfromReviewPageTest=new RegisteredUserEditBillingDetailsfromReviewPageTest(obj);
			for(int i=0;i<registeredUserEditBillingDetailsfromReviewPageTest.iterationCount.size();i++)
			{

				registeredUserEditBillingDetailsfromReviewPageTest.dataRowNo=Integer.parseInt(registeredUserEditBillingDetailsfromReviewPageTest.iterationCount.get(i).toString());
				registeredUserEditBillingDetailsfromReviewPageTest.testStepInfo("DataSet: "+(i+1));
				registeredUserEditBillingDetailsfromReviewPageTest.RegisteredUserEditBillingDetailsfromReviewPageTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=registeredUserShoppingCartUpdateProductfromReviewPageTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void RegisteredUserEditBillingDetailsPaypalPlaceOrderTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Registered User Edit Billing Details Paypal Place Order Test",machineName,method.getName());

			registeredUserEditBillingDetailsPaypalPlaceOrderTest=new RegisteredUserEditBillingDetailsPaypalPlaceOrderTest(obj);
			for(int i=0;i<registeredUserEditBillingDetailsPaypalPlaceOrderTest.iterationCount.size();i++)
			{

				registeredUserEditBillingDetailsPaypalPlaceOrderTest.dataRowNo=Integer.parseInt(registeredUserEditBillingDetailsPaypalPlaceOrderTest.iterationCount.get(i).toString());
				registeredUserEditBillingDetailsPaypalPlaceOrderTest.testStepInfo("DataSet: "+(i+1));
				registeredUserEditBillingDetailsPaypalPlaceOrderTest.RegisteredUserEditBillingDetailsPaypalPlaceOrderTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=registeredUserEditBillingDetailsPaypalPlaceOrderTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void SavedCardOrderPlacementTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException{
		try{
			TestStart("Saved Card Order Placement Test",machineName,method.getName());
			savedCardOrderPlacementTest = new SavedCardOrderPlacementTest(obj);
			for(int i=0;i<savedCardOrderPlacementTest.iterationCount.size();i++){
				savedCardOrderPlacementTest.dataRowNo=Integer.parseInt(savedCardOrderPlacementTest.iterationCount.get(i).toString());
				savedCardOrderPlacementTest.testStepInfo("DataSet: "+(i+1));
				savedCardOrderPlacementTest.SavedCardOrderPlacementTestScenario(machineName, host, port, browser, os, browserVersion, osVersion, method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=savedCardOrderPlacementTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void SaveItemGuestTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Save Item Guest Test",machineName,method.getName());

			saveItemGuestTest=new SaveItemGuestTest(obj);
			for(int i=0;i<saveItemGuestTest.iterationCount.size();i++)
			{

				saveItemGuestTest.dataRowNo=Integer.parseInt(saveItemGuestTest.iterationCount.get(i).toString());
				saveItemGuestTest.testStepInfo("DataSet: "+(i+1));
				saveItemGuestTest.SaveItemUserTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=saveItemGuestTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void SaveItemUserTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Save Item User Test",machineName,method.getName());

			saveItemUserTest=new SaveItemUserTest(obj);
			for(int i=0;i<saveItemUserTest.iterationCount.size();i++)
			{

				saveItemUserTest.dataRowNo=Integer.parseInt(saveItemUserTest.iterationCount.get(i).toString());
				saveItemUserTest.testStepInfo("DataSet: "+(i+1));
				saveItemUserTest.SaveItemUserTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=saveItemUserTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void SavedSizesSuitsTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Auto Scroll on pgp test Test",machineName,method.getName());

			savedsizessuit=new SavedSizesSuitsTest(obj);

			for(int i=0;i<savedsizessuit.iterationCount.size();i++)
			{

				savedsizessuit.dataRowNo=Integer.parseInt(savedsizessuit.iterationCount.get(i).toString());
				savedsizessuit.testStepInfo("DataSet: "+(i+1));
				savedsizessuit.SavedSizesSuitsTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=savedsizessuit.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ShoppingCartTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Shopping Cart Test",machineName,method.getName());

			shoppingCartTest=new ShoppingCartTest(obj);
			for(int i=0;i<shoppingCartTest.iterationCount.size();i++)
			{

				shoppingCartTest.dataRowNo=Integer.parseInt(shoppingCartTest.iterationCount.get(i).toString());
				shoppingCartTest.testStepInfo("DataSet: "+(i+1));
				shoppingCartTest.shoppingCartTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=shoppingCartTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ShopTelligenceTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Shop Telligence Test",machineName,method.getName());

			shopTelligenceTest=new ShopTelligenceTest(obj);

			for(int i=0;i<shopTelligenceTest.iterationCount.size();i++)
			{

				shopTelligenceTest.dataRowNo=Integer.parseInt(shopTelligenceTest.iterationCount.get(i).toString());
				shopTelligenceTest.testStepInfo("DataSet: "+(i+1));
				shopTelligenceTest.shopTelligenceTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=shopTelligenceTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void SocialLinksTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException{
		try{
			TestStart("Social Links Test",machineName,method.getName());
			socialLinksTest = new SocialLinksTest(obj);
			for(int i=0;i<socialLinksTest.iterationCount.size();i++){
				socialLinksTest.dataRowNo=Integer.parseInt(socialLinksTest.iterationCount.get(i).toString());
				socialLinksTest.testStepInfo("DataSet: "+(i+1));
				socialLinksTest.socialLinksTestScenario(machineName, host, port, browser, os, browserVersion, osVersion, method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=socialLinksTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})

	public void SplitPaymentOrderPlacementTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Split payment order placement Test",machineName,method.getName());

			splitpaymentorderplacementtest=new SplitPaymentOrderPlacementTest(obj);
			for(int i=0;i<splitpaymentorderplacementtest.iterationCount.size();i++)
			{

				splitpaymentorderplacementtest.dataRowNo=Integer.parseInt(splitpaymentorderplacementtest.iterationCount.get(i).toString());
				splitpaymentorderplacementtest.testStepInfo("DataSet: "+(i+1));
				splitpaymentorderplacementtest.SplitPaymentOrderPlacementTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=splitpaymentorderplacementtest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void StoreFinderMemberTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Store finder member Test",machineName,method.getName());

			storefindermembertest=new StoreFinderMemberTest(obj);
			for(int i=0;i<storefindermembertest.iterationCount.size();i++)
			{

				storefindermembertest.dataRowNo=Integer.parseInt(storefindermembertest.iterationCount.get(i).toString());
				storefindermembertest.testStepInfo("DataSet: "+(i+1));
				storefindermembertest.StoreFinderMemberTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=storefindermembertest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void UserGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}
		else{
			try{
				TestStart("User Gift Card Balance Validation Add Retail Product Coupon Reedemption Validation Test",machineName,method.getName());

				userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest=new UserGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest(obj);
				userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest.openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
				//addToCartDifferentCloneIdTest.createObjects(browser);
				for(int i=0;i<userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest.iterationCount.size();i++)
				{

					userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest.dataRowNo=Integer.parseInt(userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest.iterationCount.get(i).toString());
					userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest.testStepInfo("DataSet: "+(i+1));
					userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest.userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.driver.quit();
				userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest.destroyObjects();
				obj.testCaseExecutionStatus=userGiftCardBalanceValidationAddRetailProductCouponReedemptionValidationTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}	

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void UserLoginValidationStoreFinderValidationSAPAddressValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}
		else{
			try{
				TestStart("User Login Validation Store Finder Validation SAP Address Validation Test",machineName,method.getName());

				userLoginValidationStoreFinderValidationSAPAddressValidationTest=new UserLoginValidationStoreFinderValidationSAPAddressValidationTest(obj);
				userLoginValidationStoreFinderValidationSAPAddressValidationTest.openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
				//addToCartDifferentCloneIdTest.createObjects(browser);
				for(int i=0;i<userLoginValidationStoreFinderValidationSAPAddressValidationTest.iterationCount.size();i++)
				{

					userLoginValidationStoreFinderValidationSAPAddressValidationTest.dataRowNo=Integer.parseInt(userLoginValidationStoreFinderValidationSAPAddressValidationTest.iterationCount.get(i).toString());
					userLoginValidationStoreFinderValidationSAPAddressValidationTest.testStepInfo("DataSet: "+(i+1));
					userLoginValidationStoreFinderValidationSAPAddressValidationTest.userLoginValidationStoreFinderValidationSAPAddressValidationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.driver.quit();
				userLoginValidationStoreFinderValidationSAPAddressValidationTest.destroyObjects();
				obj.testCaseExecutionStatus=userLoginValidationStoreFinderValidationSAPAddressValidationTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}	

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void UserRegistrationThenPFRegTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException{
		/*if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}
		else {*/
		try{
			TestStart("User Registration Then PF Reg Test",machineName,method.getName());
			userRegistrationThenPFRegTest = new UserRegistrationThenPFRegTest(obj);
			for(int i=0;i<userRegistrationThenPFRegTest.iterationCount.size();i++){
				userRegistrationThenPFRegTest.dataRowNo=Integer.parseInt(userRegistrationThenPFRegTest.iterationCount.get(i).toString());
				userRegistrationThenPFRegTest.testStepInfo("DataSet: "+(i+1));
				userRegistrationThenPFRegTest.userRegistrationThenPFRegTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=userRegistrationThenPFRegTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	//}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void UserRegistrationWithPFTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{


		/*if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}else{*/
		try{
			TestStart("User Registration With PF Test",machineName,method.getName());
			userRegistrationWithPFTest=new UserRegistrationWithPFTest(obj);
			for(int i=0;i<userRegistrationWithPFTest.iterationCount.size();i++)
			{

				userRegistrationWithPFTest.dataRowNo=Integer.parseInt(userRegistrationWithPFTest.iterationCount.get(i).toString());
				userRegistrationWithPFTest.testStepInfo("DataSet: "+(i+1));
				userRegistrationWithPFTest.UserRegistrationWithPFTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}


		}finally{
			obj.testCaseExecutionStatus=userRegistrationWithPFTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	//}

	/*******************************************************************************************************************************************************************************************************************************************************************/


	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void UserWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}
		else{
			try{
				TestStart("User With PF Creation Adding Rental Product Verify Order History Validation Test",machineName,method.getName());

				userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest=new UserWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest(obj);
				userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest.openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
				//addToCartDifferentCloneIdTest.createObjects(browser);
				for(int i=0;i<userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest.iterationCount.size();i++)
				{

					userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest.dataRowNo=Integer.parseInt(userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest.iterationCount.get(i).toString());
					userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest.testStepInfo("DataSet: "+(i+1));
					userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest.userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.driver.quit();
				userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest.destroyObjects();
				obj.testCaseExecutionStatus=userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}	

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void VisualSearchTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Visual Search Test",machineName,method.getName());

			visualSearchTest=new VisualSearchTest(obj);
			for(int i=0;i<visualSearchTest.iterationCount.size();i++)
			{

				visualSearchTest.dataRowNo=Integer.parseInt(visualSearchTest.iterationCount.get(i).toString());
				visualSearchTest.testStepInfo("DataSet: "+(i+1));
				visualSearchTest.visualSearchTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=visualSearchTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void StatusCodeCheckTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{

		if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}
		else{
			try{
				TestStart("Status Code Check Test",machineName,method.getName());

				statusCodeCheckTest=new StatusCodeCheckTest(obj);
				statusCodeCheckTest.openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
				//addToCartDifferentCloneIdTest.createObjects(browser);
				for(int i=0;i<statusCodeCheckTest.iterationCount.size();i++)
				{

					statusCodeCheckTest.dataRowNo=Integer.parseInt(statusCodeCheckTest.iterationCount.get(i).toString());
					statusCodeCheckTest.testStepInfo("DataSet: "+(i+1));
					statusCodeCheckTest.statusCodeCheckTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
				}
			}finally{
				obj.driver.quit();
				statusCodeCheckTest.destroyObjects();
				obj.testCaseExecutionStatus=statusCodeCheckTest.testCaseExecutionStatus;
				TestEnd();
			}
		}
	}	


	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void UserRegistrationWithoutPFTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{


		/*if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}else{*/
		try{
			TestStart("User Registration Without PF Test",machineName,method.getName());
			userRegistrationWithoutPFTest=new UserRegistrationWithoutPFTest(obj);
			for(int i=0;i<userRegistrationWithoutPFTest.iterationCount.size();i++)
			{

				userRegistrationWithoutPFTest.dataRowNo=Integer.parseInt(userRegistrationWithoutPFTest.iterationCount.get(i).toString());
				userRegistrationWithoutPFTest.testStepInfo("DataSet: "+(i+1));
				userRegistrationWithoutPFTest.userRegistrationWithoutPFTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}


		}finally{
			obj.testCaseExecutionStatus=userRegistrationWithoutPFTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	//}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void UserRegistrationThenEditPFAddressinAccountPageTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{


		/*if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}else{*/
		try{
			TestStart("User Registration Then Edit PF address in account page",machineName,method.getName());
			userRegistrationThenEditPFAddressinAccountPageTest=new UserRegistrationThenEditPFAddressinAccountPageTest(obj);
			for(int i=0;i<userRegistrationThenEditPFAddressinAccountPageTest.iterationCount.size();i++)
			{

				userRegistrationThenEditPFAddressinAccountPageTest.dataRowNo=Integer.parseInt(userRegistrationThenEditPFAddressinAccountPageTest.iterationCount.get(i).toString());
				userRegistrationThenEditPFAddressinAccountPageTest.testStepInfo("DataSet: "+(i+1));
				userRegistrationThenEditPFAddressinAccountPageTest.userRegistrationThenEditPFAddressinAccountPageTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}


		}finally{
			obj.testCaseExecutionStatus=userRegistrationThenEditPFAddressinAccountPageTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	//}

	/*******************************************************************************************************************************************************************************************************************************************************************/	
	
	
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void GiftcardBalanceValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{


		/*if(!browser.equalsIgnoreCase("chrome"))
		{
			throw new SkipException("Skipping this exception");
		}else{*/
		try{
			TestStart("Giftcard Balance Validation Test",machineName,method.getName());
			giftcardBalanceValidationTest=new GiftcardBalanceValidationTest(obj);
			for(int i=0;i<giftcardBalanceValidationTest.iterationCount.size();i++)
			{

				giftcardBalanceValidationTest.dataRowNo=Integer.parseInt(giftcardBalanceValidationTest.iterationCount.get(i).toString());
				giftcardBalanceValidationTest.testStepInfo("DataSet: "+(i+1));
				giftcardBalanceValidationTest.giftcardBalanceValidationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}


		}finally{
			obj.testCaseExecutionStatus=giftcardBalanceValidationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	//}

	/*******************************************************************************************************************************************************************************************************************************************************************/	
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void SubcategoryBreadcrumbVerificationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Subcategory Breadcrumb Verification Test",machineName,method.getName());

			subcategoryBreadcrumbVerificationTest=new SubcategoryBreadcrumbVerificationTest(obj);
			for(int i=0;i<subcategoryBreadcrumbVerificationTest.iterationCount.size();i++)
			{

				subcategoryBreadcrumbVerificationTest.dataRowNo=Integer.parseInt(subcategoryBreadcrumbVerificationTest.iterationCount.get(i).toString());
				subcategoryBreadcrumbVerificationTest.testStepInfo("DataSet: "+(i+1));
				subcategoryBreadcrumbVerificationTest.subcategoryBreadcrumbVerificationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=subcategoryBreadcrumbVerificationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void TaxValidationForPantsTailoringProduct(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Tax Validation for Pants Tailoring Product",machineName,method.getName());

			taxValidationForPantsTailoringProduct=new TaxValidationForPantsTailoringProduct(obj);
			for(int i=0;i<taxValidationForPantsTailoringProduct.iterationCount.size();i++)
			{

				taxValidationForPantsTailoringProduct.dataRowNo=Integer.parseInt(taxValidationForPantsTailoringProduct.iterationCount.get(i).toString());
				taxValidationForPantsTailoringProduct.testStepInfo("DataSet: "+(i+1));
				taxValidationForPantsTailoringProduct.taxvalidationforpantsTailoringProductScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=taxValidationForPantsTailoringProduct.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void FilterValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Filter Validation Test",machineName,method.getName());
			filterValidationTest=new FilterValidationTest(obj);
			for(int i=0;i<filterValidationTest.iterationCount.size();i++){
				obj.testStepPassed("Dataset Count : "+filterValidationTest.iterationCount.size());
				filterValidationTest.dataRowNo=Integer.parseInt(filterValidationTest.iterationCount.get(i).toString());
				filterValidationTest.testStepInfo("DataSet: "+(i+1));
				filterValidationTest.filterValidationTestScenario(machineName, host, port, browser, os, browserVersion, osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=filterValidationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void AddFilterVerificationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Add Filter Verification Test",machineName,method.getName());
			addFilterVerificationTest=new AddFilterVerificationTest(obj);
			for(int i=0;i<addFilterVerificationTest.iterationCount.size();i++){
				obj.testStepPassed("Dataset Count : "+addFilterVerificationTest.iterationCount.size());
				addFilterVerificationTest.dataRowNo=Integer.parseInt(addFilterVerificationTest.iterationCount.get(i).toString());
				addFilterVerificationTest.testStepInfo("DataSet: "+(i+1));
				addFilterVerificationTest.addFilterVerificationTestScenario(machineName, host, port, browser, os, browserVersion, osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=addFilterVerificationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	
	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ROPISValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("ROPIS Validation Test",machineName,method.getName());

			ropisValidationTest=new ROPISValidationTest(obj);
			for(int i=0;i<ropisValidationTest.iterationCount.size();i++)
			{

				ropisValidationTest.dataRowNo=Integer.parseInt(ropisValidationTest.iterationCount.get(i).toString());
				ropisValidationTest.testStepInfo("DataSet: "+(i+1));
				ropisValidationTest.ropisValidationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=ropisValidationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ROPISFilterValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("ROPIS Filter Validation Test",machineName,method.getName());

			rOPISFilterValidationTest=new ROPISFilterValidationTest(obj);
			for(int i=0;i<rOPISFilterValidationTest.iterationCount.size();i++)
			{

				rOPISFilterValidationTest.dataRowNo=Integer.parseInt(rOPISFilterValidationTest.iterationCount.get(i).toString());
				rOPISFilterValidationTest.testStepInfo("DataSet: "+(i+1));
				rOPISFilterValidationTest.rOPISFilterValidationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=rOPISFilterValidationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void TaxValidationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws IOException 
	{
		try{

			TestStart("Tax validation Test",machineName,method.getName());

			taxValidationTest=new TaxValidationTest(obj);
			
			taxValidationTest.openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);

			
			obj.CopyExcelTemplateTaxValidation();

			for(int i=0;i<taxValidationTest.iterationCount.size();i++)
			{
				taxValidationTest.dataRowNo=Integer.parseInt(taxValidationTest.iterationCount.get(i).toString());
				taxValidationTest.testStepInfo("DataSet: "+(i+1));
				taxValidationTest.taxValidationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=taxValidationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	
	
	/*******************************************************************************************************************************************************************************************************************************************************************/

	
	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void Fenixvalidation(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Fenix validation",machineName,method.getName());

			fenixvalidation=new Fenixvalidation(obj);
			for(int i=0;i<fenixvalidation.iterationCount.size();i++)
			{

				fenixvalidation.dataRowNo=Integer.parseInt(fenixvalidation.iterationCount.get(i).toString());
				fenixvalidation.testStepInfo("DataSet: "+(i+1));
				fenixvalidation.fenixvalidationScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=fenixvalidation.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ROPISReserveUnavailableStoreCertonaProductTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("ROPIS Reserve Unavailable Store Certona Product Test",machineName,method.getName());

			rOPISReserveUnavailableStoreCertonaProductTest=new ROPISReserveUnavailableStoreCertonaProductTest(obj);
			for(int i=0;i<rOPISReserveUnavailableStoreCertonaProductTest.iterationCount.size();i++)
			{

				rOPISReserveUnavailableStoreCertonaProductTest.dataRowNo=Integer.parseInt(rOPISReserveUnavailableStoreCertonaProductTest.iterationCount.get(i).toString());
				rOPISReserveUnavailableStoreCertonaProductTest.testStepInfo("DataSet: "+(i+1));
				rOPISReserveUnavailableStoreCertonaProductTest.rOPISReserveUnavailableStoreCertonaProductTestScenario(machineName,host, port, browser, os, browserVersion,osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=rOPISReserveUnavailableStoreCertonaProductTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ROPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("ROPIS Remove Product From Recommedation Widget In ReserveC onfirmation Popup Test",machineName,method.getName());

			rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest=new ROPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest(obj);
			for(int i=0;i<rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest.iterationCount.size();i++)
			{

				rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest.dataRowNo=Integer.parseInt(rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest.iterationCount.get(i).toString());
				rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest.testStepInfo("DataSet: "+(i+1));
				rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest.rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTestScenario(machineName,host, port, browser, os, browserVersion,osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=rOPISRemoveProductFromRecommedationWidgetInReserveConfirmationPopupTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ROPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("ROPIS Add Product From Recommedation Widget In Reserve Confirmation Popup Test",machineName,method.getName());

			rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest=new ROPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest(obj);
			for(int i=0;i<rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest.iterationCount.size();i++)
			{

				rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest.dataRowNo=Integer.parseInt(rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest.iterationCount.get(i).toString());
				rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest.testStepInfo("DataSet: "+(i+1));
				rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest.rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTestScenario(machineName,host, port, browser, os, browserVersion,osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=rOPISAddProductFromRecommedationWidgetInReserveConfirmationPopupTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ROPISValidationForMultipleReservationTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("ROPIS Validation FOR MULTIPLE RESERVATION Test",machineName,method.getName());

			rOPISValidationForMultipleReservationTest=new ROPISValidationForMultipleReservationTest(obj);
			for(int i=0;i<rOPISValidationForMultipleReservationTest.iterationCount.size();i++)
			{

				rOPISValidationForMultipleReservationTest.dataRowNo=Integer.parseInt(rOPISValidationForMultipleReservationTest.iterationCount.get(i).toString());
				rOPISValidationForMultipleReservationTest.testStepInfo("DataSet: "+(i+1));
				rOPISValidationForMultipleReservationTest.rOPISValidationForMultipleReservationTestScenario(machineName,host, port, browser, os, browserVersion,osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=rOPISValidationForMultipleReservationTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/
	
	
	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ROPISReserveMoreThanTenProductsTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("ROPIS Reserve More than 10 Products Test",machineName,method.getName());

			rOPISReserveMoreThanTenProductsTest=new ROPISReserveMoreThanTenProductsTest(obj);
			for(int i=0;i<rOPISReserveMoreThanTenProductsTest.iterationCount.size();i++)
			{

				rOPISReserveMoreThanTenProductsTest.dataRowNo=Integer.parseInt(rOPISReserveMoreThanTenProductsTest.iterationCount.get(i).toString());
				rOPISReserveMoreThanTenProductsTest.testStepInfo("DataSet: "+(i+1));
				rOPISReserveMoreThanTenProductsTest.rOPISReserveMoreThanTenProductsTestScenario(machineName,host, port, browser, os, browserVersion,osVersion);
			}
		}finally{
			obj.testCaseExecutionStatus=rOPISReserveMoreThanTenProductsTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	
	/*******************************************************************************************************************************************************************************************************************************************************************/

	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ColorswatchTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException{
		try{
			TestStart("color swatch Test",machineName,method.getName());
			colorswatchTest = new ColorswatchTest(obj);
			for(int i=0;i<colorswatchTest.iterationCount.size();i++){
				colorswatchTest.dataRowNo=Integer.parseInt(colorswatchTest.iterationCount.get(i).toString());
				colorswatchTest.testStepInfo("DataSet: "+(i+1));
				colorswatchTest.ColorswatchTestScenario(machineName, host, port, browser, os, browserVersion, osVersion, method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=colorswatchTest.testCaseExecutionStatus;
			TestEnd();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/
	@Test(alwaysRun=true)
	@Parameters({"selenium.machinename","selenium.host", "selenium.port", "selenium.browser", "selenium.os", "selenium.browserVersion", "selenium.osVersion","TestData.SheetNumber"})
	public void ViewscountTest(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion,String sheetNo,Method method) throws MalformedURLException 
	{
		try{
			TestStart("Views count Test",machineName,method.getName());

			viewscountTest=new ViewscountTest(obj);
			for(int i=0;i<viewscountTest.iterationCount.size();i++)
			{

				viewscountTest.dataRowNo=Integer.parseInt(viewscountTest.iterationCount.get(i).toString());
				viewscountTest.testStepInfo("DataSet: "+(i+1));
				viewscountTest.viewscountTestScenario(machineName,host, port, browser, os, browserVersion,osVersion,method.getName());
			}
		}finally{
			obj.testCaseExecutionStatus=viewscountTest.testCaseExecutionStatus;
			TestEnd();
		}
	}
	
	/*******************************************************************************************************************************************************************************************************************************************************************/


	
	public void TestEnd() {
		obj.waitTime(1);
		if (obj.testCaseExecutionStatus) {
			GenericKeywords.testFailed();
		}
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/	

	@BeforeMethod
	public void before()
	{
		obj.testFailure=false;
	}

	/*******************************************************************************************************************************************************************************************************************************************************************/

}

