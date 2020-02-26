package com.powderhook.appium.cases.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.utilities.ReadExcel;

public class VerifyValidLogout extends ActionHelper{
	
	/*public static ReadExcel excel1 = new ReadExcel(config.getProperty("TestData"),
			config.getProperty("sheetName1"));*/
	@Test
	public static void verifyLogout() {
			/*LoginPage.VerifiedLogin(excel1.getCellValue("valid", "id"),
					excel1.getCellValue("valid", "password"));*/
			
			LoginPage.VerifiedLogout();
			Assert.assertTrue(waitForElementPresent(LoginScreen.signInButton));
	
	}

}
