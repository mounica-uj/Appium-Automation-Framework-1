package com.powderhook.appium.cases.feed;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

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

public class FeedAction extends ActionHelper
{
	
		@Test
		public void clickFeed() throws InterruptedException 
		{
			WebElement clickFeed = findByXpath(HomeScreen.lstFeed);
			clickFeed.click();
			
			WebElement clickTheFirstLike = findByXpath(HomeScreen.lstFeedLike);
			clickTheFirstLike.click();
			Thread.sleep(2000);
			
			WebElement clickFirstComment = findByXpath(HomeScreen.lstFeedComment);
			clickFirstComment.click();
			
			WebElement clickFirstAddReply = findByXpath(HomeScreen.lstFeedAddReply);
			clickFirstAddReply.click();
			
			type(HomeScreen.lstCommentBox,"I like this. Good job!");
			
			WebElement clickSend = findByXpath(HomeScreen.ClickSend);
			clickSend.click();
			Thread.sleep(8000);
		} 

}
