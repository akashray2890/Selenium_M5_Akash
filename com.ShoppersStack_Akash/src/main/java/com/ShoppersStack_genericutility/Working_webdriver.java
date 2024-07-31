package com.ShoppersStack_genericutility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Working_webdriver {
	
	Select sel;
	
	public void selectByIndex(WebElement ele,int index) {
		sel=new Select(ele);
		sel.selectByIndex(index);
	}
	public void selectByvalue(WebElement ele,String text) {
		sel=new Select(ele);
		sel.selectByValue(text);
	}
	public void selectByvisibility(WebElement ele,String text) {
		sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	public void deselectByIndex(WebElement ele,int index) {
		sel=new Select(ele);
		sel.deselectByIndex(index);
	}
	public void deselectByvalue(WebElement ele,String text) {
		sel=new Select(ele);
		sel.deselectByValue(text);
	}
	public void deselectByvisibility(WebElement ele,String text) {
		sel=new Select(ele);
		sel.deselectByVisibleText(text);
	}
	public void deSelectAll(WebElement ele) {
		sel=new Select(ele);
		sel.deselectAll();
	}
	
	
	public void webPageScreenshort() throws IOException {
		TakesScreenshot tis=(TakesScreenshot)Working_baseclass.sDriver;
	    File temp = tis.getScreenshotAs(OutputType.FILE);
	    File store = new File("");
	    FileHandler.copy(temp, store);
	    
	}
	public void webElementScreenshot(WebElement ele) throws IOException {
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File store = new File("");
		FileHandler.copy(temp, store);
	}

}
