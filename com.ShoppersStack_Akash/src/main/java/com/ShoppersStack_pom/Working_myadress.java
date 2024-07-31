package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Working_myadress {
	
	public Working_myadress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //div[contains(text(),'My Addresses')]")
	private WebElement adrsstxtfld;
	
	
	public WebElement getAdrsstxtfld() {
		return adrsstxtfld;
	}

}
