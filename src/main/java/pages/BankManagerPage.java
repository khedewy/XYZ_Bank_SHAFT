package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class BankManagerPage {
	private SHAFT.GUI.WebDriver driver;

	public BankManagerPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By addCustomerBtn = By.xpath("//button[@ng-class='btnClass1']");
	private final By openAccountBtn = By.xpath("//button[@ng-class='btnClass2']");
	private final By customerBtn = By.xpath("//button[@ng-class='btnClass3']");

	public AddCustomerPage navigateToAddCustomerPage() {
		driver.element().click(addCustomerBtn);
		return new AddCustomerPage(driver);
	}

	public OpenAccountPage navigateToOpenAccountPage() {
		driver.element().click(openAccountBtn);
		return new OpenAccountPage(driver);
	}

	public CustomerListPage navigateToCustomerListPage() {
		driver.element().click(customerBtn);
		return new CustomerListPage(driver);
	}

}
