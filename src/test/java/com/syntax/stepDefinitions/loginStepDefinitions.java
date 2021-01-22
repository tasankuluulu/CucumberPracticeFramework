package com.syntax.stepDefinitions;

import org.junit.Assert;
import org.junit.Test;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginStepDefinitions extends CommonMethods {

	@When("login with valid credentials")
	public void login_with_valid_credentials() {
		click(login.signIn);
		sendText(login.username, ConfigsReader.getPropValue("username"));
		sendText(login.password, ConfigsReader.getPropValue("password"));
		click(login.loginBtn);
	}
	    

	@Then("varify welcome message")
	public void varify_welcome_message() {
	   click(main.passwordAlert);
	   String expectedText = "Sign Out";
	   String actualText = main.signOut.getText();
	   Assert.assertEquals(expectedText, actualText);
	}
}
