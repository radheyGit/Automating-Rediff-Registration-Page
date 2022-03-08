package com.rediff.net.regpage.testcases;

import java.util.logging.Logger;

import com.rediff.net.regpage.utils.AppUtils;

public class RediffRegPageTestcases_Ravina {

	private static final Logger log = Logger.getLogger(RediffRegPageTestcases_Ravina.class.getName());
	
	public static void main(String[] args) throws InterruptedException {

		/***
		 * Step 01 : Launch Application using AppUtils.launchApp(); method
		 * Step 02 : Create Object of AutomatingRediffRegPage_Ravina class
		 * 
		 * Test Cases :
		 * 
		 * Test case 01 : Write test case is all Labels are Displayed or not
		 * Test case 02 : Check if all labels Text printed in console or not
		 * 
		 * Step 03 : close App using AppUtils.closeApp(); method
		 * */
		
		log.info("Application launched start...");
		AppUtils.launchApp();
		log.info("Application launched end...");
		
		Thread.sleep(2000);
		
		log.info("App closing start...");
		AppUtils.closeApp();
		log.info("App closing end...");
	}

}
