package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminValidLogin {
	WebDriver driver;
	@FindBy(id="floatingInput")
	private WebElement uname;
	@FindBy(id="floatingPassword")
	private WebElement passwd;
	@FindBy(xpath="//button[@class= 'w-100 btn btn-lg btn-primary']")
	private WebElement bttn;

@FindBy(xpath="//a[@class= 'nav-link']")
private WebElement signup;

@FindBy(linkText="Login")
WebElement clkLink;
	
	public AdminValidLogin(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}

	public void clickLoginLink(){
		clkLink.click();
	     }

	public void setUName(String strUName){
		uname.sendKeys(strUName);}
	//Click on login button
	public void setPasswd(String strpasswd){
		passwd.sendKeys(strpasswd);     
	}
	//Set password in password textbox
	public void setButton(){
	   bttn.click();
	}

}
