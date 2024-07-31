package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Working_addadress {
	
	public Working_addadress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //button[contains(text(),'Add Address')]")
	private WebElement addadrsbtn;
	
	@FindBy(xpath="(//button[contains(@type,'button')])[4]")
	private WebElement dltbtn;
	
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	private WebElement yesbtn;
	

	public WebElement getDltbtn() {
		return dltbtn;
	}

	public WebElement getAddadrsbtn() {
		return addadrsbtn;
	}
	public WebElement getYesbtn() {
		return yesbtn;
	}
}
