package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SmartBearOrderPage {

    public SmartBearOrderPage(){
        PageFactory.initElements(Driver.getDriverPool(), this);
    }

    @FindBy (xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement usernameBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@href='Process.aspx']")
    public WebElement orderTab;

    @FindBy (xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement productDropdown;
    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantityBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtUnitPrice']")
    public WebElement pricePerUnitBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtDiscount']")
    public WebElement discountBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerNameBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement streetBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement cityBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement stateBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zipcodeBox;

    @FindBy (xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']//td")
    public List<WebElement> cardType = new ArrayList<>();

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardNumberBox;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement cardExpDateBox;

    @FindBy (xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement processButton;

    @FindBy (xpath = "//a[@href='Default.aspx']")
    public WebElement viewAllOrdersTab;

    @FindBy (xpath = "//tr//td[3]/preceding-sibling::td[1]")
    public List<WebElement> orderList = new ArrayList<>();

}
