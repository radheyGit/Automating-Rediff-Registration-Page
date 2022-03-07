package com.rediff.net.regpage.libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	
	private static final Logger log=LoggerFactory.getLogger(AutomatingRediffRegPage_Ruhi.class);
	
	public boolean isFullNameDisplayed(){
		boolean isTrue=false;
		log.debug("isFullNameDisplayed started.");
		WebElement fullName = driver.findElement(By.id("fullname"));
		if(fullName.isDisplayed()){
			isTrue=true;
		}
		log.debug("isFullNameDisplayed end.");
		return isTrue;
	}
}
