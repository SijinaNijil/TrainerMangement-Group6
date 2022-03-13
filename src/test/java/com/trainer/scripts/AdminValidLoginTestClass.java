package com.trainer.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AdminValidLogin;
import com.trainer.utilities.ExcelUtility;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AdminValidLoginTestClass extends TestBase{
	AdminValidLogin objLogin;
	
	@Test
    public void verifyLogin() throws IOException {
    //Create Login Page object
	
	objLogin = new AdminValidLogin(driver);
    //login to application

		String uname = ExcelUtility.getCellData(1, 1);
		objLogin.setUName(uname);
		
		String passwd = ExcelUtility.getCellData(2, 1);
		objLogin.setPasswd(passwd);
		
		objLogin.setButton();
		
   // objSignUp.clickSignup();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
  
    }

}
