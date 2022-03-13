package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbleToLogin {
	WebDriver driver;
	@FindBy(id="floatingInput")
	private WebElement uname;
	@FindBy(id="floatingPassword")
	private WebElement passwd;
	@FindBy(xpath="//button[@class= 'w-100 btn btn-lg btn-primary']")
	private WebElement bttn;
	
	public AbleToLogin(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}

	public void setUName(String strUName){
		uname.sendKeys(strUName);
	
	}
	//Click on login button
	public void setPasswd(String strpasswd){
		passwd.sendKeys(strpasswd);     
	}
	//Set password in password textbox
	public void setButton(){
	   bttn.click();
	}
}
//floatingInput
//floatingPassword