package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class HomePage {
	private SHAFT.GUI.WebDriver driver;

	public HomePage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By bankManagerLogin = By.xpath("//button[@class='btn btn-primary btn-lg' and @ng-click='manager()']");
	private By customerLogin = By.xpath("//button[@class='btn btn-primary btn-lg' and text()='Customer Login']");

	public BankManagerPage navigateToBankManagerPage() {
		driver.element().click(bankManagerLogin);
		return new BankManagerPage(driver);
	}

	public CustomerPage navigateToCustomerLogin() {
		driver.element().click(customerLogin);
		return new CustomerPage(driver);
	}

}
