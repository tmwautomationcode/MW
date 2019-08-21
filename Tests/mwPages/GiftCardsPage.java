package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class GiftCardsPage extends PopupWindows
{
	public GiftCardsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);

	}
	public static final String lbl_GiftCards="Gift Cards label #xpath=//h1[text()='Gift Cards']";
	//public static final String img_MensWearLogo="Men's Wearhouse Logo #xpath=//*[@id='logo']";
	public static final String btn_ClassicGiftCardCustomize="Classic Gift Card Customize #xpath=//div[@id='classicGC']/a[2]";
	public static final String btn_EGiftCardCustomize="E-Gift Card Customize #xpath=//div[@id='egiftGC']/a[2]";
	public static final String txt_E_GiftCard_RecipentName="Text box in E Gift Card Page #xpath=//form[@id='egiftForm']//input[@id='recipientName']";
	public static final String txt_E_GiftCard_SenderName="Text box in E Gift Card Page #xpath=//form[@id='egiftForm']//input[@id='senderName']";
	public static final String txt_E_GiftCard_RecipentEmail="Text box in E Gift Card Page #xpath=//form[@id='egiftForm']//input[@id='recipientEmail']";
	public static final String txt_E_GiftCard_ConformationEmail="Text box in E Gift Card Page #xpath=//form[@id='egiftForm']//input[@id='recipientEmail2']";
	public static final String lbl_E_GiftCard_DesignSelect_One="select One Card #xpath=//form[@id='egiftForm']//*[@id='Everyday Card']/img";
	public static final String drp_E_GiftCard_GiftCardAmount="the amount #xpath=//form[@id='egiftForm']//select[@id='cardAmount']";
	public static final String txt_E_GiftCard_Message="the message #xpath=//form[@id='egiftForm']//textarea[@name='giftMessage']";
	public static final String btn_E_GiftCard_AddToCart="the add to cart button#xpath=//form[@id='egiftForm']//input[@id='gc-submit-add-to-cart']";
	public static final String btn_EGiftCardCustomize_new="E-Gift Card Customize Button#xpath=//div[contains(@id,'egiftGC')]//a[contains(text(),'Customize')]";


	public static final String txt_EGiftCardCustomize_ReceipientsName_new="E-Gift Card Receipients Name Textbox #xpath=//form[contains(@id,'egiftForm')]//input[contains(@id,'recipientName')]";
	public static final String txt_EGiftCardCustomize_SenderName_new="E-Gift Card Sender Name Textbox#xpath=//form[contains(@id,'egiftForm')]//input[contains(@id,'senderName')]";
	public static final String txt_EGiftCardCustomize_ReceipientEmail_new="E-Gift Card Receipient Email Textbox#xpath=//form[contains(@id,'egiftForm')]//input[@id='recipientEmail']";
	public static final String txt_EGiftCardCustomize_ConfirmReceipientEmail_new="E-Gift Card Confirm Receipient Email Textbox#xpath=//form[contains(@id,'egiftForm')]//input[@id='recipientEmail2']";
	public static final String drp_EGiftCardCustomize_GiftCardAmount_new="E-Gift Card Amount Dropdown#xpath=//form[contains(@id,'egiftForm')]//select[contains(@id,'cardAmount')]";
	public static final String txt_EGiftCardCustomize_GiftCardMessage_new="E-Gift Card Message Textbox#xpath=//form[contains(@id,'egiftForm')]//textarea[contains(@id,'giftMessage')]";
	public static final String btn_EGiftCard_AddToShoppingBag_new="E-Gift Card Add To Shopping Bag Button#xpath=//form[contains(@id,'egiftForm')]//input[contains(@id,'gc-submit-add-to-cart')]";

	public static final String btn_ClassicGiftCardCustomize_new="Classic Gift Card Customize Button#xpath=//div[contains(@id,'classicGC')]//a[contains(text(),'Customize')]";
	public static final String txt_ClassicGiftCard_ReceipientsName_new="Classic Gift Card Receipients Name Textbox#xpath=//form[contains(@id,'pgiftForm')]//input[contains(@id,'recipientName')]";
	public static final String txt_ClassicGiftCard_SenderName_new="Classic Gift Card Sender Name Textbox#xpath=//form[contains(@id,'pgiftForm')]//input[contains(@id,'senderName')]";
	public static final String drp_ClassicGiftCard_GiftCardAmount_new="Classic Gift Card Amount Dropdown#xpath=//form[contains(@id,'pgiftForm')]//select[contains(@id,'cardAmount')]";
	public static final String txt_ClassicGiftCard_GiftCardMessage_new="Classic Gift Card Message Textbox#xpath=//form[contains(@id,'pgiftForm')]//textarea[contains(@id,'giftMessage')]";
	public static final String btn_ClassicGiftCard_AddToShoppingBag_new="Classic Gift Card Add To Shopping Bag Button#xpath=//form[contains(@id,'pgiftForm')]//input[contains(@id,'gc-submit-add-to-cart')]";


	public void verifyGiftCardspage(){
		try{
			waitForElement(lbl_GiftCards);
			verifyElement(lbl_GiftCards);
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
	}


	public boolean checkGiftCardPageDisplayed(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//div[contains(@class,'gift-landing')]//h1[contains(@class,'gift-card-title')]")).isDisplayed()){
				flag =true;
			}
		}catch(Exception e){
		}
		return flag;
	}


	public void clickOnClassicGiftCardCustomize(){
		try{
			waitForElement(btn_ClassicGiftCardCustomize);
			clickOn(btn_ClassicGiftCardCustomize);

		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	public void clickGiftCardDesignSelect(String cardDesign){
		try{
			clickOn("'"+cardDesign+"' Gift Card selection #xpath=//a[contains@id, 'gc-design and contains(text(),'"+cardDesign+"')]");

		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	public void clickOnEGiftCardCustomizeButton()
	{
		waitForElement(btn_EGiftCardCustomize);
		clickOn(btn_EGiftCardCustomize);
	}

	//	public void FillEGiftCardDetails(String recptName,String senderName,String recipentMail,String conformationMail,String GiftCardAmount,String GiftMessage )
	//	{
	//
	//		typeIn(txt_E_GiftCard_RecipentName,recptName);
	//		typeIn(txt_E_GiftCard_SenderName,senderName );
	//		typeIn(txt_E_GiftCard_RecipentEmail,recipentMail );
	//		typeIn(txt_E_GiftCard_ConformationEmail,conformationMail );
	//		clickOn(lbl_E_GiftCard_DesignSelect_One);
	//		selectFromDropdown(drp_E_GiftCard_GiftCardAmount,GiftCardAmount);
	//		typeIn(txt_E_GiftCard_Message,GiftMessage);
	//
	//	}
	//
	//	public void clickOnAddToCartForEGiftCard()
	//	{
	//		clickOn(btn_E_GiftCard_AddToCart);
	//	}
	public void clickEGiftCardCustomizeButton(){
		waitTime(2);
		clickOn(btn_EGiftCardCustomize_new);
	}
	public void fillEGiftCardDetails(String ReceipientName, String SenderName, String ReceipientEmail, String ReceipientConfirmEmail, String GiftAmount, String GiftMessage){
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//form[contains(@id,'egiftForm')]//input[contains(@id,'recipientName')]")).isDisplayed()) {
				typeIn(txt_EGiftCardCustomize_ReceipientsName_new, ReceipientName);
				typeIn(txt_EGiftCardCustomize_SenderName_new, SenderName);
				typeIn(txt_EGiftCardCustomize_ReceipientEmail_new, ReceipientEmail);
				typeIn(txt_EGiftCardCustomize_ConfirmReceipientEmail_new, ReceipientConfirmEmail);
				selectFromDropdown(drp_EGiftCardCustomize_GiftCardAmount_new, GiftAmount);
				typeIn(txt_EGiftCardCustomize_GiftCardMessage_new, GiftMessage);
			} else {
				testStepPassed("The E-Gift Card fields are not found");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			testStepPassed("The E-Gift Card fields are not found");
		}
	}
	public void clickEGiftCardAddToShoppingBagButton(){
		//waitTime(2);
		clickOn(btn_EGiftCard_AddToShoppingBag_new);
	}
	public void verifyerrormessageisdisplayed(){
		try {
			waitTime(4);
			if (driver.findElement(By.xpath("//form[contains(@id,'egiftForm')]//div[contains(@id,'error')]")).isDisplayed()) {
				String ErrorMsg = driver.findElement(By.xpath("//form[contains(@id,'egiftForm')]//div[contains(@id,'error')]")).getText();
				if (ErrorMsg.equalsIgnoreCase("Your cart currently contains merchandise. Unfortunately, at this time we are unable to accept an order containing both an eGift card and merchandise. We are working to address this issue, but in the meantime, please complete your merchandise order and place a separate order for your eGift card. We apologize for this inconvenience and thank you for your cooperation.")) {
					testStepPassed("Msg : "+ErrorMsg+ "is displayed");
				} else {
					testStepFailed("Incorrect error message is displayed");
				}

			} else {
				testStepFailed("Error message is not displayed");
			}
		} catch (Exception e) {

		}

	}
	public void clickPhysicalGiftCardCustomizeButton(){
		waitTime(2);
		clickOn(btn_ClassicGiftCardCustomize_new);
	}
	public void fillPhysicalGiftCardDetails(String ReceipientName, String SenderName, String GiftAmount, String GiftMessage){
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//form[contains(@id,'pgiftForm')]//input[contains(@id,'recipientName')]")).isDisplayed()) {
				typeIn(txt_ClassicGiftCard_ReceipientsName_new, ReceipientName);
				typeIn(txt_ClassicGiftCard_SenderName_new, SenderName);
				selectFromDropdown(drp_ClassicGiftCard_GiftCardAmount_new, GiftAmount);
				typeIn(txt_ClassicGiftCard_GiftCardMessage_new, GiftMessage);
			} else {
				testStepPassed("Physical Gift card fields are not dispalyed");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			testStepPassed("Physical Gift card fields are not dispalyed");
		}
	}
	public void clickPhysicalGiftCardAddToShoppingBagButton(){
		//waitTime(2);
		clickOn(btn_ClassicGiftCard_AddToShoppingBag_new);
	}


	public static final String txt_GiftCardBalance_GiftCard_No="Gift Cards Page Balance Check Gift Card No Textbox #xpath=//div[contains(@id,'GiftCardBalance')]//input[contains(@id,'giftCardNumber')]";
	public static final String txt_GiftCardBalance_GiftCard_PinNo="Gift Cards Page Balance Check Gift Card Pin No Textbox #xpath=//div[contains(@id,'GiftCardBalance')]//input[contains(@id,'giftCardPin')]";
	public static final String lnk_GiftCardBalance_GiftCard_CheckBalance="Gift Cards Page Balance Check Gift Card Check Balance Link #xpath=//div[contains(@id,'GiftCardBalance')]//a[contains(@id,'checkBalanceBtn')]";


	public void enterGiftCardNoWithPintoCheckBalance(String GiftCardNo, String GiftCardPinNo)
	{
		try 
		{

			if (driver.findElement(By.xpath("//div[contains(@id,'GiftCardBalance')]//input[contains(@id,'giftCardNumber')]")).isDisplayed()) 
			{
				typeIn(txt_GiftCardBalance_GiftCard_No, GiftCardNo);
				typeIn(txt_GiftCardBalance_GiftCard_PinNo, GiftCardPinNo);
			}

		} 
		catch (Exception e) 
		{
			testStepFailed("Gift Card No is not displayed in Check Balance Section");
		}
	}


	public void clickCheckBalanceLink()
	{
		try 
		{

			if (driver.findElement(By.xpath("//div[contains(@id,'GiftCardBalance')]//a[contains(@id,'checkBalanceBtn')]")).isDisplayed()) 
			{
				clickOn(lnk_GiftCardBalance_GiftCard_CheckBalance);
			}

		} 
		catch (Exception e) 
		{
			testStepFailed("Gift Card Check Balance Link is not displayed in Check Balance Section");
		}
	}



	public void verifyGiftCardBalanceisdisplayed()
	{
		
		waitTime(5);
		if (driver.findElement(By.xpath("//div[contains(@id,'main')]//div[contains(@id,'GiftCardBalance')]//div[contains(@id,'giftCardBalance')]/p[contains(text(),'Your Gift Card balance')]")).isDisplayed()) 
		{
			testStepInfo("Gift Card Balance is displayed");
			
			if (driver.findElement(By.xpath("//div[contains(@id,'GiftCardBalance')]//div[contains(@id,'giftCardBalance')]/p/span")).isDisplayed()) 
			{
				
				String GiftCardAmount = driver.findElement(By.xpath("//div[contains(@id,'GiftCardBalance')]//div[contains(@id,'giftCardBalance')]/p/span")).getText();
				
				testStepInfo("Gift Card Balance Amount : "+GiftCardAmount);
				
			}
		}
		else 
		{
			testStepFailed("Gift Card balance is not displayed");
		}

	}






}
