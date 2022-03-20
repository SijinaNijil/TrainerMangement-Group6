package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickLogout {
WebDriver driver;
@FindBy(xpath="//a[text()='Logout']")
public WebElement clkLinkLogOut;



public ClickLogout(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}
public void clickLogout(){
	clkLinkLogOut.click();
     }
}