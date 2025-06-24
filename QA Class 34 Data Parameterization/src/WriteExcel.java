import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
	//https://archive.apache.org/dist/poi/release/bin/
		
		//https://poi.apache.org/components/spreadsheet/quick-guide.html#NewWorkbook
		
			Workbook wb = new XSSFWorkbook();
			
			Sheet s1 = wb.createSheet("SHEET A");
			Sheet s2 = wb.createSheet("SHEET B");
			Sheet s3 = wb.createSheet("SHEET C");
			
			for(int i=0;i<10;i++) {
				Row r = s1.createRow(i);
				for(int j=0;j<10;j++) {
				
				Cell c = r.createCell(j);
				c.setCellValue(i+j);
				}
			}
				 OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA Batch - 02nd May 2025\\QA Class 34 Data Parameterization\\src\\TestSuite\\Test.xlsx");
					
				wb.write(fileOut);
				
				
			}
			
	}
	

