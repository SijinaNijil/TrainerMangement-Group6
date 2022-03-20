package com.trainer.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToClickSignUpLink;

public class AbleToClickSignUpLinkTestClass extends TestBase{
	AbleToClickSignUpLink objSignUp;
	
	@Test
    public void ableToClkLink() throws IOException, InterruptedException {
    //Create Login Page object
		objSignUp = new AbleToClickSignUpLink(driver);
    //login to application

   objSignUp.clickSignupPages();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Thread.sleep(5000);
    driver.close();
    }

}
