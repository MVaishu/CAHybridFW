package com.md.pageObj;


import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.MenuUi;

public class MenuPg {
	
	WebDriver driver;
	WDHelper helper;
	MenuUi ui;
	
	public MenuPg(WebDriver driver) {
		this.driver=driver;
		helper=new WDHelper();
		ui=new MenuUi() ;
	}
	
	public void clickOnMenu() {
		helper.clickOn(ui.menu,driver);
		System.out.println("Successfully clicked on rental");
	}
	
	public void clickOnProp() {
		helper.clickOn(ui.prop,driver);
		System.out.println("Successfully clicked on Post your property");
	}
	
	public String getPropTitle() {
		String data=helper.getText(ui.proptitle,driver);
		return data;
	}
	

}
