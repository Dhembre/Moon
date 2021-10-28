package com.mahaseva.uitest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mahasevakendra.config.BaseClass;
import com.mahasevakendra.keywords.UIKeywords;
import com.mahasevakendra.pages.HomePage;
import com.mahasevakendra.pages.JoinMeetingPage;
import com.mahasevakendra.utility.WaitFor;

public class HoMePaGeTeSt extends BaseClass {

UIKeywords keyword =  UIKeywords.getInstance();
@Test
public void verifyTitleOfHomePage() {
	String expectedTitle="IJmeet";
	Assert.assertEquals(keyword.driver.getTitle(),expectedTitle);
}
@Test
public void verifyIfUserRedirectsToJoinPage() {
//HomePage home=PageFactory.initElements(keyword.driver,HomePage.class);
HomePage home= new HomePage();
home.clickOnJoinMeetingTab();
JoinMeetingPage join=PageFactory.initElements(keyword.driver,JoinMeetingPage.class);
//JoinMeetingPage join=new JoinMeetingPage();
WaitFor.elementToBeVisible(join.quickJoinMeetingTitle, 10);
 String ss=join.getQuickJoinMeetingTitle();
//System.out.println(ss);
Assert.assertTrue(ss.contains("Quick"));;
//String ss1=keyword.getCurrentUrl();
//System.out.println(ss1);

}
}