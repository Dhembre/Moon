package com.mahasevakendra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mahasevakendra.keywords.UIKeywords;

public class JoinMeetingPage {
	UIKeywords keyword = UIKeywords.getInstance();
	//1st Approch
	@FindBy(css = "div.joinmeeting")
	public WebElement quickJoinMeetingTitle;

	public String getQuickJoinMeetingTitle() {
	return quickJoinMeetingTitle.getText();
	}

	/*
	 * /2nd Approch public By
	 * quickJoinMeetingTitle=By.cssSelector("div.joinmeeting"); public String
	 * getQuickJoinMeetingTitle() { return
	 * keyword.driver.findElement(quickJoinMeetingTitle).getText() ; }
	 */
	//3rg Approch
	/*@FindBy(how=How.CSS,using="div.joinmeeting")
	public WebElement quickJoinMeetingTitle;
	public JoinMeetingPage() {
		PageFactory.initElements(keyword.driver, this);
	}
	public String getQuickJoinMeetingTitle() {
		return quickJoinMeetingTitle.getText();
	}*/
}
