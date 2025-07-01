package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath="//input[@id='user-name']")
     public WebElement username;		
	
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement loginbutton;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String uname, String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
	}
	
 
			

}
