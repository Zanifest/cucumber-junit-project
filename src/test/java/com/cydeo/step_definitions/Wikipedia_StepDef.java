package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDef {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriverPool().get("https://wikipedia.org");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikipediaPage.searchBox.sendKeys("Steve Jobs");
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchButton.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue(Driver.getDriverPool().getTitle().contains("Steve Jobs"));
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String str) {
        wikipediaPage.searchBox.sendKeys(str);
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String str) {
        Assert.assertTrue(Driver.getDriverPool().getTitle().contains(str));
    }

}
