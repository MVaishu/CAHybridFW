package com.md.pageObj;

import org.openqa.selenium.WebDriver;

import com.md.reusable.WDHelper;
import com.md.uistore.SitemapUi;

public class SitemapPg {
	WebDriver driver;
	WDHelper helper;
	SitemapUi ui;
	
	public SitemapPg(WebDriver driver) {
		this.driver=driver;
		helper=new WDHelper();
		ui=new SitemapUi() ;
	}
	
	public void clickOnSiteMap() {
		helper.clickOn(ui.site,driver);
		System.out.println("Successfully clicked on sitemap");
	}

}
