package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.base.TestBase;
import com.sauce.pages.LoginPage;
import com.sauce.util.Util;

public class LoginTest extends TestBase{
	
	LoginPage loginPage;
	
	@BeforeMethod
	public void init() throws IOException {
		intialization();
		
	}
	
	
	@Test(priority=1)
	public void validLogin() throws IOException {
		
		
		
	 loginPage= new LoginPage();
		loginPage.Login("standard_user", "secret_sauce");
		Util.Screenshot();
		
	}
	
	@Test(priority=2)
public void invalidLogin() throws IOException {
		
		
		
	   loginPage= new LoginPage();
		loginPage.Login("username1", "secret_sauce");
		Util.Screenshot();
		
	}
	
     @AfterMethod
	public void teardown() {
		driver.quit();
	}
}
