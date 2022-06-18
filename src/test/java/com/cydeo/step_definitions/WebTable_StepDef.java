package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class WebTable_StepDef {

    WebTablePage webTablePage = new WebTablePage();

    @Given("user in on login page of web table app")
    public void user_in_on_login_page_of_web_table_app() {

        Driver.getDriver().get(ConfigurationReader.getProperty("webTableURL"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {

        webTablePage.usernameInput.sendKeys(string);

    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {

        webTablePage.passwordInput.sendKeys(string);

    }

    @When("user clicks login button")
    public void user_clicks_login_button() {

        webTablePage.signInButton.click();

    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        BrowserUtils.verifyURLContains("orders");

    }

    @When("user enters username {string} password {string} and clicks logInButton")
    public void userEntersUsernamePasswordAndClicksLogInButton(String username, String password) {

        webTablePage.login(username, password);
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {

//      webTablePage.usernameInput.sendKeys(credentials.get("username"));
//      webTablePage.passwordInput.sendKeys(credentials.get("password"));
//      webTablePage.signInButton.click();


      webTablePage.login(credentials.get("username"), credentials.get("password"));


    }


    /**
     * this comment is useful for documentation (we can explain what we are doing)
     */


}
