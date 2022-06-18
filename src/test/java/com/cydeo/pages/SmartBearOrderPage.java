package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPage {

    public SmartBearOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderLink;

    @FindBy(xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")
    public WebElement selectDropDown;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement quantityInput;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement customerName;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement street;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement city;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement state;

    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@type='radio']")
    public WebElement radioList;

}


