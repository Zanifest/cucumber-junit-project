package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDef {

    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriverPool().get(ConfigurationReader.getProperty("env"));
        webTableOrderPage.usernameBox.sendKeys("Test");
        webTableOrderPage.passwordBox.sendKeys("Tester");
        webTableOrderPage.loginButton.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        webTableOrderPage.orderTabButton.click();
        Select selectProductTypeDropDown = new Select(webTableOrderPage.productType);
        selectProductTypeDropDown.selectByVisibleText(productType);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        webTableOrderPage.quantityBox.clear();
        webTableOrderPage.quantityBox.sendKeys("" + quantity);
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        webTableOrderPage.customerNameBox.sendKeys(customerName);
    }
    @When("user enters street {string}")
    public void user_enters_street(String customerAddress) {
        webTableOrderPage.streetAddressBox.sendKeys(customerAddress);
    }
    @When("user enters city {string}")
    public void user_enters_city(String customerCity) {
        webTableOrderPage.cityBox.sendKeys(customerCity);
    }
    @When("user enters state {string}")
    public void user_enters_state(String customerState) {
        webTableOrderPage.stateBox.sendKeys(customerState);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
        webTableOrderPage.zipcodeBox.sendKeys(zipcode);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String creditCardType) {
        for (WebElement each : webTableOrderPage.paymentMethodList) {
            if (each.getText().equalsIgnoreCase(creditCardType)){
                each.click();
            }
        }
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNum) {
        webTableOrderPage.cardNumberBox.sendKeys(cardNum);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expDate) {
        webTableOrderPage.cardExpBox.sendKeys(expDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String customerName) {
        Assert.assertEquals(webTableOrderPage.listOfOrdersInfoTable.get(0).getText(), customerName);
    }

}
