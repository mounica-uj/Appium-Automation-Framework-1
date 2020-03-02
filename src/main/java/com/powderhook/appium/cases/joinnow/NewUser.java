package com.powderhook.appium.cases.joinnow;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.powderhook.appium.OR.CommunityScreen;
import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.JoinNowScreen;

import com.powderhook.appium.base.ActionHelper;

import io.appium.java_client.TouchAction;

public class NewUser extends ActionHelper{
	
	@Test
	public void JoinNow() throws InterruptedException 
	{
	
		Thread.sleep(2000);
		click(JoinNowScreen.LoginButton);
		
		Thread.sleep(2000);
		
		appium.findElement(By.xpath("//*[@resource-id='phLoginJoinBtn']")).click();
		
		
		TouchAction ts = new TouchAction(appium);
		ts.press(207, 582).moveTo(521, 1731).release().perform();
		
		type(JoinNowScreen.FirstName,"John");
		type(JoinNowScreen.LastName,"Sovereign");
		
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
		

		Thread.sleep(4000);
		WebElement ClickSignUp = findByXpath(JoinNowScreen.RememberMe);
		ClickSignUp.click();
		
		appium.findElement(By.xpath("//*[@resource-id='phJoinBtn']")).click();
		
		
		Thread.sleep(9000);
		
	}
	
	
	
	@Test
	public void clickEvents() throws InterruptedException 
	{
		System.out.println("Starting Event");
		WebElement clickEvents = findByXpath(HomeScreen.lstEvents);
		clickEvents.click();
		
		WebElement clickTodaysEvent = findByXpath(HomeScreen.lstTodaysEvent);
		clickTodaysEvent.click();
		Thread.sleep(2000);
		
		WebElement clickBack = findByXpath(CommunityScreen.ArrowBackButton);
		clickBack.click();
	}

}
