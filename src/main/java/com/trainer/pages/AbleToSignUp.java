package com.trainer.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbleToSignUp {
	WebDriver driver;
	
	@FindBy(id="name")
	private WebElement name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="phone")
	private WebElement phone;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="h_qualification")
	private WebElement h_qualification;
	@FindBy(id="skillSet")
	private WebElement skillSet;
	@FindBy(id="company_name")
	private WebElement company_name;
	@FindBy(id="designation")
	private WebElement designation;
	
	
	
	//clickSignup
	@FindBy(className="btn btn-primary")
	private WebElement bttn;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="re_password")
	private WebElement re_password;
	
//	@FindBy(id="img")
	//private WebElement img;
	 //WebElement upload_file = driver.findElement(By.id("img"));
	

public AbleToSignUp(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}
//Set user name in textbox
public void setName(String strName){
	name.sendKeys(strName);}
//Click on login button
public void setQualification(String strQualification){
	h_qualification.sendKeys(strQualification);     
}
//Set password in password textbox
public void setSkillSet(String strSkill){
   skillSet.sendKeys(strSkill);
}

public void setCompanyName(String strCompanyName){
	company_name.sendKeys(strCompanyName);     
}
//Set password in password textbox
public void setDesignation(String strDesignation){
	designation.sendKeys(strDesignation);
}


//Set password in password textbox
public void setAddress(String strAddress){
   address.sendKeys(strAddress);
}

public void setPhone(String strph){
	   phone.sendKeys(strph);
	}

public void setEmail(String strrepass){
	email.sendKeys(strrepass);
	}



public void setPassword(String strpass){
	   password.sendKeys(strpass);
	}

public void setRePassword(String strrepass){
	re_password.sendKeys(strrepass);
	}

//public void setImage(String strimg){
	//img.sendKeys(strimg);
//}
//upload_file.sendKeys("C:\\Users\\test\Downloads\\file.jpg");

/*public void clickSignup(){
	bttn.click(); */
}