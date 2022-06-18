package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Order_StepDef {

    WebTablePage webTablePage = new WebTablePage();

    BasePage basePage = new BasePage();

    OrderPage orderPage = new OrderPage();

    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("webTableURL"));

        webTablePage.login();

        basePage.order.click();

    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);

    }

    @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {
        orderPage.quantity.sendKeys(string);
    }


    @When("user enters quantity {int}")
    public void user_enters_quantity(int quantity) {

        orderPage.quantity.sendKeys(Keys.BACK_SPACE);
        // orderPage.quantity.clear();

        orderPage.quantity.sendKeys("" + quantity);
        //  orderPage.quantity.sendKeys(String.valueOf(quantity)); converting to String

    }

    @When("user enters costumer name {string}")
    public void user_enters_costumer_name(String string) {

        orderPage.name.sendKeys(string);

    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {

        orderPage.street.sendKeys(string);

    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {

        orderPage.city.sendKeys(string);

    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {

        orderPage.state.sendKeys(string);

    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {

        orderPage.zip.sendKeys(string);

    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {

        for (WebElement each : orderPage.cardType) {

            if (each.getAttribute("value").equals(cardType)) {
                each.click();

            }

        }


    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

        orderPage.creditCardInput.sendKeys(string);

    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {

        orderPage.expDate.sendKeys(string);

    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {

        orderPage.order.click();

    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

        String actualName = viewAllOrdersPage.expectedNameInRawTable.getText();
        String expName = string;

        Assert.assertTrue(actualName.contains(expName));

    }

}
