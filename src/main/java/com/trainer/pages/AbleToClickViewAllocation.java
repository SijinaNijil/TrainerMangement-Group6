package com.trainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbleToClickViewAllocation {
WebDriver driver;
	
	@FindBy(id="floatingInput")
	private WebElement uname;
	@FindBy(id="floatingPassword")
	private WebElement passwd;
	@FindBy(xpath="//button[@class= 'w-100 btn btn-lg btn-primary']")
	private WebElement bttn;

	// ----------------------------------------------------------------------------------------------
public static String urlvw="https://trainermanagement.herokuapp.com/profile";
	@FindBy(xpath="//a[text()='My Allocation Details']")
	private WebElement clkViewAllocation;
	
	public AbleToClickViewAllocation(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
	public void vwAllocation()
	{
		driver.get(urlvw);
		clkViewAllocation.click();
		driver.navigate().refresh();
	}
	

}
