package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDef {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriverPool().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webTableLoginPage.usernameBox.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.passwordBox.sendKeys(password);
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        webTableLoginPage.loginButton.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriverPool().getCurrentUrl().contains("orders"));
    }

    @When("user enters username {string} password {string} and logins")
    public void user_enters_username_password_and_logins(String username, String password) {
//        webTableLoginPage.usernameBox.sendKeys(username);
//        webTableLoginPage.passwordBox.sendKeys(password);
//        webTableLoginPage.loginButton.click();
        webTableLoginPage.login(username, password);
    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
//        webTableLoginPage.usernameBox.sendKeys(credentials.get("username"));
//        webTableLoginPage.passwordBox.sendKeys(credentials.get("password"));
//        webTableLoginPage.loginButton.click();
        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));
    }

}
