package Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
	@FindBy(name = "q")
	private WebElement search;

	public GoogleSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendText(String text) {
		search.sendKeys(text, Keys.ENTER);
	}

}
