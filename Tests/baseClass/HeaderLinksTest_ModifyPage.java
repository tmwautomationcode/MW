package baseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeaderLinksTest_ModifyPage extends FooterLinks {

	String defaultCurrency;

	public static final String lnk_Header_SignIn = "Header Link - SignIn#xpath=//a[contains(@id,'sign-in-link-header')]";
	//public static final String lnk_Header_SignOut = "Header Link - SignOut#xpath= //li[contains(@id,'header-account-section')]//a[contains(text(),'Sign Out')]";
	public static final String lnk_Header_Greeting = "Header Link - Greeting#xpath=//div[contains(@id,'header-user-greeting') or contains(@class,'header-user-greeting') or div[contains(@class,'name')]/div]";
	//public static final String lnk_Header_Greeting = "Header Link - Greeting#id=header-user-greeting";
	//public static final String lnk_Header_Greeting = "Header Link - Greeting css=[id=header-user-greeting]";
	public static final String lnk_Header_OrderHistory = "Header Link - Order History#xpath=//li[contains(@id,'header-account-section')]//a[contains(text(),'Order History')]";
	public static final String lnk_saveditemslink="header link saved items link #xpath=//li[contains(@id,'header-account-section')]//a[text()='Saved Items']";
	public static final String lnk_Header_AccountInfo = "Header Link - AccountInfo#xpath=//li[contains(@id,'header-account-section')]//*[contains(text(),'Account Info')]";
	public static final String lnk_ShippingTo="ShippingTo link#xpath=//a[@id='change-context']";
	public static final String sel_ShippingDest="shippingdestination#xpath=//select[@class='country-selection js-country-select']";
	public static final String btn_UpdateCountry="updatecountrycode#xpath=//a[(@id='context-chooser-submit') or text()='Update Country & Currency']";
	public static final String lnk_Cart="Header link cart#xpath=//a[@id='header-cart-with-count']";
	//public static final String lnk_Header_FindaStore = "Header Link - Find a Store #xpath=//nav[contains(@id,'top_utilities')]//a[contains(@id,'storeEditLink')]";
	public static final String lnk_Header_NeedHelp = "Header Link - NeedHelp #xpath=//nav[contains(@id,'top_utilities')]//a[contains(text(),'Need Help?') and contains(@class,'need-help-title')]";
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

	public HeaderLinksTest_ModifyPage(BaseClass obj) {
		super(obj);
	}
	public void clickOnSignIn(){
		try{
			clickOn(lnk_Header_SignIn);
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

	public void clickOnOrderHistory(){
		waitTime(2);
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
			navigateTo(prefix+".menswearhouse.com/TrackOrderStatus?orderStatusStyle=strong&catalogId=12004&langId=-1&storeId=12751");
		}
		else
		{
			waitTime(1);
			clickOn(lnk_Header_OrderHistory);
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
		waitTime(3);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
		}
		waitTime(2);
		if(currentBrowser.equalsIgnoreCase("internetexplorer")){
			navigateTo(prefix+".menswearhouse.com/AjaxLogonForm?catalogId=12004&langId=-1&storeId=12751");
		}
		else
		{
			clickOn(lnk_Header_AccountInfo);
		}
	}

	public void clickOnFindaStore(){
		clickOn(lnk_Header_FindaStore);
	}

	public void clickOnContactUs(){
		waitForElement(lnk_Header_NeedHelp);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(text(),'Need Help?') and contains(@class,'need-help-title')]"));
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

	/*****
	 ***Newly added method for Modify HeaderLinkTest****
	 ****/

	public void clickonContactUs(){
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//div[@class='top-header-help']/a[@class='need-help-title']"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Help'");
			}
		}else{
			mouseOver("Help#xpath=//div[@class='top-header-help']/a[@class='need-help-title']");
		}

		waitTime(3);
		clickOnSpecialElement(lnk_Header_ContactUs);
	}

	public void verifyContactUsPage()
	{
		waitForElementToDisplay("Country#xpath=//div[@class='contact-section-item']/../..//div[@class='contact-phone-item']/div[@class='contact-country']", elementLoadWaitTime);
		List<WebElement> country = driver.findElements(By.xpath("//div[@class='contact-section-item']/../..//div[@class='contact-phone-item']/div[@class='contact-country']"));
		List<WebElement> telephone = driver.findElements(By.xpath("//div[@class='contact-section-item']/../..//div[@class='contact-phone-item']/div[@class='contact-phone']"));
		if(isElementDisplayed("Telephone#xpath=//div[@class='contact-section-item']/../..//div[@class='contact-phone-item']/div[@class='contact-phone']"))
		{
			testStepPassed("Contact Us content page is displayed");
			for(int i=0;i<country.size();i++)
			{
				if(isElementDisplayed("Country#xpath=//div[@class='contact-section-item']/../..//div[@class='contact-phone-item']/div[@class='contact-country']")||
						isElementDisplayed("Telephone#xpath=//div[@class='contact-section-item']/../..//div[@class='contact-phone-item']/div[@class='contact-phone']"))

				{
					testStepPassed(" \""+country.get(i).getText()+" \"" +  " \""+telephone.get(i).getText()+"\"");

				}else
				{
					testStepFailed("Country and TelePhone details not displayed");
				}

			}
		}
		else
		{
			testStepFailed("Contact us content page not displayed");
		}

	}

	public void clickOnFindStore(){
		clickOn(lnk_Header_FindaStore);
		if(isElementDisplayed("Google Map#xpath=//div[@id='store_locator_map']"
				+ "/div[@class='gm-style'][2]"
				+ "/descendant::div[@style='position: absolute; left: 0px; top: 0px; z-index: 3; width: 100%; height: 100%;']")
				||isElementDisplayed("FIND#xpath=//input[@value='Find']"))
		{
			testStepPassed("'Find a store' landing page is displayed");
		}else
		{
			testStepFailed("'Find a store' landing page not displayed");
		}

	}
	public void clickOnMWRecommendations(){
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
			clickOn("Account Info#xpath=//a[contains(text(),'Account Info')]");
			waitForElementToDisplay("MW Recommendations#xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'MW Recommendations')]", elementLoadWaitTime);
			if(isElementDisplayed("MW Recommendations#xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'MW Recommendations')]")){
				clickOn("MW Recommendations#xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'MW Recommendations')]");
				waitForElementToDisplay("MW Recommendations Page#xpath=//div[@id='mwrecs']/div[@class='mw-recs-zone']", elementLoadWaitTime);
				if(isElementDisplayed("MW Recommendations Page#xpath=//div[@id='mwrecs']/div[@class='mw-recs-zone']"))
				{
					testStepPassed("MW Recommendations page is displayed");
				}else
				{
					testStepFailed("MW Recommendations page not displayed");
				}
			}else
			{
				testStepFailed("MW Recommendations not displayed");
			}

		}catch(Exception e){
			testStepFailed("AccountInfo failed : " +e.toString());
		}
	}


	public void verifyPerfectFitRewardsPageContent(){
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
			if(isElementDisplayed("Perfect fit id#xpath=//div[@class='pf-id']/p"))
			{
				testStepPassed("'Join Perfect Fit Rewards'" + " \""+getText("Perfect fit id#xpath=//div[@class='pf-id']/p")+"\"" + " content page is displayed");
			}else
			{
				testStepFailed("'Join Perfect Fit Rewards' Perfect fit rewards content page not displayed");
			}

		}
	}

	public void verfiyAccountDashboard(){
		waitTime(3);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.id("header-user-greeting"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
		}else{
			mouseOver(lnk_Header_Greeting);
		}
		waitTime(2);
		if(currentBrowser.equalsIgnoreCase("internetexplorer")){
			navigateTo(prefix+".menswearhouse.com/AjaxLogonForm?catalogId=12004&langId=-1&storeId=12751");
		}
		else
		{
			clickOn(lnk_Header_AccountInfo);
			waitTime(3);
			if(isElementDisplayed("No Orders#xpath=//div[@class='no-orders']/p"))

			{
				testStepPassed("Account dashboard page is displayed : " + "\""+getText("No Orders#xpath=//div[@class='no-orders']/p")+"\"");
			}else if(isElementDisplayed("Order Number#xpath=//td[@class='order-num']/a"))
			{
				testStepPassed("Account dashboard page is displayed : " + "\""+getText("Order Number#xpath=//td[@class='order-num']/a")+"\"");
			}else
			{
				testStepFailed("Account dashboard page not displayed");
			}
		}
	}

	public void clickOnLiveChat(){
		waitTime(3);
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//div[@class='top-header-help']/a[@class='need-help-title']"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - NeedHelp'");
			}
		}else{
			mouseOver("Help#xpath=//div[@class='top-header-help']/a[@class='need-help-title']");
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

	public void verifyAndCloseChatWindow(){
		try
		{
			String Parentwindow = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles()){
				if(!winHandle.equalsIgnoreCase(Parentwindow)){
					driver.switchTo().window(winHandle);
					waitTime(5);
					if(driver.getTitle().equalsIgnoreCase("Live Chat")||driver.getCurrentUrl().contains("chat")){	
						testStepPassed("Chat Link is navigated to its corresponding page");
						break;

					}else{
						testStepFailed("Chat Link is not navigated to its corresponding page");
					}
				}

			}
			driver.close();
			waitTime(5);
			driver.switchTo().window(Parentwindow);
			clickOnSignOut();

		}catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
}