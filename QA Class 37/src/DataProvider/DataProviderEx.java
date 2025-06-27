package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@DataProvider(name="TestDataServ1")
	public Object[][] input() {
		
		return new Object[][] {{"U1","P1","C1"},
			            	  {"U2","P2","C2"},
			            	  {"U3","P3","C3"},
			            	  {"U4","P4","C4"}
		};
		}
	
	@DataProvider(name="TestDataServ2")
	public Object[][] data2() {
		
		return new Object[][] {{"V1","P1","C1"},
			            	  {"V2","P2","C2"},
			            	  {"V3","P3","C3"},
			            	  {"V4","P4","C4"}
		};
		}
	

	
	
	
	
	@Test(dataProvider="TestDataServ1")
	public void method(String data1, String data2,String data3) {
		
		System.out.println(data1+" | "+data2+" | "+data3);
	}

}
