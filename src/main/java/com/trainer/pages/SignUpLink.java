package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpLink {
WebDriver driver;
	
	
	public SignUpLink(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	 public void clickSignupPages(){
         }


}
