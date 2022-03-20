package com.trainer.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	@FindBy(linkText="Login")
	WebElement clkLink;
	public HomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(linkText="Sign Up/Enroll")
	 WebElement signup;
	public void clickLoginLink() {
			// TODO Auto-generated method stub
			signup.click();
		}

//	_______________________________
	
		
		@FindBy(id="name")
		public WebElement name;
		@FindBy(id="email")
		public WebElement email;
		@FindBy(id="phone")
		public WebElement phone;
		@FindBy(id="address")
		public WebElement address;
		@FindBy(id="h_qualification")
		public WebElement h_qualification;
		@FindBy(id="skillSet")
		public WebElement skillSet;
		@FindBy(id="company_name")
		public WebElement company_name;
		@FindBy(id="designation")
		public WebElement designation;
		@FindBy(id="password")
		public WebElement password;
		@FindBy(id="re_password")
		public WebElement re_password;
//		@FindBy(css=".btn btn-primary")
//		private WebElement bttn2;
		
		@FindBy(linkText="Logout")
		public WebElement clkLinkLogOut;
		
		@FindBy(xpath="//button[@type='submit]")
		public WebElement bttn11;
		@FindBy(xpath="/html/body/app-root/app-sign-up/form/button")
		public WebElement bttn1;
		
		////span[@class='dropdown-btn']
		//private WebElement password;
		////input[@type='checkbox']
		////div[@class='dropdown-list']
		
		@FindBy(xpath="//span[@class='dropdown-btn']")
		public WebElement dropdown;
		
		@FindBy(xpath="//div[@class='dropdown-list']")
		public WebElement dropdown1;
		
		@FindBy(xpath="//div[text()='Full Stack Development']")
		public WebElement list1;
		
		@FindBy(xpath="//input[@type='checkbox']")
		public WebElement list2;
		
		
		//By.cssselector("btn btn-primary")
		//@FindBy(cssselector='btn btn-primary')
//		Driver.Instance.FindElement(By.CssSelector("btn btn-primary"))
		
	/*	@FindBy(xpath="//span[@class='dropdown-btn']]")
		private WebElement hide;
		
		
		
		*/
		//@FindBy(className=("button[class='btn btn-lg new-meeting']"))
		
		//@FindBy(how=How.CSS, using="button:contains('Sign Up')") WebElement bttn;
		
		//@FindBy(xpath="//button[text()='Sign Up']")
		//private WebElement bttn;

		
		@FindBy(id="img")
		public WebElement img;
		
		
	
		


		public void setName(String strName)
		{
			name.sendKeys(strName);
		}
		public void setQualification(String strQualification){
			h_qualification.sendKeys(strQualification);     
		}
		public void setSkillSet(String strSkill)
		{
			   skillSet.sendKeys(strSkill);
		}

		public void setCompanyName(String strCompanyName)
		{
				company_name.sendKeys(strCompanyName);     
		}
			
		public void setDesignation(String strDesignation)
		{
				designation.sendKeys(strDesignation);
		}
			
		public void setAddress(String strAddress)
			{
			   address.sendKeys(strAddress);
			}

		public void setPhone(String strph)
			{
				   phone.sendKeys(strph);
			}

		public void setEmail(String strrepass)
			{
				email.sendKeys(strrepass);
			}

		public void setPassword(String strpass)
			{
				   password.sendKeys(strpass);
			}

		public void setRePassword(String strrepass)
			{
				re_password.sendKeys(strrepass);
			}
		
		/*public void setProfilePic()
		{
			File file=new File(getClass().getClassLoader().getResource("image.jpg").getFile());
			String imgPath=file.getAbsolutePath();
			WebElement choosefile=driver.findElement(By.id("img"));
			choosefile.sendKeys(imgPath);
		}
		*/
		
		
		public void setImage(String strimg)
		{
			img.sendKeys("C:\\Users\\Asus\\Desktop\\TT\\TrainerManagement1\\src\\test\\resources\\image.jpg");
			
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
		public void setDropdown()
		{
			dropdown.click();
			dropdown1.click();
			list1.click();
		//	list2.click();
			//dropdown.click();
			//dropdown1.click();
		//hide.click();
			
		dropdown1.click();
		}
		

	}

