package UtilityLayer;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void sendKeyss(WebElement wb, String value) {

		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}

	}

	public static void clickk(WebElement wb) {

		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}

	}

	public static void backgroundRadioBtnn(List<WebElement> wb, String name) {

		for (WebElement abc : wb) {

			String a = abc.getAttribute("value");
			String b = null;
			if (a.equalsIgnoreCase("ACTIVE")) {
				b = "Done";

			} else {

				b = "Pending";
			}

			if (b.equalsIgnoreCase(name)) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", abc);
			}
		}

	}

}
