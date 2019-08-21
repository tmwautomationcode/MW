package mwPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class ZeroResultsPage extends PopupWindows
{
	
	public ZeroResultsPage(BaseClass obj) {
		
		super(obj);
		
	}


	public static final String lbl_AboutMensWearHouse = "About Men's Wear House #xpath=//h2[contains(text(),\"About Men's Wearhouse\")]";
	public static final String txt_AboutUs="About Us #xpath=//*[@class='sub-category']//*[text()='About Us']";
	public static final String txt_Guydlines="Guydlines #xpath=//h1[contains(text(),'Guy')]";
	public static final String txt_Prestylelooks="Pre-Style Loks #xpath=//h2[contains(text(),'Pre-Styled Looks')]";
	public static final String txt_Allbrands="All Brands #xpath=//div[@id='main']";
	
	
	
	
	
	public static final String lnk_QV_Close = "QV close Link#xpath=//a[@id='WC_QuickInfo_Link_close']";
	
	
	public void verifyCertonaisDisplayedandAddProductthroughQVandPDP(String Size){
		try{
			if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]")).isDisplayed()) {
				testStepPassed("Certona Widget is displayed");
				List<WebElement> CertonaBlock = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]"));
				int CertonaBlockCount = CertonaBlock.size();
				testStepPassed("Certona Block Count : "+CertonaBlockCount);

				for (int i = 0; i < CertonaBlockCount; i++) {
					int j = i+1;
					int k=1;
					System.out.println(k);
					if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]//span[contains(@class,'certona-widget__title-bg')]")).isDisplayed()) {
						String CertonaTitle = driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]//span[contains(@class,'certona-widget__title-bg')]")).getText();
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
							getProductCountinMinicart();
							
							waitTime(1);
							URLNavigateBack();*/
						
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
	
}
