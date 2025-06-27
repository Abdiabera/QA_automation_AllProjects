package ExpectedExcep;

import org.testng.annotations.Test;

public class ExpectedExcep {
	
	@Test(invocationTimeOut=3)
	public void method1() {
		
		int i=1;
		while(i==1) {
			System.out.println(i);
			
		}
	}

}
