package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) {
		try {
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishnu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
				}
			else {
				throw new Exception("not a valid browsername");
				}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		
		}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void mouseHover(WebElement element) {
		try {
			Actions ac=new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void inputValues(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
