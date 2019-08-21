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
import mwPages.CreateAccountPage;
import mwPages.MyAccountPage;
import mwPages.TuxedoPage;

public class UserWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest extends PopupWindows {

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
	private CreateAccountPage createAccountPage;
	private MyAccountPage myAccountPage;
	private TuxedoPage tuxedoPage;

	public UserWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTest(BaseClass obj) {
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
		createAccountPage = new CreateAccountPage(obj);
		myAccountPage = new MyAccountPage(obj);
		tuxedoPage = new TuxedoPage(obj);
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
		createAccountPage = null;
		myAccountPage = null;
		tuxedoPage = null;
	}

	String dynamicUsername=null;
	String username=null;
	
	String JSESSIONIDFromApplication;
	String JSESSIONIDAfterNewValue;
	String JSESSIONIDAfterAddingProduct;
	String CLONEIDFromApplication;
	String CLONEIDAfterAddingProduct;
	String CLONEIDAfterNewValue;
	String JSESSIONIDAfterPageRefresh;
	String CLONEIDAfterPageRefresh;

	public void userWithPFCreationAddingRentalProductVerifyOrderHistoryValidationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{	
			//1.Verify add to cart of Each product ( suits,ties,accessory,pant,shoes,physical gift card and egift card) works correctly
			//openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);


			JSESSIONIDFromApplication = getJSESSIONIDOnceBrowserInitiated();
			
			CLONEIDFromApplication = getCLONEIDOnceBrowserInitiated();

			setJSESSIONID();

			//pageRefresh();

			JSESSIONIDAfterNewValue = getJSESSIONIDAfterNewValueChanged();
			
			CLONEIDAfterNewValue = getCLONEIDAfterNewValueChanged();
			
			
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

			
			clickOnSignIn();
			
			waitTime(1);
			
			popupWindows.clickOnCreateAccount();
			
			waitTime(2);

			username=retrieve("EmailId");
			
			dynamicUsername=username.split("@")[0]+"-"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			
			createAccountPage.fillSignUpForm(retrieve("FirstName"), retrieve("LastName"), dynamicUsername, retrieve("Password"), retrieve("PasswordAgain"));
			
			waitTime(2);

			createAccountPage.clickOnPerfectFitRewardRadioButtonFromCreateAccountPage();
			
			waitTime(1);
			
			clickOnBackToTopLinkInFooter();
			
			if (browser.equalsIgnoreCase("Firefox")) {

				homePage.mouseoverApplicationLogo();

			}
			
			clickOnBackToTopLinkInFooter();
			
			createAccountPage.fillPerfectFitDetailsFromCreateAccountPage(retrieve("Address"),retrieve("City"),retrieve("State"),retrieve("Zipcode"),retrieve("Telephone"),retrieve("BirthMonth"),retrieve("BirthDate"),retrieve("BirthYear"));
			
			waitTime(1);
			
			clickOnBackToTopLinkInFooter();
			
			createAccountPage.clickOnCreateAccountButtonInRegistrationPage();
			
			waitTime(2);
			
			myAccountPage.verifyUserCreatedSuccessfully();
			
			myAccountPage.clickPerfectFitRewardsLinkinMyAccountPage();
			
			myAccountPage.verifyPFIDisdisplayedandgetPFID();

			if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) 
			{
				
				homePage.ClickonSignoutinHeaderlinkgreetinglink();
				
			} 
			
			else if (browser.equalsIgnoreCase("Safari")) 
			{
				
				homePage.ClickonSafariSignOutlink();
			}
			
			else 
			{
				
				homePage.ClickonIESignoutinHeaderlinkgreetinglink();
			}

			homePage.verifyUserLoggedOutSuccessfully();

			homePage.clickTuxedoRentalDepartmentLink();
			
			tuxedoPage.clickOnSiginInLink();
			
			tuxedoPage.fillSignInDetailsandSignIn(retrieve("EmailAddress"), retrieve("Password"));
			
			tuxedoPage.clickEventslinkinUserGreetingLink();
			
			tuxedoPage.verifyEventsPageisdisplayed();
			
			tuxedoPage.clickOnEventItem();
			
			/*tuxedoPage.clickOnGroupListPageEventprogressBar();
			
			tuxedoPage.clickOnReservationPageAssignAnotherLook();
			
			PageRefresh();
			
			tuxedoPage.clickOnReservationPageAssignAnotherLook();
			
			tuxedoPage.clickOnAssignLookPopupPreStyledLooks();

			tuxedoPage.clickOnPreStyledLooksPageFirstLook();
			
			tuxedoPage.clickOnLookPageAssignThisLook();
			
			tuxedoPage.clickOnGroupListPageEventprogressBar();
			
			tuxedoPage.clickOnEditYourSizesLink();
			
			tuxedoPage.clickOnMeasurementsPageGetStartedButton();
			
			tuxedoPage.FillFitQuizPageDetailsandContinue(retrieve("Age"), retrieve("Height"), retrieve("Weight"), retrieve("JeanWaist"), retrieve("JeanLength"), retrieve("ShoeSize"));
			
			tuxedoPage.clickOnMeasurementsPageSubmitMeasurementsButton();*/
			
			tuxedoPage.clickOnGroupListPageProceedToCheckoutButton();
			
			tuxedoPage.checkRevealModalisDisplayedChecktheItemandClickContinue();
			
			String ProductCount = shoppingcartPage.getProductCountinShoppingCartPage("ProductCount");

			if (ProductCount.equalsIgnoreCase("1 item(s)")) 
			{	
				testStepInfo("Rental Product is added to the cart");
			}

			else 
			{
				testStepFailed("Product is not added to the cart");
			}
			
			shoppingcartPage.removeAllItemsfromShoppingCart2();
			
			URLNavigateBack();
			
			tuxedoPage.clickOnSignOutlinkinUserGreetingLink();
			
			tuxedoPage.clickOnHeaderGotoMensWearHouseLink();			
	}
		catch(Exception e){
		e.printStackTrace();
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
		//destroyObjects();
		//driver.quit();
	}
	testStepInfo("");
	testStepInfo("*******************************");
	testStepInfo("Test Execution Completed");
	testStepInfo("*******************************");
}


}