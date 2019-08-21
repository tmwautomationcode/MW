package baseClass;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelHandling extends FooterLinks {

	public ExcelHandling(BaseClass obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}





	private static FileInputStream inputDocument;
	private static FileOutputStream outputDocument;
	private static HSSFWorkbook workBook;
	//private static HSSFSheet sheet;
	
	public  void CopyExcelTemplate() throws IOException
	{
		inputDocument = new FileInputStream(new File("./GuidedShoppingResultTemplate/GuidedShoppingTemplate.xls"));
		workBook = new HSSFWorkbook(inputDocument);
		inputDocument.close();
		outputDocument = new FileOutputStream(new File(outputDirectory+"//GuidedShoppingReport.xls"));
		workBook.write(outputDocument);
		outputDocument.close();
	}
	
	public void CreateRowandEnterValues(String Category, String Formal, String Fit, String Color, String Price, String URL, String Result) throws IOException
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

	
}