package com.rediff.net.regpage.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppUtils {

	private static final Logger log=LoggerFactory.getLogger(AppUtils.class);
	public static WebDriver driver;
	
	public static final String url="https://is.rediff.com/signup/register";
	
	public static void launchApp() {
		log.debug("launch App method start...");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		log.debug("launch App method end...");
	}
	
	public static void closeApp() {
		log.debug("closeApp method start...");
		driver.close();
		log.debug("closeApp method end...");	
	}
}
