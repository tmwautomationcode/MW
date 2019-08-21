package scenarios;


import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.ClassicGiftCardPage;
import mwPages.DepartmentNavigation;
import mwPages.EGiftCardPage;
import mwPages.GiftCardsPage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.ShoppingCartPage;
import mwPages.HomePage;
import mwPages.DepartmentNavigation;
import mwPages.ProductBundlePage;
import mwPages.ProductDescriptionPage;
import mwPages.ProductGridPage;
import mwPages.GiftCardsPage;
import mwPages.HomePage;
import baseClass.BaseClass;
import baseClass.PopupWindows;

public class AddToCartDifferentCloneIdTest extends PopupWindows 
{
	private BaseClass obj;
	private PopupWindows popupWindows;
	private DepartmentNavigation departmentNavigation;
	private ProductDescriptionPage productDescriptionPage;
	private ProductGridPage productGridPage;
	private ShoppingCartPage shoppingcartPage;
	private GiftCardsPage giftcardPage;
	private EGiftCardPage eGiftcardPage;
	private ClassicGiftCardPage classicGiftcardPage;
	private HomePage homePage;
	private ProductBundlePage productBundlePage;
	private GiftCardsPage giftCardsPage;
	

	public AddToCartDifferentCloneIdTest(BaseClass obj) 
	{
		super(obj);
		this.obj=obj;
	}

	
	public void createObjects(String browser)
	{
		obj.driver=driver;
		obj.currentBrowser=browser;

		classicGiftcardPage = new	ClassicGiftCardPage(obj);
		departmentNavigation = new	DepartmentNavigation(obj);
		eGiftcardPage = new	EGiftCardPage(obj);
		giftcardPage = new	GiftCardsPage(obj);
		productDescriptionPage = new	ProductDescriptionPage(obj);
		productGridPage = new	ProductGridPage(obj);
		shoppingcartPage = new	ShoppingCartPage(obj);
		popupWindows=new PopupWindows(obj);
		homePage= new HomePage(obj);
		productBundlePage = new ProductBundlePage(obj);
	}



	public void destroyObjects()
	{
		classicGiftcardPage = null;
		departmentNavigation = null;
		eGiftcardPage = null;
		giftcardPage = null;
		productDescriptionPage = null;
		productGridPage = null;
		shoppingcartPage = null;
		popupWindows=null;
		homePage = null;
		productBundlePage = null;
	}



	String JSESSIONIDFromApplication;
	String JSESSIONIDAfterNewValue;
	String JSESSIONIDAfterAddingProduct;
	String CLONEIDFromApplication;
	String CLONEIDAfterAddingProduct;
	String CLONEIDAfterNewValue;
	
	
	private String parentWindow;
	String currentWindow;


	int startFromDepartment = 0; 
	int endAtDepartment = 0;
	

	public void addToCartDifferentCloneIdTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId)
	{
		try
		{


			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);

			/*if (browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("Safari")) {

				getJSESSIONIDOnceBrowserInitiated();

				getCLONEIDOnceBrowserInitiated();

			}*/


			parentWindow=driver.getWindowHandle();
			currentWindow=driver.getWindowHandle();


			String StartDept = retrieve("StartDepartment");
			String EndDept = retrieve("EndDepartment");

			int StartDepartment = Integer.parseInt(StartDept);
			int EndDepartment = Integer.parseInt(EndDept);


			int l = StartDepartment;
			int m = EndDepartment;

			String DepartName = null;

			System.out.println(DepartName);


			/*verifyUSFlagSelected();
			waitTime(2);
			clickOnBackToTopLinkInFooter();*/


			/**
			 * Code to get Total Departments
			 */
			List<WebElement> Departments = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]"));
			int DepartmentsCount = Departments.size();
			//System.out.println("Total Departments : "+DepartmentsCount);
			testStepPassed("");
			testStepInfo("Total Departments");
			testStepInfo("**********************");
			testStepPassed("Total Departments : "+DepartmentsCount);
			//List<WebElement> DepartmentsName = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')][1]//a[contains(@id,'TopCategoryLink')]"));


			testStepPassed("");
			testStepInfo("Departments Name");
			testStepInfo("************************");
			for (int i = 0; i < DepartmentsCount; i++) {
				int j = i+1;

				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+j+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");
				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);
				testStepPassed(""+j+". "+DepartmentName);
			}



			testStepPassed("");
			testStepInfo("Sub Categories Links Count in every Department");
			testStepInfo("*********************************************************");
			for (int k = 1; k <= DepartmentsCount; k++) {
				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+k+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");
				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);
				//List<WebElement> SubCategoriesLinks = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+k+"]//ul[contains(@class,'drop-down-list')]//li[contains(@class,'list-column list-column')]//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));
				List<WebElement> SubCategoriesLinks = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+k+"]//ul[contains(@class,'drop-down-list')]//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));
				int SubCategoryLinksCount = SubCategoriesLinks.size();
				testStepPassed(""+k+". "+"SubCategories Count in "+DepartmentName+" : "+SubCategoryLinksCount);
			}






			/*testStepPassed("");
			testStepInfo("Following are the Sub Categories Links Count in every Department");
			testStepInfo("******************************************************************************");
			for (int k = 1; k < DepartmentsCount; k++) {
				String SubCat = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+k+"]//a[contains(@id,'TopCategoryLink') or contains(@id,'promoNextSubItemLink')]")).getText();
				String SubCategoryName = SubCat.substring(0, SubCat.indexOf("TOP"));
				List<WebElement> SubCatoryLinksName = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+k+"]//ul[contains(@class,'drop-down-list')]//li[contains(@class,'list-column list-column')]//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));
				int SubCategoriesCount = SubCatoryLinksName.size();
				testStepPassed(""+k+". "+"SubCategories Count in "+SubCategoryName+" : "+SubCategoriesCount);
			}*/



			testStepPassed("");
			testStepInfo("Total Sub Categories Links Count in all Departments");
			testStepInfo("*************************************************************");
			//List<WebElement> SubCategoryLinks = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]//ul[contains(@class,'drop-down-list')]//li[contains(@class,'list-column list-column')]//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));
			List<WebElement> SubCategoryLinks = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]//ul[contains(@class,'drop-down-list')]//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));
			int SubCategoriesCount = SubCategoryLinks.size();
			testStepPassed("Total Sub Categories Links Count : "+SubCategoriesCount);






			testStepPassed("");
			testStepInfo("Departments going to be Executed");
			testStepInfo("*****************************************");
			int q=1;
			for (int n = l; n <= m; n++) {
				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+n+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");
				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);
				//testStepInfo("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+n+"]//a[contains(@id,'TopCategoryLink')]");
				/*	testStepInfo(Dept);
				testStepInfo(DepartmentName);*/
				testStepPassed(""+q+". "+DepartmentName);
				q=q+1;
			}


			for (int t = l; t <= m; t++) 
			{
				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+t+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");
				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);
				String DepartmentBreadCrumb = DepartmentName.toUpperCase();
				
				testStepPassed("");
				testStepInfo("*********************************************************");
				testStepInfo("Landing Page of Department : "+DepartmentName);
				testStepInfo("*********************************************************");

				departmentNavigation.clickOnDepartmentLink(DepartmentName);
				
				departmentNavigation.departmentLandingPageisDisplayed(DepartmentName);
				
				//URLNavigateBack();
				
				if (productGridPage.checkProductGridPageisDisplayed()) 
				{
					testStepPassed(DepartmentName+" PGP is displayed");
					productGridPage.verifyCorrespondingPGPisDisplayedWithDepartmentBreadCrumbinPGPisdisplayed(DepartmentBreadCrumb);
					homePage.ClickonHomePageLogo();
				}
				else if (productGridPage.check404PageisDisplayed()) {

					testStepFailed("404 Page is displayed in PGP");
					homePage.ClickonHomePageLogo();

				}
				
				else if (productGridPage.checkBannerPageDisplayed()) {

					testStepPassed(DepartmentName+" Banner Page is displayed");

					productGridPage.checkCorrespondingBannerPageDisplayed(DepartmentName);
					homePage.ClickonHomePageLogo();
				}

				else {

					testStepFailed("Blank Page is displayed in PGP");
					homePage.ClickonHomePageLogo();

				} 
			}
			
			

			for (int o = l; o <= m; o++) {
				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+o+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");
				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);


				testStepPassed("");
				testStepInfo("*********************************************************");
				testStepInfo("Start of "+DepartmentName+" Department");
				testStepInfo("*********************************************************");





				testStepInfo("");
				testStepInfo("Sub Categories in "+DepartmentName+" department");
				testStepInfo("***************************************************************************");



				/*List<WebElement> SubCatgLinkTitle= driver.findElements(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//span[contains(@class,'drop-down-title')]"));
				int SubCatgLinkTitleCount = SubCatgLinkTitle.size();

				for (int p = 0; p < SubCatgLinkTitleCount; p++) {
					String SubCatgLinkTitleName = driver.findElement(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//span[contains(@class,'drop-down-title')]")).getText();
					testStepPassed("SubCatgLinkTitleName : "+SubCatgLinkTitleName);
					System.out.println("SubCatgLinkTitleName : "+SubCatgLinkTitleName);
				}*/



				//List<WebElement> SubCatgLinkName= driver.findElements(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));
				List<WebElement> SubCatgLinkName= driver.findElements(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));
				int SubCatgLinkcount = SubCatgLinkName.size();
				//System.out.println("SubCatgLinkcount : "+SubCatgLinkcount);


				for (int a = 1; a <= SubCatgLinkcount; a++) {
					//String CatgName = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')])["+a+"]")).getAttribute("onclick");
					String CatgName = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')])["+a+"]")).getAttribute("onclick");
					String SubCategoryLinkName = CatgName.substring(CatgName.indexOf("- ")+2, CatgName.lastIndexOf("|")-6);
					//System.out.println("SubCategoryLinkName : "+SubCategoryLinkName);
					testStepInfo(""+a+". "+"SubCategoryName : "+SubCategoryLinkName);

					/*if (SubCategoryLinkName.contains("'")) {
						String FinalSubCategoryLinkName = SubCategoryLinkName.substring(0, SubCategoryLinkName.lastIndexOf("'"));
						testStepPassed("FinalSubCategoryLinkName : "+FinalSubCategoryLinkName);
					}*/

					String SubCategoryName = CheckSubCategoryName(SubCategoryLinkName);
					//testStepPassed("SubCategoryName after Edited : "+SubCategoryName);




					String DepartmentBreadCrumb = DepartmentName.toUpperCase();
					String SubCategoryBreadCrumb = SubCategoryName.toUpperCase();

					/*testStepPassed("DepartmentBreadCrumb : "+DepartmentBreadCrumb);
					testStepPassed("SubCategoryBreadCrumb : "+SubCategoryBreadCrumb);*/




					/*String FinalSubCategoryLinkName2 = CheckSubCategoryNameforapostrophe(FinalSubCategoryLinkName);
					testStepPassed("FinalSubCategoryLinkName2 : "+FinalSubCategoryLinkName2);*/

					//List<WebElement> SubCatgLinkTitle= driver.findElements(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategoryName+"')]"));
					List<WebElement> SubCatgLinkTitle= driver.findElements(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategoryName+"')]"));

					int SubCatgCount = SubCatgLinkTitle.size();

					testStepPassed("Subcategories Count : "+SubCatgCount);
					waitTime(1);
					if (SubCatgCount>1) 
					{

						for (int i = 1; i <= SubCatgCount; i++) 
						{

							//String  SubCatghref = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategoryName+"')])["+i+"]")).getAttribute("href");
							String  SubCatghref = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategoryName+"')])["+i+"]")).getAttribute("href");

							String SubCatghreftrimmed = StringUtils.substringAfterLast(SubCatghref, "/");

							String SubCatghrefFinal = StringUtils.substringAfterLast(SubCatghreftrimmed, "-");

							System.out.println(SubCatghrefFinal);
							//waitTime(1);
							mouseOver("'"+DepartmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+DepartmentName+"')]");
							waitTime(1);
							//WebElement SubcategoryLink = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//li[contains(@class,'list-column list-column')]//ul//li//a[contains(text(),'"+SubCategoryName+"')])["+i+"]"));
							WebElement SubcategoryLink = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategoryName+"')])["+i+"]"));

							SubcategoryLink.click();
							waitTime(2);

							/*continueShoppingPopupClose();
							verifyUSFlagSelected();*/
							if (productGridPage.checkProductGridPageisDisplayed()) 
							{
								//testStepPassed(driver.getCurrentUrl());

								productGridPage.verifyCorrespondingPGPisDisplayedWithSubCategoryBreadCrumbinPGPisdisplayed(DepartmentBreadCrumb, SubCategoryBreadCrumb);

								//productGridPage.verifyCertonaWidgetisDisplayedandGettheCertonaProductCountNamestinPGPPage();

								productGridPage.selectProductInProductGridPage();

								if (productDescriptionPage.verifyProductDisplayedinPDP()) {

									testStepPassed("PDP Page is displayed");

									//testStepPassed(driver.getCurrentUrl());
									homePage.ClickonHomePageLogo();

									//productDescriptionPage.verifyCorrespondingPDPisDisplayedWithSubCategoryBreadCrumbinPDPisdisplayed(DepartmentBreadCrumb, SubCategoryBreadCrumb);

								}
								else if (productGridPage.check404PageisDisplayed()) {

									testStepFailed("404 Page is displayed in PDP");
									homePage.ClickonHomePageLogo();

								}

								else {

									testStepFailed("Blank Page is displayed in PDP");
									homePage.ClickonHomePageLogo();

								}

							}

							else if (productGridPage.checkBannerPageDisplayed()) {

								testStepPassed("Banner Page is displayed");

								productGridPage.checkCorrespondingBannerPageDisplayed(SubCategoryName);
								homePage.ClickonHomePageLogo();
							}

							else if (giftCardsPage.checkGiftCardPageDisplayed()) 
							{
								testStepPassed("Gift Cards Page is displayed");
								homePage.ClickonHomePageLogo();
							}

							else if (productGridPage.check404PageisDisplayed()) {

								testStepFailed("404 Page is displayed in PGP");
								homePage.ClickonHomePageLogo();

							}


							else {

								testStepFailed("Blank Page is displayed in PGP");
								homePage.ClickonHomePageLogo();

							}

						}

					}

					else {

						departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink_new(DepartmentName, SubCategoryName);

						if (productGridPage.checkProductGridPageisDisplayed()) {
							testStepPassed("Product Grid Page is displayed");
							testStepPassed(driver.getCurrentUrl());

							//testStepPassed("Product Grid Page is displayed for "+DepartmentName+"."+SubCategoryName);
							//productGridPage.countofProductsinPGP();
							//productGridPage.verifyCertonaWidgetisDisplayedandGettheCertonaProductCountNamestinPGPPage();

							//productGridPage.verifyDepartmentBreadCrumbinPGPisdisplayed(DepartmentBreadCrumb, SubCategoryBreadCrumb);

							/*continueShoppingPopupClose();
							verifyUSFlagSelected();*/

							//productGridPage.verifyCorrespondingPGPisDisplayedWithSubCategoryBreadCrumbinPGPisdisplayed(DepartmentBreadCrumb, SubCategoryBreadCrumb);

							//productGridPage.selectProductInProductGridPage(retrieve("ProductName"));

							productGridPage.selectProductInProductGridPage();

							if (productDescriptionPage.verifyProductDisplayedinPDP()) {
								testStepPassed("PDP Page is displayed");
								homePage.ClickonHomePageLogo();
								//testStepPassed(driver.getCurrentUrl());

								//productDescriptionPage.verifyCorrespondingPDPisDisplayedWithSubCategoryBreadCrumbinPDPisdisplayed(DepartmentBreadCrumb, SubCategoryBreadCrumb);
							}
							else if (productDescriptionPage.verifyProductDisplayedinPreStyleLookPDP()) {
								testStepPassed("PDP Page is displayed");
								//homePage.ClickonHomePageLogo();

							}


							else if (productGridPage.check404PageisDisplayed()) {
								testStepFailed("404 Page is displayed in PDP");
								homePage.ClickonHomePageLogo();
							}


							else {
								testStepFailed("Blank Page is displayed in PDP");
								homePage.ClickonHomePageLogo();
							}

						}

						/*else if (productGridPage.checkGiftPageDisplayed()) {

							testStepPassed("Groomsman Gifts Page is displayed");

							//productGridPage.clickOnGotoMenswearhouseLinkinGiftsPage();

							switchToWindowUsingWindowHandle(parentWindow);
							homePage.ClickonHomePageLogo();
						}*/

						else if (productGridPage.checkBannerPageDisplayed()) {

							testStepPassed("Banner Page is displayed");

							productGridPage.checkCorrespondingBannerPageDisplayed(SubCategoryName);
							homePage.ClickonHomePageLogo();

						}	

						else if (productGridPage.checkGiftPageDisplayed()) {

							testStepPassed("Groomsman Gifts Page is displayed");

							//productGridPage.clickOnGotoMenswearhouseLinkinGiftsPage();

							switchToWindowUsingWindowHandle(parentWindow);
							homePage.ClickonHomePageLogo();
						}


						else if (giftCardsPage.checkGiftCardPageDisplayed()) 
						{
							testStepPassed("Gift Cards Page is displayed");
							homePage.ClickonHomePageLogo();
						}





						else if (productGridPage.check404PageisDisplayed()) {
							testStepFailed("404 Page is displayed in PGP");
							homePage.ClickonHomePageLogo();
						}


						else {
							testStepFailed("Blank Page is displayed in PGP");
							homePage.ClickonHomePageLogo();
						}

					}

				}

				testStepPassed("");
				testStepInfo("*********************************************************");
				testStepInfo("End of "+DepartmentName+" Department");
				testStepInfo("*********************************************************");

			}







































































































































			/*startFromDepartment = Integer.parseInt(retrieve("DepartmentFrom"))-1;
			endAtDepartment = Integer.parseInt(retrieve("DepartmentTo"))-1;
			//Open Site
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
			createObjects(browser);
			popupWindows.welcomesigninpopup();

			checkPromotionsSignupPopupisdisplayedandclosed();

			//Get all department links available			
			departmentMenu=departmentNavigation.getDepartmentList();
			if(departmentMenu.size()>0){
				for(int i=startFromDepartment;i<=endAtDepartment;i++){								
					testStepInfo("*****************************************************************");
					testStepInfo("****************("+(i+1)+")'"+departmentMenu.get(i)+"' Department****************");
					testStepInfo("*****************************************************************");
					//Get all sub category links
					promotionAndSubcategoryList=departmentNavigation.getAllLinkUnderDepartment(departmentMenu.get(i));				
					if(promotionAndSubcategoryList.size()>0){
						for(int j=0;j<promotionAndSubcategoryList.size();j++){
							testStepInfo("("+(j+1)+")'"+promotionAndSubcategoryList.get(j)+"' Subcategory");
							departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink(departmentMenu.get(i), promotionAndSubcategoryList.get(j));														
							if(productGridPage.isProductGridPageDisplayed()){												
								testStepPassed("Product Grid Page is Displayed");

								testStepInfo("Start of Certona Block");
								productGridPage.verifyCertonaWidgetisDisplayedandGettheCertonaProductCountNamestinPGPPage();
								testStepInfo("End of Certona Block");

								subCategoryName = promotionAndSubcategoryList.get(j).toLowerCase().trim();
								if(subCategoryName.equals("big & tall")) breadCrumb = getLastBeforeCurrentPageFromBreadCrumb().toLowerCase().trim();
								else breadCrumb = getCurrentPageFromBreadCrumb().toLowerCase().trim();
								if(productGridPage.isCorrespondingProductGridPageDisplayed(subCategoryName,breadCrumb)){								
									testStepPassed("Corresponding Product Grid Page is Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");	
									if(productGridPage.verifyProductsListedInProductGridPage()){										
										testStepPassed("Products are listed in Product Grid Page for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
										String productName=productGridPage.selectProductLinks();	
										if(productDescriptionPage.isProductDescriptionDisplayed()){
											testStepPassed("Product Description Page is Displayed");
											if(productName.trim().equalsIgnoreCase(productDescriptionPage.getProductNameInProductDescriptionPage().trim())) testStepPassed("Corresponding Product Description Page is Displayed for the product: "+productName);
											else testStepFailed("Butt!!! Corresponding Product Description Page is not Displayed for the product: "+productName);
										}else if(productBundlePage.isProductBundlePageDisplayed()){
											testStepPassed("Bundle product Page is Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");													
											if(productName.trim().equalsIgnoreCase(productBundlePage.getProductNameInProductBundlePage().trim())) testStepPassed("Corresponding Product Bundle Page is Displayed for the product: "+productName);
											else testStepFailed("Butt!!! Corresponding Product Bundle Page is not Displayed for the product: "+productName);
										}else testStepFailed("Neither PDP nor BDP is displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
									}else testStepFailed("Products are not listed in Product Grid Page for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
								}else testStepFailed("But!!! Corresponding Product Grid Page is not Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
							}else if(productGridPage.isSubCategoryBannerPageDisplayed()){
								testStepPassed("Subcategory Banner Page is Displayed");
								if(productGridPage.isSubCategoryBannerPageDisplayed(promotionAndSubcategoryList.get(j))){
									testStepPassed("Corresponding Subcategory Banner Page is Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
									if(promotionAndSubcategoryList.get(j).equalsIgnoreCase("AWEARNESS Kenneth Cole")){
										if(productGridPage.isLinksDisplayedInSubCategoryBannerPage()){
											String subCategoryBannerPageLink=productGridPage.clickOnAnyLinkInSubCategoryBannerPage();
											if(productGridPage.isCorrespondingProductGridPageDisplayed(subCategoryBannerPageLink,getCurrentPageFromBreadCrumb().toLowerCase().trim())){
												testStepPassed("Corresponding Product Grid Page is Displayed for '"+subCategoryBannerPageLink+"' Subcategory");
												if(productGridPage.verifyProductsListedInProductGridPage()){										
													testStepPassed("Products are listed in Product Grid Page for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
													String productName=productGridPage.selectProductLinks();	
													if(productDescriptionPage.isProductDescriptionDisplayed()){
														testStepPassed("Product Description Page is Displayed");
														if(productName.trim().equalsIgnoreCase(productDescriptionPage.getProductNameInProductDescriptionPage().trim())) testStepPassed("Corresponding Product Description Page is Displayed for the product: "+productName);
														else testStepFailed("Butt!!! Corresponding Product Description Page is not Displayed for the product: "+productName);
													}else if(productBundlePage.isProductBundlePageDisplayed()) testStepPassed("Bundle product Page is Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");													
													else testStepFailed("In Product Grid Page no products are displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
												}else testStepFailed("Products are not listed in Product Grid Page for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");	
											}else testStepFailed("But!!! Corresponding Product Grid Page is not Displayed for '"+subCategoryBannerPageLink+"' Subcategory");												
										}else testStepFailed("There is no link to click in "+promotionAndSubcategoryList.get(j)+" Sub Category Banner Page");
									}else if(promotionAndSubcategoryList.get(j).equalsIgnoreCase("Custom Suits, Blazers & Dress Shirts")) testStepInfo("'"+promotionAndSubcategoryList.get(j)+"' Subcategory will navigate to Find Store Page so terminating the flow.");
								}else testStepFailed("Corresponding Subcategory Banner Page is not Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
							}else if(promotionAndSubcategoryList.get(j).equalsIgnoreCase("Groomsmen Gifts")){
								if(productGridPage.isGroomsmenGiftsPageDisplayed()){
									testStepPassed("Corresponding Groomsmen Gifts Website is Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");									
									navigateTo("http://www.menswearhouse.com/");
									popupWindows.welcomesigninpopup();
								}else{
									testStepFailed("Corresponding Groomsmen Gifts Website is not Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
									navigateTo("http://www.menswearhouse.com/");
								}
							}else testStepFailed("Neither Product Grid Page nor Subcategory Banner Page is Displayed for '"+promotionAndSubcategoryList.get(j)+"' Subcategory");
							testStepInfo("-----------------------------");
						}			
					}else testStepFailed("Subcategory links are not available for '"+departmentMenu.get(i)+"' department");						
					testStepInfo("---------------End of '"+departmentMenu.get(i)+"' department----------------");						
				}
			}else testStepFailed("Department Links are not available");*/
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			testStepFailed(e.toString());
		}
		
		
		finally
		{
			testStepInfo("");
			testStepInfo("*******************************");
			testStepInfo("Test Execution Completed");
			testStepInfo("*******************************");
		
			if(departmentNavigation.testCaseExecutionStatus || popupWindows.testCaseExecutionStatus || productGridPage.testCaseExecutionStatus || productDescriptionPage.testCaseExecutionStatus || productBundlePage.testCaseExecutionStatus|| homePage.testCaseExecutionStatus)
			{
				this.testCaseExecutionStatus=true;
			}
			
			driver.quit();
			
			destroyObjects();
		}
		
		testStepInfo("");
		testStepInfo("*******************************");
		testStepInfo("Test Execution Completed");
		testStepInfo("*******************************");
	}
}