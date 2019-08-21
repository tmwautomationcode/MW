package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.FindStorePage;
import mwPages.MyAccountMySizePage;
import mwPages.MyAccountMyStorePage;
import mwPages.MyAccountPage;
import mwPages.HomePage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.DepartmentNavigation;
import mwPages.ShoppingCartPage;
import mwPages.DepartmentNavigation;
import mwPages.CheckOutPage;
import mwPages.OrderConfirmationPage;


public class  Fenixvalidation extends PopupWindows{
	private BaseClass obj;

	private FindStorePage findStorePage;
	private MyAccountMySizePage myAccountMySizePage;
	private MyAccountPage myAccountPage;
	private MyAccountMyStorePage myAccountMyStorePage;
	private HomePage homePage;
	private DepartmentNavigation departmentnavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ShoppingCartPage shoppingcartPage;
	private ProductGridPage productGridPage;
	private CheckOutPage checkoutPage;
	private OrderConfirmationPage orderConfirmationPage;
	
	//private String store1 = null, store2 = null;

	public  Fenixvalidation(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		findStorePage = new	FindStorePage(obj);
		myAccountMySizePage = new	MyAccountMySizePage(obj);
		myAccountPage=new MyAccountPage(obj);
		myAccountMyStorePage = new MyAccountMyStorePage(obj);
		homePage= new HomePage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		departmentnavigation = new	DepartmentNavigation(obj);
		checkoutPage = new	CheckOutPage(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
	}


	public void destroyObjects(){
		findStorePage = null;
		myAccountMySizePage = null;
		myAccountPage= null;
		myAccountMyStorePage = null;
		homePage= null;
		departmentnavigation = null;
		productGridPage = null;
		productDescriptionPage = null;
		shoppingcartPage = null;
		checkoutPage = null;
		orderConfirmationPage = null;
	}

	String PDPzippcode;
	String PDPEstimateddate;
	String username;
    String dynamicUsername;
    String shoppingbagzippcode; 
    String shoppingbagEstimateddate;
    String checkoutpagezippcode;
    String checkoutpageEstimateddate;
    
    
	private String selectedStoreName;
	
	
	
	
	public void fenixvalidationScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try
		{
			
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


			//signInToApp(retrieve("UserName"),retrieve("Password"));

			homePage.ClickonHomePageLogo();
			
			clickOnFindStoreLink();
			
			//clickOnEditStoreLink();
			
			findStorePage.enterSearchStoreTextboxValue(retrieve("Zipcode"));
			
			findStorePage.clickOnFindButtonInFindStore();

			if(findStorePage.verifySearchStoreResultsDisplayed()){
				
				if (browser.equalsIgnoreCase("Safari")) {
					
					findStorePage.selectFirstStoreFromSearchListDisplayed();
					
				}
				
				else 
				{
					//findStorePage.scrollUpInFindStorePage();
					
					findStorePage.selectFirstStoreFromSearchListDisplayed();
					
					//findStorePage.scrollUpInFindStorePage();
				}
				
				
				findStorePage.verfiyMapDisplayedInMakeThisMyStorePage();
				
				selectedStoreName=findStorePage.clickOnMakeThisMyStore_New();

				findStorePage.clickOnMakeThisMyStoreMessageCloseLink();
				
				
				homePage.ClickonHomePageLogo();
				
				departmentnavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				waitTime(3);
				
				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();
				
				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
				
				
				productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));
				
				productDescriptionPage.verifySizechartpopupPDP();
				
				//PDPzippcode =productDescriptionPage.verifyshipppingzipcodeinPDP();
				
				//testStepPassed("zipcode in PDP: "+PDPzippcode);
                 
				//PDPEstimateddate =productDescriptionPage.verifyEstimateddeliverydateinPDP();
				
				//testStepPassed("delivery date in PDP: "+PDPEstimateddate);
				
				
				productDescriptionPage.clickPDPAddtoShoppingBagButton();	

				if (browser.equalsIgnoreCase("InternetExplorer")) {

					homePage.clickProceedtoCheckoutMiniBaginIE();

				}
				else {

					viewshoppingbag();
					//clickonChromeFirefoxCheckout();
				}
				
				//shoppingcartPage.VerifyOrderTotalinShoppingBagPage();
				
                shoppingbagzippcode =shoppingcartPage.verifyshipppingzipcodeinshoppingcartpage(retrieve("Zipcode1"));
				
				testStepPassed("zipcode in shopping bag: "+shoppingbagzippcode);
                 
				shoppingbagEstimateddate =shoppingcartPage.verifyEstimateddeliverydateinshoppingcartpage(retrieve("Estimateddate"));
				
				testStepPassed("Delivery in shopping bag: "+shoppingbagEstimateddate);
			
				/*if(PDPzippcode.equalsIgnoreCase(shoppingbagzippcode))
				{
					
					testStepPassed("Zipcode in PDP and shoppingbag page are same");
					
				}
				else
				{
					testStepFailed("Zipcode in PDP and shoppingbag page are notsame");
				}	
				
				
				if(PDPEstimateddate.equalsIgnoreCase(shoppingbagEstimateddate))
				{
					
					testStepPassed("Estimated date  in PDP and shoppingbag page are same");
					
				}
				else
				{
					testStepFailed("Estimated date  in PDP and shoppingbag page are not same");
				}	*/
				
				

				shoppingcartPage.clickCheckoutasGuestToggle();



				username=retrieve("GuestEmail");
				dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
				System.out.println("The random email: "+dynamicUsername);

				shoppingcartPage.fillEmailCheckoutasGuest(dynamicUsername);
				
				checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

				checkoutPage.clickShippingContinue();
				
				checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));
				
				checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));
				
				checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));
				
				checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));
				
				checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));
				
				checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));
				

	            checkoutPage.fillpaymentpageemailaddress(retrieve("GuestEmail"));
	            
				checkoutPage.clickPaymentContinue();
				
				    checkoutpagezippcode =checkoutPage.verifyshipppingzipcodeinshoppingincheckoutpage(retrieve("Zipcode1"));
					
					testStepPassed("zipcode in checkoutpage: "+checkoutpagezippcode);
	                 
					checkoutpageEstimateddate =checkoutPage.verifyEstimateddeliverydateincheckoutpage(retrieve("Estimateddate"));
					
					testStepPassed("delivery in checkoutPage: "+checkoutpageEstimateddate);
					
					if(shoppingbagzippcode.equalsIgnoreCase(checkoutpagezippcode))
					{
						
						testStepPassed("Zipcode in shopping bag and checkout page are same");
						
					}
					else
					{
						testStepFailed("Zipcode in shopping and checkout page are notsame");
					}	
					
					
					if(shoppingbagEstimateddate.equalsIgnoreCase(checkoutpageEstimateddate))
					{
						
						testStepPassed("Delivery date  in shopping and checkout page are same");
						
					}
					else
					{
						testStepFailed("Estimated date  in shopping and checkout page are not same");
					}	
					
				
				
				/*checkoutPage.EnterCvvinReviewTab(retrieve("CreditCardCvv"));
				
				checkoutPage.EnterSavedCvvinReviewTab(retrieve("CreditCardCvv"));
				
				checkoutPage.EnterSavedCvvinReviewTabSafari();*/
				
				if(checkoutPage.clickPlaceOrderButton())
				{
					
					orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();
					
					orderConfirmationPage.getOrderNumber();
					
					homePage.ClickonCheckOutHomePageLogo();
					
				}
				else{
					homePage.ClickonHomePageLogo();
									
					if (browser.equalsIgnoreCase("InternetExplorer")) {

						shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

					}
					
					
					else if (browser.equalsIgnoreCase("Safari")) {
						shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
					}
					
					else {

						shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

					}
					
					 clickOnMensWearhouseLogo();
				
			}
			}
		}
		catch(Exception e){
			
			testStepFailed("Exception occured:"+e);
			
		}
		finally{
			if(findStorePage.testCaseExecutionStatus ||
					myAccountPage.testCaseExecutionStatus ||
					myAccountMyStorePage.testCaseExecutionStatus ||
					myAccountMySizePage.testCaseExecutionStatus){
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