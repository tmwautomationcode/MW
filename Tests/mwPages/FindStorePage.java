package mwPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class FindStorePage extends PopupWindows
{
	public FindStorePage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);

	}


	public static final String btn_findStore="find option #xpath=//div[@class='store_search_form']//input[contains(@id,'btnSearch')]";
	public static final String txt_search="find the zipcode in search box#xpath=//div[@class='store_search_form']//input[contains(@class,'lookup_field')]";
	public static final String lnk_firstoption="the firest option#xpath=//div[@id='store_locator_results']//div[text()='A']";
	public static final String txt_mapdetails="map detail#xpath=//*[@id='map']";
	public static final String lnk_makethismystore="make this my store option#xpath=//*[@id='makeThisMyStore']";
	public static final String txt_storedetails="full details in find store#xpath=//*[@id='store_locator_results']";
	public static final String btn_backtoresult="back to result link#xpath=//*[@id='main']//a[text()='Back to Results']";
	public static final String txt_storefinderchange="message displayed#xpath=//div[text()='Store has been added to your My Store']";
	public static final String lnk_edit="edit link#xpath=//div[@id='header-mystore-links']//a[@id='storeEditLink']";
	public static final String txt_searchform="verify text#xpath=//*[@class='store_search_form']";

	public static final String txt_MakeThisMyStorePage_StoreName="Store Name#xpath=//div[contains(@class,'store-details')]//h1";
	public static final String lnk_MakeThisMyStore="Make this my store link#xpath=//div[contains(@class,'store-details')]//a[contains(@id,'makeThisMyStore')]";
	public static final String btn_ChangeStore="Change store button#xpath=//a[contains(@id,'makeThisMyStore') and contains(text(),'Change Store')]";
	public static final String lnk_StoreSearchList_FirstStore="Store Search results First Store#xpath=//div[contains(@id,'store_locator_results')]/ol/li[1]/a";

	public static final String lnk_MakeMyStoreSuccessfulClose="Make My Store Successful Close Link#xpath=//a[contains(@class,'lose-reveal-modal')]";
	
	
	public void clickOnChangeStoreButton()
	{
		waitTime(2);
		try {
			
			if (driver.findElement(By.xpath("//div[@class='store_details']//a[contains(text(),'Change Store')]")).isDisplayed()) {
				clickOn(btn_ChangeStore);
			}

		} catch (Exception e) {
			System.out.println("The Change Store Button is not displayed");
		}
	}
	
	
	
	public void clickOnFindButtonInFindStore()
	{
		try {
			if (driver.findElement(By.xpath("//div[@class='store_search_form']//input[contains(@id,'btnSearch')]")).isDisplayed()) {
				clickOn(btn_findStore);
			}

		} catch (Exception e) {
			System.out.println("The Search Store Button is not displayed");
		}
	}
	public void enterSearchStoreTextboxValue(String zipcode)
	{
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//div[@class='store_search_form']//input[contains(@class,'lookup_field')]")).isDisplayed()) {
				typeIn(txt_search,zipcode);
			}

		} catch (Exception e) {
			//System.out.println("The Search Store textbox is not displayed");
			testStepFailed("The Search Store textbox is not displayed");
		}
	}

	public void clickChangeStoreButton()
	{
		try {
			if (driver.findElement(By.xpath("//a[contains(@id,'makeThisMyStore') and contains(text(),'Change Store')]")).isDisplayed()) {
				clickOn(btn_ChangeStore);
			}

		} catch (Exception e) {
			testStepPassed("The Change Store Button is not found");
		}
	}

	/*public boolean clickOnStoreList(String link)
	{
		//clickOn(lnk_firstoption);
		clickOn("listed on left - "+link+ "#xpath=//*[@id='store_locator_results']//span[contains(text(),'"+link+"')]");
		return true;
	}*/
	public String clickOnStoreList(String link)
	{
		waitTime(2);
		if(link.isEmpty()){
			clickOn(link+"link #xpath=//*[@id='store_locator_results']//span[contains(text(),'"+link+"')]");
			return link;
		}else{
			/*String locator="first store link listed-#xpath=//*[@id='store_locator_results']//*[@class='details']";
			link=getText(locator);
			clickOn(link+"link+ #xpath=//*[@id='store_locator_results']//*[@class='details']//span[contains(text(),'"+link+"')]");
			return link;*/
			clickOn("listed on left - "+link+ "#xpath=//*[@id='store_locator_results']//span[contains(text(),'"+link+"')]");
			return link;
		}
	}
	public boolean verifyStoreDetailsInFindStore()
	{
		boolean flag=false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//*[@class='store_search_form']")).isDisplayed()){
				flag=true;
			}
		}catch(Exception e){

		}
		//clickOn(txt_saved_item);
		return flag;
	}
	public void verfiyMapDetailInFindStore()
	{
		if(elementPresent(txt_mapdetails))
		{
			testStepPassed("Map details displayed");
		}
		else
		{
			testStepFailed("Map details not displayed");
		}
	}
	public void clickOnMakeThisMyStore()
	{
		clickOn(lnk_makethismystore);
	}
	public void verfiyStoreSelectedDetails()
	{
		if(elementPresent(txt_storedetails))
		{
			testStepPassed("The details of the store selected in step 6 should be displayed");
		}
		else
		{
			testStepFailed("The details of the store selected in step 6 should not be displayed");
		}
	}
	public void clickOnBackResult()
	{
		clickOn(btn_backtoresult);
	}

	public void clickOnEdit()
	{
		clickOn(lnk_edit);
	}

	public boolean verifySearchStoreResultsDisplayed()
	{
		boolean flag=false;
		try {
			
			waitTime(1);
			
				if (driver.findElement(By.xpath("//div[contains(@id,'store_locator_results')]/ol/li/a")).isDisplayed()) {
					testStepPassed("The Search Store results are displayed");
					flag=true;
				}
				
			
		} catch (Exception e) {
			testStepFailed("The Search Store results are not displayed");
		}	
		return flag;
	}

	public boolean verifyStoreResultsDisplayedInFindStorePage(){
		boolean flag=false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try{
			if(driver.findElement(By.xpath("//*[contains(@id,'wrap')]/div[contains(@class,'error-msg')]")).isDisplayed()){
				testStepFailed("Store Not Found error message displayed");			
			}else{
				try{
					if(driver.findElement(By.xpath("//*[@class='store_search_form']")).isDisplayed()){
						testStepPassed("Searched Store results found");
						flag=true;
					}
				}catch(Exception e1){
					testStepFailed("Searched store results not found but Store Not Found error message NOT displayed");			
				}	
			}
		}catch(Exception e){
			try{
				if(driver.findElement(By.xpath("//*[@class='store_search_form']")).isDisplayed()){
					testStepPassed("Searched Store results found");
					flag=true;
				}
			}catch(Exception e1){
				testStepFailed("Searched store results not found but Store Not Found error message NOT displayed");			
			}			
		}
		driver.manage().timeouts().implicitlyWait(implicitlyWaitTime,TimeUnit.SECONDS);
		return flag;
	}
	public void verfiyMapDisplayedInMakeThisMyStorePage(){
		try{
			if(driver.findElement(By.xpath("//*[@id='map']")).isDisplayed()){
				testStepPassed("Map is displayed in Make this my store Page");
			}else{
				testStepFailed("Map is not displayed in Make this my store Page");
			}
		}catch(Exception e){
			testStepFailed("Map is not displayed in Make this my store Page");
		}
	}
	public void selectFirstStoreFromSearchListDisplayed(){
		String locator="First store link listed-#xpath=//*[@id='store_locator_results']//li[1]//*[contains(@class,'details')]";
		clickOn(locator);
	}
	
	public void selectFirstStoreFromStoreSearchListDisplayed_new(){
		try {
			waitTime(3);
			driver.findElement(By.xpath("//div[contains(@id,'store_locator_results')]/ol/li[1]/a")).sendKeys(Keys.PAGE_UP);
			if (driver.findElement(By.xpath("//div[contains(@id,'store_locator_results')]/ol/li[1]/a")).isDisplayed()) {
				driver.findElement(By.xpath("//div[contains(@id,'store_locator_results')]/ol/li[1]/a")).sendKeys(Keys.PAGE_UP);
				waitTime(2);
				clickOn(lnk_StoreSearchList_FirstStore);
			}
			
		} catch (Exception e) {
			testStepFailed("The Store Searc Results are not displayed");
		}
		
	}
	
	
	public boolean scrollUpInFindStorePage(){
		boolean flag = false;
		try{
			driver.findElement(By.xpath("//div[contains(@id,'store_locator_results')]/ol/li[1]/a")).sendKeys(Keys.PAGE_UP);      
			//testStepPassed("Performed Scroll Down In Product Grid Page");
			flag=true;
		}catch(Exception e){

		}
		return flag;
	}
	
	
	
	public String clickOnMakeThisMyStore_New(){
		String storeName="";
		storeName=getText(txt_MakeThisMyStorePage_StoreName);	
		clickOn(lnk_MakeThisMyStore);
		return storeName;
	}
	
	public void clickOnMakeThisMyStoreMessageCloseLink(){
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//*[@id='js-store-saved']")).isDisplayed()) {
				clickOn(lnk_MakeMyStoreSuccessfulClose);
			}
		} catch (Exception e) {
			testStepFailed("Make My Store successful message close is not displayed");		}
	}

}
