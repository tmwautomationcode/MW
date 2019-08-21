package scenarios;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.CheckOutPage;
import mwPages.DepartmentNavigation;
import mwPages.HomePage;
import mwPages.OrderConfirmationPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.MyAccountPage;

public class GuestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest extends PopupWindows{

	private BaseClass obj;

	private OrderConfirmationPage orderConfirmationPage;
	private CheckOutPage checkoutPage;
	private ShoppingCartPage shoppingcartPage;
	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private HomePage homePage;
	private MyAccountPage myaccountpage;

	private	String dynamicUsername=null,username=null;

	public GuestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTest(BaseClass obj) {
		super(obj);
		this.obj=obj;
	}

	public void createObjects(String browser){
		obj.driver=driver;
		obj.currentBrowser=browser;

		checkoutPage = new	CheckOutPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		orderConfirmationPage = new	OrderConfirmationPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		homePage= new HomePage(obj);
		myaccountpage= new MyAccountPage(obj);
	}




	public void destroyObjects(){
		checkoutPage = null;
		departmentNavigation = null;
		orderConfirmationPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		homePage= null;
		myaccountpage= null;
	}


	public void GuestUserRegistrationonOrderConfirmationPageWithSavedCardandPFTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId){
		try{
			//1.Open the site
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")) {
				
				getJSESSIONIDOnceBrowserInitiated();
				
				getCLONEIDOnceBrowserInitiated();
				
			}*/



			if (browser.equalsIgnoreCase("Safari")) 
			{
				waitTime(5);
				verifySafariUSFlagSelected();
				homePage.ClickonHomePageLogo();
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

			
			

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

			}
			
			else if (browser.equalsIgnoreCase("Safari")) 
			{
				
				shoppingcartPage.checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping();
			}
			
			else 
			{

				shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

			}

			//homePage.ClickonHomePageLogo();		

			if(getConfigProperty("UseSKU_ID").equalsIgnoreCase("no"))
			{
				
				//departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(retrieve("DepartmentName"),retrieve("SubCategoryName"));
				
				departmentNavigation.selectCategoryFromDepartmentMenu(retrieve("DepartmentName"),retrieve("SubCategoryName"));

				productGridPage.VerifyProductslistedinPGPIfNotRefreshthePage();

				productGridPage.selectProductInProductGridPage(retrieve("ProductName"));
				
				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();
				
			}
			else
			{
				searchProductnew(retrieve("SkuID"));
				//waitTime(5);

				productDescriptionPage.verifyProductDisplayedinPDPPageIfNotRefreshThePage();

				productDescriptionPage.getProductNameInProductDescriptionPage();
			}

			//productDescriptionPage.selectProductSizeinPDPPage(retrieve("Productsize"));

			productDescriptionPage.selectSizeFromProductDescriptionPagenew(retrieve("ProductSize"));

			productDescriptionPage.clickPDPAddtoShoppingBagButton();

			//productDescriptionPage.clickHomePageLogoinPDPPage();

			if (browser.equalsIgnoreCase("InternetExplorer")) 
			{

				homePage.RegisteredUserProceedtoCheckoutinIE();

			}
			else 
			{

				viewshoppingbag();
				//clickonChromeFirefoxCheckout();
				//shoppingcartPage.clickOnCheckoutButtonregistereduser();

			}

			//shoppingcartPage.clickBackToTopButton();
			
			shoppingcartPage.VerifyOrderTotalinShoppingBagPage();

			shoppingcartPage.clickCheckoutasGuestToggle();



			username=retrieve("GuestEmail");
			
			dynamicUsername=username.split("@")[0]+"_"+getCurrentDateAndTimeStamp()+"@"+username.split("@")[1];
			
			System.out.println("The random email: "+dynamicUsername);



			//shoppingcartPage.clickBackToTopButton();

			//shoppingcartPage.fillEmailCheckoutasGuest(dynamicUsername);

			//shoppingcartPage.clickBackToTopButton();

			//shoppingcartPage.clickCheckoutasGuestButton();
			
			checkoutPage.VerifyOrderTotalinCheckoutPageShippingTab();
			
			checkoutPage.VerifyShippingTab();
			
			checkoutPage.fillShippingTabDetails(retrieve("ShippingFirstName"), retrieve("ShippingLastName"), retrieve("ShippingAddress"), retrieve("ShippingCity"), retrieve("ShippingState"), retrieve("ShippingZipcode"), retrieve("ShippingTelephone"));

			checkoutPage.clickShippingContinue();
			
			checkoutPage.VerifyPaymentTab();
			
			checkoutPage.fillPaymentCreditCardNo(retrieve("CreditCardNo"));
			
			checkoutPage.fillPaymentCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.fillPaymentSavedCardCreditCardCvv(retrieve("CreditCardCvv"));

			checkoutPage.selectPaymentCreditCardExpityMonth(retrieve("CreditCardExpiryMonth"));

			checkoutPage.selectPaymentCreditCardExpityYear(retrieve("CreditCardExpiryYear"));

			checkoutPage.fillPaymentBillingDetails(retrieve("BillingFirstName"), retrieve("BillingLastName"), retrieve("BillingAddress"), retrieve("BillingCity"), retrieve("BillingState"), retrieve("BillingZipCode"), retrieve("BillingTelephone"));

			checkoutPage.fillpaymentpageemailaddress(dynamicUsername);
			
			checkoutPage.clickPaymentContinue();
			
			checkoutPage.VerifyReviewTab();
			
			
			
			String ReviewTabShippingAddressFirstName = checkoutPage.getReviewTabShippingAddressFirstName();
			
			//testStepPassed("ReviewTabShippingAddressFirstName : "+ReviewTabShippingAddressFirstName);
			
			String ReviewTabShippingAddressLastName = checkoutPage.getReviewTabShippingAddressLastName();
			
			//testStepPassed("ReviewTabShippingAddressLastName : "+ReviewTabShippingAddressLastName);
			
			String ReviewTabShippingAddressStreet = checkoutPage.getReviewTabShippingAddressStreet();
			
			//testStepPassed("ReviewTabShippingAddressStreet : "+ReviewTabShippingAddressStreet);
			
			String ReviewTabShippingAddressCity = checkoutPage.getReviewTabShippingAddressCity();
			
			//testStepPassed("ReviewTabShippingAddressCity : "+ReviewTabShippingAddressCity);
			
			String ReviewTabShippingAddressState =  checkoutPage.getReviewTabShippingAddressState();
			
			//testStepPassed("ReviewTabShippingAddressState : "+ReviewTabShippingAddressState);
			
			String ReviewTabShippingAddressZip  = checkoutPage.getReviewTabShippingAddressZip();
			
			//testStepPassed("ReviewTabShippingAddressZip : "+ReviewTabShippingAddressZip);
			
			String ReviewTabShippingAddressPhoneNo =  checkoutPage.getReviewTabShippingAddressPhoneNo();
			
			//testStepPassed("ReviewTabShippingAddressPhoneNo : "+ReviewTabShippingAddressPhoneNo);
			
			
			
			
			
			
			String ReviewTabPaymentDetailsCardType = checkoutPage.getReviewTabPaymentDetailsCardType();
			
			//testStepPassed("ReviewTabPaymentDetailsCardType : "+ReviewTabPaymentDetailsCardType);
			
			String ReviewTabPaymentDetailsCardNo = checkoutPage.getReviewTabPaymentDetailsCardNo();
			
			//testStepPassed("ReviewTabPaymentDetailsCardNo : "+ReviewTabPaymentDetailsCardNo);

			String ReviewTabPaymentDetailsCardExpiryDateYear = checkoutPage.getReviewTabPaymentDetailsCardExpiryDateYear();
			
			//testStepPassed("ReviewTabPaymentDetailsCardExpiryDateYear : "+ReviewTabPaymentDetailsCardExpiryDateYear);
			
			
			
			
			/*String ReviewTabPaymentDetailsAddressFirstName = checkoutPage.getReviewTabPaymentDetailsFirstName();
			
			testStepPassed("ReviewTabPaymentDetailsAddressFirstName : "+ReviewTabPaymentDetailsAddressFirstName);
			
			String ReviewTabPaymentDetailsAddressLastName = checkoutPage.getReviewTabPaymentDetailsLastName();
			
			testStepPassed("ReviewTabPaymentDetailsAddressLastName : "+ReviewTabPaymentDetailsAddressLastName);
			
			String ReviewTabPaymentDetailsAddressStreet = checkoutPage.getReviewTabPaymentDetailsAddressStreet();
			
			testStepPassed("ReviewTabPaymentDetailsAddressStreet : "+ReviewTabPaymentDetailsAddressStreet);
			
			String ReviewTabPaymentDetailsAddressCity = checkoutPage.getReviewTabPaymentDetailsAddressCity();
			
			testStepPassed("ReviewTabPaymentDetailsAddressCity : "+ReviewTabPaymentDetailsAddressCity);
			
			String ReviewTabPaymentDetailsAddressState =  checkoutPage.getReviewTabPaymentDetailsAddressState();
			
			testStepPassed("ReviewTabPaymentDetailsAddressState : "+ReviewTabPaymentDetailsAddressState);
			
			String ReviewTabPaymentDetailsAddressZip  = checkoutPage.getReviewTabPaymentDetailsAddressZip();
			
			testStepPassed("ReviewTabPaymentDetailsAddressZip : "+ReviewTabPaymentDetailsAddressZip);
			
			String ReviewTabPaymentDetailsAddressPhoneNo =  checkoutPage.getReviewTabPaymentDetailsAddressPhoneNo();
			
			testStepPassed("ReviewTabPaymentDetailsAddressPhoneNo : "+ReviewTabPaymentDetailsAddressPhoneNo);
*/			
			
			
			if(checkoutPage.clickPlaceOrderButton())
			{

				orderConfirmationPage.clickOnCloseButtonInSurveyFormPopup();

				orderConfirmationPage.getOrderNumber();
				
				orderConfirmationPage.verifySavedCardCheckBox();
				
				orderConfirmationPage.verifyPerfectFItCheckBox();
				
				orderConfirmationPage.clickOnSavedCardAndPerfectFItCheckBox();

				orderConfirmationPage.fillOrderConfirmationPagePasswordDetails(retrieve("Password"), retrieve("ConfirmPassword"));

				orderConfirmationPage.clickOrderConfirmationPageSignUpNowButton();

				myaccountpage.verifyAccountDashBoardPageisDisplayed();
				
				myaccountpage.clickOnAccountInfoLink();
				
				myaccountpage.clickOnAddressBookLink();
				
				
				String AccountDashboardShipppingAddressFirstName = myaccountpage.getShipppingAddressFirstName();
				
				//testStepPassed("AccountDashboardShipppingAddressFirstName : "+AccountDashboardShipppingAddressFirstName);
				
				String AccountDashboardShipppingAddressLastName = myaccountpage.getShipppingAddressLastName();
				
				//testStepPassed("AccountDashboardShipppingAddressLastName : "+AccountDashboardShipppingAddressLastName);
				
				String AccountDashboardShipppingAddressStreet = myaccountpage.getShipppingAddressStreet();
				
				//testStepPassed("AccountDashboardShipppingAddressStreet : "+AccountDashboardShipppingAddressStreet);
				
				String AccountDashboardShipppingAddressCity = myaccountpage.getShipppingAddressCity();
				
				//testStepPassed("AccountDashboardShipppingAddressCity : "+AccountDashboardShipppingAddressCity);
				
				String AccountDashboardShipppingAddressState = myaccountpage.getShipppingAddressState();
				
				//testStepPassed("AccountDashboardShipppingAddressState : "+AccountDashboardShipppingAddressState);
				
				String AccountDashboardShipppingAddressZip = myaccountpage.getShipppingAddressZip();
				
				//testStepPassed("AccountDashboardShipppingAddressZip : "+AccountDashboardShipppingAddressZip);
				
				String AccountDashboardShipppingAddressPhone = myaccountpage.getShipppingAddressPhone();
				
				//testStepPassed("AccountDashboardShipppingAddressPhone : "+AccountDashboardShipppingAddressPhone);
				
				
				
				if (ReviewTabShippingAddressFirstName.equalsIgnoreCase(AccountDashboardShipppingAddressFirstName)) 
				{
					if (ReviewTabShippingAddressLastName.equalsIgnoreCase(AccountDashboardShipppingAddressLastName)) 
					{
						if (ReviewTabShippingAddressStreet.equalsIgnoreCase(AccountDashboardShipppingAddressStreet)) 
						{
							if (ReviewTabShippingAddressCity.equalsIgnoreCase(AccountDashboardShipppingAddressCity)) 
							{
								if (ReviewTabShippingAddressState.equalsIgnoreCase(AccountDashboardShipppingAddressState)) 
								{
									if (ReviewTabShippingAddressZip.equalsIgnoreCase(AccountDashboardShipppingAddressZip)) 
									{
										if (ReviewTabShippingAddressPhoneNo.equalsIgnoreCase(AccountDashboardShipppingAddressPhone)) 
										{
											testStepInfo("Shipping Address in Review Tab and Account Dashboard are same");
										}
									}
								}
							}
						}
					}
				}
				
				else 
				{
					testStepFailed("Shipping Address in Review Tab and Account Dashboard are not same");
				}
				
				
				
				
				myaccountpage.clickOnAccountInfoLink();
				
				myaccountpage.clickOnAccountInfo_PaymentMethodsLink();
				
				waitTime(2);
				
				
				
				
				
				String AccountDashboardPaymentDetailsCardType = myaccountpage.getPaymentDetailsCardType();
				
				//testStepPassed("AccountDashboardPaymentDetailsCardType : "+AccountDashboardPaymentDetailsCardType);
				
				String AccountDashboardPaymentDetailsCardNo = myaccountpage.getPaymentDetailsCardNo();
				
				//testStepPassed("AccountDashboardPaymentDetailsCardNo : "+AccountDashboardPaymentDetailsCardNo);
				
				String AccountDashboardPaymentDetailsCardMonthYear = myaccountpage.getPaymentDetailsCardExpiryMonthYear();
				
				//testStepPassed("AccountDashboardPaymentDetailsCardMonthYear : "+AccountDashboardPaymentDetailsCardMonthYear);
				
				
				if (ReviewTabPaymentDetailsCardType.equalsIgnoreCase(AccountDashboardPaymentDetailsCardType)) 
				{
					if (ReviewTabPaymentDetailsCardNo.equalsIgnoreCase(AccountDashboardPaymentDetailsCardNo)) 
					{
						if (ReviewTabPaymentDetailsCardExpiryDateYear.equalsIgnoreCase(AccountDashboardPaymentDetailsCardMonthYear)) 
						{
							testStepInfo("Card Details in Review Tab and Account Dashboard are same");
						}
					}
				}
				
				else 
				{
					testStepFailed("Card Details in Review Tab and Account Dashboard are not same");
				}
				
				
				
				
				
				
				
				
				
				myaccountpage.clickPerfectFitRewardsLinkinMyAccountPage();
				
				myaccountpage.verifyPFIDisdisplayedandgetPFID();
				
				

				if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
					
					homePage.ClickonSignoutinHeaderlinkgreetinglink();
					
				} 
				else 
				{
					homePage.ClickonIESignoutinHeaderlinkgreetinglink();
				}

				homePage.verifyUserLoggedOutSuccessfully();

			}
			else{
				homePage.ClickonHomePageLogo();
				

				if (browser.equalsIgnoreCase("InternetExplorer")) {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE();

				}
				else {

					shoppingcartPage.checkingtheshoppingbagcountemptyandifnotemptyingtheshopping();

				}
				
				homePage.ClickonHomePageLogo();
			}
		}
		catch(Exception e){
			testStepFailed("Exception Occured:"+e);
		}
		finally{
			if(checkoutPage.testCaseExecutionStatus ||
					departmentNavigation.testCaseExecutionStatus ||
					orderConfirmationPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					shoppingcartPage.testCaseExecutionStatus){
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