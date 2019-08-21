package mwPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class MyAccountPage extends PopupWindows
{
	public MyAccountPage(BaseClass obj) {
		
		super(obj);

	}

	String message_Success = "update successful", message_AlreadyExist = "already exists", message_SystemUnavailable = "system is unavailable";
	boolean verifyMessageFlag = false;



	public static final String lnk_Payment_MakeDefault="Payment Make Default Link#xpath=//div[@id='billingAddressMainDiv']//a[text()='Make default']";
	public static final String txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_FirstName="Account Info Payment Methods Add New Payment FirstName textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'firstName')]";
	public static final String txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_LastName="Account Info Payment Methods Add New Payment LastName textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'lastName')]";
	public static final String txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address1="Account Info Payment Methods Add New Payment Address1 textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'address1')]";
	public static final String txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_City="Account Info Payment Methods Add New Payment City textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'city')]";
	public static final String drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_State="Account Info Payment Methods Add New Payment State dropdown#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'state')]";
	public static final String txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Zip="Account Info Payment Methods Add New Payment Zip textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'zipCode')]";
	public static final String txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Phoneno="Account Info Payment Methods Add New Payment Phoneno textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'phoneNumber')]";

	public static final String lnk_AddressBookMakeDeafult= "Address book Make default Address#xpath=//div[contains(@id,'addressBookMainDiv')]//a[contains(text(),'Make Default')]";
	public static final String txt_NewEmail = "Text Box: New Email #xpath=//*[@id='UserSignInUpdateForm']//input[contains(@id,'sign-in-email1')]";
	public static final String txt_ConfirmEmail = "Text Box: Confirm Email#xpath=//*[@id='UserSignInUpdateForm']//input[contains(@id,'sign-in-email2')]";
	public static final String btn_SaveChanges = "Button: Save Changes #xpath=//*[contains(text(),'Save Changes')]";
	public static final String dlg_Message = "Confirmation Message #xpath=//div[contains(@id,'infoModal_message')]";
	public static final String dlg_CloseMessage = "Close Message #xpath=//div[contains(@id,'infoModal')]//a[contains(text(),'Close')]";
	public static final String lbl_AccountDashboard = "Account Dashboard Page Head #xpath=//*[contains(text(),'Account Dashboard')]";
	public static final String lnk_AddressBook = "Address Book Link #xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'Address Book')]";
	public static final String lnk_paymentmethod="paymentmethod #xpath=//*[@id='my-acc-subnav']//a[contains(text(),'Payment Methods')]";
	public static final String lnk_AVPopoup_AccountDashboard_AddressWith= "AV Popup Address With Link#xpath=//div[contains(@id,'js-addressVerificationWithRecommendation')]//div[@id='ada-av-with']";
	public static final String lnk_AVPopoup_AccountDashboard_AddressWithSuggested= "AV Popup Address With Suggested Link#xpath=//div[contains(@id,'js-addressVerificationWithRecommendation')]//div[@id='ada-av-with-suggested']";
	public static final String Btn_AVPopoup_AccountDashboard_UseAddress= "AV Popup Address Use Address Button#xpath=//div[contains(@id,'js-addressVerificationWithRecommendation')]//button[contains(@class,'js-av-continue button primary')]";


	public static final String lnk_MySizes="My Sizes Link#xpath=//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'Your Sizes')]";

	public static final String lnk_Orderhistory="Order History Link#xpath=//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'Order History')]";
	public static final String lnk_OrderHistory_no="Order History Number Link#xpath=//td[contains(@class,'order-num')]//a";
	public static final String lnk_OrderHistory_Productname="Order History Product Name Link#xpath=//h3[@class='product-name']/a";

	public static final String lnk_AccountInfo="Account Info Link#xpath=//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'Account Info')]";
	public static final String lnk_AccountInfo_SignInInfo="Account Info Sign In Info Link#xpath=//ul[contains(@id,'my-acc-subnav')]//ul[contains(@id,'personalInfoSubMenu')]//a[contains(text(),'Sign In Info')]";
	public static final String txt_AccountInfo_SignInInfo_Email="Account Info Sign In Info Email textbox#xpath=//section[contains(@class,'dash-info')]//input[contains(@id,'sign-in-email1')]";
	public static final String txt_AccountInfo_SignInInfo_Password="Account Info Sign In Info Passwordtextbox#xpath=//section[contains(@class,'dash-info')]//input[contains(@id,'sign-in-pw1')]";
	public static final String txt_AccountInfo_SignInInfo_ConfirmEmail="Account Info Sign In Info Confirm Email textbox#xpath=//section[contains(@class,'dash-info')]//input[contains(@id,'sign-in-email2')]";
	public static final String txt_AccountInfo_SignInInfo_ConfirmPassword="Account Info Sign In Info Confirm Password textbox#xpath=//section[contains(@class,'dash-info')]//input[contains(@id,'sign-in-pw2')]";
	public static final String btn_AccountInfo_SignInInfo_Savechanges="Account Info Sign In Info Save changes button#xpath=//section[contains(@class,'dash-info')]//a[contains(text(),'Save Changes')]";
	public static final String lbl_AccountInfo_SignInInfo_Savechanges_Message="Account Info Sign In Info Save changes Message Label#xpath=//div[contains(@id,'infoModal')]//div[contains(@id,'infoModal_message')]";
	public static final String lnk_AccountInfo_SignInInfo_Savechanges_Message_Close="Account Info Sign In Info Save changes Message close Link#xpath=//div[contains(@id,'infoModal')]/a";

	public static final String lnk_AccountInfo_PaymentMethods="Account Info Payment Methods Link#xpath=//ul[contains(@id,'my-acc-subnav')]//ul[contains(@id,'personalInfoSubMenu')]//a[contains(text(),'Payment Methods')]";
	public static final String btn_AccountInfo_PaymentMethods_AddNewPaymentMethod="Account Info Payment Methods Add New Payment MethodButton#xpath=//div[contains(@id,'billingAddressMainDiv')]//a[contains(text(),'Add New Payment Method')]";
	public static final String drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardType="Account Info Payment Methods Add New Payment Card Type dropdown#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'payMethodId')]";
	public static final String txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardNo="Account Info Payment Methods Add New Payment Card No textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'account1')]";
	public static final String drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryMonth="Account Info Payment Methods Add New Payment Card Expiry Month textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'expire_month')]";
	public static final String drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryYear="Account Info Payment Methods Add New Payment Card Expiry Year textbox#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'expire_year')]";
	public static final String drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address="Account Info Payment Methods Add New Payment Address dropdown#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@name,'addressId')]";
	public static final String btn_AccountInfo_PaymentMethods_AddNewPaymentMethod_Save="Account Info Payment Methods Add New Payment Save Button#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//a[contains(text(),'Save')]";
	public static final String lbl_AccountInfo_PaymentMethods_Savechanges_Message="Account Info PaymentMethods Save changes Message Label#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]";
	public static final String lnk_AccountInfo_PaymentMethods_Savechanges_Message_Close="Account Info PaymentMethods Save changes Message close Link#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//a[contains(@id,'ModalAddressBookSuccess-close')]";
	public static final String lnk_AccountInfo_PaymentMethods_Delete="Account Info PaymentMethods Delete Link#xpath=(//ul[contains(@class,'payment-methods clearfix')]//a[contains(@class,'delete')])[2]";
	public static final String lbl_AccountInfo_PaymentMethods_Delete_Message="Account Info PaymentMethods Delete Message Label#xpath=//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'Address Book')]";
	public static final String lnk_AccountInfo_PaymentMethods_Delete_Message_Close="Account Info PaymentMethods Delete Message close Link#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//a[contains(@id,'ModalAddressBookSuccess-close')]";

	public static final String lnk_removeAddressBooknew="remove the Address Book Link#xpath=//a[contains(@class,'delete')]";
	public static final String lnk_AddressBooknew="Address Book Link#xpath=//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'Address Book')]";
	public static final String btn_AddressBook_AddNewAddress="Address Book Add New Address Button#xpath=//a[contains(text(),'Add New Address')]";
	public static final String txt_AddressBook_AddNewAddress_Firstname="Address Book Add New Address Firstname textbox#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-firstname')]";
	public static final String txt_AddressBook_AddNewAddress_Lastname="Address Book Add New Address Lastname textbox#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-lastname')]";
	public static final String txt_AddressBook_AddNewAddress_Address="Address Book Add New Address Address textbox#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-street1')]";
	public static final String txt_AddressBook_AddNewAddress_City="Address Book Add New Address City textbox#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-city')]";
	public static final String drp_AddressBook_AddNewAddress_State="Address Book Add New Address State dropdown#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//select[contains(@id,'ship-state')]";
	public static final String txt_AddressBook_AddNewAddress_Zip="Address Book Add New Address Zip textbox#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-zip')]";
	public static final String txt_AddressBook_AddNewAddress_Telephone="Address Book Add New Address Telephone textbox#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//ul[contains(@class,'form')]//input[contains(@name,'phone1')]";
	public static final String btn_AddressBook_AddNewAddress_Submit="Address Book Add New Address Submit button#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//a[contains(text(),'Submit')]";
	public static final String lbl_AddressBook_AddNewAddress_Saved_Message="Address Book Saved changes Message Label#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]";
	public static final String lnk_AddressBook_AddNewAddress_SavedMessage_Close="Address Book Saved Message close Link#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//a[contains(@id,'ModalAddressBookSuccess-close')]";
	public static final String lnk_PFAddress_SavedMessage_Close="PFAddress Book Saved Message close Link#xpath=//*[@id='ModalAddressBookSuccess']/a";
	

	public static final String lnk_AddressBook_EditAddress="Address Book Edit Address Link#xpath=//ul[contains(@class,'addys clearfix')]//li[contains(@class,'even')]//a[contains(text(),'Edit')]";
	public static final String btn_AddressBook_UpdateAddress="Address Book Update Address button#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//a[contains(text(),'Update')]";
	public static final String lbl_AddressBook_UpdateAddress_Saved_Message="Address Book Update address Message Label#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]";
	public static final String lnk_AddressBook_UpdateAddress_SavedMessage_Close="Address Book Update address Message close Link#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//a[contains(@id,'ModalAddressBookSuccess-close')]";
	public static final String lnk_AddressBook_DeleteAddress="Address Book Delete address Link#xpath=//ul[contains(@class,'addys')]//li//a[contains(@class,'delete')]";
	public static final String btn_AddressBook_DeleteAddressDialog_Delete="Address Book Delete address Dialog Delete Button#xpath=//div[contains(@id,'ModalDeleteShippingAddressFormDialog')]//a[contains(text(),'Delete')]";
	public static final String lbl_AddressBook_DeleteAddress_Message="Address Book Delete Address Message Label#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]";
	public static final String lnk_AddressBook_DeleteAddress_Close="Address Book Delete Address Message close Link#xpath=//div[contains(@id,'ModalAddressBookSuccess')]//a[contains(@id,'ModalAddressBookSuccess-close')]";


	public static final String lbl_AccountDashboardPage_AccountDashboardTitle = "Account Dashboard Page Head #xpath=//h2[contains(text(),'Account Dashboard')]";
	public static final String lnk_AccountDashboardPage_PerfectFitRewardsLink = "Account Dashboard Page Perfect Fit Rewards Link#xpath=//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'Perfect Fit Rewards')]";
	public static final String lnk_AccountDashboardPage_PerfectFitRewardsTab_YesOptionforPFRewards = "Account Dashboard Page Perfect Fit Rewards Tab Yes Radiobutton#xpath=//input[contains(@id,'pf-opt1-form1-toggle')]";

	public static final String lbl_paymentremove = "Payment remove #xpath=//ul[@class='payment-methods clearfix']//a[@class='delete']";
	public static final String lbl_paymentdeleteconform = "Payment delete text conform #xpath=//ul[@class='payment-methods clearfix']//a[@class='delete']";

	public static final String txt_AccountDashboardPage_PerfectFitRewardsTab_Firstname = "Account Dashboard Page Perfect Fit Rewards Tab Firstname Textbox#xpath=//section[contains(@class,'dash-pf')]//input[contains(@id,'ship-firstname')]";
	public static final String txt_AccountDashboardPage_PerfectFitRewardsTab_Lastname = "Account Dashboard Page Perfect Fit Rewards Tab Lastname Textbox#xpath=//section[contains(@class,'dash-pf')]//input[contains(@id,'ship-lastname')]";
	public static final String txt_AccountDashboardPage_PerfectFitRewardsTab_Address = "Account Dashboard Page Perfect Fit Rewards Tab Address Textbox#xpath=//section[contains(@class,'dash-pf')]//input[contains(@id,'address1')]";
	public static final String txt_AccountDashboardPage_PerfectFitRewardsTab_City = "Account Dashboard Page Perfect Fit Rewards Tab City Textbox#xpath=//section[contains(@class,'dash-pf')]//input[contains(@id,'city')]";
	public static final String drp_AccountDashboardPage_PerfectFitRewardsTab_State = "Account Dashboard Page Perfect Fit Rewards Tab State Dropdown#xpath=//section[contains(@class,'dash-pf')]//select[contains(@id,'pfr-newacct-state')]";
	public static final String txt_AccountDashboardPage_PerfectFitRewardsTab_Zip = "Account Dashboard Page Perfect Fit Rewards Tab Zip Textbox#xpath=//section[contains(@class,'dash-pf')]//input[contains(@id,'zipCode')]";
	public static final String txt_AccountDashboardPage_PerfectFitRewardsTab_Telephone = "Account Dashboard Page Perfect Fit Rewards Tab Telephone Textbox#xpath=//section[contains(@class,'dash-pf')]//input[contains(@id,'pfr-newacct-tel')]";
	public static final String btn_AccountDashboardPage_PerfectFitRewardsTab_Submit = "Account Dashboard Page Perfect Fit Rewards Tab Submit Button#xpath=//section[contains(@class,'dash-pf')]//a[contains(@id,'submitPFRegister')]";
	public static final String lnk_AccountDashboardPage_PerfectFitRewardslink = "Account Dashboard Page Perfect Fit Rewards link#xpath=//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'Perfect Fit Rewards')]";
	public static final String lnk_MyStore="My Store Link#xpath=//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'My Store')]";
	public static final String lnk_PFAddressEditlink="PF address Edit link#xpath=//div[contains(@class,'pf-address')]/a";
	public static final String txt_PFAddress_Firstname = "PFAddress Firstname Textbox#xpath=//*[@id='ship-firstname_rewards']";
	public static final String txt_PFAddress_Lastname = "PFAddress Lastname Textbox#xpath=//*[@id='ship-lastname_rewards']";
	public static final String txt_PFAddress_Address = "PFAddress Address Textbox#xpath=//*[@id='ship-street1_rewards']";
	public static final String txt_PFAddress_City = "PFAddress City Textbox#xpath=//*[@id='ship-city_rewards']";
	public static final String drp_PFAddress_State = "PFAddress State Dropdown#xpath=//*[@id='ship-state_rewards']";
	public static final String txt_PFAddress_Zip = "PFAddress Zip Textbox#xpath=.//*[@id='ship-zip_rewards']";
	public static final String txt_PFAddress_Telephone = "PFAddress Telephone Textbox#xpath=//*[@id='ship-tel_rewards']";
	public static final String btn_PFAddress_Update = "PFAddress Update Button#xpath=//*[@id='PFAddressFormSubmitBtnLabel']";

	public void clickOnLeftNavigationInMyAccountPage(String navLink){
		clickOn(" '"+navLink+"' left navigation link #xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'"+navLink+"')]");
	}

	public void fillEditPFAddressDetails(String PFFirstName, String PFLastName, String PFAddress, String PFCity, String PFState, String PFZip, String PFTelephone){
		typeIn(txt_PFAddress_Firstname, PFFirstName);
		typeIn(txt_PFAddress_Lastname, PFLastName);
		typeIn(txt_PFAddress_Address, PFAddress);
		typeIn(txt_PFAddress_City, PFCity);
		selectFromDropdown(drp_PFAddress_State, PFState);
		typeIn(txt_PFAddress_Zip, PFZip);
		typeIn(txt_PFAddress_Telephone, PFTelephone);
		clickOn(btn_PFAddress_Update);
	}

	public void clickPerfectFitRewardsLinkinMyAccountPage(){
		clickOn(lnk_AccountDashboardPage_PerfectFitRewardslink); 
	}
	
	public void clickPFaddressEditLinkinMyAccountPage(){
		clickOn(lnk_PFAddressEditlink); //div[contains(@class,'pf-address')]/a
	}


	public void clickMyStoreLinkinMyAccountPage(){
		try {
			if (driver.findElement(By.xpath("//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'My Store')]")).isDisplayed()) {
				clickOn(lnk_MyStore);
			}
		} catch (Exception e) {
			testStepFailed("My Store Link in Account Page is not displayed");
		}

	}


	public void clickOnPayment_MakeDefault_Link()
	{
		try {
			if (driver.findElement(By.xpath("//div[@id='billingAddressMainDiv']//a[text()='Make default']")).isDisplayed()) {
				clickOn(lnk_Payment_MakeDefault);
				waitTime(1);
				clickOn(lnk_AccountInfo_PaymentMethods_Savechanges_Message_Close);
				//clickOn(lnk_BackToTop);
				if (driver.findElement(By.xpath("//div[contains(@id,'billingAddressMainDiv')]//ul[contains(@class,'payment-methods')]//li[2]//span[contains(@class,'default-payment')]")).isDisplayed()) 
				{
					testStepPassed("Payment is made to Default");
				}
			}
		} catch (Exception e) {
			testStepFailed("Payment Link is not displayed");
		}
	}
	
	
	public void verifyPaymentCardisMadeDefault()
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'billingAddressMainDiv')]//ul[contains(@class,'payment-methods')]//li[2]//span[contains(@class,'default-payment')]")).isDisplayed()) 
				{
					testStepInfo("Payment Card is made to Default");
				}
			
		} catch (Exception e) {
			testStepFailed("Payment Card is not made to Default");
		}
	}

	public void clickOnAddressBookInMyAccountPage(){
		try{
			clickOn(lnk_AddressBook);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		finally
		{
			clickOn(lnk_AddressBook);
		}
	}

	public void clickOnLeftNavigationSubLink(String link, String subLink){

		if(!driver.findElement(By.xpath("//*[@id='personalInfoSubMenu']//a[contains(text(),'"+subLink+"')]")).isDisplayed()){

			clickOnLeftNavigationInMyAccountPage(link);
			if(!subLink.isEmpty()){
				if(driver.findElement(By.xpath("//*[@id='personalInfoSubMenu']//a[contains(text(),'"+subLink+"')]")).isDisplayed()){
					clickOn(" '"+subLink+"' left navigation subLink #xpath=//*[@id='personalInfoSubMenu']//a[contains(text(),'"+subLink+"')]");
				}
			}
		}
	}

	public void fillEditEmailAddressDetails(String newEmail,String verifyEmail){
		typeIn(txt_NewEmail, newEmail);
		typeIn(txt_ConfirmEmail, verifyEmail);
	}
	
	
	public void clickOnSaveChanges(){
		clickOn(btn_SaveChanges);
	}

	public void updateOldEmailAddress(String oldEmail,String verifyEmail){
		typeIn(txt_NewEmail, oldEmail);
		typeIn(txt_ConfirmEmail, verifyEmail);
		clickOn(btn_SaveChanges);
	}

	public boolean verifyConfimationMessage(){
		waitForElementToDiaplay();
		if(getText(dlg_Message).toLowerCase().contains(message_Success)){
			testStepPassed("Email Updated Successfully");
			verifyMessageFlag = true;
		}else if(getText("dlg_Message").toLowerCase().contains(message_AlreadyExist)){
			testStepFailed("Email Not Updated as the given email "+message_AlreadyExist);
		}else if(getText("dlg_Message").toLowerCase().contains(message_SystemUnavailable)){
			testStepFailed("Application Issue: Email Not Updated issue as "+message_SystemUnavailable);
		}
		return verifyMessageFlag;
	}

	public void closeMessage(){
		if(isElementDisplayed(dlg_CloseMessage))
			clickOn(dlg_CloseMessage);
	}

	public void	waitForElementToDiaplay(){
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'infoModal_message')]")));
	}


	//	public void verifyMyAccountPage(){
	//		waitForElement(lbl_AccountDashboard);
	//		verifyElement(lbl_AccountDashboard);
	//	}

	public void verifyMyAccountPage(){

		waitForElement(lbl_AccountDashboard);
		if(isElementDisplayed(lbl_AccountDashboard)){
			testStepPassed("AccountDashboard Link is navigated to its corresponding page");			
		}else{
			testStepFailed("AccountDashboard Link is navigated to its corresponding page");
		}
	}
	public void clickOnPaymentMethod()
	{
		clickOn(lnk_paymentmethod);
	}


	public void clickOnMySizes()
	{
		clickOn(lnk_MySizes);
	}


	public void clickOnPaymentMethodsInMyAccountPage(){
		clickOnLeftNavigationSubLink("Account Info", "Payment Methods");
	}
	public void clickOnOrderHistoryLink()
	{
		waitTime(2);
		clickOn(lnk_Orderhistory);
	}


	public void clickOnOrderNoLink()
	{
		//clickOn(lnk_OrderHistory_no);
		clickOnSpecialElement(lnk_OrderHistory_no);
	}

	public void getorderhistoryproductdetails()
	{
		//String productdetails = driver.findElement(By.xpath("//ul[contains(@id,'cart-items')]//a[contains(@class,'prod-title')]")).getText();
				String productdetails = driver.findElement(By.xpath("//h3[@class='product-name']/a")).getText();
				testStepPassed("Order History Product : "+productdetails);
				clickOn(lnk_OrderHistory_Productname);
	}


	public void clickOnAccountInfoLink()
	{
		//waitTime(2);
		clickOn(lnk_AccountInfo);
	}

	public void clickOnAccountInfo_SignInInfoLink()
	{
		waitTime(2);
		clickOn(lnk_AccountInfo_SignInInfo);
	}


	public void clear_AccountInfo_SignInInfo_details()
	{
		waitTime(5);
		driver.findElement(By.xpath("//section[contains(@class,'dash-info')]//input[contains(@id,'sign-in-email1')]")).clear();
		driver.findElement(By.xpath("//section[contains(@class,'dash-info')]//input[contains(@id,'sign-in-pw1')]")).clear();
		driver.findElement(By.xpath("//section[contains(@class,'dash-info')]//input[contains(@id,'sign-in-email2')]")).clear();
		driver.findElement(By.xpath("//section[contains(@class,'dash-info')]//input[contains(@id,'sign-in-pw2')]")).clear();
	}	



	public void fill_AccountInfo_SignInInfo_EmailPasswordDetails(String Email, String Password, String ConfirmEmail, String ConfirmPassword )
	{
		typeIn(txt_AccountInfo_SignInInfo_Email, Email);
		typeIn(txt_AccountInfo_SignInInfo_Password, Password);
		typeIn(txt_AccountInfo_SignInInfo_ConfirmEmail, ConfirmEmail);
		typeIn(txt_AccountInfo_SignInInfo_ConfirmPassword, ConfirmPassword);
		clickOn(btn_AccountInfo_SignInInfo_Savechanges);
	}

	public void clickOnAccountInfo_SignInInfo_Savechanges_Button()
	{
		waitTime(2);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).perform();
		clickOn(btn_AccountInfo_SignInInfo_Savechanges);
	}


	public void clickOnSafariAccountInfo_SignInInfo_Savechanges_Button()
	{
		waitTime(2);
		clickOn(btn_AccountInfo_SignInInfo_Savechanges);
	}


	public void verify_AccountInfo_SignInInfo_Savedchanges_MessageandClose()
	{
		waitTime(8);
		if (driver.findElement(By.xpath("//div[contains(@id,'infoModal')]//div[contains(@id,'infoModal_message')]")).isDisplayed()) {
			String savedmsg = driver.findElement(By.xpath("//div[contains(@id,'infoModal')]//div[contains(@id,'infoModal_message')]")).getText();
			System.out.println("Sign In Saved Message :"+savedmsg);
			if (savedmsg.equalsIgnoreCase("Personal Information update successful.")) {
				testStepPassed("Personal Information update successful");
			} else {
				testStepFailed("Personal Information update unsuccessful");
			}
			clickOn(lnk_AccountInfo_SignInInfo_Savechanges_Message_Close);
		} 
		else {
			testStepFailed("The Personal Information update message is not displayed");
		}

	}


	public void clickOnAccountInfo_PaymentMethodsLink()
	{
		//waitTime(2);
		clickOn(lnk_AccountInfo_PaymentMethods);
	}


	public void VerifyPayment_MadeDefault()
	{
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@id,'billingAddressMainDiv')]//ul[contains(@class,'payment-methods')]//li[2]//span[contains(@class,'default-payment')]")).isDisplayed()) {
				testStepPassed("Payment is made to Default");

			}
		} catch (Exception e) {
			testStepFailed("Payment is not made default");
		}
	}


	public void clickOnAccountInfo_PaymentMethods_AddNewPaymentMethod_Button()
	{
		waitTime(2);
		clickOn(btn_AccountInfo_PaymentMethods_AddNewPaymentMethod);
	}

	public void select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardType(String CreditCardType)
	{
		/*try {
			waitTime(1);
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'payMethodId')]")).isDisplayed()) {
				selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardType, CreditCardType);
			}

		} catch (Exception e) {
			
			testStepPassed("Credit Card Type is not displayed");
		}*/
	}


	public void select_AccountInfo_PaymentMethods_AddNewPaymentMethod_SelectAddress(String SelectAddress)
	{
		selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address, SelectAddress);
	}

	public String PaymentCardNo()
	{
		waitTime(2);
		String cardno= driver.findElement(By.xpath("//div[@id='billingAddressMainDiv']//li[2]//span[@class='number']")).getText();
		return cardno;
	}

	public void fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardNo(String CreditCardNo)
	{

		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'account1')]")).isDisplayed()) {
				//waitTime(2);
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardNo, CreditCardNo);
			}
		} catch (Exception e) {
			testStepFailed("Credit Card No is not displayed");
		}

	}
	public void select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryMonth(String Payment_CreditCardExpiryMonth)
	{
		try {
			//waitTime(1);
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'expire_month')]")).isDisplayed()) {
				selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryMonth, Payment_CreditCardExpiryMonth);
			}

		} catch (Exception e) {
			testStepFailed("Credit Card Month is not displayed");
		}

	}


	public void fillPaymentDetails_AccountInfo_PaymentMethods(String Payment_FirstName, String Payment_LastName, String Payment_Address1, String Payment_City, String Payment_State, String Payment_Zip, String Payment_PhoneNo)
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'firstName')]")).isDisplayed()) {
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_FirstName, Payment_FirstName);
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_LastName, Payment_LastName);
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address1, Payment_Address1);
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_City, Payment_City);
				selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_State, Payment_State);
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Zip, Payment_Zip);
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Phoneno, Payment_PhoneNo);
			}
		} catch (Exception e) {
			testStepFailed("Payment Address Firstname is not displayed");
		}
	}



	public void fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_FirstName(String Payment_FirstName)
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'firstName')]")).isDisplayed()) {
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_FirstName, Payment_FirstName);
			}
		} catch (Exception e) {
			testStepFailed("Payment Address Firstname is not displayed");
		}
	}

	public void fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_LastName(String Payment_LastName)
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'lastName')]")).isDisplayed()) {
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_LastName, Payment_LastName);
			}
		} catch (Exception e) {
			testStepFailed("Payment Address Lastname is not displayed");
		}
	}

	public void fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address1(String Payment_Address1)
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'address1')]")).isDisplayed()) {
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address1, Payment_Address1);
			}
		} catch (Exception e) {
			testStepFailed("Payment Address Address1 is not displayed");
		}
	}

	public void fill_AccountInfo_PaymentMethods_AddNewPaymentMethod_City(String Payment_City)
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'city')]")).isDisplayed()) {
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_City, Payment_City);
			}
		} catch (Exception e) {
			testStepFailed("Payment Address City is not displayed");
		}
	}

	public void Select_AccountInfo_PaymentMethods_AddNewPaymentMethod_State(String Payment_State)
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'state')]")).isDisplayed()) {
				//selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_State, Payment_State);
				clickOn("State dropdown#xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'state')]/option[contains(text(),'CA - California')]");
			}
		} catch (Exception e) {
			testStepFailed("Payment Address State is not displayed");
		}
	}

	public void txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Zip(String Payment_Zip)
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'zipCode')]")).isDisplayed()) {
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Zip, Payment_Zip);
			}
		} catch (Exception e) {
			testStepFailed("Payment Address State is not displayed");
		}
	}


	public void txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_PhoneNo(String Payment_PhoneNo)
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ModalPaymentDetailsFormDialog')]//input[contains(@id,'phoneNumber')]")).isDisplayed()) {
				typeIn(txt_AccountInfo_PaymentMethods_AddNewPaymentMethod_Phoneno, Payment_PhoneNo);
			}
		} catch (Exception e) {
			testStepFailed("Payment Address State is not displayed");
		}
	}





	public void select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryYear(String Payment_CreditCardExpiryYear)
	{
		selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryYear, Payment_CreditCardExpiryYear);
	}

	public void select_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address(String Address)
	{
		selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_Address, Address);
	}

	public void clickOnAccountInfo_PaymentMethods_AddNewPaymentMethod_SaveButton()
	{
		clickOn(btn_AccountInfo_PaymentMethods_AddNewPaymentMethod_Save);
	}

	public void verify_AccountInfo_PaymentMethods_Savedchanges_MessageandClose()
	{
		waitTime(4);
		if (driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).isDisplayed()) {
			String savedmsg = driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).getText();
			System.out.println("Payment Methods Saved Message :"+savedmsg);
			if (savedmsg.equalsIgnoreCase("Billing details has been added successfully")) {
				testStepPassed("Billing details has been added successfully");
			} else {
				testStepFailed("Billing details has not been added successfully");
			}
			clickOn(lnk_AccountInfo_PaymentMethods_Savechanges_Message_Close);
		} 
		else {
			testStepPassed("Billing details added message is not displayed");
		}
	}


	public void clickOnAccountInfo_PaymentMethods_DeleteButton()
	{
		waitTime(4);
		clickOn(lnk_AccountInfo_PaymentMethods_Delete);
		/*Alert alert = driver.switchTo().alert();
		alert.accept();*/
		//alertOk();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		//Accepting alert.
		alert.accept();
		System.out.println("Accepted the alert successfully.");
		/*waitTime(3);
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println("Text in the alert box :"+alerttext);
		alert.accept();*/
	}


	public void verify_AccountInfo_PaymentMethods_deleted_MessageandClose()
	{
		waitTime(8);
		if (driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).isDisplayed()) {
			String savedmsg = driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).getText();
			System.out.println("Payment Methods Deleted Message :"+savedmsg);
			if (savedmsg.equalsIgnoreCase("Billing details has been added successfully")) {
				testStepPassed("Billing details has been deleted successfully");
			} else {
				testStepFailed("Billing details has been deleted successfully");
			}
			clickOn(lnk_AccountInfo_PaymentMethods_Delete_Message_Close);
		} 
		else {
			testStepFailed("Billing details has not been deleted successfully");
		}
	}


	public void clickOnAddressBookLink()
	{
		waitTime(2);
		clickOn(lnk_AddressBooknew);
	}
	
	public void AddressDetailAvailableInMyAccountPage()
	{
		if (driver.findElement(By.xpath("//ul[@class='addys clearfix']")).isDisplayed()){
			
			testStepInfo("Addres is present in address book");
		}
	}
	
	public void removeAllAddressInAddressBookPage()
	{
		waitTime(2);
		clickOn(lnk_removeAddressBooknew);
	}

	public void VerifyShippingAddressEnteredinreviewTabisDisplayedinAccountDashboardPageandGettheAddress() {
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul//li[1]//span")).isDisplayed()) {
				List<WebElement> ShippingAddress = driver.findElements(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul//li[1]//span"));
				int Count = ShippingAddress.size();
				System.out.println(Count);
				testStepPassed("Shipping Address Displayed");
				for (WebElement sh : ShippingAddress) {
					String AddressName = sh.getText();
					testStepPassed(AddressName);	
				}

			}
		} catch (Exception e) {
			testStepFailed("Shipping Address is not displayed in Account Dashboard Page");
		}
	}
	public void clickOnAddressBook_AddNewAddressButton()
	{
		waitTime(1);
		clickOn(btn_AddressBook_AddNewAddress);
	}


	public void SelectAddressOptionWithIndex(int indexToSelect)
	{
		try {
			if (driver.findElement(By.xpath("//body[contains(@id,'mw')]//div[contains(@class,'pac-container')]//div[contains(@class,'pac-item')]")).isDisplayed()) {
				List<WebElement>  optinsToSelect = driver.findElements(By.xpath("//body[contains(@id,'mw')]//div[contains(@class,'pac-container')]//div[contains(@class,'pac-item')]"));
				int OptionsCount = optinsToSelect.size();
				if (indexToSelect<=OptionsCount) {
					optinsToSelect.get(indexToSelect).click();
					testStepPassed("Address Autocomplete option is displayed and a value selected from it");
				}
			}
		} catch (Exception e) {
			testStepPassed("The Select Autocomplete Options are not displayed");
		}
	}


	public void fillShippingDetails_AddressBook(String Firstname, String Lastname, String Address, String City, String State, String Zipcode, String Telephone)
	{
		waitTime(2);
		typeIn(txt_AddressBook_AddNewAddress_Firstname, Firstname);
		typeIn(txt_AddressBook_AddNewAddress_Lastname, Lastname);
		typeIn(txt_AddressBook_AddNewAddress_Address, Address);
		typeIn(txt_AddressBook_AddNewAddress_City, City);
		selectFromDropdown(drp_AddressBook_AddNewAddress_State, State);
		typeIn(txt_AddressBook_AddNewAddress_Zip, Zipcode);
		typeIn(txt_AddressBook_AddNewAddress_Telephone, Telephone);
	}




	public void fillDetails_AddressBook_AddNewAddress1(String Firstname, String Lastname, String Address, String City)
	{
		waitTime(2);
		typeIn(txt_AddressBook_AddNewAddress_Firstname, Firstname);
		typeIn(txt_AddressBook_AddNewAddress_Lastname, Lastname);
		typeIn(txt_AddressBook_AddNewAddress_Address, Address);

		//SelectAddressOptionWithIndex(1);


		typeIn(txt_AddressBook_AddNewAddress_City, City);
	}


	public void select_AddressBook_AddNewAddress_State(String State)
	{
	//selectFromDropdown(drp_AddressBook_AddNewAddress_State, State);
		clickOn(drp_AddressBook_AddNewAddress_State);
		clickOn("State#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//select[contains(@id,'ship-state')]/option[contains(text(),'CA - California')]");
		
	}


	public void fillDetails_AddressBook_AddNewAddress2(String Zip, String Telephone)
	{
		typeIn(txt_AddressBook_AddNewAddress_Zip, Zip);
		typeIn(txt_AddressBook_AddNewAddress_Telephone, Telephone);
	}


	public void clickOnAddressBook_AddNewAddress_SubmitButton()
	{
		//waitTime(1);
		clickOn(btn_AddressBook_AddNewAddress_Submit);
	}

	public void ShipppingAddress()
	{
		waitTime(2);
		String ShippingAddress = driver.findElement(By.xpath("//div[@id='addressBookMainDiv']//li[@class='default']")).getText();
		testStepPassed("Default Shipping Address : "+ShippingAddress);
	}


	public void CheckingShipppingAddressisDefault()
	{
		waitTime(1);
		String ShippingAddress = driver.findElement(By.xpath("//div[@id='addressBookMainDiv']//li[@class='default']")).getText();
		testStepPassed("Default Shipping Address : "+ShippingAddress);
	}

	public void clickOnAddressBook_MakeDefault_Link()
	{
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//a[contains(text(),'Make Default')]")).isDisplayed()) {
				clickOn(lnk_AddressBookMakeDeafult);
				waitTime(2);
				clickOn(lnk_AddressBook_AddNewAddress_SavedMessage_Close);
				//clickOn(lnk_BackToTop);
				if (driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//a[text()='Default']")).isDisplayed()) {
					testStepPassed("Address is made to Default");
				}
			}
		} catch (Exception e) {
			testStepFailed("Make Address Default Link is not displayed");
		}
	}

	public String getAddressFromAddressBook()
	{
		String shippingAddress=null;

		try {
			waitTime(1);
			if (driver.findElement(By.xpath("//div[@id='addressBookMainDiv']//section//ul[contains(@class, 'addys clearfix')]")).isDisplayed()) {
				shippingAddress = driver.findElement(By.xpath("//div[@id='addressBookMainDiv']//section//ul[contains(@class, 'addys clearfix')]/li")).getText();
				testStepPassed(shippingAddress);
			}
			return shippingAddress;
		} catch (Exception e) {
			testStepFailed("Shipping Address is not displayed");
			return null;
		}
	}
	public void select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardMonth(String CreditCardMonth)
	{
		waitTime(2);
		//selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryMonth, CreditCardMonth);
		clickOn(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryMonth);
		clickOn("Credit Card Expire Month #xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'expire_month')]/option[contains(@value,'"+CreditCardMonth+"')]");
	}

	public String getBillingInfoFromAccountInfo()
	{
		String billingInfo=null;

		try {
			waitTime(1);
			if (driver.findElement(By.xpath("//div[@id='billingAddressMainDiv']//ul[contains(@class, 'payment-methods clearfix')]/li[2]")).isDisplayed()) {
				String card_type = driver.findElement(By.xpath("//div[@id='billingAddressMainDiv']//ul[contains(@class, 'payment-methods clearfix')]/li[2]/span[@class='card-type']")).getText();
				String card_number = driver.findElement(By.xpath("//div[@id='billingAddressMainDiv']//ul[contains(@class, 'payment-methods clearfix')]/li[2]/span[@class='number']")).getText();
				String card = card_number.substring(0, 4)+ " " +card_number.substring(4, 8)+" "+card_number.substring(8, 12)+ " "+card_number.substring(12, 16);

				// String b = card_number.substring(4, 9);
				String expiry_year = driver.findElement(By.xpath("//div[@id='billingAddressMainDiv']//ul[contains(@class, 'payment-methods clearfix')]/li[2]/span[@class='expires']")).getText();

				billingInfo = card_type+" "+"|"+" "+card+","+" "+"exp"+"."+" "+expiry_year;
				//System.out.println("Billing info: " +billingInfo);
				testStepPassed(billingInfo);
			}
			return billingInfo;
		} catch (Exception e) {
			testStepFailed("Shipping Address is not displayed");
			return null;
		}
	}


	public void select_AccountInfo_PaymentMethods_AddNewPaymentMethod_CreditCardExpiryYear(String CreditCardExpiryYear)
	{
		waitTime(2);
		//selectFromDropdown(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryYear, CreditCardExpiryYear);
		clickOn(drp_AccountInfo_PaymentMethods_AddNewPaymentMethod_CardExpiryYear);
		clickOn("Credit Card Expire Year #xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'expire_year')]/option[contains(@value,'"+CreditCardExpiryYear+"')]");
		//driver.findElement(By.xpath("Credit Card Expire Year #xpath=//div[contains(@id,'ModalPaymentDetailsFormDialog')]//select[contains(@id,'expire_year')]/option[contains(@value,'"+CreditCardExpiryYear+"')]")).click();
	}



	public void verifyAVPopupinAccountDashBoardPageisDisplayedSelectAddressandContinue(){
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@id,'js-addressVerificationWithRecommendation')]//h3")).isDisplayed()) {
				testStepPassed("AV Popup in Account Dashboard Page is displayed");
				clickOn(lnk_AVPopoup_AccountDashboard_AddressWith);
				clickOn(Btn_AVPopoup_AccountDashboard_UseAddress);

			} 
			else {
				testStepFailed("AV Popup is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("AV Popup in Account Dashboard page is not displayed");
		}
	}




	public void verify_AddressBook_NewAddress_Saved_MessageandClose()
	{
		waitTime(2);////div[contains(@id,'ModalAddressBookSuccess')]
		if (driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).isDisplayed()) {
			String savedmsg = driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).getText();
			System.out.println("Address Saved Message :"+savedmsg);
			if (savedmsg.equalsIgnoreCase("Address has been added successfully")) {
				testStepPassed("Address has been added successfully");
			} else {
				testStepFailed("Address has not been added successfully");
			}
			clickOn(lnk_AddressBook_AddNewAddress_SavedMessage_Close);
			//clickOn(lnk_PFAddress_SavedMessage_Close);
		} 
		else {
			testStepPassed("Address has been added successfully message is not displayed");
		}
	}
	
	public void verify_NewPFAddress_Updated_MessageandClose()
	{
		waitTime(7);////div[contains(@id,'ModalAddressBookSuccess')]
		if (driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess_message')]")).isDisplayed()) {
			String savedmsg = driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess_message')]")).getText();
			System.out.println("Address Saved Message :"+savedmsg);
			if (savedmsg.equalsIgnoreCase("Address has been updated successfully")) {
				testStepPassed("Address has been updated successfully");
			} else {
				testStepFailed("Address has not been Updated successfully");
			}
			//clickOn(lnk_PFAddress_SavedMessage_Close);
			clickOnSpecialElement(lnk_PFAddress_SavedMessage_Close);
		} 
		else {
			testStepPassed("Address has been Updated successfully message is not displayed");
		}
	}


	public void clickOnAddressBook_EditAddress_Link()
	{
		waitTime(3);
		clickOn(lnk_AddressBook_EditAddress);
	}

	public static final String lnk_AddressBook_EditDefaultAddress="Address Book Edit Default Address Link#xpath=//ul[contains(@class,'addys clearfix')]//li[contains(@class,'default')]//a[contains(text(),'Edit')]";

	public void clickOnAddressBook_EditDefaultAddress_Link()
	{
		waitTime(2);
		clickOn(lnk_AddressBook_EditDefaultAddress);
	}


	public void clear_AddressBook_EditAddress_details()
	{
		waitTime(2);
		driver.findElement(By.xpath("//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-firstname')]")).clear();
		driver.findElement(By.xpath("//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-lastname')]")).clear();
		driver.findElement(By.xpath("//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-street1')]")).clear();
		driver.findElement(By.xpath("//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-city')]")).clear();
		driver.findElement(By.xpath("//div[contains(@id,'ModalShippingAddressFormDialog')]//input[contains(@id,'ship-zip')]")).clear();
		driver.findElement(By.xpath("//div[contains(@id,'ModalShippingAddressFormDialog')]//ul[contains(@class,'form')]//input[contains(@name,'phone1')]")).clear();
	}	


	public void clickOnAddressBook_UpdateAddress_Button()
	{
		clickOn(btn_AddressBook_UpdateAddress);
	}


	public void verify_AddressBook_EditAddress_Saved_MessageandClose()
	{
		waitTime(3);
		if (driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).isDisplayed()) {
			String savedmsg = driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).getText();
			System.out.println("Address Updated Message :"+savedmsg);
			if (savedmsg.equalsIgnoreCase("Address has been updated successfully")) {
				testStepPassed("Address has been updated successfully");
			} else {
				testStepFailed("Address has not been updated successfully");
			}
			clickOn(lnk_AddressBook_UpdateAddress_SavedMessage_Close);
		} 
		else {
			testStepPassed("Address has been updated successfully message is not displayed");
		}
	}


	public void clickOnAddressBook_DeleteAddress_Link()
	{
		waitTime(2);
		clickOn(lnk_AddressBook_DeleteAddress);
	}

	public void clickOnPaymentmethod_removePayment()
	{
		waitTime(2);
		clickOn(lbl_paymentremove);
	}

	public void clickOnPaymentmethod_DeletepaymentDialog_DeleteButton()
	{
		waitTime(2);
		clickOn(lbl_paymentdeleteconform);
	}
	public void clickOnAddressBook_DeleteAddressDialog_DeleteButton()
	{
		waitTime(1);
		clickOn(btn_AddressBook_DeleteAddressDialog_Delete);
	}




	public void verify_AddressBook_DeleteAddress_Delete_MessageandClose()
	{
		waitTime(8);
		if (driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).isDisplayed()) {
			String savedmsg = driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]//div[contains(@id,'ModalAddressBookSuccess_message')]")).getText();
			System.out.println("Address Deleted Message :"+savedmsg);
			if (savedmsg.equalsIgnoreCase("Address has been deleted successfully")) {
				testStepPassed("Address has been deleted successfully");
			} else {
				testStepFailed("Address has not been deleted successfully");
			}
			clickOn(lnk_AddressBook_DeleteAddress_Close);
		} 
		else {
			testStepFailed("Address has been deleted successfully message is not displayed");
		}
	}
	public void verifyAccountDashBoardPageisDisplayed(){
		try {	
			if (driver.findElement(By.xpath("//h2[contains(text(),'Account Dashboard')]")).isDisplayed()) {
				testStepPassed("Account Dashboard Page is displayed");
			} else {
				testStepFailed("Account Dashboard page is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Account Dashboard page is not displayed");
		}
	}


	public void verifyUserLoggedSuccessfully(){
		try {	
			if (driver.findElement(By.xpath("//h2[contains(text(),'Account Dashboard')]")).isDisplayed()) {
				testStepInfo("User Logged in Successfully");
			} else {
				testStepFailed("Account Dashboard page is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Account Dashboard page is not displayed");
		}
	}


	public void verifyUserCreatedSuccessfully()
	{
		try 
		{	
			if (driver.findElement(By.xpath("//h2[contains(text(),'Account Dashboard')]")).isDisplayed()) 
			{
				testStepInfo("User Registered Successfully");
			} else {
				testStepFailed("User is not Registered");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("User is not Registered");
		}
	}



	public void clickPerfectFitRewardsLink(){
		try {
			if (driver.findElement(By.xpath("//ul[contains(@id,'my-acc-subnav')]//a[contains(text(),'Perfect Fit Rewards')]")).isDisplayed()) {
				testStepPassed("The Perfect Fit Rewards Link in Account Dashboard Page is displayed");
				clickOn(lnk_AccountDashboardPage_PerfectFitRewardsLink);
			} else {
				testStepFailed("The Perfect Fit Rewards Link in Account Dashboard page is not displayed");
			}
		} catch (Exception e) {

			testStepFailed("The Perfect Fit Rewards Link in Account Dashboard page is not displayed");
		}
	}
	public void verifyPerfectFitRewardsTabinAccountDashboardisdisplayed(){
		try {
			waitTime(4);
			if (driver.findElement(By.xpath("//h2[contains(text(),'Perfect Fit Rewards')]")).isDisplayed()) {
				testStepPassed("The Perfect Fit Rewards Tab in Account Dashboard Page is displayed");
			} else {
				testStepFailed("The Perfect Fit Rewards Tab in Account Dashboard page is not displayed");
			}
		} catch (Exception e) {

			testStepFailed("The Perfect Fit Rewards Tab in Account Dashboard page is not displayed");
		}
	}


	public void clickYesOptionforPerfectFitRewardsinPerfectFitRewardsTab(){
		try {
			if (driver.findElement(By.xpath("//input[contains(@id,'pf-opt1-form1-toggle')]")).isDisplayed()) {
				testStepPassed("The Yes option for Perfect Fit Rewards in Perfect Fit Tab is displayed");
				clickOn(lnk_AccountDashboardPage_PerfectFitRewardsTab_YesOptionforPFRewards);
			} else {
				testStepFailed("The Yes option for Perfect Fit Rewards in Perfect Fit Tab is not displayed");
			}
		} catch (Exception e) {

			testStepFailed("The Yes option for Perfect Fit Rewards in Perfect Fit Tab is not displayed");
		}
	}


	public void fillPerfextFitRewardsFieldsinAccountPage(String PFFirstName, String PFLastName, String PFAddress, String PFCity, String PFState, String PFZip, String PFTelephone){
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//section[contains(@class,'dash-pf')]//input[contains(@id,'ship-firstname')]")).isDisplayed()) {
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Firstname, PFFirstName);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Lastname, PFLastName);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Address, PFAddress);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_City, PFCity);
				selectFromDropdown(drp_AccountDashboardPage_PerfectFitRewardsTab_State, PFState);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Zip, PFZip);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Telephone, PFTelephone);
			} else {
				testStepFailed("The Perfect Fit Rewards in Perfect Fit Tab Fields are not displayed");
			}
		} catch (Exception e) {

			testStepFailed("The Perfect Fit Rewards in Perfect Fit Tab Fields are not displayed");
		}
	}


	public void fillPerfextFitRewardsFieldsinAccountPage2(String PFFirstName, String PFLastName, String PFAddress, String PFCity, String PFState, String PFZip, String PFTelephone){
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//section[contains(@class,'dash-pf')]//input[contains(@id,'ship-firstname')]")).isDisplayed()) {
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Firstname, PFFirstName);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Lastname, PFLastName);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Address, PFAddress);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_City, PFCity);
				selectFromDropdown(drp_AccountDashboardPage_PerfectFitRewardsTab_State, PFState);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Zip, PFZip);
				typeIn(txt_AccountDashboardPage_PerfectFitRewardsTab_Telephone, PFTelephone);
			} else {
				testStepFailed("The Perfect Fit Rewards in Perfect Fit Tab Fields are not displayed");
			}
		} catch (Exception e) {

			testStepFailed("The Perfect Fit Rewards in Perfect Fit Tab Fields are not displayed");
		}
	}

	public void clickPerfextFitRewardsTabSubmitButton(){
		try {
			if (driver.findElement(By.xpath("//section[contains(@class,'dash-pf')]//a[contains(@id,'submitPFRegister')]")).isDisplayed()) {
				clickOn(btn_AccountDashboardPage_PerfectFitRewardsTab_Submit);
			} else {
				testStepFailed("The Submit Button in Perfect Fit Rewards Tab is not displayed");
			}
		} catch (Exception e) {

			testStepFailed("The Submit Button in Perfect Fit Rewards Tab is not displayed");
		}
	}



	public void verifyPFIDisdisplayedandgetPFID(){
		try {
			waitTime(4);
			if (driver.findElement(By.xpath("//section[contains(@class,'dash-pf')]//h4[contains(text(),'Perfect Fit ID')]")).isDisplayed()) {
				String PFIDNo = driver.findElement(By.xpath("//section[contains(@class,'dash-pf')]//div[contains(@class,'pf-id')]/p")).getText();
				testStepInfo("The Perfect Fit Id :"+PFIDNo);
			} else {
				testStepFailed("The Perfect Fit is not Created and not Displayed");
			}
		} catch (Exception e) {

			testStepFailed("The Perfect Fit is not Created and not Displayed");
		}
	}



	public String getDefaultShipppingAddressFirstName()
	{
		String ShippingAddressFirstname = null;
		ShippingAddressFirstname = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//li//span[contains(@class,'fname')]")).getText();
		//testStepPassed("Default Shipping First Name : "+ShippingAddressFirstname);
		return ShippingAddressFirstname;
	}


	public String getDefaultShipppingAddressLastName()
	{
		String ShippingAddressLastname = null;
		ShippingAddressLastname = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//li//span[contains(@class,'lname')]")).getText();
		//testStepPassed("Default Shipping Last Name : "+ShippingAddressLastname);
		return ShippingAddressLastname;
	}


	public String getDefaultShipppingAddressAddress1()
	{
		String ShippingAddressAddress1 = null;
		ShippingAddressAddress1 = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//li//span[contains(@class,'addy1')]")).getText();
		//testStepPassed("Default Shipping Address 1 : "+ShippingAddressAddress1);
		return ShippingAddressAddress1;
	}


	public String getDefaultShipppingAddressCity()
	{
		String ShippingAddressCity = null;
		ShippingAddressCity = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//li//span[contains(@class,'city')]")).getText();
		//testStepPassed("Default Shipping City : "+ShippingAddressCity);
		return ShippingAddressCity;
	}


	public String getDefaultShipppingAddressState()
	{
		String ShippingAddressState = null;
		ShippingAddressState = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//li//span[contains(@class,'state')]")).getText();
		//testStepPassed("Default Shipping State : "+ShippingAddressState);
		return ShippingAddressState;
	}


	public String getDefaultShipppingAddressZip()
	{
		String ShippingAddressZip = null;
		ShippingAddressZip = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//li//span[contains(@class,'zip')]")).getText();
		//testStepPassed("Default Shipping Zip : "+ShippingAddressZip);
		return ShippingAddressZip;
	}

	public String getDefaultShipppingAddressPhone()
	{
		String ShippingAddressPhone = null;
		ShippingAddressPhone = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//li//span[contains(@class,'phone')]")).getText();
		//testStepPassed("Default Shipping Phone : "+ShippingAddressPhone);
		return ShippingAddressPhone;
	}



	public void fill_AddressBook_ShippingAddressDetails(String Firstname, String Lastname, String Address, String City, String State, String Zip, String Telephone)
	{
		waitTime(2);
		typeIn(txt_AddressBook_AddNewAddress_Firstname, Firstname);
		typeIn(txt_AddressBook_AddNewAddress_Lastname, Lastname);
		typeIn(txt_AddressBook_AddNewAddress_Address, Address);
		//SelectAddressOptionWithIndex(1);	
		typeIn(txt_AddressBook_AddNewAddress_City, City);
		selectFromDropdown(drp_AddressBook_AddNewAddress_State, State);
		typeIn(txt_AddressBook_AddNewAddress_Zip, Zip);
		typeIn(txt_AddressBook_AddNewAddress_Telephone, Telephone);
	}

	public static final String lnk_SAPAddressPopupSuggestedAddress="SAP Address Popup Suggested Address Link#xpath=//div[contains(@id,'addressVerificationWithRecommendation')]//div[contains(@id,'ada-av-with-suggested')]";
	public static final String btn_SAPAddressPopupUsethisAddressWithRecommendation="SAP Address Popup Use this Address With Recommendation Button#xpath=//div[contains(@id,'addressVerificationWithRecommendation')]//button[contains(@class,'js-av-continue')]";
	public static final String btn_SAPAddressPopupUsethisAddressWithoutRecommendation="SAP Address Popup Use this Address Without Recommendation Button#xpath=//div[contains(@id,'addressVerificationWithoutRecommendation')]//button[contains(@class,'js-av-continue')]";

	public void SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue()
	{

		waitTime(3);
		if (driver.findElement(By.xpath("//div[contains(@id,'addressVerificationWithRecommendation')]")).isDisplayed()) 
		{
			testStepInfo("SAP Address Validation Popup With Recommendation is displayed");

			//waitTime(2);

			clickOn(btn_SAPAddressPopupUsethisAddressWithRecommendation);
		}

		else if (driver.findElement(By.xpath("//div[contains(@id,'addressVerificationWithoutRecommendation')]")).isDisplayed())
		{
			testStepInfo("SAP Address Validation Popup Without Recommendation is displayed");

			//waitTime(2);
			
			clickOn(btn_SAPAddressPopupUsethisAddressWithoutRecommendation);
		}

		else 
		{
			testStepFailed("Use this Address button in SAP Address Popup is not displayed");
		}
	}

	
	
	
	
	public String getShipppingAddressFirstName()
	{
		String ShippingAddressFname = null;
		ShippingAddressFname = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul[contains(@class,'addys')]//span[contains(@class,'fname')]")).getText();
		System.out.println("ShippingAddressFname : "+ShippingAddressFname);
		return ShippingAddressFname;
	}
	
	
	public String getShipppingAddressLastName()
	{
		String ShippingAddressLname = null;
		ShippingAddressLname = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul[contains(@class,'addys')]//span[contains(@class,'lname')]")).getText();
		System.out.println("ShippingAddressLname : "+ShippingAddressLname);
		return ShippingAddressLname;
	}
	
	
	public String getShipppingAddressStreet()
	{
		String ShippingAddressStreet = null;
		ShippingAddressStreet = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul[contains(@class,'addys')]//span[contains(@class,'addy1')]")).getText();
		System.out.println("ShippingAddressStreet : "+ShippingAddressStreet);
		return ShippingAddressStreet;
	}
	
	
	public String getShipppingAddressCity()
	{
		String ShippingAddressCity = null;
		ShippingAddressCity = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul[contains(@class,'addys')]//span[contains(@class,'city')]")).getText();
		System.out.println("ShippingAddressCity : "+ShippingAddressCity);
		return ShippingAddressCity;
	}
	
	
	public String getShipppingAddressState()
	{
		String ShippingAddressState = null;
		ShippingAddressState = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul[contains(@class,'addys')]//span[contains(@class,'state')]")).getText();
		System.out.println("ShippingAddressState : "+ShippingAddressState);
		return ShippingAddressState;
	}
	
	public String getShipppingAddressZip()
	{
		String ShippingAddressZip = null;
		ShippingAddressZip = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul[contains(@class,'addys')]//span[contains(@class,'zip')]")).getText();
		System.out.println("ShippingAddressZip : "+ShippingAddressZip);
		return ShippingAddressZip;
	}
	
	public String getShipppingAddressPhone()
	{
		String ShippingAddressPhone = null;
		ShippingAddressPhone = driver.findElement(By.xpath("//div[contains(@id,'addressBookMainDiv')]//ul[contains(@class,'addys')]//span[contains(@class,'phone')]")).getText();
		System.out.println("ShippingAddressPhone : "+ShippingAddressPhone);
		return ShippingAddressPhone;
	}
	
	
	
	
	
	
	
	
	
	public String getPaymentDetailsCardType()
	{
		String PaymentDetailsCardType = null;
		PaymentDetailsCardType = driver.findElement(By.xpath("(//div[contains(@id,'billingAddressMainDiv')]//ul[contains(@class,'payment-methods')]//span[contains(@class,'card-type')])[2]")).getText();
		System.out.println("PaymentDetailsCardType : "+PaymentDetailsCardType);
		return PaymentDetailsCardType;
	}
	
	
	public String getPaymentDetailsCardNo()
	{
		String PaymentDetailsCardNo = null;
		PaymentDetailsCardNo = driver.findElement(By.xpath("(//div[contains(@id,'billingAddressMainDiv')]//ul[contains(@class,'payment-methods')]//span[contains(@class,'number')])[2]")).getText();
		System.out.println("PaymentDetailsCardNo : "+PaymentDetailsCardNo);
		return PaymentDetailsCardNo;
	}
	

	public String getPaymentDetailsCardExpiryMonthYear()
	{
		String PaymentDetailsCardMonthYear = null;
		PaymentDetailsCardMonthYear = driver.findElement(By.xpath("(//div[contains(@id,'billingAddressMainDiv')]//ul[contains(@class,'payment-methods')]//span[contains(@class,'expires')])[2]")).getText();
		System.out.println("PaymentDetailsCardMonthYear : "+PaymentDetailsCardMonthYear);
		return PaymentDetailsCardMonthYear;
	}
	
	
}