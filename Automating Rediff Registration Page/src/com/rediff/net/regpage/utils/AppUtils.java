package com.rediff.net.regpage.utils;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtils {

	private static final Logger log=Logger.getLogger(AppUtils.class.getName());
	public static WebDriver driver;
	
	public static final String url="https://is.rediff.com/signup/register";
	
	public static void launchApp() {
		log.info("launch App method start...");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		log.info("launch App method end...");
	}
	
	public static void closeApp() {
		log.info("closeApp method start...");
		driver.close();
		log.info("closeApp method end...");
	}
}
