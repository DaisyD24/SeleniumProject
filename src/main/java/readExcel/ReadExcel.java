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
		XSSFSheet sheet = wb.getSheet("sheet2");
		//Get Row Count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Get Column Count
	int	columnCount = sheet.getRow(0).getLastCellNum();
	System.out.println(columnCount);
	for (int i = 1; i <= rowCount; i++) {
		
		
			//Get row
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {	
			//Get column
			XSSFCell cell = row.getCell(j);
			//Action- Read/print particular CellValue from excelSheet
			String Svalue = cell.getStringCellValue();
			System.out.println(Svalue);
		}//ends Column Loop
		}//ends Row Loop
}
}