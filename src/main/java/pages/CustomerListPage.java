package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class CustomerListPage {
	private SHAFT.GUI.WebDriver driver;

	public CustomerListPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By searchBox = By.xpath("//input[@placeholder='Search Customer']");
	private By deleteAccount = By.xpath("//button[@ng-click='deleteCust(cust)']");
	private By assertionMessage = By.xpath("//td[@class='ng-binding' and text()='Mahmoud']");

	public void searchAboutAccount(String account) {
		driver.element().type(searchBox, account);
	}

	public void deleteAccount() {
		driver.element().click(deleteAccount);
	}

	public String getAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}
	public By getAssertionLocator() {
		return assertionMessage;
	}
}
