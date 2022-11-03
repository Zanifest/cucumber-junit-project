package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDef {

    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();

    @Given("user is logged into SmartBear Tester account and in Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_in_order_page() {
        Driver.getDriverPool().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearOrderPage.usernameBox.sendKeys("Tester");
        smartBearOrderPage.passwordBox.sendKeys("test");
        smartBearOrderPage.loginButton.click();
        smartBearOrderPage.orderTab.click();
    }
    @When("user fills out the form as followed")
    public void user_fills_out_the_form_as_followed() {

    }
    @When("user selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select selectDropdown = new Select(smartBearOrderPage.productDropdown);
    }
    @When("user enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        smartBearOrderPage.quantityBox.clear();
        smartBearOrderPage.quantityBox.sendKeys(quantity);
    }
    @When("user enters {string} to costumer name")
    public void user_enters_to_costumer_name(String name) {
        smartBearOrderPage.customerNameBox.sendKeys(name);
    }
    @When("user enters {string} to street")
    public void user_enters_to_street(String street) {
        smartBearOrderPage.streetBox.sendKeys(street);
    }
    @When("user enters {string} to city")
    public void user_enters_to_city(String city) {
        smartBearOrderPage.cityBox.sendKeys(city);
    }
    @When("user enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBearOrderPage.stateBox.sendKeys(state);
    }
    @When("user enters {string}")
    public void user_enters(String zipcode) {
        smartBearOrderPage.zipcodeBox.sendKeys(zipcode);
    }
    @When("user selects {string} as card type")
    public void user_selects_as_card_type(String card) {
        for (WebElement each : smartBearOrderPage.cardType) {
            if (each.getText().equals(card)){
                each.click();
            }
        }
    }
    @When("user enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        smartBearOrderPage.cardNumberBox.sendKeys(cardNumber);
    }
    @When("user enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {
        smartBearOrderPage.cardExpDateBox.sendKeys(expDate);
    }
    @When("user clicks process button")
    public void user_clicks_process_button() {
        smartBearOrderPage.processButton.click();
    }
    @Then("user verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String name) {

        smartBearOrderPage.viewAllOrdersTab.click();
        String verify = "";
        for (WebElement each : smartBearOrderPage.orderList) {
            if (each.getText().equals(name)){
                verify = each.getText();
            }
        }

        Assert.assertEquals(verify, name);

    }

}
