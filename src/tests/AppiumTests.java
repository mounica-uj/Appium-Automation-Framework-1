package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

@SuppressWarnings("unused")
public class AppiumTests {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setcapability(“autoWebview”,true);
		caps.setCapability("deviceName", "emulator-5554");
		//caps.setCapability("udid", "000"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("appPackage", "com.powderhook.app");
		caps.setCapability("appActivity", "com.powderhook.app.MainActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				
				//Click all homepage menu
				
			
				
				//tap(334, 1028).perform();
				
				TouchAction touchAction = new TouchAction(driver);
				touchAction.tap(new PointOption().withCoordinates(334, 1028)).perform();
				touchAction.tap(new PointOption().withCoordinates(398, 1451)).perform();
				
				
				
				//touchAction.tap(PointOption.point(334, 1028)).perform();
				
				//driver.findElementByClassName("e793d3cc-3e49-4601-9020-224af48fd2e9").click();
				driver.findElement(By.className("android.view.View")).click();
				
				
				//MobileElement el2 = (MobileElement) driver.findElement(By.className("2d12d829-584d-43f0-a830-3048fec01d70")).click();
				//el2.click();
				
				//driver.findElement(By.className("2d12d829-584d-43f0-a830-3048fec01d70")).click();
				
				//MobileElement el1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]\r\n"));
				//el1.click();
				
				//<span _ngcontent-sid-c3="">Reports</span>
				//#home > div > div.home-main-actions > ion-row > ion-col:nth-child(2) > div > span
				//*[@id="home"]/div/div[2]/ion-row/ion-col[2]/div/span
				
				
			
		} 
		catch (MalformedURLException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}