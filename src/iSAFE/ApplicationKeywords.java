package iSAFE;


import baseClass.BaseClass;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.Workbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

/*import jxl.Cell;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import java.io.FileNotFoundException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/


import AutomationFramework.APIKeywords;
public class ApplicationKeywords extends APIKeywords
{



	public ApplicationKeywords(BaseClass obj) {
		
		super(obj);
	}
	public ApplicationKeywords()
	{

	}

	public  void siteLogin(){
		typeIn(GOR.txt_login_Username,"indium");
		typeIn(GOR.txt_login_Password,"indium");
		clickOn(GOR.btn_login_signIn);
		waitForElement(GOR.rdo_reservatinDetails_oneWayTrip);
	}

	
	public  void CreateExcel() throws IOException
	{
		WritableWorkbook workbook = Workbook.createWorkbook(new File(outputDirectory+"//GuidedShoppingReport.xls"));
		WritableSheet sheet = workbook.createSheet("Report", 0);
		System.out.println(sheet);
	}
	
	/*private static HSSFSheet sheet;
	public  void OpenExcelforGuidedShopping() throws IOException
	{
		inputDocument = new FileInputStream(new File(outputDirectory+"//GuidedShoppingReport.xls"));
		workBook = new HSSFWorkbook(inputDocument);
		sheet = workBook.getSheetAt(0);
	}*/

	
	private static FileInputStream inputDocument;
	private static FileOutputStream outputDocument;
	private static HSSFWorkbook workBook;
	
	
	public  void CopyExcelTemplateGuidedShopping() throws IOException
	{
		inputDocument = new FileInputStream(new File("./GuidedShoppingResultTemplate/GuidedShoppingTemplate.xls"));
		workBook = new HSSFWorkbook(inputDocument);
		inputDocument.close();
		outputDocument = new FileOutputStream(new File(outputDirectory+"//GuidedShoppingReport.xls"));
		workBook.write(outputDocument);
		outputDocument.close();
	}
	
	public  void CopyExcelTemplateTaxValidation() throws IOException
	{
		inputDocument = new FileInputStream(new File("./TaxValidationTemplate/TaxValidationTemplate.xls"));
		workBook = new HSSFWorkbook(inputDocument);
		inputDocument.close();
		outputDocument = new FileOutputStream(new File(outputDirectory+"//TaxValidationReport.xls"));
		workBook.write(outputDocument);
		outputDocument.close();
	}
	
	public  void CopyExcelTemplateAllDepartmentPDPVerfication() throws IOException
	{
		inputDocument = new FileInputStream(new File("./AllDepartmentPDPVerificationResultTemplate/AllDepartmentPDPVerificationResultTemplate.xls"));
		workBook = new HSSFWorkbook(inputDocument);
		inputDocument.close();
		outputDocument = new FileOutputStream(new File(outputDirectory+"//AllDepartmentPDPVerificationReport.xls"));
		workBook.write(outputDocument);
		outputDocument.close();
	}
	
	
	public  void CopyExcelTemplateAllDepartmentPDPVerfication2() throws IOException
	{
		inputDocument = new FileInputStream(new File("./AllDepartmentPDPVerificationResultTemplate/AllDepartmentPDPVerificationResultTemplate.xls"));
		workBook = new HSSFWorkbook(inputDocument);
		inputDocument.close();
		outputDocument = new FileOutputStream(new File("./DepartmentPDPUrl/AllDepartmentPDPUrlReport.xls"));
		workBook.write(outputDocument);
		outputDocument.close();
	}
	
	
	public  void CopyExcelTemplateAllDepartmentPDPVerfication3() throws IOException
	{
		inputDocument = new FileInputStream(new File("./AllDepartmentPDPVerificationResultTemplate/AllDepartmentPDPVerificationResultTemplate.xls"));
		workBook = new HSSFWorkbook(inputDocument);
		inputDocument.close();
		outputDocument = new FileOutputStream(new File(outputDirectory+"//AllDepartmentPDPVerificationReport.xls"));
		workBook.write(outputDocument);
		outputDocument.close();
	}
	
	
	
	
	
	
	
	
	
	public void CreateNewRowandEnterValuesGuidedShopping(String Category, String Formal, String Fit, String Color, String Price, String URL, String Result) throws IOException
	{
		FileInputStream fis = new FileInputStream(outputDirectory+"//GuidedShoppingReport.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheetAt(0);
        int LastRow = sheet.getLastRowNum();
        int NewRow = LastRow+1;
        System.out.println("Last Row : "+LastRow);
        System.out.println("New Row : "+NewRow);
        HSSFRow row = sheet.createRow(NewRow);
        row.createCell(1).setCellValue(Category);
        row.createCell(2).setCellValue(Formal);
        row.createCell(3).setCellValue(Fit);
        row.createCell(4).setCellValue(Color);
        row.createCell(5).setCellValue(Price);
        row.createCell(6).setCellValue(URL);
        row.createCell(7).setCellValue(Result);
        File file = new File(outputDirectory+"//GuidedShoppingReport.xls");
        workbook.write(file);
		workbook.close();
	}
	
	
	
	public boolean isElementPresent(String objectPath, int timeOut)  
	 {  
	  driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);  
	  try  
	  {  
	   driver.findElement(By.xpath(objectPath));  
	   return true;  
	  }  
	  catch(NoSuchElementException e)  
	  {  
	   ApplicationKeywords.writeToLogFile("INFO", e.toString());
	   return false;  
	  }
	  finally {
	   driver.manage().timeouts().implicitlyWait(elementLoadWaitTime, TimeUnit.SECONDS);
	  }
	 }
	
	
	public void CreateNewRowandEnterValuesTaxValidation(String Scenario, String Address, String City, String State, String Zip, String SkuID, String OrderNumber, String SubTotal, String TaxCalculatedintheSite, String TaxRates, String TaxCalculatedManually) throws IOException
	{
		FileInputStream fis = new FileInputStream(outputDirectory+"//TaxValidationTemplate.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheetAt(0);
        int LastRow = sheet.getLastRowNum();
        int NewRow = LastRow+1;
        System.out.println("Last Row : "+LastRow);
        System.out.println("New Row : "+NewRow);
        HSSFRow row = sheet.createRow(NewRow);
        row.createCell(1).setCellValue(Scenario);
        row.createCell(2).setCellValue(Address);
        row.createCell(3).setCellValue(City);
        row.createCell(4).setCellValue(State);
        row.createCell(5).setCellValue(Zip);
        row.createCell(6).setCellValue(SkuID);
        row.createCell(7).setCellValue(OrderNumber);
        row.createCell(8).setCellValue(SubTotal);
        row.createCell(9).setCellValue(TaxCalculatedintheSite);
        row.createCell(10).setCellValue(TaxRates);
        row.createCell(11).setCellValue(TaxCalculatedManually);

        File file = new File(outputDirectory+"//TaxValidationTemplate.xls");
        workbook.write(file);
		workbook.close();
	}
	
	
	public void CreateNewRowandEnterValuesAllDepartmentsPDPVerification(String Department, String SubCategory, int ProductNo, String ProductName, String ProductURL) throws IOException
	{
		FileInputStream fis = new FileInputStream(outputDirectory+"//AllDepartmentPDPVerificationReport.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);
		int LastRow = sheet.getLastRowNum();
		int NewRow = LastRow+1;
		HSSFRow row = sheet.createRow(NewRow);
		row.createCell(1).setCellValue(Department);
		row.createCell(2).setCellValue(SubCategory);
		row.createCell(3).setCellValue(ProductNo);
		row.createCell(4).setCellValue(ProductName);
		row.createCell(5).setCellValue(ProductURL);
		//row.createCell(6).setCellValue(Result);
		File file = new File(outputDirectory+"//AllDepartmentPDPVerificationReport.xls");
		workbook.write(file);
		workbook.close();
	}
	
	
	
	public void CreateNewRowandEnterValuesAllDepartmentsPDPVerification2(String Department, String SubCategory, int ProductNo, String ProductName, String ProductURL) throws IOException
	{
		FileInputStream fis = new FileInputStream("./DepartmentPDPUrl/AllDepartmentPDPUrlReport.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);
		int LastRow = sheet.getLastRowNum();
		int NewRow = LastRow+1;
		HSSFRow row = sheet.createRow(NewRow);
		row.createCell(1).setCellValue(Department);
		row.createCell(2).setCellValue(SubCategory);
		row.createCell(3).setCellValue(ProductNo);
		row.createCell(4).setCellValue(ProductName);
		row.createCell(5).setCellValue(ProductURL);
		//row.createCell(6).setCellValue(Result);
		File file = new File("./DepartmentPDPUrl/AllDepartmentPDPUrlReport.xls");
		workbook.write(file);
		workbook.close();
	}

	
	
	public void CreateNewRowandEnterValuesAllDepartmentsPDPVerificationResult(String department, String subCategory, int productNo, String productName, String productURL, String result) throws IOException
	{
		FileInputStream fis = new FileInputStream(outputDirectory+"//AllDepartmentPDPVerificationReport.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);
		int LastRow = sheet.getLastRowNum();
		int NewRow = LastRow+1;
		HSSFRow row = sheet.createRow(NewRow);
		row.createCell(1).setCellValue(department);
		row.createCell(2).setCellValue(subCategory);
		row.createCell(3).setCellValue(productNo);
		row.createCell(4).setCellValue(productName);
		row.createCell(5).setCellValue(productURL);
		row.createCell(6).setCellValue(result);
		File file = new File(outputDirectory+"//AllDepartmentPDPVerificationReport.xls");
		workbook.write(file);
		workbook.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}