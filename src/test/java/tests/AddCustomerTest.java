package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.AddCustomerPage;
import pages.BankManagerPage;
import pages.HomePage;

public class AddCustomerTest extends TestBase {
	
	HomePage home;
    BankManagerPage managerPage;
    AddCustomerPage add;
    SHAFT.TestData.JSON userData;
    @Test
    public void navigateToManagerPage(){
        home = new HomePage(driver);
        home.navigateToBankManagerPage();
    }
    @Test(priority = 1)
    public void navigateToAddCustomer(){
        managerPage = new BankManagerPage(driver);
        managerPage.navigateToAddCustomerPage();
    }
    @Test(priority =2)
    public void EnterCustomerData() {
        userData = new JSON("AddCustomerData.json");
        add = new AddCustomerPage(driver);
        add.enterCustomerData(userData.getTestData("firstName"),userData.getTestData("lastName"),userData.getTestData("postCode"));
    }

}
