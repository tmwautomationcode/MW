package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class ClassicGiftCardPage extends PopupWindows
{
	public ClassicGiftCardPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}

	public static final String txt_ClassicGiftCard_RecipentName="Text box in E Gift Card Page #xpath=//form[@id='pgiftForm']//input[@id='recipientName']";
	public static final String txt_ClassicGiftCard_SenderName="Text box in E Gift Card Page #xpath=//form[@id='pgiftForm']//input[@id='senderName']";
	public static final String lbl_ClassicGiftCard_DesignSelect_One="select One Card #xpath=//form[@id='pgiftForm']//*[@id='Everyday Card']/img";
	public static final String drp_ClassicGiftCard_GiftCardAmount="the amount #xpath=//form[@id='pgiftForm']//select[@id='cardAmount']";
	public static final String txt_ClassicGiftCard_Message="the message #xpath=//form[@id='pgiftForm']//textarea[@name='giftMessage']";
	public static final String btn_ClassicGiftCard_AddToCart="the add to cart button#xpath=//form[@id='pgiftForm']//input[@id='gc-submit-add-to-cart']";
	public static final String btn_ClassicGiftCardAddToCart="Physical Gift Card Add To Cart #xpath=//*[@id='gc-submit-add-to-cart']";

	
	public void FillClassicGiftCardDetails(String recptName,String senderName,String GiftCardAmount,String GiftMessage)
	{


		typeIn(txt_ClassicGiftCard_RecipentName,recptName);
		typeIn(txt_ClassicGiftCard_SenderName,senderName );
		clickOn(lbl_ClassicGiftCard_DesignSelect_One);
		selectFromDropdown(drp_ClassicGiftCard_GiftCardAmount,GiftCardAmount);
		typeIn(txt_ClassicGiftCard_Message,GiftMessage);

	}
	public void clickOnAddToCartForClassicGiftCard()
	{
		clickOn(btn_ClassicGiftCard_AddToCart);
	}

	public void clickOnAddToCartFromClassicGiftCardPage(){
		clickOn(btn_ClassicGiftCardAddToCart);
	}
}
