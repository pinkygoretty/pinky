package com.appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ChromeTest {

@Test
	public void openBrowser() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability( CapabilityType.ACCEPT_SSL_CERTS, true );
		capabilities.setCapability( CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability( "deviceName", "Nexus" );
		capabilities.setCapability( "udid", "ZY223CRMQP" );
		capabilities.setCapability( CapabilityType.VERSION, "4.4.4" );
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities );
Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
	}
}
