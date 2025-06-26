package AnnotationsEx;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsEg {
	
	@Test
	public void method1() {
		
		System.out.println("** Calling method 1");
	}
	
	@Test
public void method2() {
		
		System.out.println("** Calling method 2");
	}

	@BeforeMethod
	public void start() {
		
		System.out.println(" ***  START METHOD ******");
	}
	
	@AfterMethod
	public void end() {
		System.out.println(" **   END METHOD ****");
	}
	
	@Test
	public void method3() {
			
			System.out.println("** Calling method 3");
		}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println(" BEFORE TEST");
	}
	
	@AfterTest
	public void afterest() {
		System.out.println(" AFTER TEST");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("BEFORE CLASS");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("AFTER CLASS");
	}
}
