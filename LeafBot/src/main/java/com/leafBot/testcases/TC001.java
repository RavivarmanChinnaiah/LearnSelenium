package com.leafBot.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001 extends ProjectSpecificMethods{

	@BeforeMethod
	public void setUpData() {
		
		excelFileName = "TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String username,String password) {
		
		new LoginPage().enterUsername(username).enterPassword(password).clickLogin();
		
	}
	
}
