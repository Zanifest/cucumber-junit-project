package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriverPool(), this);
    }

    @FindBy (id = "searchInput")
    public WebElement searchBox;

    @FindBy (xpath = "//i[@class='sprite svg-search-icon']")
    public WebElement searchButton;
}
