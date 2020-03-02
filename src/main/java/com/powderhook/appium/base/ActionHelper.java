package com.powderhook.appium.base;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionHelper extends Base {

	public static WebElement findById(String id) {

		return appium.findElement(By.id(id));
	}
	
	public static WebElement findByLinkText(String LinkText) {

		return appium.findElement(By.linkText(LinkText));
	}
	public static WebElement findByXapth(String xpath) {

		return appium.findElement(By.xpath(xpath));
	}

	public static List<WebElement> findElementsByXapth(String xpath) {

		return appium.findElements(By.xpath(xpath));
	}

	public static void click(String xpath) {
		boolean res = false;
		try {
			findByXapth(xpath).click();
			res = true;
		} catch (Exception e) {
			e.printStackTrace();
			res = false;
		} finally {
			if (!res) {
				try {
					screenShot();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}

	}

	
	public static void screenShot() throws Throwable {
		File scrFile = ((TakesScreenshot) appium)
				.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("screenshots/"+
		Base.testMethodName+"_"+System.currentTimeMillis()+".jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean waitForElementPresent(String xpath) {
		boolean res = false;
		try {
			WebDriverWait wait = new WebDriverWait(appium, 60);
			res = wait.until(ExpectedConditions.visibilityOf(appium.findElement(By.xpath(xpath)))) != null;
		} catch (Exception e) {

		}
		return res;
	}
	

	public static boolean waitForElementClickable(String xpath) {
		boolean res;
		res = false;
		WebDriverWait wait = new WebDriverWait(appium, 5);
		res = wait.until(ExpectedConditions.elementToBeClickable(appium.findElement(By.xpath(xpath)))) != null;
		return res;
	}

	public static void type(String xpath, String text) {

		findByXapth(xpath).sendKeys(text);
	}
	
	
	public void scroll(String xpath) throws InterruptedException
	{
		Dimension dimensions = appium.manage().window().getSize();
		try {
			int i =1;
		while((!waitForElementPresent(xpath))&(i<50))
		{
			Double screenHeightStart = dimensions.getHeight() * 0.5;

			int scrollStart = screenHeightStart.intValue();

			Double screenHeightEnd = dimensions.getHeight() * 0.2;

			int scrollEnd = screenHeightEnd.intValue();

			appium.swipe(0, scrollStart, 0, scrollEnd, 2000);
			System.out.println("Scrolled");
			i++;
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		}
	
}
