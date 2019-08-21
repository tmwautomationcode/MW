package mwPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class MyAccountAddressBookPage extends PopupWindows
{
	public MyAccountAddressBookPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
	}

	public static final String btn_AddNewAddress = "Button: Add New Address #xpath= //a[contains(text(),'Add New Address')]";

	public static final String txt_newAddress_shipping_firstName = "TextBox: FirstName #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'firstName')]";
	public static final String txt_newAddress_shipping_lastName = "TextBox:LastName #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'lastName')]";
	public static final String txt_newAddress_shipping_addressOne = "TextBox: Address Line 1 #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'address1')]";
	public static final String txt_newAddress_shipping_addressTwo = "TextBox: Address Line 2 #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'address2')]";
	public static final String txt_newAddress_shipping_addressThree = "TextBox: Address Line 3 #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'organizationName')]";
	public static final String txt_newAddress_shipping_city = "TextBox: City #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'city')]";
	public static final String drp_newAddress_shipping_state = "DropDown: State #xpath=//form[contains(@id,'ShippingAddressForm')]//select[contains(@name,'state')]";
	public static final String txt_newAddress_shipping_zipcode = "TextBox: ZipCode #xpath=//form[contains(@id,'ShippingAddressForm')]//input[contains(@name,'zipCode')]";
	public static final String txt_newAddress_shipping_phone1 = "TextBox: Phone1 #xpath=//form[contains(@id,'ShippingAddressForm')]//input[@id='ship-tel']";
	public static final String btn_newAddress_shipping_Submit = "Button: Submit #xpath=//div[contains(@id,'ModalShippingAddressFormDialog')]//a[contains(text(),'Submit')]";
	public static final String ele_ShippingAddress = " Shipping Address #xpath=//h3[contains(text(),'Shipping Addresses')]/parent::header/parent::section//li";
	public static final String lnk_editaddress="Edit address #xpath=//a[contains(@class,'edit')]";
	//	public static final String lnk_editaddress="edit adress #xpath=//li[contains(@class,'even')]//a[contains(text(),'Edit')]";
	public static final String lnk_Updated="updated address #xpath=//div[contains(@class,'actions clearfix')]//a[contains(text(),'Update')]";
	public static final String txt_popupclosemessage="popup close message #xpath=//a[contains(@id,'ModalAddressBookSuccess-close')]";
	public static final String btn_deleteaddress="delete address #xpath=//*[@id='ModalDeleteShippingAddressFormDialog']//a[contains(text(),'Delete')]";

	public void clickOnAddNewAddressLinkInAddressBookPage(){
		clickOn(btn_AddNewAddress);
	}
	public void clickOnEditAddressLinkInAddressBookPage()
	{
		clickOn(lnk_editaddress);
	}
	public void fillEditAddressDetail(String updatedadressTwo)
	{
		typeIn(txt_newAddress_shipping_addressTwo,updatedadressTwo);
	}
	public void clickOnUpdate()
	{
		clickOn(lnk_Updated);
	}

	public void fillNewShippingAddressOptionPopUpInAddressBookPage(String firstName, String lastName, String addressOne, String  addressTwo, String addressThree, String city,String state,String zipcode, String dayPhone,boolean defaultpayementFlag){
		typeIn(txt_newAddress_shipping_firstName, firstName);
		typeIn(txt_newAddress_shipping_lastName, lastName);
		typeIn(txt_newAddress_shipping_addressOne, addressOne);
		typeIn(txt_newAddress_shipping_addressTwo, addressTwo);
		typeIn(txt_newAddress_shipping_addressThree, addressThree);
		typeIn(txt_newAddress_shipping_city, city);
		//typeIn(drp_newAddress_shipping_state, state);
		try
		{
			new Select(driver.findElement(By.xpath("//select[@id='ship-state']"))).selectByValue("CA");
			testStepPassed("Select CA from:state dropdown");
		}
		catch(Exception e)
		{
			testStepFailed("CA Element not found 45 sec");
		}
		typeIn(txt_newAddress_shipping_zipcode, zipcode);
		typeIn(txt_newAddress_shipping_phone1, dayPhone);
	}

	public void clickOnSaveBtnInNewShippingAddressPopup(){
		clickOn(btn_newAddress_shipping_Submit);
		
	}

	public boolean isAddressDetailAvailableInMyAccountPaymentMethodsPage(){
		boolean addressDetailFlag=false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//h3[contains(text(),'Shipping Addresses')]/parent::header/parent::section//li")).isDisplayed()) addressDetailFlag=true;
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return addressDetailFlag;
	}
	public void closeAddressAddedSuccessMessagePopupIfDisplayed(){
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//div[contains(@id,'ModalAddressBookSuccess')]/a")).isDisplayed()){
				clickOn("Address added successopup close button#xpath=//div[contains(@id,'ModalAddressBookSuccess')]/a");
			}
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
	}

	public void removeAllAddressInAddressBookPage()
	{
		List<WebElement>deleteButton=driver.findElements(By.xpath("//*[@id='acct-right']//a[contains(text(),'Delete')]"));
		if(deleteButton.size()>0){
			for(int i=0;i<deleteButton.size();i++){
				clickOn("delete button#xpath=//*[@id='acct-right']//a[contains(text(),'Delete')]");
				clickOn(btn_deleteaddress);
				waitTime(6);
				clickOn(txt_popupclosemessage);
			}
		}
	}

	
}
