package baseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupWindows extends HeaderLinks {

	public static final String lnk_feedbackpopup_Close="Feedback Close Link#xpath=//body[contains(@id,'mw')]//div[contains(@class,'exit')]//div[contains(@class,'inner')]//a[contains(@class,'x')]";
	public static final String drp_size_item="select the size button#xpath=//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']";
	public static final String btn_ContinueShopping ="Continue shoppiong #xpath=//button[contains(text(),'Continue Shopping')]";
	public static final String drp_select_size_editpopup="Edit cart select size dropdown#xpath=//section[@id='prod-info']//div[contains(@class,'size-select-mask')]";
	public static final String txt_quantity_editpopup="Edit Product Quantity Text#xpath=//section[@id='prod-info']//input[contains(@class,'edit-item-quantity')]";
	public static final String btn_update_editpopup="Click on Submit buton#xpath=//section[@id='prod-info']//a[contains(@id,'update')]";
	public static final String img_Country_Flag="Country Flag Image Link#xpath=//i[@id='borderfree-flag-img']";
	public static final String btn_ProceedasUS="Proceed as US Customer Button#xpath=//a[contains(text(),'Proceed as U.S. Customer')]";
	//	public static final String ele_CloseInternationalShippingPopup = "Close International Shipping Popup #xpath=//*[@id='context-chooser']//a[contains(@id,'context-chooser-close')]";
	public static final String ele_CloseInternationalShippingPopup = "Close International Shipping Popup #xpath=//*[contains(@id,'context-chooser-close')]";
	public static final String popup_MiniCart = "MiniCart Popup#xpath=//div[contains(@id,'mini-cart') and contains(@class,'open')]";
	public static final String btn_mini_cart_checkout="mini cart check out button#xpath=//div[contains(@id,'mini-cart') and contains(@class,'open')]//a[contains(@id,'mini-cart-blue-btn') and contains(text(),'Checkout')]";
	public static final String lbl_Order_Status = "Order Status #xpath=//h3[text()='Check Domestic Order Status']";
	public static final String btn_CheckStatus= "Check Status #xpath=//a[text()='Check Status']";
	public static final String btn_OrderStatus_close="Close - OrderStatus #xpath=//div[@id='order-status-modal']//a[text()='Close']";
	public static final String drp_qv_select_size="QV select size dropdown#xpath=//div[contains(@class,'size-dropdown')]";//div[contains(@class,'widget_quick_info_popup')]//div[contains(text(),'Select Regular Size')]
	public static final String btn_qv_add_to_cart="QV Add to cart button#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(@class,'pdp-actions-container')]//a[contains(@id,'add-to-cart') and contains(text(),'Add to Cart')]";
	public static final String btn_qv_add_to_shoppingbag="QV Add to Shopping Bag button#xpath=//section[contains(@id,'prod-info')]//button[contains(@id,'add-to-cart')]";
	public static final String QV_SeeMoreLink="QV See More Link#xpath=//a[contains(@class,'read-more-btn')]";

	public static final String btn_qv_add_to_save="QV Add to Save button#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(@class,'pdp-actions-container')]//span[ contains(text(),'Add to Saved')]/parent::a";
	public static final String txt_qv_quantity="QV quantity textbox#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(@class,'qv-wrap')]//input[contains(@name,'quantity')]";
	public static final String btn_qv_colour_swatch="QV colour swatch#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(@class,'color-swatches')]//a[contains(@class,'js-swatch-item')]";
	public static final String txt_EmailAddress = "Email Address TextBox #xpath=//input[contains(@id,'logonID')]";
	public static final String txt_Password = "Password TextBox #xpath=//input[contains(@id,'password')]"; 
	public static final String txt_EmailAddress1 = "Email Address TextBox #xpath=//input[@name='logonId']";
	public static final String txt_Password1 = "Password TextBox #xpath=//input[@name='logonPassword']";
	public static final String btn_SignIn = "Sign In Button #xpath=//*[contains(@id,'sign-in-submit')]";
	public static final String btn_CreateAccount = "Create Account Button #xpath=//div[contains(@id,'sign-in-modal')]//a[@id='create-new-account']";
	public static final String overlay_SignIn = "SignIn OverLay #xpath=//div[contains(@id,'sign-in-modal')]";
	public static final String ele_CloseSignInOverlay = "Close SignIn OverLay #xpath= //*[@id='sign-in-modal']/a[contains(text(),'Close')]";
	public static final String lbl_MyAccount = "My Account #xpath=//h1[text()='My Account']";
	public final static String popup_EmailServices = "Email Services Popup#xpath=//div[contains(@id,'email-share-modal')]";
	public final static String ele_GmailInEmailServicePoup = "Gmail Link#xpath=//a[contains(text(),'Gmail')]";
	public final static String ele_YahooInEmailServicePoup = "Yahoo Link#xpath=//a[contains(text(),'Yahoo')]";
	public final static String ele_AOLInEmailServicePoup = "AOL Link#xpath=//a[contains(text(),'AOL')]";
	public final static String ele_HotmailInEmailServicePoup = "Hotmail Link#xpath=//a[contains(text(),'Hotmail')]";
	public final static String lnk_MoreDetails = "More Details Link#xpath=//span[contains(text(),'More Details')]";
	public static final String txt_FirstName_NewShippingAddressPopupInCheckoutPage = "TextBox: FirstName #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'firstName')]";
	public static final String txt_LastName_NewShippingAddressPopupInCheckoutPage = "TextBox:LastName #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'lastName')]";
	public static final String txt_AddressOne_NewShippingAddressPopupInCheckoutPage = "TextBox: Address Line 1 #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'address1')]";
	public static final String txt_AddressTwo_NewShippingAddressPopupInCheckoutPage = "TextBox: Address Line 2 #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'address2')]";
	public static final String txt_AddressThree_NewShippingAddressPopupInCheckoutPage = "TextBox: Address Line 3 #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'organizationName')]";
	public static final String txt_Shipping_City_NewShippingAddressPopupInCheckoutPage = "TextBox: City #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'city')]";
	public static final String drp_Shipping_State_NewShippingAddressPopupInCheckoutPage = "DropDown: State #xpath=//form[contains(@id,'ShippingAddressForm')]//select[contains(@name,'state')]";
	public static final String txt_Shipping_Zipcode_NewShippingAddressPopupInCheckoutPage = "TextBox: ZipCode #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'zipCode')]";
	public static final String txt_Shipping_Phone1_NewShippingAddressPopupInCheckoutPage = "TextBox: Phone1 #xpath=//form[contains(@id,'ShippingAddressForm')]//input[@id='ship-tel']";
	public static final String btn_Save_NewShippingAddressPopupInCheckoutPage = "Save Button#xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//a[contains(text(),'Save')]";
	public static final String popup_SuccessfullyBillingDetailsDetleted = "Popup: Successfully Billing Details Detleted#xpath=//div[contains(@id,'ModalAddressBookSuccess_message')]";
	public static final String popup_SuccessfullyBillingDetailsDetleted_Close = "Close the Popup: Successfully Billing Details Detleted#xpath=//a[contains(@id,'ModalAddressBookSuccess-close')]";

	public static final String lnk_shoppingbag_withcount = "Shopping Bag with Count#xpath=.//a[@id='header-cart-with-count']/span[2]";
	public static final String txt_EmailAddress_guest = "Email Address TextBox #xpath=//div[@class='has-acct clearfix']//input[@name='logonId']";
	public static final String txt_password_guest = "Email Address TextBox #xpath=//div[@class='has-acct clearfix']//input[@name='logonPassword']";
	public static final String txt_signIn_guest = "Email Address TextBox #xpath=//div[@class='has-acct clearfix']//a[@class='sign-in blue-btn']";

	public static final String btn_ContinueShoppingClose ="Continue Shopping Close#xpath=//div[contains(@id,'tinycontent')]//a[contains(@id,'closeButton')]";

	public final static String lnk_ViewFullProductInformation = "View Full Product Information Link#xpath=//*[contains(@id,'prod-info')]//*[contains(text(),'View Full Product Information')]";
	public static final String btn_update_editpopup_New="Click on Submit button#xpath=//section[@id='prod-info']//a[contains(@id,'update')]";

	public PopupWindows(BaseClass obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}

	public void continueShopping(){
		try{
			waitTime(2);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).isDisplayed()){
				clickOn(btn_ContinueShopping);
			}
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
	}	

	public String selectSizeFromEditpopup(String size){
		clickOn(drp_select_size_editpopup);
		waitTime(2);
		List<WebElement> sizeOptions=driver.findElements(By.xpath("//div[contains(@class,'size-select')]//li[contains(@class,'size-item')]/a"));
		if(sizeOptions.size()>0){
			if(!size.isEmpty()){
				for(WebElement ele:sizeOptions){
					if(ele.getText().equalsIgnoreCase(size)){
						ele.click();
						testStepPassed("click on '"+size+"' size");
					}
				}
			}else{
				size=sizeOptions.get(0).getText();
				sizeOptions.get(0).click();
				testStepPassed("click on '"+size+"' size");
			}
		}else{
			testStepFailed("Size options are not listed");
		}
		return size;
	}

	public void clickOnUpdateFromEditpopup(){
		clickOn(btn_update_editpopup);
		waitTime(8);
	}

	public void typeQuantityFromEditpopup(String qty){
		typeIn(txt_quantity_editpopup,qty);
	}
	public void clickOnUpdateButtonFromEditPopup(){
		clickOnSpecialElement(btn_update_editpopup);
	}

	public void VerifyFeedbackPopupIsDisplayedandClosed(){
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@class,'feedback')]")).isDisplayed()) {
				testStepPassed("The Feedback Popup is displayed");
				clickOn(lnk_feedbackpopup_Close);
			}
		} catch (Exception e) {
			testStepPassed("The Feedback Popup is not displayed");
		}

	}


	public void clickOnInternationalShippingLink(){
		clickOn(img_Country_Flag);
	}

	public void verifyInternationalShippingPoup(){	
		verifyElement(btn_ProceedasUS);
		//		clickOn(ele_CloseInternationalShippingPopup);
	}

	public void proceedAsUSCustomer(){
		clickOn(img_Country_Flag);
		//waitTime(2);
		clickOn(btn_ProceedasUS);
	}




	public void verifyUSFlagSelected()
	{
		try {
			testStepInfo("");
			testStepInfo("Change the Customer to US Customer");
			testStepInfo("*********************************************");

			Actions action = new Actions(driver);
			action.sendKeys(Keys.PAGE_DOWN).perform();
			waitTime(2);
			/*moveToElement("//footer[@id='pg-footer']//a[contains(text(),'Terms of Use')]");
			waitTime(2);
			scrollbottomofPage();*/
			String countryName = driver.findElement(By.xpath("//i[@id='borderfree-flag-img']")).getAttribute("style");
			System.out.println(countryName);
			String countryNameEdited = countryName.substring(countryName.lastIndexOf("/")+1, countryName.lastIndexOf("."));
			System.out.println("Country edited : "+countryNameEdited);

			if (countryNameEdited.equalsIgnoreCase("US")) 
			{
				testStepPassed("Country Selected is US");
			}

			else 
			{
				proceedAsUSCustomer();
				waitTime(3);
				if (countryNameEdited.equalsIgnoreCase("US")) 
				{
					testStepPassed("Shitp to is Changed to US");
				}
			}
			/*	//waitTime(1);
			if(!countryName.substring(countryName.length() - 4, countryName.length() - 1).equalsIgnoreCase("US")){
				//waitTime(1);
				proceedAsUSCustomer();	
				//waitTime(1);
				String substr = countryName.substring(countryName.length() - 2);
				System.out.println("Value of substring : "+substr);
				//waitTime(1);
				if (substr.equalsIgnoreCase("US")) {
					testStepPassed("The Ship To is successfully changed to US Customer");
				} else {
					testStepFailed("The Ship To is not Changed to US");
				}
			}*/
		} catch (Exception e) {
			testStepFailed("Shipt To is not Changed to US");
		}
	}



	public void verifySafariUSFlagSelected(){

		testStepInfo("");
		testStepInfo("Change the Customer to US Customer");
		testStepInfo("***********************************************");

		waitTime(1);
		String countryName = driver.findElement(By.xpath("//i[@id='borderfree-flag-img']")).getAttribute("class");
		//waitTime(1);
		if(!countryName.substring(countryName.length() - 4, countryName.length() - 1).equalsIgnoreCase("US")){
			//waitTime(1);
			proceedAsUSCustomer();	
			waitTime(2);
			String substr = countryName.substring(countryName.length() - 2);
			System.out.println("Value of substring : "+substr);
			waitTime(3);
			if (substr.equalsIgnoreCase("US")) {
				testStepPassed("The Ship To is successfully changed to US Customer");
			} else {
				testStepFailed("The Ship To is not Changed to US");
			}
		}
	}



	public void closeInternationalShippingPoup(){
		clickOn(ele_CloseInternationalShippingPopup);
	}

	public boolean verifyMiniCartPopupIsDispalyed(){
		boolean flag = false;
		if(isElementDisplayed(popup_MiniCart)){
			testStepPassed("Mini Cart Popup Is Dispalyed");
			flag = true;
		}else{
			testStepFailed("Mini Cart Popup Is NOT Dispalyed");
		}
		return flag;
	}

	public void clickOnCheckOutBtnFromMiniCartPopup(){
		if(verifyMiniCartPopupIsDispalyed()){
			clickOn(btn_mini_cart_checkout);
		}else{
			testStepFailed("Mini Cart 'Checkout Button' cannot be clicked as Mini Cart Popup is not displayed");
		}
	}

	public void verifyOrderStatusPopUp()
	{
		waitTime(3);
		if(isElementDisplayed(lbl_Order_Status))
		{
			testStepPassed("Order Status is Displayed");			
		}
		else
		{
			testStepFailed("Order Status is not Displayed");
		}
		if(isElementDisplayed(btn_CheckStatus))
		{
			testStepPassed("Check Status is Displayed");			
		}
		else
		{
			testStepFailed("Check Status is not Displayed");
		}
		driver.manage().window().maximize();
		clickOn(btn_OrderStatus_close);
	}

	public String selectSizeFromQVPopup(String size){
		//waitTime(5);
		clickOnSpecialElement(drp_qv_select_size);
		waitTime(2);
		List<WebElement> sizeOptions=driver.findElements(By.xpath("//div[contains(@class,'widget_quick_info_popup')]//li[contains(@class,'size-item') and @class!='size-item out']/a"));
		if(sizeOptions.size()>0){
			if(!size.isEmpty())
			{

				for(WebElement ele:sizeOptions){
					if(ele.getText().equalsIgnoreCase(size)){
						ele.click();
						testStepPassed("click on '"+size+"' size");

					}


				}
			}else{
				for(WebElement ele:sizeOptions){
					ele.getText();
					if(ele.isDisplayed()){
						size=ele.getText();
						ele.click();
						testStepPassed("click on '"+size+"' size");
						break;
					}

				}
			}
		}else{
			testStepFailed("Size options are not listed");
		}
		return size;
	}

	public void clickOnAddToCartFromQVPopup(){
		clickOnSpecialElement(btn_qv_add_to_cart);
	}

	public void clickOnSaveBtnFromQVPopup(){
		clickOn(btn_qv_add_to_save);
	}
	public void typeQuantityInQVPopup(String quantity){
		waitTime(5);
		typeIn(txt_qv_quantity,quantity);
	}


	public void selectColourSwatchFromQVPopup(){
		clickOn(btn_qv_colour_swatch);
	}
	public void signIn(String Username, String Password){
		waitTime(2);
		typeIn(txt_EmailAddress,Username);
		typeIn(txt_Password,Password);
		clickOn(btn_SignIn);
		//waitForElementToDisplay(lbl_MyAccount,elementLoadWaitTime);
		//waitForElement(lnk_Header_Greeting);
	}

	public void userSignIn(String Username, String Password){

		try {
			if (driver.findElement(By.xpath("//input[contains(@id,'logonID')]")).isDisplayed()) {
				typeIn(txt_EmailAddress,Username);
				typeIn(txt_Password,Password);
				clickOn(btn_SignIn);
			}

		} catch (Exception e) {
			testStepFailed("The signIn Tab is not found");
		}

	}

	public void guestSignIn(String Username, String Password)
	{
		waitTime(1);
		typeIn(txt_EmailAddress_guest,Username);
		typeIn(txt_password_guest,Password);
		//clickOn(txt_signIn_guest);
		clickOnSpecialElement(txt_signIn_guest);
	}
	public void signInIfAvailable(String Username, String Password)
	{
		try
		{
			typeIn(txt_EmailAddress1,Username);
			typeIn(txt_Password1,Password);
			clickOn(btn_SignIn);
			//waitForElementToDisplay(lbl_MyAccount,elementLoadWaitTime);
			//waitForElement(lnk_Header_Greeting);
		}
		catch(Exception e)
		{

		}
	}

	public void clickOnCreateAccount(){
		clickOn(btn_CreateAccount);
	}


	public void SignInWithoutSignInLinkClicked(String Username, String Password){
		try {
			waitTime(1);
			signIn(Username,Password);
			waitTime(2);
			testStepPassed("Successfully Logged into the Application");
		} catch (Exception e) {
			testStepFailed("Failed to Login into the Application");
		}
	}


	public void signInToApp(String Username, String Password){

		try{
			//Scrolling the Page Up

			/*	Actions action = new Actions(driver);
			action.sendKeys(Keys.PAGE_UP).perform();*/
			testStepInfo("");
			testStepInfo("Logging into the Application");
			testStepInfo("**********************************");

			clickOn(lnk_Header_SignIn);
			waitTime(1);
			signIn(Username,Password);
			waitTime(2);
			testStepPassed("Successfully Logged into the Application");
		}catch(Exception e){
			testStepFailed("Failed to Login into the Application");
		}

	}





	public void verifySignInOverLay(){
		//if(isElementDisplayed(overlay_SignIn))
		waitTime(3);
		if(driver.findElement(By.xpath("//div[contains(@id,'sign-in-modal')]")).isDisplayed()){
			//waitTime(3);
			testStepPassed("SignIn Overlay is Displayed");			
		}else{
			testStepFailed("SignIn Overlay is not Displayed");
		}
	}

	public void closeSignInOverlay(){	
		clickOn(ele_CloseSignInOverlay);
	}

	public boolean isEmailServicePopupDisplayed(){
		boolean emailServicePopupDisplayedFalg=false;
		try{
			if(isElementDisplayed(popup_EmailServices))
				emailServicePopupDisplayedFalg = true;
		}catch(Exception e){}
		return emailServicePopupDisplayedFalg;
	}

	public void clickOnGmailInEmailServicePopup(){
		clickOn(ele_GmailInEmailServicePoup);
	}

	public void clickOnYahooInEmailServicePopup(){
		clickOn(ele_YahooInEmailServicePoup);
	}

	public void clickOnAOLInEmailServicePopup(){
		clickOn(ele_AOLInEmailServicePoup);
	}

	public void clickOnHotmailInEmailServicePopup(){
		clickOn(ele_HotmailInEmailServicePoup);
	}

	public void clickOnMoreDetailsInQuickView(){
		clickOn(lnk_MoreDetails);
	}

	public boolean verifyAddNewAddressPopuopIsDisplayed(){
		boolean flag =false;
		try{
			if(driver.findElement(By.xpath("//div[contains(@id,'ModalShippingAddressFormDialog')]")).isDisplayed())
				flag = true;
		}catch(Exception e){}		
		return flag;
	}

	public void fillAndSaveNewShippingAddressPopUpInCheckoutPage(String firstName,String lastName,String address,String city,String state,String zipCode,String phoneNo){
		typeIn(txt_FirstName_NewShippingAddressPopupInCheckoutPage, firstName);
		typeIn(txt_LastName_NewShippingAddressPopupInCheckoutPage, lastName);
		typeIn(txt_AddressOne_NewShippingAddressPopupInCheckoutPage, address);
		//typeIn(txt_AddressTwo_NewShippingAddressPopupInCheckoutPage, addressTwo);
		//typeIn(txt_AddressThree_NewShippingAddressPopupInCheckoutPage, addressThree);
		typeIn(txt_Shipping_City_NewShippingAddressPopupInCheckoutPage, city);
		//typeIn(drp_newAddress_shipping_state, state);
		try{
			new Select(driver.findElement(By.xpath("//form[contains(@id,'ShippingAddressForm')]//select[@id='ship-state']"))).selectByValue("CA");
			testStepPassed("Select "+state+" from state dropdown");
		}
		catch(Exception e){
			testStepFailed("Failed to select "+state+" from state dropdown");
		}
		typeIn(txt_Shipping_Zipcode_NewShippingAddressPopupInCheckoutPage, zipCode);
		typeIn(txt_Shipping_Phone1_NewShippingAddressPopupInCheckoutPage, phoneNo);
		clickOn(btn_Save_NewShippingAddressPopupInCheckoutPage);
	}



	public void closeSuccessfullyBillingDetailsDetletedPopup(){
		waitForElement(popup_SuccessfullyBillingDetailsDetleted);
		clickOn(popup_SuccessfullyBillingDetailsDetleted_Close);
	}


	public void clickOnAddToShoppingBagFromQVPopup(){
		clickOnSpecialElement(btn_qv_add_to_shoppingbag);
	}

	public String selectSizeFromPDPPage(String size){
		//waitTime(5);
		clickOnSpecialElement(drp_size_item);
		waitTime(2);
		List<WebElement> sizeOptions=driver.findElements(By.xpath("//div[contains(@class,'sizes-wrap')]//li[contains(@class,'size-item')]//a[contains(@href,'#')]"));
		if(sizeOptions.size()>0){
			if(!size.isEmpty())
			{
				for(WebElement ele:sizeOptions){
					if(ele.getText().equalsIgnoreCase(size)){
						ele.click();
						testStepPassed("click on '"+size+"' size");
					}
				}
			}else{
				for(WebElement ele:sizeOptions){
					ele.getText();
					if(ele.isDisplayed()){
						size=ele.getText();
						ele.click();
						testStepPassed("click on '"+size+"' size");
						break;
					}
				}
			}
		}else{
			testStepFailed("Size options are not listed");
		}
		return size;
	}
	public void continueShoppingPopupClose(){


		testStepInfo("");
		testStepInfo("Checking the Continue Shopping page is displayed. If displayed closing the popup");
		testStepInfo("*************************************************************************************************");
		try{	
			waitTime(1);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//div[contains(@id,'tinycontent')]//button[contains(text(),'Continue Shopping')]")).isDisplayed()){
				clickOn(btn_ContinueShoppingClose);
				testStepPassed("Continue Shopping Popup window is displayed and closed");
			}
		}catch(Exception e){
			testStepPassed("Continue Shopping Popup window is not displayed");
		}
	}

	public static final String lnk_QVPopupClose = "QuickViewPopupClose Link#xpath=//div[contains(@id,'quickInfoPopup')]//a[contains(@id,'WC_QuickInfo_Link_close')]";
	public void clickOnViewFullProductInformation(){
		waitTime(2);
		//mouseOver(lnk_QVPopupClose);
		clickOn(QV_SeeMoreLink);
		//clickOn(lnk_ViewFullProductInformation);
	}
	public void clickOnUpdateFromEditPopup_New(){
		clickOn(btn_update_editpopup_New);
		waitForLoadingAndDissappearMWLoadingImg_New();
	}
	public void waitForSignInPopupToDisappear(){
		WebDriverWait wait=new WebDriverWait(driver,implicitlyWaitTime);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@id,'sign-in-submit')]")));
	}

	public void URLNavigateBack(){
		driver.navigate().back();
	}


	//public static final String txt_ropisOrderConfirm = "ROPIS order cconfirm#xpath=//h2[contains(text(), 'Thank you for your reservation')]";

	public static final String txt_ropisOrderConfirm = "ROPIS order cconfirm#xpath=//div//h2[contains(text(),'thanks, your reservation is confirmed!')]";

	public static final String txt_ropisOrderConfirm1 = "ROPIS order cconfirm#xpath=//h2[contains(text(),'Thank you for your reservation')]";

	public boolean verifyROPISOrderConfirmation() {
		boolean flag = false;
		try {
			waitForElement(txt_ropisOrderConfirm);	

			if(isElementDisplayed(txt_ropisOrderConfirm)||isElementDisplayed(txt_ropisOrderConfirm1))
			{
				testStepPassed("ROPIS Order is Confirmed");
				flag = true;
			}
			else {
				testStepFailed("ROPIS Order is not placed");
				flag = false;
			}
		}
		catch(Exception e) {
			flag = false;
		}
		return flag;

	}

	public static final String drp_StoreURL = "Store URL dropdown #xpath=//div[contains(@modulename, 'cmc/foundation/StorePreviewDialog')]//div[contains(@modulename, 'cmc/foundation/InputTextValueSelector')]//following-sibling::div[contains(@style, '/drop_down_list.png')]";
	public static final String btn_Options = "Options button #xpath=//div[contains(@modulename, 'cmc/foundation/StorePreviewDialog')]//div[text()='Options']";
	public static final String radio_specificdate = "Specific date and time radio button #xpath=//div[text()='Specify date and time']";
	public static final String txt_YearMonthDate = "Enter Year Month Date #xpath=//div[text()='Specify date and time']//following::div[contains(@modulename, 'cmc/foundation/DatePicker')]//input[@type='text']";
	public static final String txt_Time = "Enter Time #xpath=//div[text()='Specify date and time']//following::div[contains(@modulename, 'cmc/foundation/TimePicker')]//input[@type='text']";
	public static final String btn_LaunchStorePreview = "Launch store preview button #xpath=//div[text()='Launch Store Preview']";

	public void selectStore(String storename) {
		waitForElement(drp_StoreURL);
		clickOn(drp_StoreURL);
		waitTime(1);
		driver.findElement(By.xpath("//div[contains(@modulename, 'cmc/foundation/LongListItem')]//div[contains(text(), '"+ storename +"')]")).click();

	}


	public void selectDate(String year, String time) {
		waitForElement(btn_Options);
		clickOn(btn_Options);
		clickOnSpecialElement(radio_specificdate);
		clearEditBox(txt_YearMonthDate);
		typeIn(txt_YearMonthDate, year);
		clearEditBox(txt_Time);
		typeIn(txt_Time, time);
		clickOn(btn_LaunchStorePreview);

	}



	public void selectUSFlag()
	{
		try 
		{
			testStepInfo("");
			testStepInfo("Change the Customer to US Customer");
			testStepInfo("*********************************************");

			waitTime(2);
			scrollbottomofPage();
			waitTime(2);
			scrollbottomofPage();
			String countryName = driver.findElement(By.xpath("//i[@id='borderfree-flag-img']")).getAttribute("style");
			System.out.println(countryName);
			String countryNameEdited = countryName.substring(countryName.lastIndexOf("/")+1, countryName.lastIndexOf("."));
			System.out.println("Country edited : "+countryNameEdited);
			proceedAsUSCustomer();
			waitTime(3);
			if (countryNameEdited.equalsIgnoreCase("US")) 
			{
				testStepPassed("Shitp to is Changed to US");
			}
			else 
			{
				testStepFailed("Shipt To is not Changed to US");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Shipt To is not Changed to US");
		}
	}





}