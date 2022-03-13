package com.trainer.scripts;




import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs1.utilities.ExcelUtility;
import com.trainer.constants.AutomationConstants;

import com.trainer.pages.AbleToSignUp;



/*

public class TestClass extends TestBase {
		SignUpLink objSignUp;
			
			@Test
		    public void verifyHome() throws IOException {
		    //Create Login Page object
				objSignUp = new SignUpLink(driver);
		    //login to application

		   // objSignUp.clickSignup();
		    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
		    String actualTitle =driver.getTitle();
		    Assert.assertEquals(expectedTitle,actualTitle);
		  
		    }}
	*/	 
	// _________________________________________________________________________________________________________________________    
	/*public class TestClass extends TestBase {
		SignUpLinkAblClk objSignUp;
			
			@Test
		    public void ableToClkLink() throws IOException {
		    //Create Login Page object
				objSignUp = new SignUpLinkAblClk(driver);
		    //login to application

		   objSignUp.clickSignupPages();
		    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
		    String actualTitle =driver.getTitle();
		    Assert.assertEquals(expectedTitle,actualTitle);
		    }}
		    */
// ___________________________________________________________________________________________________________________________

 
public class TestClass extends TestBase {
     AbleToSignUp objSignUp;
		
		@Test
	    public void ableToSignUp() throws IOException {
			
			objSignUp = new AbleToSignUp(driver);
	
String name = ExcelUtility.getCellData(0, 0);
objSignUp.setName(name);
	   
String strQualification = ExcelUtility.getCellData(1, 0);
objSignUp.setQualification(strQualification);

String skill = ExcelUtility.getCellData(2, 0);
objSignUp.setSkillSet(skill);

	   
String comname = ExcelUtility.getCellData(3, 0);
objSignUp.setCompanyName(comname);

String destination = ExcelUtility.getCellData(4, 0);
objSignUp.setDesignation(destination);

//String upload_file = ExcelUtility.getCellData(5, 0);
//objSignUp.setImage(upload_file);

	   
String password = ExcelUtility.getCellData(6, 0);
objSignUp.setPassword(password);

String repassword = ExcelUtility.getCellData(7, 0);
objSignUp.setRePassword(repassword);

String phone = ExcelUtility.getCellData(8, 0);
objSignUp.setPhone(phone);

String email = ExcelUtility.getCellData(9, 0);
objSignUp.setEmail(email);

String addr = ExcelUtility.getCellData(10, 0);
objSignUp.setAddress(addr);

//objSignUp.clickSignup();
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	 
	
	    
   
   
  
    }}
    
   
//  ----------------------------------------------------------------------------------------
/*
public class TestClass extends TestBase {
	AbleToLogin objLogin;
		
		@Test
	    public void verifyLogin() throws IOException {
	    //Create Login Page object
		
		objLogin = new AbleToLogin(driver);
	    //login to application

			String uname = ExcelUtility.getCellData(9, 0);
			objLogin.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(10, 0);
			objLogin.setPasswd(passwd);
			
			objLogin.setButton();
			
	   // objSignUp.clickSignup();
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	  
	    }}
*/
/*
public class TestClass extends TestBase {
	AbleToLogin objLogin;
		
		@Test
	    public void verifyHome() throws IOException {
	    //Create Login Page object
			objLogin =new AbleToLogin(driver);
			String uname = ExcelUtility.getCellData(0, 0);
			objLogin.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(1, 0);
			objLogin.setPasswd(passwd);
			
			objLogin.setButton();
			
	    //login to application

	   // objSignUp.clickSignup();
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	  
	    }}
*/