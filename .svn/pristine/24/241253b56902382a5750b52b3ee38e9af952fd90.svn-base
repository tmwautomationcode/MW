package scenarios;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CreateAccountPage;
import mwPages.MyAccountPerfectRewardsPage;
import mwPages.HomePage;
import mwPages.MyAccountPage;

public class UserRegistrationWithoutPFTest extends PopupWindows{	

	private BaseClass obj;

	private CreateAccountPage createAccountPage;
	private MyAccountPerfectRewardsPage myAccountPerfectRewardsPage;
	private PopupWindows popupwindows;
	private HomePage homePage;
	private MyAccountPage myaccountpage;

	public UserRegistrationWithoutPFTest(BaseClass obj) {
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

	public void userRegistrationWithoutPFTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{			

			testStepInfo("");
			testStepInfo("Opening Browser and Navigating to the URL");
			testStepInfo("*****************************************************");
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			
			if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {
				
				getJSESSIONIDOnceBrowserInitiated();
				
				getCLONEIDOnceBrowserInitiated();
				
			}

			
			if (browser.equalsIgnoreCase("Safari")) 
			{
				verifySafariUSFlagSelected();
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

			


			String EmailID = retrieve("EmailId");

			System.out.println("The following Email Id : "+EmailID);

			clickOnSignIn();

			signIn(retrieve("EmailID"), retrieve("Password"));

			try {
				if (driver.findElement(By.xpath("//div[contains(text(),'Log in failed')]")).isDisplayed()) 
				{

					testStepInfo("The User is not registered or the Password is incorrect");

					testStepPassed("Log in failed. Please Try Again.");

					popupwindows.clickOnCreateAccount();

					createAccountPage.fillSignUpForm(retrieve("FirstName"), retrieve("LastName"), retrieve("EmailID"), retrieve("Password"), retrieve("PasswordAgain"));

					createAccountPage.clickOnCreateAccountButtonInRegistrationPage();
					
					
					
					
					
					try {
						
						if (driver.findElement(By.xpath("//form[contains(@id,'registrationForm')]//div[contains(@id,'ErrorMessageText')]")).isDisplayed()) {

							String EmailIdexistserrormsg = driver.findElement(By.xpath("//form[contains(@id,'registrationForm')]//div[contains(@id,'ErrorMessageText')]")).getText();

							System.out.println("Message : "+EmailIdexistserrormsg);

							testStepInfo("Message : "+EmailIdexistserrormsg);

						}
						
					} catch (Exception e) {
						
						myaccountpage.verifyAccountDashBoardPageisDisplayed();
						
						testStepInfo("The User "+EmailID+" is registered successfully");
						
						homePage.ClickonSignoutinHeaderlinkgreetinglink();
					}
					
					
					
					
					
				
					
					
					
					
					
					//if (driver.findElement(By.xpath("//form[contains(@id,'registrationForm')]//div[contains(@id,'ErrorMessageText')]")).isDisplayed()) {

						//String EmailIdexistserrormsg = driver.findElement(By.xpath("//form[contains(@id,'registrationForm')]//div[contains(@id,'ErrorMessageText')]")).getText();

						//System.out.println("Message : "+EmailIdexistserrormsg);

						//testStepInfo("Message : "+EmailIdexistserrormsg);

					//}
					
					//else {
						
						//myaccountpage.verifyAccountDashBoardPageisDisplayed();
						
						//testStepInfo("The User "+EmailID+" is registered successfully");
						
						//homePage.ClickonSignoutinHeaderlinkgreetinglink();
						
					//}

				}

				
				
				
				
				
				
				
				
				
				
				
				
				/*else{
					
					myaccountpage.verifyAccountDashBoardPageisDisplayed();
					
					testStepPassed("The Account Dashboard Page is displayed");

					testStepInfo("The User "+EmailID+" is Registered already and able to login successfully");

					homePage.ClickonSignoutinHeaderlinkgreetinglink();

				}*/
			} catch (Exception e) {
				
				System.out.println("It came to catch block");
				
				myaccountpage.verifyAccountDashBoardPageisDisplayed();
				
				//testStepPassed("The Account Dashboard Page is displayed");

				testStepInfo("The User "+EmailID+" is already Registered and able to login successfully");

				homePage.ClickonSignoutinHeaderlinkgreetinglink();
			}


			




























			/*verifyUSFlagSelected();
			continueShoppingPopupClose();

			//2.Click on 'Sign in' link on header
			clickOnSignIn();		

			//3.Click on 'Create account' link form the overlay
			clickOnCreateAccount();

			//4.On the registration page enter details to register user without PF
			username = retrieve("EmailId");
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			createAccountPage.fillSignUpForm(retrieve("FirstName"), retrieve("LastName"), dynamicUsername , retrieve("Password"), retrieve("PasswordAgain"));
			createAccountPage.clickOnDontSignupForPfInCreateAccountPage();
			waitTime(5);
			//5.Click on 'Create account ' button  -- User account page should be displayed
			createAccountPage.clickOnCreateAccountButtonInRegistrationPage();
			testStepPassed("Account created for username: "+dynamicUsername);

			//6.Click on 'PF section' of the profile
			clickOnPerfectFitRewardsInHeader();
			waitTime(5);
			//7.Click radio button to register for PF with new details
			myAccountPerfectRewardsPage.clickOnSignUpForPfInPerfectFitRewardsPage();
			waitTime(5);
			//8.Enter all details and submit
			myAccountPerfectRewardsPage.fillPfFormInPerfectFitRewardsPage(retrieve("FirstName"),retrieve("LastName"),retrieve("Address"),retrieve("City"),retrieve("State"),retrieve("ZipCode"),retrieve("Phone"));
			myAccountPerfectRewardsPage.clickOnSaveFormInPerfectFitRewardsPage();

			//9.User should be registered for PF
			pfId = myAccountPerfectRewardsPage.getPerfectFitIDInPerfectFitRewardsPage();
			if( (pfId != "null") || (!pfId.isEmpty())) testStepPassed("User is registered with PF: "+pfId);
			else testStepFailed("User is not registered with PF");*/
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