package com.pageexe;

import com.base.BaseClass;
import com.locator.LoginPage_Locator;

public class LoginPageExecution extends LoginPage_Locator{
	
	public static void username(String data) {
		BaseClass.input_Data(LoginPage_Locator.getLoginDetails("username"), data);
	}
	public static void password(String data) {
		BaseClass.input_Data(LoginPage_Locator.getLoginDetails("password"), data);
	}
	public static void loginButton() {
		BaseClass.click_value(LoginPage_Locator.getLoginDetails("login"));
	}
}
