package com.mahasevakendra.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.mahasevakendra.keywords.UIKeywords;

public class BaseClass {
	UIKeywords keyword =  UIKeywords.getInstance();
	public  RemoteWebDriver driver=null;

	@BeforeMethod
	public void setup() {
		keyword.openBrowser("chrome");
		this.driver= keyword.getDriver();
		driver.get("https://ijmeet.com/");
	}

	@AfterMethod
	public void closebrowser() {
		keyword.closeBrowser();
	}
}
