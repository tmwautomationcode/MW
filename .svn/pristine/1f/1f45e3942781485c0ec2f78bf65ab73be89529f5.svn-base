package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class EGiftCardPage extends PopupWindows
{
	public EGiftCardPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}

	public static final String txt_E_GiftCard_RecipentName="Text box in E Gift Card Page #xpath=//form[@id='egiftForm']//input[@id='recipientName']";
	public static final String txt_E_GiftCard_SenderName="Text box in E Gift Card Page #xpath=//form[@id='egiftForm']//input[@id='senderName']";
	public static final String txt_E_GiftCard_RecipentEmail="Text box in E Gift Card Page #xpath=//form[@id='egiftForm']//input[@id='recipientEmail']";
	public static final String txt_E_GiftCard_ConformationEmail="Text box in E Gift Card Page #xpath=//form[@id='egiftForm']//input[@id='recipientEmail2']";
	public static final String lbl_E_GiftCard_DesignSelect_One="select One Card #xpath=//form[@id='egiftForm']//*[@id='Everyday Card']/img";
	public static final String drp_E_GiftCard_GiftCardAmount="the amount #xpath=//form[@id='egiftForm']//select[@id='cardAmount']";
	public static final String txt_E_GiftCard_Message="the message #xpath=//form[@id='egiftForm']//textarea[@name='giftMessage']";
	public static final String btn_E_GiftCard_AddToCart="the add to cart button#xpath=//form[@id='egiftForm']//input[@id='gc-submit-add-to-cart']";



	public void fillEGiftCardDetails(String recptName,String senderName,String recipentMail,String conformationMail,String GiftCardAmount,String GiftMessage )
	{

		typeIn(txt_E_GiftCard_RecipentName,recptName);
		typeIn(txt_E_GiftCard_SenderName,senderName );
		typeIn(txt_E_GiftCard_RecipentEmail,recipentMail );
		typeIn(txt_E_GiftCard_ConformationEmail,conformationMail );
		clickOn(lbl_E_GiftCard_DesignSelect_One);
		selectFromDropdown(drp_E_GiftCard_GiftCardAmount,GiftCardAmount);
		typeIn(txt_E_GiftCard_Message,GiftMessage);

	}
	
	public void clickOnAddToCartForEGiftCard()
	{
		clickOn(btn_E_GiftCard_AddToCart);
		waitForLoadingAndDissappearMWLoadingImg();
		waitForCheckoutPopupToAppearAndDisappear();
	}

	public void verifyErrorInEGiftCardPage(){
		if(driver.findElement(By.xpath("//*[contains(@class,'formErrorNotice')]/div[contains(text(),'unable to accept an order containing both an eGift card')]")).isDisplayed())
			testStepPassed("\"Error: unable to accept an order containing both an eGift card and merchandise\" is displayed");
		else
			testStepFailed("\"Error: unable to accept an order containing both an eGift card and merchandise\" is NOT displayed");
	}

}
