package com.trainer.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.ValidSignUp;
import com.trainer.pages.ValidationName;

public class ValidationNameTestcase extends TestBase{
	 ValidationName objSignUp;
		
		@SuppressWarnings("deprecation")
		@Test
	    public void ableToSignUp() throws IOException, InterruptedException 
		{
			
			objSignUp = new ValidationName(driver);
			
			String name = com.trainer.utilities.ExcelUtility.getCellData(8, 0);
			objSignUp.setName(name);
			String email = com.trainer.utilities.ExcelUtility.getCellData(9, 0);
			objSignUp.setEmail(email);
	
			String actmsg=objSignUp.asert.getText();
			String expmsg="Enter valid name";
			
			Assert.assertEquals(actmsg,expmsg);
		    Thread.sleep(2000);
		    
		    
		
		}
}