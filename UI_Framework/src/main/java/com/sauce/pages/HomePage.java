package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.base.TestBase;

public class HomePage extends TestBase {
	
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
public WebElement addToCart;

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public WebElement cart;
	
@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
public WebElement removeCart;
	

public HomePage() {
	PageFactory.initElements(driver, this);
	
}
	
	public void addCart() {
		
		addToCart.click();
		cart.click();
	}
	

}
