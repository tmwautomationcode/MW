package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class InternationalCheckoutPage extends PopupWindows
{
	public InternationalCheckoutPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}



	public static final String txt_FirstName = "Text Box: First Name#xpath=//input[contains(@name,'given-name')]";
	public static final String txt_LastName = "Text Box: LastName#xpath=//input[contains(@name,'family-name')]";
	public static final String txt_AddressLine1 = "Text Box: Address Line 1#xpath=//input[contains(@name,'address-line1')]";
	public static final String txt_City = "Text Box: City#xpath=//input[contains(@name,'city')]";
	public static final String txt_PostalCode = "Text Box: Postal Code#xpath=//input[contains(@name,'postal-code')]";

	public static final String txt_PrimaryPhoneNumber = "Text Box: Primary Phone Number#xpath=//*[contains(@id,'shipping-primary-phone-group')]//input[contains(@name,'tel')]";
	public static final String txt_EmailAddress = "Text Box: Email Address#xpath=//section[@id='shippingAddress']//input[contains(@name,'email')]";
	public static final String chkBox_SameBillingAddress = "Check Box: Same Billing Address#xpath=//label[@id='sameBillingAddressLabel']//input";
	public static final String txt_CardNumber = "Card Number#xpath=//*[contains(@name,'cc-number')]";  
	public static final String lst_ExpirationMonth = "List Box: Expiration Month#xpath=//*[contains(@name,'cc-exp-month')]";
	public static final String lst_ExpirationYear = "List Box: Expiration Year#xpath=//*[contains(@name,'cc-exp-year')]";
	public static final String txt_SecurityCode = "Text Box: Security Code#xpath=//input[contains(@id,'cc-sec-num')]";//*[contains(@name,'cc-csc')]
	public static final String btn_SubmitOrder = "Button: Submit Order#xpath=//button[contains(@id,'submit-order-btn-left')]";
	public static final String txt_freeboder="text#xpath=//span[contains(text(),'BORDERFREE')]";
	public static final String btn_Continue = "Button: Continue#xpath=//button[contains(@id,'continue-btn-left')]";
	public static final String txt_ExpirationDate="text#xpath=//input[contains(@id,'cc-exp-date')]";


	public void internationalCheckOut(String firstName,String lastName, String addressLine1,String city,String postalCode,String primaryPhoneNumber,String eMailAddress,String cardNumber, String expiryMonth, String expiryYear,String securityCode,String CardExpiryDate){
		try
		{
		waitTime(5);
		driver.switchTo().frame("envoyId");
		typeIn(txt_FirstName,firstName); 
		//driver.findElement(By.id("shipping-first-name")).sendKeys("vikram");
		typeIn(txt_LastName,lastName); 
		typeIn(txt_AddressLine1,addressLine1);
		typeIn(txt_City,city);
		typeIn(txt_PostalCode,postalCode);
		typeIn(txt_PrimaryPhoneNumber,primaryPhoneNumber); 
		typeIn(txt_EmailAddress,eMailAddress);
		clickOn(btn_Continue);
		try
		{
		driver.switchTo().frame("cc-frame");
		typeIn(txt_CardNumber, cardNumber);	  
		//selectFromDropdown(lst_ExpirationMonth, expiryMonth);
		//selectFromDropdown(lst_ExpirationYear, expiryYear);
//		typeIn(txt_ExpirationDate, CardExpiryDate);
		driver.findElement(By.xpath("//input[contains(@id,'cc-exp-date')]")).sendKeys("0223");
		waitTime(2);
		driver.findElement(By.xpath("//input[contains(@id,'cc-sec-num')]")).sendKeys("123");
		//typeIn(txt_SecurityCode,securityCode);
		driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			testStepFailed("Exception Occured:" +e);
		}
		driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			testStepFailed("Exception Occured:" +e);
		}
	}
	/*public void internationalPaymentMethod(String cardNumber, String expiryMonth, String expiryYear,String securityCode)
	{
		try
		{
			driver.switchTo().frame("envoyId").switchTo().frame("cc-frame");
		typeIn(txt_CardNumber, cardNumber);	  
		selectFromDropdown(lst_ExpirationMonth, expiryMonth);
		selectFromDropdown(lst_ExpirationYear, expiryYear);
		typeIn(txt_SecurityCode,securityCode);
		driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			testStepFailed("Exception Occured:" +e);
		}
	}*/


	public void clickOnSumbitOrder(){
		if(orderPlacementFlag==true){
			clickOn(btn_SubmitOrder);
		}else{
			testStepPassed("Order is not placed due to execution is happening in production or test environment");
		}
	}

	public void verifyBorderFreePageDisplayed(){
		if(elementPresent(txt_freeboder))
			testStepPassed("BORDERFREE page is displayed");
		else
			testStepFailed("BORDERFREE page is not displayed");
	}
}
