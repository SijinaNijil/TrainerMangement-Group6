package com.trainer.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AdminInvalidLogin;
import com.trainer.pages.AdminValidLogin;
import com.trainer.utilities.ExcelUtility;

import junit.framework.Assert;

public class AdminInvalidLoginTestClass extends TestBase
{
AdminInvalidLogin objLogin;

	


	@SuppressWarnings({ "deprecation", "deprecation", "deprecation" })
	@Test
    public void verifyLogin() throws IOException {
 

	objLogin = new AdminInvalidLogin(driver);
    //login to application

		String uname = ExcelUtility.getCellData(1, 3);
		objLogin.setUName(uname);
		
		String passwd = ExcelUtility.getCellData(2, 3);
		objLogin.setPasswd(passwd);
		
		objLogin.setButton();
		
		
   // objSignUp.clickSignup();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
   String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
  
    }


}
