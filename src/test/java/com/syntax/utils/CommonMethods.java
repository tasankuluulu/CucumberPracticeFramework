package com.syntax.utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.testbase.PageInitializer;

public class CommonMethods extends PageInitializer {

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
	}

	public static void clickRadioOrCheckBox(List<WebElement> radioOrCheckBoxes, String value) {
		for (WebElement radioOrCheckBox : radioOrCheckBoxes) {
			String actualValue;
			actualValue = radioOrCheckBox.getAttribute("value").trim();
			if (radioOrCheckBox.isEnabled() && actualValue.equals(value)) {
				click(radioOrCheckBox);
				break;
			}
		}
	}

	public static void selectDDValue(WebElement dd, String visibleTextOrValue) {
		Select select = new Select(dd);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(visibleTextOrValue)) {
				select.selectByVisibleText(visibleTextOrValue);
				break;
			}
		}
	}

	public static void selectDDValue(WebElement dd, int index) {
		Select select = new Select(dd);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		if (size > index) {
			select.selectByIndex(index);
		}
	}
}
