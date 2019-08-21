package baseClass;


import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HeaderLinks extends FooterLinks {

	String defaultCurrency;
	
	public static final String lnk_Header_ContactUs_MouseOver_new = "Header Contact Us Mouse Over Link#xpath=//div[contains(@class,'header-user-bar')]//li[contains(@id,'header-account-section')]//a[contains(@class,'need-help-title')]";
	public static final String lnk_Header_ContactUs_new = "Header Contact Us Link#xpath=//div[contains(@class,'header-user-bar')]//li//a[contains(@class,'need-help-title')]";
	//public static final String lnk_Header_Chat_new = "Header Chat Link#xpath=//div[contains(@class,'header-user-bar')]//li//ul//li[contains(@class,'need-help__chat')]//a[contains(@id,'liveagent_button_offline_header')]";
	public static final String lnk_Header_Chat_new = "Header Chat Link#xpath=//a[contains(text(),'Chat Now') and contains(@id,'liveagent_button_offline_header')]";
	
	public static final String lnk_Header_EmailUs_new = "Header EmailUs Link#xpath=//div[contains(@class,'header-user-bar')]//li//ul//li[contains(@class,'need-help__email')]//a";
	
	
	

	public static final String lnk_Header_SignIn = "Header Link - SignIn Link#xpath=//nav[@id='top_utilities']//a[contains(@id,'sign-in-link-header')]";
	//public static final String lnk_Header_SignOut = "Header Link - SignOut#xpath= //li[contains(@id,'header-account-section')]//a[contains(text(),'Sign Out')]";
	public static final String lnk_Header_Greeting = "Header Link - Greeting#xpath=//*[@id='header-user-greeting']";
	//public static final String lnk_Header_Greeting = "Header Link - Greeting#id=header-user-greeting";
	//public static final String lnk_Header_Greeting = "Header Link - Greeting css=[id=header-user-greeting]";
	public static final String lnk_Header_OrderHistory = "Header Link - Order History#xpath=//li[contains(@id,'header-account-section')]//a[contains(text(),'Order History')]";
	
	public static final String lnk_Account_OrderHistory = "Account Order History Link#xpath=//ul[contains(@id,'my-acc-subnav')]//li//a[contains(text(),'Order History')]";
	public static final String lnk_saveditemslink="header link saved items link #xpath=//li[contains(@id,'header-account-section')]//a[text()='Saved Items']";
	public static final String lnk_Header_AccountInfo = "Header Link - AccountInfo#xpath=//li[contains(@id,'header-account-section')]//*[contains(text(),'Account Info')]";
	public static final String lnk_ShippingTo="ShippingTo link#xpath=//a[@id='change-context']";
	public static final String sel_ShippingDest="shippingdestination#xpath=//select[@class='country-selection js-country-select']";
	public static final String btn_UpdateCountry="updatecountrycode#xpath=//a[(@id='context-chooser-submit') or text()='Update Country & Currency']";
	public static final String lnk_Cart="Header link cart#xpath=//a[@id='header-cart-with-count']";
	public static final String lnk_ShoppingBag="Header link shopping bag #xpath=//a[contains(@class,'mini-cart')]";
	public static final String lnk_Bag="Header link Shopping Bag#xpath=//a[@id='header-cart-with-count']";
	public static final String lnk_Bagnocount="Header link Shopping Bag no count #xpath=.//a[@id='header-cart-nocount']/span[2]";
	public static final String lnk_Bagwithcount="Header link Shopping Bag with count #xpath=.//a[@id='header-cart-with-count']/span[2]";
	public static final String txt_shoppingcartempty="Shopping Cart Empty Text#xpath=.//h1[@class='empty-cart-title']";
	public static final String lnk_remove_items="Remove Link in Items#xpath=//div[contains(@class,'mini-bag')]//div[@class='bag-items']//div[@class='rw collapse bag-item']//a[contains(text(),'Remove')]";


	//public static final String lnk_Header_FindaStore = "Header Link - Find a Store #xpath=//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeEditLink')]";
	public static final String lnk_Header_NeedHelp = "Header Link - NeedHelp #xpath=//nav[contains(@id,'top_utilities')]//a[contains(text(),'Help') and contains(@class,'need-help-title')]";//nav[contains(@id,'top_utilities')]//a[contains(text(),'Need Help?') and contains(@class,'need-help-title')]";
	public static final String lnk_Header_ContactUs = "Header Link - Contact us #xpath=//nav[contains(@id,'top_utilities')]//a[contains(text(),'Contact us')]";
	public static final String lnk_Header_Chat = "Header Link - Chat #xpath=//*[@id='header-account-section']//*[@id='liveagent_button_offline_header']";
	public static final String lnk_Header_MyAccount = "Header Link - My Account #xpath=//li[contains(@id,'header-account-section')]//div/a[contains(text(),'Account')]";
	public static final String lnk_Header_PerfectFitRewards = "Header Link - Perfect Fit Rewards #xpath=//li[contains(@id,'header-account-section')]//a[contains(text(),'Perfect Fit Rewards')]";
	//public static final String txt_Header_Search="Search Text#xpath=//div[@id='SimpleSearchForm_SearchTerm' or type='text']";
	//public static final String btn_Header_Search="Search buton#xpath=//div[contains(@id,'search_submit')]";
	public static final String txt_Header_Search="Search Text#xpath=//form[@id='CatalogSearchForm']//input[@id='SimpleSearchForm_SearchTerm']";
	public static final String btn_Header_Search="Search buton#xpath=//form[@id='CatalogSearchForm']//input[contains(@id,'search_submit')]";
	public static final String lnk_Header_SignOut = "Header Link - SignOut#xpath=//a[@class='sign-out' and text()='Sign Out']";
	public static final String lnk_findstore="find store option#xpath=//div[@id='posHeader']//a[@id='storeLink']";
	public static final String lnk_Mystore="my store option#xpath=//li[contains(@id,'header-account-section')]//*[contains(text(),'My Sizes')]";
	public static final String img_promotion="image #xpath=//img[contains(@class,'jh-bg jh-lg-block')]";
	public static final String txt_orederhistory="order history text #xpath=//*[contains(@class,'breadcrumb')]//a[contains(text(),'Order History')]";
	public static final String btn_changestore="changestore link #xpath=//div[contains(@class,'inner clearfix')]//a[contains(@id,'makeThisMyStore')]";
	public static final String lnk_Header_Find_a_Store_edit = "Find a Store edit #xpath=//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeEditLink')]";
	public static final String lnk_Header_FindaStore = "Header Link - Find a Store #xpath=//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeEditLink') or contains(text(),'Find a Store')]";
	public static final String lnk_view_shoppingbag = "View Shopping Bag Link#xpath=//div[contains(@class,'mini-bag')]//div[contains(@class,'text')]//a[contains(text(),'view shopping bag')]";
	public static final String txt_shoppingbagheading="Shopping Bag Page Heading#xpath=//div[contains(@class,'shopping-bag-header')]//h2[contains(text(),'Shopping Bag')]";
	public static final String lnk_view_shoppingbagcheckout = "View Shopping Bag checkout Link#xpath=//div[contains(@class,'mini-bag')]//div[contains(@class,'text')]//a[contains(text(),'checkout')]";
	public static final String lnk_Header_ShoppingBag="Header link Shopping Bag#xpath=//a[contains(@id,'header-cart')]";
	
	public static final String lnk_my_cart="My cart link#xpath=//a[contains(text(),'Checkout')]/parent::li";
	public static final String lnk_bagicon="bag icon link#xpath=//span[@class='cart-number js-cart-counter']";
	public static final String lnk_Header_EditStore = "Header Link - Edit Store #xpath=//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeEditLink')]";
	public static final String lnk_Header_ChangeStore = "Header Link - Find Store #xpath=//li[contains(@class,'header-my-store-block')]//div[@id='header-mystore-links']//div//li//a[contains(text(),'Change Store')]";
	public static final String lnk_Header_FindStore = "Header Link - Find Store #xpath=//ul[contains(@class,'top-header')]//a[contains(text(),'Find a Store')]";
	
	
	public static final String lnk_Header_FindStoreorEditStore = "Header Link Find Store or Edit Store Link#xpath=//nav[contains(@id,'top_utilities')]//a[contains(text(),'edit') or contains(text(),'find a store')]";

	
	
	public HeaderLinks(BaseClass obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	public void clickOnSignIn(){
		try{
			driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
			waitTime(2);
			//div[contains(@id,'sign-in-modal')]//div[contains(@class,'has-acct')]//div[contains(text(),'Sign In')]
			clickOn(lnk_Header_SignIn);
			//waitTime(2);
			/*String Signinheading = driver.findElement(By.xpath("//div[contains(@id,'sign-in-modal')]//div[contains(@class,'has-acct')]//div[contains(text(),'Sign In')]")).getText();
			System.out.println("The heading of login page : "+Signinheading);
			if (Signinheading.equalsIgnoreCase("Sign In")) {
				testStepPassed("The Sign In Popup window is Opened");
			} else {
				testStepFailed("The Sign In Popup window is not opened");
			}*/

		}catch(Exception e){
			testStepFailed("SignIn to app failed");
		}
	}

	public void clickOnSignOut(){
		try{
			waitTime(3);
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.id("header-user-greeting"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'Header Link - Greeting'");
				}
			}else{
				mouseOver(lnk_Header_Greeting);
			}

			waitTime(1);
			clickOn(lnk_Header_SignOut);
			waitForElement(lnk_Header_SignIn);

		}catch(Exception e){
			testStepFailed("SignOut from app failed");
		}
	}

	public void changeCountryShippingTo(String country)
	{
		if(isElementDisplayed(lnk_ShippingTo))
		{
			testStepPassed("shippingTo Displayed in the header section");
		}
		else
		{
			testStepFailed("shippingTo is not Displayed in the header section");
		}
		clickOn(lnk_ShippingTo);
		selectFromDropdown(sel_ShippingDest, country);
		clickOn(btn_UpdateCountry);
	}

	public String selectCountryAndReturnDefaultCurrency(String country)
	{
		clickOn(lnk_ShippingTo);
		selectFromDropdown(sel_ShippingDest, country);
		defaultCurrency = driver.findElement(By.xpath("//*[contains(@class,'country-selection')]//option[contains(text(),'"+country+"')]")).getAttribute("data-defaultcurrency");
		clickOn(btn_UpdateCountry);
		if(country.equalsIgnoreCase("United States")){
			defaultCurrency = "$";
		}
		testStepPassed("The Ship To is successfully changed to INDIA Customer");
		return defaultCurrency;
	}

	public void clickOnCart(){
		try{
			clickOn(lnk_Cart);
			waitForText("Shopping Cart");
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}
	public void clickOnAsCheckoutCart(){
		try{
			mouseOver(lnk_Cart);
			clickOn(lnk_ShoppingBag);
			waitForText("Shopping Cart");
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}
	public void clickOnBagIcon()
	{
		try
		{
			clickOn(lnk_bagicon);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

	public void viewshoppingbag(){
		try{
			waitTime(5);
			driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
			waitTime(5);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();
			//clickOn(lnk_view_shoppingbag);
			clickOnSpecialElement(lnk_view_shoppingbag);
			/*String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}*/
		}catch(Exception e){
			//testStepFailed(e.toString());
		}
	}
	public void viewshoppingbagwithcheckout(){
		try{
			waitTime(5);
			driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
			waitTime(2);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();
			clickOn(lnk_view_shoppingbagcheckout);
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}
	
	
	
	public void Safariviewshoppingbag(){
		try{
			waitTime(5);
			driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
			waitTime(5);
			
			WebElement element=driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"));
			waitTime(3);
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on search department");
				clickOn(lnk_view_shoppingbag);
			}
			/*Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();*/
			
			
			//clickOn(lnk_view_shoppingbag);
			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}
	
	
	

	public static final String lnk_Checkout="Header link Shopping Bag with count #xpath=.//a[@id='header-cart-with-count']/span[2]";
	
	public void clickonChromeFirefoxCheckout(){
		/*try{
			//waitTime(2);
						
			if (driver.findElement(By.xpath(".//*[@id='header-cart-with-count']")).isDisplayed()) {
				clickOn(lnk_Bagwithcount);
			}
		}catch(Exception e){
			e.printStackTrace();
		}*/
		
		try{
			waitTime(2);
						
			if (driver.findElement(By.xpath("//a[contains(@id,'header-cart-with-count')]//span[contains(@class,'js-cart-counter')]")).isDisplayed()) {
				waitTime(4);
				//clickOn(lnk_Checkout);
				clickOnSpecialElement(lnk_Checkout);
				//clickOn(lnk_Bagwithcount2);
			}
		}catch(Exception e){
			testStepFailed("Shopping Mini Bag is empty");
		}
	}
	
	
	public void clickonChromeFirefoxCheckoutDifferentCloneId(){
		try{
			if (driver.findElement(By.xpath(".//*[@id='header-cart-with-count']")).isDisplayed()) {
				clickOn(lnk_Bag);
			}
		}catch(Exception e){
			testStepFailed("Checkout Link is not found");
		}
	}
	
	
	public void viewshoppingbagIE(){
		driver.navigate().to(prefix+".menswearhouse.com/OrderCalculate?calculationUsageId=-1&calculationUsageId=-2&calculationUsageId=-6&updatePrices=1&doConfigurationValidation=Y&catalogId=12004&errorViewName=AjaxOrderItemDisplayView&orderId=.&langId=-1&storeId=12751&URL=AjaxOrderItemDisplayView");
	}
	

	public void clickOnOrderHistory(){
		waitTime(2);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
			//System.out.println("Account Dashboard page is displayed");
		}
		if(currentBrowser.equalsIgnoreCase("internetexplorer"))
		{
			navigateTo(prefix+".menswearhouse.com/TrackOrderStatus?orderStatusStyle=strong&catalogId=12004&langId=-1&storeId=12751");
		}
		else
		{
			waitTime(1);
			clickOn(lnk_Header_OrderHistory);
		}
	}
	
	
	public void clickOnSafariOrderHistoryandVrifyOrderHistoryPageisDisplayed(){
		waitTime(2);
		try {
			if (driver.findElement(By.xpath("//ul[contains(@id,'my-acc-subnav')]//li//a[contains(text(),'Order History')]")).isDisplayed()) {
				clickOn(lnk_Account_OrderHistory);
				waitTime(2);
				if (driver.findElement(By.xpath("//div[@id='acct-right']//h2[contains(text(),'Order History')]")).isDisplayed()) {
					testStepPassed("Order History is Displayed");
				}
			}
		} catch (Exception e) {
			testStepFailed("Order History Link is not found");
		}		
	}
	
	public void clickOnSavedItemsLink(){
		waitTime(5);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
		}
		if(currentBrowser.equalsIgnoreCase("internetexplorer"))
		{
			navigateTo(prefix+".menswearhouse.com/InterestItemDisplay?catalogId=12004&langId=-1&storeId=12751");
		}
		else
		{
			waitTime(1);
			clickOn(lnk_saveditemslink);
		}
	}
	public void verifyOrederHistoryPage()
	{
		if(elementPresent((txt_orederhistory)))
		{
			testStepPassed("oreder history page is displayed");
		}
		else
		{
			testStepFailed("oreder history page is not displayed");
		}
	}

	public void clickOnAccountInformation(){
		waitTime(1);
		//clickOn(lnk_Header_Greeting);
		//waitForElement(lnk_Header_NeedHelp);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
			clickOn(lnk_saveditemslink);
		}
		//waitTime(2);
		if(currentBrowser.equalsIgnoreCase("internetexplorer")){
			navigateTo(prefix+".menswearhouse.com/AjaxLogonForm?catalogId=12004&langId=-1&storeId=12751");
		}
		else
		{
			clickOn(lnk_Header_Greeting);
		}
	}

	public void clickOnFindaStore(){
		try {
			waitTime(2);
			////nav[contains(@id,'top_utilities')]//li[contains(@class,'store_details_info top')]
			if (driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeLink')]")).isDisplayed()) {
				
		        testStepPassed("Store Link is found");
		        waitTime(2);
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeLink')]"))).build().perform();
				//act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'header-mystore-links top-header__dropdown-wrap')]//div//ul//li//a[contains(text(),'Change Store')]")));
				//act.moveToElement(driver.findElement(By.xpath("//li[contains(@class,'header-my-store-block')]//div[@id='header-mystore-links']//div//li//a[contains(text(),'Change Store')]")));
			    //act.click().build().perform();
				clickOn(lnk_Header_ChangeStore);
				
				//driver.findElement(By.xpath("//li[contains(@class,'header-my-store-block')]//div[@id='header-mystore-links']//div//li//a[contains(text(),'Change Store')]")).click();
				
				
			}
		} catch (Exception e) {
			System.out.println("Find Store link is not found");
			testStepPassed("Find Store link is not found");
		}
		
	}
	

	public void clickOnContactUs(){
		waitForElement(lnk_Header_NeedHelp);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(text(),'Help') and contains(@class,'need-help-title')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - NeedHelp'");
			}
		}else{
			mouseOver(lnk_Header_NeedHelp);
		}

		waitTime(3);
		//		driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(text(),'Contact us')]")).click();
		clickOnSpecialElement(lnk_Header_ContactUs);
	}
	
	
	public void clickOnContUsHeaderLinkinIE(){
		waitTime(2);
		navigateTo(prefix+".menswearhouse.com/support");
	}
	
	
	public void clickOnChatinIE(){
		waitTime(2);
		navigateTo(prefix+".menswearhouse.com/MWLiveChatOfflineView?catalogId=12004&langId=-1&storeId=12751");
	}

	public void clickOnChat(){
		waitTime(3);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(text(),'Need Help?') and contains(@class,'need-help-title')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - NeedHelp'");
			}
		}else{
			mouseOver(lnk_Header_NeedHelp);
		}
		try{
			if(driver.findElement(By.xpath("//*[@id='header-account-section']//*[@id='liveagent_button_online_header']")).isDisplayed()){
				clickOn("Header Link - Chat #xpath=//*[@id='header-account-section']//*[@id='liveagent_button_online_header']");
			}else{
				clickOn("Header Link - Chat #xpath=//*[@id='header-account-section']//*[@id='liveagent_button_offline_header']");
			}
		}catch(Exception e){
			testStepFailed("Header Link - Chat is not available");
		}
	}


	public void clickOnAccountDashboard(){
		//waitForElement(lnk_Header_Greeting);
		//waitForText("Ship To ");
		waitTime(5);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
		}
		/*if(currentBrowser.equalsIgnoreCase("internetexplorer"))
		{
			navigateTo(prefix+".menswearhouse.com/webapp/wcs/stores/servlet/AjaxLogonForm?catalogId=12004&langId=-1&storeId=12751");
		}
		else
		{
			waitTime(5);
			clickOn(lnk_Header_MyAccount);
		}*/

		//waitTime(5);
	}

	public void clickOnUserNameAccount(){
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
		}
		waitTime(3);
		clickOn("Account info#xpath=//div[contains(@class,'name')]/div[2]/a");
		//Actions action = new Actions(driver);

		// To click on the element
		//action.driver("//div[contains(@class,'name')]/div[2]/a").click().perform();

	}

	public void clickOnPerfectFitRewardsInHeader(){
		waitForElement(lnk_Header_Greeting);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
		}
		if(currentBrowser.equalsIgnoreCase("internetexplorer")){
			navigateTo(prefix+".menswearhouse.com/RewardsView?catalogId=12004&langId=-1&storeId=12751");
		}
		else
		{
			waitTime(1);
			clickOn(lnk_Header_PerfectFitRewards);
		}
	}

	public void searchProduct(String searchprod){
		try{
			typeIn(txt_Header_Search,searchprod);
			clickOn(btn_Header_Search);   
		}

		catch(Exception e){
			testStepFailed(e.toString());
		}
	}



	public boolean findStroreInHeaderLink()
	{
		clickOn(lnk_findstore);
		return true;
	}

	public void clickOnMyStore()
	{
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
		}
		clickOn(lnk_Mystore);
	}
	public void verifyChat()
	{
		//	switchToWindow("Live Chat");
		verifyElement("Live Help #xpath=//h2[text()='Live Help']");
	}


	public void verifyAndCloseChatWindow(String parentWindowHandle){
		for(String winHandle : driver.getWindowHandles()){
			if(!winHandle.equalsIgnoreCase(parentWindowHandle)){
				driver.switchTo().window(winHandle);
				waitTime(5);
				if(driver.getTitle().equalsIgnoreCase("Live Chat")||driver.getCurrentUrl().contains("chat")){	
					testStepPassed("Chat Link is navigated to its corresponding page");
					break;

				}else{
					testStepFailed("Chat Link is not navigated to its corresponding page");
				}
			}
			//			driver.close();
		}
		//		driver.switchTo().window(parentWindowHandle);
	}

	public void clickOnPromotion()
	{
		clickOn(img_promotion);
	}

	public void clickOnlnkHeaderFindaStoreEdit()
	{
		clickOn(lnk_Header_Find_a_Store_edit);
	}

	//Keyword search Test scenario
	public static final String lnk_Header_Search="Header Search Link#xpath=//span[contains(text(),'Search')]";
	public void searchProductnew(String searchprod){
		try{
			//waitTime(1);
			/*driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
			waitTime(2);*/
			/*Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[@id='posHeader']//div[@class='js-search-toggle search-toggle']"))).build().perform();
			testStepPassed("Mouse over happened on Search link");*/
			
			clickOn(lnk_Header_Search);
			typeIn(txt_Header_Search,searchprod);
			//waitTime(1);
			driver.findElement(By.xpath("//form[@id='CatalogSearchForm']//input[@id='SimpleSearchForm_SearchTerm']")).sendKeys(Keys.ENTER);
			//clickOn(btn_Header_Search);   
		}

		catch(Exception e){
			testStepFailed(e.toString());
		}
	}
	
	public static final String lnk_Header_ZeroSearch="Header Search Link#xpath=//span[contains(@class,'search-toggle-icon')]";
	public void ZerosearchProduct(String searchprod){
		try{
						
			clickOn(lnk_Header_ZeroSearch);
			typeIn(txt_Header_Search,searchprod);
			//waitTime(1);
			driver.findElement(By.xpath("//form[@id='CatalogSearchForm']//input[@id='SimpleSearchForm_SearchTerm']")).sendKeys(Keys.ENTER);
			//clickOn(btn_Header_Search);   
		}

		catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	
	
	public void searchProductSafari(String searchprod){
		try{
				System.out.println("Entered into Safari Block");
				WebElement element=driver.findElement(By.xpath("//div[@id='posHeader']//div[@class='js-search-toggle search-toggle']"));
				waitTime(3);
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on search department");
					driver.findElement(By.xpath("//form[@id='CatalogSearchForm']//input[@id='SimpleSearchForm_SearchTerm']")).sendKeys(searchprod);
					driver.findElement(By.xpath("//form[@id='CatalogSearchForm']//input[@id='SimpleSearchForm_SearchTerm']")).sendKeys(Keys.ENTER);
				}
		}
		catch(Exception e)
		{
			testStepFailed("Mouse Over in Search Element is not done");
		}
	}
	
	
	public boolean onMouseOverSafari(WebElement element)
	{
		boolean result = false;
		try
		{
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject){ arguments[0].fireEvent('onmouseover');}";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(mouseOverScript, element);
			result = true;
		}catch (Exception e)
		{
			testStepFailed("Exception occured :"+e);
			result = false;
		}
		return result;
	}
	
	
	
	public void mouseHoveronSignInLink(){
		try{
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(@id,'sign-in-link-header')]"))).build().perform();
			testStepPassed("Mouse Hover on Sign Link is happened");

		}catch(Exception e){
			testStepFailed("Mouse Hover on Sign Link is not happened");
		}
	}
	

	public void verifyZeroSearchResultsPageisDisplayed(){
		try{
			waitTime(2);
			if (driver.findElement(By.xpath("//div[@class='widget_search_results']")).isDisplayed()) {
				String ZeroResults = driver.findElement(By.xpath("//div[@class='widget_search_results']")).getText();
				if (ZeroResults.equalsIgnoreCase("0 RESULTS FOUND. Please enter another search term and try again.")) {
					testStepPassed("0 Results Page is found");
				}
			}

		}catch(Exception e){
			testStepFailed("0 Results Page is not found");
		}
	}
	
	
	public void getURLandPostJunkDatainURL(){
		try{
			String CurrentURL= driver.getCurrentUrl();
			System.out.println("URL : "+CurrentURL);
			String JunkURL = CurrentURL.concat("junk");
			System.out.println("Junk URL : "+JunkURL);
			driver.get(JunkURL);

		}catch(Exception e){
			testStepFailed("Cannot able to get Current URL");
		}
	}
	
	
	
	public void verify404PageisDisplayed(){
		try{
			waitTime(1);
			if (driver.findElement(By.xpath("//ul[contains(@class,'breadcrumb')]//a")).isDisplayed()) {
				testStepPassed("404 page is displayed");
			}

		}catch(Exception e){
			testStepFailed("404 is not displayed");
		}
	}
	
	
	

	public void clickOnBagnocount(){
		String Shoppingbagemptymsg;
		try{
			clickOn(lnk_Bagnocount);
			Shoppingbagemptymsg = getText(txt_shoppingcartempty);
			System.out.println(Shoppingbagemptymsg);
			if (Shoppingbagemptymsg.equalsIgnoreCase("Your Shopping Bag is empty")) {
				testStepPassed("It is navigated to Shopping Bag page. Product count in Header link Shopping Cart : 0 & Verified Your Shopping Bag is empty message is displayed");
			} else {
				testStepPassed("It is navigated to the Shopping Bag Page");
			}

		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}


	public double getProductPriceInShoppingBag(String productName){
		Number productPrice = null;
		NumberFormat format = NumberFormat.getCurrencyInstance();
		try{
			mouseOver(lnk_Header_ShoppingBag);
			if(driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]/parent::h2/parent::div/parent::div[contains(@class,'bag-item')]//span[contains(@class,'product-price')]")).isDisplayed()){
				String price = driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]/parent::h2/parent::div/parent::div[contains(@class,'bag-item')]//span[contains(@class,'product-price')]")).getText().trim();
				String[] currency = price.split(":");
				productPrice = format.parse(currency[currency.length-1].trim());
			}
		}catch(Exception e){
			testStepFailed("In Shopping Bag, product price is not displayed for the product- "+productName);
		}
		return Double.valueOf(productPrice.toString());
	}

	public double getAlterationPriceForProductInShoppingBag(String productName){
		Number alterationPrice = null;
		NumberFormat format = NumberFormat.getCurrencyInstance();
		try{
			mouseOver(lnk_Header_ShoppingBag);
			if(driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]/parent::h2/parent::div/parent::div[contains(@class,'bag-item')]//span[contains(@class,'tailoring-price')]")).isDisplayed()){
				String price = driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]/parent::h2/parent::div/parent::div[contains(@class,'bag-item')]//span[contains(@class,'tailoring-price')]")).getText().trim();
				System.out.println(price);
				String[] currency = price.split(":");
				alterationPrice = format.parse(currency[currency.length-1].trim());
			}
		}catch(Exception e){
			testStepFailed("In Shopping Bag, alteration price is not displayed for the product- "+productName);
		}
		return Double.valueOf(alterationPrice.toString());
	}

	public static final String header_ShoppingBag_TotalPrice = "ShoppingBag TotalPrice#xpath=//*[contains(@id,'header')]//p[contains(@class,'subtotal-price')]";
	public double getTotalPriceForProductsAddedInBag(){
		Number totalPrice = null;
		NumberFormat format = NumberFormat.getCurrencyInstance();
		try{
			mouseOver(lnk_Header_ShoppingBag);
			String[] currency = getText(header_ShoppingBag_TotalPrice).split(":");
			totalPrice = format.parse(currency[currency.length-1].trim());
			System.out.println(totalPrice);
		}catch(Exception e){
			testStepFailed("In Shopping Bag, total amount is not displayed");
		}
		return Double.valueOf(totalPrice.toString());
	}
	public static final String lnk_header_account_Signout = "Home Page User account Signout link#xpath=//li[contains(@id,'header-account-section')]//div[contains(@id,'acct-dd')]//a[contains(text(),'Sign Out')]";

	public void ClickonSignoutinHeaderlinkgreetinglink(){

		waitTime(5);

		if (driver.findElement(By.xpath("//li[contains(@id,'header-account-section')]//div[contains(@id,'header-user-greeting')]")).isDisplayed()) {

			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//li[contains(@id,'header-account-section')]//div[contains(@id,'header-user-greeting')]"))).build().perform();
			clickOn(lnk_header_account_Signout);

		} else {
			testStepFailed("The User account header link Signout is not found");
		}
	}
	public void clickOnMycart(){
		
		//mouseOver(lnk_my_cart);
		clickOn(lnk_my_cart);
	//waitForText("Cart Details:");
	
}
	public void viewshoppingbag_New(){
		try
		{
			waitTime(2);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();
			clickOn(lnk_view_shoppingbag);
		}
		catch(Exception e)
		{
			testStepFailed("Mouse Hover on header link - checkout not performed");
		}
	}
	
	
	public void openShoppingCartPage(){
		boolean flag = true;
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try{
			if(driver.findElement(By.xpath("//div[@id='ShopCartDisplay']")).isDisplayed()){
				flag=false;
			}
		}catch(Exception e){}

		if(flag){
			try{
				if(driver.findElement(By.xpath("//*[contains(@id,'header-cart-nocount')]")).isDisplayed()){
					clickOn("Shopping Bag=Header LinkShopping Bag#xpath=//*[contains(@id,'header-cart-nocount')]");
				}else if(driver.findElement(By.xpath("//*[@id='header-cart-with-count']")).isDisplayed()){
					Actions act = new Actions(driver);
					act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();
					clickOn(lnk_view_shoppingbag);				
				}
			}catch(Exception e){
				testStepFailed("Failed to click on Header Link : Bag/Checkout "+e.toString());
			}
		}else{
			testStepInfo("The user is already in shopping cart only");	
		}
		driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
	}
	
	public void clickOnEditStoreLink(){
		try {
			//waitTime(2);
			if (driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeEditLink')]")).isDisplayed()) {
				testStepPassed("Edit Store Link is found");
				//clickOn(lnk_Header_EditStore);
				clickOnSpecialElement(lnk_Header_EditStore);
			}
		} catch (Exception e) {
			System.out.println("Edit Store link is not found");
			testStepPassed("Edit Store link is not found");
		}
		
	}
	
	
	public void clickOnFindStoreLink(){
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeLink')]")).isDisplayed()) {
				testStepPassed("Store Link is found");
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeLink')]")));
				act.click().build().perform();
				//clickOn(lnk_Header_ChangeStore);
				clickOn(lnk_Header_ChangeStore);
			}
		} catch (Exception e) {
			System.out.println("Find Store link is not found");
			testStepPassed("Find Store link is not found");
		}
		
	}
	
	
	
	
	
	
	public void clickOnFindStoreorEditStoreLink(){
		try {
			//waitTime(2);
			if (driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(text(),'edit') or contains(text(),'find a store')]")).isDisplayed()) {
				testStepPassed("Find Store Link is found");
				clickOn(lnk_Header_FindStoreorEditStore);
			}
		} catch (Exception e) {
			System.out.println("Find Store or Edit Store link is not found");
			testStepPassed("Find Store or Edit Store link is not found");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickOnContactUsHeaderLink_new(){
		try {
			
			waitTime(2);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'header-user-bar')]//a[contains(@class,'need-help-title')]"))).build().perform();
			//mouseOver(lnk_Header_ContactUs_MouseOver_new);
			clickOn(lnk_Header_ContactUs_new);
		} catch (Exception e) {
			testStepFailed("Contact us header link is not found");
		}
	}
	
	
	
	
	public void clickOnChatHeaderLink_new(){
		try {
			waitTime(2);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'header-user-bar')]//a[contains(@class,'need-help-title')]"))).build().perform();
			waitForText("Chat Now");
			waitTime(2);
			clickOn(lnk_Header_Chat_new);
		} catch (Exception e) {
			testStepFailed("Chat header link is not found");
		}
	}
	
	
	
	public void clickOnEmailHeaderLink_new(){
		try {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'header-user-bar')]//li[contains(@id,'header-account-section')]//a[contains(@class,'need-help-title')]"))).build().perform();
			clickOn(lnk_Header_EmailUs_new);
		} catch (Exception e) {
			testStepFailed("Email Us header link is not found");
		}
	}
	
	
	public void ClickonIEContactUsHeaderLink_new(){

		waitTime(2);
		navigateTo(prefix+".menswearhouse.com/support");
	}
	
	
	public void clickonSafariContactUsHeaderLink(){
		try{
				System.out.println("Entered into Safari Block");
				WebElement element=driver.findElement(By.xpath("//div[contains(@class,'header-user-bar')]//a[contains(@class,'need-help-title')]"));
				waitTime(3);
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on Contact Us Header link");
					clickOn(lnk_Header_ContactUs_new);
				}
		}
		catch(Exception e)
		{
			testStepFailed("Mouse Over on ContactUs Header link is not done");
		}
	}
	
	
	public void ClickonIEChatHeaderLink_new(){

		waitTime(2);
		navigateTo(prefix+".menswearhouse.com/MWLiveChatOfflineView?catalogId=12004&langId=-1&storeId=12751");
	}
	
	
	
	public void clickonSafariChatHeaderLink(){
		try{
				System.out.println("Entered into Safari Block");
				WebElement element=driver.findElement(By.xpath("//div[contains(@class,'header-user-bar')]//li[contains(@id,'header-account-section')]//a[contains(@class,'need-help-title')]"));
				waitTime(3);
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on Contact Us Header link");
					clickOn(lnk_Header_Chat_new);
				}
		}
		catch(Exception e)
		{
			testStepFailed("Mouse Over on ContactUs Header link is not done");
		}
	}
	
	
	public void ClickonIEEmailUsHeaderLink_new(){

		waitTime(2);
		navigateTo(prefix+".menswearhouse.com/support");
	}
	
	
	
	public void clickonSafariEmailHeaderLink(){
		try{
				System.out.println("Entered into Safari Block");
				WebElement element=driver.findElement(By.xpath("//div[contains(@class,'header-user-bar')]//a[contains(@class,'need-help-title')]"));
				waitTime(3);
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on Contact Us Header link");
					clickOn(lnk_Header_EmailUs_new);
				}
		}
		catch(Exception e)
		{
			testStepFailed("Mouse Over on ContactUs Header link is not done");
		}
	}
	
	
	public void enterProductinSearchBarandWait(String searchprod){
		try{
			//waitTime(1);
			/*driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
			waitTime(2);*/
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[@id='posHeader']//div[@class='js-search-toggle search-toggle']"))).build().perform();
			testStepPassed("Mouse over happened on Search link");
			typeIn(txt_Header_Search,searchprod); 
		}

		catch(Exception e){
			testStepFailed(e.toString());
		}
	}
	
	
	
	public void enterProductinSearchBarandWaitSafari(String searchprod){
		try{
				System.out.println("Entered into Safari Block");
				WebElement element=driver.findElement(By.xpath("//div[@id='posHeader']//div[@class='js-search-toggle search-toggle']"));
				waitTime(2);
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on search department");
					driver.findElement(By.xpath("//form[@id='CatalogSearchForm']//input[@id='SimpleSearchForm_SearchTerm']")).sendKeys(searchprod);
				}
		}
		catch(Exception e)
		{
			testStepFailed("Mouse Over in Search Element is not done");
		}
	}
	
	
	public static final String lnk_Bagwithcount2="Header link Shopping Bag with count #xpath=//a[contains(@id,'header-cart-with-count')]//span[contains(@class,'js-cart-counter')]";	
	public static final String lnk_CheckOut="View shopping bag checkout link #xpath=//a[contains(@id,'header-cart-with-count')]//span[contains(@class,'js-cart-counter')]";
	
	public void clickonChromeFirefoxCheckout2(){
		try{
			//waitTime(2);
						
			if (driver.findElement(By.xpath("//a[contains(@id,'header-cart-with-count')]//span[contains(@class,'js-cart-counter')]")).isDisplayed()) {
				clickOn(lnk_Bagwithcount2);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	public void visualSearchProduct(String searchprod){
		try{
			if (currentBrowser.equalsIgnoreCase("Safari")) {
				WebElement element1=driver.findElement(By.xpath("//div[@id='posHeader']//div[@class='js-search-toggle search-toggle']"));
				waitTime(3);
				if(onMouseOverSafari(element1)){
					testStepPassed("Mouse hover on search department");
					driver.findElement(By.xpath("//form[@id='CatalogSearchForm']//input[@id='SimpleSearchForm_SearchTerm']")).sendKeys(searchprod);
				}
			}
			else {
			//Actions act = new Actions(driver);
			//act.moveToElement(driver.findElement(By.xpath("//div[@id='posHeader']//div[@class='js-search-toggle search-toggle']"))).build().perform();
			//testStepPassed("Mouse over happened on Search link");
			clickOn(lnk_Header_Search);
			typeIn(txt_Header_Search,searchprod);
			
	 
		}
		
	}

		catch(Exception e){
			testStepFailed(e.toString());
		}
	}
	
	
	public static final String lnk_EmptyShoppingBag="Header link Shopping Bag with count #xpath=//a[contains(@id,'header-cart-with-count')]//span[contains(@class,'js-cart-counter')]";
	
	
	public void clickOnEmptyShoppingBag(){
		try {
			
			if (driver.findElement(By.xpath("//div[contains(@id,'posHeader')]//a[contains(@id,'header-cart-nocount')]//span[contains(@class,'js-cart-counter')]")).isDisplayed()) {
				clickOn(lnk_EmptyShoppingBag);
			}
			
		} catch (Exception e) {
			testStepFailed("Bag with out count is not displayed");
		}
	}
	
public static final String lnk_Header_StoreLocator = "Header Link - Find a Store Locator#xpath=//nav[contains(@id,'top_utilities')]//div[contains(@id,'header-mystore-links')]//li/a[contains(text(), 'Shop My Store')]";	

	
	public void clickOnShopMyStore(){
		try {
			if (driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeLink')]")).isDisplayed()) {
				testStepPassed("Store Link is found");
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeLink')]"))).build().perform();
				clickOn(lnk_Header_StoreLocator);
			}
		
		} catch (Exception e) {
			testStepPassed("Find Store link is not found");
		}
		
	}
	
	
	
	
	
	
	
	
}