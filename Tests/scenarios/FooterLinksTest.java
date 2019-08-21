package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.AboutMensWearhousePage;
import mwPages.CATransparencyInSupplyChainsActPage;
import mwPages.ContactUsPage;
import mwPages.CorporateWearPage;
import mwPages.GiftCardsPage;
import mwPages.HelpFAQsPage;
import mwPages.InternationalOrdersPage;
import mwPages.InvestorRelationsPage;
import mwPages.JoinOurTeamPage;
import mwPages.MensWearhouseHomePage;
import mwPages.MobileTermsPage;
import mwPages.PerfectFitCreditCardPage;
import mwPages.PerfectFitCreditCardPaymentsPage;
import mwPages.PerfectFitRewardsPage;
import mwPages.PrivacySecurityPolicyPage;
import mwPages.RecommendationsForYouPage;
import mwPages.SiteMapPage;
import mwPages.SocialNetwork;
import mwPages.StoreLocatorPage;
import mwPages.TermsofUsePage;
import mwPages.HomePage;
import mwPages.OnlineReturnsPage;


public class FooterLinksTest extends PopupWindows{

	private BaseClass obj;

	private PopupWindows popupWindows;	
	private MensWearhouseHomePage menswearhouseHomePage;
	private GiftCardsPage giftcardPage;
	private PerfectFitRewardsPage perfectfitRewardsPage;
	private RecommendationsForYouPage recommendationsForYouPage;
	private CorporateWearPage corporateWearPage;
	private StoreLocatorPage storeLocatorPage;
	private ContactUsPage contactUsPage;
	private HelpFAQsPage helpFAQsPage;
	private MobileTermsPage mobileTermsPage;
	private PerfectFitCreditCardPaymentsPage perfectfitCreditCardPaymentsPage;
	private CATransparencyInSupplyChainsActPage caTransparencyInSupplyChainsActPage;
	private SiteMapPage siteMapPage;
	private InternationalOrdersPage internationalOrdersPage;
	private InvestorRelationsPage investorRelationsPage;
	private JoinOurTeamPage joinOurTeamPage;
	private SocialNetwork socialNetwork;
	private PrivacySecurityPolicyPage privacySecurityPolicyPage;
	private TermsofUsePage termsOfUsePage;
	private PerfectFitCreditCardPage perfectfitCreditCardPage;
	private AboutMensWearhousePage aboutMensWearhousePage;
	private HomePage homePage;
	private OnlineReturnsPage onlineReturnsPage;
	

	public FooterLinksTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		caTransparencyInSupplyChainsActPage = new	CATransparencyInSupplyChainsActPage(obj);
		contactUsPage = new	ContactUsPage(obj);
		corporateWearPage = new	CorporateWearPage(obj);
		giftcardPage = new	GiftCardsPage(obj);
		helpFAQsPage = new	HelpFAQsPage(obj);
		internationalOrdersPage = new	InternationalOrdersPage(obj);
		investorRelationsPage = new	InvestorRelationsPage(obj);
		joinOurTeamPage = new	JoinOurTeamPage(obj);
		menswearhouseHomePage = new	MensWearhouseHomePage(obj);
		aboutMensWearhousePage=new AboutMensWearhousePage(obj);
		mobileTermsPage = new	MobileTermsPage(obj);
		perfectfitCreditCardPage = new	PerfectFitCreditCardPage(obj);
		perfectfitCreditCardPaymentsPage = new	PerfectFitCreditCardPaymentsPage(obj);
		perfectfitRewardsPage = new	PerfectFitRewardsPage(obj);
		privacySecurityPolicyPage = new	PrivacySecurityPolicyPage(obj);
		recommendationsForYouPage = new	RecommendationsForYouPage(obj);
		siteMapPage = new	SiteMapPage(obj);
		socialNetwork = new	SocialNetwork(obj);
		storeLocatorPage = new	StoreLocatorPage(obj);
		termsOfUsePage = new	TermsofUsePage(obj);
		popupWindows=new PopupWindows(obj);
		homePage= new HomePage(obj);
		onlineReturnsPage = new OnlineReturnsPage(obj);
		
	}


	public void destroyObjects(){


		caTransparencyInSupplyChainsActPage = null;
		contactUsPage = null;
		corporateWearPage = null;
		giftcardPage = null;
		helpFAQsPage = null;
		internationalOrdersPage = null;
		investorRelationsPage = null;
		joinOurTeamPage = null;
		menswearhouseHomePage = null;
		aboutMensWearhousePage=null;
		mobileTermsPage = null;
		perfectfitCreditCardPage = null;
		perfectfitCreditCardPaymentsPage = null;
		perfectfitRewardsPage = null;
		privacySecurityPolicyPage = null;
		recommendationsForYouPage = null;
		siteMapPage =  null;
		socialNetwork = null;
		storeLocatorPage = null;
		termsOfUsePage = null;
		popupWindows=null;
		homePage= null;
		onlineReturnsPage = null;
	}

	private String parentWindow;
	String currentWindow;

	public void footerLinkshomepageTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){

		try{
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			
			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
				
				getJSESSIONIDOnceBrowserInitiated();
				
				getCLONEIDOnceBrowserInitiated();
				
			}*/


			
			/*welcomesigninpopup();

			popupwindows.continueShoppingPopupClose();
			 */

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
						
			parentWindow=driver.getWindowHandle();
			currentWindow=driver.getWindowHandle();
			
						
			waitTime(2);	
			
			clickOnTermsandConditionsFooterLinks("Privacy & Security Policy");
			
			waitTime(1);
			
			privacySecurityPolicyPage.VerifyPrivacyPolicyPageisDisplayed();
			
			switchToWindowUsingWindowHandle(parentWindow);
			
			clickOnTermsandConditionsFooterLinks("Terms of Use");
			
			termsOfUsePage.TermsandConditionsOfUsePageisDisplayed();
			
			
			clickOnTermsandConditionsFooterLinks("CA Transparency in Supply Chains Act");
			waitTime(1);
			caTransparencyInSupplyChainsActPage.VerifyCALIFORNIATRANSPARENCYINSUPPLYCHAINSACTPageisDisplayed();
			
			
			
			clickOnFooterLinks("Pre-Styled Looks");
			
			
			aboutMensWearhousePage.verifyPreStyledLooksPage();
			
			waitTime(2);
			
			
			clickOnFooterLinks("About Us");
			
			aboutMensWearhousePage.verifyAboutUsPage();
			
			waitTime(1);
			
			clickOnFooterLinks("Careers");
			
			waitTime(1);
			
			aboutMensWearhousePage.verifyCareersPage();
			
			//waitTime(1);
			
			
			switchToWindowUsingWindowHandle(parentWindow);
			
			
			waitTime(2);
			
			//joinOurTeamPage.verifyJoinOurTeamPage();
			
			//getBackToOriginalWindow();
			
			//clickOnURLNavigateBackButton();
			
			//switchToWindowUsingWindowHandle(parentWindow);
			//clickOnBackButton();
			//waitTime(10);
			clickOnFooterLinks("Investor Relations");
			
			waitTime(2);
			
			investorRelationsPage.verifyInvestorRelationsPage();
			
			//clickOnURLNavigateBackButton();
			
			//getBackToOriginalWindow();
			switchToWindowUsingWindowHandle(parentWindow);
			
			//clickOnBackButton();
			clickOnFooterLinks("Store Locator");
			
			storeLocatorPage.verifyStoreLocatorPage();
			
			waitTime(2);
			
			clickOnFooterLinks("Help");
			

			waitTime(2);
			
			helpFAQsPage.verifyHelpFAQsPage();
			//getBackToOriginalWindow();
			switchToWindowUsingWindowHandle(parentWindow);
			
			clickOnFooterLinks("Shipping");
			
			//helpFAQsPage.verifyHelpFAQsPage();
			//getBackToOriginalWindow();
			switchToWindowUsingWindowHandle(parentWindow);
			
			clickOnFooterLinks("Returns");
			
			aboutMensWearhousePage.verifyreturnspage();
			
			clickOnURLNavigateBackButton();
		
			
			//helpFAQsPage.verifyHelpFAQsPage();
			//getBackToOriginalWindow();
			//switchToWindowUsingWindowHandle(parentWindow);
			
			clickOnFooterLinks("Order Status");
			
			popupWindows.verifyOrderStatusPopUp();
			
			clickOnFooterLinks("Contact Us");
			
			contactUsPage.verifyContactUsPage();
			
			//clickOnFooterLinks("Online Returns");
			
			//waitTime(1);
			
			//onlineReturnsPage.verifyOnlineReturnsPage();
			
			//clickOnURLNavigateBackButton();
			
			clickOnFooterLinks("International Orders");
			
			internationalOrdersPage.verifyInternationalOrdersPage();
			
			waitTime(2);
			
			clickOnFooterLinks("Gift Cards");
			
			giftcardPage.verifyGiftCardspage();
			
			waitTime(2);
			
			clickOnFooterLinks("Perfect Fit Rewards");
			
			waitTime(2);
			
			perfectfitRewardsPage.verifyPerfectFitRewardsPage();
			
			/*waitTime(2);
			
			clickOnFooterLinks("Perfect Fit Pay Online");
			
			perfectfitRewardsPage.verifyPerfectFitPayOnlinePage();*/
			
			waitTime(2);
			
			clickOnFooterLinks("Mobile Terms");
			
			mobileTermsPage.verifyMobileTermsPage();
			
			//switchToWindowUsingWindowHandle(parentWindow);
			switchToWindowUsingWindowHandle(parentWindow);
			
			waitTime(2);
			
			clickOnFooterLinks("Site Map");
			
			siteMapPage.verifySiteMapPage();
			
			waitTime(2);
			
			//clickOnFooterLinks("Lines");
			
			//aboutMensWearhousePage.verifyGuydLinesPage();	
			
			//waitTime(2);
			/*clickOnFooterLinks("Pre-Styled Looks");
			aboutMensWearhousePage.verifyPreStyledLooksPage();*/
			
			clickOnFooterLinks("All Brands");
			
			aboutMensWearhousePage.verifyAllBrandsPage();
			//31.Enter email id and click on 'Submit' button
			menswearhouseHomePage.enterEmailAndSubmit(retrieve("EmailId"));
			
			waitTime(2);
			
			clickOnFooterLinksInSocialLinks("Facebook");
			
			waitTime(2);
			
			socialNetwork.verifyFacebookPage();
			//clickOnBackButton();
			
			switchToWindowUsingWindowHandle(parentWindow);
			//25.Click on 'Twitter' icon and verify that a pop-up is dipslayed
			clickOnFooterLinksInSocialLinks("Twitter");
			
			waitTime(2);
			
			socialNetwork.verifyTwitterPage();
			//clickOnBackButton();
			switchToWindowUsingWindowHandle(parentWindow);
			//26.Click on 'Pinterest' icon and verify that the pinterest page is navigated to
			clickOnFooterLinksInSocialLinks("Pinterest");
			
			socialNetwork.verifyPinterestPage();
			//clickOnBackButton();
			switchToWindowUsingWindowHandle(parentWindow);

			//27.Click on 'Instagram' icon and verify that the instagram page is navigated to
			clickOnFooterLinksInSocialLinks("Instagram");
			
			socialNetwork.verifyInstagramPage();
			//clickOnBackButton();
			switchToWindowUsingWindowHandle(parentWindow);

			//28.Click on  'Youtube' icon and verify that the youtube page is navigated to
			clickOnFooterLinksInSocialLinks("Youtube");
			
			socialNetwork.verifyYoutubePage();
			//clickOnBackButton();
			switchToWindowUsingWindowHandle(parentWindow);
			//clickOnBackButton();
			waitTime(2);
			/*clickOnSignIn();
			
			waitTime(2);
			popupWindows.verifySignInOverLay();
			
			popupWindows.signIn(retrieve("UserName"), retrieve("Password"));
			
			waitTime(3);

			//34.Click on 'Order status' link and verify that it navigates to order history section of dashboard.
			if (browser.equalsIgnoreCase("InternetExplorer")) {
				driver.navigate().to(prefix+".menswearhouse.com/TrackOrderStatus?orderStatusStyle=strong&catalogId=12004&langId=-1&storeId=12751");
				verifyOrederHistoryPage();
			} 
			
			else if (browser.equalsIgnoreCase("Safari")) {
				clickOnSafariOrderHistoryandVrifyOrderHistoryPageisDisplayed();
			}
			else {
				clickOnOrderHistory();
				verifyOrederHistoryPage();
			}
			
			waitTime(3);
			if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
				homePage.ClickonSignoutinHeaderlinkgreetinglink();
			} 
			
			else if (browser.equalsIgnoreCase("Safari")) {
				homePage.ClickonSafariSignOutlink();
			}
			
			else {
				homePage.ClickonIESignoutinHeaderlinkgreetinglink();
			}

			homePage.verifyUserLoggedOutSuccessfully();*/

		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
		finally{
			if(caTransparencyInSupplyChainsActPage.testCaseExecutionStatus ||
					contactUsPage .testCaseExecutionStatus ||
					corporateWearPage.testCaseExecutionStatus ||
					giftcardPage.testCaseExecutionStatus ||
					helpFAQsPage.testCaseExecutionStatus ||
					internationalOrdersPage.testCaseExecutionStatus ||
					investorRelationsPage.testCaseExecutionStatus ||
					joinOurTeamPage.testCaseExecutionStatus ||
					menswearhouseHomePage.testCaseExecutionStatus ||
					mobileTermsPage.testCaseExecutionStatus ||
					perfectfitCreditCardPage.testCaseExecutionStatus ||
					perfectfitCreditCardPaymentsPage.testCaseExecutionStatus ||
					perfectfitRewardsPage.testCaseExecutionStatus ||
					privacySecurityPolicyPage.testCaseExecutionStatus ||
					recommendationsForYouPage.testCaseExecutionStatus ||
					siteMapPage.testCaseExecutionStatus ||
					socialNetwork.testCaseExecutionStatus ||
					storeLocatorPage.testCaseExecutionStatus ||
					termsOfUsePage.testCaseExecutionStatus ||
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
	public void getBackToOriginalWindow(){
		driver.switchTo().window(currentWindow);
	}
}