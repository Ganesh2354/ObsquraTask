package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFB_POM {
	WebDriver localdriver;
	public LoginFB_POM(WebDriver driver)
	{
		localdriver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH, using="//input[@name='email']")	
	private WebElement email;
	
	@FindBy(how=How.XPATH, using="//input[@name='pass']")
	private WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[@name='login']")
	private WebElement loginBtn;
		
	public void setUser(String emailOrMobileNo) {
		email.sendKeys(emailOrMobileNo);
	}	
	public void setPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void performClick()
	{
		loginBtn.click();
	}	
}
