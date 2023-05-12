package com.tests;

import org.testng.annotations.Test;

import com.pom.LoginFB_POM;

public class TestLoginTC001 extends BaseClass{
	@Test	
	public void testLoginFB() throws Exception
	{	
		LoginFB_POM login=new LoginFB_POM(driver);		
		login.setUser(email);
		Thread.sleep(1000);
		login.setPassword(password);
		Thread.sleep(1000);	
		login.performClick();
		Thread.sleep(3000);		
	}
	

}
