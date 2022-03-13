package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToLogout;
import com.trainer.utilities.ExcelUtility;

public class AbleToLogoutTestClass extends TestBase
{
	AbleToLogout objSignout;

@Test 

public void logout() throws IOException, InterruptedException {
    //Create Login Page object
	objSignout = new  AbleToLogout(driver);
	
	objSignout.clickLoginLink();
	
       String uname = ExcelUtility.getCellData(1, 1);
		objSignout.setUName(uname);
		
		String passwd = ExcelUtility.getCellData(2, 1);
		objSignout.setPasswd(passwd);
		
		objSignout.setButton();
		Thread.sleep(2000);
	
   objSignout.clickLogout();
       // objSignout.clickLogout();
	
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }
}
