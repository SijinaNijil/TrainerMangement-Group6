package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToApprove;
import com.trainer.pages.AbleToClickAllocateLink;
import com.trainer.utilities.ExcelUtility;

public class AbleToApproveTestClass extends TestBase{
AbleToApprove objApprove;
	
	@Test
    public void ableToClkLink() throws IOException {
    //Create Login Page object
		objApprove = new AbleToApprove(driver);
    //login to application
		objApprove.clickLoginLink();
		
	       String uname = ExcelUtility.getCellData(1, 1);
	       objApprove.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(2, 1);
			objApprove.setPasswd(passwd);
			
			objApprove.setButton();
		
		
			objApprove.clickApprove();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);

}
}
