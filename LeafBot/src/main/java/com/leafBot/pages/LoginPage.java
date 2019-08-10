package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterUsername(String username) {
		
		WebElement eleUsername = locateElement("id", "username");
		
		clearAndType(eleUsername, username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		
		WebElement elePassword = locateElement("id","password");
		clearAndType(elePassword, password);
		return this;
		
	}
	
	public LogoutPage clickLogin() {
		
		WebElement eleClickLoginButton = locateElement("class","decorativeSubmit");
		click(eleClickLoginButton);
		return new LogoutPage();
	}
	
}
