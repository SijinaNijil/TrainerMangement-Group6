package com.trainer.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs1.utilities.ExcelUtility;
import com.trainer.constants.AutomationConstants;
import com.trainer.pages.ValidSignUp;

public class ValidSignUpTestClass extends TestBase
{

	     ValidSignUp objSignUp;
			
			@SuppressWarnings("deprecation")
			@Test
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
				   msg.accept();
			    String actmsg=msg.getText();
			    String expmsg="Sign Up Successfull!";
			    Assert.assertEquals(actmsg,expmsg);
			    Thread.sleep(2000);
			    msg.accept();
			  
			    
			    
			    
			String expectedTitle =AutomationConstants.HOMEPAGETITLE;
		    String actualTitle =driver.getTitle();
		    Assert.assertEquals(expectedTitle,actualTitle);
			}
}