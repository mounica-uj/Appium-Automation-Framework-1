package com.powderhook.appium.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.powderhook.appium.utilities.ConfigUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Base {

	public static AppiumDriver<WebElement> appium = null;
	public static ConfigUtil config = new ConfigUtil("config.properties");

	public static DesiredCapabilities capabilities = new DesiredCapabilities();
	public static String testMethodName = null; 
	@BeforeClass
	public static void setUp() {
		capabilities.setCapability("platformName", config.getProperty("platformName"));

		capabilities.setCapability("VERSION", config.getProperty("androidVersion"));
		capabilities.setCapability("deviceName", config.getProperty("deviceName"));
		capabilities.setCapability("appPackage", config.getProperty("appPackage"));
		capabilities.setCapability("appActivity", config.getProperty("appActivity"));
		capabilities.setCapability("newCommandTimeout", "120000");
		capabilities.setCapability("noReset", "true");
		try {
			appium = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			appium.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println(appium.getContext());
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	@BeforeMethod
	public void nameBefore(Method method)
	{
		testMethodName = method.getName();
		System.out.println("Test name: " + method.getName());       
	}
	@AfterClass
	public static void tearDown(ITestContext it) {
		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		//Logcat:
				try {
					String logPath = "C:\\Users\\MounicaJhansi\\Documents\\";
					DateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_HH-mm-ss");
					Date todayNow = Calendar.getInstance().getTime();
					String reportDate = sdf.format(todayNow);
					List<LogEntry> logEntries = appium.manage().logs().get("logcat").filter(Level.ALL);
					File logFile = new File(logPath + reportDate + "_" + testMethodName + "_.txt");
					PrintWriter logfile;
					logfile = new PrintWriter(logFile);
					logfile.println(logEntries);
					logfile.flush();
					logfile.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
		appium.closeApp();
		appium.quit();
		
		
	}

}
