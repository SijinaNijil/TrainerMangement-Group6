package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.pages.ValidEmail;
import com.trainer.pages.ValidationMob;

public class ValidationMobTestClass extends TestBase{
ValidationMob objSignUp;
	
	@SuppressWarnings("deprecation")
	@Test
    public void ableToSignUp() throws IOException, InterruptedException 
	{
		
		objSignUp = new ValidationMob(driver);
		
		String name = com.trainer.utilities.ExcelUtility.getCellData(0, 0);
		objSignUp.setName(name);
		String email = com.trainer.utilities.ExcelUtility.getCellData(1, 0);
		objSignUp.setEmail(email);
		String phone = com.trainer.utilities.ExcelUtility.getCellData(0, 0);
		objSignUp.setPhone(phone);
		String addr = com.trainer.utilities.ExcelUtility.getCellData(10, 0);
		objSignUp.setAddress(addr);
		
		String actmsg=objSignUp.asert.getText();
		String expmsg="Enter valid mail Id";
		
		Assert.assertEquals(actmsg,expmsg);
	    Thread.sleep(2000);
	    
	}
}
