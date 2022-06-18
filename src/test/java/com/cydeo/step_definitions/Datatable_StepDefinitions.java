package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Datatable_StepDefinitions {

    DropdownsPage dropdownsPage = new DropdownsPage();


    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }


    @Given("User is on the dropdowns page of practice tool")
    public void userIsOnTheDropdownsPageOfPracticeTool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonth) {

        System.out.println(expectedMonth);

//        Select select = new Select(dropdownsPage.monthDropDown);
//        List<WebElement> actualOptionAsWebElement = select.getOptions();
//        List<String> actualOptionsAsString = new ArrayList<>();
//
//        for (WebElement each : actualOptionAsWebElement) {
//            actualOptionsAsString.add(each.getText());
//        }

        List<String> actualMonth = BrowserUtils.convertDropdownOptionsAsString(dropdownsPage.monthDropDown);

        Assert.assertEquals(expectedMonth, actualMonth);


    }
}
