package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToClickSignUpLink;

public class AbleToClickSignUpLinkTestClass extends TestBase{
	AbleToClickSignUpLink objSignUp;
	
	@Test
    public void ableToClkLink() throws IOException {
    //Create Login Page object
		objSignUp = new AbleToClickSignUpLink(driver);
    //login to application

   objSignUp.clickSignupPages();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }

}
