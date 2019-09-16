package scenarios;

import mwPages.DepartmentNavigation;
import mwPages.ProductGridPage;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import mwPages.HomePage;
import mwPages.ProductBundlePage;
import mwPages.ProductDescriptionPage;
import mwPages.GiftCardsPage;


public class AllDepartmentGetPDPURLTest extends PopupWindows 
{
	private BaseClass obj;
	private HomePage homePage;
	private DepartmentNavigation departmentNavigation;
	private ProductGridPage productGridPage;
	private PopupWindows popupWindows;
	private ProductDescriptionPage productDescriptionPage;
	private ProductBundlePage productBundlePage;
	private GiftCardsPage giftCardsPage;


	public AllDepartmentGetPDPURLTest(BaseClass obj) 
	{
		super(obj);
		this.obj=obj;
	}


	public void createObjects(String browser)
	{
		obj.driver=driver;
		obj.currentBrowser=browser;
		departmentNavigation = new DepartmentNavigation(obj);
		productGridPage = new ProductGridPage(obj);
		homePage= new HomePage(obj);
		popupWindows=new PopupWindows(obj);
		productDescriptionPage = new ProductDescriptionPage(obj);
		productBundlePage = new ProductBundlePage(obj);
		giftCardsPage = new GiftCardsPage(obj);
		homePage= new HomePage(obj);
	}


	public void destroyObjects()
	{
		departmentNavigation = null;
		popupWindows=null;
		productGridPage = null;
		productDescriptionPage = null;
		productBundlePage = null;
		giftCardsPage = null;
		homePage= null;
	}


	private String parentWindow;
	String currentWindow;
	int startFromDepartment = 0; 
	int endAtDepartment = 0;




	public void AllDepartmentGetPDPURLTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId)
	{
		try
		{
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);

			createObjects(browser);
			
			selectUSFlag();
			
			homePage.ClickonHomePageLogo();

			//parentWindow=driver.getWindowHandle();

			currentWindow=driver.getWindowHandle();

			String StartDept = retrieve("StartDepartment");

			String EndDept = retrieve("EndDepartment");

			int StartDepartment = Integer.parseInt(StartDept);

			int EndDepartment = Integer.parseInt(EndDept);

			int l = StartDepartment;

			int m = EndDepartment;

			String DepartName = null;
			
			homePage.submitFeedbackForm("Make a purchase", "Navigation");

			/*verifyUSFlagSelected();

			waitTime(2);

			clickOnBackToTopLinkInFooter();*/

			List<WebElement> Departments = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]"));

			int DepartmentsCount = Departments.size();

			testStepPassed("");
			testStepInfo("Total Departments");
			testStepInfo("**********************");
			testStepPassed("Total Departments : "+DepartmentsCount);


			testStepPassed("");
			testStepInfo("Departments Name");
			testStepInfo("************************");

			for (int i = 0; i < DepartmentsCount; i++) 
			{
				int j = i+1;

				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+j+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");

				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);

				testStepPassed(""+j+". "+DepartmentName);
			}


			testStepPassed("");
			testStepInfo("Sub Categories Links Count in every Department");
			testStepInfo("*********************************************************");

			for (int k = 1; k <= DepartmentsCount; k++) 
			{
				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+k+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");

				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);

				List<WebElement> SubCategoriesLinks = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+k+"]//ul[contains(@class,'drop-down-list')]//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));

				int SubCategoryLinksCount = SubCategoriesLinks.size();

				testStepPassed(""+k+". "+"SubCategories Count in "+DepartmentName+" : "+SubCategoryLinksCount);
			}


			testStepPassed("");
			testStepInfo("Total Sub Categories Links Count in all Departments");
			testStepInfo("*************************************************************");

			List<WebElement> SubCategoryLinks = driver.findElements(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]//ul[contains(@class,'drop-down-list')]//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));

			int SubCategoriesCount = SubCategoryLinks.size();

			testStepPassed("Total Sub Categories Links Count : "+SubCategoriesCount);


			
			
			
			
			//homePage.submitFeedbackForm("Make a purchase", "Navigation");
			
			
			
			
			
			
			
			testStepPassed("");
			testStepInfo("Departments going to be Executed");
			testStepInfo("*****************************************");

			int q=1;

			for (int n = l; n <= m; n++) 
			{
				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+n+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");

				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);

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

				if (productGridPage.checkProductGridPageisDisplayed()) 
				{
					testStepPassed(DepartmentName+" PGP is displayed");

					productGridPage.verifyCorrespondingPGPisDisplayedWithDepartmentBreadCrumbinPGPisdisplayed(DepartmentBreadCrumb);

					homePage.ClickonHomePageLogo();
				}

				else if (productGridPage.check404PageisDisplayed()) 
				{
					testStepFailed("404 Page is displayed in PGP");

					homePage.ClickonHomePageLogo();
				}

				else if (productGridPage.checkBannerPageDisplayed()) 
				{
					testStepPassed(DepartmentName+" Banner Page is displayed");

					productGridPage.checkCorrespondingBannerPageDisplayed(DepartmentName);

					homePage.ClickonHomePageLogo();
				}

				else 
				{
					testStepFailed("Blank Page is displayed in PGP");

					homePage.ClickonHomePageLogo();
				} 
			}


			for (int o = l; o <= m; o++) 
			{
				String Dept = driver.findElement(By.xpath("//body[contains(@id,'mw')]//ul[contains(@id,'mw-topnav-menu')]//li[contains(@id,'top-menu')]["+o+"]//a[contains(@id,'TopCategoryLink')]")).getAttribute("onclick");

				String DepartmentName = Dept.substring(Dept.indexOf(": ")+2, Dept.lastIndexOf("|")-6);

				testStepPassed("");
				testStepInfo("*********************************************************");
				testStepInfo("Start of "+DepartmentName+" Department");
				testStepInfo("*********************************************************");


				testStepInfo("");
				testStepInfo("Sub Categories in "+DepartmentName+" department");
				testStepInfo("***************************************************************************");

				List<WebElement> SubCatgLinkName= driver.findElements(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')]"));

				int SubCatgLinkcount = SubCatgLinkName.size();

				for (int a = 1; a <= SubCatgLinkcount; a++) 
				{
					String CatgName = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(@id,'nextSubCategoryLink') or contains(@id,'promoNextSubItemLink')])["+a+"]")).getAttribute("onclick");

					String SubCategoryLinkName = CatgName.substring(CatgName.indexOf("- ")+2, CatgName.lastIndexOf("|")-6);

					testStepInfo(""+a+". "+"SubCategoryName : "+SubCategoryLinkName);

					String SubCategoryName = CheckSubCategoryName(SubCategoryLinkName);

					String DepartmentBreadCrumb = DepartmentName.toUpperCase();

					String SubCategoryBreadCrumb = SubCategoryName.toUpperCase();

					List<WebElement> SubCatgLinkTitle= driver.findElements(By.xpath("//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategoryName+"')]"));

					int SubCatgCount = SubCatgLinkTitle.size();

					testStepPassed("Subcategories Count : "+SubCatgCount);

					waitTime(1);

					if (SubCatgCount>1) 
					{
						for (int i = 1; i <= SubCatgCount; i++) 
						{
							String  SubCatghref = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategoryName+"')])["+i+"]")).getAttribute("href");

							String SubCatghreftrimmed = StringUtils.substringAfterLast(SubCatghref, "/");

							String SubCatghrefFinal = StringUtils.substringAfterLast(SubCatghreftrimmed, "-");

							mouseOver("'"+DepartmentName+"' department#xpath=//a[contains(@id,'TopCategoryLink') and contains(text(),'"+DepartmentName+"')]");

							waitTime(1);

							WebElement SubcategoryLink = driver.findElement(By.xpath("(//li[contains(@id,'top-menu')]//a[contains(text(),'"+DepartmentName+"')]/following-sibling::div//ul//ul//li//a[contains(text(),'"+SubCategoryName+"')])["+i+"]"));

							SubcategoryLink.click();

							waitTime(2);

							if (productGridPage.checkProductGridPageisDisplayed()) 
							{
								List<WebElement> productsListinPGP = driver.findElements(By.xpath("//a[contains(@class,'js-editable-link product-name')]"));

								int productsListinPGPCount = productsListinPGP.size();

								testStepPassed("Products Count in PGP : "+productsListinPGPCount);

								for (int j = 1; j <= productsListinPGPCount; j++) 
								{
									String productName = driver.findElement(By.xpath("(//a[contains(@class,'js-editable-link product-name')])["+j+"]")).getText();

									String productURL = driver.findElement(By.xpath("(//a[contains(@class,'js-editable-link product-name')])["+j+"]")).getAttribute("href");

									testStepPassed("");
									testStepPassed("Product No : "+j);
									testStepPassed("Product Name : "+productName);
									testStepPassed("Product PDP URL : "+productURL);
									testStepPassed("");

									CreateNewRowandEnterValuesAllDepartmentsPDPVerification2(DepartmentName, SubCategoryName, j, productName, productURL);
								}
							}

							else if (productGridPage.checkBannerPageDisplayed()) 
							{
								testStepPassed("Banner Page is displayed");

								productGridPage.checkCorrespondingBannerPageDisplayed(SubCategoryName);

								homePage.ClickonHomePageLogo();
							}

							else if (giftCardsPage.checkGiftCardPageDisplayed()) 
							{
								testStepPassed("Gift Cards Page is displayed");

								homePage.ClickonHomePageLogo();
							}

							else if (productGridPage.check404PageisDisplayed()) 
							{
								testStepFailed("404 Page is displayed in PGP");

								homePage.ClickonHomePageLogo();
							}

							else 
							{
								testStepFailed("Blank Page is displayed in PGP");

								homePage.ClickonHomePageLogo();
							}
						}
					}

					else 
					{
						departmentNavigation.clickOnDepartmentSubCategoryOrPromoLink_new(DepartmentName, SubCategoryName);

						if (productGridPage.checkProductGridPageisDisplayed()) 
						{
							List<WebElement> productsListinPGP = driver.findElements(By.xpath("//a[contains(@class,'js-editable-link product-name')]"));

							int productsListinPGPCount = productsListinPGP.size();

							testStepPassed("Products Count in PGP : "+productsListinPGPCount);

							for (int j = 1; j <= productsListinPGPCount; j++) 
							{
								String productName = driver.findElement(By.xpath("(//a[contains(@class,'js-editable-link product-name')])["+j+"]")).getText();

								String productURL = driver.findElement(By.xpath("(//a[contains(@class,'js-editable-link product-name')])["+j+"]")).getAttribute("href");

								testStepPassed("");
								testStepPassed("Product No : "+j);
								testStepPassed("Product Name : "+productName);
								testStepPassed("Product PDP URL : "+productURL);
								testStepPassed("");

								CreateNewRowandEnterValuesAllDepartmentsPDPVerification2(DepartmentName, SubCategoryName, j, productName, productURL);
							}
						}

						else if (productGridPage.checkBannerPageDisplayed()) 
						{
							testStepPassed("Banner Page is displayed");

							productGridPage.checkCorrespondingBannerPageDisplayed(SubCategoryName);

							homePage.ClickonHomePageLogo();
						}	

						else if (productGridPage.checkGiftPageDisplayed()) 
						{
							testStepPassed("Groomsman Gifts Page is displayed");

							switchToWindowUsingWindowHandle(parentWindow);

							homePage.ClickonHomePageLogo();
						}

						else if (giftCardsPage.checkGiftCardPageDisplayed()) 
						{
							testStepPassed("Gift Cards Page is displayed");

							homePage.ClickonHomePageLogo();
						}

						else if (productGridPage.check404PageisDisplayed()) 
						{
							testStepFailed("404 Page is displayed in PGP");

							homePage.ClickonHomePageLogo();
						}

						else 
						{
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
		}
		catch(Exception e)
		{
			testStepFailed("Failure Description: " +e);
		}

		finally
		{
			if(departmentNavigation.testCaseExecutionStatus ||
					popupWindows.testCaseExecutionStatus ||
					productGridPage.testCaseExecutionStatus ||
					productDescriptionPage.testCaseExecutionStatus ||
					productBundlePage.testCaseExecutionStatus||
					homePage.testCaseExecutionStatus)
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