package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidEmail {
WebDriver driver;
	
	@FindBy(id="name")
	private WebElement name;
	@FindBy(xpath="//small[text()='Enter valid mail Id']")
	public WebElement asert;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="phone")
	private WebElement phone;
	
	public ValidEmail(WebDriver  driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
	public void setPhone(String strph)
	{
		   phone.sendKeys(strph);
	}

	public void setEmail(String strrepass)
	{
		email.sendKeys(strrepass);
	}

	public void setName(String strName)
	{
		name.sendKeys(strName);
	}

}
