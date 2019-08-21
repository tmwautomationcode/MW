package mwPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import baseClass.BaseClass;
import baseClass.PopupWindows;

public class QuickViewPopup extends PopupWindows{
	
	public QuickViewPopup(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);

	}

	public static final String QV_Popup="QV Popup#xpath=//div[@id='quickInfoPopup']//div[contains(@class,'widget_quick_info_popup')]";
	public static final String QV_ViewProductDescriptionLink="QV View Product Description Link#xpath=//div[contains(@id,'quickInfoPopup')]//a[contains(@class,'js-full-product-link text-link')]//span[contains(text(),'View Full Product Information')]";
	public static final String QV_SeeMoreLink="QV See More Link#xpath=//a[contains(@class,'read-more-btn')]";
	//a[contains(@class,'read-more-btn')]
	
	public static final String drp_qv_select_size="QV select size dropdown#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(text(),'Select Size')]";
	public static final String btn_qv_add_to_cart="QV Add to cart button#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(@class,'pdp-actions-container')]//a[contains(@id,'add-to-cart') and contains(text(),'Add to Cart')]";
	public static final String btn_qv_add_to_save="QV Add to Save button#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(@class,'pdp-actions-container')]//span[ contains(text(),'Add to Saved')]/parent::a";
	public static final String txt_qv_quantity="QV quantity textbox#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(@class,'qv-wrap')]//input[contains(@name,'quantity')]";
	public static final String btn_qv_colour_swatch="QV colour swatch#xpath=//div[contains(@class,'widget_quick_info_popup')]//div[contains(@class,'color-swatches')]//a[contains(@class,'js-swatch-item')]";
	public static final String lnk_qv_moreDetails="QV More Details Link#xpath=//div[contains(@class,'widget_quick_info_popup')]//*[contains(text(),'More Details')]";

	public String selectSizeFromQVPopup(String size){
		clickOn(drp_qv_select_size);
		waitTime(2);
		List<WebElement> sizeOptions=driver.findElements(By.xpath("//div[contains(@class,'widget_quick_info_popup')]//li[contains(@class,'size-item')]/a"));
		if(sizeOptions.size()>0){
			if(!size.isEmpty()){
				for(WebElement ele:sizeOptions){
					if(ele.getText().equalsIgnoreCase(size)){
						ele.click();
						testStepPassed("click on '"+size+"' size");
					}
				}
			}else{
				size=sizeOptions.get(1).getText();
				sizeOptions.get(1).click();
				testStepPassed("click on '"+size+"' size");
			}
		}else{
			testStepFailed("Size options are not listed");
		}
		return size;
	}

	
	public void verifyQVPopupisDisplayed(){
		try {
			waitTime(1);
			if (driver.findElement(By.xpath("//div[@id='quickInfoPopup']//div[contains(@class,'widget_quick_info_popup')]")).isDisplayed()) {
				testStepPassed("Quick View Popup is Displayed");
			}
		} catch (Exception e) {
			testStepFailed("Quick View Popup is not displayed");
		}
	}
	
	
	
	public void verifyCertonaisDisplayedandGetthenames(){
		try{
			if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget__horizontal')]")).isDisplayed()) {
				List<WebElement> CertonaBlock = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget__horizontal')]"));
				int CertonaBlockCount = CertonaBlock.size();
				testStepPassed("Certona Block Count : "+CertonaBlockCount);
				
				for (int i = 0; i < CertonaBlockCount; i++) {
					 int j = i+1;
					if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget__horizontal')]//span[contains(@class,'certona-widget__title')]")).isDisplayed()) {
						String CertonaTitle = driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget__horizontal')]//span[contains(@class,'certona-widget__title')]")).getText();
						//testStepPassed("");
						testStepPassed("Certona Widget "+j+" Title : "+CertonaTitle);
						List<WebElement> CertonaProducts = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget__horizontal')]//div[contains(@class,'certona-slide js-prod-item')]"));
						int CertonaProductsCount = CertonaProducts.size();
						testStepPassed("Certona products Count in Widget "+j+" : "+CertonaProductsCount);
					}
				} 
			}
		}
		catch(Exception e)
		{
			testStepFailed("Certona Widget is not displayed in Quick View");  
		}
	}
	
	public void clickOnViewProductDescription(){
		//clickOn(QV_ViewProductDescriptionLink);
		clickOn(QV_SeeMoreLink);
		
	}
	
	public void clickOnAddToCartFromQVPopup(){
		clickOn(btn_qv_add_to_cart);
	}

	public void clickOnSaveBtnFromQVPopup(){
		clickOn(btn_qv_add_to_save);
	}

	public void clickOnMoreDetalsInQVPopup(){
		clickOn(lnk_qv_moreDetails);	
	}
		
	public void typeQuantityInQVPopup(String quantity){
		typeIn(txt_qv_quantity, quantity);
	}


	public void selectColourSwatchFromQVPopup(){
		clickOn(btn_qv_colour_swatch);
	}
}
