package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Working_login_page {
	
	 public Working_login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 	@FindBy(id="Email")
	 	private WebElement emiltxtfld;
	 	
	 	@FindBy(id="Password")
	 	private WebElement paswtxtfld;
	 	
	 	@FindBy(xpath="//span[text()='Login']")
	 	private WebElement subbtn;

		public WebElement getEmiltxtfld() {// use getter method
			return emiltxtfld;
		}

		public WebElement getPaswtxtfld() {
			return paswtxtfld;
		}

		public WebElement getSubbtn() {
			return subbtn;
		}
}
