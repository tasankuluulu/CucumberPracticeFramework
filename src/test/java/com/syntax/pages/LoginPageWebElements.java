package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;

public class LoginPageWebElements extends BaseClass {
	@FindBy(id = "btnSignIn")
	public WebElement signIn;
	
	@FindBy(id = "lvwOrgill_ucPublicHeader_loginOrgill_UserName")
	public WebElement username;
	
	@FindBy(id = "lvwOrgill_ucPublicHeader_loginOrgill_Password")
	public WebElement password;
	
	@FindBy(id = "lvwOrgill_ucPublicHeader_loginOrgill_LoginButton")
	public WebElement loginBtn;
	
	public LoginPageWebElements() {
		PageFactory.initElements(driver, this);
	}
}
