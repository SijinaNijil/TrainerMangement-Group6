package com.trainer.scripts;

import java.io.IOException;
import org.openqa.selenium.Alert;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs1.utilities.ExcelUtility;
import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToApprove;
import com.trainer.pages.AbleToClickAllocateLink;
import com.trainer.pages.AbleToClickLoginLink;
import com.trainer.pages.AbleToClickSignUpLink;
import com.trainer.pages.AbleToClickViewAllocation;
import com.trainer.pages.AbleToLogout;
import com.trainer.pages.AbleToReject;
import com.trainer.pages.AbleToSearchTrainer;
import com.trainer.pages.AdminInvalidLogin;
import com.trainer.pages.AdminValidLogin;
import com.trainer.pages.ClickLogout;
import com.trainer.pages.LandingPageLoad;
import com.trainer.pages.TrainerValidLogin;
import com.trainer.pages.ValidSignUp;

public class TestClass extends TestBase
{
	AbleToLogout objSignout;

	@Test(priority=1) 

	public void logout() throws IOException, InterruptedException {
	    //Create Login Page object
		objSignout = new  AbleToLogout(driver);
		
		objSignout.clickLoginLink();
		
	       String uname = ExcelUtility.getCellData(1, 1);
			objSignout.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(2, 1);
			objSignout.setPasswd(passwd);
			
			objSignout.setButton();
			Thread.sleep(2000);
		
	   objSignout.clickLogout();
	       // objSignout.clickLogout();
		
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	 LandingPageLoad land;
		
		@Test(priority=2)
	    public void land() throws IOException {
	    //Create Login Page object
			land = new  LandingPageLoad(driver);
	    //login to application

	  // objSignUp.clickSignupPages();
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
		AbleToClickLoginLink LoginLink;
		
		@Test(priority=3)
	    public void ableToClkLogLink() throws IOException {
	    //Create Login Page object
			LoginLink = new AbleToClickLoginLink(driver);
	    //login to application

			LoginLink.clickLoginLink();
			String expectedURL3 ="https://trainermanagement.herokuapp.com/login";
			   String actuaLURL3=driver.getCurrentUrl();
			   Assert.assertEquals(expectedURL3,actuaLURL3);
	   // driver.close();
	    }
		AbleToClickSignUpLink objSignUpLnk;
		
		@Test(priority=4)
	    public void ableToClkLink() throws IOException, InterruptedException {
	    //Create Login Page object
			objSignUpLnk = new AbleToClickSignUpLink(driver);
	    //login to application

	   objSignUpLnk.clickSignupPages();
	   String expectedURL3 ="https://trainermanagement.herokuapp.com/signup";
	   String actuaLURL3=driver.getCurrentUrl();
	   Assert.assertEquals(expectedURL3,actuaLURL3);

	    Thread.sleep(5000);
	   // driver.close();
	    }

	     ValidSignUp objSignUp;
			
			@SuppressWarnings("deprecation")
			@Test(priority=5)
		    public void ableToSignUp() throws IOException, InterruptedException 
			{
				
				objSignUp = new ValidSignUp(driver);
				
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
				
				
				
				 org.openqa.selenium.Alert msg=driver.switchTo().alert();
				  // msg.accept();
			    String actmsg=msg.getText();
			    String expmsg="Sign Up Successfull!";
			    Assert.assertEquals(actmsg,expmsg);
			    Thread.sleep(2000);
			    msg.accept();
			  
			    
		  
			
	}	
			TrainerValidLogin objTrainer;
			
			@Test(priority=6)
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
				String expectedURL3 ="https://trainermanagement.herokuapp.com/profile";
				   String actuaLURL3=driver.getCurrentUrl();
				   Assert.assertEquals(expectedURL3,actuaLURL3);
				   driver.get("https://trainermanagement.herokuapp.com");
				 
}
			
			
				AdminValidLogin objLogin;
				
				@Test(priority=7)
			    public void verifyLoginAdmin() throws IOException {
			    //Create Login Page object
				
				objLogin = new AdminValidLogin(driver);
			    //login to application
objLogin.clickLoginLink();
					String uname = ExcelUtility.getCellData(1, 1);
					objLogin.setUName(uname);
					
					String passwd = ExcelUtility.getCellData(2, 1);
					objLogin.setPasswd(passwd);
					
					objLogin.setButton();
					 objSignout.clickLogout();
					
			   // objSignUp.clickSignup();
			    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
			    String actualTitle =driver.getTitle();
			    Assert.assertEquals(expectedTitle,actualTitle);
			  
			    }
			//	String url1=driver.get("https://trainermanagement.herokuapp.com/admin/allocate");
						AbleToSearchTrainer objSearch;
				
				@Test(priority=9)
			    public void ableToSearch() throws IOException, InterruptedException {
			    //Create Login Page object
					objSearch = new AbleToSearchTrainer(driver);
			    //login to application
					//objSearch.clickLoginLink();
					/*
				       String uname = ExcelUtility.getCellData(1, 1);
				       objSearch.setUName(uname);
						
						String passwd = ExcelUtility.getCellData(2, 1);
						objSearch.setPasswd(passwd);
						
						objSearch.setButton();
					
						objSearch.clickAllocateLink();
						*/
						String searchName = ExcelUtility.getCellData(1, 4);
						objSearch.search1(searchName);
						objSearch.clickAllocateTB();
						objSearch.option("FSD");
					//	Thread.sleep(2000);
					objSearch.batch("FSD001");
						objSearch.SCEDULE("15:30");
					//	objSearch.search2();
			    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
			    String actualTitle =driver.getTitle();
			    Assert.assertEquals(expectedTitle,actualTitle);
			    objSignout.clickLogout();
			    }
				AbleToClickAllocateLink objAllocate;
				
				@Test(priority=8)
			    public void ableToClkLinkAllocate() throws IOException {
			    //Create Login Page object
					objAllocate = new AbleToClickAllocateLink(driver);
			    //login to application
					objAllocate.clickLoginLink();
					
				       String uname = ExcelUtility.getCellData(1, 1);
				       objAllocate.setUName(uname);
						
						String passwd = ExcelUtility.getCellData(2, 1);
						objAllocate.setPasswd(passwd);
						
						objAllocate.setButton();
						
					
						objAllocate.clickAllocate();
			    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
			    String actualTitle =driver.getTitle();
			    Assert.assertEquals(expectedTitle,actualTitle);

}
				AbleToClickViewAllocation view;
				@Test(priority=10)
			    public void viewAllocation() throws IOException, InterruptedException {
			    //Create Login Page object
				
					view = new AbleToClickViewAllocation(driver);
					view.vwAllocation();
					String expectedURL3 ="https://trainermanagement.herokuapp.com/profile/allocateDetail";
					   String actuaLURL3=driver.getCurrentUrl();
					   Assert.assertEquals(expectedURL3,actuaLURL3);

				
			}
			
}
				