package com.md.pageObj;

import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.PrivacyUi;

public class PrivacyPg {
	WebDriver driver;
	WDHelper helper;
	PrivacyUi ui;

	public PrivacyPg(WebDriver driver) {
		this.driver = driver;
		helper = new WDHelper();
		ui = new PrivacyUi();
	}

	public void clickOnPrivacy() {
		helper.clickOn(ui.privacy, driver);
		System.out.println("Successfully clicked on Privacy Policy");
	}

}
