package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToClickLoginLink;

public class AbleToClickLoginLinkTestClass extends TestBase
{
	AbleToClickLoginLink objSignUp;
	
	@Test
    public void ableToClkLink() throws IOException {
    //Create Login Page object
		objSignUp = new AbleToClickLoginLink(driver);
    //login to application

   objSignUp.clickLoginLink();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }


}
