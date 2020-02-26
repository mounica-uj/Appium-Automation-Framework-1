package com.powderhook.appium.cases.community;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.cases.login.VerifyValidLogIn;
import com.powderhook.appium.cases.login.VerifyValidLogout;
import com.powderhook.appium.common.CommunityPage;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.utilities.ReadExcel;



public class VerifyCommunityScreen extends ActionHelper {
	
	
	@Test
<<<<<<< HEAD
	public void verifyCommunityScreenFunctinality() throws InterruptedException {
=======
	public void verifyCommunityScreenFcuntinality() throws InterruptedException {
>>>>>>> ccb3f1912f90b2adc60f710ca0483600fe6abedf
		
		
		VerifyValidLogIn login  = new VerifyValidLogIn();
		login.verifyLogin();
	    
		CommunityPage.VerifiedCommunityScreenFunctionality();
		
		
<<<<<<< HEAD
=======
		
	
		
	
>>>>>>> ccb3f1912f90b2adc60f710ca0483600fe6abedf
	}	
}
