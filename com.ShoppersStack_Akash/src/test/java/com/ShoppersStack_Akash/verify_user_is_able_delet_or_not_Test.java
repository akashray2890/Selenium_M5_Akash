package com.ShoppersStack_Akash;

import org.testng.annotations.Test;

import com.ShoppersStack_genericutility.Working_baseclass;
import com.ShoppersStack_pom.Working_addadress;
import com.ShoppersStack_pom.Working_myadress;
import com.ShoppersStack_pom.workin_Myapplication;

public class verify_user_is_able_delet_or_not_Test extends Working_baseclass {
	
	
	@Test
	public void deletAdress() throws InterruptedException {
		 homePage.getSettbtn().click();
		 homePage.getProfilebtn().click();
		 
		 
		 Working_addadress addaress=new Working_addadress(driver);
		 addaress.getAddadrsbtn().click();
		 
		 Working_myadress myadrs=new Working_myadress(driver);
		 myadrs.getAdrsstxtfld().click();
		 
		 
		 Thread.sleep(2000);
		 
		 addaress.getDltbtn().click();
		 Thread.sleep(2000);
		 
		 addaress.getYesbtn().click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 
		 
		 
		 
		
		
		
		
	}

}
