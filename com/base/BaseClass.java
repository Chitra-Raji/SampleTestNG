package com.base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver = null;
	
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	public static void input_Data(WebElement element, String data) {
		element.sendKeys(data);
		
		try {
			element.sendKeys(data);
		}catch (TimeoutException e) {
			// TODO: handle exception
		}catch (NoSuchElementException e) {
			throw new RuntimeException("Unable to enter the data");
		}
		
	}
	
	public static void click_value(WebElement element) {
		
		try {
			element.click();	
		} catch (TimeoutException e) {
			// TODO: handle exception
		}catch (NoSuchElementException e) {
			throw new RuntimeException("Unable to enter the data");
		}
	}
}
