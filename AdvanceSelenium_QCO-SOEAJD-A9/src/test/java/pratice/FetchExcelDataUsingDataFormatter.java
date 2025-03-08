package pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcelDataUsingDataFormatter {

	public static void main(String[] args) throws Throwable {

		// step1:- connecting the excel file
		FileInputStream file = new FileInputStream("./src/test/resources/ExcelData3.xlsx");

		// step2:- keep excel in read mode
		Workbook book = WorkbookFactory.create(file);

		// step3:- navigate into excel sheet
		Sheet sheet = book.getSheet("Sheet1");

		// step4:- navigate into row
		Row row = sheet.getRow(2);

		// step5:-navigate into cell
		Cell cell = row.getCell(0);

		DataFormatter format = new DataFormatter();
		String excelData = format.formatCellValue(cell);
		
		System.out.println(excelData);
	}

}
