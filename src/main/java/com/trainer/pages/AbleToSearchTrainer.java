package com.trainer.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class AbleToSearchTrainer {
	////input[@class='search form-control ng-pristine ng-valid ng-touched']
	WebDriver driver;

	//Login Test case
	// ----------------------------------------------------------------------------------------------
	@FindBy(id="floatingInput")
	private WebElement uname;
	@FindBy(id="floatingPassword")
	private WebElement passwd;
	@FindBy(xpath="//button[@class= 'w-100 btn btn-lg btn-primary']")
	private WebElement bttn;

	// ----------------------------------------------------------------------------------------------Allocate

	@FindBy(linkText="Login")
	WebElement clkLink;

	@FindBy(xpath="//input[@type='text']")
	private WebElement search;

	// ---------------------------------------------------------------------------------------------//

	@FindBy(xpath="//a[@class= 'nav-link']")
	private WebElement signup;
	
	@FindBy(xpath="a[@class='nav-link']")
	private WebElement allocate;
	@FindBy(xpath="//input[@class='search form-control ng-pristine ng-valid ng-touched']")
	private WebElement search1;
	@FindBy(linkText="Allocate")
	private WebElement search2;
	@FindBy(linkText="Allocate")
	WebElement clkAllocate;
	@FindBy(xpath="//div[@class='scoll']/table/tbody/tr/td/a[text()='Allocate']")
	//@FindBy(path=linkText="Allocate")
	WebElement clkAllocateTB;

	@FindBy(xpath="//select[@id='courseid']")
	WebElement selct;
/*
	@FindBy(xpath="//option[text()='FSD']")
	WebElement option;
	@FindBy(xpath="//small[text()='Choose a course ID']")
	WebElement optionclose;
*/
	@FindBy(xpath="//*[@id=\"batchid\"]")
	WebElement batchid;
	
	@FindBy(xpath="//option[text()='FSD001']")
	WebElement batchid1;
	////select[@id='batchid']
//	@FindBy(xpath="//small[text()='Choose a Batch ID']")
//	public WebElement batchid2;
	
	@FindBy(xpath="//select[@id='scheduletime']")
	public WebElement scedule;
	
	/*//select[@id='courseid'] //select[@id='courseid']/option[text()='FSD'] //small[text()='Choose a course ID']
	 * //select[@id='batchid']
	//option[text()='FSD001']
	 * Choose a Batch ID
	
	Select select = new Select(driver.findElement(By.xpath("//select")));
	WebElement option = select.getFirstSelectedOption();
	//String defaultItem = option.getText();
	//System.out.println(defaultItem );
	
	
	var option = driver.FindElement(By.Id("employmentType"));
        var selectElement = new SelectElement(option);
        Task.Delay(3000).Wait();
        selectElement.SelectByIndex(2);
        Console.Read();
	*/
	// ----------------------------------------------------------------------------------------------////

	public AbleToSearchTrainer(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	
	public void clickLoginLink(){
		clkLink.click();
	     }


	//Login Test Case	 
	//---------------------------------------------------------------------------------------------	 	 
		 
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
			
			
			public void search1(String searchName){
				search.sendKeys(searchName);
			     }
			public void clickAllocateLink(){
				clkAllocate.click();
		         }
			public void clickAllocateTB(){
				clkAllocateTB.click();
		         }
			public void search2(){
				search2.click();
			     }
	
			public void option(String str){
				selct.sendKeys("FSD");
				//option.click();
				//optionclose.click();
				
			}
			
	public void batch(String str)
			{
				batchid.sendKeys("FSD001");
				//Select courses=new Select(driver.findElement(By.id("courseid")));
				//courses.deselectByVisibleText("FSD001");
				
		//	batchid1.click();
			//	batchid2.click();
			    }
	public void SCEDULE(String str){
		scedule.sendKeys("15:30");
		//option.click();
		//optionclose.click();
		
	}
			    

}
