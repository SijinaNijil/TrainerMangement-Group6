package com.trainer.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.TrainerValidLogin;
import com.trainer.utilities.ExcelUtility;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TrainerValidLoginTestClass extends TestBase{
	TrainerValidLogin objTrainer;
	
	@Test
    public void verifyLogin() throws IOException, InterruptedException {
    //Create Login Page object
	
		objTrainer = new TrainerValidLogin(driver);
    //login to application
		objTrainer.clickLoginLink();
		String uname = ExcelUtility.getCellData(1, 2);
		objTrainer.setUName(uname);
		
		String passwd = ExcelUtility.getCellData(2, 2);
		objTrainer.setPasswd(passwd);
		
		objTrainer.setButtonlog();
		objTrainer.clickProfile();
		//objTrainer.editProfile();
		//objTrainer.clickProfile();
		
		String strQualification = com.trainer.utilities.ExcelUtility.getCellData(1, 0);
		objTrainer.setQualification(strQualification);

	
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2000);
		objTrainer.editFinal();
		
   // objSignUp.clickSignup();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
  
    }
}
