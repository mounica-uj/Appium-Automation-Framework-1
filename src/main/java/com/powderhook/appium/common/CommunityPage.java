package com.powderhook.appium.common;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.powderhook.appium.OR.CommunityScreen;
import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;

public class CommunityPage extends ActionHelper {

	public static boolean VerifiedCommunityScreenFunctionality() {
		boolean res = false;
		try {
			Thread.sleep(2000);
			click(HomeScreen.lstCommunity);
			click(CommunityScreen.MoreOptionsButton);
			click(CommunityScreen.ArrowBackButton);
			click(CommunityScreen.LocalExpert);
			Thread.sleep(2000);
			WebElement we = findByXpath(CommunityScreen.AskMeAnything);
			Assert.assertTrue(we.isEnabled());
			click(CommunityScreen.ArrowBackButton);
			Thread.sleep(2000);
			WebElement myCamps = findByXpath(CommunityScreen.MyCampsStrip);
			Assert.assertTrue(myCamps.isEnabled());
			
			Thread.sleep(2000);
			 WebElement IamFollowing = findByXpath(CommunityScreen.IAmFollowingStrip);
			//Assert.assertTrue(IamFollowing.isEnabled());
			IamFollowing.click();
			myCamps.click();
			Thread.sleep(2000);
			click(CommunityScreen.SuggestedCapms);
			Thread.sleep(2000);
			//click(CommunityScreen.JoinSuggestedCamps);
			WebElement join = findByXpath(CommunityScreen.JoinSuggestedCamps);
			Assert.assertTrue(join.isEnabled());
			click(CommunityScreen.ArrowBackButton);
			//Thread.sleep(2000);
			//click(CommunityScreen.LeaveSuggestedCamps);
						
			
			
			res = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}
