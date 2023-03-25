package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class CustomerPage {
	private SHAFT.GUI.WebDriver driver;

	public CustomerPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By userSelect = By.id("userSelect");
	private By loginBtn = By.xpath("//button[@type='submit']");
	private By loginAssertion = By.xpath("//span[@class='fontBig ng-binding']");
	private By transactionBtn = By.xpath("//button[@ng-class='btnClass1']");
	private By depositButton = By.xpath("//button[@ng-class='btnClass2']");
	private By WithdrawlBtn = By.xpath("//button[@ng-class='btnClass3']");

	public void Login() {
		driver.element().select(userSelect, "Harry Potter");
		driver.element().click(loginBtn);
	}

	public String getAssertionMessage() {
		return driver.element().getText(loginAssertion);
	}
	
	public By getAssertionLocator() {
		return loginAssertion;
	}

	public TransactionPage navigateToTransactionPage() {
		driver.element().click(transactionBtn);
		return new TransactionPage(driver);
	}

	public DepositPage navigateToDepositPage() {
		driver.element().click(depositButton);
		return new DepositPage(driver);
	}

	public WithdrawlPage navigateToWithdrawlPage() {
		driver.element().click(WithdrawlBtn);
		return new WithdrawlPage(driver);
	}

}
