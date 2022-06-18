package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_stepDef {

    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();

    @Given("User is on SmartBear Login page")
    public void user_is_on_smart_bear_login_page() {

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
    }

    @When("User enters {string} to Username")
    public void user_enters_to_username(String string) {

        smartBearOrderPage.username.sendKeys(string);
    }

    @When("User enters {string} to Password")
    public void user_enters_to_password(String string) {

        smartBearOrderPage.password.sendKeys(string);
    }

    @And("User clicks Login button")
    public void userClicksLoginButton() {

        smartBearOrderPage.loginButton.click();
    }

    @And("User clicks Order link")
    public void userClicksOrderLink() {

        smartBearOrderPage.orderLink.click();
    }

    @And("User selects {string} from select dropdown")
    public void userSelectsFromDropdown(String value) {

        Select select = new Select(smartBearOrderPage.selectDropDown);
        select.selectByVisibleText(value);
    }


    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {

        smartBearOrderPage.quantityInput.clear();

        smartBearOrderPage.quantityInput.sendKeys(quantity);
    }

    @When("User enters {string} to customer name")
    public void user_enters_to_customer_name(String customerName) {

        smartBearOrderPage.customerName.sendKeys(customerName);
    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {

        smartBearOrderPage.street.sendKeys(street);
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {

        smartBearOrderPage.city.sendKeys(city);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {

        smartBearOrderPage.state.sendKeys(state);
    }

    @When("User enters {string} to zipcode")
    public void user_enters_to_zipcode(String zipcode) {

        smartBearOrderPage.zipcode.sendKeys(zipcode);
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {

        smartBearOrderPage.radioList.click();



    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {

    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {

    }

    @When("User clicks process button")
    public void user_clicks_process_button() {

    }

    @Then("User verifies {string}  is in the list")
    public void user_verifies_is_in_the_list(String string) {

    }


}
