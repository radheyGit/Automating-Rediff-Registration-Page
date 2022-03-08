package com.rediff.net.regpage.libraries;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rediff.net.regpage.utils.AppUtils;

public class AutomatingRediffRegPage_Ruhi extends AppUtils {
	/***
	 * Scenario : Find Total TextBoxes present into the page
	 * 
	 * Step 01: check all TextBoxes are displayed or not
	 * Step 02: get name Attribute value using driver.getAttribute(); method
	 * Step 03: print all of them into console
	 * 
	 * */
	
	private static final Logger log=Logger.getLogger(AutomatingRediffRegPage_Ruhi.class.getName());
	
	public boolean isFullNameDisplayed(){
		boolean isTrue=false;
		log.info("isFullNameDisplayed started.");
		WebElement fullName = driver.findElement(By.id("fullname"));
		if(fullName.isDisplayed()){
			isTrue=true;
		}
		log.info("isFullNameDisplayed end.");
		return isTrue;
	}
}
