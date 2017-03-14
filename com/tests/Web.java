package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver f=new FirefoxDriver();
f.get("http://www.gmail.com");
f.findElement(By.id("Email")).sendKeys("pinky.goretty@gmail.com");

	}

	
}
