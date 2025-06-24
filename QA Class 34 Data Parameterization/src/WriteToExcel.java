import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
	//https://archive.apache.org/dist/poi/release/bin/
		
		//https://poi.apache.org/components/spreadsheet/quick-guide.html#NewWorkbook
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet s1 = wb.createSheet("SHEET A");
		Sheet s2 = wb.createSheet("SHEET B");
		Sheet s3 = wb.createSheet("SHEET C");
		
		Row r1 = s1.createRow(0);
		Row r2 = s1.createRow(1);
		Row r3 = s1.createRow(2);
		Row r4 = s1.createRow(3);
		
		
		Cell c1 = r1.createCell(0);
		Cell c2 = r1.createCell(1);
		Cell c3 = r1.createCell(2);
		Cell c4 = r1.createCell(3);
		
		c1.setCellValue(100);
		c2.setCellValue(200);
		c3.setCellValue("Test");
		c4.setCellValue(863.96);
		
		
		r2.createCell(0).setCellValue(500);
		r2.createCell(1).setCellValue("Selenium");
		r2.createCell(2).setCellValue(8656.36);
		r2.createCell(3).setCellValue("java");
		
		
		try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA Batch - 02nd May 2025\\QA Class 34 Data Parameterization\\src\\TestSuite\\Test.xlsx")) {
		    
			wb.write(fileOut);
		}

	}

}
