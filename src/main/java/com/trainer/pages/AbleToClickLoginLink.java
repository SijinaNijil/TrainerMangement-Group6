package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AbleToClickLoginLink {
	WebDriver driver;
	 @FindBy(linkText="Sign Up/Enroll")
	 WebElement signup;
		public AbleToClickLoginLink(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
		
	
		public void clickLoginLink() {
			// TODO Auto-generated method stub
			signup.click();
		}

}
