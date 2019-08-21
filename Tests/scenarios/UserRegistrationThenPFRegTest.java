package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CreateAccountPage;
import mwPages.MyAccountPerfectRewardsPage;
import mwPages.HomePage;
import mwPages.MyAccountPage;

public class UserRegistrationThenPFRegTest extends PopupWindows{	

	private BaseClass obj;

	private CreateAccountPage createAccountPage;
	private MyAccountPerfectRewardsPage myAccountPerfectRewardsPage;
	private PopupWindows popupwindows;
	private HomePage homePage;
	private MyAccountPage myaccountpage;

	private String username=null, dynamicUsername=null;


	public UserRegistrationThenPFRegTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		createAccountPage = new	CreateAccountPage(obj);
		myAccountPerfectRewardsPage = new	MyAccountPerfectRewardsPage(obj);
		homePage= new HomePage(obj);
		myaccountpage= new MyAccountPage(obj);
		popupwindows=new PopupWindows(obj);
	}


	public void destroybjects(){
		createAccountPage = null;
		myAccountPerfectRewardsPage = null;
		homePage= null;
		myaccountpage= null;
		popupwindows=null;
	}

	public void userRegistrationThenPFRegTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{			

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*
			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
				
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

			

			clickOnSignIn();
			
			waitTime(1);
			popupwindows.clickOnCreateAccount();
			
			username=retrieve("EmailId");
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			createAccountPage.fillSignUpForm(retrieve("FirstName"), retrieve("LastName"), dynamicUsername, retrieve("Password"), retrieve("PasswordAgain"));
			waitTime(3);

			createAccountPage.clickOnCreateAccountButtonInRegistrationPage();

			myaccountpage.verifyAccountDashBoardPageisDisplayed();

			myaccountpage.clickPerfectFitRewardsLink();

			myaccountpage.verifyPerfectFitRewardsTabinAccountDashboardisdisplayed();

			myaccountpage.clickYesOptionforPerfectFitRewardsinPerfectFitRewardsTab();
			
			clickOnBackToTopLinkInFooter();

			myaccountpage.fillPerfextFitRewardsFieldsinAccountPage(retrieve("PFFirstName"), retrieve("PFLastName"), retrieve("PFAddress"), retrieve("PFCity"), retrieve("PFState"), retrieve("PFZipcode"), retrieve("PFTelephone"));
			
			//clickOnBackToTopLinkInFooter();

			myaccountpage.clickPerfextFitRewardsTabSubmitButton();
			
			clickOnBackToTopLinkInFooter();

			myaccountpage.verifyPFIDisdisplayedandgetPFID();


			if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
				homePage.ClickonSignoutinHeaderlinkgreetinglink();
			} 
			
			else if (browser.equalsIgnoreCase("Safari")) {
				homePage.ClickonSafariSignOutlink();
			}
			
			else {
				homePage.ClickonIESignoutinHeaderlinkgreetinglink();
			}


			homePage.verifyUserLoggedOutSuccessfully();



		}catch(Exception e){
			testStepFailed(e.toString());
		}finally{
			if(	createAccountPage.testCaseExecutionStatus ||
					myAccountPerfectRewardsPage.testCaseExecutionStatus ){
				this.testCaseExecutionStatus=true;
			}
			driver.quit();
			destroybjects();
		}
		testStepInfo("");
		testStepInfo("*******************************");
		testStepInfo("Test Execution Completed");
		testStepInfo("*******************************");
	}
}