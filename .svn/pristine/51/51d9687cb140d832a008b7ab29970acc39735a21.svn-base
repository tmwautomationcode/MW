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
import mwPages.MyAccountPage;
import mwPages.FindStorePage;
import mwPages.MyAccountMyStorePage;

public class UserLoginValidationStoreFinderValidationSAPAddressValidationTest extends PopupWindows {

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
	private MyAccountPage myAccountPage;
	private FindStorePage findStorePage;
	private MyAccountMyStorePage myAccountMyStorePage;

	public UserLoginValidationStoreFinderValidationSAPAddressValidationTest(BaseClass obj) {
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
		myAccountPage = new MyAccountPage(obj);
		findStorePage = new FindStorePage(obj);
		myAccountMyStorePage = new MyAccountMyStorePage(obj);
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
		myAccountPage = null;
		findStorePage = null;
		myAccountMyStorePage = null;
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


	

	public void userLoginValidationStoreFinderValidationSAPAddressValidationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
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

			signInToApp(retrieve("UserName"),retrieve("Password"));

			waitTime(3);

			myAccountPage.verifyUserLoggedSuccessfully();

			//homePage.ClickonHomePageLogo();

			clickOnFindStoreLink();

			clickOnEditStoreLink();

			findStorePage.enterSearchStoreTextboxValue(retrieve("Zipcode1"));

			findStorePage.clickOnFindButtonInFindStore();

			if(findStorePage.verifySearchStoreResultsDisplayed())
			{

				if (browser.equalsIgnoreCase("Safari")) 
				{

					findStorePage.selectFirstStoreFromSearchListDisplayed();

				}

				else 
				{
					//findStorePage.scrollUpInFindStorePage();

					findStorePage.selectFirstStoreFromSearchListDisplayed();

					//findStorePage.scrollUpInFindStorePage();
				}


				findStorePage.verfiyMapDisplayedInMakeThisMyStorePage();

				String selectedStoreName=findStorePage.clickOnMakeThisMyStore_New();

				findStorePage.clickOnMakeThisMyStoreMessageCloseLink();


				//homePage.ClickonHomePageLogo();

				if (browser.equalsIgnoreCase("InternetExplorer")) {

					homePage.ClickonIEAccountHeaderlinkgreetinglink();

				}

				else if (browser.equalsIgnoreCase("Safari")) {

					homePage.ClickonSafariHeaderlinkgreetinglink();

					waitTime(2);
				}

				else {

					homePage.ClickonHeaderlinkgreetinglink();

				}

				myAccountPage.clickMyStoreLinkinMyAccountPage();

				if(myAccountMyStorePage.isStoreDetailsDisplayedInMyStorePage())
				{

					if(myAccountMyStorePage.getStoreNameInMyStorePage().equalsIgnoreCase(selectedStoreName)){

						testStepInfo("New store is updated in user profile");

					}
					else{
						testStepFailed("New store is not updated in user profile");						
					}
				}
				else
				{
					testStepFailed("No Store Details are available in Account Info - My Store Page");
				}

				/*myAccountMyStorePage.clickOnChangeStoreButtonInMyStorePage();

				findStorePage.enterSearchStoreTextboxValue(retrieve("Zipcode2"));

				findStorePage.clickOnFindButtonInFindStore();

				if(findStorePage.verifySearchStoreResultsDisplayed())
				{

					findStorePage.selectFirstStoreFromSearchListDisplayed();

					findStorePage.verfiyMapDisplayedInMakeThisMyStorePage();

					selectedStoreName=findStorePage.clickOnMakeThisMyStore_New();

					findStorePage.clickOnMakeThisMyStoreMessageCloseLink();

					//homePage.ClickonHomePageLogo();

					if (browser.equalsIgnoreCase("InternetExplorer")) 
					{

						homePage.ClickonIEAccountHeaderlinkgreetinglink();

					} 

					else if (browser.equalsIgnoreCase("Safari")) 
					{

						homePage.ClickonSafariHeaderlinkgreetinglink();

						waitTime(2);
					}

					else {

						homePage.ClickonHeaderlinkgreetinglink();

					}

					myAccountPage.clickMyStoreLinkinMyAccountPage();

					if(myAccountMyStorePage.isStoreDetailsDisplayedInMyStorePage())
					{

						if(myAccountMyStorePage.getStoreNameInMyStorePage().equalsIgnoreCase(selectedStoreName))
						{

							testStepInfo("New store is updated in user profile");

						}
						else
						{
							testStepFailed("New store is not updated in user profile");						
						}
					}
					else
					{
						testStepFailed("No Store Details are available in Account Info - My Store Page");
					}
				}
			}
			else 
			{
				testStepFailed("Store Search Results are not displayed");
			}*/

			//homePage.ClickonHomePageLogo();

			myAccountPage.clickOnAddressBookLink();

			//myAccountPage.clickOnAddressBook_EditAddress_Link();

			myAccountPage.clickOnAddressBook_EditDefaultAddress_Link();

			myAccountPage.clear_AddressBook_EditAddress_details();

			myAccountPage.fill_AddressBook_ShippingAddressDetails(retrieve("ShipAddr_Edit_Firstname"), retrieve("ShipAddr_Edit_Lastname"), retrieve("ShipAddr_Edit_Address"), retrieve("ShipAddr_Edit_City"), retrieve("ShipAddr_Edit_State"), retrieve("ShipAddr_Edit_Zip"), retrieve("ShipAddr_Edit_Telephone"));

			myAccountPage.clickOnAddressBook_UpdateAddress_Button();

			myAccountPage.SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue();

			myAccountPage.verify_AddressBook_EditAddress_Saved_MessageandClose();

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