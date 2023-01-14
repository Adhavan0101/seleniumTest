package com.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample1 {

	public void selectFromDropDown(WebElement dropdown, String howTo, String value) {

		Select select = new Select(dropdown);

		switch (howTo) {
		case "index":

			break;

		case "text":

			break;
		case "value":

			break;
		default:
			break;
		}
	}

}
