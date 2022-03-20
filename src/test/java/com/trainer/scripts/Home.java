package com.trainer.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToClickLoginLink;
import com.trainer.pages.AbleToClickViewAllocation;
import com.trainer.pages.AbleToLogout;
import com.trainer.pages.HomePage;
import com.trainer.pages.LandingPageLoad;
import com.trainer.pages.TrainerValidLogin;
import com.trainer.pages.ValidSignUp;
import com.trainer.utilities.ExcelUtility;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Home extends TestBase{
	 HomePage objSignUp;
	 TrainerValidLogin objTrainer;
	 AbleToClickViewAllocation objView;

	 AbleToLogout objSignout;
	
	
		@Test
	    public void ableToClkLink() throws IOException, InterruptedException {
	    //Create Login Page object
			objSignUp = new  HomePage(driver);
		
			 

	  // objSignUp.clickSignupPages();
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	   
		String name = com.trainer.utilities.ExcelUtility.getCellData(0, 0);
		
		objSignUp.setName(name);
		
		String strQualification = com.trainer.utilities.ExcelUtility.getCellData(1, 0);
		objSignUp.setQualification(strQualification);

		String skill = com.trainer.utilities.ExcelUtility.getCellData(2, 0);
		objSignUp.setSkillSet(skill);

			   
		String comname = com.trainer.utilities.ExcelUtility.getCellData(3, 0);
		objSignUp.setCompanyName(comname);

		String destination = com.trainer.utilities.ExcelUtility.getCellData(4, 0);
		objSignUp.setDesignation(destination);
		
	
		
		

		String phone = com.trainer.utilities.ExcelUtility.getCellData(8, 0);
		objSignUp.setPhone(phone);

		String email = com.trainer.utilities.ExcelUtility.getCellData(9, 0);
		objSignUp.setEmail(email);

		String addr = com.trainer.utilities.ExcelUtility.getCellData(10, 0);
		objSignUp.setAddress(addr);
		
		
	
		
		String upload_file = com.trainer.utilities.ExcelUtility.getCellData(5, 0);
		System.out.print(upload_file);
		objSignUp.setImage(upload_file);
		
		objSignUp.setDropdown();
		
		
		String password = com.trainer.utilities.ExcelUtility.getCellData(6, 0);
		objSignUp.setPassword(password);

		String repassword = com.trainer.utilities.ExcelUtility.getCellData(7, 0);
		objSignUp.setRePassword(repassword);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2000);
		objSignUp.setButton();
		
		

		Alert msg=driver.switchTo().alert();
		 
	    String actmsg=msg.getText();
	    String expmsg="Sign Up Successfull!";
	    Assert.assertEquals(actmsg,expmsg);
	    msg.accept();
	    //https://trainermanagement.herokuapp.com/login
	    String expectedURL ="https://trainermanagement.herokuapp.com/login";
	    String actuaLURL=driver.getCurrentUrl();
	    Assert.assertEquals(expectedURL,actuaLURL);
	    Thread.sleep(2000);
	    
	    objTrainer = new TrainerValidLogin(driver);
	    //login to application
			objTrainer.clickLoginLink();
			String uname = ExcelUtility.getCellData(1, 2);
			objTrainer.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(2, 2);
			objTrainer.setPasswd(passwd);
			
			objTrainer.setButtonlog();
			objTrainer.clickProfile();
			//https://trainermanagement.herokuapp.com/profile
		/*	String expectedURL1 ="https://trainermanagement.herokuapp.com/editprofile";
		    String actuaLURL1=driver.getCurrentUrl();
		    Assert.assertEquals(expectedURL1,actuaLURL1);
		    Thread.sleep(2000);
		    objView.vwAllocation();
		    //https://trainermanagement.herokuapp.com/profile/allocateDetail
		    String expectedURL2 ="https://trainermanagement.herokuapp.com/profile/allocateDetail";
		    String actuaLURL2=driver.getCurrentUrl();
		    Assert.assertEquals(expectedURL2,actuaLURL2); */
		    Thread.sleep(2000);
		    objTrainer.editFinal();
		    //https://trainermanagement.herokuapp.com/profile
		 /*   String expectedURL3 ="https://trainermanagement.herokuapp.com/profile";
		    String actuaLURL3=driver.getCurrentUrl();
		    Assert.assertEquals(expectedURL3,actuaLURL3);*/
		    Thread.sleep(2000); 
		   // objSignout.clickLogout();
		    //objSignout.clickLogout();
		    objSignout.clkLinkLogOut.click();
		    String expectedTitle1 =AutomationConstants.HOMEPAGETITLE;
		    String actualTitle1 =driver.getTitle();
		    Assert.assertEquals(expectedTitle1,actualTitle1);
		    driver.quit();
	    }

}
