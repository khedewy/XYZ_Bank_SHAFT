package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.AddCustomerPage;
import pages.BankManagerPage;
import pages.CustomerListPage;
import pages.HomePage;

public class CustomerListTest extends TestBase {

	HomePage home;
	BankManagerPage managerPage;
	CustomerListPage customer;
	AddCustomerPage add;
	SHAFT.TestData.JSON userData;

	@Test
	public void navigateToManagerPage() {
		home = new HomePage(driver);
		home.navigateToBankManagerPage();
	}

	@Test(priority = 1)
	public void navigateToAddCustomer() {
		managerPage = new BankManagerPage(driver);
		managerPage.navigateToAddCustomerPage();
	}

	@Test(priority = 2)
	public void EnterCustomerData() {
		userData = new JSON("AddCustomerData.json");
		add = new AddCustomerPage(driver);
		add.enterCustomerData(userData.getTestData("firstName"),userData.getTestData("lastName"),userData.getTestData("postCode"));
	}

	@Test(priority = 3)
	public void navigateToCustomerList() {
		managerPage = new BankManagerPage(driver);
		managerPage.navigateToCustomerListPage();
	}

	@Test(priority = 4)
	public void editAccounts() {
		customer = new CustomerListPage(driver);
		customer.searchAboutAccount("Mahmoud");
		driver.assertThat().element(customer.getAssertionLocator()).text().contains("Mahmoud").perform();

	}

	@Test(priority = 5)
	public void deleteAccountCreated() {
		customer = new CustomerListPage(driver);
		customer.deleteAccount();
	}

}
