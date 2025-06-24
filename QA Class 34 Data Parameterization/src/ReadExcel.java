
public class ReadExcel {

	public static void main(String[] args) {
		
		//https://archive.apache.org/dist/poi/release/bin/
		
		//https://poi.apache.org/components/spreadsheet/quick-guide.html#NewWorkbook
		
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA Batch - 02nd May 2025\\QA Class 34 Data Parameterization\\src\\TestSuite\\TESTSUITE.xlsx");
		int rowCount=xls.getRowCount("GMAIL");
		System.out.println(rowCount);
		
		
		for(int i=1;i<=rowCount;i++) {
			
		String v1= xls.getCellData("GMAIL", "TCID", i);
		String v2= xls.getCellData("GMAIL", "TESTCASE", i);
		String v3= xls.getCellData("GMAIL", "STATUS", i);
		System.out.println(v1+" | "+v2+" | "+v3);
		}
	}

}
