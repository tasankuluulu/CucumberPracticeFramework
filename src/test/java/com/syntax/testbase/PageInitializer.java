package com.syntax.testbase;

import com.syntax.pages.LoginPageWebElements;
import com.syntax.pages.MainPageWebElements;

public class PageInitializer extends BaseClass {
	
	public static LoginPageWebElements login;
	public static MainPageWebElements main;
	
	public static void initializePageObjects() {
		login = new LoginPageWebElements();
		main = new MainPageWebElements();
	}
	
	

}
