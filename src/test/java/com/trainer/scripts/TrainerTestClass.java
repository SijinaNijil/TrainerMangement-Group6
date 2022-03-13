package com.trainer.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToLogout;
import com.trainer.pages.Trainer;
import com.trainer.utilities.ExcelUtility;

public class TrainerTestClass extends TestBase {
	Trainer tr;


	@Test 

	public void login() throws IOException, InterruptedException {
	    //Create Login Page object
		tr = new  Trainer(driver);
		
		tr.clickLoginLink();
		
	       String uname = ExcelUtility.getCellData(1, 1);
			tr.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(2, 1);
			tr.setPasswd(passwd);
			
			tr.setButton();
			Thread.sleep(2000);
	
		
			tr.clickLogout();
	       // objSignout.clickLogout();
	   //-----------------------------------------------------------------trainer login
			tr.clickLoginLink();
			String uname1 = ExcelUtility.getCellData(1, 2);
			tr.setUName(uname1);
			String passwd1 = ExcelUtility.getCellData(2, 2);
			tr.setPasswd(passwd1);
			tr.setButton();
			Thread.sleep(2000);
			//objSignout.clickLogout();
		//-------------------------------------------------------------	
			
			tr.setButton();
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }

}
