package com.md.pageObj;

import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.AvoidUi;

public class AvoidPG {

	WebDriver driver;
	WDHelper helper;
	AvoidUi ui;

	public AvoidPG(WebDriver driver) {
		this.driver = driver;
		helper = new WDHelper();
		ui = new AvoidUi();
	}

	public void clickOnAvoid() {
		helper.clickOn(ui.avoid, driver);
		System.out.println("Successfully clicked on Avoid Brokers");
	}

	public void clickOnAboutUs() {
		helper.clickOn(ui.about, driver);
		System.out.println("Successfully clicked on About Us");
	}
	
	public String getAboutTitle() {
		String data=helper.getText(ui.about,driver);
		return data;
	}

}
