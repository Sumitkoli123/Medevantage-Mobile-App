package com.medevantage.app.base;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {

	public static AndroidDriver<MobileElement> driver;
	// public Logger log = Logger.getLogger(BaseClass.class);
	//AppiumDriverLocalService appiumService;
	//String appiumServiceUrl;
	

	@BeforeSuite

	public void setup() throws IOException {

/*
		appiumService = AppiumDriverLocalService.buildDefaultService();
		appiumService.start();
		appiumServiceUrl = appiumService.getUrl().toString();
		System.out.println("Appium Service Address : " + appiumServiceUrl);
*/

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("deviceName", "Redmi Note 5 Pro");
		caps.setCapability("udid", "4ec3aa6f");
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("appPackage", "com.pc360.appmedevantage");
		caps.setCapability("appActivity", "com.pc360.appmedevantage.MainActivity");
		caps.setCapability(MobileCapabilityType.NO_RESET, true);
		// caps.setCapability("commandTimeouts","12000");
		// caps.setCapability(MobileCapabilityType.APP, "C:\\Automtion
		// tools\\Apps\\Medevantage.apk");

		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, caps);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public String getScreenshotPath(String methodName, AppiumDriver<MobileElement> driver) throws IOException {

		File screenshotFile = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);
		String destpath = System.getProperty("user.dir") + "\\Extent_Reports\\" + methodName + ".png";
		File file = new File(destpath);
		FileUtils.copyFile(screenshotFile, file);
		return destpath;
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
		//System.out.println(" Appium service Stopped");
		//appiumService.stop();
	}

}
