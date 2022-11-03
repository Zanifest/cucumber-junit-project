package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyTask_StepDef {

    EtsyPage etsyPage = new EtsyPage();
    @Given("user is on etsy web page")
    public void user_is_on_etsy_web_page() {
        Driver.getDriverPool().get("https://www.etsy.com");
    }
    @Then("user should see Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_should_see_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {
        String actualTitle = Driver.getDriverPool().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user types Wooden spoon in search box and clicks search button")
    public void user_types_wooden_spoon_in_search_box_and_clicks_search_button() {
        etsyPage.homeSearchBox.sendKeys("Wooden spoon" + Keys.ENTER);
    }
    @Then("user sees Wooden spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedContains = "Wooden spoon";
        Assert.assertTrue(Driver.getDriverPool().getTitle().contains(expectedContains));
    }

    @When("user types {string} in search box and clicks search button")
    public void user_types_in_search_box_and_clicks_search_button(String strSearch) {
        etsyPage.homeSearchBox.sendKeys(strSearch + Keys.ENTER);
    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String strSearch) {
        String expectedContains = strSearch;
        Assert.assertTrue(Driver.getDriverPool().getTitle().contains(strSearch));
    }

}
