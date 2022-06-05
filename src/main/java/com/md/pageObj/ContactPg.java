package com.md.pageObj;

import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.ContactUi;

public class ContactPg {

	WebDriver driver;
	WDHelper helper;
	ContactUi ui;

	public ContactPg(WebDriver driver) {
		this.driver = driver;
		helper = new WDHelper();
		ui = new ContactUi();
	}

	public void clickOnContact() {
		helper.clickOn(ui.contact, driver);
		System.out.println("Successfully clicked on Contact Us");
	}
	
	public String getContactTitle() {
		String data=helper.getText(ui.contact,driver);
		return data;
	}

}
