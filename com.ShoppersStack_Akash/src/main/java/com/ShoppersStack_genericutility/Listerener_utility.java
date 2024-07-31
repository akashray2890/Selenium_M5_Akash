package com.ShoppersStack_genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listerener_utility implements ITestListener,ISuiteListener{
	@Override
	public void onTestFailure(ITestResult result) {
		Java_utility java=new Java_utility();
		TakesScreenshot ts=(TakesScreenshot) Working_baseclass.listnerDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dstn=new File(Frame_Constantrant.screenshotPath+java.localDateTime()+".png");
				
		try {
			FileHandler.copy(temp, dstn);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
