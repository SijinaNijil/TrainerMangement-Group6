package com.trainer.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainerValidLogin {
	WebDriver driver;
	@FindBy(id="floatingInput")
	private WebElement uname;
	@FindBy(id="floatingPassword")
	private WebElement passwd;
	@FindBy(xpath="//button[@class= 'w-100 btn btn-lg btn-primary']")
	private WebElement bttn;
	@FindBy(linkText="Login")
	WebElement clkLink;
	////button[text()=' Edit Profile']
	@FindBy(xpath="//button[text()=' Edit Profile']")
	private WebElement bttn1;
	                                         //edit profile
	
	@FindBy(id="h_qualification")
	private WebElement h_qualification;
	
	// //a[@class='btn btn-success']
	
	
	@FindBy(xpath="//button[@type='submit]")
	private WebElement bttnedi1t;
	@FindBy(xpath="/html/body/app-root/app-edit-details-form/form/button")
	private WebElement bttnedit;
	public TrainerValidLogin(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
	public void setUName(String strUName){
		uname.sendKeys(strUName);}
	//Click on login button
	public void setPasswd(String strpasswd){
		passwd.sendKeys(strpasswd);     
	}
	//Set password in password textbox
	public void setButtonlog(){
	   bttn.click();
	}


	public void setQualification(String strQualification){
		h_qualification.clear();
		h_qualification.sendKeys(strQualification);     
	}
	 
public void clickLoginLink(){
clkLink.click();
}
	
	public void setButton(){
		
			   bttnedit.click();  
			 
			   
		}
	public void clickProfile(){
		bttn1.click();
	     }

/*
	public void editProfile() {
		bttnEDp.click();
		
	}
*/
	
	public void editFinal() {
		bttnedit.sendKeys(Keys.RETURN);;
		
	}

		
	}
	


