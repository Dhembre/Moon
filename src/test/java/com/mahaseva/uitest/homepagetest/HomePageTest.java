package com.mahaseva.uitest.homepagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mahasevakendra.config.BaseClass;
import com.mahasevakendra.keywords.UIKeywords;

//ThreadLocal
@Test
public class HomePageTest extends BaseClass {
	String expectedTitle="Testing Shastra | Training | Placement";
	UIKeywords keyword =  UIKeywords.getInstance();

	public void verifyTitleOfHomePage() {
		keyword.launchUrl("https://www.testingshastra.com");
		String ss=keyword.gettitle();
		Assert.assertEquals(ss, expectedTitle);
		System.out.println(ss);
	}
}
