package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class DepositPage {
	private SHAFT.GUI.WebDriver driver;

	public DepositPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By depositBox = By.xpath("//input[@type='number']");
	private By depositBtn = By.xpath("//button[@type='submit']");
	private By assertionMessage = By.xpath("//span[@class='error ng-binding']");

	public void addDepositAmount(String amount) {
		driver.element().type(depositBox, amount);
		driver.element().click(depositBtn);
	}

	public String getAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}
	
	public By getAssertionMessaeLocator() {
		return assertionMessage;
	}

}
