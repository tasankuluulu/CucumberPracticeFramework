package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;

public class MainPageWebElements extends BaseClass{
	@FindBy(id = "cphMainContent_ctl00_btnPWDAlertSkip")
	public WebElement passwordAlert;
	
	@FindBy(id = "lvwOrgill_ucPrivateHeader_lstSignOutSM")
	public WebElement signOut;
	
	public MainPageWebElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
