package com.mahasevakendra.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahasevakendra.keywords.UIKeywords;

public class HomePage {
	UIKeywords keyword = UIKeywords.getInstance();

	@FindBy(css = "div#navbarContent li:nth-child(1)")
	public WebElement jointMeetingTab;

	public HomePage() {
		PageFactory.initElements(keyword.driver, this);
	}

	public void clickOnJoinMeetingTab() {
		jointMeetingTab.click();
	}
}
