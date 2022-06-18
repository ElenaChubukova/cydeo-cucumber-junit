package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    /*

    @FindBy(xpath = "")
    public WebElement ;

     */


    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;



    public void login(){

        this.usernameInput.sendKeys("Test");
        this.passwordInput.sendKeys("Tester");
        this.signInButton.click();
    }

    public void login(String username, String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public void loginWithConfig(){

        usernameInput.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("web.table.password"));
        signInButton.click();

    }
}
