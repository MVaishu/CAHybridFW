package com.md.pageObj;

import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.FreePostingUi;

public class FreePostingPg {
	WebDriver driver;
	WDHelper helper;
	FreePostingUi ui;

	public FreePostingPg(WebDriver driver) {
		this.driver = driver;
		helper = new WDHelper();
		ui = new FreePostingUi();
	}

	public void clickOnFreeP() {
		helper.clickOn(ui.post, driver);
		System.out.println("Successfully clicked on Free Posting");
	}


}
