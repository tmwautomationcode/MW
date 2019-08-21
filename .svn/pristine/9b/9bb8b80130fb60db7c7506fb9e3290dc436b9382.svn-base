package mwPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import baseClass.BaseClass;
import baseClass.PopupWindows;




public class MyAccountPaymentMethodsPage extends PopupWindows
{
	public MyAccountPaymentMethodsPage(BaseClass obj) {
		
		super(obj);

	}

	public static final String btn_AddNewPaymentMethod = "Button: Add New Payment Method #xpath=//*[contains(@id,'billingAddress')]/a[contains(text(),'Add New Payment Method')]";
	public static final String lnk_EditBillingAddress = "Link: Edit billing Address #xpath=//span[contains(@class,'billing-edit')]//a[contains(text(),'edit')]";
	public static final String btn_Update = "Button: Update #xpath=//a[contains(@id,'BillingAddressFormSubmitBtnLabel') or contains(text(),'Update')]";
	public static final String btn_Cancel="cancel button #xpath=//a[contains(@id,'BillingAddressFormSubmitBtnLabel') or contains(text(),'Cancel')]";
	public static final String ele_DeletePaymentMethod = "Element: Delete #xpath=//a[contains(text(),'delete')]";
	public static final String ele_Deletepaymentmethod="delete paymentmethod #xpath=//div[contains(@id,'billingAddressMainDiv')]//span[contains(text(),'MASTER CARD')]/parent::li//a[contains(text(),'delete')]";
	public static final String drp_newCard_billing_card_type = "Dropdown: CardType #xpath=//form[contains(@id,'PaymentDetailsForm')]//select[contains(@name,'cardType')]";
	public static final String txt_newCard_billing_card_number ="card number#xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'cardNumber')]";
	public static final String drp_newCard_billing_expiry_month ="expire month #xpath=//form[contains(@id,'PaymentDetailsForm')]//select[contains(@name,'monthCardExp')]";
	public static final String drp_newCard_billing_expiry_year ="expire year #xpath=//form[contains(@id,'PaymentDetailsForm')]//select[contains(@name,'yearCardExp')]";
	public static final String txt_newCard_billing_firstName = "First Name #xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'firstName')]";
	public static final String txt_newCard_billing_lastName = "Last Name #xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'lastName')]";
	public static final String txt_newCard_billing_addressOne = "Address Line 1 #xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'address1')]";
	public static final String txt_newCard_billing_addressTwo = "Address Line 2 #xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'address2')]";
	public static final String txt_newCard_billing_addressThree = "Address Line 3 #xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'organizationName')]";
	public static final String txt_newCard_billing_city = "City #xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'city')]";
	public static final String drp_newCard_billing_state = "State #xpath=//form[contains(@id,'PaymentDetailsForm')]//select[contains(@name,'state')]";
	public static final String txt_newCard_billing_zipcode = "Zipcode #xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'zipCode')]";
	public static final String txt_newCard_billing_phone = "PhoneNumber #xpath=//form[contains(@id,'PaymentDetailsForm')]//input[contains(@name,'phone1')]";
	public static final String btn_newCard_billing_Save = "Button: Save #xpath=//form[contains(@id,'PaymentDetailsForm')]//*[contains(text(),'Save')]";
	public static final String txt_popupclosemessage="popup close message #xpath=//a[contains(@id,'ModalAddressBookSuccess-close')]";
	public static final String txt_optionaladdress="optional address #xpath=//form[contains(@id,'BillingAddressForm')]//input[contains(@id,'ship-street2')]";
	public void clickOnAddNewPaymentMethod(){
		clickOn(btn_AddNewPaymentMethod);
	}

	public void clickOnEditPaymentOption(){
		clickOn(lnk_EditBillingAddress);
	}

	public void clickOnDeletePayment(){
		//clickOn(ele_DeletePaymentMethod);
		clickOn(ele_Deletepaymentmethod);
	}
	public void clickOnCancelpayment()
	{
		clickOn(btn_Cancel);
		//alertOk();
	}

	public void fillNewPaymentOptionPopUpInBillingInformationPage(String cardType,String cardNumber, String cardExpMonth,String cardExpYear, String firstName,String lastName, String addressOne, String  addressTwo, String addressThree, String city,String state,String zipcode, String phone){
		selectFromDropdown(drp_newCard_billing_card_type, cardType);
		typeIn(txt_newCard_billing_card_number, cardNumber);
		selectFromDropdown(drp_newCard_billing_expiry_month, cardExpMonth);
		selectFromDropdown(drp_newCard_billing_expiry_year, cardExpYear);
		typeIn(txt_newCard_billing_firstName, firstName);
		typeIn(txt_newCard_billing_lastName, lastName);
		typeIn(txt_newCard_billing_addressOne, addressOne);
		typeIn(txt_newCard_billing_addressTwo, addressTwo);
		typeIn(txt_newCard_billing_addressThree, addressThree);
		typeIn(txt_newCard_billing_city, city);
		try
		{
			new Select(driver.findElement(By.xpath("//form[contains(@id,'PaymentDetailsForm')]//select[contains(@name,'state')]"))).selectByValue(state);
			testStepPassed("Select "+state+" from:state dropdown");
		}
		catch(Exception e)
		{
			testStepFailed(""+state+" Element not found 45 sec");
		}
		//selectFromDropdown(drp_newCard_billing_state, state);
		typeIn(txt_newCard_billing_zipcode, zipcode);
		typeIn(txt_newCard_billing_phone, phone);
		clickOn(btn_newCard_billing_Save);
	}
	public void clickOnpopupCloseMessage()
	{
		clickOn(txt_popupclosemessage);
	}

	/*public void editDefaultPaymentOptionPopUpInBillingInformationPage(String firstName, String lastName, String addressOne, String  addressTwo, String addressThree, String city,String state,String zipcode, String phone){
		if(!firstName.isEmpty()) typeIn(txt_newCard_billing_firstName, firstName);
		if(!lastName.isEmpty()) typeIn(txt_newCard_billing_lastName, lastName);
		if(!addressOne.isEmpty()) typeIn(txt_newCard_billing_addressOne, addressOne);
		if(!addressTwo.isEmpty()) typeIn(txt_newCard_billing_addressTwo, addressTwo);
		if(!addressThree.isEmpty()) typeIn(txt_newCard_billing_addressThree, addressThree);
		if(!city.isEmpty()) typeIn(txt_newCard_billing_city, city);
		if(!state.isEmpty()) try
		{
			new Select(driver.findElement(By.xpath("//form[contains(@id,'PaymentDetailsForm')]//select[contains(@name,'state')]"))).selectByValue("CA");
			testStepPassed("Select CA from:state dropdown");
		}
		catch(Exception e)
		{
			testStepFailed("CA Element not found 45 sec");
		}//selectFromDropdown(drp_newCard_billing_state, state);
		if(!zipcode.isEmpty()) typeIn(txt_newCard_billing_zipcode, zipcode);
		if(!phone.isEmpty()) typeIn(txt_newCard_billing_phone, phone);
		clickOn(btn_Update);*/

	public String editDefaultPaymentOptionPopUpInBillingInformationPage(String optionaladdress){
		typeIn(txt_optionaladdress, optionaladdress);
		clickOn(btn_Update);
		return optionaladdress;
	}
	
	public String getOptionalTextBoxValue(){
		return getAttributeValue(txt_optionaladdress, "value");
	}

	public boolean isPaymentDetailAvailableInMyAccountPaymentMethodsPage(){
		boolean paymentDetailFlag=true;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//a[contains(text(),'Add one now')]")).isDisplayed()) paymentDetailFlag=false;
		}catch(Exception e){
			
		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return paymentDetailFlag;
	}
	
	

	public void removeAllCardDetailsInMyAccountPaymentMethodsPage(){
		List<WebElement> cardDetails;
		try{
			if(driver.findElement(By.xpath("//a[contains(text(),'delete')]")).isDisplayed()){
				cardDetails =	driver.findElements(By.xpath("//a[contains(text(),'delete')]"));
				for(int i=cardDetails.size();i>0;i--){
					//clickOn("Remove card#xpath=//a[contains(text(),'delete')]");
					clickOn(ele_DeletePaymentMethod);
					waitTime(5);
					try{
						//alertOk();
						waitTime(10);
						driver.switchTo().alert().accept();
						
						
					}catch(Exception e){
						testStepFailed("Exception occured:" +e);
					}
					closeSuccessfullyBillingDetailsDetletedPopup();
				}
					/*Alert alt = driver.switchTo().alert();
					alt.accept();
					closeSuccessfullyBillingDetailsDetletedPopup();*/
					//waitForElementToDisplay(lnk_Cart,elementLoadWaitTime);
				}
			//}
			
		}catch(Exception e){
			testStepFailed("Failed while deleting existing card details: "+e);
		}
	}
}