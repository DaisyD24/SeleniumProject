package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException   {

		// Open/Enter the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
						
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		//Get row
		XSSFRow row = sheet.getRow(4);
					
		//Get column
		XSSFCell cell = row.getCell(1);
		
		//Action- Read/print particular CellValue from excelSheet
		String Svalue = cell.getStringCellValue();
		System.out.println(Svalue);
}
}