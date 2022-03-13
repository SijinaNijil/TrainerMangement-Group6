package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToClickAllocateLink;
import com.trainer.utilities.ExcelUtility;

public class AbleToClickAllocateLinkTestClass extends TestBase {
	AbleToClickAllocateLink objAllocate;
	
	@Test
    public void ableToClkLink() throws IOException {
    //Create Login Page object
		objAllocate = new AbleToClickAllocateLink(driver);
    //login to application
		objAllocate.clickLoginLink();
		
	       String uname = ExcelUtility.getCellData(1, 1);
	       objAllocate.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(2, 1);
			objAllocate.setPasswd(passwd);
			
			objAllocate.setButton();
		
			objAllocate.clickAllocate();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }

}
