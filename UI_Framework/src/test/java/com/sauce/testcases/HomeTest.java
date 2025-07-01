package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.base.TestBase;
import com.sauce.pages.HomePage;
import com.sauce.pages.LoginPage;

public class HomeTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	
	@BeforeMethod
	public void init() throws IOException {
		intialization();
		
	}
	@Test
	public void addCart() {
		loginPage= new LoginPage();
		loginPage.Login("standard_user", "secret_sauce");
		
		 homepage= new HomePage();
		homepage.addCart();
		
	}
	
	 @AfterMethod
		public void teardown() {
			driver.quit();
		}

}
