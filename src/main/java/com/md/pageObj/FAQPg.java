package com.md.pageObj;

import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.FAQUi;

public class FAQPg {
	WebDriver driver;
	WDHelper helper;
	FAQUi ui;
	
	public FAQPg(WebDriver driver) {
		this.driver=driver;
		helper=new WDHelper();
		ui=new FAQUi() ;
	}
	
	public void clickOnFAQ() {
		helper.clickOn(ui.faq,driver);
		System.out.println("Successfully clicked on FAQ");
	}

}
