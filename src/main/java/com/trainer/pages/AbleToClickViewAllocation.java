package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbleToClickViewAllocation {
WebDriver driver;
	
	@FindBy(id="floatingInput")
	private WebElement uname;
	@FindBy(id="floatingPassword")
	private WebElement passwd;
	@FindBy(xpath="//button[@class= 'w-100 btn btn-lg btn-primary']")
	private WebElement bttn;

	// ----------------------------------------------------------------------------------------------

	@FindBy(linkText="Login")
	WebElement clkLink;

	@FindBy(linkText="ViewAllocation")
	WebElement clkViewAllocation;

}
