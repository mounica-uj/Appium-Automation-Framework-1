package com.powderhook.appium.cases.joinnow;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.JoinNowScreen;
import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.utilities.ReadExcel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NewUser extends ActionHelper{
	
	@Test
	public void JoinNow() throws InterruptedException 
	{
	
		Thread.sleep(4000);
		click(JoinNowScreen.LoginButton);
		
		Thread.sleep(4000);
		click(JoinNowScreen.lstJoinNow);
		
		click(JoinNowScreen.lstJoinNow);
		
		type(JoinNowScreen.FirstName,"John");
		type(JoinNowScreen.LastName,"Van");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime today = LocalDateTime.now();
		
		String uniqueId = formatter.format(today);
		String text = uniqueId.replaceAll("[^a-zA-Z0-9]", "");
		
		type(JoinNowScreen.Handle,"S3"+text);
		String email = text + "s3@s3gov.com";
		type(JoinNowScreen.Email,email);
		System.out.println(email);
		type(JoinNowScreen.PasswordTwo,"Zoom2020");
		type(JoinNowScreen.PasswordOne,"Zoom2020");
		
		//I need to add a working SCROLL HERE so that Appium can click button
		WebElement ClickSignUp = findByXapth(JoinNowScreen.SignUpButton);
		ClickSignUp.click();
		Thread.sleep(7000);
		
	}	

}
