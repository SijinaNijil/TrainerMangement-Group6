package com.trainer.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainer.constants.AutomationConstants;
import com.trainer.pages.AbleToClickAllocateLink;
import com.trainer.pages.AbleToSearchTrainer;
import com.trainer.utilities.ExcelUtility;

public class AbleToSearchTestClass extends TestBase{
	AbleToSearchTrainer objSearch;
	
	@Test
    public void ableToClkLink() throws IOException, InterruptedException {
    //Create Login Page object
		objSearch = new AbleToSearchTrainer(driver);
    //login to application
		objSearch.clickLoginLink();
		
	       String uname = ExcelUtility.getCellData(1, 1);
	       objSearch.setUName(uname);
			
			String passwd = ExcelUtility.getCellData(2, 1);
			objSearch.setPasswd(passwd);
			
			objSearch.setButton();
		
			objSearch.clickAllocateLink();
			String searchName = ExcelUtility.getCellData(1, 4);
			objSearch.search1(searchName);
			objSearch.clickAllocateTB();
			objSearch.option("FSD");
		//	Thread.sleep(2000);
		objSearch.batch("FSD001");
			objSearch.SCEDULE("15:30");
		//	objSearch.search2();
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }

}
