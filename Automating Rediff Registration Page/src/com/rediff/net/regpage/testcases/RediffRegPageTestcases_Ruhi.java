package com.rediff.net.regpage.testcases;



import java.util.logging.Logger;

import com.rediff.net.regpage.libraries.AutomatingRediffRegPage_Ruhi;
import com.rediff.net.regpage.utils.AppUtils;

public class RediffRegPageTestcases_Ruhi {

	private static final Logger log = Logger.getLogger(RediffRegPageTestcases_Ruhi.class.getName());
			

	public static void main(String[] args) throws InterruptedException {

		/***
		 * Step 01 : Launch Application using AppUtils.launchApp(); method Step
		 * 02 : Create Object of AutomatingRediffRegPage_Ruhi class
		 * 
		 * Test Cases :
		 * 
		 * Test case 01 : Write test case is all TextBoxes are Displayed or not
		 * Test case 02 : Check if all name printed in console or not
		 * 
		 * Step 03 : close App using AppUtils.closeApp(); method
		 * */

		AppUtils.launchApp();

		AutomatingRediffRegPage_Ruhi ruhi = new AutomatingRediffRegPage_Ruhi();
		
		// is Fullname texbox displayed or not
		if(ruhi.isFullNameDisplayed()){
			log.info("Full name Text box is Displayed test case passed...");
		}else {
			log.info("Full name Text box is not Displayed test case failed...");
		}
		
		Thread.sleep(2000);
		
		AppUtils.closeApp();
		
	}

}
