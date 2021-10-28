package com.mahasevakendra.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains UI Keywords which are applicable for WebElementa and
 * general actions This is a Singleton class to create object of this class ,
 * use {@code getInstance} method
 * 
 * @author Manisha
 *
 */
public class UIKeywords {
	public RemoteWebDriver driver = null;
	private static UIKeywords uikeywords;
	static {
		uikeywords = new UIKeywords();
	}

	public static UIKeywords getInstance() {
		return uikeywords;

	}

	private UIKeywords() {

	}

	/**
	 * This keywords are use to launch specified browser.
	 * 
	 * @param browserName must one the following
	 *                    <ul>
	 *                    <li>chrome</li>
	 *                    <li>firefox</li>
	 *                    <li>opera</li>
	 *                    </ul>
	 * 
	 */
	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else {
			System.out.println("Invalid browsername: " + browserName);
		}
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void enterText(WebElement element, String enterTotext) {
		element.sendKeys(enterTotext);
	}/**
	*
	*In nextversion of framework , this method will be deleted.Instead you can enterText(String object, String textToEnter)
	*@param locatorType
	*@param locatorValue
	*@param textToEnter
	*
	*/
	
	
@Deprecated
	public void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
	}

	public WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element = null;
		if (locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("linktest")) {
			element = driver.findElement(By.linkText(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("partiallinktest")) {
			element = driver.findElement(By.partialLinkText(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("tagname")) {
			element = driver.findElement(By.tagName(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("class")) {
			element = driver.findElement(By.className(locatorValue));
		}
		return element;
	}

	public String gettitle() {
		return driver.getTitle();

	}

	public void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

	public RemoteWebDriver getDriver() {
		return driver;
	}

	public void click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();

	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
	}

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
		
	}public void switchToFrame(String frame) {
		driver.switchTo().frame(frame);
		
	}

	public void enterText(String object, String textToEnter) {
     String [] parts=object.split("##");
     getWebElement(parts[0],parts[1]).sendKeys(textToEnter);
	}

}
