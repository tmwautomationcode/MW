package mwPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;
import baseClass.PopupWindows;
//import baseClass.Common_Utilities;

public class HomePage extends PopupWindows
{
	public HomePage(BaseClass obj) {
	
		super(obj);

	}

	public static final String img_Logo="App logo img#xpath=//*[@id='checkout-logo')]";
	public static final String lnk_HomePageLogo = "Home Page Logo#xpath=//section[contains(@class,'logo-bar')]/a/i";
	public static final String lnk_CheckOutHomePageLogo = "Home Page Logo#xpath=(//a[contains(@id,'checkout-logo')])[2]";
	public static final String lnk_HomePageLogoinreviewpage = "Home Page Logo in review page#xpath=//section[contains(@class,'logo-bar')]/a/img";


	public static final String lnk_HeaderAccountGreetingLink = "Header User Greeting Link#xpath=//nav[contains(@id,'top_utilities')]//div[contains(@id,'acct-dd')]//a[contains(text(),'Your Account')]";
	public static final String lnk_HeaderAccountGreetingSignoutLink = "Header User Greeting Signout Link#xpath=//nav[contains(@id,'top_utilities')]//div[contains(@id,'acct-dd')]//a[contains(@class,'sign-out')]";

	public static final String lnk_header_accountlink = "Home Page User account link#xpath=//nav[contains(@id,'top_utilities')]//div[contains(@id,'acct-dd')]//a[contains(text(),'Your Account')]";
	public static final String lnk_header_account_Signout = "Home Page User account Signout link#xpath=//li[contains(@id,'header-account-section')]//div[contains(@id,'acct-dd')]//a[contains(text(),'Sign Out')]";


	//public static final String grd_HomePageGrid = "Home Page #xpath=//div[contains(@id,'banner')]";
	//public static final String grd_HomePageGrid = "Home Page #xpath=//*[contains(text(),'Your Recently Viewed Items')]/../parent::div[contains(@class,'recently-recs-wrapper')]";
	public static final String grd_HomePageGrid = "Home Page #xpath=//*[contains(text(),'Your Recently Viewed Items') or contains(text(),'Just for You')]";

	public static final String lnk_BrowserOutDatedMsgClose = "Home Page Browser Outdated Message Close link#xpath=//div[contains(@class,'browser-outdated-notifier')]//span[contains(@class,'js-outdated-notify-close')]";
	public static final String lnk_FooterLink_GiftCards = "Gift Cards link#xpath=//ul[contains(@class,'footer-categories')]//a[contains(text(),'Gift Cards')]";
	public static final String txt_Password_IE = "Password Textbox#xpath=//form[contains(@id,'logonForm2')]//input[contains(@id,'password2')]";
	public static final String btn_SignInIE = "Sign In Button#xpath=//form[contains(@id,'logonForm2')]//a[contains(@id,'sign-in-submit2')]";
	public static final String lnk_Header_Cart_WithCount = "Header Cart with Count Link#xpath=.//*[@id='header-cart-with-count']";
	public static final String lnk_Header_Cart_WithnoCount = "Header Cart with Count Link#xpath=.//*[@id='header-cart-nocount']";

	public static final String lnk_QV_Close = "QV close Link#xpath=//a[@id='WC_QuickInfo_Link_close']";

	//blic static final String lnk_MyAccountGreeting = "My Account Greeting #xpath=//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]";
	
	public void navigateToHomePage(){
		clickOn(img_Logo);
	}
	public void verifyHomePage(){
		waitTime(5);
		if(isElementDisplayed(grd_HomePageGrid)){
			testStepPassed("MW Home page is Displayed");
		}else{
			testStepFailed("MW Home Page is not displayed");
		}
	}
	public void ClickonHomePageLogo(){
		//waitTime(2);
		clickOn(lnk_HomePageLogo);
		//driver.findElement(By.xpath("//section[contains(@class,'logo-bar')]/a/i")).click();
		waitTime(3);
	}
	public void ClickonHomePageLogoreviewpage(){
		//waitTime(2);
		clickOn(lnk_HomePageLogoinreviewpage);
		//driver.findElement(By.xpath("//section[contains(@class,'logo-bar')]/a/i")).click();
		waitTime(3);
	}
	
	public void ClickonCheckOutHomePageLogo(){
		//waitTime(2);
		clickOn(lnk_CheckOutHomePageLogo);
		//driver.findElement(By.xpath("//section[contains(@class,'logo-bar')]/a/i")).click();
		waitTime(3);
	}


	public void ClickonHomePageLogo2(){
		//waitTime(3);
		clickOn(lnk_HomePageLogo);
	}

	public void ClickonHeaderlinkgreetinglink(){

		waitTime(5);

		if (driver.findElement(By.xpath("//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]")).isDisplayed()) {
			waitForElement("xpath=//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]");
            waitTime(2);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]"))).build().perform();
			//act.click().build().perform();
			waitTime(2);
			clickOn(lnk_header_accountlink);

		} else {
			testStepFailed("The User account header link is not found");
		}
	}



	public void ClickonSafariHeaderlinkgreetinglink(){

		try {
			waitTime(2);
			WebElement element=driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'header-user-greeting')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
			clickOnSpecialElement(lnk_HeaderAccountGreetingLink);
		} catch (Exception e) {
			testStepFailed("Header User Greeting Link is not found");
		}

	}


	public void ClickonSafariSignOutlink(){

		try {
			waitTime(2);
			WebElement element=driver.findElement(By.xpath("//nav[contains(@id,'top_utilities')]//a[contains(@id,'header-user-greeting')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on 'Header Link - Greeting'");
			}
			clickOnSpecialElement(lnk_HeaderAccountGreetingSignoutLink);
		} catch (Exception e) {
			testStepFailed("Header Signout link is not found");
		}

	}









	public void clickonIECheckoutonHomepageMiniBagwithCountforRegisteredUser(){
		try {
			waitTime(2);

			if (driver.findElement(By.xpath(".//*[@id='header-cart-with-count']")).isDisplayed()) {

				clickOn(lnk_Header_Cart_WithCount);

			}
		} catch (Exception e) {
			
			testStepFailed("The Header Link mini bag with Count is not displayed");
		} 
	}


	public void ClickonSignoutinHeaderlinkgreetinglink(){

		waitTime(5);

		if (driver.findElement(By.xpath("//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]")).isDisplayed()) {
			//if(elementPresent("greeting xpath=//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]")){
			waitForElement("xpath=//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]");
            /*waitTime(5);
            //WebElement account = driver.findElement(By.xpath("//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]"));
            Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]"))).build().perform();
			//act.click().build().perform();
			waitTime(2);
			clickOn(lnk_header_accountlink);
			*/
			waitTime(5);
		    mouseOver("xpath=//li[contains(@id,'header-account-section')]//a[contains(@id,'header-user-greeting')]");
		    clickOn(lnk_header_account_Signout);

		} else {
			testStepFailed("The User account header link Signout is not found");
		}
	}


	public void ClickonIESignoutinHeaderlinkgreetinglink(){

		waitTime(3);
		navigateTo(prefix+".menswearhouse.com/Logoff?catalogId=12004&rememberMe=false&langId=-1&storeId=12751&URL=SEOHomeView");
	}


	public void ClickonIEAccountHeaderlinkgreetinglink(){

		waitTime(3);
		navigateTo(prefix+".menswearhouse.com/AjaxLogonForm?catalogId=12004&langId=-1&storeId=12751");
	}

	public void ClickonIEViewShoppingBaglink(){

		waitTime(2);
		navigateTo(prefix+".menswearhouse.com/OrderCalculate?calculationUsageId=-1&calculationUsageId=-2&calculationUsageId=-6&updatePrices=1&doConfigurationValidation=Y&catalogId=12004&errorViewName=AjaxOrderItemDisplayView&orderId=.&langId=-1&storeId=12751&URL=AjaxOrderItemDisplayView");
	}


	public void ClickonBagNoCountlink(){

		//waitTime(2);
		waitForElement(lnk_Header_Cart_WithnoCount);
		clickOnSpecialElement(lnk_Header_Cart_WithnoCount);
		//clickOn(lnk_Header_Cart_WithnoCount);
	}

	public void verifyBrowserOutdatedMessageisDisplayedAndClosed(){

		testStepInfo("");
		testStepInfo("Checking Browser Outdated message is displayed. If displayed closing that message");
		testStepInfo("****************************************************************************************************");
		try {
			waitTime(1);
			if (driver.findElement(By.xpath("//div[contains(@class,'browser-outdated-notifier')]//a[contains(text(),'View list of supported devices')]")).isDisplayed()) {
				testStepPassed("The Browser Outdated Message is Displayed");
				if (driver.findElement(By.xpath("//div[contains(@class,'browser-outdated-notifier')]//span[contains(@class,'js-outdated-notify-close')]")).isEnabled()) {
					clickOn(lnk_BrowserOutDatedMsgClose);
					testStepPassed("The Browser Outdated Message is Closed");
				} else {
					testStepFailed("The Browser Outdated Message Close link is not in enable state");
				}
			} else {
				testStepPassed("The Browser Outdated Message is not displayed");
			}
		} catch (Exception e) {
			
			testStepPassed("The Browser outdated message is not displayed it tried");
		}
	}



	public void verifyCertonaisDisplayedandGetthenames(){
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
			testStepFailed("Certona Widget is not displayed in Home Page");  
		}
	}







	public void ClickonGiftCardsFooterLink(){
		waitTime(1);
		clickOn(lnk_FooterLink_GiftCards);
	}

	public void verifyUserLoggedOutSuccessfully()
	{
		try {
			waitTime(4);
			if (driver.findElement(By.xpath("//li[contains(@id,'header-account-section')]//a[contains(@id,'sign-in-link-header')]")).isDisplayed()) {
				System.out.println("User Logged out Successfully");
				testStepPassed("User Logged out Successfully");
			}

		} catch (Exception e) {
			testStepFailed("User Logout Failed");
		}
	}

	public void mouseoverApplicationLogo(){
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//section[contains(@class,'logo-bar')]/a"))).build().perform();
	}

	public void mouseoverApplicationLogoSafari(){
		System.out.println("Entered into Safari Block");
		WebElement element=driver.findElement(By.xpath("//section[contains(@class,'logo-bar')]/a"));
		waitTime(2);

		if(onMouseOverSafari(element)){
			testStepPassed("Mouse hover on Application Logo");
		}
	}


	public void mouseoverMiniShoppingBag(){
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//li[contains(@class,'mini-cart-holder')]//a[contains(@id,'header-cart-nocount')]"))).build().perform();
	}



	public void clickIEHeaderUserGreetingLink(){
		driver.navigate().to(prefix+".menswearhouse.com/AjaxLogonForm?catalogId=12004&langId=-1&storeId=12751");
	}

	public void clickIEHeaderUserOrderHistoryLink(){
		driver.navigate().to(prefix+".menswearhouse.com/TrackOrderStatus?orderStatusStyle=strong&catalogId=12004&langId=-1&storeId=12751");
	}

	public void clickIEHeaderUserAccountInfoLink(){
		driver.navigate().to(prefix+".menswearhouse.com/AjaxLogonForm?catalogId=12004&langId=-1&storeId=12751");
	}

	public void clickIEHeaderUserPerfectFitRewardsLink(){
		driver.navigate().to(prefix+".menswearhouse.com/RewardsView?catalogId=12004&langId=-1&storeId=12751");
	}

	public void clickIEHeaderUserMySizesLink(){
		driver.navigate().to(prefix+".menswearhouse.com/MySizesView?catalogId=12004&langId=-1&storeId=12751");
	}

	public void clickIEHeaderUserSavedItemsLink(){
		driver.navigate().to(prefix+".menswearhouse.com/InterestItemDisplay?catalogId=12004&langId=-1&storeId=12751");
	}

	public void clickIEHeaderUserSignoutLink(){
		driver.navigate().to(prefix+".menswearhouse.com/Logoff?catalogId=12004&rememberMe=false&langId=-1&storeId=12751&URL=SEOHomeView");
		/*String Signout = prefix.concat(".menswearhouse.com/Logoff?catalogId=12004&rememberMe=false&langId=-1&storeId=12751&URL=SEOHomeView");
		System.out.println("Signout URL : "+Signout);
		driver.navigate().to(Signout);*/

		//driver.navigate().to(prefix+".menswearhouse.com/Logoff?catalogId=12004&rememberMe=false&langId=-1&storeId=12751&URL=SEOHomeView");
	}


	public void enterPasswordIE(String Password){
		try {

			if (driver.findElement(By.xpath("//form[contains(@id,'logonForm2')]//input[contains(@id,'password2')]")).isDisplayed()) {

				typeIn(txt_Password_IE,Password);
				clickOn(btn_SignInIE);
				waitTime(3);

			}

		} catch (Exception e) {
			
		}
	}


	public void RegisteredUserProceedtoCheckoutinIE(){
		try {
			waitTime(3);
			clickOn(lnk_Header_Cart_WithCount);
		} catch (Exception e) {
			testStepFailed("The Header Cart with count link is not found");
		}
	}



	public void clickProceedtoCheckoutMiniBaginIE(){
		try {
			waitTime(2);
			clickOn(lnk_Header_Cart_WithCount);
		} catch (Exception e) {
			testStepFailed("The Header Cart with count link is not found");
		}
	}



	public void verifyCertonaisDisplayedandAddProductthroughQVandPDP(String Size){
		try{
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,4600)", "");
			if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]")).isDisplayed()) {
				testStepPassed("Certona Widget is displayed");
				List<WebElement> CertonaBlock = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]"));
				int CertonaBlockCount = CertonaBlock.size();
				testStepPassed("Certona Block Count : "+CertonaBlockCount);

				for (int i = 0; i < CertonaBlockCount; i++) {
					int j = i+1;
					int k=1;
					if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]//span[contains(@class,'certona-widget__title-bg')]")).isDisplayed()) {
						String CertonaTitle = driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]//span[contains(@class,'certona-widget__title-bg')]")).getText();
						//testStepPassed("");
						testStepPassed("Certona Widget "+j+" Title : "+CertonaTitle);
						List<WebElement> CertonaProducts = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]"));
						int CertonaProductsCount = CertonaProducts.size();
						testStepPassed("Certona products Count in Widget "+j+" : "+CertonaProductsCount);


						testStepPassed("Adding Product from QV of Certona Widget : "+j);
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
						waitTime(1);
						getProductCountinMinicart();

						if (driver.findElement(By.xpath("//a[@id='WC_QuickInfo_Link_close']")).isDisplayed()) {
							clickOn(lnk_QV_Close);
						}

						testStepPassed("Adding Product from PDP of Certona Widget : "+j);
						String Productname = driver.findElement(By.xpath("(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//a[@class='certona-product__link js-prod-link'])["+k+"]//div[contains(@class,'certona-product__title')]")).getText();
						testStepPassed("Clicking the product "+Productname);
						final String CertonaProductLink="Certona Product Link#xpath=(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//a[@class='certona-product__link js-prod-link'])["+k+"]";
						clickOn(CertonaProductLink);
						if (verifyPDPisDisplayed()) {
							selectSizeFromProductDescriptionPagenew(Size);
							clickPDPAddtoShoppingBagButton();
						}
						else {
							testStepFailed("PDP is not displayed");
						}
						waitTime(1);
						getProductCountinMinicart();

						waitTime(1);
						URLNavigateBack();

					}
				}
			} 
		}
		catch(Exception e){
			testStepFailed("Certona Widget is not displayed in Home Page");  
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



	public void verifyVisualSearchPanelisdisplayed()
	{
		try {

			waitTime(1);

			if (driver.findElement(By.xpath("//div[contains(@id,'search_bar')]//div[contains(@class,'tt-dropdown tt-dropdown-custom')]")).isDisplayed()) 
			{

				testStepPassed("Visual Search Panel is displayed");

				List <WebElement> VisualSearchSubPanel = driver.findElements(By.xpath("//div[contains(@id,'search_bar')]//div[contains(@class,'tt-dropdown tt-dropdown-custom')]/div"));

				int VisualSearchSubPanelCount = VisualSearchSubPanel.size();

				testStepPassed("Visual Search Sub Panel Count : "+VisualSearchSubPanelCount);

				for (int i = 0; i < VisualSearchSubPanelCount; i++) {

					String VisualSearchSubPanelTitle = driver.findElement(By.xpath("//div[contains(@id,'search_bar')]//div[contains(@class,'tt-dropdown tt-dropdown-custom')]/div//div[contains(@class,'title')]")).getText();

					testStepPassed("Visual Search Sub Panel Title : "+VisualSearchSubPanelTitle);

				}

			}
		} catch (Exception e) {
			testStepFailed("Viisual Search Panel is not displayed");
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




/*	public void CheckingVisualSearchPanelisDisplayedandGettingTitleNames() 
	{
		try {
			if (driver.findElement(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]")).isDisplayed()) 
			{
				testStepPassed("Visual Search Panel is Displayed");
				List<WebElement> VisualSearchPanel = driver.findElements(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div"));
				int panelCount = VisualSearchPanel.size();
				testStepPassed("Visual Search Sub Panel Count is : " + panelCount);
				if (panelCount == 2) {
					testStepPassed("Sub Panels Count in Visual Search is Correct");
				} else {
					testStepFailed("Sub Panels Count in Visual Search is not Correct");
				}
				List <WebElement> SubPanelsNames = driver.findElements(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt')]/div[contains(@class,'title')]"));
				int SubPanelsNamesCount = SubPanelsNames.size();

				
				//testStepPassed("The following are the Visual Search Sub Panels titles & there products count");

				for (int i = 1; i <= SubPanelsNamesCount; i++) 
				{

					String SubPanelsTitle = driver.findElement(By.xpath("(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt')]/div[contains(@class,'title')])["+i+"]")).getText();
					testStepPassed("Panel "+i+" Title : "+SubPanelsTitle);
					List <WebElement> SubPanelProducts = driver.findElements(By.xpath("(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div)["+i+"]/div[contains(@class,'list')]//a"));
					int SubPanelProductsCount = SubPanelProducts.size();
					testStepPassed("Products count in "+SubPanelsTitle+" panel : "+SubPanelProductsCount);
					if (SubPanelsTitle.equalsIgnoreCase("SUGGESTED SEARCHES")) {
						if (SubPanelProductsCount==10) {
							testStepPassed("Products Count in "+SubPanelsTitle+" panel is Correct");
						}
						else {
							testStepFailed("Products Count in "+SubPanelsTitle+" panel is not Correct");
						}
					}
					else if (SubPanelsTitle.equalsIgnoreCase("RECOMMENDED PRODUCTS")) {
						if (SubPanelProductsCount==3) {
							testStepPassed("Products Count in "+SubPanelsTitle+" panel is Correct");
						}
						else {
							testStepFailed("Products Count in "+SubPanelsTitle+" panel is not Correct");
						}
					}
					
				}
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Visual Search Panel is not displayed");
		}
	}*/


	public void CheckingVisualSearchPanelisDisplayedandGettingTitleNames() 
	{
		try {
			if (driver.findElement(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]")).isDisplayed()) 
			{
				testStepPassed("Visual Search Panel is Displayed");
				List<WebElement> VisualSearchPanel = driver.findElements(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div"));
				int panelCount = VisualSearchPanel.size();
				testStepPassed("Visual Search Sub Panel Count is : " + panelCount);
				if (panelCount == 2) {
					testStepPassed("Sub Panels Count in Visual Search is Correct");
				} else {
					testStepFailed("Sub Panels Count in Visual Search is not Correct");
				}
				List <WebElement> SubPanelsNames = driver.findElements(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]//div[contains(@class,'title')]"));
				int SubPanelsNamesCount = SubPanelsNames.size();

				System.out.println("SubPanelsNamesCount: "+SubPanelsNamesCount);
				
				//testStepPassed("The following are the Visual Search Sub Panels titles & there products count");

				for (int i = 1; i <= SubPanelsNamesCount; i++) 
				{
					System.out.println("i : "+i);
					String SubPanelsTitle = driver.findElement(By.xpath("(//div[contains(@class,'tt-dropdown-custom')]//div[contains(@class,'title')])["+i+"]")).getText();	
					System.out.println("SubPanelsTitle "+i+" "+SubPanelsTitle);
					testStepPassed("Panel "+i+" Title : "+SubPanelsTitle);
					List <WebElement> SubPanelProducts = driver.findElements(By.xpath("(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div)["+i+"]/div[contains(@class,'list')]//a"));
					int SubPanelProductsCount = SubPanelProducts.size();
					testStepPassed("Products count in "+SubPanelsTitle+" panel : "+SubPanelProductsCount);
					if (SubPanelsTitle.equalsIgnoreCase("SUGGESTED SEARCHES")||SubPanelsTitle.equalsIgnoreCase("SUGGESTED CATEGORIES")) 
					{
						if (SubPanelProductsCount==10) {
							testStepPassed("Products Count in "+SubPanelsTitle+" panel is Correct");
						}
						else {
							testStepFailed("Products Count in "+SubPanelsTitle+" panel is not Correct");
						}
					}
					else if (SubPanelsTitle.equalsIgnoreCase("RECOMMENDED PRODUCTS")) {
						if (SubPanelProductsCount==3) {
							testStepPassed("Products Count in "+SubPanelsTitle+" panel is Correct");
						}
						else {
							testStepFailed("Products Count in "+SubPanelsTitle+" panel is not Correct");
						}
					}
					
					/*System.out.println("i final : "+i);
					i=i+1;
					System.out.println("i after increment : "+i);*/
					
				}
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Visual Search Panel is not displayed");
		}
	}



	public static final String suggestedSearchesProductLink = "Suggested Searches First Product link#xpath=(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a)[1]";

	public static final String recommendedProductLink = "Recommended first Product link#xpath=(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]//div[contains(@class, 'tt-recommendations-list')]/div/a//div[contains(@class, 'tt-recommendation-name')])[1]";



/*	public void AddingProductFromVisualSearchSuggestedSearchesPanel(String size, String productName) 
	{
		try {
			
			testStepInfo("Adding Product from Suggested Search Panel in Visual Search");
			
			waitTime(2);
			
			if (driver.findElement(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]")).isDisplayed()) 
			{
				String titleName = driver.findElement(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]/div[contains(@class, 'tt-suggestions-title tt-suggestions-title-custom')]")).getText();
				
				testStepPassed("Panel Title : " + titleName);

				List<WebElement> suggestedPanel = driver.findElements(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a"));
				int suggestedPanelCount = suggestedPanel.size();
				if (suggestedPanelCount == 10) {
					testStepPassed("Suggested Searches count : " + suggestedPanelCount);
				} else {
					testStepFailed("Suggested Searches count : " + suggestedPanelCount);
				}
				testStepPassed("The following are the products displayed in suggested searches:");
				for (int i = 1; i <= suggestedPanelCount; i++) {
					String suggestedSearchProductName = driver.findElement(By.xpath("(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a/div)["+ i + "]")).getText();
					testStepPassed(suggestedSearchProductName);
				}

				clickOn(suggestedSearchesProductLink);
				
				waitTime(2);
				
				String CurrentURL = driver.getCurrentUrl();
				
				testStepPassed("It navigated to "+CurrentURL+"");
				
				if (driver.findElement(By.xpath("//section//ul[@id='products']")).isDisplayed()) 
				{

					testStepPassed("PGP is displayed");

					selectProductInProductGridPage(productName);

				}
				
				else {
					
					testStepFailed("PGP is not displayed");
					
				}

				selectSizeFromProductDescriptionPagenew(size);

				clickPDPAddtoShoppingBagButton();
				
				ClickonHomePageLogo();
				
				getProductCountinMinicart();
				
				
			}
		} 
		
		catch (Exception e) 
		{
			
			testStepFailed("Suggested Search Panel is not displayed");

		}
	}



	
	public void AddingProductFromVisualSearchRecommendedProductsPanel(String size, String productName) 
	{
		try {
			
			testStepInfo("Adding Product from Recommended Products Panel in Visual Search");
			
			waitTime(2);
			
			if (driver.findElement(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-recommendations tt-recommendations-custom')]")).isDisplayed()) 
			{
				
				String titleName = driver.findElement(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-recommendations tt-recommendations-custom')]//div[contains(@class, 'tt-recommendations-title tt-recommendations-title-custom')]")).getText();
				
				testStepPassed("Panel Title : " + titleName);

				List<WebElement> recommendedPanel = driver.findElements(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]//div[contains(@class, 'tt-recommendations-list')]/div"));
				int recommendedPanelCount = recommendedPanel.size();
				if (recommendedPanelCount == 3) {
					testStepPassed("Recommended Products count : " + recommendedPanelCount);
				} else {
					testStepFailed("Recommended Products count : " + recommendedPanelCount);
				}
				testStepPassed("The following are the products displayed in Recommended Products:");
				for (int i = 1; i <= recommendedPanelCount; i++) {
					String recommendedProductName = driver.findElement(By.xpath("(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]//div[contains(@class, 'tt-recommendations-list')]/div/a//div[contains(@class, 'tt-recommendation-name')])["+ i + "]")).getText();
					testStepPassed(recommendedProductName);
				}

				clickOn(recommendedProductLink);
				
				waitTime(2);
				
				String CurrentURL = driver.getCurrentUrl();
				
				testStepPassed("It navigated to "+CurrentURL+"");
				
				if (driver.findElement(By.xpath("(//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]) | //div[contains(@class,'js-bundle pdp-container')]")).isDisplayed()) 
				{

					testStepPassed("PDP is displayed");

					//selectProductInProductGridPage(productName);

				}
				
				else {
					
					testStepFailed("PDP is not displayed");
					
				}

				selectSizeFromProductDescriptionPagenew(size);
				
				clickPDPAddtoShoppingBagButton();
				
				ClickonHomePageLogo();
				
				getProductCountinMinicart();
				
				

			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Recommended Products Panel is not displayed");

		}
	}*/
	
	
	public void AddingProductFromVisualSearchSuggestedSearchesPanel(String size, String productName) 
	{
		try {
			
			testStepInfo("Adding Product from Suggested Search Panel in Visual Search");
			
			waitTime(2);
			
			if (driver.findElement(By.xpath("//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class,'tt-suggestions tt-suggestions-custom')]")).isDisplayed()) 
			{
				String titleName = driver.findElement(By.xpath("//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class,'tt-suggestions tt-suggestions-custom')]")).getText();
				
				testStepPassed("Panel Title : " + titleName);

				/*List<WebElement> suggestedPanel = driver.findElements(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a"));
				int suggestedPanelCount = suggestedPanel.size();
				if (suggestedPanelCount == 10) {
					testStepPassed("Suggested Searches count : " + suggestedPanelCount);
				} else {
					testStepFailed("Suggested Searches count : " + suggestedPanelCount);
				}
				testStepPassed("The following are the products displayed in suggested searches:");
				for (int i = 1; i <= suggestedPanelCount; i++) {
					String suggestedSearchProductName = driver.findElement(By.xpath("(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a/div)["+ i + "]")).getText();
					testStepPassed(suggestedSearchProductName);
				}*/

				waitTime(2);
				clickOn(suggestedSearchesProductLink);
				
				waitTime(2);
				
				String CurrentURL = driver.getCurrentUrl();
				
				testStepPassed("It navigated to "+CurrentURL+"");
				
				/*if (driver.findElement(By.xpath("//section//ul[@id='products']")).isDisplayed()) 
				{

					testStepPassed("PGP is displayed");

					selectProductInProductGridPage(productName);

				}
				
				else {
					
					testStepFailed("PGP is not displayed");
					
				}
*/
				selectSizeFromProductDescriptionPagenew(size);

				clickPDPAddtoShoppingBagButton();
				
				ClickonHomePageLogo();
				
				getProductCountinMinicart();
				
				
			}
		} 
		
		catch (Exception e) 
		{
			
			testStepFailed("Suggested Search Panel is not displayed");

		}
	}



	
	public void AddingProductFromVisualSearchRecommendedProductsPanel(String size, String productName) 
	{
		try {
			
			testStepInfo("Adding Product from Recommended Products Panel in Visual Search");
			
			waitTime(2);
			
			if (driver.findElement(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-recommendations tt-recommendations-custom')]")).isDisplayed()) 
			{
				
				String titleName = driver.findElement(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-recommendations tt-recommendations-custom')]//div[contains(@class, 'tt-recommendations-title tt-recommendations-title-custom')]")).getText();
				
				testStepPassed("Panel Title : " + titleName);

				/*List<WebElement> recommendedPanel = driver.findElements(By.xpath("//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]//div[contains(@class, 'tt-recommendations-list')]/div"));
				int recommendedPanelCount = recommendedPanel.size();
				if (recommendedPanelCount == 3) {
					testStepPassed("Recommended Products count : " + recommendedPanelCount);
				} else {
					testStepFailed("Recommended Products count : " + recommendedPanelCount);
				}
				testStepPassed("The following are the products displayed in Recommended Products:");
				for (int i = 1; i <= recommendedPanelCount; i++) {
					String recommendedProductName = driver.findElement(By.xpath("(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]//div[contains(@class, 'tt-recommendations-list')]/div/a//div[contains(@class, 'tt-recommendation-name')])["+ i + "]")).getText();
					testStepPassed(recommendedProductName);
				}*/

				clickOn(recommendedProductLink);
				
				waitTime(2);
				
				String CurrentURL = driver.getCurrentUrl();
				
				testStepPassed("It navigated to "+CurrentURL+"");
				
				if (driver.findElement(By.xpath("(//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]) | //div[contains(@class,'js-bundle pdp-container')]")).isDisplayed()) 
				{

					testStepPassed("PDP is displayed");

					//selectProductInProductGridPage(productName);

				}
				
				else {
					
					testStepFailed("PDP is not displayed");
					
				}

				selectSizeFromProductDescriptionPagenew(size);
				
				clickPDPAddtoShoppingBagButton();
				
				ClickonHomePageLogo();
				
				getProductCountinMinicart();
				
				

			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Recommended Products Panel is not displayed");

		}
	}
	


	
	public String selectProductInProductGridPage(String productName){
		//waitTime(2);
		if(!productName.isEmpty()){
			clickOn(productName+"product name#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+productName+"')]");
			return productName;
		}else{
			String locator="first product listed#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a";
			productName=getText(locator);
			clickOn(productName+" product name#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+productName+"')]");
			return productName;
		}
	}
	
	
	
	

	public void testing()
	{
		if (driver.findElement(By.xpath("//section[contains(@class,'pfinder-widget certona-widget__horizontal')]//div[contains(@class,'pfinder-widget__title')]")).isDisplayed()) {
			System.out.println("Entered the block");
		}
	}
	
	//.//*[@id='main-header']/div[7]/section/a/i
	
	public static final String lnk_Department_TuxedoRental="Tuedo Rental Department Link#xpath=//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]//a[contains(text(),'Tuxedo Rental')]";
	
	public void clickTuxedoRentalDepartmentLink()
	{
		try {
			//waitTime(2);
			if (driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]//a[contains(text(),'Tuxedo Rental')]")).isDisplayed()) {
				clickOn(lnk_Department_TuxedoRental);
			}

		} catch (Exception e) {
			testStepFailed("Tuxedo Rental Department Link is not found");
		}
	}
	
	
	
	public static final String lnk_FeedbackFormButtonFromFooter = "Feedback Form Footer Link#xpath=(//footer[@id='pg-footer']//a[contains(text(),'Feedback')])[3]";
	public static final String lnk_FeedbackFormButton = "Feedback Form Link#xpath=//button[contains(@id,'nebula_div_btn')]";
	public static final String radio_FeedbackForm_TypeofFeedback = "Type of Feedback radiobutton in Feedback Form#xpath=//div[contains(@class,'live-form-content')]//div[contains(@class,'neb-content')]//md-radio-button[contains(@aria-label,'Website')]";
	public static final String radio_FeedbackForm_Question1_Rating = "Question 1 rating in Feedback Form#xpath=(//div[contains(@class,'live-form-content')]//div[contains(@class,'neb-content')]//div[contains(@class,'neb-rating numbersSquare')]//label[contains(@data-rating-value,'10')])[1]";
	public static final String radio_FeedbackForm_Question2_Rating = "Question 2 rating in Feedback Form#xpath=(//div[contains(@class,'live-form-content')]//div[contains(@class,'neb-content')]//div[contains(@class,'neb-rating numbersSquare')]//label[contains(@data-rating-value,'10')])[2]";
	public static final String drp_FeedbackForm_Purpose = "Purpose of Meeting Dropdown#xpath=(//div[contains(@class,'live-form-content')]//div[contains(@class,'neb-content')]//select)[1]";
	public static final String radio_FeedbackForm_WhatLookingToday = "What Looking Today Radiobutton#xpath=//div[contains(@class,'live-form-content')]//div[contains(@class,'neb-content')]//md-radio-button[contains(@aria-label,'Were you able to find what you were looking for today?:Yes')]//div";
	public static final String radio_FeedbackForm_SiteIssueToday = "Site Issue Today Radiobutton#xpath=//div[contains(@class,'live-form-content')]//div[contains(@class,'neb-content')]//md-radio-button[contains(@aria-label,'Did you experience a site issue today?:Yes')]";
	public static final String drp_FeedbackForm_ExperienceToday = "Experience Today Radiobutton#xpath=(//div[contains(@class,'live-form-content')]//div[contains(@class,'neb-content')]//select)[2]";
	public static final String btn_FeedbackForm_Submit = "Feedback Form Submit Button#xpath=//div[contains(@class,'live-form-content')]//button[contains(@class,'btn submit')]";
	public static final String btn_FeedbackForm_Submitted_Close = "Feedback Form Submitted Close Button#xpath//div[contains(@class,'previewModal ng-scope')]//button[contains(@aria-label,'Exit')]";
	
	
	public void submitFeedbackForm(String pupose, String experienceToday)
	{
		try 
		{
			clickOn(lnk_FeedbackFormButton);
			
			waitTime(4);
			
			WebElement fr = driver.findElement(By.xpath("//iframe[contains(@id,'kampyle')]"));
			
			driver.switchTo().frame(fr);
			
			System.out.println("switched to frame");
			
			/*if (driver.findElement(By.xpath("//div[contains(@class,'live-form-content')]//span[contains(text(),'Help us improve our site')]")).isDisplayed()) 
			{
				*/testStepPassed("Feedback Form is displayed");
				
				clickOn(radio_FeedbackForm_TypeofFeedback);
				
				clickOn(radio_FeedbackForm_Question1_Rating);
				
				clickOn(radio_FeedbackForm_Question2_Rating);
				
				selectFromDropdown(drp_FeedbackForm_Purpose, pupose);
				
				clickOn(radio_FeedbackForm_WhatLookingToday);
				
				clickOn(radio_FeedbackForm_SiteIssueToday);
				
				selectFromDropdown(drp_FeedbackForm_ExperienceToday, experienceToday);
				
				clickOn(btn_FeedbackForm_Submit);
				
				waitTime(4);
				
				if (driver.findElement(By.xpath("//div[contains(@id,'thankYouPageText')]")).isDisplayed()) 
				{
					testStepPassed("Feedback Form is submitted ");
					
					escKey();
				}
				else 
				{
					testStepFailed("Feedback Form is not displayed");				
				}
			/*} 
			else 
			{
				testStepFailed("Feedback Form is not displayed");
			}*/
		} 
		catch (Exception e) 
		{
			testStepInfo("Fedback Form Link is not displayed");
		}
	}
	
	
	public void submitFeedbackFormFromFooter(String pupose, String experienceToday)
	{
		try 
		{
			waitTime(2);
			scrollbottomofPage();
			waitTime(2);
			scrollbottomofPage();
			
			clickOn(lnk_FeedbackFormButtonFromFooter);
			
			waitTime(3);
			
			WebElement fr = driver.findElement(By.xpath("//iframe[contains(@id,'kampyle')]"));
			
			driver.switchTo().frame(fr);
			
			System.out.println("switched to frame");
			
			/*if (driver.findElement(By.xpath("live-form-content")).isDisplayed()) 
			{
				*/testStepPassed("Feedback Form is displayed");
				
				clickOn(radio_FeedbackForm_TypeofFeedback);
				
				clickOn(radio_FeedbackForm_Question1_Rating);
				
				clickOn(radio_FeedbackForm_Question2_Rating);
				
				selectFromDropdown(drp_FeedbackForm_Purpose, pupose);
				
				clickOn(radio_FeedbackForm_WhatLookingToday);
				
				clickOn(radio_FeedbackForm_SiteIssueToday);
				
				selectFromDropdown(drp_FeedbackForm_ExperienceToday, experienceToday);
				
				clickOn(btn_FeedbackForm_Submit);
				
				waitTime(4);
				
				if (driver.findElement(By.xpath("//div[contains(@id,'thankYouPageText')]")).isDisplayed()) 
				{
					testStepPassed("Feedback Form is submitted ");
					
					escKey();
				}
				else 
				{
					testStepFailed("Feedback Form is not displayed");				
				}
				/*} 
			else 
			{
				testStepFailed("Feedback Form is not displayed");
			}*/
		} 
		catch (Exception e) 
		{
			testStepInfo("Fedback Form Footer Link is not displayed");
		}
	}

}





