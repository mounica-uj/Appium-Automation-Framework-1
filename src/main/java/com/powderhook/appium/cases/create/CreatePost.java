package com.powderhook.appium.cases.create;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.powderhook.appium.OR.CreateCenter;
import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.utilities.ReadExcel;

public class CreatePost extends ActionHelper{
	
	static File file = new File("src/main/resources/TestData.xls");
	static String absolutePath = file.getAbsolutePath();
	public static ReadExcel excel1 = new ReadExcel(absolutePath,
			"Sheet1");
	
	 //Logging in fails intermittently + this screen is working progress
	
	@Test
	public void verifyLogin() throws InterruptedException 
	{
		
			LoginPage.VerifiedLogin(excel1.getCellValue("valid", "id"),
					excel1.getCellValue("valid", "password"));	
		Thread.sleep(5000);
		
		WebElement Home = findByXapth(HomeScreen.HomeButton);
		Assert.assertTrue(Home.isEnabled());
	    
	}	
	@Test
	public void CreateSimplePost() throws InterruptedException 
	{
		WebElement clickAddButton = findByXapth(CreateCenter.AddButton);
		clickAddButton.click();
		Thread.sleep(144000);
		
		WebElement clickTextBox = findByXapth(CreateCenter.Textbox);
		clickTextBox.click();
		
		/*
		
		WebElement clickBack = findByXapth(CommunityScreen.ArrowBackButton);
		clickBack.click();*/
	}	
}
