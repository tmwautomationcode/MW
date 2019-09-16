package scenarios;

import mwPages.DepartmentNavigation;
import mwPages.ProductGridPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import mwPages.HomePage;
import mwPages.ProductBundlePage;
import mwPages.ProductDescriptionPage;
import mwPages.GiftCardsPage;



public class AllDepartmentPDPVerificationTest extends PopupWindows 
{
	private BaseClass obj;
	private HomePage homePage;
	private DepartmentNavigation departmentNavigation;
	private ProductGridPage productGridPage;
	private PopupWindows popupWindows;
	private ProductDescriptionPage productDescriptionPage;
	private ProductBundlePage productBundlePage;
	private GiftCardsPage giftCardsPage;


	public AllDepartmentPDPVerificationTest(BaseClass obj) 
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




	public void AllDepartmentPDPVerificationTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId)
	{
		try
		{
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);

			createObjects(browser);

			selectUSFlag();

			homePage.ClickonHomePageLogo();

			String projectDirectory = System.getProperty("user.dir");

			String filePath = projectDirectory+"\\DepartmentPDPUrl\\AllDepartmentPDPUrlReport.xls";

			System.out.println("Filepath : "+filePath);

			testStepInfo("Filepath : "+filePath);

			FileInputStream fis = new FileInputStream(filePath);

			Workbook wb = Workbook.getWorkbook(fis);

			Sheet sh = wb.getSheet(0);

			int rowsCount=sh.getRows();
			
			//homePage.submitFeedbackForm("Make a purchase", "Navigation");

			//System.out.println("Total No of rows : "+rowsCount);

			testStepInfo("Total No of rows in PDP Url Excel : "+rowsCount);

			for(int row=2; row <sh.getRows();row++)
			{
				String department = sh.getCell(1, row).getContents();

				String subCategory= sh.getCell(2, row).getContents();

				String productNo= sh.getCell(3, row).getContents();

				int productIntNo = Integer.parseInt(productNo);

				String productName= sh.getCell(4, row).getContents();

				String productUrl= sh.getCell(5, row).getContents();

				String result;

				testStepInfo("");
				testStepInfo("No : "+row);
				testStepInfo("Department Name : "+department);
				testStepInfo("Sub Category : "+subCategory);
				testStepInfo("Product No : "+productNo);
				testStepInfo("Product Name : "+productName);
				testStepInfo("Product Url : "+productUrl);

				driver.get(productUrl);

				waitTime(3);

				if (productDescriptionPage.verifyProductDisplayedinPDP()) 
				{
					testStepPassed("PDP Page is displayed");

					result = "PDP Page is displayed";

					CreateNewRowandEnterValuesAllDepartmentsPDPVerificationResult(department, subCategory, productIntNo, productName, productUrl, result);
				}

				else if (productGridPage.check404PageisDisplayed()) 
				{
					testStepFailed("404 Page is displayed in PDP");

					result = "404 Page is displayed";

					CreateNewRowandEnterValuesAllDepartmentsPDPVerificationResult(department, subCategory, productIntNo, productName, productUrl, result);
				}

				else 
				{
					testStepFailed("Blank Page is displayed in PDP");

					result = "Blank Page is displayed";

					CreateNewRowandEnterValuesAllDepartmentsPDPVerificationResult(department, subCategory, productIntNo, productName, productUrl, result);
				}
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