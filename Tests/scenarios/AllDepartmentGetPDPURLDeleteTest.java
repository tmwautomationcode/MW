package scenarios;

import java.io.File;

import baseClass.BaseClass;
import baseClass.PopupWindows;


public class AllDepartmentGetPDPURLDeleteTest extends PopupWindows 
{
	private BaseClass obj;
	private PopupWindows popupWindows;

	public AllDepartmentGetPDPURLDeleteTest(BaseClass obj) 
	{
		super(obj);
		this.obj=obj;
	}


	public void createObjects(String browser)
	{
		obj.driver=driver;
		obj.currentBrowser=browser;
		popupWindows=new PopupWindows(obj);
	}


	public void destroyObjects()
	{
		popupWindows=null;
	}


	public void AllDepartmentGetPDPURLDeleteTestScenario(String machineName,String host,String port,String browser,String os,String browserVersion,String osVersion, String tcId)
	{
		try
		{
			openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);

			createObjects(browser);
			
			String projectDirectory = System.getProperty("user.dir");

			String filePath = projectDirectory+"\\DepartmentPDPUrl\\AllDepartmentPDPUrlReport.xls";
			
			File file1 = new File(filePath);

			if (file1.delete()) 
			{
				testStepPassed("File Deleted");
			} 
			else 
			{
				testStepFailed("File not Deleted");
			}

			testStepPassed("");
			testStepInfo("*********************************************************");
			testStepInfo("Execution Completed");
			testStepInfo("*********************************************************");

		}
		catch(Exception e)
		{
			testStepFailed("Failure Description: " +e);
		}

		finally
		{
			if(popupWindows.testCaseExecutionStatus)
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