package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class WithdrawlPage {
	private SHAFT.GUI.WebDriver driver;

	public WithdrawlPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	

	private By wihdrawlBox = By.xpath("//input[@placeholder='amount']");
	private By WiwthdrwalBtn = By.xpath("//button[@class='btn btn-default']");
	private By assertionMessage = By.xpath("//span[text()='Transaction successful']");

	public void makeWithdrawl(String amount)  {
		
		driver.element().type(WiwthdrwalBtn, amount);
		driver.element().click(WiwthdrwalBtn);
	}

	public String getAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}
	
	public By getAsserionMessageLocator() {
		return assertionMessage;
	}

}
