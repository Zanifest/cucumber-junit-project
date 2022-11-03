package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Dropdowns_StepDef {

    DropdownPage dropdownPage = new DropdownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriverPool().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
//        Select selectDropdown = new Select(dropdownPage.monthDropdown);
//
//        List<WebElement> actualOptionsAsWebElements = selectDropdown.getOptions();
//
//        List<String> months = new ArrayList<>();
//
//        for (WebElement each : actualOptionsAsWebElements) {
//            months.add(each.getText());
//        }

        Assert.assertEquals(BrowserUtils.dropdownOptionsAsString(dropdownPage.monthDropdown), expectedMonths);


    }

}
