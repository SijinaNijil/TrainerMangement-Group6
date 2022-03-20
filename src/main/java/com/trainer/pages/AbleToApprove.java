package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbleToApprove {
WebDriver driver;
	
	@FindBy(id="floatingInput")
	public WebElement uname;
	@FindBy(id="floatingPassword")
	public WebElement passwd;
	@FindBy(xpath="//button[@class= 'w-100 btn btn-lg btn-primary']")
	public WebElement bttn;

	@FindBy(xpath="//button[@class= 'btn btn-primary']")
	public WebElement bttn1;
	// ----------------------------------------------------------------------------------------------

	@FindBy(linkText="Login")
	public WebElement clkLink;

	
	@FindBy(linkText="Approve")
	public WebElement clkApprove;
	public AbleToApprove(WebDriver driver){
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
		public void setButton(){
		   bttn.click();
		} 
public void clickLoginLink(){
	clkLink.click();
     }

public void clickApprove(){
	clkApprove.click();
	
     }


}
