package tests;

import org.testng.annotations.Test;

import pages.CustomerPage;
import pages.HomePage;

public class CustomerLogin extends TestBase {

	HomePage home;
	CustomerPage customerPage;

	@Test
	public void navigateToLogin() {
		home = new HomePage(driver);
		home.navigateToCustomerLogin();
	}

	@Test(priority = 1)
	public void loginAsCustomer() {
		customerPage = new CustomerPage(driver);
		customerPage.Login();
		driver.assertThat().element(customerPage.getAssertionLocator()).text().contains("Harry Potter").perform();
	}

}
