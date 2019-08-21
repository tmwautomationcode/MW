package mwPages;

import java.util.ArrayList;
import java.util.List;






import org.apache.commons.lang.WordUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class ProductBundlePage extends PopupWindows
{
	public ProductBundlePage(BaseClass obj) {
		
		super(obj);

	}


	public void verifyBundleProductPageDisplayedIfNotRefreshThePage(){
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@class,'js-bundle pdp-container pdp-bundle')]")).isDisplayed()) {
				testStepPassed("Bundle Product page is loaded fully");
			}
		} catch (Exception e) {
			testStepFailed("Bundle Product page is not loaded");
			/*driver.navigate().refresh();
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@class,'js-bundle pdp-container pdp-bundle')]")).isDisplayed()) {
				testStepPassed("Bundle Product page is loaded fully");
			}
			else {
				testStepFailed("Bundle Product page is not loaded");
			}*/
		}
	}
	
	public void verifySuitSeparateBundleProductPageDisplayedIfNotRefreshThePage(){
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//div[text()='SUIT Separates']")).isDisplayed()) {
				testStepPassed("Suit Separate Product page is loaded fully");
			}
		} catch (Exception e) {
			testStepFailed("Suit Separate Product page is not loaded");
			driver.navigate().refresh();
			waitTime(3);
		}
	}

	public String clickOnQuickViewFromBundleProductPage(String prodName)
	{
		if(!prodName.isEmpty()){
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section/preceding-sibling::div"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on '"+prodName+"'s image");
				}
			}else{
				mouseOver(prodName+"'s image#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section/preceding-sibling::div");
			}
			waitTime(2);
			clickOn(prodName+"'s quick view button#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section/preceding-sibling::div//a[contains(@id,'MiniGridQuickView')]");
			return prodName;
		}else{
			prodName=WordUtils.capitalize((getText("first product from buddle product page#xpath=//li[contains(@class,'js-bundle-item')]//section//h2").toLowerCase()));
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section/preceding-sibling::div/img"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on '"+prodName+"'s image");
				}
			}else{

				mouseOver(prodName+"'s image#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section/preceding-sibling::div/img");


			}
			waitTime(2);
			clickOnSpecialElement(prodName+"'s quick view button#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section/preceding-sibling::div//a[contains(@id,'MiniGridQuickView')]");
			return prodName;
		}
	}
	/*public String clickOnSizeFromProductBundlePage(String prodName){
		if(!prodName.isEmpty()){
			clickOn("//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section/preceding-sibling::div//a[contains(@id,'MiniGridQuickView')]");
			return prodName;
		}else{
			prodName=getText("//li[contains(@class,'js-bundle-item')]//section//h2");
			clickOn("//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section/preceding-sibling::div//a[contains(@id,'MiniGridQuickView')]");
			return prodName;
		}
	}*/
	public String selectSizeFromBundleProductPage(String prodName, String size)
	{
		//if(!prodName.isEmpty()){
		//String locator=prodName+"'s size dropdown#xpath=//li[contains(@class,'js-bundle-item')]//section/h2[contains(text(),'"+prodName+"')]/parent::section//div[contains(@class,'size')]/a";
		//String locator=prodName+"'s size dropdown#xpath=//li[contains(@class,'js-bundle-item')]//section/h2[contains(text(),'"+prodName+"')]/parent::section/parent::div/parent::div/parent::li//div[@class='size-dropdown js-size-dropdown']";	

		if (driver.findElement(By.xpath("//ul[contains(@id,'bundleProducts')]//h2[contains(text(),'"+prodName+"')]//ancestor::li//div[contains(@id,'curr-size')]")).isDisplayed()) 
		{


			String locator=prodName+"'s size dropdown#xpath=//ul[contains(@id,'bundleProducts')]//h2[contains(text(),'"+prodName+"')]//ancestor::li//div[contains(@id,'curr-size')]";
			System.out.println(prodName);
			clickOn(locator);

			/*}
	  else{
	   prodName=getText("//li[contains(@class,'js-bundle-item')]//section//h2");
	   clickOn(prodName+"'s size dropdown#xpath=//li[contains(@class,'js-bundle-item')]//section/h2[contains(text(),'"+prodName+"')]/parent::section//div[contains(@class,'size')]/a");

	  }*/
			List<WebElement> sizeOptions=driver.findElements(By.xpath("//div[contains(@class,'size-select')]//li[contains(@role,'option')]/a"));
			for(int i=0;i<sizeOptions.size();i++){
				if(sizeOptions.get(i).isDisplayed()){
					if(!size.isEmpty()){
						if(sizeOptions.get(i).getText().equalsIgnoreCase(size)){
							sizeOptions.get(i).click();
							testStepPassed("click on: "+size+" size");
							break;
						}
					}
					else{
						size=sizeOptions.get(i).getText();
						sizeOptions.get(i).click();
						testStepPassed("Select Size: "+size);
						break;
					}
				}
			}

			return size;
		}
		else {
			testStepPassed("Size dropdown is not displayed");
		}
		return size;
	}




	public void selectSizeFromBundleProductPage_New(int i, String size)
	{
		System.out.println("i : "+i);
		try {
			waitTime(1);			
			WebElement sizeoptions2 = driver.findElement(By.xpath("((//div[contains(@class,'size-dropdown js-size-dropdown')])["+i+"]//ul[contains(@role,'listbox')]//li[contains(@class,'size-item')])[1]"));
					size = sizeoptions2.getAttribute("data-size");
												
						driver.findElement(By.xpath("(//div[contains(@id,'ada-qv-curr-size')])["+i+"]")).click();
						waitTime(2);
						sizeoptions2.click();
						testStepPassed("click on '"+size+"' size");
						testStepPassed("(//div[contains(text(),'Select Size')])["+i+"]");
			 
					
		} catch (Exception e) {
			testStepPassed("Size Dropdown is not displayed");
		}
		
	}




	public void clickOnAddToCartFromBundleProductPage_New(int i)
	{
		
		if (driver.findElement(By.xpath("(//div[contains(@class,'js-bundle pdp-container pdp-bundle')]//a[contains(@class,'js-bundle-add-item-to-cart')])["+i+"]")).isDisplayed()) 
		{
			
			driver.findElement(By.xpath("(//div[contains(@class,'js-bundle pdp-container pdp-bundle')]//a[contains(@class,'js-bundle-add-item-to-cart')])["+i+"]")).click();
			
		}
		else 
		{
		
			testStepFailed("Add to Shopping Bag botton is not displayed");
			
		}
		
	}
	
	
	public void clickOnAddToCartFromSuitSeparateProduct()
	{
		
		if (driver.findElement(By.xpath("//a[contains(@id,'add-to-cart')]")).isDisplayed()) 
		{
			
			
			clickOnSpecialElement("Add to Bag #xpath=//a[contains(@id,'add-to-cart')]");
			
		}
		else 
		{
		
			testStepFailed("Add to Bag botton is not displayed");
			
		}
		
	}
	
	
	




	public List<String> getListOfProductListedInBundleProductPage(){
		List<WebElement>productListWebElement=driver.findElements(By.xpath("//div[contains(@id,'js-bundle-item')]/label"));
		List<String> prodList=new ArrayList<String>();
		if(productListWebElement.size()>0){
			for(WebElement ele: productListWebElement){
				//prodList.add(WordUtils.capitalize(ele.getText().trim().toLowerCase()));
				System.out.println(WordUtils.capitalize(ele.getText().trim().toLowerCase()));
				System.out.println(ele.getText().trim());
				prodList.add(ele.getText().trim());
			}
		}
		return prodList;
	}


	public List<String> getListOfAddToShoppingBagButtonListedInBundleProductPage(){
		List<WebElement>productListWebElement=driver.findElements(By.xpath("//li[contains(@class,'js-bundle-item')]//section/h2"));
		List<String> prodList=new ArrayList<String>();
		if(productListWebElement.size()>0){
			for(WebElement ele: productListWebElement){
				//prodList.add(WordUtils.capitalize(ele.getText().trim().toLowerCase()));
				System.out.println(WordUtils.capitalize(ele.getText().trim().toLowerCase()));
				System.out.println(ele.getText().trim());
				prodList.add(ele.getText().trim());
			}
		}
		return prodList;
	}


	public boolean scrollUpInProductBundlePDPPage(){
		boolean flag = false;
		try{
			//driver
			driver.findElement(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a")).sendKeys(Keys.PAGE_UP);      
			//testStepPassed("Performed Scroll Down In Product Grid Page");
			flag=true;
		}catch(Exception e){

		}
		return flag;
	}

	/*public String clickOnAddToCartFromBundleProductPage(String prodName){
		if(!prodName.isEmpty()){
			clickOn(prodName+"'s Add To Cart button#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section//div[contains(@class,'actions')]//a[contains(@class,'js-bundle-add-item-to-cart')]");
			return prodName;
		}else{
			prodName=getText("//li[contains(@class,'js-bundle-item')]//section//h2");
			clickOn(prodName+"'s Add To Cart button#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section//div[contains(@class,'actions')]//a[contains(@class,'js-bundle-add-item-to-cart')]");
			return prodName;
		}
	}*/
	public String clickOnAddToCartFromBundleProductPage(String prodName){
		if(!prodName.isEmpty()){
			//clickOn(prodName+"'s Add To Cart button#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section//div[contains(@class,'actions')]//a[contains(@class,'js-bundle-add-item-to-cart')]");
			//clickOn(prodName+"'s Add To Cart button#xpath=//li[contains(@class,'js-bundle-item')]//section/h2[contains(text(),'"+prodName+"')]/parent::section/parent::div/parent::div/parent::li//a[text()='Add to shopping Bag']");
			WebElement element = driver.findElement(By.xpath("//ul[contains(@id,'bundleProducts')]//h2[contains(text(),'"+prodName+"')]//ancestor::li//a[contains(text(),'Add to shopping Bag')]"));
			element.sendKeys(Keys.PAGE_UP);
			//act.moveToElement(driver.findElement(By.xpath("//ul[contains(@id,'bundleProducts')]//h2[contains(text(),'"+prodName+"')]//ancestor::li//a[contains(text(),'Add to shopping Bag')]"))).build().perform();
			//driver.findElement(By.xpath("")).sendKeys(keys.PAGEUP);
			String locator=prodName+"'s Add To Shopping Bag button#xpath=//ul[contains(@id,'bundleProducts')]//h2[contains(text(),'"+prodName+"')]//ancestor::li//a[contains(text(),'Add to shopping Bag')]";
			clickOn(locator);
		}else{
			testStepInfo("Any one Product Name available in bundle page should be given to click on 'Add To Shopping Bag Button'");
		}
		return prodName;
	}





	public void typeQuantityForProductInBundleProductPage(String prodName, String quantity){
		typeIn(prodName+"'s quantity textbox#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section//div[contains(@class,'actions')]//div/input", quantity);
	}

	public String clickOnSaveItemFromBundleProductPage(String prodName){
		if(!prodName.isEmpty()){
			clickOn(prodName+"'s Save item button#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section//div[contains(@class,'actions')]//a[contains(@id,'save-item')]");
			return prodName;
		}else{
			prodName=getText("//li[contains(@class,'js-bundle-item')]//section//h2");
			clickOn(prodName+"'s save item button#xpath=//li[contains(@class,'js-bundle-item')]//section//h2[contains(text(),'"+prodName+"')]/parent::section//div[contains(@class,'actions')]//a[contains(@id,'save-item')]");
			return prodName;
		}
	}
	public boolean isProductBundlePageDisplayed(){
		boolean flag=false;
		try{
			if(driver.findElement(By.xpath("//ul[contains(@id,'bundleProducts')]")).isDisplayed()){
				flag= true;
			}
		}catch(Exception e){
		}
		return flag;
	}
	public static final String txt_ProductNameInProductBundlePage="Product Name In Product Description Page#xpath=//div[contains(@class,'look-title')]/h1";

	public String getProductNameInProductBundlePage(){
		String productNameInProductDescriptionPage = getText(txt_ProductNameInProductBundlePage);
		return productNameInProductDescriptionPage;
	}

}