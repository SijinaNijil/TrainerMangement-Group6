package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AdminAbleToAllocate;
import com.trainer.utilities.ExcelUtility;

public class AdminAbleToAllocateTestClass extends TestBase{
	AdminAbleToAllocate objAllocate;

@Test 

public void logout() throws IOException, InterruptedException {
    //Create Login Page object
	objAllocate = new  AdminAbleToAllocate(driver);
	
	objAllocate.clickLoginLink();
	
       String uname = ExcelUtility.getCellData(1, 1);
       objAllocate.setUName(uname);
		
		String passwd = ExcelUtility.getCellData(2, 1);
		objAllocate.setPasswd(passwd);
		
		objAllocate.setButton();
		
		Thread.sleep(2000);
		
		objAllocate.clickAllocateLink();
	objAllocate.clickAllocateTb();
  // objSignout.clickLogout();
       // objSignout.clickLogout();
	
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }

}
