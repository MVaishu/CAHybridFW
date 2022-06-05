package com.md.pageObj;

import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.HomeServicesUi;

public class HomeServicesPg {
	WebDriver driver;
	WDHelper helper;
	HomeServicesUi ui;

	public HomeServicesPg(WebDriver driver) {
		this.driver = driver;
		helper = new WDHelper();
		ui = new HomeServicesUi();
	}
	public void clickOnHomeS() {
		helper.clickOn(ui.homes, driver);
		System.out.println("Successfully clicked on Home Services");
	}
}
