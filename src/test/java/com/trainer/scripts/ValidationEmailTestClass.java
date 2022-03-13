package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.pages.ValidEmail;
import com.trainer.pages.ValidationName;

public class ValidationEmailTestClass extends TestBase{
	ValidEmail objSignUp;
	
	@SuppressWarnings("deprecation")
	@Test
    public void ableToSignUp() throws IOException, InterruptedException 
	{
		
		objSignUp = new ValidEmail(driver);
		
		String name = com.trainer.utilities.ExcelUtility.getCellData(0, 0);
		objSignUp.setName(name);
		String email = com.trainer.utilities.ExcelUtility.getCellData(8, 0);
		objSignUp.setEmail(email);
		String phone = com.trainer.utilities.ExcelUtility.getCellData(8, 0);
		objSignUp.setPhone(phone);
		String actmsg=objSignUp.asert.getText();
		String expmsg="Enter valid mail Id";
		
		Assert.assertEquals(actmsg,expmsg);
	    Thread.sleep(2000);
	    
	}
}
