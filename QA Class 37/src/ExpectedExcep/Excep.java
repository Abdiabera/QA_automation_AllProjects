package ExpectedExcep;

import org.testng.annotations.Test;

public class Excep {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void method() {
		
		
		try {
		int a=10/0;
		String input="100A";
		Integer.parseInt(input);
		}
		catch(Exception e) {
		int[] b = new int[2];
		b[20]=56;
		}
	
			
		
		
	}

}
