package mwPages;

import org.openqa.selenium.By;


import baseClass.BaseClass;
import baseClass.PopupWindows;

public class PayPalPage  extends PopupWindows{

	public PayPalPage(BaseClass obj){
		
		super(obj);
	}

	String payPalPageTitle = "paypal";
	public static final String txt_PayPalEmail="Paypal Email#xpath=//input[contains(@name,'login_email')]";
	public static final String txt_PayPalPassword="Paypal Password#xpath=//input[contains(@name,'login_password')]";
	public static final String btn_PayPayLogin="Paypal login button#xpath=//*[contains(@id,'submitLogin') or contains(@id,'btnLogin')]";
	public static final String btn_PayPalShippingContinue="paypal shipping Continue button#xpath=//*[@id='confirmButtonTop']";
	public static final String btn_PayPalPlaceOrder="paypal place oreder button#xpath=//*[@id='placeOrderBtn' or text()='Place Order']";
	public static final String lnk_CancelAndReturn="cancel and return menswearlogo #xpath=//input[contains(@id,'cancel_return')]";

	public boolean verifyPayPalPage(){
		boolean flag = false;
		waitTime(2);
		try{
			if(driver.getTitle().toLowerCase().contains("PayPal Checkout - Log in")){ 
				testStepPassed("PayPal Page is displayed");
				flag = true;
			}
		}catch(Exception e){
			testStepFailed("PayPal Page is not displayed!!!");
		}
		return flag;	
	}
	public static final String btn_PaypalLoginButton ="Pay pal login button#xpath=//div[@id='loginSection']//a[contains(text(), 'Log In')]";
	public static final String btn_Next="Next button#xpath=//button[@id='btnNext']";
	public void fillSignInPayPalCheckOutPage(String paypalUserName,String paypalPassword){
		try{
			//clickOn(btn_PaypalLoginButton);
			//driver.switchTo().frame("injectedUl");
			if((!paypalUserName.isEmpty())&&(!paypalPassword.isEmpty())){
				typeIn(txt_PayPalEmail,paypalUserName);
				clickOn(btn_Next);
				typeIn(txt_PayPalPassword,paypalPassword);
				clickOn(btn_PayPayLogin);
				driver.switchTo().defaultContent();

			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	public void payPalShippingContinue(){
		try{
			waitTime(2);
		    clickOn(btn_PayPalShippingContinue);
		//driver.switchTo().defaultContent();
		
	}catch(Exception e){
		testStepFailed(e.toString());
	}
	}

	public void clickOnCancelAndToReturnMenswearHouseLogo(){
		clickOn(lnk_CancelAndReturn);
	}

	public void payPalPlaceOrder(){
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//*[@id='placeOrderBtn' or text()='Place Order']")).isDisplayed()) {
				clickOn(btn_PayPalPlaceOrder);
			}
		} catch (Exception e) {
			testStepFailed("PlaceOrder button is not found");
		}
		
	}

}
