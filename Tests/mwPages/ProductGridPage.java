package mwPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.CharMatcher;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class ProductGridPage extends PopupWindows
{
	public ProductGridPage(BaseClass obj) {
		
		super(obj);

	}
	
	
	public static final String drp_PGP_Sizefilter="PGP Size Filter dropdown#xpath=//form[contains(@id,'productsFacets')]//ul[contains(@id,'facetFilterList')]//li[contains(@class,'size-fltr')]//span[contains(@id,'size-heading') and contains(@class,'filter-btn')]";
	public static final String drp_PGP_Sizefilter_Option="PGP Size Filter Option dropdown#xpath=";
	
	
	public static final String lnk_GotoMenswearhouse_GroosmanGiftspage="Go to Menswearhouse link in Groosman gifts page link#xpath=//body[contains(@id,'groomsmen-gifts-men-s-wearhouse')]//a[contains(text(),'GO TO MENSWEARHOUSE.COM')]";

	public static final String txt_results="shop online option#xpath=//a[contains(text(),'Shop Online')]";
	//public static final String drp_size_filter="size filter dropdown#xpath=//span[contains(@id,'size-heading') and contains(@class,'filter-btn')]";
	public static final String lnk_savedsizes="saved sizes option #xpath=//a[contains(@class,'saved-sizes-save')]";//a[text()='Save Sizes']";
	public static final String txt_saved_item="check item #xpath=//li[contains(@id,'removeFacet')]";
	public static final String drp_size_filter="size filter dropdown#xpath=//span[contains(@id,'size-heading') and contains(@class,'filter-btn')]";
	public static final String drp_type_filter="type filter dropdown#xpath=//span[contains(@id,'type') and contains(@class,'filter-btn')]";
	public static final String drp_material_filter="material filter dropdown#xpath=//span[contains(@id,'material') and contains(@class,'filter-btn')]";
	public static final String drp_fit_filter="fit filter dropdown#xpath=//span[contains(@id,'fit') and contains(@class,'filter-btn')]";
	public static final String drp_color_filter="color filter dropdown#xpath=//span[contains(@id,'color-heading') and contains(@class,'filter-btn')]";
	public static final String tab_find_in_StoreTab="Find in Store#xpath=//div[@id='in-store-tab']";
	public static final String drp_price_filter="price filter dropdown#xpath=//span[contains(@id,'price') and contains(@class,'filter-btn')]";
	public static final String drp_brand_filter="brand filter dropdown#xpath=//span[contains(@id,'brand') and contains(@class,'filter-btn')]";
	public static final String el_ProductItem="product name#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]";
	public final static String lnk_TwitterInPGP = "Twitter Link in PGP#xpath=//div[contains(@id,'social-buttons')]//a[contains(text(),'Twitter')]";
	public final static String lnk_FacebookInPGP = "Facebook Link in PGP#xpath=//div[contains(@id,'social-buttons')]//a[contains(text(),'Facebook')]";
	public final static String lnk_GooglePlusInPGP = "Google Plus Link in PGP#xpath=//div[contains(@id,'social-buttons')]//a[contains(text(),'Google+')]";
	public final static String lnk_EmailInPGP = "Email Link in PGP#xpath=//div[contains(@id,'social-buttons')]//a[contains(text(),'Email')]";
	public static final String drp_PGPPage_SortByFilter="PGPPage Sort By Filter#xpath=//div[contains(@id,'searchBasedNavigationWithTopNav_widget')]//select[contains(@id,'orderBy')]";
	public static final String drp_PGPPage_AddFilter="PGPPage Add Filter Button#xpath=//span[contains(@id,'add-filter-btn')]";
	public static final String drp_CuffStyle="PGPPage Cuff StyleFilter Button#xpath=//div[contains(@class,'add-filter-list')]/label[6]/span";
	public static final String txt_shopAllItems = "Shopp All Items#xpath=//ul[contains(@class, 'js-pgp-shopping-tab')]//li//a[@href='#shopAllItems']";



	/*public void CheckProductGridPageisDisplayed(){

		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//section//ul[@id='products']")).isDisplayed()) {
				testStepPassed("Products are listed in PGP page");
			}
		} catch (Exception e) {
			testStepPassed("Products are not listed in PGP page");

		}

	}*/

	public boolean checkProductGridPageisDisplayed(){
		boolean flag = false;
		//waitTime(2);
		try{
			if(driver.findElement(By.xpath("//section[contains(@class,'results-products')]//ul[contains(@id,'products')]")).isDisplayed()){
				flag =true;
			}
		}catch(Exception e){

		}
		return flag;
	}


	public boolean checkBannerPageDisplayed(){
		boolean flag = false;
		try{
			System.out.println(driver.getCurrentUrl());

			if(driver.getCurrentUrl().contains("guided-shopping")) {
				if(driver.findElement(By.xpath("//div[contains(@class,'gs-container')]")).isDisplayed()){
				flag =true;
			} }
			else if(driver.getCurrentUrl().contains("mens-clothing-sale")) {
				if(driver.findElement(By.xpath("//div[contains(@id,'main')]")).isDisplayed()){
					flag =true;
				} }
			else {
				
					if(driver.findElement(By.xpath("//section[contains(@class,'rowContainer')]")).isDisplayed()){
					flag =true;
			}
			}
		}catch(Exception e){
		}
		return flag;
	}

	
	public boolean checkGiftPageDisplayed(){
		boolean flag = false;
		waitTime(2);
		if(switchToSpecificWindow("Groomsmen Gifts | Men’s Wearhouse")){
			
			try{
				System.out.println(driver.getCurrentUrl());
				if(driver.getCurrentUrl().contains("gifts")) 
					testStepPassed("Verifed user navigated to Groomsmen Gifts Page");
				flag =true;
			}catch(Exception e){
				testStepFailed("It is not navigated to Groomsmen Gifts Page");
			}
			finally{
				driver.close();
			}
		}
		return flag;
	}
	
	
	public void clickOnGotoMenswearhouseLinkinGiftsPage(){
		
		try{
			clickOn(lnk_GotoMenswearhouse_GroosmanGiftspage);
		}catch(Exception e){
			testStepFailed("Go to Menswearhose.com link in Groosman Gifts page is not found");
		}
		
	}
	
	
	
	public void checkCorrespondingBannerPageDisplayed(String SubCategoryLinkName){
		
		try{
			
			String CurrentURL = driver.getCurrentUrl();
			
			String filtered = CharMatcher.anyOf("-").removeFrom(CurrentURL);
			//testStepPassed("Filtered URL : "+filtered);
			
			String FilteredEdited = StringUtils.substringAfterLast(filtered, "/");
			//testStepPassed("FilteredEdited : "+FilteredEdited);
			
			
			
			//testStepPassed("SubCategoryLinkName : "+SubCategoryLinkName);
			
			
			String SubCategoryNameEdited = StringUtils.remove(SubCategoryLinkName, " ");
			//testStepPassed("SubCategoryNameEdited : "+SubCategoryNameEdited);
			
			
			String SubCategoryName2 = StringUtils.substringBefore(SubCategoryNameEdited, ",");
			//testStepPassed("SubCategoryNameEdited : "+SubCategoryName2);
			
			String SubCategoryName =  SubCategoryName2.toLowerCase();
			
			
			if (FilteredEdited.contains(SubCategoryName)) {
				testStepPassed("It navigated to the corresponding banner page");
			}
			
		}
		catch(Exception e){
			testStepWarning("Warning : It is not navigated to the corresponding Banner Page");
		}
		
	}
	

	
	public String getDepartmentBreadCrumbinPGP() {
	
		String departmentBreadcrumbinPGP = null;
		try {
			
			if (driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]/h1")).isDisplayed()) {
				testStepPassed("Department Bread Crumb in PGP is displayed");
				departmentBreadcrumbinPGP = driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]/h1[text()]")).getAttribute("innerText");
				System.out.println(departmentBreadcrumbinPGP);
										
				testStepPassed("Department Bread crumb in PGP : " + departmentBreadcrumbinPGP);
				}
		else {
			testStepFailed("Department Bread crumb is not displayed");
		}
		} catch(Exception e) {
			testStepFailed("Department Bread crumb is not displayed");
		}
		return departmentBreadcrumbinPGP; ////div[contains(@id,'widget_breadcrumb')]/h1
	}
	
	public String getSubCategoryBreadCrumbinPGP() {
		
		String subcategoryBreadcrumbinPGP = null;
		try {
			
			if (driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]/h1")).isDisplayed()) {
				testStepPassed("SubCategory Bread Crumb in PGP is displayed");
				String subcategoryBreadcrumbtxt = driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]/h1[text()]")).getAttribute("innerText");
				subcategoryBreadcrumbinPGP= subcategoryBreadcrumbtxt.trim();
				System.out.println(subcategoryBreadcrumbinPGP);
				
				testStepPassed("SubCategory Bread crumb in PGP : " + subcategoryBreadcrumbinPGP);
				}
		else {
			testStepFailed("SubCategory Bread crumb is not displayed");
		}
		} catch(Exception e) {
			testStepFailed("SubCategory Bread crumb is not displayed");
		}
		return subcategoryBreadcrumbinPGP;
	}

	public boolean check404PageisDisplayed(){
		boolean flag = false;
		try{
			//waitTime(1);
			if (driver.findElement(By.xpath("//ul[contains(@class,'breadcrumb')]//a[contains(text(),'404')]")).isDisplayed()) {
				flag =true;
			}

		}catch(Exception e){

		}
		return flag;
	}


	public void selectProductInProductGridPage(){
		String locator="First product listed#xpath=(//section[contains(@id,'results-products')]//ul[contains(@id,'products')]//div[contains(@class,'prod-info')]//a)[1]";
			String productName=getText(locator);
			clickOn(productName+" product name#xpath=(//section[contains(@id,'results-products')]//ul[contains(@id,'products')]//div[contains(@class,'prod-info')]//a)[1]");
	}
	
	

	public void countofProductsinPGP(){
		try {
			String ProductsCountinPGP = driver.findElement(By.xpath("//div[contains(@id,'topNavigationHeader')]//header[contains(@id,'facetsHistory')]//h3[contains(@class,'product-results')]//span[contains(@id,'productTotalCountAboveFilter')]")).getText();
			testStepPassed("There are "+ProductsCountinPGP+" products displayed in PGP");

		} catch (Exception e) {
			testStepWarning("Warning : Products Count in PGP is not displayed");
		}
	}
	/*******************************************************************************************************************************************************************************************************************************************************************/
	//Function Name : VerifyAddFilterButton
	//Purpose		: To verify Different filter option is displayed or not
	//Purpose		: To verify applied add filter button is displayed or not
	//Created By	: Aishwarya L V
	//Created Date	: 07/19/2018
	//Modified By	: Aishwarya L V
	
	/*******************************************************************************************************************************************************************************************************************************************************************/
	public void VerifyAddFilterButton(String FilterType){
		try {
			/*Click Add Filter button*/
			clickOn(drp_PGPPage_AddFilter);
			/*Click Filter Type*/
			clickOn("'"+FilterType+"' Filter#xpath=//div[contains(@class,'add-filter-list')]/label/span[contains(text(),'"+FilterType+"')]");
			testStepPassed("Applied Filter type is " +FilterType);
			/*Verifying Applied filter type is applied or not */
			if (driver.findElement(By.xpath("//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'"+FilterType+"')]")).isDisplayed()) {
				testStepPassed("Applied Filter type " +FilterType+ " is displayed");
			}
				

		} catch (Exception e) {
			testStepFailed("Applied filter Type in PGP is not displayed");
		}
	}
	
	/*******************************************************************************************************************************************************************************************************************************************************************/
	
	/*******************************************************************************************************************************************************************************************************************************************************************/
	//Function Name : VerifyDifferentFilterOption
	//Purpose		: To verify Different filter option is displayed or not
	//Created By	: Aishwarya L V
	//Created Date	: 07/23/2018
	//Modified By	: Aishwarya L V
	
	/*******************************************************************************************************************************************************************************************************************************************************************/
	public void VerifyDifferentFilterOption(String FilterType, String FilterValue){
		try {
			
			String productcountbefore = null, productcountafter=null;
			if (driver.findElement(By.xpath("//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'"+FilterType+"')]")).isDisplayed()) {
				testStepPassed("Filter type " +FilterType+ " is displayed");
				/*Click Filter Type*/
				clickOn("'"+FilterType+"' Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'"+FilterType+"')]");
				/*Get product count Before applying filter*/
				productcountbefore = driver.findElement(By.xpath("//*[@id='productTotalCountAboveFilter']")).getText();
				testStepPassed("Product Count in PGP Before applied Filter : " + productcountbefore);
			}
			/*click options from filter*/
			clickOnSpecialElement("'"+FilterValue+"' Filter Value#xpath=//span[contains(text(),'"+FilterType+"')]//parent::div//ul/li/label/span[contains(text(),'"+FilterValue+"')]");
			waitTime(2);
			/*Get product count After applying filter*/
			productcountafter = driver.findElement(By.xpath("//*[@id='productTotalCountAboveFilter']")).getText();
			testStepPassed("Product Count in PGP After applied Filter : " + productcountafter);
			/*Verification of before & after product count*/
			if(!productcountbefore.equalsIgnoreCase(productcountafter)) {
				testStepPassed("Product Count in PGP Before and After applied Filter are different");
			}else {
				testStepPassed("Product Count in PGP Before and After applied Filter are same");
			}
			
		} catch (Exception e) {
			testStepFailed("Filter Type in PGP is not displayed");
		}
	}
	
	/*******************************************************************************************************************************************************************************************************************************************************************/

	public void verifyDepartmentBreadCrumbinPGPisdisplayed(String DepartmentBreadCrumbname, String SubCategoryBreadCrumbname){
		try {
			/*testStepPassed("DepartmentBreadCrumbname : "+DepartmentBreadCrumbname);
			testStepPassed("SubCategoryBreadCrumbname : "+SubCategoryBreadCrumbname);*/
			
			if (driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]//span[contains(@class,'breadcrumb-item')]//a[contains(@id,'WC_BreadCrumb_Link_2')]")).isDisplayed()) {
				testStepPassed("Department Bread Crumb in PGP is displayed");
				String DepartmentBreadCrumbinPGP = driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]//span[contains(@class,'breadcrumb-item')]//a[contains(@id,'WC_BreadCrumb_Link_2')]")).getText();
				//testStepPassed("DepartmentBreadCrumbinPGP : "+DepartmentBreadCrumbinPGP);
				if (DepartmentBreadCrumbinPGP.contains(DepartmentBreadCrumbname)) {
					testStepPassed("Department Bread Crumb Name is same as Department Name");
				}
				//waitForElement(objectName, timeout);
			}
		} catch (Exception e) {
			//testStepWarning("Warning : Department Bread Crumb in "+DepartmentBreadCrumbname+"."+SubCategoryBreadCrumbname+" PGP is not displayed or Department Name is not Same");
			testStepWarning("Warning : Department Bread Crumb in PGP is not displayed or Department Name is not Same");
		}
	}


	
	public void verifyCorrespondingPGPisDisplayedWithSubCategoryBreadCrumbinPGPisdisplayed(String DepartmentBreadCrumbname, String SubCategoryBreadCrumbname){
		try {
			/*testStepPassed("DepartmentBreadCrumbname : "+DepartmentBreadCrumbname);
			testStepPassed("SubCategoryBreadCrumbname : "+SubCategoryBreadCrumbname);*/
			
			if (driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]//h1//span[contains(@class,'breadcrumb-item')]")).isDisplayed()) {
				testStepPassed("SubCategory Bread Crumb in PGP is displayed");
				String SubCategoryBreadCrumbinPGP = driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]//h1//span[contains(@class,'breadcrumb-item')]")).getText();
				
				//testStepPassed("SubCategoryBreadCrumbinPGP : "+SubCategoryBreadCrumbinPGP);
				int SubCategoryBreadCrumbinPGPLength = SubCategoryBreadCrumbinPGP.length();
				
				String EditedSubCategoryBreadCrumbinPGP = SubCategoryBreadCrumbinPGP.substring(SubCategoryBreadCrumbinPGP.indexOf("RE:")+4, SubCategoryBreadCrumbinPGPLength);
				//String EditedSubCategoryBreadCrumbinPGP = SubCategoryBreadCrumbinPGP.replace("YOU ARE CURRENTLY HERE: ", "");
				//testStepPassed(EditedSubCategoryBreadCrumbinPGP);
				
				if (EditedSubCategoryBreadCrumbinPGP.contains(SubCategoryBreadCrumbname)) {
					//testStepPassed("SubCategory Bread Crumb Name is same as SubCategory Name");
					testStepPassed("It Navigated to the Corresponding Product Grid Page. SubCategory Bread Crumb Name & SubCategory Name is same");
				}
			}
		} catch (Exception e) {
			testStepFailed("SubCategory Bread Crumb in PGP is not displayed or SubCategory Name is not Same");
		}
	}
	





	public void VerifyProductslistedinPGPIfNotRefreshthePage(){

		try {
			//waitTime(2);
			if (driver.findElement(By.xpath("//section//ul[@id='products']")).isDisplayed()) {
				testStepPassed("Products are listed in PGP page");
			}
		} catch (Exception e) {
			testStepPassed("Products are not listed in PGP page");
			driver.navigate().refresh();
			waitTime(1);
			if (driver.findElement(By.xpath("//section//ul[@id='products']")).isDisplayed()) {
				testStepPassed("Products are listed after refreshing the PGP page");
			}
			else {
				testStepFailed("Products are not displayed after refreshing the PGP page");
			}
		}

	}



	public void VerifyProductslistedinPGPIfNotRefreshthePageDifferentCloneId(){

		try {
			//waitTime(1);
			if (driver.findElement(By.xpath("//section//ul[@id='products']")).isDisplayed()) {
				testStepPassed("Products are listed in PGP page");
			}
		} catch (Exception e) {
			testStepPassed("Products are not listed in PGP page");
			driver.navigate().refresh();
			//waitTime(1);
			if (driver.findElement(By.xpath("//section//ul[@id='products']")).isDisplayed()) {
				testStepPassed("Products are listed after refreshing the PGP page");
			}
			else {
				testStepFailed("Products are not displayed after refreshing the PGP page");
			}
		}

	}


	public String selectProductInProductGridPage(String productName){
		waitTime(13);
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


	public String selectProductInProductGridPageDifferentCloneId(String productName){
		//waitTime(1);
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


	public String selectProductInProductGridPagenew(String productName){
		waitTime(8);
		if(!productName.isEmpty()){
			clickOn(productName+"product name#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+productName+"')]");
			testStepPassed("The Product is clicked for the first time");
			if (driver.findElement(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+productName+"')]")).isDisplayed()) {
				clickOn(productName+"product name#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+productName+"')]");
				testStepPassed("The Product is still visible in PGP page and clicked again");
			} else {

			}
			return productName;
		}else{
			String locator="first product listed#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a";
			productName=getText(locator);
			clickOn(productName+" product name#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+productName+"')]");
			return productName;
		}
	}




	public String clickOnQuickViewFromProductGridPage(String prodName){
		waitTime(2);
		if(!prodName.isEmpty()){
			if(currentBrowser.equalsIgnoreCase("internetexplorer")){
				System.out.println("//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]"+"First prod xpath-------");
				WebElement element=driver.findElement(By.xpath("//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on "+prodName+" product image");
				}
			}else{
				waitTime(2);
				mouseOver(prodName+" product image#xpath=//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]");
			}
			waitTime(1);
			clickOn(prodName+" product quick view button#xpath=//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]//a[contains(@id,'MiniGridQuickView')]");
			return prodName;
		}else{
			String locator="first product listed#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a";
			prodName=getText(locator);
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on '"+prodName+" product image");
				}
			}else{
				if(!currentBrowser.equalsIgnoreCase("internetexplorer"))
				{
					mouseOver(prodName+" product image#xpath=//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]");
				}
				else
				{
					mouseOver(prodName+" product image#xpath=//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]");


					Actions builder = new Actions(driver);
					builder.moveToElement(driver.findElementByXPath("//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]")).build().perform();
					builder.clickAndHold(driver.findElementByXPath("//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]")).perform();
				}
			}
			waitTime(1);
			clickOnSpecialElement(prodName+" product quick view button#xpath=//ul[contains(@id,'products')]//a[contains(@id,'CatalogEntry') and contains(text(),'"+prodName+"')]//parent::div//parent::li//div[contains(@id,'CatalogEntryProdImg')]//a[contains(@id,'MiniGridQuickView')]");
			return prodName;
		}
	}

	public int getNumberOfProductListedInProductGridPage(){
		List<WebElement>subcategoryLink=driver.findElements(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a"));
		return subcategoryLink.size();
	}



	public void mouseOverOnResultHeaderWebElement()
	{
		waitForElement(txt_results);
		clickOn(txt_results);
	}

	public void savedSizesInProductGridPage()
	{
		waitTime(3);
		waitForElement("#xpath=//a[@class='save-my-size filter__saved-sizes-save' and contains(text(),'Save Sizes')]");
		mouseOver(drp_size_filter);
		waitTime(2);
		//clickOn("#xpath=//a[@class='save-my-size filter__saved-sizes-save' and contains(text(),'Save Sizes')]");
		clickOnSpecialElement("#xpath=//a[@class='save-my-size filter__saved-sizes-save' and contains(text(),'Save Sizes')]");

	}


	public List<String> getProductWithMultipleColorSwatch(){
		List<String> prodName = new ArrayList<String>();
		try{
			List<WebElement> productList=driver.findElements(By.xpath("//li[contains(@class,'new-arrival')]"));
			if(productList.size()>0){
				for(int i=0;i<productList.size();i++){
					//if(productList.get(i).findElement(By.xpath("//div[contains(@class,'swatch-carousel')]")).isDisplayed()){
					try{
						WebElement ele= productList.get(i).findElement(By.xpath("//div[contains(@class,'swatch-carousel simplify')]")).findElement(By.xpath("//div[contains(@class,'swatch-frame')]"));
						if(ele.isDisplayed()){
							List<WebElement> colorSwatch=ele.findElements(By.xpath("//a[contains(@class,'js-color-swatch')]"));
							if(colorSwatch.size()>1){
								prodName.add(productList.get(i).findElement(By.xpath("//a[contains(@class,'prod-title')]")).getText());
							}
						}
					}catch(Exception e){

					}
					if(i==productList.size()-1 && prodName.isEmpty()){
						testStepFailed("Unable to find a product with multiple color swatches");
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Exception occured in getProductWithMultippleColorSwatch method : "+e);
		}
		return prodName;
	}
	/**Select Size from filter
	 * @param sizeOption[# separated values]
	 * @return
	 */
	public String selectSizeFromFilterOptionInProductGridPage(String sizeOption){
		try{
			String[] optionsSplit=sizeOption.split("#");
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//span[contains(@id,'size-heading') and contains(@class,'filter-btn')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'size filter dropdown");
				}
			}else{
				mouseOver(drp_size_filter);
			}
			waitTime(2);
//			WebElement sizeOptions= driver.findElement(By.xpath("//li[@class='filter__option-value opt_size'][1]"));
//			System.out.println(sizeOptions);
//			sizeOptions.click();
//			driver.findElement(By.xpath("//li[@class='filter__option-value opt_size'][1]")).click();
			mouseOver(drp_size_filter);
			clickOn(drp_size_filter);
			clickOnSpecialElement("#xpath=//li[@class='filter__option-value box-drop-down__item'][1]/label/input");
//			if(sizeOptions.size()>0){
//				String First = sizeOptions.get(1).getText();
//				System.out.println(First);
//		
//				sizeOptions.get(1).click();
//	
//				waitTime(2);
				//testStepPassed("click on :"+First+" size");
//				for(int i=0;i<sizeOptions.size();i++){
//					if(!sizeOption.isEmpty()){
//						for(int j=0;j<optionsSplit.length;j++){
//							if(sizeOptions.get(i).getText().contains(optionsSplit[j])){
//								do{
//									sizeOptions.get(i).click();
//									break;
//								}while(!sizeOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_size"));
//								testStepPassed("click on :"+sizeOptions.get(i).getText()+" size");
//							}
//						}
//					}else{
//						sizeOption=sizeOptions.get(i).getText().trim();
//						do{
//							sizeOptions.get(i).click();
//							break;
//						}while(!sizeOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_size"));
//						testStepPassed("click on :"+sizeOptions.get(i).getText()+" size");
//						break;
//					}
//				}
			//}
		}catch(Exception e){
			testStepFailed("Exception occured : "+e);
		}
		//mouseOver(lnk_bagicon);
		return sizeOption.split("#")[0];

	}
	/*public String selectSizeFromFilterOptionInProductGridPage(String sizeOption1){
		mouseOver(drp_size_filter);
		waitTime(2);
		List<WebElement> sizeOptions=driver.findElements(By.xpath("//span[contains(@id,'size-heading') and contains(@class,'filter-btn')]/parent::div//div//li[@class='opt_size']"));
		if(sizeOptions.size()>0){
			if(!sizeOption1.isEmpty()){
				for(WebElement ele:sizeOptions){
					if(ele.getText().equalsIgnoreCase(sizeOption1)){
						ele.click();
						testStepPassed("click on '"+sizeOption1+"' size");
						break;
					}
				}
			}else{
				sizeOption1=sizeOptions.get(0).getAttribute("size");
				sizeOptions.get(0).click();
				testStepPassed("click on '"+sizeOption1+"' size");
			}
		}else{
			testStepFailed("Size options are not listed");
		}
		return sizeOption1;
	}*/
	/**Select type from filter drop down
	 * @param typeOption[# separated values]
	 * @return
	 */
	public String selectTypeFromFilterOptionInProductGridPage(String typeOption){
		try{
			String[] optionsSplit=typeOption.split("#");
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//span[contains(@id,'type') and contains(@class,'filter-btn')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'type filter dropdown");
				}
			}else{
				mouseOver(drp_type_filter);
			}

			waitTime(2);
			List<WebElement> typeOptions=driver.findElements(By.xpath("//span[contains(@id,'type') and contains(@class,'filter-btn')]/parent::div//div//li[contains(@class,'opt_style_center-vent')]"));
			if(typeOptions.size()>0){
				for(int i=0;i<typeOptions.size();i++){
					if(!typeOption.isEmpty()){
						for(int j=0;j<optionsSplit.length;j++){
							if(typeOptions.get(i).getText().contains(optionsSplit[j])){
								do{
									typeOptions.get(i).click();
								}while(!typeOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
								testStepPassed("click on :"+typeOptions.get(i).getText()+" type");
							}
						}
					}else{
						typeOption=typeOptions.get(i).getText().trim();
						do{
							typeOptions.get(i).click();
						}while(!typeOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
						break;
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Exception occured : "+e);
		}
		return typeOption.split("#")[0];
	}

	/**Select fit from filter drop down
	 * @param fitOption[# separated values]
	 * @return
	 */
	public String selectFitFromFilterOptionInProductGridPage(String fitOption){
		try{
			String[] optionsSplit=fitOption.split("#");
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//span[contains(@id,'fit') and contains(@class,'filter-btn')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'fit filter dropdown");
				}
			}else{
				mouseOver(drp_fit_filter);
			}

			waitTime(2);
			List<WebElement> fitOptions=driver.findElements(By.xpath("//span[contains(@id,'fit') and contains(@class,'filter-btn')]/parent::div//div//li[@class='opt_style_center-vent']"));
			if(fitOptions.size()>0){
				for(int i=0;i<fitOptions.size();i++){
					if(!fitOption.isEmpty()){
						for(int j=0;j<optionsSplit.length;j++){
							if(fitOptions.get(i).getText().contains(optionsSplit[j])){
								do{
									fitOptions.get(i).click();
								}while(!fitOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
								testStepPassed("click on :"+fitOptions.get(i).getText()+" fit");
							}
						}
					}else{
						fitOption=fitOptions.get(i).getText().trim();
						do{
							fitOptions.get(i).click();
						}while(!fitOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
						testStepPassed("click on :"+fitOptions.get(i).getText()+" fit");
						break;
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Exception occured : "+e);
		}
		return fitOption.split("#")[0];
	}

	/**Select price from filter drop down
	 * @param priceOption[# separated values]
	 * @return
	 */
	public String selectPriceFromFilterOptionInProductGridPage(String priceOption){
		try{
			String[] optionsSplit=priceOption.split("#");
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//span[contains(@id,'price') and contains(@class,'filter-btn')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'price filter dropdown");
				}
			}else{
				mouseOver(drp_price_filter);
			}

			waitTime(2);
			List<WebElement> fitOptions=driver.findElements(By.xpath("//span[contains(@id,'price') and contains(@class,'filter-btn')]/parent::div//div//li[@class='opt_style_center-vent']"));
			if(fitOptions.size()>0){
				for(int i=0;i<fitOptions.size();i++){
					if(!priceOption.isEmpty()){
						for(int j=0;j<optionsSplit.length;j++){
							if(fitOptions.get(i).getText().contains(optionsSplit[j])){
								do{
									fitOptions.get(i).click();
								}while(!fitOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
								testStepPassed("click on :"+fitOptions.get(i).getText()+" price");
							}
						}
					}else{
						priceOption=fitOptions.get(i).getText().trim();
						do{
							fitOptions.get(i).click();
						}while(!fitOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
						testStepPassed("click on :"+fitOptions.get(i).getText()+" price");
						break;
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Exception occured : "+e);
		}
		return priceOption.split("#")[0];
	}

	/**Select brand from filter drop down
	 * @param brandOption[# separated values]
	 * @return
	 */
	public String selectBrandFromFilterOptionInProductGridPage(String brandOption){
		try{
			String[] optionsSplit=brandOption.split("#");
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//span[contains(@id,'brand') and contains(@class,'filter-btn')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'brand filter dropdown");
				}
			}else{
				mouseOver(drp_brand_filter);
			}

			waitTime(2);
			List<WebElement> brandOptions=driver.findElements(By.xpath("//span[contains(@id,'brand') and contains(@class,'filter-btn')]/parent::div//div//li[@class='opt_style_center-vent']"));
			if(brandOptions.size()>0){
				for(int i=0;i<brandOptions.size();i++){
					if(!brandOption.isEmpty()){
						for(int j=0;j<optionsSplit.length;j++){
							if(brandOptions.get(i).getText().contains(optionsSplit[j])){
								do{
									brandOptions.get(i).click();
								}while(!brandOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
								testStepPassed("click on :"+brandOptions.get(i).getText()+" brand");
							}
						}
					}else{
						brandOption=brandOptions.get(i).getText().trim();
						do{
							brandOptions.get(i).click();
						}while(!brandOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
						testStepPassed("click on :"+brandOptions.get(i).getText()+" brand");
						break;
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Exception occured : "+e);
		}
		return brandOption.split("#")[0];
	}


	/**Select material from filter drop down
	 * @param materialOption[# separated values]
	 * @return
	 */
	public String selectMaterialFromFilterOptionInProductGridPage(String materialOption){
		try{
			String[] optionsSplit=materialOption.split("#");
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//span[contains(@id,'material') and contains(@class,'filter-btn')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'material filter dropdown");
				}
			}else{
				mouseOver(drp_material_filter);
			}
			waitTime(2);
			List<WebElement> materialOptions=driver.findElements(By.xpath("//span[contains(@id,'material') and contains(@class,'filter-btn')]/parent::div//div//li[@class='opt_style_center-vent']"));
			if(materialOptions.size()>0){
				for(int i=0;i<materialOptions.size();i++){
					if(!materialOption.isEmpty()){
						for(int j=0;j<optionsSplit.length;j++){
							if(materialOptions.get(i).getText().contains(optionsSplit[j])){
								do{
									materialOptions.get(i).click();
								}while(!materialOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
								testStepPassed("click on :"+materialOptions.get(i).getText()+" material");
							}
						}
					}else{
						materialOption=materialOptions.get(i).getText().trim();
						do{
							materialOptions.get(i).click();
						}while(!materialOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent selected"));
						testStepPassed("click on :"+materialOptions.get(i).getText()+" material");
						break;
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Exception occured : "+e);
		}
		return materialOption.split("#")[0];
	}

	/**Select color from filter drop down
	 * @param colorOption[# separated values]
	 * @return
	 */
	public String selectColorFromFilterOptionInProductGridPage(String colorOption){
		try{
			String[] optionsSplit=colorOption.split("#");
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//span[contains(@id,'color-heading') and contains(@class,'filter-btn')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'color filter dropdown");
				}
			}else{
				mouseOver(drp_color_filter);
			}
			waitTime(2);
			List<WebElement> colorOptions=driver.findElements(By.xpath("//span[contains(@id,'color-heading') and contains(@class,'filter-btn')]/parent::div//div//li[@class='opt_style_center-vent no-border']"));
			if(colorOptions.size()>0){
				for(int i=0;i<colorOptions.size();i++){
					if(!colorOption.isEmpty()){
						for(int j=0;j<optionsSplit.length;j++){
							if(colorOptions.get(i).getText().contains(optionsSplit[j])){
								do{
									colorOptions.get(i).click();
								}while(!colorOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent no-border selected"));
								testStepPassed("click on :"+colorOptions.get(i).getText()+" color");
							}
						}
					}else{
						colorOption=colorOptions.get(i).getText().trim();
						do{
							colorOptions.get(i).click();
						}while(!colorOptions.get(i).getAttribute("class").equalsIgnoreCase("opt_style_center-vent no-border selected"));
						testStepPassed("click on :"+colorOptions.get(i).getText()+" color");
						break;
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Exception occured : "+e);
		}
		return colorOption.split("#")[0];
	}
	public void clickonFindInStoreTabInPGP()
	{
		clickOn(tab_find_in_StoreTab);
	}

	public boolean verifyFilterSaveSizeFromProductGridPage()
	{
		boolean flag=false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(!driver.findElement(By.xpath("//li[contains(@id,'removeFacet')]")).isDisplayed()){
				flag=true;
			}
		}catch(Exception e){

		}
		//clickOn(txt_saved_item);
		return flag;
	}

	public String getProductOfferPriceFromProductGridPage(String prodName){
		if(!prodName.isEmpty()){
			return  getText(prodName+"'s offer price#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+prodName+"')]/parent::div/parent::li//div[contains(@id,'product_price')]/p[contains(@id,'offerPrice')]");
		}else{
			String locator="first product listed#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')][1]//div[@class='prod-info']/a";
			prodName=getText(locator);
			System.out.println("PGP Price");
			System.out.println(getText(prodName+"'s offer price#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+prodName+"')]/parent::div/parent::li//div[contains(@id,'product_price')]/p[contains(@id,'offerPrice')]"));
			
			return  getText(prodName+"'s offer price#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+prodName+"')]/parent::div/parent::li//div[contains(@id,'product_price')]/p[contains(@id,'offerPrice')]");

		}
	}
	
	
	
	
	public String getProductNameFromProductGridPage(String Productname){
		try {
			//String Productprice=null;
			if (driver.findElement(By.xpath("//ul[contains(@id,'products')]//li[1]//div[contains(@class,'prod-info')]//a")).isDisplayed()) {
				Productname = driver.findElement(By.xpath("//ul[contains(@id,'products')]//li[1]//div[contains(@class,'prod-info')]//a")).getText();
			}
		} catch (Exception e) {
			testStepFailed("First Product name is not displayed for first product in PGP");
		}
		return Productname;
	}
	
	
	
	
	
	
	public String getProductPriceFromProductGridPage(String Productprice){
		try {
			//String Productprice=null;
			if (driver.findElement(By.xpath("//ul[contains(@id,'products')]//li[1]//div[contains(@id,'product_price')]//p[contains(@id,'offerPrice')]")).isDisplayed()) {
				Productprice = driver.findElement(By.xpath("//ul[contains(@id,'products')]//li[1]//div[contains(@id,'product_price')]//p[contains(@id,'offerPrice')]")).getText();
				Productprice = StringUtils.substringAfter(Productprice, "$");
			}
		} catch (Exception e) {
			testStepFailed("First Product price is not displayed for first product in PGP");
		}
		return Productprice;
	}
	

	public boolean verifyProductsListedInProductGridPage(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//ul[contains(@id,'products')]")).isDisplayed()) flag = true;
			else {};
		}catch(Exception e){}
		return flag;
	}


	public void clickOnGmailInPGP(){
		if(isEmailServicePopupDisplayed()) clickOnGmailInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPGP);
			clickOnGmailInEmailServicePopup();
		}
	}

	public void clickOnYahooInPGP(){
		if(isEmailServicePopupDisplayed()) clickOnYahooInEmailServicePopup();	
		else{
			clickOn(lnk_EmailInPGP);
			clickOnYahooInEmailServicePopup();	
		}
	}

	public void clickOnAOLInPGP(){
		if(isEmailServicePopupDisplayed())	clickOnAOLInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPGP);
			clickOnAOLInEmailServicePopup();
		}
	}

	public void clickOnHotmailInPGP(){
		if(isEmailServicePopupDisplayed()) clickOnHotmailInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPGP);
			clickOnHotmailInEmailServicePopup();
		}
	}

	public void clickOnTwitterInPGP(){
		clickOn(lnk_TwitterInPGP);
	}

	public void clickOnFacebookInPGP(){
		clickOn(lnk_FacebookInPGP);
	}

	public void clickOnGooglePlusInPGP(){
		clickOn(lnk_GooglePlusInPGP);		
	}

	public String selectRandomProductInProductGridPage(){
		String productName = "";

		try{
			List<WebElement> prodList=driver.findElements(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a"));
			if(prodList.size()>0){
				productName=prodList.get(new Random().nextInt(prodList.size())).getText();
				selectProductInProductGridPage(productName);
			}
		}catch(Exception e){

		}
		return productName;
	}

	public String getProductWithColorSwatch(){
		String prodName = "";
		try{
			List<WebElement> productList=driver.findElements(By.xpath("//li[contains(@class,'new-arrival')]//div[contains(@class,'swatch-carousel')]//parent::li//div[contains(@class,'prod-info')]/a"));
			if(productList.size()>0){
				for(int i=0;i<productList.size();i++){
					if(!productList.get(i).getText().contains("'")){
						prodName=productList.get(i).getText().trim();
						break;
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Exception occured in getProductWithMultippleColorSwatch method : "+e);
		}
		return prodName;
	}
	public void verifyProductGridPageListedProducts(){
		try{
			waitTime(1);

			/*WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='products']")));*/

			if(driver.findElement(By.xpath("//ul[@id='products']")).isDisplayed()){
				//testStepPassed("Verified Products are Listed In Product Grid Page");
				testStepPassed("Verified Products are Listed In Product Grid Page");
				
			}  
		}catch(Exception e){
			testStepFailed("Products are not Listed In Product Grid Page");  
		}
		
	}
	
	

	public boolean verifyProductGridPage(){
		boolean flag = false;
		if(verifyProductsListedInProductGridPage()){
			flag =true;
			testStepPassed("Product Grid Page is Displayed.");
		}else{
			testStepFailed("Product Grid Page is not Displayed.");
		}
		return flag;
	}

	public boolean scrolldownInProductGridPage(){
		boolean flag = false;
		try{
			driver.findElement(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a")).sendKeys(Keys.PAGE_DOWN);      
			//testStepPassed("Performed Scroll Down In Product Grid Page");
			flag=true;
		}catch(Exception e){

		}
		return flag;
	}


	public boolean scrolldownSafariInProductGridPage(){
		boolean flag = false;
		try{
			driver.findElement(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a"));      
			//testStepPassed("Performed Scroll Down In Product Grid Page");
			flag=true;
		}catch(Exception e){

		}
		return flag;
	}


	public boolean scrollUpInProductGridPage(){
		boolean flag = false;
		try{
			driver.findElement(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a")).sendKeys(Keys.PAGE_UP);      
			//testStepPassed("Performed Scroll Down In Product Grid Page");
			flag=true;
		}catch(Exception e){

		}
		return flag;
	}


	public boolean isProductGridPageDisplayed(){
		boolean flag = false;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
			if(driver.findElement(By.xpath("//ul[contains(@id,'products')]")).isDisplayed()){
				flag =true;
			}
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return flag;
	}


	public void verifyCertonaWidgetisDisplayedandGettheCertonaProductCountNamestinPGPPage(){
		try{
			if (driver.findElement(By.xpath("//div[contains(@id,'page')]//div//section[contains(@class,'certona-widget')]")).isDisplayed()) {
				testStepPassed("Certona Widget is Displayed in PGP Page");
				/*if(driver.findElement(By.xpath("//div[contains(@id,'page')]//div//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]")).isDisplayed()){
					String CertonaTitle = driver.findElement(By.xpath("//div[contains(@id,'page')]//div//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]")).getText();
					testStepPassed("Certona Widget Title : "+CertonaTitle);
					List<WebElement> CertonaProducts = driver.findElements(By.xpath("//div[contains(@id,'page')]//div//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]"));
					int CertonaProductsCount = CertonaProducts.size();
					testStepPassed("Certona products Count in Widget : "+CertonaProductsCount);
					List<WebElement> CertonaProductNameList = driver.findElements(By.xpath("//div[contains(@id,'page')]//div//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]//div[contains(@class,'certona-product')]//a[contains(@class,'certona-product__link')]//div[contains(@class,'certona-product__title')]"));
					testStepPassed("Following are the products displayed in Certona Widget");
					for (int i = 0; i <= CertonaProductsCount; i++) {
						i=i+1;
						for (WebElement cer : CertonaProductNameList) {
							//String CertonaProductName = cer.getText();
							String CertonaProductName = cer.getAttribute("innerText");
							//testStepPassed(+i "." +CertonaProductName);
							testStepPassed(""+i+"."+CertonaProductName);
							i=i+1;
						}
					}
				}  */
			}
		}catch(Exception e){
			testStepWarning("Warning : Certona Widget is not displayed");  
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
					if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]")).isDisplayed()) {
						String CertonaTitle = driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]")).getText();
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
			testStepFailed("Certona Widget is not displayed in Product Grid Page");  
		}
	}



	public boolean 	isCorrespondingProductGridPageDisplayed(String subCategoryName,String breadCrumb){
		boolean flag = false;
		try{
			if(subCategoryName.equalsIgnoreCase(breadCrumb) || subCategoryName.toLowerCase().contains(breadCrumb.toLowerCase())  ||  breadCrumb.toLowerCase().contains(subCategoryName.toLowerCase())){
				flag = true;
			}else if( subCategoryName.equalsIgnoreCase("VIEW ALL SHOE BRANDS") && breadCrumb.equalsIgnoreCase("Shoes")){
				flag = true;
			}else if( subCategoryName.equalsIgnoreCase("VIEW ALL SUIT BRANDS") && breadCrumb.equalsIgnoreCase("Suits")){
				flag = true;
			}else if( subCategoryName.equalsIgnoreCase("VIEW ALL DRESS SHIRT BRANDS") && breadCrumb.equalsIgnoreCase("Dress Shirts")){
				flag = true;
			}else if( subCategoryName.equalsIgnoreCase("classic fit") && breadCrumb.equalsIgnoreCase("Dress Shirts")){
				flag = true;
			}
			//			else if(( subCategoryName.equalsIgnoreCase("VIEW ALL SUIT BRANDS"))|| (subCategoryName.equalsIgnoreCase("VIEW ALL SUITS")) && breadCrumb.equalsIgnoreCase("Suits") ){
			//				flag = true;
			//			}
		}catch(Exception e){
		}
		return flag;
	}
	public String selectProductLinks(){
		List<WebElement> productNameListXpath = null;
		List<String> productNameList = new ArrayList<String>();
		String productName=null;
		productNameListXpath = driver.findElements(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a"));
		for(int i=0;i<productNameListXpath.size();i++){
			productNameList.add(productNameListXpath.get(i).getText().trim());
			System.out.println(i+1+")"+"Trim-----"+productNameListXpath.get(i).getText().trim());
			System.out.println(i+1+")"+"Non Trim-"+productNameListXpath.get(i).getText());
		}
		String a;

		for(int i=0;i<productNameList.size();i++){
			a=productNameList.get(i);	
			System.out.println(i+1+")"+a);
			if(!a.contains("'")){
				productName=a;
				productNameListXpath.get(i).click();
				testStepPassed("Click on : '"+productName+"' product name");
				break;
			}
		}
		return productName;
	}
	public boolean isSubCategoryBannerPageDisplayed(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//*[contains(@class,'jh-col jh-lg')]")).isDisplayed()){
				flag =true;
			}
		}catch(Exception e){
		}
		return flag;
	}
	public boolean isSubCategoryBannerPageDisplayed(String subCategoryName){
		boolean flag = false;
		try{
			if(subCategoryName.equalsIgnoreCase("Custom Suits, Blazers & Dress Shirts")){
				if(driver.getCurrentUrl().contains("custom-suits-dress-shirts")){
					flag =true;				
				}
			}else if(subCategoryName.equalsIgnoreCase("AWEARNESS Kenneth Cole")){				
				if(driver.getCurrentUrl().contains("awearness-kenneth-cole")){
					flag =true;				
				}
			}else if(subCategoryName.equalsIgnoreCase("All Big & Tall")){				
				if(driver.getCurrentUrl().contains("big-and-tall-mens-clothing")){
					flag =true;				
				}
			}

		}catch(Exception e){

		}
		return flag;
	}
	public boolean 	isLinksDisplayedInSubCategoryBannerPage(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//*[contains(@id,'MASTER')]//div/a")).isDisplayed()){
				flag = true;
			}
		}catch(Exception e){
		}
		return flag;
	}
	public String clickOnAnyLinkInSubCategoryBannerPage(){
		String subCategoryBannerPageLink="";
		try{
			List<WebElement> subCategoryBannerPageLinks=driver.findElements(By.xpath("//*[contains(@id,'MASTER')]//div/a"));
			if(subCategoryBannerPageLinks.size()>0){
				webElement=subCategoryBannerPageLinks.get(new Random().nextInt(subCategoryBannerPageLinks.size()));
				subCategoryBannerPageLink=webElement.getText().trim();
				locatorDescription="Click on : "+subCategoryBannerPageLink+" link in Sub Category Banner Page";
				webElement.click();
				testStepPassed(locatorDescription);
			}
		}catch(Exception e){

		}
		return subCategoryBannerPageLink;
	}
	public boolean isGroomsmenGiftsPageDisplayed(){
		boolean flag = false;
		try{
			if(driver.getCurrentUrl().contains("gifts.menswearhouse.com")){
				flag=true;
			}
		}catch(Exception e) {
		}
		return flag;
	}
	public String selectProductInProductGridPage_New(String productName){
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


	public void selectSortFilterinPGPPage(String PGPPageSortByFilter){
		try {
			waitTime(4);
			if (driver.findElement(By.xpath("//div[contains(@id,'searchBasedNavigationWithTopNav_widget')]//select[contains(@id,'orderBy')]")).isDisplayed()) {
				selectFromDropdown(drp_PGPPage_SortByFilter, PGPPageSortByFilter);
			} else {
				testStepPassed("The PGP Page Sort By Filter is not clicked");
			}
		} catch (Exception e) {
			
			testStepPassed("The PGP Page Sort By Filter is not found");
		}

	}


	public void selectTypeSortFilterinPGPPage(String PGPPageTypeSortByFilter){
		try {
			waitTime(4);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//form[contains(@id,'productsFacets')]//ul[contains(@id,'facetFilterList')]//div[contains(@class,'filter type')]//span[contains(@id,'type')]"))).build().perform();
			waitTime(2);
			driver.findElement(By.xpath("//ul[contains(@id,'facetFilterList')]//ul/label//li[contains(text(),'"+PGPPageTypeSortByFilter+"')]")).click();

		} catch (Exception e) {
			
			testStepPassed("The PGP Page Sort By Filter is not found");
		}

	}
	
	public int getProductcountinPGP(){
		//List <WebElement> CountofProducts = driver.findElements(By.xpath("//ul[contains(@id,'products')]/li/div[contains(@class,'prod-info')]/a"));
		List <WebElement> CountofProducts = driver.findElements(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a"));
		int itemsCount = CountofProducts.size(); 
		//String ProductCount = String.valueOf(itemsCount);
		return itemsCount;
	}


	
	public void scrolldownProductsinPGP(){
		driver.findElement(By.xpath("//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a")).sendKeys(Keys.PAGE_DOWN);
	}
	
	public static final String lnk_QV_Close = "QV close Link#xpath=//a[@id='WC_QuickInfo_Link_close']";
	
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
	
	public String selectProductFromShopMyStoreTab(String productName){
		//if(driver.findElement(By.xpath("//div[contains(@class,'product_listing_container')]/ul/li/div//a")).isDisplayed()) {
		if(!productName.isEmpty()){
			clickOn(productName+" product name#xpath=//div[@id='shopMyStore']//div[contains(@class,'product_listing_container')]/ul/li//div[contains(@class,'prod-info')]//a[contains(text(),'"+productName+"')]");
			return productName;
		}else{
			String locator="first product listed#xpath=//div[@id='shopMyStore']//div[contains(@class,'product_listing_container')]/ul/li//div[contains(@class,'prod-info')]//a";
			//productName=getAttributeValue(locator, "innerText");
			productName = getText(locator);
			//productName = driver.findElement(By.xpath("//div[contains(@class,'product_listing_container')]/ul/li/div//div[contains(@class,'product_name')]//a")).getAttribute("innerText");
			clickOn(productName +"product name #xpath=//div[@id='shopMyStore']//div[contains(@class,'product_listing_container')]/ul/li//div[contains(@class,'prod-info')]//a[contains(text(),'"+productName+"')]");
			waitTime(1);
			return productName;
		}
		
	}
	public static final String txt_shopMyStore = "Shop my store#xpath=//ul[contains(@class, 'js-pgp-shopping-tab')]//li//a[@href='#shopMyStore']";	

	public void verifyShopMyStoreTab()
	{
		  if(isElementDisplayed(txt_shopMyStore))
		  {
			  testStepPassed("Shop My Store tab is displayed");
		  }
	}

public void verifyShopAllItemsTab()
{
	  if(driver.findElement(By.xpath("//ul[contains(@class, 'js-pgp-shopping-tab')]//li//a[@href='#shopAllItems']")).isEnabled()) 
	  {
		  testStepPassed("Shop All items tab is displayed");
	  }
}
	
/*public void selectSizeFilter(String FilterValue) {
	if (driver.findElement(By.xpath("//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]")).isDisplayed()) {
		testStepPassed("Filter type Size is displayed");
		Click Filter Type
		clickOn("Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");
		waitTime(3);
	}
	click options from filter
	clickOnSpecialElement("'"+FilterValue+"' Filter Value#xpath=//span[contains(text(),'Size')]//parent::div//ul/li/label/span[contains(text(),'"+FilterValue+"')]");
	waitTime(5);
	
	clickOn("Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");

}*/

public String selectColorFilter(String FilterValue) {
	String ColorFiltervalue = null;
	if (driver.findElement(By.xpath("//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Color')]")).isDisplayed()) {
		testStepPassed("Filter type Color is displayed");
		/*Click Filter Type*/
		clickOn("Color Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Color')]");
		waitTime(3);
	}
	/*click options from filter*/
	ColorFiltervalue = driver.findElement(By.xpath("(//ul[contains(@class,'filter_Color')]/li/label/input[not(contains(@disabled,'disabled'))])[1]")).getAttribute("data-text");
	System.out.println(ColorFiltervalue);
	clickOnSpecialElement("'"+ColorFiltervalue+"' Filter Value#xpath=(//ul[contains(@class,'filter_Color')]/li/label/input[not(contains(@disabled,'disabled'))])[1]");
	waitTime(5);
	clickOn("Color Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Color')]");
	return ColorFiltervalue;

}	

public void clickShopMyStoreTab() {
	clickOn(txt_shopMyStore);
}
	
String shopAllItemsProductCount=null;
public String shopAllItemsCount() {
	waitTime(2);
	if(isElementDisplayed(txt_shopAllItems)) {
	 shopAllItemsProductCount = driver.findElement(By.xpath("//span[@class='shopping-tabs__items-count']//span[contains(@class, 'js-available-product-count-all num_products')]")).getText();
	//testStepPassed("Shop All Items Product Count : " + shopAllItemsProductCount);
	}
	else {
		testStepFailed("Shop All Items Product Count is not displayed");
	}
	return shopAllItemsProductCount;

}
String shopMyStoreProductCount=null;
public String shopMyStoreCount() {
	waitTime(2);
	if(isElementDisplayed(txt_shopMyStore)) {
		shopMyStoreProductCount = driver.findElement(By.xpath("//span[@class='shopping-tabs__items-count']//span[contains(@class, 'js-available-product-fis-count-all num_products')]")).getText();
	//testStepPassed("Shop My Store Product Count : " + shopMyStoreProductCount);
	}
	else {
		testStepFailed("Shop My Store Product Count is not displayed");
	}
	return shopMyStoreProductCount;
	
}

public String getProductNameFromProductGridPageForAllProductsInPGP(String Productname, int i){
	try {
		//String Productprice=null;
		if (driver.findElement(By.xpath("//ul[contains(@id,'products')]//li["+ i +"]//div[contains(@class,'prod-info')]//a")).isDisplayed()) {
			Productname = driver.findElement(By.xpath("//ul[contains(@id,'products')]//li["+ i +"]//div[contains(@class,'prod-info')]//a")).getText();
		}
	} catch (Exception e) {
		testStepFailed(" Product name is not displayed for first product in PGP");
	}
	return Productname;
}


public String getProductPriceFromProductGridPageForAllProductsInPGP(String Productprice, int i){
	try {
		//String Productprice=null;
		if (driver.findElement(By.xpath("//ul[contains(@id,'products')]//li["+ i +"]//div[contains(@id,'product_price')  or contains(@id, 'bundlePrice')]//p[contains(@id,'offerPrice') or contains(@id, 'bundlePrice')]")).isDisplayed()) {
			Productprice = driver.findElement(By.xpath("//ul[contains(@id,'products')]//li["+ i +"]//div[contains(@id,'product_price')  or contains(@id, 'bundlePrice')]//p[contains(@id,'offerPrice') or contains(@id, 'bundlePrice')]")).getText();
			Productprice = StringUtils.substringAfter(Productprice, "$");
			if(Productprice.contains(",") && Productprice.contains("to")) {
				Productprice = Productprice.replace("$", "");
				Productprice = Productprice.replace(",", "");
				//Productprice = Productprice.replace("to", "");
				Productprice = Productprice.replace("−", "");
				Productprice = Productprice.replace("\n", " ");
				Productprice = Productprice.trim();
				testStepPassed(Productprice);
				

			}
		}
	} catch (Exception e) {
		testStepFailed(" Product price is not displayed for the products in PGP");
	}
	return Productprice;
}

public String selectAllProductInProductGridPage(String productName, int i){
	//waitTime(2);
	if(!productName.isEmpty()){
		clickOn(productName+"product name#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+productName+"')]");
		return productName;
	}else{
		String locator="first product listed#xpath=(//ul[@id='products']//li[contains(@class,'new-arrival')])["+ i +"]//div[@class='prod-info']/a";
		productName=getText(locator);
		clickOn(productName+" product name#xpath=//ul[@id='products']//li[contains(@class,'new-arrival')]//div[@class='prod-info']/a[contains(text(),'"+productName+"')]");
		return productName;
	}
}

public String getProductPromotionNameInPGP(String promotionName) {
		String locator="first product listed#xpath=//ul[@id='products']//p[contains(@id, 'promotionStr')]//span";
		promotionName=getText(locator);
		clickOn(promotionName+" promotion name#xpath=//ul[@id='products']//p[contains(@id, 'promotionStr')]//span[contains(text(),'"+promotionName+"')]");
		return promotionName;
	}

public String selectSizeFilter(String FilterValue) {
	String SizeFiltervalue = null;
	if (driver.findElement(By.xpath("//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]")).isDisplayed()) {
		testStepPassed("Filter type Size is displayed");
		/*Click Filter Type*/
		clickOn("Size Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");
		waitTime(3);
	}
	/*click options from filter*/
	List<WebElement> Sizecount = driver.findElements(By.xpath("//ul[contains(@class,'size-filter')]/li/label/input[not(contains(@disabled,'disabled'))]"));
 	int SizeFilterSizeCount = Sizecount.size();
 	for (int i = 1; i <=SizeFilterSizeCount; i++) {
 		SizeFiltervalue = driver.findElement(By.xpath("(//ul[contains(@class,'size-filter')]/li/label/input[not(contains(@disabled,'disabled'))])["+i+"]")).getAttribute("title");
 		System.out.println(SizeFiltervalue);
 		clickOnSpecialElement("'"+SizeFiltervalue+"' Filter Value#xpath=(//ul[contains(@class,'size-filter')]/li/label/input[not(contains(@disabled,'disabled'))])["+i+"]");
 		waitTime(5);
 		//clickOn("Size Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");
 		clickOnSpecialElement("Size Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");
 		shopMyStoreProductCount = shopMyStoreCount();
 		int ShopmystoreProductCount = Integer.parseInt(shopMyStoreProductCount);
 		if(ShopmystoreProductCount>0) {
 			testStepPassed("Shop My Store Product Count : " + ShopmystoreProductCount);
 			waitTime(2);
 			//clickOn("Size Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");
 			clickOnSpecialElement("Size Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");
 		
 			break;
 		}
 		else {
 			clickOn("Size Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");
 			clickOnSpecialElement("'"+SizeFiltervalue+"' Filter Value#xpath=(//ul[contains(@class,'size-filter')]/li/label/input[not(contains(@disabled,'disabled'))])["+i+"]");
 			waitTime(5);
 			clickOn("Size Filter#xpath=//ul[contains(@id,'facetFilterList')]/li//span[@role='button']//parent::span[contains(text(),'Size')]");
 			}
 	}
 	
	return SizeFiltervalue;

}

public void verifyCorrespondingPGPisDisplayedWithDepartmentBreadCrumbinPGPisdisplayed(String DepartmentBreadCrumbname) {
	try {
		/*testStepPassed("DepartmentBreadCrumbname : "+DepartmentBreadCrumbname);
		testStepPassed("SubCategoryBreadCrumbname : "+SubCategoryBreadCrumbname);*/
		
		if (driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]//h1//span[contains(@class,'breadcrumb-item')]")).isDisplayed()) {
			testStepPassed("Category Bread Crumb in PGP is displayed");
			String CategoryBreadCrumbinPGP = driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]//h1//span[contains(@class,'breadcrumb-item')]")).getText();
			
			//testStepPassed("SubCategoryBreadCrumbinPGP : "+SubCategoryBreadCrumbinPGP);
			int CategoryBreadCrumbinPGPLength = CategoryBreadCrumbinPGP.length();
			
			String EditedCategoryBreadCrumbinPGP = CategoryBreadCrumbinPGP.substring(CategoryBreadCrumbinPGP.indexOf("RE:")+4, CategoryBreadCrumbinPGPLength);
			//String EditedSubCategoryBreadCrumbinPGP = SubCategoryBreadCrumbinPGP.replace("YOU ARE CURRENTLY HERE: ", "");
			//testStepPassed(EditedSubCategoryBreadCrumbinPGP);
			
			if (EditedCategoryBreadCrumbinPGP.contains(DepartmentBreadCrumbname)) {
				//testStepPassed("SubCategory Bread Crumb Name is same as SubCategory Name");
				testStepPassed("It Navigated to the Corresponding Product Grid Page. Department Bread Crumb Name & Department Name is same");
			}
		}
	} catch (Exception e) {
		testStepFailed("Department Bread Crumb in PGP is not displayed or Department Name is not Same");
	}
}

	
}

