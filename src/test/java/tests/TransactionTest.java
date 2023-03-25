package tests;

import org.testng.annotations.Test;

import pages.CustomerPage;
import pages.DepositPage;
import pages.HomePage;
import pages.TransactionPage;

public class TransactionTest extends TestBase {

	HomePage home;
	CustomerPage customerPage;
	DepositPage depositPage;
	TransactionPage transactionPage;

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

	@Test(priority = 2)
	public void navigateToDeposit() {
		customerPage = new CustomerPage(driver);
		customerPage.navigateToDepositPage();
	}

	@Test(priority = 3)
	public void addDepositAmount() {
		depositPage = new DepositPage(driver);
		depositPage.addDepositAmount("220");
		driver.assertThat().element(depositPage.getAssertionMessaeLocator()).text().contains("Deposit Successful").perform();
	}

	@Test(priority = 4)
	public void navigateToTransactionsAndAssertTransactions() {
		customerPage = new CustomerPage(driver);
		customerPage.navigateToTransactionPage();
		transactionPage = new TransactionPage(driver);
		driver.assertThat().element(transactionPage.getAssertionMessageLocator()).text().contains("220").perform();
	}

}
