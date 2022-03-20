package com.trainer.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.trainer.pages.ClickableSignUp;
import com.trainer.pages.ValidSignUp;

public class ClickableValidateTestCase extends TestBase{
	ClickableSignUp objClickable;
		
		@SuppressWarnings("deprecation")
		@Test
	    public void ableToSignUp() throws IOException, InterruptedException 
		{
			
			objClickable = new ClickableSignUp(driver);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(2000);
			objClickable.setButton();
			
			
}
}