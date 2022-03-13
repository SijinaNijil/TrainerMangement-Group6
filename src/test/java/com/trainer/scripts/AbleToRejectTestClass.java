package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToApprove;
import com.trainer.pages.AbleToReject;
import com.trainer.utilities.ExcelUtility;

public class AbleToRejectTestClass extends TestBase{
AbleToReject objReject;
	
	@Test
    public void ableToClkLink() throws IOException {
    //Create Login Page object
		objReject = new AbleToReject(driver);
    //login to application
		objReject.clickLoginLink();
		
	       String uname = ExcelUtility.getCellData(1, 1);
	       objReject.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(2, 1);
			objReject.setPasswd(passwd);
			
			objReject.setButton();
		
		
			objReject.clickReject();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);

}

}
