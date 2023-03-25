package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class TransactionPage {
	private SHAFT.GUI.WebDriver driver;

	public TransactionPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By assertionMessage = By.xpath("//td[@class='ng-binding' and text()='220']");

	public String getAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}
	
	public By getAssertionMessageLocator() {
		return assertionMessage;
	}

}
