package com.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.appiumtest.NativeWasappTest;

public class WhatsappChat extends NativeWasappTest {
	@Test
	public void sms() throws MalformedURLException, InterruptedException{
		openApp();
		System.out.println("came");
		
		
	}
}
