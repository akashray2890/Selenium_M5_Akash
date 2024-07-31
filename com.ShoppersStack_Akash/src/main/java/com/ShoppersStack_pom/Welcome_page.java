package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_page {
	public Welcome_page(WebDriver driver) {//call the constuctor using selenium pagefactory
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "loginBtn")//using annotaion find the webelement in webpage
	private WebElement login;

	public WebElement getLogin() {//to acess private webelement in webpage
		return login;
	}

}
