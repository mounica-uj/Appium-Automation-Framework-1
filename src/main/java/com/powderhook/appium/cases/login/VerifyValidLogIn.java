package com.powderhook.appium.cases.login;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.utilities.ReadExcel;

public class VerifyValidLogIn extends ActionHelper{
	
	static File file = new File("src/main/resources/TestData.xls");
	static String absolutePath = file.getAbsolutePath();
	public static ReadExcel excel1 = new ReadExcel(absolutePath,
			"Sheet1");
	@Test
	public void verifyLogin() throws InterruptedException {
		
			LoginPage.VerifiedLogin(excel1.getCellValue("valid", "id"),
					excel1.getCellValue("valid", "password"));	
		Thread.sleep(5000);
		
		WebElement Home = findByXapth(HomeScreen.HomeButton);
		Assert.assertTrue(Home.isEnabled());
	    
		//VerifyValidLogout.verifyLogout();
		
		
	  			
			
	
	}	
}
