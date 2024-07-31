package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class workin_Myapplication {
   public workin_Myapplication(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
 }
   @FindBy(id="Office")
   private WebElement ofcbtn;
   
   
   @FindBy(id="Name")
   private WebElement namefld;
   
   @FindBy(xpath="//input[contains(@id,'House/Office Info')]")
   private WebElement housefld;
   
   @FindBy(xpath="//input[contains(@id,'Street Info')]")
   private WebElement strtfld;
   
   @FindBy(id="Landmark")
   private WebElement landfld;
   
   @FindBy(id="Country")
   private WebElement contyfld;
   
   @FindBy(id="State")
   private WebElement statefld;
   
   @FindBy(id="City")
   private WebElement cityfld;
   
   @FindBy(id="Pincode")
   private WebElement pinfld;
   
   @FindBy(xpath="//input[contains(@id,'Phone Number')]")
   private WebElement phonfld;
   
   @FindBy(xpath=" //button[contains(text(),'Add Address')]")
   private WebElement addadrsfld;

public WebElement getOfcbtn() {
	return ofcbtn;
}

public WebElement getNamefld() {
	return namefld;
}

public WebElement getHousefld() {
	return housefld;
}

public WebElement getStrtfld() {
	return strtfld;
}

public WebElement getLandfld() {
	return landfld;
}

public WebElement getContyfld() {
	return contyfld;
}

public WebElement getStatefld() {
	return statefld;
}

public WebElement getCityfld() {
	return cityfld;
}

public WebElement getPinfld() {
	return pinfld;
}

public WebElement getPhonfld() {
	return phonfld;
}

public WebElement getAddadrsfld() {
	return addadrsfld;
}
   
}
