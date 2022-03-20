package com.trainer.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickableSignUp {
	WebDriver driver;
	 @FindBy(linkText="Sign Up/Enroll")
	 WebElement signup;
	 @FindBy(xpath="/html/body/app-root/app-sign-up/form/button")
		private WebElement bttn1;
		public ClickableSignUp(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
		
		public void clickSignupPages(){
			 signup.click();
	         }
		public void setButton(){
			//	org.openqa.selenium.Point p= bttn.getLocation();

			//	Actions actions = new Actions(driver);

				//actions.moveToElement(bttn).moveByOffset(p.x,p.y).click().perform();
				
			/*	Actions actions = new Actions(driver);
				actions.moveToElement(bttn).click().perform();   */
				//   bttn2.click();  
				   bttn1.sendKeys(Keys.RETURN);
				  
				   
			}
}
