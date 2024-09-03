package javaPracticeUdemy;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritindDataintoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\MyExcelFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Java1");
		row2.createCell(1).setCellValue(191);
		row2.createCell(2).setCellValue("Automation1");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Java2");
		row3.createCell(1).setCellValue(192);
		row3.createCell(2).setCellValue("Automation2");
		
		workbook.write(file);
		
		

	}

}
