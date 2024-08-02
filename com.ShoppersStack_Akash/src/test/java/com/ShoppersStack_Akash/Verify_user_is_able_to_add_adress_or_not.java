package com.ShoppersStack_Akash;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShoppersStack_genericutility.Listerener_utility;
import com.ShoppersStack_genericutility.Working_baseclass;
import com.ShoppersStack_pom.Working_addadress;
import com.ShoppersStack_pom.Working_myadress;
import com.ShoppersStack_pom.workin_Myapplication;
import com.aventstack.extentreports.Status;
@Listeners(Listerener_utility.class)
public class Verify_user_is_able_to_add_adress_or_not extends Working_baseclass {
	
	@Test
	
	public void addAdressOrNot() throws EncryptedDocumentException, IOException {
		test.log(Status.PASS,"home page dispalyed");
		homePage.getSettbtn().click();
		homePage.getProfilebtn().click();
		
		test.log(Status.PASS,"myadress dispalyed");
		Working_myadress myadress=new Working_myadress(driver);
		myadress.getAdrsstxtfld().click();
		 
		test.log(Status.PASS,"addadress page dispalyed");
		Working_addadress addadress=new Working_addadress(driver);
		addadress.getAddadrsbtn().click();
		
		
		test.log(Status.PASS,"my application page dispalyed");
		workin_Myapplication myapplication=new workin_Myapplication(driver);
		myapplication.getOfcbtn().click();
		myapplication.getNamefld().sendKeys(utility.readExcelData("Sheet1", 1, 0));
		myapplication.getHousefld().sendKeys(utility.readExcelData("Sheet1", 1, 1));
		myapplication.getStrtfld().sendKeys(utility.readExcelData("Sheet1", 1, 2));
		myapplication.getLandfld().sendKeys(utility.readExcelData("Sheet1", 1, 3));
		
		myapplication.getContyfld().sendKeys(utility.readProperty("country"));
		myapplication.getStatefld().sendKeys(utility.readProperty("state"));
		myapplication.getCityfld().sendKeys(utility.readProperty("city"));
		
		myapplication.getPinfld().sendKeys(utility.readExcelData("Sheet1", 1, 4));
		myapplication.getPhonfld().sendKeys(utility.readExcelData("Sheet1", 1, 5));
		
		
		myapplication.getAddadrsfld().click();
		
		
	}

}
