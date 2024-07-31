package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Working_Homepage {

	public Working_Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"root\"]/section[1]/article/div[3]/div[1]/button/span[1]/div")
	private WebElement settbtn;
	
	@FindBy(xpath="//li[contains(text(),'My Profile')]")
	private WebElement profilebtn;
	
	@FindBy(xpath="//li[contains(text(),'Logout')]")
	private WebElement logoutbtn;

	public WebElement getSettbtn() {
		return settbtn;
	}

	public WebElement getProfilebtn() {
		return profilebtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
}
