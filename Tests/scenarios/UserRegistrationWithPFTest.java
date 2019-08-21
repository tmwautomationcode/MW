package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CreateAccountPage;
import mwPages.MyAccountPage;
import mwPages.HomePage;
import mwPages.MyAccountPerfectRewardsPage;

public class UserRegistrationWithPFTest extends PopupWindows{

	private BaseClass obj;

	private MyAccountPerfectRewardsPage myAccountPerfectRewardsPage;
	private CreateAccountPage createAccountPage;
	private MyAccountPage myAccountPage;
	private HomePage homePage;
	private PopupWindows popupwindows;

	private String dynamicUsername=null,username=null;
	
	public UserRegistrationWithPFTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}
	
	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		createAccountPage = new	CreateAccountPage(obj);
		myAccountPerfectRewardsPage = new	MyAccountPerfectRewardsPage(obj);
		myAccountPage=new MyAccountPage(obj);
		popupwindows=new PopupWindows(obj);
		homePage= new HomePage(obj);
	}
	
	public void destroyObjects(){
		createAccountPage = null;
		myAccountPerfectRewardsPage =null;
		myAccountPage=null;
		popupwindows=null;
		homePage= null;
	}
	
	public void UserRegistrationWithPFTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
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

			//clickOnBackToTopLinkInFooter();
			
			homePage.ClickonHomePageLogo();
			
			

			if (browser.equalsIgnoreCase("Firefox")) 
			{
				homePage.verifyBrowserOutdatedMessageisDisplayedAndClosed();
			}


			
			//3.Click on Signin link in the Header link
			testStepInfo("");
			testStepInfo("Clicking the Sign In Link in the Header Link & Click the Create Account button");
			testStepInfo("*******************************************************************************************");
			
			waitTime(3);
			clickOnSignIn();
			waitTime(1);
			popupwindows.clickOnCreateAccount();
			waitTime(2);
			
			
			//4.Entering the values in the create account page
			testStepInfo("");
			testStepInfo("Verifying the Create Account page is opened & Entering the values");
			testStepInfo("*******************************************************************************");
			username=retrieve("EmailId");
			dynamicUsername=username.split("@")[0]+"-"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			createAccountPage.fillSignUpForm(retrieve("FirstName"), retrieve("LastName"), dynamicUsername, retrieve("Password"), retrieve("PasswordAgain"));
			waitTime(2);
			
			
			
			//5.Clicking the Sign with PF rewards radio button and entering the values
			testStepInfo("");
			testStepInfo("Clicking the Sign with PF rewards radiobutton and entering the values finally the Create Account button is clicked");
			testStepInfo("***********************************************************************************************************************************");
			createAccountPage.clickOnPerfectFitRewardRadioButtonFromCreateAccountPage();
			waitTime(1);
			//clickOnBackToTopLinkInFooter();
			
			if (browser.equalsIgnoreCase("Firefox")) {

				homePage.mouseoverApplicationLogo();

			}
			
			//clickOnBackToTopLinkInFooter();
			createAccountPage.fillPerfectFitDetailsFromCreateAccountPage(retrieve("Address"),retrieve("City"),retrieve("State"),retrieve("Zipcode"),retrieve("Telephone"),retrieve("BirthMonth"),retrieve("BirthDate"),retrieve("BirthYear"));
			waitTime(1);
			//clickOnBackToTopLinkInFooter();
			createAccountPage.clickOnCreateAccountButtonInRegistrationPage();
			//clickOnBackToTopLinkInFooter();
			waitTime(10);
			//waitTime(12);
			
			myAccountPage.verifyAccountDashBoardPageisDisplayed();
			
			//6.Verifying whether the User is registered with the PF rewards
			testStepInfo("");
			testStepInfo("Verifying whether the User is registered with the PF rewards");
			testStepInfo("***********************************************************************");
			myAccountPage.clickPerfectFitRewardsLinkinMyAccountPage();
			
			myAccountPage.verifyPFIDisdisplayedandgetPFID();
			 
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
			
			
		}
		catch(Exception e){
			testStepFailed("Exception Occured:"+e);
		}finally{
			if(createAccountPage.testCaseExecutionStatus ||
					myAccountPerfectRewardsPage.testCaseExecutionStatus ||
					popupwindows.testCaseExecutionStatus ||
					myAccountPage.testCaseExecutionStatus ){
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