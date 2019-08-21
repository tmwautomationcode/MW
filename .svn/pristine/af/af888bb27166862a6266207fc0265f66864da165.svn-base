package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

import java.io.File;
import java.io.FileInputStream;
// java.io.FileNotFoundException;
import java.io.FileOutputStream;
/*import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
*/import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandling extends PopupWindows {

	public ExcelHandling(BaseClass obj) {
		super(obj);
	}





	String defaultCurrency;
	
	public static final String lnk_Header_ContactUs_MouseOver_new = "Header Contact Us Mouse Over Link#xpath=//div[contains(@class,'header-user-bar')]//li[contains(@id,'header-account-section')]//a[contains(@class,'need-help-title')]";

	

	

	public void writetoExcel()
	{
		try
		{
			
			FileInputStream fis=new FileInputStream(new File("D:\testdata.xls"));
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Input");
			Row row=sh.getRow(8);
			Cell cell=row.createCell(1);
			//cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue("Selenium");
			FileOutputStream fos=new FileOutputStream("./data/data.xls");
			wb.write(fos);
			fos.close();
			System.out.println("Excel File Written");
			
		}
		
		catch(Exception e)
		{
			
			
			
		}
	}

	
	
	
	
	
	
	
}