package com.syntax.stepDefinitions;



import com.syntax.testbase.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void startTest() {
		BaseClass.setUp();
	}
	
	@After
	public static void endTest() {
		BaseClass.tearDown();
	}
	

}
