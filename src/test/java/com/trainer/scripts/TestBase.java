package com.trainer.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
WebDriver driver;
	
    public static Properties prop = null;
    
   // String driverPathChrome ="E:\\jmeterchromedriver.exe " ;

    String driverPathChrome ="E:\\\\NORKA\\\\Swaglabs1\\\\driver1\\\\chromedriver.exe " ;
    String driverPathFirefox = " ";

    public static void TestFunction() {
        try {
        	
            prop = new Properties();
        
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources" + "/config.properties");
      
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
}

    //@Parameters("browser") 
  @SuppressWarnings("deprecation")
@BeforeTest
    //public void onSetup(String browserName) 
    public void onSetup(){
    TestFunction(); 
    String browserName = prop.getProperty("browser");

    if (browserName.equals("chrome")) {
    	System.setProperty("webdriver.chrome.driver", driverPathChrome);
        driver = new ChromeDriver();

    }
else if (browserName.equals("firefox")) {
    	System.setProperty("webdriver.gecko.driver", driverPathFirefox);
        driver = new FirefoxDriver();
    }
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
    driver.manage().window().maximize();   
}

@SuppressWarnings("static-access")
@AfterMethod
public void tearDown(ITestResult iTestResult) throws IOException {
    if (iTestResult.FAILURE == iTestResult.getStatus()) {
        takeScreenshot(iTestResult.getName());
    }
}
public String takeScreenshot(String name) throws IOException {
	

    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    
    String destination =  System.getProperty("user.dir") + "//target//" + name + dateName
            + ".png";
   
    File finalDestination = new File(destination);
 
    FileUtils.copyFile(source, finalDestination);
    return destination;   
}

@AfterTest
public void quitBrowser() throws IOException {
    //driver.quit();
}

}
