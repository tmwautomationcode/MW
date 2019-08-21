package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.DepartmentNavigation;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.SocialNetwork;
import mwPages.HomePage;

public class SocialLinksTest extends PopupWindows{

	private BaseClass obj;
	private SocialNetwork socialnetwork;
	private DepartmentNavigation departmentnavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private HomePage homePage;

	private String parentWindow = null;

	public SocialLinksTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		departmentnavigation = new	DepartmentNavigation(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		socialnetwork = new	SocialNetwork(obj);
		homePage= new HomePage(obj);
	}

	public void destroyObjects(){
		departmentnavigation = null;
		productDescriptionPage = null;
		productGridPage = null;
		socialnetwork = null;
		homePage= null;
	}

	public void socialLinksTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){	
		try{
			
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);	


			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) 
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

			//clickOnBackToTopLinkInFooter();
			
			homePage.ClickonHomePageLogo();

			

			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}


			parentWindow = driver.getWindowHandle();


			departmentnavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
			
			//departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

			productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

			productGridPage.selectProductInProductGridPage_New(retrieve("ProductName"));

			productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();


			if (browser.equalsIgnoreCase("Safari")) {

				productDescriptionPage.scrollToSocialLinksinPDPSafari();

			}
			else 
			{

				productDescriptionPage.scrollToSocialLinksinPDP();

			}


			productDescriptionPage.clickPinterestSocialLinkinPDP();

			productDescriptionPage.verifyPinterestPage();

			switchToWindowUsingWindowHandle(parentWindow);

			if (browser.equalsIgnoreCase("Safari")) {

				productDescriptionPage.scrollToSocialLinksinPDPSafari();

			}
			else 
			{

				productDescriptionPage.scrollToSocialLinksinPDP();

			}

			productDescriptionPage.clickFacebookSocialLinkinPDP();

			productDescriptionPage.verifyFacebookPage();

			switchToWindowUsingWindowHandle(parentWindow);

			if (browser.equalsIgnoreCase("Safari")) {

				productDescriptionPage.scrollToSocialLinksinPDPSafari();

			}
			else 
			{

				productDescriptionPage.scrollToSocialLinksinPDP();

			}

			productDescriptionPage.clickTwitterSocialLinkinPDP();

			productDescriptionPage.verifyTwitterPage();

			switchToWindowUsingWindowHandle(parentWindow);

			if (browser.equalsIgnoreCase("Safari")) {

				productDescriptionPage.scrollToSocialLinksinPDPSafari();

			}
			else 
			{

				productDescriptionPage.scrollToSocialLinksinPDP();

			}

			productDescriptionPage.clickGooglePlusSocialLinkinPDP();

			productDescriptionPage.verifyGooglePlusPage();

			switchToWindowUsingWindowHandle(parentWindow);

			if (browser.equalsIgnoreCase("Safari")) {

				productDescriptionPage.scrollToSocialLinksinPDPSafari();

			}
			else 
			{

				productDescriptionPage.scrollToSocialLinksinPDP();

			}

			productDescriptionPage.clickEmailSocialLinkinPDP();


			if (productDescriptionPage.verifyEmailShareModalPopupisdisplayed()) {

				productDescriptionPage.clickGmailinEmailSocialLinkinPDP();

				productDescriptionPage.verifyGmailPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.clickYahooinEmailSocialLinkinPDP();

				productDescriptionPage.verifyYahooPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.clickAOLinEmailSocialLinkinPDP();

				productDescriptionPage.verifyAOLPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.clickHotmailinEmailSocialLinkinPDP();

				productDescriptionPage.verifyHotmailPage();

				switchToWindowUsingWindowHandle(parentWindow);

			}

			productDescriptionPage.clickEmailSharemodalCloseLinkinPDP();


			homePage.ClickonHomePageLogo();




















			/*waitForLoadingAndDissappearMWLoadingImg_New();
			//7.The PDP page of the product should be displayed.
			//8.Look for the Social links displayed under the "ADD to Cart" button.
			//9.Verify each and every social link.
			if(productDescriptionPage.isProductDescriptionPageDisplayed()){

				testStepPassed("Product Description Page is Displayed");

				productDescriptionPage.scrollUpInProductDescriptionPage();

				productDescriptionPage.clickOnPinterestInPDP_New();

				socialnetwork.verifyPinterestPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.scrollUpInProductDescriptionPage();

				productDescriptionPage.clickOnFacebookInPDP_New();

				socialnetwork.verifyFacebookPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.scrollUpInProductDescriptionPage();

				productDescriptionPage.clickOnTwitterInPDP_New();

				socialnetwork.verifyTwitterPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.scrollUpInProductDescriptionPage();

				productDescriptionPage.clickOnGooglePlusInPDP_New();

				socialnetwork.verifyGooglePlusPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.scrollUpInProductDescriptionPage();

				productDescriptionPage.clickOnGmailInPDP_New();

				socialnetwork.verifyGmailPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.scrollUpInProductDescriptionPage();

				productDescriptionPage.clickOnYahooInPDP_New();

				socialnetwork.verifyYahooPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.scrollUpInProductDescriptionPage();

				productDescriptionPage.clickOnAOLInPDP_New();

				socialnetwork.verifyAOLPage();

				switchToWindowUsingWindowHandle(parentWindow);

				productDescriptionPage.scrollUpInProductDescriptionPage();

				productDescriptionPage.clickOnHotmailInPDP_New();

				socialnetwork.verifyHotmailPage();

				switchToWindowUsingWindowHandle(parentWindow);	

				productDescriptionPage.scrollUpInProductDescriptionPage();

			}
			else
			{
				testStepFailed("Product Description Page is not Displayed, so terminating the flow");
			}*/

		}catch(Exception e){
			testStepFailed("Failure Description: "+e);
		}finally{
			if(departmentnavigation.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					socialnetwork.testCaseExecutionStatus ){
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