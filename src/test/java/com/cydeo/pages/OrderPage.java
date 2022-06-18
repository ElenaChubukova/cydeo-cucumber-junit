package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage {

    public OrderPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement street;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zip;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement creditCardInput;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement expDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement order;





}
