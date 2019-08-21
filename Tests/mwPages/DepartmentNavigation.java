package mwPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import org.apache.commons.lang.WordUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;







public class DepartmentNavigation extends PopupWindows
{
	public DepartmentNavigation(BaseClass obj) {
		
		super(obj);

	}




	/*public void clickOnDepartmentSubCategory(String departmentName, String subCategoryLink){
		mouseOver("'"+departmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]");
		waitTime(1);
		clickOn("'"+subCategoryLink+"' subcategory link#xpath=//a[contains(@id,'nextSubCategoryLink') and contains(text(),'"+subCategoryLink+"')]");
	}*/

	public void clickOnDepartmentLink(String departmentName){
		clickOn("'"+departmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]");
	}

	public String clickOnAnySubCategoryLink(String departmentName){
		String subCategoryLink = null;
		try{

			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on '"+departmentName+"' department");
				}
			}else{
				mouseOver("'"+departmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]");	
			}




			//mouseOver("'"+departmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]");	
			waitTime(5);
			List<WebElement> subcategoryLink=driver.findElements(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]/parent::li//div//a[(contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink') )]"));
			if(subcategoryLink.size()>0){
				Random ran= new Random();
				int ranNumber=ran.nextInt(subcategoryLink.size());
				webElement=subcategoryLink.get(ranNumber);
				subCategoryLink=webElement.getText().trim();
				locatorDescription="Click on :"+subCategoryLink;
				webElement.click();
				testStepPassed(locatorDescription);
			}else{
				testStepFailed("There is no subcategory link to click");
			}
		}catch(Exception e){
			testStepFailed("Unable to click on webelement :");
		}
		return subCategoryLink;
	}

	public void clickOnDepartmentSubCategoryOrPromoLink(String departmentName, String link){
		waitTime(2);
		List<WebElement> subcategoryLink;
		//waitForText("Ship To ");

		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on '"+departmentName+"' department");
			}
		}
		else{
			waitForElementToDisplay("'"+departmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]", elementLoadWaitTime);
			mouseOver("'"+departmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]");	
		}
		waitForElementToDisplay("'"+link+"' subcategory link#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]/parent::li//div//a[(contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink') )]", elementLoadWaitTime);
		subcategoryLink=driver.findElements(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]/parent::li//div//a[(contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink') )]"));
		subcategoryLink=driver.findElements(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]/parent::li//div//a[(contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink') or contains(@id,'saleNextSubItemLink') )]"));
		for(WebElement ele: subcategoryLink){
			String lk=ele.getText().trim();
			if(lk.equalsIgnoreCase(link.trim())){
				ele.click();
				testStepPassed("click on: '"+lk+"' subcategory link");
				break;
			}
		}
	}
	public void selectCategoryFromDepartmentMenu(String departmentName, String subCategoryName){
		String departmentName1,departmentLinkXpath,subCategoryLinkXpath;

		if(departmentName.equalsIgnoreCase("sportcoats")) departmentName1="SportCoats";
		else departmentName1 = WordUtils.capitalize(departmentName);
		departmentLinkXpath = "'"+departmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]";
		subCategoryLinkXpath = "//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]/parent::li//div//a[contains(text(),'"+subCategoryName+"')]";
		if(currentBrowser.equalsIgnoreCase("safari")|| currentBrowser.equalsIgnoreCase("InternetExplorer")){
			WebElement element=driver.findElement(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on '"+departmentName+"' department");
			}
		} else {
			mouseOver("'"+departmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+departmentName+"')]");
		}
		clickOnSpecialElement("'"+subCategoryName+"' SubCategory#xpath="+subCategoryLinkXpath);

	
	}

	public List<String> getDepartmentList(){
		List<String> departmentList=new ArrayList<String>();
		List<WebElement> department=driver.findElements(By.xpath("//a[contains(@id,'TopCategoryLink')]"));
		for(int i=0;i<department.size();i++){
			departmentList.add(WordUtils.capitalize(department.get(i).getText().split("TOP")[0].trim().toLowerCase()));
		}
		return departmentList;
	}

	public List<String> getSubCategoryList(String department){

		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+department+"')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on '"+department+"' department");
			}
		}else{
			mouseOver("'"+department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+department+"')]");	
		}

		//mouseOver("'"+department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+department+"')]");
		waitTime(1);
		List<String> subCategoryList=new ArrayList<String>();
		List<WebElement> subCategory=driver.findElements(By.xpath("//a[contains(@id,'nextSubCategoryLink')]"));
		for(int i=0;i<subCategory.size();i++){
			if(subCategory.get(i).isDisplayed()){
				subCategoryList.add(subCategory.get(i).getText().trim());
			}
		}
		return subCategoryList;
	}

	public List<String> getAllLinkUnderDepartment(String department){
		waitForText("Ship To ");

		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+department+"')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on '"+department+"' department");
			}
		}else{
			mouseOver("'"+department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+department+"')]");	
		}

		//mouseOver("'"+department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+department+"')]");
		waitTime(1);
		List<String> allList=new ArrayList<String>();
		List<WebElement> subCategory=driver.findElements(By.xpath("//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink') or contains(@id,'saleNextSubItemLink')]"));
		for(int i=0;i<subCategory.size();i++){
			if(subCategory.get(i).isDisplayed()){
				allList.add(subCategory.get(i).getText().trim());
			}
		}
		return allList;
	}




	public void clickOnDepartmentSubCategoryOrPromoLink_new(String Department, String SubCategorylink){
		//waitTime(3);		
		/*System.out.println("Department Name : "+Department);
		testStepPassed("Department Name : "+Department);
		System.out.println("SubCategorylink Name : "+SubCategorylink);
		testStepPassed("SubCategorylink Name : "+SubCategorylink);*/
		if(currentBrowser.equalsIgnoreCase("safari")){
			WebElement element=driver.findElement(By.xpath("//a[contains(@id,'TopCategoryLink') and contains(text(),'"+Department+"')]"));
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on '"+Department+"' department");
			}
		}else{
			waitForElementToDisplay("'"+Department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+Department+"')]", elementLoadWaitTime);
			mouseOver("'"+Department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+Department+"')]");	
		}
		waitTime(2);
		//waitForElementToDisplay("'"+SubCategorylink+"' subcategory link#xpath=//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategorylink+"')]", elementLoadWaitTime);
		waitForElementToDisplay("'"+SubCategorylink+"' subcategory link#xpath=//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategorylink+"')]", elementLoadWaitTime);

		//WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));

		/*if (Department.equalsIgnoreCase("Sale")) {


			List<WebElement> SubCatgLinkTitle= driver.findElements(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));

			int SubCatgCount = SubCatgLinkTitle.size();

			if (SubCatgCount>1) {

				for (int i = 1; i <= SubCatgCount; i++) {

					String  SubCatghref = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategorylink+"')])["+i+"]")).getAttribute("href");

					String SubCatghreftrimmed = StringUtils.substringAfterLast(SubCatghref, "/");

					String SubCatghrefFinal = StringUtils.substringAfterLast(SubCatghreftrimmed, "-");

					if (SubCatghrefFinal.equalsIgnoreCase("clearance")) {

						mouseOver("'"+Department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+Department+"')]");

						WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')][1]//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));

						SubcategoryLink.click();

						testStepPassed("Click on :"+SubCategorylink+" SubCategory Link");

						if (checkProductGridPageisDisplayed()) {

							selectProductInProductGridPage();

							if (verifyProductDisplayedinPDP()) {

								testStepPassed("PDP Page is displayed");

							}
							else if (check404PageisDisplayed()) {

								testStepFailed("404 Page is displayed in PDP");

							}

							else {

								testStepFailed("Blank Page is displayed in PDP");

							}

						}

						else if (check404PageisDisplayed()) {

							testStepFailed("404 Page is displayed in PGP");

						}


						else {

							testStepFailed("Blank Page is displayed in PGP");

						}

					}

					else if (SubCatghrefFinal.equalsIgnoreCase("sale")) {

						mouseOver("'"+Department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+Department+"')]");

						WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')][2]//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));

						SubcategoryLink.click();

						testStepPassed("Click on :"+SubCategorylink+" SubCategory Link");

						if (checkProductGridPageisDisplayed()) {

							selectProductInProductGridPage();

							if (verifyProductDisplayedinPDP()) {

								testStepPassed("PDP Page is displayed");

							}
							else if (check404PageisDisplayed()) {

								testStepFailed("404 Page is displayed in PDP");

							}

							else {

								testStepFailed("Blank Page is displayed in PDP");

							}

						}


						else if (check404PageisDisplayed()) {

							testStepFailed("404 Page is displayed in PGP");

						}


						else {

							testStepFailed("Blank Page is displayed in PGP");

						}

					}
					else {

						mouseOver("'"+Department+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+Department+"')]");

						WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')][1]//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));

						SubcategoryLink.click();

						testStepPassed("Click on :"+SubCategorylink+" SubCategory Link");

						if (checkProductGridPageisDisplayed()) {

							selectProductInProductGridPage();

							if (verifyProductDisplayedinPDP()) {

								testStepPassed("PDP Page is displayed");

							}
							else if (check404PageisDisplayed()) {

								testStepFailed("404 Page is displayed in PDP");

							}

							else {

								testStepFailed("Blank Page is displayed in PDP");

							}

						}

						else if (check404PageisDisplayed()) {

							testStepFailed("404 Page is displayed in PGP");

						}


						else {

							testStepFailed("Blank Page is displayed in PGP");

						}

					}			

				}

			}	

			else {
				WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));
				SubcategoryLink.click();
			}

		}

		else {
			WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));
			SubcategoryLink.click();
		}*/
		
		//WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));
		WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+Department+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));
		SubcategoryLink.click();
		waitTime(1);


	}


	public void selectProductInProductGridPage(){
		String locator="First product listed#xpath=(//section[contains(@id,'results-products')]//ul[contains(@id,'products')]//div[contains(@class,'prod-info')]//a)[1]";
		String productName=getText(locator);
		clickOn(productName+" product name#xpath=(//section[contains(@id,'results-products')]//ul[contains(@id,'products')]//div[contains(@class,'prod-info')]//a)[1]");
	}


	public boolean verifyProductDisplayedinPDP(){
		boolean flag = false;
		try {
			if (driver.findElement(By.xpath("//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]")).isDisplayed()) {
				flag =true;
			}
		} catch (Exception e) {

		}
		return flag;
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

	public void clickOnSubCategoryLink(String departmentName, String SubCategorylink){
		WebElement SubcategoryLink = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+departmentName+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategorylink+"')]"));
		SubcategoryLink.click();
		waitTime(3);	}
	
	
	public void departmentLandingPageisDisplayed(String departmentName)
	{
		waitTime(3);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println("department name: " +departmentName);
		try 
		{
			if (pageTitle.contains(departmentName)) 
			{
				testStepPassed(departmentName+" landing page is displayed successfully");
			}
		} 
		catch (Exception e) 
		{
			testStepFailed(departmentName+" is landing in wrong page");
		}
	}

}