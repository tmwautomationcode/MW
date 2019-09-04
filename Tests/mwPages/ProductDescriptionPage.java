package mwPages;

import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class ProductDescriptionPage extends PopupWindows{
	public ProductDescriptionPage(BaseClass obj){
		super(obj);
	}


	public static final String lnk_PDP_SocialLinks="Social Link#xpath=//div[contains(@id,'social-buttons')]//ul[contains(@class,'share-list')]//li";
	public static final String lnk_PDP_SocialLinks_Pinterest="Pinterest social link#xpath=//div[contains(@id,'social-buttons')]//ul[contains(@class,'share-list')]//li[contains(@class,'pin')]//a";
	public static final String lnk_PDP_SocialLinks_Facebook="Facebook social link#xpath=//div[contains(@id,'social-buttons')]//ul[contains(@class,'share-list')]//li[contains(@class,'fb')]//a";
	public static final String lnk_PDP_SocialLinks_Twitter="Twitter social link#xpath=//div[contains(@id,'social-buttons')]//ul[contains(@class,'share-list')]//li[contains(@class,'tw')]//a";
	public static final String lnk_PDP_SocialLinks_GooglePlus="GooglePlus social link#xpath=//div[contains(@id,'social-buttons')]//ul[contains(@class,'share-list')]//li[contains(@class,'gplus')]//a";
	public static final String lnk_PDP_SocialLinks_Email="Email social link#xpath=//div[contains(@id,'social-buttons')]//ul[contains(@class,'share-list')]//li[contains(@class,'email')]//a";
	public static final String lnk_PDP_SocialLinks_Email_Gmail="Gmail in Email social link#xpath=//div[contains(@id,'email-share-modal')]//div[contains(@class,'email-share-links')]//a[contains(text(),'Gmail')]";
	public static final String lnk_PDP_SocialLinks_Email_AOL="AOL in Email social link#xpath=//div[contains(@id,'email-share-modal')]//div[contains(@class,'email-share-links')]//a[contains(text(),'AOL')]";
	public static final String lnk_PDP_SocialLinks_Email_Yahoo="Yahoo in Email social link#xpath=//div[contains(@id,'email-share-modal')]//div[contains(@class,'email-share-links')]//a[contains(text(),'Yahoo')]";
	public static final String lnk_PDP_SocialLinks_Email_Hotmail="Hotmail in Email social link#xpath=//div[contains(@id,'email-share-modal')]//div[contains(@class,'email-share-links')]//a[contains(text(),'Hotmail')]";
	public static final String lnk_PDP_SocialLinks_Email_ShareModalPopup="Share Modal Popup in Email social link#xpath=//div[contains(@id,'email-share-modal')]";
	public static final String lnk_PDP_SocialLinks_Email_ShareModalPopup_Close="Shared Modal Popup in Email social link#xpath=//div[contains(@id,'email-share-modal')]//a[contains(@class,'close')]";

	public static final String lnk_save_lookmsg_close="Save Look Message Close link#xpath=//div[@id='InterestItemSuccess']/a";
	public static final String lnk_SaveItem_SuccessMessage_close="Save Item Success Message Close link#xpath=//div[contains(@id,'InterestItemSuccess')]//a[contains(@class,'close')]";
	public static final String drp_size_dropdown="product size dropdown#xpath=//a[contains(@class,'size-select-mask'])";
	public static final String drp_size_dropdown2="product size dropdown#xpath=//div[contains(@class,'size-select-mask']";
	public static final String btn_add_to_cart="add to cart button#xpath=//a[contains(@id,'add-to-cart')]";//a[text()='Add to Cart']
	public static final String btn_add_to_cart2="add to cart button#xpath=//a[contains(@id,'add-to-cart')]";//a[text()='Add to Cart']
	public static final String drp_size_item="select the size button#xpath=//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']";
	public static final String btn_add_to_shoppingbag="add to shopping bag button#xpath=//div[contains(@class,'rw')]//div[@class='add-to-cart-wrap']//a[contains(@class,'add-to-cart')]";
	public static final String chk_tailorAndHam_checkbox="Tailor and ham check box#xpath=//input[contains(@class,'tailor-chk')]";
	public static final String btn_save_item="Save item button#xpath=//a[text()='Save this look']";//a[contains(@id,'save-item')]";
	public static final String lnk_save_this_look="Save This Look Link#xpath=//a[contains(text(),'Save this look')]";
	public static final String drp_finishDropdown="finish dropdown#xpath=//select[contains(@id,'finishDrop')]";
	public static final String drp_inseamDropDown="inseam dropdown#xpath=//select[contains(@id,'inseamDrop')]";
	//	public static final String btn_mini_cart="mini cart button#xpath=//a[contains(@id,'mini-cart-tab') or contains(@class,'mini-cart-tab')]";
	public static final String close_saved="closed the saved message#xpath=//div[@id='InterestItemSuccess']//a[.='Close']";
	public static final String inseam_popup="popup message #xpath=//a[contains(text(),'Click for a Video Tutorial')]";
	public static final String inseam_popup_close="close pop message #xpath=//div[contains(@class,'mw-modal modal-text-dialog')]//div[contains(@class,'close')]";
	public static final String drp_size_dropdown1="product select size after dropdown #xpath=//*[contains(@id,'selectSizes')]/p";
	public static final String txt_ProductNameInProductDescriptionPage="Product Name In Product Description Page#xpath=//section[contains(@id,'prod-info')]//h1[contains(@class,'prod-title')]";
	public final static String lnk_TwitterInPDP = "Twitter Link in PDP#xpath=//a[contains(@name,'ropis')]//following-sibling::div//a[contains(text(),'Twitter')]";
	public final static String lnk_FacebookInPDP = "Facebook Link in PDP#xpath=//a[contains(@name,'ropis')]//following-sibling::div//a[contains(text(),'Facebook')]";
	public final static String lnk_PinterestInPDP = "Pinterest Link in PDP#xpath=//a[contains(@name,'ropis')]//following-sibling::div//a[contains(text(),'Pinterest')]";
	public final static String lnk_GooglePlusInPDP = "Google Plus Link in PDP#xpath=//a[contains(@name,'ropis')]//following-sibling::div//a[contains(text(),'Google+')]";
	public final static String lnk_EmailInPDP = "Email Link in PDP#xpath=//a[contains(@name,'ropis')]//following-sibling::div[contains(@class,'social')]//a[contains(text(),'Email')]";
	public static final String btn_add_to_cart_AfterColorSwatch="add to cart button#xpath=//div[contains(@id,'contentOverlayBox')]//a[contains(text(),'Add to Cart')]";


	public static final String chk_TailorAndHem="Tailor & Hem Checkbox#xpath=//input[@id='tailoring-checkbox']";
	public static final String opt_ChooseFinish_Plain="Finish Option Plain#xpath=//span[contains(text(),'Plain')]";
	public static final String opt_ChooseFinish_Cuff="Finish Option Cuff#xpath=//span[contains(text(),'Cuff')]";
	public static final String drp_InseamDropdown="Inseam dropdown#xpath=//select[contains(@id,'inseamDrop')]";
	public static final String lbl_TailorAndHem_amount="Tailor & Hem Amount#xpath=//div[contains(@class,'tailor-hem')]//span[contains(@class,'alteration-price')]";

	public static final String btn_PDP_AddToShoppingBag_new="PDP Add to Shopping Bag Button#xpath=//section[contains(@id,'prod-info')]//a[contains(@id,'add-to-cart')]";
	public static final String lnk_HomePageLogo = "Home Page Logo#xpath=//section[contains(@class,'logo-bar')]/a";


	public final static String lnk_PinterestInPDP_New = "Pinterest Link in PDP#xpath=//div[contains(@id,'social-buttons')]//a[contains(@title,'Pinterest')]";
	public final static String lnk_FacebookInPDP_New = "Facebook Link in PDP#xpath=//div[contains(@id,'social-buttons')]//a[contains(@title,'Facebook')]";
	public final static String lnk_TwitterInPDP_New = "Twitter Link in PDP#xpath=//div[contains(@id,'social-buttons')]//a[contains(@title,'Twitter')]";
	public final static String lnk_GooglePlusInPDP_New = "Google Plus Link in PDP#xpath=//div[contains(@id,'social-buttons')]//a[contains(@title,'Google+')]";
	public final static String lnk_EmailInPDP_New = "Email Link in PDP#xpath=//div[contains(@id,'social-buttons')]//a[contains(@title,'Email')]";

	public final static String lbl_ProductPrice = "Product Price #xpath=//section[contains(@id,'prod-info')]//div[contains(@class,'pdp-price-section')]//div[contains(@class,'reg-price')]//p";

	public static final String txt_ropisStoreAvailable = "Ropis Store Available#xpath=//div[contains(@class, 'js-store-available')]//span[contains(text(), 'Available')]";
	public static final String btn_Reserve = "Reserve button#xpath=//div[contains(@class, 'js-store-available')]//button/span[contains(text(), 'Reserve')]";
	public static final String txt_ropisFirstName = "ROPIS Firstname#xpath=//input[@id='txtRopisFirstName']";
	public static final String txt_ropisLastName = "ROPIS Lastname#xpath=//input[@id='txtRopisLastName']";
	public static final String txt_ropisEmail = "ROPIS Email#xpath=//input[@id='txtRopisEmail']";
	public static final String txt_ropisPhone = "ROPIS Phone#xpath=//input[@id='txtRopisPhone']";
	public static final String btn_ropisReserve = "ROPIS Reserve button#xpath=//input[@id='btnRopisFormSubmit']";
	public static final String txt_ropisStoreUnavailable = "Ropis Store Unavailable#xpath=//div[contains(@class, 'js-store-available')]//span[contains(text(), 'Unavailable')]";
	public static final String btn_ropisChangeStore = "Ropis Change Store button#xpath=//div[contains(@class, 'ropis-change-store')]/a[contains(text(), 'Change')]"; 
	public static final String txt_changeStoreNumber = "Change store number text#xpath=//div[@id='selectChangeStoreModal']//input[@id='txtStoreLocatorModalInput']";
	public static final String btn_Search = "Search button#xpath=//a[contains(text(), 'Search')]";
	public static final String btn_changeStoreReserve = "Change store reserve button#xpath=//div[contains(@class, 'store-locator-modal-content')]//a[contains(text(), 'Reserve')]";
	public static final String lnk_SizeChart = "PDP Sizechart#xpath=//span[contains(text(),'Size chart')]";
	public static final String txt_SizeChartpopup = "PDP Sizechart pop-up #xpath=//div[contains(@class,'sizing-modal sizing')]//h3[contains(text(),'Size Charts')]";
	public static final String lnk_SizeChartpopupclose = "PDP Sizechart pop-up #xpath=//div[contains(@class,'sizing-modal sizing')]//a[contains(@class,'close')]";

	public String selectSizeFromProductDescriptionPage(String size){
		waitTime(2);

		//clickOn(drp_size_dropdown2); //div[contains(@class,'sizing-modal sizing')]//a[contains(@class,'close')]
		//clickOn(drp_size_dropdown);
		waitTime(2);
		List<WebElement> sizeOptions=driver.findElements(By.xpath("//a[contains(@id,'pdpSizesOption') and not(contains(@class,'store-only'))]"));
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
		return size;
	}

	public boolean verifySizeDropDownAvailable(){
		boolean flag=false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//a[@class='size-select-mask']")).isDisplayed()){
				flag= true;
			}
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return flag;
	}

	public void clickOnAfterSelectSize()
	{
		clickOn(drp_size_dropdown1);
	}

	public void clickOnAddToCartFromProductDescriptionPage(){
		clickOn(btn_add_to_cart);
		waitForLoadingAndDissappearMWLoadingImg();
		waitForCheckoutPopupToAppearAndDisappear();
	}

	public void clickTailorAndHamCheckbox(){
		clickOn(chk_tailorAndHam_checkbox);
	}


	public boolean clickOnTailorAndHamCheckboxIfAvailable(){
		boolean falg=false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//input[contains(@class,'tailor-chk')]")).isDisplayed()){
				clickTailorAndHamCheckbox();
				falg=true;
			}
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return falg;
	}




	public void verifyCorrespondingPDPisDisplayedWithSubCategoryBreadCrumbinPDPisdisplayed(String DepartmentBreadCrumbname, String SubCategoryBreadCrumbname){
		try {
			/*testStepPassed("DepartmentBreadCrumbname : "+DepartmentBreadCrumbname);
			testStepPassed("SubCategoryBreadCrumbname : "+SubCategoryBreadCrumbname);*/

			if (driver.findElement(By.xpath("//section[contains(@id,'prod-info')]//div[contains(@class,'breadcrumb')]//span[contains(@class,'breadcrumb-item')][3]//a")).isDisplayed()) {
				testStepPassed("SubCategory Bread Crumb in PDP is displayed");
				String SubCategoryBreadCrumbinPDP = driver.findElement(By.xpath("//section[contains(@id,'prod-info')]//div[contains(@class,'breadcrumb')]//span[contains(@class,'breadcrumb-item')][3]//a")).getText();

				//testStepPassed("SubCategoryBreadCrumbinPGP : "+SubCategoryBreadCrumbinPGP);
				//int SubCategoryBreadCrumbinPGPLength = SubCategoryBreadCrumbinPGP.length();

				//String EditedSubCategoryBreadCrumbinPGP = SubCategoryBreadCrumbinPGP.substring(SubCategoryBreadCrumbinPGP.indexOf("RE:")+4, SubCategoryBreadCrumbinPGPLength);
				//String EditedSubCategoryBreadCrumbinPGP = SubCategoryBreadCrumbinPGP.replace("YOU ARE CURRENTLY HERE: ", "");
				//testStepPassed(EditedSubCategoryBreadCrumbinPGP);

				if (SubCategoryBreadCrumbinPDP.contains(SubCategoryBreadCrumbname)) {
					//testStepPassed("SubCategory Bread Crumb Name is same as SubCategory Name");
					testStepPassed("It Navigated to the Corresponding PDP. SubCategory Bread Crumb Name & SubCategory Name is same");
				}
			}
		} catch (Exception e) {
			testStepFailed("SubCategory Bread Crumb in PDP is not displayed or SubCategory Name is not Same");
		}
	}

	String departmentBreadcrumbs;
	public final static String lnk_departmentBreadcrumb = "Department Breadcrump #xpath=//div[contains(@id,'widget_breadcrumb')]/span[2]/a";
	public String getDepartmentBreadCrumbinPDP() {

		String departmentBreadcrumb = null;
		try {

			if (driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]/span[2]/a")).isDisplayed()) {
				testStepPassed("Department Bread Crumb in PDP is displayed");
				departmentBreadcrumbs = driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]/span[2]/a[text()]")).getAttribute("innerText");
				departmentBreadcrumb=departmentBreadcrumbs.substring(8, 13);
				System.out.println("departmentBreadcrumb : "+departmentBreadcrumb);
				//String Dep1 = (Dep.substring(Dep.lastIndexOf("TO")+3)).toLowerCase();
				//departmentBreadcrumb = Dep1.substring(0,1).toUpperCase() + Dep1.substring(1).toLowerCase();

				clickOn(lnk_departmentBreadcrumb);
				waitTime(2);

				testStepPassed("Department Bread crumb : " + departmentBreadcrumb);
			}
			else {
				testStepFailed("Department Bread crumb is not displayed");
			}
		} catch(Exception e) {
			testStepFailed("Department Bread crumb is not displayed");
		}
		return departmentBreadcrumb; ////div[contains(@id,'widget_breadcrumb')]/h1
	}


	String subCategoryBreadcrumbs;
	public final static String lnk_subcategoryBreadcrumb = "Subcategory Breadcrump #xpath=//div[contains(@id,'widget_breadcrumb')]/span[3]/a";
	public String getSubCategoryBreadCrumbinPDP() {

		String subCategoryBreadcrumb = null;
		try {

			if (driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]/span[3]/a")).isDisplayed()) {
				testStepPassed("SubCategory Bread Crumb in PDP is displayed");
				subCategoryBreadcrumbs = driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]/span[3]/a[text()]")).getAttribute("innerText");
				subCategoryBreadcrumb=subCategoryBreadcrumbs.substring(8, 19);
				System.out.println(subCategoryBreadcrumb);
				//'String Dep1 = (Dep.substring(Dep.lastIndexOf("TO")+3)).toLowerCase();
				//subCategoryBreadcrumb = Dep1.substring(0,1).toUpperCase() + Dep1.substring(1).toLowerCase();

				clickOn(lnk_subcategoryBreadcrumb);
				waitTime(2);

				testStepPassed("SubCategory Bread crumb in PDP : " + subCategoryBreadcrumb);
			}
			else {
				testStepFailed("SubCategory Bread crumb is not displayed");
			}
		} catch(Exception e) {
			testStepFailed("SubCategory Bread crumb is not displayed");
		}
		return subCategoryBreadcrumb;
	}




	public void clickOnSaveItemFromProductDescriptionPage(){
		try {
			if (driver.findElement(By.xpath("//a[text()='Save this look']")).isDisplayed()) {
				clickOn(btn_save_item);
			}
		} catch (Exception e) {
			testStepFailed("Save this look link is not displayed");
		}

	}

	public String selectFinishFromProductDescriptionPage(String finish){
		if(!finish.isEmpty()){
			selectFromDropdown(drp_finishDropdown, finish);
		}else{
			List<WebElement> options=driver.findElements(By.xpath("//select[contains(@id,'finishDrop')]/option"));
			finish=options.get(1).getText();
			selectFromDropdown(drp_finishDropdown, finish);
		}
		return finish;
	}

	public String selectInseamFromProductDescriptionPage(String inseam){
		if(!inseam.isEmpty()){
			waitTime(3);
			selectFromDropdown(drp_inseamDropDown,inseam);
		}else{
			waitTime(5);
			List<WebElement> options=driver.findElements(By.xpath("//select[contains(@id,'inseamDrop')]/option"));

			inseam=options.get(2).getText().trim();
			waitTime(5);
			//selectFromDropdown(drp_inseamDropDown,inseam);
			new Select(driver.findElement(By.xpath("//select[contains(@id,'inseamDrop')]"))).selectByIndex(2);
			testStepPassed("Select "+inseam+" from inseam drop down");
			waitTime(2);
			selectFromDropdown(drp_inseamDropDown,inseam);
		}
		waitTime(5);
		return inseam;
	}
	public void clickOnInsemPopUp()
	{
		try{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[contains(text(),'Click for a Video Tutorial')]")).click();
			//clickOn(inseam_popup);
			waitTime(5);
			driver.findElement(By.xpath("//div[contains(@class,'mw-modal modal-text-dialog')]//div[contains(@class,'close')]")).click();
			//clickOn(inseam_popup_close);
		}catch(Exception e){

		}
		finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
	}

	public boolean verifyProductDescriptionPage(){

		boolean flag=false;
		try{
			if(driver.findElement(By.xpath("//section[contains(@id,'prod-info')]")).isDisplayed())
			{
				testStepPassed("Product Description Page is displayed");
				flag= true;
			}
		}catch(Exception e){
			testStepFailed("Product Description Page is not displayed");
		}
		return flag;
	}


	public void verifyAndCloseSavedMessageInPDP()
	{
		/*waitForElement(close_saved);
		clickOn(close_saved);*/
		try{
			waitTime(2);
			/*WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='InterestItemSuccess']//a[.='Close']")));*/
			if(driver.findElement(By.xpath("//div[@id='InterestItemSuccess']//a[.='Close']")).isDisplayed()){
				clickOn(close_saved);
			}
		}catch(Exception e){

		}
	}

	public void verifythecolorswatch()
	{

		try{
			if(driver.findElement(By.xpath("//div[contains(@class,'colorways clearfix js-colorways')]")).isDisplayed())
			{
				List<WebElement> Productcolours = driver.findElements(By.xpath("//div[@class='color-swatch']//a[contains(@class,'js-swatch-item')]"));
				int colours =Productcolours.size();
				for(int i=1; i<=colours; i++){

					driver.findElement(By.xpath("(//div[@class='color-swatch']//a[contains(@class,'js-swatch-item')])["+i+"]")).click();
					String colourswatchname=driver.findElement(By.xpath("(//div[@class='color-swatch']//a[contains(@class,'js-swatch-item')])["+i+"]")).getAttribute("title");
					//System.out.println("colour name :" +colourswatchname);
					String productcolourname=driver.findElement(By.xpath("//img[contains(@class,'js-image-zoom')]")).getAttribute("src");
					//System.out.println("colour in product :" +productcolourname);
					if(productcolourname.contains(colourswatchname))
					{
						testStepPassed("PDP Clickable Swatch:" +colourswatchname+ "PDP Main Image :" +productcolourname);
					}
					else
					{
						testStepFailed("PDP Clickable Swatch:" +colourswatchname+ "PDP Main Image :" +productcolourname);
					}

				}
			}
			else
			{
				testStepFailed("colorswatch is not present");
			}
		}
		catch(Exception e)
		{
			testStepFailed("colorswatch is not displayed");
		}
	}


	public void verifySavedMessageInPDP()
	{
		try
		{   
			//waitTime(2);
			waitForElement(close_saved);
			verifyElement(close_saved);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

	public void verifySizechartpopupPDP()
	{
		try
		{   
			//waitTime(2); //span[contains(text(),'Size chart')] lnk_SizeChart 
			if(driver.findElement(By.xpath("//span[contains(text(),'Size chart')]")).isDisplayed()){
				clickOn(lnk_SizeChart);
				verifyElement(txt_SizeChartpopup);
				clickOn(lnk_SizeChartpopupclose);
			}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	public void ele_SaveItemConfirmationPopup_Close()
	{
		try
		{  
			waitTime(3);
			waitForElement(close_saved);
			clickOn(close_saved);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}


	public void VerifyItemSavedMessageDisplayedandClosed()
	{
		try
		{  
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@id,'InterestItemSuccess')]//div[contains(@id,'InterestItemSuccess_message')]")).isDisplayed()) {
				testStepPassed("Item Saved Message is displayed");
				clickOn(lnk_SaveItem_SuccessMessage_close);
			}
		}
		catch(Exception e)
		{
			testStepFailed("Save Item Success Message is not displayed");
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


	public boolean verifyProductDisplayedinPDP(){
		boolean flag = false; //
		try {
			if (driver.findElement(By.xpath("(//section[contains(@id,'pdp')]//*[contains(@id,'prod-info')] | //div[contains(@class,'js-bundle pdp-container')])")).isDisplayed()) {
				flag =true;
			}
		} catch (Exception e) {

		}
		return flag;
	}


	public boolean verifyProductDisplayedinPreStyleLookPDP(){
		boolean flag = false;
		try {
			if (driver.findElement(By.xpath("//form[contains(@id,'BundleItemAddForm')]//div[contains(@class,'pdp-container')]")).isDisplayed()) {
				flag =true;
			}
		} catch (Exception e) {

		}
		return flag;
	}





	public void verifyProductDisplayedinPDPPageIfNotRefreshThePage(){
		try {
			//waitTime(2);
			if (driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]")).isDisplayed()) {
				testStepPassed("PDP page is loaded fully");
			}
		} catch (Exception e) {

			driver.navigate().refresh();
			waitTime(2);
			if (driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]")).isDisplayed()) {
				testStepPassed("PDP page is loaded fully");
			}
			else {
				testStepFailed("PDP page is not loaded");
			}
		}
	}


	public void verifyProductDisplayedinPDPPageIfNotRefreshThePageDifferentCloneId(){
		try {
			//waitTime(1);
			if (driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]")).isDisplayed()) {
				testStepPassed("PDP page is loaded fully");
			}
		} catch (Exception e) {

			driver.navigate().refresh();
			//waitTime(1);
			if (driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]")).isDisplayed()) {
				testStepPassed("PDP page is loaded fully");
			}
			else {
				testStepFailed("PDP page is not loaded");
			}
		}
	}


	public void verifyProductDisplayedinPDPBundlePageIfNotRefreshThePage(){
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@class,'js-bundle pdp-container')]")).isDisplayed()) {
				testStepPassed("PDP page is loaded fully");
			}
		} catch (Exception e) {

			driver.navigate().refresh();
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@class,'js-bundle pdp-container')]")).isDisplayed()) {
				testStepPassed("PDP page is loaded fully");
			}
			else {
				testStepFailed("PDP page is not loaded");
			}
		}
	}


	public boolean scrollUpInProductDescriptionPage(){
		boolean flag = false;
		try{
			driver.findElement(By.xpath("//section[contains(@class,'prod-info')]//ul[contains(@class,'share-list')]//li[contains(text(),'Share')]")).sendKeys(Keys.PAGE_UP);      
			//testStepPassed("Performed Scroll Down In Product Grid Page");
			flag=true;
		}catch(Exception e){

		}
		return flag;
	}

	public String getProductNameInProductDescriptionPage(){
		String productNameInProductDescriptionPage = getText(txt_ProductNameInProductDescriptionPage);
		return productNameInProductDescriptionPage;
	}

	public String getProductOfferPriceFromProductDescriptionPage(){
		//return getText("product price#xpath=//*[@id='pdpPriceShow']//h3");
		//String FinalPrice = null;
		//System.out.println("PDP Price");
		String price = getText("product price#xpath=//section[contains(@id,'prod-info')]//div[contains(@class,'reg-price')]//p[contains(@class,'final-price')]");
		String finalprice = StringUtils.substringAfter(price, "CLEARANCE PRICE:");
		System.out.println("Final price : "+finalprice);
		return finalprice;
		//return getText("product price#xpath=//section[contains(@id,'prod-info')]//div[contains(@class,'reg-price')]//p[contains(@class,'final-price')]");
	}

	public void clickOnTwitterInPDP(){
		clickOn(lnk_TwitterInPDP);
	}

	public void clickOnFacebookInPDP(){
		clickOn(lnk_FacebookInPDP);
	}

	public void clickOnPinterestInPDP(){
		clickOn(lnk_PinterestInPDP);
	}

	public void clickOnGooglePlusInPDP(){
		clickOn(lnk_GooglePlusInPDP);
	}

	public void clickOnGmailInPDP(){
		if(isEmailServicePopupDisplayed()) clickOnGmailInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPDP);
			clickOnGmailInEmailServicePopup();
		}
	}

	public void clickOnYahooInPDP(){
		if(isEmailServicePopupDisplayed()) clickOnYahooInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPDP);
			clickOnYahooInEmailServicePopup();	
		}
	}

	public void clickOnAOLInPDP(){
		if(isEmailServicePopupDisplayed()) clickOnAOLInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPDP);
			clickOnAOLInEmailServicePopup();
		}
	}

	public void clickOnHotmailInPDP(){
		if(isEmailServicePopupDisplayed()) clickOnHotmailInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPDP);
			clickOnHotmailInEmailServicePopup();
		}
	}

	public String selectOtherColorInProductDescriptionPage(){

		String color="";
		List<WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'swatches')]/a"));
		if(options.size()>0){
			for(int i=0;i<options.size();i++){
				if(!options.get(i).getAttribute("class").toLowerCase().contains("current")){
					color=options.get(i).getAttribute("title");
					options.get(i).click();
					testStepPassed("click on"+color+" color swatch");
				}
			}
		}

		return color;
	}

	public String getProductNameAfterColorSwatchInProductDescriptionPage(){
		String productNameInProductDescriptionPage = driver.findElement(By.xpath("//div[contains(@class,'prod-title') and contains(@id,'titleOverride')]")).getText().trim();
		return productNameInProductDescriptionPage;
	}

	public void clickOnAddToCartAfterColorSwatchIFromProductDescriptionPage(){
		clickOn(btn_add_to_cart_AfterColorSwatch); 
		waitForLoadingAndDissappearMWLoadingImg();
		waitForCheckoutPopupToAppearAndDisappear();
	}


	public void clickOnAddToShoppingBagFromProductDescriptionPage(){
		//clickOn(drp_size_item);

		clickOn(btn_add_to_shoppingbag);
		//clickOn(btn_add_to_shoppingbag);
		waitForLoadingAndDissappearMWLoadingImg();
		waitForCheckoutPopupToAppearAndDisappear();
	}


	public void verifyviewscountinQV(){

		try{
			if(driver.findElement(By.xpath("//div[contains(@class,'js-product-views product-views')]")).isDisplayed()){
				//if(elementPresent("xpath for viewscount=//div[contains(@class,'js-product-views product-views')]")){

				String peoplesviewscountinqv =driver.findElement(By.xpath("//div[contains(@class,'js-product-views product-views')]")).getText();
				/*String viewscountinqv=peoplesviewscountinqv.substring(0);
				int countinqv =Integer.parseInt(viewscountinqv);
				testStepPassed("count in QV:" +countinqv);
				if(countinqv > 50.00){
					testStepPassed("count is greater than 50:" +countinqv);
				}
				else
				{
					testStepFailed("count is lesser than 50:" +countinqv);
				}*/

				String Final[]=peoplesviewscountinqv.split(" VIEWS");
				String a= Final[0];
				System.out.println(Final[0]);
				int countinqv=Integer.parseInt(a);
				if(countinqv > 50){
					testStepPassed("count is greater than 50:" +countinqv);
				}
				else
				{
					testStepInfo("count is lesser than 50:" +countinqv);
				}




			}
			else{testStepInfo("views count is not displayed in QV");
			}
		}catch(Exception e){

		}

	}

	public void verifyviewscountinPDP(){

		try{
			if(driver.findElement(By.xpath("//div[contains(@class,'js-product-views product-views')]")).isDisplayed()){
				//if(elementPresent("xpath for viewscount=//div[contains(@class,'js-product-views product-views')]")){

				String peoplesviewscountinqv =driver.findElement(By.xpath("//div[contains(@class,'js-product-views product-views')]")).getText();
				/*String viewscountinqv=peoplesviewscountinqv.substring(0);
			int countinqv =Integer.parseInt(viewscountinqv);
			testStepPassed("count in QV:" +countinqv);
			if(countinqv > 50.00){
				testStepPassed("count is greater than 50:" +countinqv);
			}
			else
			{
				testStepFailed("count is lesser than 50:" +countinqv);
			}*/

				String Final[]=peoplesviewscountinqv.split(" VIEWS");
				String a= Final[0];
				System.out.println(Final[0]);
				int countinqv=Integer.parseInt(a);
				if(countinqv > 50){
					testStepPassed("count is greater than 50:" +countinqv);
				}
				else
				{
					testStepInfo("count is lesser than 50:" +countinqv);
				}




			}
			else{testStepInfo("views count is not displayed in QV");
			}
		}catch(Exception e){

		}

	}
	public String getJSESSIONIDAFTERADDINGPRODUCT(){

		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);

		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		testStepPassed("JSESSION ID AFTER ADDING PRODUCT: "+JSessionID);

		return JSessionID;
	}

	public void clickOnAddToShoppingBagFromProductDescriptionPagenew(){
		//clickOn(drp_size_item);
		if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[@class='add-to-cart-wrap']//a[contains(@class,'add-to-cart')]")).isDisplayed())
		{
			testStepPassed("The PDP page is loaded fully");
			clickOn(btn_add_to_shoppingbag);
		} else {
			testStepPassed("The PDP page is not loaded fully");
			driver.navigate().refresh();
			testStepPassed("Page refreshed");
			clickOn(btn_add_to_shoppingbag);
		}
		//clickOn(btn_add_to_shoppingbag);
		waitForLoadingAndDissappearMWLoadingImg();
		waitForCheckoutPopupToAppearAndDisappear();
	}
	public static final String suggestedSearchesProductLink = "Suggested Searches First Product link#xpath=(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a)[1]";
	public String selectSizeFromProductDescriptionPagenew(String size)
	{

		//clickOn(suggestedSearchesProductLink);
		try {
			//waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']")).isDisplayed()) 
			{
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
						waitTime(2);
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



	public static final String lnk_QVPopupClose = "QuickViewPopupClose Link#xpath=//div[contains(@id,'quickInfoPopup')]//a[contains(@id,'WC_QuickInfo_Link_close')]";


	public String selectSizeFromQuickViewPagenew(String size){

		try {
			waitTime(2);

			mouseOver(lnk_QVPopupClose);

			if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']")).isDisplayed()) 
			{
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














	public String selectSizeFromProductDescriptionPageforDifferentCloneid(String size){

		try {
			//waitTime(1);
			if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']")).isDisplayed()) {
				clickOn(drp_size_item);
				//waitTime(1);
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




	public void clickOnSaveItemFromProductDescriptionPageVerifyandClosemesg(){
		waitTime(1);
		clickOn(lnk_save_this_look);
		waitTime(1);
		String savethislook = driver.findElement(By.xpath("//div[contains(@class,'save-look')]/a[contains(@class,'save-link js-save-item')]")).getText();
		if (savethislook.equalsIgnoreCase("Look Saved")) {
			testStepPassed("Look Saved");
			//System.out.println("The Item is Saved Successfully");
			//clickOn(lnk_save_lookmsg_close);
		} else {
			testStepPassed("The Item is Saved Successfully");
			//System.out.println("The Item is not Saved");
		}
	}
	public void verifyProductDescriptionPagenew(){
		waitTime(2);
		if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[@class='add-to-cart-wrap']//a[contains(@class,'add-to-cart')]")).isDisplayed()) {
			testStepPassed("The PDP page is displayed");
		} else {
			testStepFailed("The PDP page is not displayed");
		}
	}

	public boolean isProductDescriptionPageDisplayed(){
		boolean flag=false;
		try{
			if(driver.findElement(By.xpath("//div[contains(@class,'pdp-main-section')]")).isDisplayed()){
				flag= true;
			}
		}catch(Exception e){
		}
		return flag;
	}

	public boolean isTailorAndHemCheckboxDisplayed(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//div[contains(@class,'tailor-hem')]")).isDisplayed())
				flag=true;
		}catch(Exception e){}
		return flag;
	}

	public boolean isTailorAndHemCheckboxSelected(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//input[contains(@id,'tailoring-checkbox')]")).isSelected())
				flag=true;
		}catch(Exception e){}
		return flag;
	}


	public void chooseFinishOption(String finishOption){
		switch (finishOption.toLowerCase()) {
		case "cuff":
			clickOnSpecialElement(opt_ChooseFinish_Cuff);	
			break;
		case "plain":
			clickOnSpecialElement(opt_ChooseFinish_Plain);
			break;	
		default:
			testStepFailed("Provide input Cuff/Plain for Finish options");	
		}
	}

	public void selectTailorAndHemCheckbox(){
		try{
			clickOnSpecialElement(chk_TailorAndHem);
		}catch(Exception e){

		}
	}


	public String getProductPrice(){
		return getText(lbl_ProductPrice);
	}

	public boolean isChooseFinishOptionsDisplayed(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//span[contains(text(),'Cuff')]")).isDisplayed() && driver.findElement(By.xpath("//span[contains(text(),'Plain')]")).isDisplayed())
				flag=true;
		}catch(Exception e){

		}
		return flag;		
	}

	public boolean isInseamDropdownDisplayed(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//select[contains(@id,'choose-inseam')]")).isDisplayed())
				flag=true;
		}catch(Exception e){}
		return flag;
	}

	public String selectInseam(String inseam){
		if(!inseam.isEmpty()){
			waitTime(3);
			selectFromDropdown(drp_InseamDropdown,inseam);
		}else{
			try{
				waitTime(3);
				List<WebElement> options=driver.findElements(By.xpath("//select[contains(@id,'choose-inseam')]/option"));
				inseam=options.get(2).getText().trim();
				waitTime(3);
				new Select(driver.findElement(By.xpath("//select[contains(@id,'choose-inseam')]"))).selectByIndex(2);
				testStepPassed("Select "+inseam+" from Inseam Dropdown");
			}catch(Exception e){

			}
		}
		waitTime(5);
		return inseam;
	}

	public double getTailorAndHemPriceInProductDescriptionPage(){
		Number tailorAndHemValue = null;
		NumberFormat format = NumberFormat.getCurrencyInstance();
		try{
			//tailorAndHemValue = format.parse(driver.findElement(By.xpath("//label[contains(text(),'Tailor & Hem')]//parent::div/span[contains(@class,'alteration-price')]")).getText().trim());
			tailorAndHemValue = format.parse(driver.findElement(By.xpath("//label[contains(text(),'Add Hem')]//parent::div/span[contains(@class,'alteration-price')]")).getText().trim());
		}catch (Exception e) {
			testStepFailed("Tailor&Hem Price In Product Description Page is not displayed");
		}
		return Double.valueOf(tailorAndHemValue.toString());	
	}

	public double getProductPriceInProductDescriptionPage(){
		NumberFormat format = NumberFormat.getCurrencyInstance();
		Number productPrice = null;
		String currency;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
			if(driver.findElement(By.xpath("//*[contains(@id,'regPromoPrice')]")).isDisplayed()){
				currency = driver.findElement(By.xpath("//*[contains(@id,'regPromoPrice')]")).getText().trim();
				productPrice = format.parse(currency);
			}
		}catch(Exception e){
			try{
				String price = driver.findElement(By.xpath("//div[contains(@class,'reg-price')]//h3")).getText().trim();
				String[] currency1 = price.split(":");
				productPrice = format.parse(currency1[currency1.length-1].trim());
			}catch(Exception e1){
				try{
					String price =	driver.findElement(By.xpath("//div[contains(@id,'price_display')]//h3")).getText().trim();
					productPrice = format.parse(price);
				}catch(Exception e2){			
					testStepFailed("Product price is not displayed in Product Description Page");
				}
			}
		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return Double.valueOf(productPrice.toString());
	}
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

	public static final String suggestedSearchesProductLin = "Suggested Searches First Product link#xpath=(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a)[1]";
	public void suggestedSearchesProductLink(){
		try{
			//public static final String suggestedSearchesProductLink = "Suggested Searches First Product link#xpath=(//div[@id='search_bar']//div[contains(@class,'tt-dropdown-custom')]/div[contains(@class, 'tt-suggestions tt-suggestions-custom')]//div[contains(@class, 'tt-suggestions-list')]/a)[1]";
			clickOn(suggestedSearchesProductLin);

		}catch(Exception e){
			testStepFailed("Add to Shopping Button is not found");
		}
	}

	public static final String drp_ProductQuantity_PDP="Product Quantity Dropdown in PDP#xpath=//section[contains(@id,'prod-info')]//div[contains(@class,'pdp-qty')]//input[contains(@id,'quantity')]";


	public void enterProductCountinPDP(String ProductQuantity){
		try
		{

			//waitTime(2);
			if (driver.findElement(By.xpath("//section[contains(@id,'prod-info')]//div[contains(@class,'pdp-qty')]//input[contains(@id,'quantity')]")).isDisplayed()) {
				typeIn(drp_ProductQuantity_PDP, ProductQuantity);
			} else {
				testStepFailed("Add to Shopping Button is not found");
			}

		}
		catch(Exception e){
			testStepFailed("Product Quantity combobox is not found");
		}
	}





	public void clickPDPAddtoShoppingBagButtonDifferentCloneId(){
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

	public void clickHomePageLogoinPDPPage(){
		try{
			waitTime(2);
			if (driver.findElement(By.xpath("//section[contains(@class,'logo-bar')]/a")).isDisplayed()) {
				clickOn(lnk_HomePageLogo);
			} else {
				testStepPassed("Application Logo Link is not found");
			}

		}catch(Exception e){
			testStepPassed("Application Logo Link is not found");
		}
	}
	public boolean isProductDescriptionDisplayed(){
		boolean flag=false;
		try{
			if(driver.findElement(By.xpath("//div[contains(@class,'pdp-main-section')]")).isDisplayed()){
				flag= true;
			}
		}catch(Exception e){
		}
		return flag;
	}
	public boolean verifySizeDropDownAvailable_New(){
		boolean flag=false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//*[contains(@id,'ada-qv-curr-size')]")).isDisplayed()){
				flag= true;
			}
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return flag;
	}
	public String selectSizeFromProductDescriptionPagenew1(String size){
		try {
			if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']")).isDisplayed()) {
				clickOn(drp_size_item);
				waitTime(2);
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
	public boolean isProductAvailableInStock(){
		boolean flag = true;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//*[contains(@id,'actions')]//*[contains(text(),'Out of stock')]")).isDisplayed())
				flag=false;
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return flag;		
	}
	public boolean isTailorAndHemCheckboxDisplayed_new(){
		boolean flag = false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//input[contains(@id,'tailoring-checkbox')]")).isDisplayed())
				flag=true;
		}catch(Exception e){}
		finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return flag;
	}
	public boolean isChooseFinishOptionsDisplayednew(){
		boolean flag = false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//span[contains(text(),'Cuff')]")).isDisplayed() && driver.findElement(By.xpath("//span[contains(text(),'Plain')]")).isDisplayed())
				flag=true;
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return flag;		
	}
	public void clickOnAddToCartFromProductDescriptionPagenew(){
		clickOn(btn_add_to_cart);
		waitForLoadingAndDissappearMWLoadingImg_New();
		waitForCheckoutPopupToAppearAndDisappear_New();
	}
	public void waitForCheckoutPopupToAppearAndDisappear_New(){
		try{
			WebDriverWait wait=new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'bag-items')]")));
			WebDriverWait wait2=new WebDriverWait(driver,3);
			wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'bag-items')]")));
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
	}
	public void clickOnPinterestInPDP_New(){
		clickOn(lnk_PinterestInPDP_New);
	}
	public void clickOnFacebookInPDP_New(){
		clickOn(lnk_FacebookInPDP_New);
	}
	public void clickOnTwitterInPDP_New(){
		clickOn(lnk_TwitterInPDP_New);
	}
	public void clickOnGooglePlusInPDP_New(){
		clickOn(lnk_GooglePlusInPDP_New);
	}

	public void clickOnGmailInPDP_New(){
		if(isEmailServicePopupDisplayed()) clickOnGmailInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPDP_New);
			clickOnGmailInEmailServicePopup();
		}
	}

	public void clickOnYahooInPDP_New(){
		if(isEmailServicePopupDisplayed()) clickOnYahooInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPDP_New);
			clickOnYahooInEmailServicePopup();	
		}
	}

	public void clickOnAOLInPDP_New(){
		if(isEmailServicePopupDisplayed()) clickOnAOLInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPDP_New);
			clickOnAOLInEmailServicePopup();
		}
	}

	public void clickOnHotmailInPDP_New(){
		if(isEmailServicePopupDisplayed()) clickOnHotmailInEmailServicePopup();
		else{
			clickOn(lnk_EmailInPDP_New);
			clickOnHotmailInEmailServicePopup();
		}
	}


	public void verifyTailorHemDisplayed2(){
		try {
			if (driver.findElement(By.xpath("//input[@id='tailoring-checkbox']")).isDisplayed()) {
				clickOn(chk_TailorAndHem);
			}
		} catch (Exception e) {
			testStepFailed("Tailoring Checkbox is not found");		
		}
	}

	public boolean verifyTailorHemDisplayed(){
		boolean flag=false;
		try{
			waitTime(1);
			if(driver.findElement(By.xpath("//input[@id='tailoring-checkbox']")).isDisplayed()){
				flag= true;
			}
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
		return flag;
	}


	public String getProductNameFromProductDescriptionPage(String Productname){
		try {
			//String Productprice=null;
			if (driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]//h1")).isDisplayed()) {
				Productname = driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]//h1")).getText();
			}
		} catch (Exception e) {
			testStepFailed("Product name is not displayed in PDP");
		}
		return Productname;
	}






	public String getProductPriceFromProductDescriptionPage(String Productprice){
		try {
			if (driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]//div[contains(@id,'pdpPrice')]//div[contains(@class,'reg-price')]//p[contains(@class,'final-price')]")).isDisplayed()) {
				Productprice = driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]//div[contains(@id,'pdpPrice')]//div[contains(@class,'reg-price')]//p[contains(@class,'final-price')]")).getText();
				System.out.println("Productprice in PDP : "+Productprice);
				/*Productprice = StringUtils.substringAfter(Productprice, "CLEARANCE PRICE:");
				System.out.println("Final price : "+Productprice);*/
				Productprice = StringUtils.substringAfter(Productprice, "$");
			}
		} catch (Exception e) {
			testStepFailed("Product price is not displayed for product in PDP");
		}
		return Productprice;
	}



	public void scrollToSocialLinksinPDP(){
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(@id,'social-buttons')]//ul[contains(@class,'share-list')]//li"))).build().perform();
	}


	public void scrollToSocialLinksinPDPSafari(){
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'social-buttons')]//ul[contains(@class,'share-list')]//li"));
		driver.executeScript("arguments[0].scrollIntoView()", element);
	}








	public void clickPinterestSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Pinterest);
	}

	public void clickFacebookSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Facebook);
	}

	public void clickTwitterSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Twitter);
	}

	public void clickGooglePlusSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_GooglePlus);
	}

	public void clickEmailSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Email);
	}

	public void clickGmailinEmailSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Email_Gmail);
	}

	public void clickYahooinEmailSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Email_Yahoo);
	}

	public void clickAOLinEmailSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Email_AOL );
	}

	public void clickHotmailinEmailSocialLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Email_Hotmail);
	}


	public void clickEmailSharemodalCloseLinkinPDP(){
		clickOn(lnk_PDP_SocialLinks_Email_ShareModalPopup_Close);
	}


	public void verifyPinterestPage()
	{
		waitTime(1);
		if(switchToSpecificWindow("Pinterest")){		
			try{
				if(driver.getCurrentUrl().contains("pinterest")) {
					testStepPassed("Verifed user navigated to Pinterest page");
				}
				else 
				{
					testStepFailed("Pinterest link is not navigated to its corresponding page");
				}
			}
			catch(Exception e)
			{
				testStepFailed("Pinterest window is not displayed");
			}
			finally{
				driver.close();
			}
		}
	}	


	public void verifyFacebookPage()
	{
		waitTime(1);
		if(switchToSpecificWindow("Facebook")){		
			try{
				if(driver.getCurrentUrl().contains("facebook")) {
					testStepPassed("Verifed user navigated to Facebook page");
				}
				else 
				{
					testStepFailed("Facebook link is not navigated to its corresponding page");
				}
			}
			catch(Exception e)
			{
				testStepFailed("Facebook window is not displayed");
			}
			finally{
				driver.close();
			}
		}
	}	




	public void verifyTwitterPage()
	{
		waitTime(1);
		if(switchToSpecificWindow("Post a Tweet on Twitter")){		
			try{
				if(driver.getCurrentUrl().contains("twitter")) {
					testStepPassed("Verifed user navigated to Twitter page");
				}
				else 
				{
					testStepFailed("Twitter link is not navigated to its corresponding page");
				}
			}
			catch(Exception e)
			{
				testStepFailed("Twitter window is not displayed");
			}
			finally{
				driver.close();
			}
		}
	}





	public void verifyGooglePlusPage()
	{
		waitTime(1);
		if(switchToSpecificWindow("Google+")){		
			try{
				if(driver.getCurrentUrl().contains("google")) {
					testStepPassed("Verifed user navigated to Google+ page");
				}
				else 
				{
					testStepFailed("Google+ link is not navigated to its corresponding page");
				}
			}
			catch(Exception e)
			{
				testStepFailed("Google+ window is not displayed");
			}
			finally{
				driver.close();
			}
		}
	}


	public void verifyGmailPage()
	{
		waitTime(1);
		if(switchToSpecificWindow("Gmail - Free Storage and Email from Google")){		
			try{
				if(driver.getCurrentUrl().contains("gmail")) {
					testStepPassed("Verifed user navigated to Gmail page");
				}
				else 
				{
					testStepFailed("Gmail Email link is not navigated to its corresponding page");
				}
			}
			catch(Exception e)
			{
				testStepFailed("Gmail Email from Gmail window is not displayed");
			}
			finally{
				driver.close();
			}
		}
	}



	public void verifyAOLPage()
	{
		waitTime(1);
		if(switchToSpecificWindow("AOL.com - Welcome to AOL")){		
			try{
				if(driver.getCurrentUrl().contains("aol")) {
					testStepPassed("Verifed user navigated to AOL page");
				}
				else 
				{
					testStepFailed("AOL link is not navigated to its corresponding page");
				}
			}
			catch(Exception e)
			{
				testStepFailed("AOL window is not displayed");
			}
			finally{
				driver.close();
			}
		}
	}



	public void verifyYahooPage()
	{
		waitTime(1);
		if(switchToSpecificWindow("Yahoo - login")){		
			try{
				if(driver.getCurrentUrl().contains("yahoo")) {
					testStepPassed("Verifed user navigated to Yahoo page");
				}
				else 
				{
					testStepFailed("Yahoo link is not navigated to its corresponding page");
				}
			}
			catch(Exception e)
			{
				testStepFailed("Yahoo window is not displayed");
			}
			finally{
				driver.close();
			}
		}
	}


	public void verifyHotmailPage()
	{
		waitTime(1);
		if(switchToSpecificWindow("Sign In")){		
			try{
				if(driver.getCurrentUrl().contains("live")) {
					testStepPassed("Verifed user navigated to Hotmail page");
				}
				else 
				{
					testStepFailed("Hotmail link is not navigated to its corresponding page");
				}
			}
			catch(Exception e)
			{
				testStepFailed("Hotmail window is not displayed");
			}
			finally{
				driver.close();
			}
		}
	}


	public boolean verifyEmailShareModalPopupisdisplayed(){

		boolean flag=false;
		try{
			if(driver.findElement(By.xpath("//div[contains(@id,'email-share-modal')]")).isDisplayed()){
				testStepPassed("Verified Email share popup modal is displayed");
				flag= true;
			}
		}catch(Exception e){
			testStepFailed("Email share modal popup is not displayed");
		}
		return flag;
	}

	public static final String lnk_QV_Close = "QV close Link#xpath=//a[@id='WC_QuickInfo_Link_close']";

	public void verifyCertonaisDisplayedandAddProductthroughQVandPDP(String Size){
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
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
			testStepFailed("Certona Widget is not displayed in Product Description Page");  
		}
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


	public final static String lbl_ProductPrice2 = "Product Price #xpath=";


	public void verifyShopTelligenceisDisplayedinPDPandTitle(){
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]")).isDisplayed()) {
				testStepPassed("ShopTelligence section is displayed in PDP");
				String ShopTelligenceTitle = driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]//h3")).getText();
				testStepPassed("ShopTelligence section title : "+ShopTelligenceTitle);
			}
		} catch (Exception e) {
			testStepFailed("ShopTelligence section is not displayed in PDP");
		}
	}



	public void verifyShopTelligenceOuterCarouselisDisplayedandCheckingBuutonsaredisplayed(){
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]")).isDisplayed()) {
				testStepPassed("Carousel is displayed in ShopTelligence section");

				testStepInfo("");
				List <WebElement> ShopTelligenceCarouselSection = driver.findElements(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li"));
				int ShopTelligenceCarouselSectionCount = ShopTelligenceCarouselSection.size();
				testStepPassed("ShopTelligence Carousel Blocks Count : "+ShopTelligenceCarouselSectionCount);
				testStepPassed("ShopTelligence Carousel Block Names");
				for (int i = 1; i <=ShopTelligenceCarouselSectionCount; i++) {
					String ShopTelligenceCarouselBlockName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li//span[contains(@class,'ensemble-name')])["+i+"]")).getText();
					testStepPassed(i+"."+ShopTelligenceCarouselBlockName);
				}
				String ShopTelligenceActiveCarouselName = driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li[contains(@class,'main-pos')]")).getText();
				testStepPassed("Default ShopTelligence Active Carousel Name : "+ShopTelligenceActiveCarouselName);




				testStepInfo("");
				List <WebElement> ShopTelligenceCarouselButtons = driver.findElements(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button"));
				int ShopTelligenceCarouselButtonsCount = ShopTelligenceCarouselButtons.size();
				testStepPassed("ShopTelligence Carousel Buttons Count : "+ShopTelligenceCarouselButtonsCount);
				testStepPassed("ShopTelligence Carousel Buttons Names");
				for (int i = 1; i <=ShopTelligenceCarouselButtonsCount ; i++) {
					String ShopTelligenceCarouselButtonsName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button)["+i+"]")).getText();
					testStepPassed(+i+"."+ShopTelligenceCarouselButtonsName);
				}



				String ShopTelligenceCarouselActiveButtonsName = driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button[contains(@class,'active')]")).getText();
				testStepPassed("Default ShopTelligence Active Carousel Button : "+ShopTelligenceCarouselActiveButtonsName);
			}
		} catch (Exception e) {
			testStepFailed("Carousel is not displayed in ShopTelligence section");
		}
	}




	public void verifyCorrespondingCarouselisDisplayedinShopTelligence(){
		try {
			testStepInfo("");
			List <WebElement> ShopTelligenceCarouselButtons = driver.findElements(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button"));
			int ShopTelligenceCarouselButtonsCount = ShopTelligenceCarouselButtons.size();

			for (int i = 1; i <=ShopTelligenceCarouselButtonsCount ; i++) {
				String ShopTelligenceCarouselButtonName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button)["+i+"]")).getText();
				driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button)["+i+"]")).click();
				testStepPassed("Clicked Carousel button : "+ShopTelligenceCarouselButtonName);
				String ShopTelligenceCarouselName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li//span[contains(@class,'ensemble-name')])["+i+"]")).getText();
				if (ShopTelligenceCarouselName.equalsIgnoreCase(ShopTelligenceCarouselButtonName)) {
					testStepPassed("Correct "+ShopTelligenceCarouselName+" Carousel block is displayed while clicking "+ShopTelligenceCarouselButtonName);
				}
				else {
					testStepFailed("Incorrect Carousel is displayed while clicking "+ShopTelligenceCarouselButtonName);
				}
			}


		} 
		catch (Exception e) {

			testStepFailed("Carousel is not displayed in ShopTelligence section");

		}
	}



	public void AddingProductsfromCarouselBlockinShopTelligence(String Size){
		try {
			testStepInfo("");

			String ShopTelligenceCarouselButtonName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button)[1]")).getText();
			driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button)[1]")).click();
			testStepPassed("Clicked Carousel button : "+ShopTelligenceCarouselButtonName);
			String ShopTelligenceCarouselName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li//span[contains(@class,'ensemble-name')])[1]")).getText();
			if (ShopTelligenceCarouselName.equalsIgnoreCase(ShopTelligenceCarouselButtonName)) {
				testStepPassed("Correct "+ShopTelligenceCarouselName+" Carousel block is displayed while clicking "+ShopTelligenceCarouselButtonName);
			}
			else {
				testStepFailed("Incorrect Carousel is displayed while clicking "+ShopTelligenceCarouselButtonName);
			}

			List <WebElement> ShopTelligenceCarouselProducts = driver.findElements(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//ul[contains(@class,'shoptelligence-carousel-inner')]//li[contains(@class,'main')]//div[contains(@class,'thelook-collection-column')]//div[contains(@class,'look-individual-item')]"));
			int ShopTelligenceCarouselProductsCount = ShopTelligenceCarouselProducts.size();

			testStepPassed("Following are the products displayed in ShopTelligence "+ShopTelligenceCarouselName+" Carousel Block");

			for (int i = 1; i <=ShopTelligenceCarouselProductsCount ; i++) 
			{
				String ShopTelligenceCarouselProductName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//ul[contains(@class,'shoptelligence-carousel-inner')]//li[contains(@class,'main')]//div[contains(@class,'thelook-collection-column')]//div[contains(@class,'look-individual-item')]//span)["+i+"]")).getText();
				testStepPassed(+i+"."+ShopTelligenceCarouselProductName);
				driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//ul[contains(@class,'shoptelligence-carousel-inner')]//li[contains(@class,'main')]//div[contains(@class,'thelook-collection-column')]//div[contains(@class,'look-individual-item')])["+i+"]")).click();
				testStepPassed("Click "+ShopTelligenceCarouselProductName+" Product form "+ShopTelligenceCarouselName+" block");
				if (verifyQVisDisplayed()) {

					//selectSizeFromQVPopup(Size);
					selectSizeFromQVPopupShopTelligence(Size);
					//selectSizeFromQuickViewPagenew(Size);
					clickOnShopTelligenceAddToShoppingBagFromQVPopup();
					//clickOnAddToShoppingBagFromQVPopup();
				}
				else {
					testStepFailed("QV Popup is not displayed");
				}

				waitTime(5);
				getProductCountinMinicart();

				if (driver.findElement(By.xpath("//a[@id='WC_QuickInfo_Link_close']")).isDisplayed()) {
					clickOn(lnk_QV_Close);
				}
				waitTime(4);
				testStepInfo("");
			}




		} 
		catch (Exception e) {

			testStepFailed("Carousel is not displayed in ShopTelligence section");

		}
	}



	public static final String drp_Shoptelligence_Dropdown="ShopTelligence Quick View Size Dropdown#xpath=//div[contains(@id,'quickInfoPopup')]//section[contains(@id,'prod-info')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[contains(@id,'ada-qv-curr-size')]";



	public String selectSizeFromQVPopupShopTelligence(String size){

		try {
			waitTime(2);

			if (driver.findElement(By.xpath("//div[contains(@class,'dijitDialog') and @id='quickInfoPopup']//div[@class='size-dropdown js-size-dropdown']")).isDisplayed())
				//if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']")).isDisplayed()) 
			{

				clickOn(drp_Shoptelligence_Dropdown);

				//clickOnSpecialElement(drp_size_item);
				waitTime(2);
				List<WebElement> sizeOptions=driver.findElements(By.xpath("//div[contains(@class,'widget_quick_info_popup')]//li[contains(@class,'size-item') and @class!='size-item out']/a"));
				if(sizeOptions.size()>0){
					if(!size.isEmpty())
					{

						for(WebElement ele:sizeOptions){
							if(ele.getText().equalsIgnoreCase(size)){
								ele.click();
								testStepPassed("click on '"+size+"' size");

							}


						}
					}else{
						for(WebElement ele:sizeOptions){
							ele.getText();
							if(ele.isDisplayed()){
								size=ele.getText();
								ele.click();
								testStepPassed("click on '"+size+"' size");
								break;
							}

						}
					}
				}
			}
			else{
				testStepFailed("Size options are not listed");
			}
			//return size;
		} catch (Exception e) {
			testStepPassed("Size Dropdown is not displayed");
		}
		return size;
	}





	public static final String btn_qv_add_to_shoppingbag="QV Add to Shopping Bag button#xpath=//section[contains(@id,'prod-info')]//button[contains(@id,'add-to-cart')]";

	public void clickOnAddToShoppingBagFromQVPopup(){
		clickOnSpecialElement(btn_qv_add_to_shoppingbag);
	}


	public static final String btn_ShopTelligence_qv_add_to_shoppingbag="ShopTelligence QV Add to Shopping Bag button#xpath=//div[contains(@class,'dijitDialog') and @id='quickInfoPopup']//button[contains(@id,'add-to-cart')]";


	public void clickOnShopTelligenceAddToShoppingBagFromQVPopup(){
		try {
			if (driver.findElement(By.xpath("//div[contains(@class,'dijitDialog') and @id='quickInfoPopup']//button[contains(@id,'add-to-cart')]")).isDisplayed()) {
				clickOn(btn_ShopTelligence_qv_add_to_shoppingbag);
			}
		} catch (Exception e) {
			testStepFailed("ShoppTelligence Add to Shopping Bag is not displayed");
		}
	}


	/*public void getProductCountinMinicart(){
		String ProductCount = driver.findElement(By.xpath("//li[contains(@class,'mini-cart-holder')]//a[contains(@id,'header-cart-with-count')]//span[contains(@class,'js-cart-counter')]")).getText();
		testStepPassed("Product Count in Bag : "+ProductCount);
	}*/



	public String getTailoringAmountinPDP()
	{
		String TailoringAmount = null;

		try{
			TailoringAmount = (driver.findElement(By.xpath("//span[contains(text(),'Tailor')]/../span[contains(@class,'price')]")).getText());
		}
		catch (Exception e) 
		{
			testStepFailed("Tailor&Hem Price In Product Description Page is not displayed");
		}
		return TailoringAmount;	
	}

	public void reserveProduct(String firstName, String lastName, String email, String phone, String zipcode1, String zipcode2) {
		try {
			if(elementPresent(txt_ropisStoreAvailable)) {
				waitTime(2);
				clickOn(btn_Reserve);
				//clickOnSpecialElement(btn_Reserve);
			}
			else if(elementPresent(txt_ropisStoreUnavailable)) {
				clickOn(btn_ropisChangeStore);
				typeIn(txt_changeStoreNumber, zipcode1);
				clickOn(btn_Search);
				List<WebElement> store = driver.findElements(By.xpath(".//*[@id='selectChangeStoreModal']//div[contains(@class, 'js-pdp-store-result-details')]/div"));

				if(store.size() > 0) {
					if(driver.findElement(By.xpath("//*[@id='selectChangeStoreModal']//div[contains(@class, 'js-pdp-store-result-details')]/div//p/span[contains(text(), 'Available')]")).isDisplayed()) {
						driver.findElement(By.xpath("(//*[@id='selectChangeStoreModal']//div[contains(@class, 'js-pdp-store-result-details')]/div//p/span[contains(text(), 'Available')])[1]")).click();
						clickOn(btn_changeStoreReserve);
					}
					else if(!driver.findElement(By.xpath("//*[@id='selectChangeStoreModal']//div[contains(@class, 'js-pdp-store-result-details')]/div//p/span[contains(text(), 'Available')]")).isDisplayed()) {
						typeIn(txt_changeStoreNumber, zipcode1);
						clickOn(btn_Search);
						driver.findElement(By.xpath("(//*[@id='selectChangeStoreModal']//div[contains(@class, 'js-pdp-store-result-details')]/div//p/span[contains(text(), 'Available')])[1]")).click();
						clickOn(btn_changeStoreReserve);
					}
					else {
						testStepFailed("No Store is available");
					}

				}


			}

			typeIn(txt_ropisFirstName, firstName);
			typeIn(txt_ropisLastName, lastName);
			typeIn(txt_ropisEmail, email);
			typeIn(txt_ropisPhone, phone);
			driver.findElement(By.xpath("//input[@id='txtRopisPhone']")).sendKeys(Keys.TAB);
			if(driver.findElement(By.xpath("//input[@id='btnRopisFormSubmit']")).isEnabled()) {
				clickOn(btn_ropisReserve); }
			else  {
				testStepFailed("Reserve button is disabled");
			}
			waitTime(4);
		}
		catch(Exception e){

		}
	}


	public String selectproductfromROPISPDPcertona(){
		String ROPISRecommendedSize = null;
		try{
			//waitTime(2);
			if (driver.findElement(By.xpath("(//div[contains(@class,'pdp-ropis-inner-wrapper')]/div[contains(@class,'js-crt-widget')])[1]")).isDisplayed()) {
				testStepPassed("ROPIS product recommendation certona widget is dipalyed ");
				ROPISRecommendedSize = driver.findElement(By.xpath("(//div[contains(@class,'pdp-ropis-inner-wrapper')]/div[contains(@class,'js-crt-widget')])[1]/div[contains(@class,'ropis-recommendation__availability')]/span")).getText();
				System.out.println(ROPISRecommendedSize);
				clickOnSpecialElement("ROPIS certona 1st product #xpath=(((//div[contains(@class,'pdp-ropis-inner-wrapper')]/div[contains(@class,'js-crt-widget')])[1]/section/div[contains(@class,'products')]//div[contains(@class,'certona-product')])[1]//a)[1]");
				String newPDPSize = driver.findElement(By.xpath("//div[contains(@class,'size-dropdown')]/div[contains(@id,'curr-size')]")).getText();
				System.out.println(newPDPSize);

			} else {
				testStepFailed("ROPIS product recommendation certona widget is not found ");
			}

		}catch(Exception e){
			testStepFailed("ROPIS product recommendation certona widget is not found");
		}
		return ROPISRecommendedSize;

	}

	public String GetPDPselectedSize(){
		String newPDPSize = null;
		try{
			//waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@class,'size-dropdown')]/div[contains(@id,'curr-size')]")).isDisplayed()) {
				newPDPSize = driver.findElement(By.xpath("//div[contains(@class,'size-dropdown')]/div[contains(@id,'curr-size')]")).getText();
				System.out.println(newPDPSize);
			} else {
				testStepFailed("PDP selected size is not displayed ");
			}

		}catch(Exception e){
			testStepFailed("PDP selected size is not displayed");
		}
		return newPDPSize;
	}

	public String addProductFromROPISReservationConfirmpageFromOneCertonaWidget(String ProductCount){

		try{
			if (driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]")).isDisplayed()) {
				int prodcount = Integer.parseInt(ProductCount);
				for(int i = 1; i <= prodcount; i++)
				{
					clickOnSpecialElement("Add button for product from reserve more certona widget#xpath=(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]//div[contains(@aria-hidden,'false')])["+i+"]//a[contains(@class,'add-to-reserve')]");
					if (driver.findElement(By.xpath("//p[contains(text(),' More Item(s) added to Your Reservation')]")).isDisplayed())
					{
						testStepPassed("More item added to Your reservation message is displayed ");
						String ReserveItemCount = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-review')]//span[contains(@class,'ropis-reserve-items-count')]")).getText();
						testStepPassed("Reservation product count: " + ReserveItemCount);
						WebElement Certonawidget = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]"));
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("arguments[0].scrollIntoView();",Certonawidget );
						if (driver.findElement(By.xpath("(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]//div[contains(@aria-hidden,'false')])["+i+"]//a[contains(@class,'add-to-reserve')]//span[contains(text(),'Added')]")).isDisplayed())
						{
							testStepPassed("Add to reserve text is changed to Added ");
						}
						else 
						{
							testStepFailed("Add to reserve text is not changed to Added  ");
						}

					}
					else{
						testStepFailed("More item added to Your reservation message is not displayed ");
					}
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,-250)", "");
				}
			} else {
				testStepFailed("Reserve more product certona widget is not displayed ");
			}

		}catch(Exception e){
			testStepFailed("Reserve more product certona widget is not displayed");
		}
		return ProductCount;

	}

	public String verifyRemoveProductcountinROPISReservationPage(){
		String newPDPSize = null;
		try{
			String ReserveItemCountBefore = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-review')]//span[contains(@class,'ropis-reserve-items-count')]")).getText();
			clickOnSpecialElement("Reservation product details dropdown #xpath=//div[contains(@id,'reserveOnlineModal')]/a[contains(@class,'close-reveal-modal')]");
			if(driver.findElement(By.xpath("//div[contains(@role,'tooltip')]//div[contains(@role,'alert')]")).isDisplayed())
			{
				testStepPassed("Please confirm your reservation before you exit this window alert pop-up is displayed");
			}
			else
			{
				testStepFailed("Please confirm your reservation before you exit this window alert pop-up is not displayed");
			}	
			clickOnSpecialElement("Reservation product details dropdown #xpath=//div[contains(@class,'ropis-reserve-review')]");
			List<WebElement> Removecount = driver.findElements(By.xpath("//div[contains(@class,'ropis-reserved-item__remove')]//a[contains(text(),'Remove')]"));
			int ProductRemoveCount = Removecount.size();
			testStepPassed("ROPIS Reservation remove product count : " + ProductRemoveCount);

			for (int i = 1; i <=ProductRemoveCount; i++) {
				clickOnSpecialElement("Reservation product remove link #xpath=//div[contains(@class,'ropis-reserved-item__remove')]//a[contains(text(),'Remove')]");
			}
			String ReserveItemCountAfter = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-review')]//span[contains(@class,'ropis-reserve-items-count')]")).getText();
			testStepPassed("Reservation product count: " + ReserveItemCountAfter);
			if(ReserveItemCountBefore.equals(ReserveItemCountAfter)) 
			{
				testStepFailed("ROPIS Reservation added product count is not changed after removing products");
			}
			else 
			{
				testStepPassed("ROPIS Reservation added product count is changed after removing products");
			}
			clickOnSpecialElement("ROPIS Order confirmation close link #xpath=(//a[contains(@class,'close-reveal-modal')])[2]");

		}catch(Exception e){
			testStepFailed("PDP selected size is not displayed");
		}
		return newPDPSize;
	}

	public String addProductFromROPISReservationConfirmpageFromMultipleCertonaWidget(){

		try{
			List<WebElement> Widgetcount = driver.findElements(By.xpath("//div[contains(@class,'ropis-reserve-more-widget')]/div[contains(@class,'ropis-reserve-category')]"));
			int CertonaWidgetcount = Widgetcount.size();
			for (int i = 1; i <=CertonaWidgetcount; i++) 
			{
				if(isElementPresent("(//div[contains(@class,'ropis-reserve-more')]//div[contains(@class,'certona-widget')])["+i+"]", 5))
				{
					if(elementPresent("#xpath=(//div[contains(@class,'ropis-reserve-more')]//div[contains(@class,'certona-widget')])["+i+"]//div[contains(@class,'select-size-btn')]"))	
					{
						clickOnSpecialElement("Select size link in certona widget #xpath=(//div[contains(@class,'select-size-btn')])[1]");
						clickOnSpecialElement("Select size from certona widget #xpath=(//ul[contains(@class,'ropis-size-list')]/li)[1]");
						if(elementPresent("#xpath=//div[contains(text(),'Additional inventory may be available in-store')]"))	
						{
							testStepWarning("Additional inventory may be available in-store. Visit your nearest Men's Wearhouse for more selection ");



							if(elementPresent("change#xpath=(//div[contains(@class,'ropis-reserve-category__size-section')]//a)["+i+"]"))
							{
								waitTime(2);

								clickOnSpecialElement("change#xpath=(//div[contains(@class,'ropis-reserve-category__size-section')]//a)["+i+"]");
								waitTime(2);
								List<WebElement> Sizecount = driver.findElements(By.xpath("//ul[contains(@class,'js-ropis-size-list')]/li"));
								int SizeFilterSizeCount = Sizecount.size();
								for (int r = 1; r <=SizeFilterSizeCount; r++) {
									//clickOnSpecialElement("change#xpath=(//div[contains(@class,'ropis-reserve-category__size-section')]//a)["+i+"]");
									String Sizevalue = driver.findElement(By.xpath("(//ul[contains(@class,'js-ropis-size-list')]/li)["+r+"]")).getAttribute("title");
									System.out.println(Sizevalue);
									clickOnSpecialElement("'"+Sizevalue+"' Filter Value#xpath=(//ul[contains(@class,'js-ropis-size-list')]/li)["+r+"]");
									if(elementPresent("#xpath=//div[contains(text(),'Additional inventory may be available in-store')]"))	
									{
										testStepWarning("Additional inventory may be available in-store. Visit your nearest Men's Wearhouse for more selection ");
										clickOnSpecialElement("change#xpath=(//div[contains(@class,'ropis-reserve-category__size-section')]//a)["+i+"]");
										//if (driver.findElement(By.xpath("(//div[contains(@class,'ropis-reserve-more')]//div[contains(@class,'certona-widget')])["+i+"]")).isDisplayed()) {

									}
									else{

										for(int m = 1; m <=1; m++)
										{
											testStepPassed("Adding Product from QV "+ i +" Certona Widget");
											mouseOver("product image#xpath=((//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]//div[contains(@aria-hidden,'false')])["+m+"]");
											clickOnSpecialElement("Product QA button#xpath=((//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]//div[contains(@aria-hidden,'false')])["+m+"]//span[contains(text(),'Quick View')]");
											clickOnSpecialElement("Add button for product from QV reserve more certona widget#xpath=//div[contains(@class,'ropis-custom-qv__info')]//a[contains(@class,'add-to-reserve-qv')]");
											if (driver.findElement(By.xpath("//p[contains(text(),'More Item(s) added to Your Reservation')]")).isDisplayed())
											{
												testStepPassed("More item added to Your reservation message is displayed ");
												String ReserveItemCount = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-review')]//span[contains(@class,'ropis-reserve-items-count')]")).getText();
												testStepPassed("Reservation product count: " + ReserveItemCount);
												WebElement Certonawidget = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]["+i+"]"));
												JavascriptExecutor jse = (JavascriptExecutor)driver;
												jse.executeScript("arguments[0].scrollIntoView();",Certonawidget );
												if (driver.findElement(By.xpath("(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]//a[contains(@class,'add-to-reserve')]//span[contains(text(),'Added')]")).isDisplayed()) 
												{
													testStepPassed("Add to reserve text is changed to Added ");
												}
												else 
												{
													testStepFailed("Add to reserve text is not changed to Added  ");
												}


											}

											JavascriptExecutor jse = (JavascriptExecutor)driver;
											jse.executeScript("window.scrollBy(0,-250)", "");



										}
										break;

									}

								}
							}

						}

						else 
						{
							for(int k = 1; k <=2; k++)
							{
								testStepPassed("Adding Product from "+ i +" Certona Widget");
								clickOnSpecialElement("Add button for product from reserve more certona widget#xpath=((//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]//div[contains(@aria-hidden,'false')])["+k+"]//a[contains(@class,'add-to-reserve')]");
								if (driver.findElement(By.xpath("//p[contains(text(),'More Item(s) added to Your Reservation')]")).isDisplayed())
								{
									testStepPassed("More item added to Your reservation message is displayed ");
									String ReserveItemCount = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-review')]//span[contains(@class,'ropis-reserve-items-count')]")).getText();
									testStepPassed("Reservation product count: " + ReserveItemCount);
									WebElement Certonawidget = driver.findElement(By.xpath("(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]"));
									JavascriptExecutor jse = (JavascriptExecutor)driver;
									jse.executeScript("arguments[0].scrollIntoView();",Certonawidget );
									if (driver.findElement(By.xpath("(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]//div[contains(@aria-hidden,'false')])["+k+"]//a[contains(@class,'add-to-reserve')]//span[contains(text(),'Added')]")).isDisplayed()) 
									{
										testStepPassed("Add to reserve text is changed to Added ");
									}
									else 
									{
										testStepFailed("Add to reserve text is not changed to Added  ");
									}

								}
								else
								{
									testStepFailed("More item added to Your reservation message is not displayed ");
								}
								JavascriptExecutor jse = (JavascriptExecutor)driver;
								jse.executeScript("window.scrollBy(0,-250)", "");
							}

						}

					}
					else
					{
						if(elementPresent("#xpath=//div[contains(text(),'Additional inventory may be available in-store')]"))	
						{
							testStepWarning("Additional inventory may be available in-store. Visit your nearest Men's Wearhouse for more selection ");
						}
						else
						{
							for(int k = 1; k <=2; k++)
							{
								testStepPassed("Adding Product from QV "+ i +" Certona Widget");
								mouseOver("product image#xpath=((//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]//div[contains(@aria-hidden,'false')])["+k+"]");
								clickOnSpecialElement("Product QA button#xpath=((//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]//div[contains(@aria-hidden,'false')])["+k+"]//span[contains(text(),'Quick View')]");
								clickOnSpecialElement("Add button for product from QV reserve more certona widget#xpath=//div[contains(@class,'ropis-custom-qv__info')]//a[contains(@class,'add-to-reserve-qv')]");
								if (driver.findElement(By.xpath("//p[contains(text(),'More Item(s) added to Your Reservation')]")).isDisplayed())
								{
									testStepPassed("More item added to Your reservation message is displayed ");
									String ReserveItemCount = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-review')]//span[contains(@class,'ropis-reserve-items-count')]")).getText();
									testStepPassed("Reservation product count: " + ReserveItemCount);
									WebElement Certonawidget = driver.findElement(By.xpath("(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]"));
									JavascriptExecutor jse = (JavascriptExecutor)driver;
									jse.executeScript("arguments[0].scrollIntoView();",Certonawidget );
									if (driver.findElement(By.xpath("(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')])["+i+"]//a[contains(@class,'add-to-reserve')]//span[contains(text(),'Added')]")).isDisplayed()) 
									{
										testStepPassed("Add to reserve text is changed to Added ");
									}
									else 
									{
										testStepFailed("Add to reserve text is not changed to Added  ");
									}

								}
								else
								{
									testStepFailed("More item added to Your reservation message is not displayed ");
								}
								JavascriptExecutor jse = (JavascriptExecutor)driver;
								jse.executeScript("window.scrollBy(0,-250)", "");
							}
						}
					}
				}
				else
				{
					testStepFailed("ROPIS reserve more certona widget is not displayed"); 
				}
			}

		}catch(Exception e){
			testStepFailed("Reserve more product certona widget is not displayed");
		}
		return null;
	}


	public String addMoreThanTenProductFromROPISReservationConfirmpageAndVerifyErrorMessage(String ProductCount){

		try{
			if (driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]")).isDisplayed()) 
			{
				for(int j =1;j <=2; j++)
				{
					int prodcount = Integer.parseInt(ProductCount);//driver.findElement(By.xpath("//div[contains(text(),'Maximum 10 items allowed per reservation')]")).isDisplayed()
					for(int i = 1; i <= prodcount; i++)
					{
						clickOnSpecialElement("Add button for product from reserve more certona widget#xpath=(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]//div[contains(@aria-hidden,'false')])["+i+"]//a[contains(@class,'add-to-reserve')]");
						//if (isElementPresent("#xpath=//div[contains(text(),'Maximum 10 items allowed per reservation')]") )
						if(elementPresent("#xpath=//div[contains(text(),'Maximum 10 items allowed per reservation')]"))	
						{
							testStepInfo(" Error Message:Maximum 10 items allowed per reservation message is displayed ");
							break;
						}
						if (driver.findElement(By.xpath("//p[contains(text(),' More Item(s) added to Your Reservation')]")).isDisplayed()) 
						{
							testStepPassed("More item added to Your reservation message is displayed ");
							String ReserveItemCount = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-review')]//span[contains(@class,'ropis-reserve-items-count')]")).getText();
							testStepPassed("Reservation product count: " + ReserveItemCount);
							WebElement Certonawidget = driver.findElement(By.xpath("//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]"));
							JavascriptExecutor jse = (JavascriptExecutor)driver;
							jse.executeScript("arguments[0].scrollIntoView();",Certonawidget );
							if (driver.findElement(By.xpath("(//div[contains(@class,'ropis-reserve-more-widget')]//section[contains(@class,'certona-widget')]//div[contains(@aria-hidden,'false')])["+i+"]//a[contains(@class,'add-to-reserve')]//span[contains(text(),'Added')]")).isDisplayed()) 
							{
								testStepPassed("Add to reserve text is changed to Added ");
							}
							else 
							{
								testStepFailed("Add to reserve text is not changed to Added  ");
							}

						}
						else
						{
							testStepFailed("More item added to Your reservation message is not displayed ");
						}
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("window.scrollBy(0,-250)", "");
					}
					clickOnSpecialElement(" Load Next set of products button #xpath=//div[contains(@class,'ropis-reserve-more-widget')]//button[contains(@aria-label,'Load Next Set of products')]");
				}

			}	

		}catch(Exception e){
			testStepFailed("Reserve more product certona widget is not displayed");
		}
		return ProductCount;

	}

	public String getProductPromotionNameInPDP(String promotionName) {
		String locator="promotion name in PDP#xpath=//div[contains(@class, 'promo-section')]//p[contains(@class, 'price-promo')]";
		promotionName=getText(locator);
		return promotionName;
	}




}

