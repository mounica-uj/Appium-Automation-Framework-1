package com.powderhook.appium.cases.joinnow;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.CommunityScreen;
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
		
		
		//click(JoinNowScreen.lstJoinNow);
		
		appium.findElement(By.xpath("//*[@resource-id='phLoginJoinBtn']")).click();
		
		//appium.findElement(By.id("com.powderhook.app:id/phLoginJoinBtn")).click();
		//appium.findElement(By.id("phLoginJoinBtn")).click();
		//appium.findElement(By.xpath("//*[contains(@text,'JOIN')]")).click();
		
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
		appium.findElement(By.xpath("//*[@resource-id='phJoinBtn']")).click();
		
		/*WebElement ClickSignUpId = appium.findElement(By.id("phJoinBtn"));
		ClickSignUpId.click();*/
		
		//I need to add a working SCROLL HERE so that Appium can click button
		
		/*WebElement ClickSignUp = findByXapth(JoinNowScreen.SignUpButton);
		ClickSignUp.click();
		
		WebElement ClickSignUp2 = findByXapth(JoinNowScreen.SignUpButton2);
		ClickSignUp2.click();*/
		Thread.sleep(7000);
		
	}
	
	
	@Test
	public void clickFeed() throws InterruptedException 
	{
		WebElement clickFeed = findByXapth(HomeScreen.lstFeed);
		clickFeed.click();
		
		WebElement clickTheFirstLike = findByXapth(HomeScreen.lstFeedLike);
		clickTheFirstLike.click();
		Thread.sleep(4000);
		
		WebElement clickFirstComment = findByXapth(HomeScreen.lstFeedComment);
		clickFirstComment.click();
		
		type(HomeScreen.lstCommentBox,"I like this. Good job!");
	} 
	
	/*
	
	@Test
	public void clickEvents() throws InterruptedException 
	{
		WebElement clickEvents = findByXapth(HomeScreen.lstEvents);
		clickEvents.click();
		
		WebElement clickTodaysEvent = findByXapth(HomeScreen.lstTodaysEvent);
		clickTodaysEvent.click();
		Thread.sleep(2000);
		
		WebElement clickBack = findByXapth(CommunityScreen.ArrowBackButton);
		clickBack.click();
	}*/

}
