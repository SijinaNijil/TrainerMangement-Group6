package com.trainer.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.LandingPageLoad;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LandingPageLoadTestClass extends TestBase{
	 LandingPageLoad objSignUp;
	
	@Test
    public void ableToClkLink() throws IOException {
    //Create Login Page object
		objSignUp = new  LandingPageLoad(driver);
    //login to application

  // objSignUp.clickSignupPages();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }

}
