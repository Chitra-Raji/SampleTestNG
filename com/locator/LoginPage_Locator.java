package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class LoginPage_Locator extends BaseClass{

	public static WebElement getLoginDetails(String data) {
		return driver.findElement(By.id(""+data+""));
		
	}
}
