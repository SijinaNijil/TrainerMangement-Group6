package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbleToLogout {
WebDriver driver;

//Login Test case
// ----------------------------------------------------------------------------------------------
@FindBy(id="floatingInput")
public WebElement uname;
@FindBy(id="floatingPassword")
public WebElement passwd;
@FindBy(xpath="//button[@class= 'w-100 btn btn-lg btn-primary']")
public WebElement bttn;
@FindBy(xpath="//html/body/app-root/app-login/main/div[text()=' Invalid Login Credintials ']")
public WebElement invLog;
// ----------------------------------------------------------------------------------------------

@FindBy(linkText="Login")
public WebElement clkLink;


// ---------------------------------------------------------------------------------------------

@FindBy(xpath="//a[@class= 'nav-link']")
public WebElement signup;

// ----------------------------------------------------------------------------------------------//


@FindBy(xpath="//a[text()='Logout']")
public WebElement clkLinkLogOut;

public AbleToLogout(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
		 
public void clickLoginLink(){
	clkLink.click();
     }


//Login Test Case	 
//---------------------------------------------------------------------------------------------	 	 
	 
	 public void setUName(String strUName){
		 uname.clear();
			uname.sendKeys(strUName);}
		//Click on login button
		public void setPasswd(String strpasswd){
			passwd.clear();
			passwd.sendKeys(strpasswd);     
		}
		//Set password in password textbox
		public void setButton(){
		   bttn.click();
		} 
		
// ----------------------------------------------------------------------------------------------		
		public void clickLogout(){
			clkLinkLogOut.click();
	         }
		
// ------------------------------------------------------------------------------------------	
		
}
