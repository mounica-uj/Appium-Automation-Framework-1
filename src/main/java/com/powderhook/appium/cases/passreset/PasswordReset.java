package com.powderhook.appium.cases.passreset;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.JoinNowScreen;
import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;

public class PasswordReset extends ActionHelper{
	
	@Test
	public void passReset() throws InterruptedException 
	{
		Thread.sleep(4000);
		click(JoinNowScreen.LoginButton);
		
		appium.findElement(By.xpath(LoginScreen.PassResetLinkText)).click();
		Thread.sleep(2000);
		
		WebElement clickReset = findByXpath(LoginScreen.PassResetButton);
		clickReset.click();
		
		//Correct email was entered and click the button
		type(LoginScreen.PassResetText,"202003021353s3@s3gov.com");
		clickReset.click();
		
		
		//inCorrect email was entered and click the button and check error
		type(LoginScreen.PassResetText,"sowoyemis3+s3ph@gmail.com");
		Thread.sleep(2000);
		clickReset.click();
		
		//Correct email was entered and click the button
		type(LoginScreen.PassResetText,"202003021711s3@s3gov.com");
		Thread.sleep(1000);
		
		
		clickReset.click();
		Thread.sleep(7000);
	}	
}

