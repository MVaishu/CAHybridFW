package com.md.pageObj;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.md.utility.BrowseFactory;
import com.md.utility.ExcelDataProvider;
import com.md.utility.ReadPropertyFile;
import com.md.utility.TakeScreenS;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ReadPropertyFile read;
	public ExtentTest logger;
	public ExtentReports report;
	public ExtentHtmlReporter extent;
	
	 
	@BeforeSuite
	public void setUpSuit() {
		 Reporter.log("Setting up report and test is getting ready",true);
		 excel=new ExcelDataProvider();
		 extent=new ExtentHtmlReporter(new File("./Reports/"+TakeScreenS.getcurrentDateTime()+".html"));
		 report=new ExtentReports();
		 Reporter.log("Setting done -Test can be started",true);
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException, IOException {
		
		
		
		 report.attachReporter(extent);
		excel=new ExcelDataProvider();
		
		read=new ReadPropertyFile();
		
		driver=BrowseFactory.startApplication(driver,read.getBrowser(),read.getUrl(),read.getDriver());
		System.out.println(driver.getTitle());
		/*HomePg home=new HomePg(driver);
		home.clickOnLogin();
		LoginPage login=new LoginPage(driver);
		login.sendNumber(excel.getNumberData("Sheet1", 0, 0));
		login.clickOnpass();
		login.sendPass(excel.getStringData("Sheet1", 1, 0));
		login.clickOnconti();*/
	}
	
	@AfterClass
	public void tearDown() {
		BrowseFactory.quitBroswer(driver);
	}
	
	@AfterMethod
	public void tearDownM(ITestResult result) throws IOException {
		
		Reporter.log("Test is about to end",true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakeScreenS.takeScreenShot(driver);
			logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenS.takeScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			TakeScreenS.takeScreenShot(driver);
			logger.pass("Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenS.takeScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			
			logger.skip("Test Skipped");
		}
		report.flush();
		Reporter.log("Test completed >>>Report generated",true);
	}
	
}



