package com.appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NativeAppTest {
	public AppiumDriver driver=null;
	@Test
	public void openApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability( CapabilityType.ACCEPT_SSL_CERTS, true );
		//capabilities.setCapability( CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability( "deviceName", "Nexus" );
		capabilities.setCapability( "udid", "ZY223CRMQP" );
		capabilities.setCapability( CapabilityType.VERSION, "4.4.4" );
		capabilities.setCapability("appPackage", "com.android.contacts");
		capabilities.setCapability("appActivity",".activities.PeopleActivity");
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities );
Thread.sleep(10000);


	}
	
}
