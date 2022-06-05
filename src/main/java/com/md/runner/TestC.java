package com.md.runner;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.md.pageObj.AvoidPG;
import com.md.pageObj.BaseClass;
import com.md.pageObj.ContactPg;
import com.md.pageObj.FAQPg;
import com.md.pageObj.FreePostingPg;
import com.md.pageObj.HomeServicesPg;
import com.md.pageObj.LinkedInPg;
import com.md.pageObj.RentalPg;
import com.md.pageObj.SitemapPg;
import com.md.pageObj.MenuPg;
import com.md.pageObj.PrivacyPg;
import com.md.utility.ReadPropertyFile;

public class TestC extends BaseClass {
	ReadPropertyFile read;

	@Test(priority = 1)
	public void test1() throws InterruptedException {

		logger = report.createTest("Post Property");
		logger.info("Starting Test to check sell or Rent your Property For Free is found or not");
		MenuPg m = new MenuPg(driver);
		m.clickOnMenu();
		m.clickOnProp();
		Assert.assertEquals(m.getPropTitle(), "Sell or Rent your Property For Free");
		logger.pass("post property assert successfully");
		driver.navigate().back();
	}

	@Test(priority = 2)
	public void test2() throws InterruptedException {
		logger = report.createTest("Avoid Brokers");
		logger.info("Starting Test to check whether click on Avoid Brokers or not");
		AvoidPG AP = new AvoidPG(driver);
		AP.clickOnAvoid();
		AP.clickOnAboutUs();
		Assert.assertTrue(AP.getAboutTitle().equals("About Us"), "not Found");
		logger.pass("About Us assert successfully");
	}

	@Test(priority = 3)
	public void test3() throws InterruptedException {
		logger = report.createTest("Contact Us");
		logger.info("Starting Test to check whether contact us title visible or not");
		ContactPg CP = new ContactPg(driver);
		CP.clickOnContact();
		Assert.assertTrue(CP.getContactTitle().equals("Contact Us"), "not Found");
		logger.pass("Contact Us assert successfully");

	}
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		logger = report.createTest("FAQ");
		logger.info("Starting Test to check whether click on FAQ or not");
		FAQPg FP = new FAQPg(driver);
		FP.clickOnFAQ();
		logger.pass("Successfully clicked on FAQ");
	}

	@Test(priority = 5)
	public void test5() throws InterruptedException {
		logger = report.createTest("Home Services");
		logger.info("Starting Test to check whether click on home services or not");
		HomeServicesPg HS = new HomeServicesPg(driver);
		HS.clickOnHomeS();
		Thread.sleep(3000);
		driver.navigate().back();
		logger.pass("Click on Home services Successfully");
	}

	@Test(priority = 6)
	public void test6() throws InterruptedException {

		logger = report.createTest("Rental Agreement");
		logger.info("Starting Test to check whether clicked on rental agreement or not");
		RentalPg RP = new RentalPg(driver);
		RP.clickOnrental();
		Thread.sleep(2000);
		driver.navigate().back();
		logger.pass("Clicked on rental agreement successfully");
	}

	@Test(priority = 7)
	public void test7() throws InterruptedException {
		logger = report.createTest("Privacy Policy");
		logger.info("Starting Test to check whether click on Privacy Policy or not");
		PrivacyPg PP = new PrivacyPg(driver);
		PP.clickOnPrivacy();
		Thread.sleep(2000);
		driver.navigate().back();
		logger.pass("Click on Privacy Policy successfully");
	}

	@Test(priority = 8)
	public void test8() throws InterruptedException {
		logger = report.createTest("Free Posting");
		logger.info("Starting Test to check whether click on Free Posting or not");
		FreePostingPg FP = new FreePostingPg(driver);
		FP.clickOnFreeP();
		Thread.sleep(3000);
		driver.navigate().back();
		logger.pass("Click on Free Posting successfully");
	}
	@Test(priority = 9)
	public void test9() throws InterruptedException {
		logger = report.createTest("Sitemap");
		logger.info("Starting Test to check whether click on Sitemap or not");
		SitemapPg SP = new SitemapPg(driver);
		SP.clickOnSiteMap();
		Thread.sleep(2000);
		logger.pass("Click on SiteMap successfully");
	}
	@Test(priority = 10)
	public void test10() throws InterruptedException {
		logger = report.createTest("LinkedIn");
		logger.info("Starting Test to check whether click on LinkedIn or not");
		LinkedInPg LP = new LinkedInPg(driver);
		LP.clickOnLinkedIn();
		Thread.sleep(2000);
		logger.pass("Click on LinkedIn successfully");
	}

	

}
