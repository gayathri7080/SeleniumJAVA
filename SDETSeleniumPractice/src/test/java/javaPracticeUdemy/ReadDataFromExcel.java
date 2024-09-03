package javaPracticeUdemy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\result1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println("no. of rows are "  + totalRows); //3
		System.out.println("no. of columns are " + totalCells); //3
		for (int r = 0; r <=totalRows; r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			for (int c = 0; c <totalCells; c++)
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString() +"\t");
			}
			System.out.println();	
		}
		
	     // Get the second row (index 1) and the first cell (index 0)
        XSSFRow row = sheet.getRow(2);
        XSSFCell cell = row.getCell(1);

        // Get the value from the cell
        String cellValue = cell.getStringCellValue();
        System.out.println("The value of the 2nd row 2nd cell is: " + cellValue);

	}

}
