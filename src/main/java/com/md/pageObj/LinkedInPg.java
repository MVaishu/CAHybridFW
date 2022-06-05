package com.md.pageObj;

import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.LinkedInUi;

public class LinkedInPg {
	WebDriver driver;
	WDHelper helper;
	LinkedInUi ui;

	public LinkedInPg(WebDriver driver) {
		this.driver = driver;
		helper = new WDHelper();
		ui = new LinkedInUi();
	}

	public void clickOnLinkedIn() {
		helper.clickOn(ui.link, driver);
		System.out.println("Successfully clicked on LinkedIn");
	}

}
