package Depends;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependsOnEx {
	
	@Test
	public void login() {
		System.out.println("calling login");
		assertEquals(10, 20);
	}
	
	
	@Test(dependsOnMethods="login")
	public void order() {
		
		System.out.println("calling order");
	}
	
	
	@Test(dependsOnMethods="login")
	public void filter() {
		
		System.out.println("calling filter");
	}

}
