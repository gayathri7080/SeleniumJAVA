package javaPracticeUdemy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataintoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\MyExcelFileDynamicData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter no. of Cells");
		int noOfCells = sc.nextInt();
		
		for (int r = 0; r <=noOfRows ; r++) 
		{
			XSSFRow currentRow = sheet.createRow(r);
			for (int c = 0; c <= noOfCells; c++) 
			{
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		System.out.println("file created");
		workbook.write(file);
		
	
	}

}
