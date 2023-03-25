package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.AlertActions;

public class AddCustomerPage {
	private SHAFT.GUI.WebDriver driver;

	public AddCustomerPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By firstNameTxt = By.xpath("//input[@ng-model='fName']");
	private final By lastNameTxt = By.xpath("//input[@ng-model='lName']");
	private final By postCodeTxt = By.xpath("//input[@ng-model='postCd']");
	private final By submitButton = By.xpath("//button[@type='submit']");

	public void enterCustomerData(String firstName, String lastName, String postCode) {
		driver.element().type(firstNameTxt, firstName);
		driver.element().type(lastNameTxt, lastName);
		driver.element().type(postCodeTxt, postCode);
		driver.element().click(submitButton);
		AlertActions alert = driver.element().performAlertAction();
		alert.acceptAlert();
	}

}
