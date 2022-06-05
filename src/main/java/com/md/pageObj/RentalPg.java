package com.md.pageObj;


import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.RentalUi;

public class RentalPg {
	
	WebDriver driver;
	WDHelper helper;
	RentalUi ui;
	
	public RentalPg(WebDriver driver) {
		this.driver=driver;
		helper=new WDHelper();
		ui=new RentalUi() ;
	}
	
	public void clickOnrental() {
		helper.clickOn(ui.rental,driver);
		System.out.println("Successfully clicked on rental");
	}

}
