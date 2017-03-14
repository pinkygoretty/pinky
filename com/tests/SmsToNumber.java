package com.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.appiumtest.NativeAppTest;

public class SmsToNumber extends NativeAppTest {
	@Test
	public void sms() throws MalformedURLException, InterruptedException{
		openApp();
		System.out.println("came");
		driver.findElement(By.id("com.android.contacts:id/menu_search")).click();
		driver.findElement(By.id("com.android.contacts:id/search_view")).sendKeys("pinky");
		driver.findElement(By.id("com.android.contacts:id/cliv_name_textview")).click();
		driver.findElement(By.name("Sms")).click();
		//driver.findElement(By.name("Call with Google Voice")).click();
		//Type message
		driver.findElement(By.id("")).sendKeys("Hi How r u?");
		// click send button
		driver.findElement(By.id("")).click();
		
	}

}
