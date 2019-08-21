package mwPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class OrderConfirmationPage extends PopupWindows
{
	public OrderConfirmationPage(BaseClass obj) {
		
		super(obj);

	}

	public static final String chk_SavedCard_OrderConfirmation="Saved Card checkbox #xpath=//*[@id='saveCreditCardOption']";
	public static final String chk_PerfectFit_OrderConfirmation="PerfectFit checkbox #xpath=//*[@id='newRewardsCustomer']";
	
	
	public static final String ele_Checkout_order_number = "Order Number#xpath=//h4[contains(@id,'orderId')]";
	public static final String lbl_Checkout_order_number = "Order Number Label#xpath=//*[@id='orderId']";

	public static final String ele_order_number = "Order Number#xpath=//div[contains(@id,'order-confirmation')]//p[contains(@id,'order-num-perm')]";
	public static final String lbl_order_number = "Order Number Label#xpath=.//*[@id='order-num-perm']";
	
	
	public static final String txt_Orderconfirmationpage_Password = "Order Confirmation Page Password Textbox#xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'logonPassword')]";
	public static final String txt_Orderconfirmationpage_ConfirmPassword = "Order Confirmation Page Confirm Password Textbox#xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'confirmPassword')]";
	public static final String btn_Orderconfirmationpage_SignUpNow = "Order Confirmation Page Sign Up Now Button#xpath=//form[contains(@id,'registrationForm')]//button[contains(text(),'Sign Up Now')]";
	
	public static final String lnk_Orderconfirmationpage_BRDialogCLose = "Order Confirmation Page BRDialog CLose link#xpath=//*[@id='brdialog-win']/div[1]/div[1]";


	/*public static final String ele_order_number="Order Number#xpath=//span[contains(text(),'Order Number:')]/following-sibling::span[contains(@data-gtm,'orderno')]";
	public static final String lbl_order_number = "Order Number Label#xpath=//span[contains(text(),'Order Number:')]";*/

	public String InternationalCheckoutgetOrderNumber(){
		driver.switchTo().frame("envoyId");
		verifyCheckoutOrderConfirmationPage();
		String orderNumber=""; 

		try{
			orderNumber=getText(ele_Checkout_order_number);
			testStepPassed("Order confirmation number :"+orderNumber);
		}catch(Exception e){
			testStepFailed("Order is not placed");
		}

		driver.switchTo().defaultContent();
		
		return orderNumber; 
	}
	String OrderNumber;
	public String getOrderNumber(){

		try{
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@class,'confirmation-message')]//h2")).isDisplayed()) {
				 OrderNumber = driver.findElement(By.xpath("//div[contains(@class,'confirmation-message')]//h2")).getText();
				testStepInfo("Order confirmation number : "+OrderNumber);
			}
			else {
				testStepFailed("Order is not placed Order no is not found");
			}
			
			
		}catch(Exception e){
			testStepFailed("Order is not placed");
		}
	return OrderNumber;
	}
	
	public void verifyPerfectFItCheckBox()
	{
		if (driver.findElement(By.xpath("//*[@id='newRewardsCustomer']")).isDisplayed())
		{
			testStepPassed("Verifeid New Rewards Check Box is Displayed");
		}
	}
	public void clickOnSavedCardAndPerfectFItCheckBox()
	{
		clickOn(chk_SavedCard_OrderConfirmation);
		clickOn(chk_PerfectFit_OrderConfirmation);
	}
	
	
	public void verifySavedCardCheckBox()
	{
		if (driver.findElement(By.xpath("//*[@id='saveCreditCardOption']")).isDisplayed())
		{
			testStepPassed("Verifeid Saved Card Check Box is Displayed");
		}
	}
	
	public void clickOnCloseButtonInSurveyFormPopup(){
		try{
			waitTime(1);
			if(driver.findElement(By.xpath("//div[contains(@class,'brdialog-close')]")).isDisplayed()){
				clickOn("Close Survey Form Popup#xpath=//div[contains(@class,'brdialog-close')]");
			}
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
	}

	
	
	public void verifyCertonaisDisplayedinandGetthenames(){
		try{
			if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]")).isDisplayed()) {
				List<WebElement> CertonaBlock = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]"));
				int CertonaBlockCount = CertonaBlock.size();
				testStepPassed("Certona Block Count : "+CertonaBlockCount);
				
				for (int i = 0; i < CertonaBlockCount; i++) {
					 int j = i+1;
					if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]//span[contains(@class,'certona-widget__title-bg')]")).isDisplayed()) {
						String CertonaTitle = driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]//span[contains(@class,'certona-widget__title-bg')]")).getText();
						//testStepPassed("");
						testStepPassed("Certona Widget "+j+" Title : "+CertonaTitle);
						List<WebElement> CertonaProducts = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]"));
						int CertonaProductsCount = CertonaProducts.size();
						testStepPassed("Certona products Count in Widget "+j+" : "+CertonaProductsCount);
						List<WebElement> CertonaProductNameList = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]//div[contains(@class,'certona-product')]//a[contains(@class,'certona-product__link')]//div[contains(@class,'certona-product__title')]"));
						testStepPassed("Following are the products displayed in Certona Widget "+j+" in Home Page");
						
						
						for (int k = 0; k < CertonaProductsCount; k++) {
							k=k+1;
							for (WebElement cer : CertonaProductNameList) {
								String CertonaProductName = cer.getAttribute("innerText");
								testStepPassed(""+k+"."+CertonaProductName);
								k=k+1;
							}
						}
					}
				} 
			}
		}catch(Exception e){
			testStepFailed("Certona Widget is not displayed in Shopping Cart Page");  
		}
	}
	
	
	
	
	
	
	
	public void verifyCheckoutOrderConfirmationPage(){
		if(isElementDisplayed(lbl_Checkout_order_number)) testStepPassed("Order Confirmation Page is displayed");
		else testStepFailed("Order Confirmation Page is not displayed");
	}
	public void verifyOrderConfirmationPage(){
		try {
			String Orderconfirmationtitle = driver.findElement(By.xpath("//*[@id='title']")).getText();
			System.out.println("Order Confirmation Title is found as "+Orderconfirmationtitle);
			if (!Orderconfirmationtitle.equalsIgnoreCase("Order Submitted")) {
				testStepPassed("Order is Submitted");
			} else {
				testStepFailed("Order is not submitted");
			}
		} catch (Exception e) {
			
			testStepFailed("Order Submitted Xpath is not found");
		}
		/*if(isElementDisplayed(lbl_order_number)) testStepPassed("Order Confirmation Page is displayed");
		else testStepFailed("Order Confirmation Page is not displayed");*/
	}
	public void fillOrderConfirmationPagePasswordDetails(String Password, String ConfirmPassword){
		try{
			waitTime(3);
			if (driver.findElement(By.xpath("//form[contains(@id,'registrationForm')]//input[contains(@id,'logonPassword')]")).isDisplayed()) {
				typeIn(txt_Orderconfirmationpage_Password, Password);
				typeIn(txt_Orderconfirmationpage_ConfirmPassword, ConfirmPassword);
			} else {
				testStepPassed("The Password Fields in Order Confirmation Page is not displayed");
			}
			
		}catch(Exception e){
			testStepPassed("The Password Fields in Order Confirmation Page is not displayed");
		}
	}
	public void clickOrderConfirmationPageSignUpNowButton(){
		try{
			waitTime(2);
			if (driver.findElement(By.xpath("//form[contains(@id,'registrationForm')]//button[contains(text(),'Sign Up Now')]")).isDisplayed()) {
				clickOn(btn_Orderconfirmationpage_SignUpNow);
			} else {
				testStepPassed("The Sign Up Now Button in Order Confirmation Page is not displayed");
			}
			
		}catch(Exception e){
			testStepPassed("The Sign Up Now Button in Order Confirmation Page is not displayed");
		}
	}


	
	public void clickBRPopupcloselink(){
		try{
			waitTime(4);
			if (driver.findElement(By.xpath("//*[@id='brdialog-win']/div[1]/div[1]")).isDisplayed()) {
				clickOn(lnk_Orderconfirmationpage_BRDialogCLose);
			} else {
				testStepPassed("The BR Dialog in Order Confirmation Page is not displayed");
			}
			
		}catch(Exception e){
			testStepPassed("The BR Dialog in Order Confirmation Page is not displayed");
		}
	}
	
	
	
	
	
	public void verifyCertonaisDisplayedandAddProductthroughQVandPDP(String Size){
		try
		{
			if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]")).isDisplayed()) {
				testStepPassed("Certona Widget is displayed");
				List<WebElement> CertonaBlock = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]"));
				int CertonaBlockCount = CertonaBlock.size();
				testStepPassed("Certona Block Count : "+CertonaBlockCount);

				for (int i = 0; i < CertonaBlockCount; i++) {
					int j = i+1;
					int k=1;
					System.out.println(k);
					if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]")).isDisplayed()) {
						String CertonaTitle = driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]")).getText();
						//testStepPassed("");
						testStepPassed("Certona Widget "+j+" Title : "+CertonaTitle);
						List<WebElement> CertonaProducts = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]"));
						int CertonaProductsCount = CertonaProducts.size();
						testStepPassed("Certona products Count in Widget "+j+" : "+CertonaProductsCount);
						
						
						/*testStepPassed("Adding Product from QV of Certona Widget : "+j);
						String ProductName = driver.findElement(By.xpath("(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//a//div[contains(@class,'certona-product__title')])["+k+"]")).getText(); 
						mouseOver(ProductName+"Product image#xpath=(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//div[@class='certona-product__image-wrap quick-view-wrapper'])["+k+"]");
						final String CertonaQVLink="Certona QV Link#xpath=(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//div[contains(@class,'certona-product')]//div[@class='certona-product__image-wrap quick-view-wrapper'])["+k+"]//a[contains(@class,'js-qv-link')]";
						clickOn(CertonaQVLink);
						if (verifyQVisDisplayed()) {
							selectSizeFromQVPopup(Size);
							clickOnAddToShoppingBagFromQVPopup();
						}
						else {
							testStepFailed("QV Popup is not displayed");
						}
						//getProductCountinMinicart();
						
						
						testStepPassed("Adding Product from PDP of Certona Widget : "+j);
						final String CertonaProductLink="Certona Product Link#xpath=(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//a[@class='certona-product__link js-prod-link'])["+k+"]";
						clickOn(CertonaProductLink);
						if (verifyPDPisDisplayed()) {
							selectSizeFromProductDescriptionPagenew(Size);
							clickPDPAddtoShoppingBagButton();
						}
						else {
							testStepFailed("PDP is not displayed");
						}
						getProductCountinMinicart();
						
						waitTime(1);
						URLNavigateBack();*/
					}
				}
			} 
		
		}catch(Exception e){
			testStepFailed("Certona Widget is not displayed in Product Grid Page");  
		}
	}
	
	
	
	
	public String selectSizeFromProductDescriptionPagenew(String size)
	{

		try {
			//waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']")).isDisplayed()) {
				clickOn(drp_size_item);
				//waitTime(2);
				List<WebElement> sizeOptions=driver.findElements(By.xpath("//div[contains(@class,'sizes-wrap')]//li[contains(@class,'size-item')]//a[contains(@href,'#')]"));
				if(sizeOptions.size()>0){
					if(!size.isEmpty()){
						for(WebElement ele:sizeOptions){
							if(ele.getText().equalsIgnoreCase(size)){
								ele.click();
								testStepPassed("click on '"+size+"' size");
								break;
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
				//return size;
			} else {
				testStepPassed("The Size dropdown is not displayed");
			}

		} catch (Exception e) {
			
			testStepPassed("The Size dropdown is not displayed");
		}
		return size;

	}

	
	public static final String btn_PDP_AddToShoppingBag_new="PDP Add to Shopping Bag Button#xpath=//section[contains(@id,'prod-info')]//a[contains(@id,'add-to-cart')]";
	
	public void clickPDPAddtoShoppingBagButton(){
		try{
			//waitTime(2);
			if (driver.findElement(By.xpath("//section[contains(@id,'prod-info')]//a[contains(@id,'add-to-cart')]")).isDisplayed()) {
				clickOn(btn_PDP_AddToShoppingBag_new);
			} else {
				testStepFailed("Add to Shopping Button is not found");
			}

		}catch(Exception e){
			testStepFailed("Add to Shopping Button is not found");
		}
	}
	
	
	public void clickOnAddToShoppingBagFromQVPopup(){
		clickOnSpecialElement(btn_qv_add_to_shoppingbag);
	}


	
	public boolean verifyQVisDisplayed(){

		boolean flag=false;
		try{
			waitTime(2);
			if(driver.findElement(By.xpath("//div[contains(@id,'quickInfoPopup')]//div[contains(@class,'widget_quick_info_popup')]")).isDisplayed()){
				testStepPassed("QV Popup is displayed");
				flag= true;
			}
		}catch(Exception e){
			testStepFailed("QV Popup is not displayed");
		}
		return flag;
	}
	
	
	public boolean verifyPDPisDisplayed(){

		boolean flag=false;
		try{
			waitTime(2);
			if(driver.findElement(By.xpath("(//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]) | //div[contains(@class,'js-bundle pdp-container')]")).isDisplayed()){
				testStepPassed("PDP is Displayed");
				flag= true;
			}
		}catch(Exception e){
			testStepFailed("PDP is not displayed");
		}
		return flag;
	}
	
	public void getProductCountinMinicart(){
		String ProductCount = driver.findElement(By.xpath("//li[contains(@class,'mini-cart-holder')]//a[contains(@id,'header-cart-with-count')]//span[contains(@class,'js-cart-counter')]")).getText();
		testStepPassed("Product Count in Bag : "+ProductCount);
	}
	
public static String SKUID;
	
	public String getSKUID()
	{
		SKUID = getText("SKU ID#xpath=//ul[contains(@class, 'bag-item')]//li//span[contains(text(), 'SKU')]//parent::li");
		//String splitOrderId[] = OrderID.split("#");
		//OrderIDVal = splitOrderId[1];
		if(isElementDisplayed("SKU ID#xpath=//ul[contains(@class, 'bag-item')]//li//span[contains(text(), 'SKU')]//parent::li"))
		{
			testStepPassed("SKU ID is : " + "\""+SKUID+"\"" + " displayed");
		}else
		{
			testStepFailed("SKU ID not displayed");
		}
		waitTime(1);
		return SKUID;
	}
	
}
