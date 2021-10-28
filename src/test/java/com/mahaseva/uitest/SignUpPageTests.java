package com.mahaseva.uitest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.mahasevakendra.config.BaseClass;
import com.mahasevakendra.keywords.UIKeywords;
import com.mahasevakendra.utility.Locator;
public class SignUpPageTests extends BaseClass {
	private static final Logger LOG = Logger.getLogger(SignUpPageTests.class);
	UIKeywords keyword = UIKeywords.getInstance();

	@Test
	public void validateFirstNameFieldForCorrectInput() throws InterruptedException {

		keyword.launchUrl("https://ijmeet.com");
		LOG.info("check");
		// Approch 1st
		// WebElement signUp =
		// keyword.getDriver().findElement(By.cssSelector("li:nth-child(5) a.nav-link
		// "));
		// keyword.click(signUp);
		// Approch 2nd
		keyword.click("css", "li:nth-child(5) a.nav-link ");// same above 2 line nd this 1
		keyword.enterText(Locator.SIGNUP_FULLNAME, "Manisha Dhembre");
		keyword.enterText(Locator.SIGNUP_COMPANYNAME, "Testing Shastra");
		keyword.enterText(Locator.SIGNUP_EMAIL, "info@testingshastra.com");
		keyword.enterText(Locator.SIGNUP_CONTACT, "7020812485");
		keyword.enterText(Locator.SIGNUP_PASSWORD, "Test@123");
		// Thread.sleep(5000);
		LOG.info("Switch inside a frame");
		keyword.switchToFrame(0);
		//WaitFor.elementToBeClickable(keyword.getWebElement("css", "div.recaptcha-checkbox-botrder"));
		keyword.click("css", "div.recaptcha-checkbox-botrder");
		keyword.switchToDefaultFrame();
		LOG.info("jumped from the frame");
		keyword.click("css", "button[type='submit']");
		String actualUrl = keyword.getCurrentUrl();
		// Assert.assertEquals(actualUrl,contains("dashboard"));

	}

	private String contains(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
