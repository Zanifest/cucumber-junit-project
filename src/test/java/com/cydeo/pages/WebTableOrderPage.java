package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage {

    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriverPool(), this);
    }

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy (xpath = "(//button[@class='button nav__item'])[2]")
    public WebElement orderTabButton;

    @FindBy (xpath = "//select[@name='product']")
    public WebElement productType;

    @FindBy (xpath = "//input[@name='quantity']")
    public WebElement quantityBox;

    @FindBy (xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement customerNameBox;

    @FindBy (xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement streetAddressBox;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement cityBox;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement stateBox;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement zipcodeBox;

    @FindBy (xpath = "//div[@class='control']//label")
    public List<WebElement> paymentMethodList;

    @FindBy (xpath = "//input[@name='cardNo']")
    public WebElement cardNumberBox;

    @FindBy (xpath = "//input[@name='cardExp']")
    public WebElement cardExpBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement processOrderButton;

    @FindBy (xpath = "//table[@class='table is-fullwidth']//tbody/tr//td[1]")
    public List<WebElement> listOfOrdersInfoTable;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

}
