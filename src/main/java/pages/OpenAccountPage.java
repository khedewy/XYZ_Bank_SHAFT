package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.AlertActions;

public class OpenAccountPage {
	private SHAFT.GUI.WebDriver driver;

	public OpenAccountPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By userSelect = By.id("userSelect");
	private By currencySelect = By.id("currency");
	private By processBtn = By.xpath("//button[@type='submit']");

	public void OpenAccount() {
		driver.element().select(userSelect, "Harry Potter");

		driver.element().select(currencySelect, "Dollar");

		driver.element().click(processBtn);

		AlertActions alert = driver.element().performAlertAction();
		alert.acceptAlert();
	}

}
