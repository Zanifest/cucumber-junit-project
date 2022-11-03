package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriverPool(), this);
    }

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public void login(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

}
