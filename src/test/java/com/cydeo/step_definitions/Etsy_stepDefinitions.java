package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyTitleVerificationPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_stepDefinitions {

    EtsyTitleVerificationPage etsyTitleVerificationPage = new EtsyTitleVerificationPage();

    @Given("user is on homepage")
    public void user_is_on_homepage() {

        Driver.getDriver().get("https://www.etsy.com ");

    }
    @Then("user sees title is as expected")
    public void user_sees_title_is_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);

    }

    @When("user types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {

        etsyTitleVerificationPage.searchBox.sendKeys("Wooden Spoon");

    }

    @And("user clicks search button")
    public void userClicksSearchButton() {

        etsyTitleVerificationPage.searchButton.click();
    }

    @Then("user sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {

        String expTitle = "Wooden spoon | Etsy";
        String actTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expTitle, actTitle);
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String string) {

        etsyTitleVerificationPage.searchBox.sendKeys(string);
    }

    @Then("user sees {string} is in the title")
    public void userSeesIsInTheTitle(String title) {

       Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }
}
