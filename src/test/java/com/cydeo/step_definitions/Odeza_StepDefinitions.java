package com.cydeo.step_definitions;

import com.cydeo.pages.OdezaBasePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.BrokenBarrierException;

public class Odeza_StepDefinitions {

    OdezaBasePage odezaBasePage = new OdezaBasePage();


    @When("user is on Odeza homepage")
    public void user_is_on_odeza_homepage() {

        Driver.getDriver().get("https://odeza.com");

    }

    @Then("user sees Odeza in the url")
    public void user_sees_odeza_in_the_url() {

        String expectedURL = "https://odeza.com/";
        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        Assert.assertEquals(expectedURL, actualURL);

    }


    @When("user navigates to the Solutions menu")
    public void user_navigates_to_the_solutions_menu() {


        WebElement solutionTab = Driver.getDriver().findElement(By.xpath("//a[text()='SOLUTIONS']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(solutionTab).perform();

    }

    @When("user clicks Appointment Autofill from the drop-down menu")
    public void user_clicks_appointment_autofill_from_the_drop_down_menu() {


        WebElement apptAutoFill = Driver.getDriver().findElement(By.xpath("//*[@id=\"menu-odeza-main-nav-2\"]/li[2]/ul/li[5]/a"));
        apptAutoFill.click();

        System.out.println("Navigation to an Appointment Autofill is done");

    }

    @Then("user sees Appointment Autofill in the url")
    public void user_sees_appointment_autofill_in_the_url() {

        String expectedURL = "https://odeza.com/platform/#appointment-autofill";
        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        Assert.assertEquals(expectedURL, actualURL);

    }

    @When("user navigates to Contact in the footer")
    public void user_navigates_to_contact_in_the_footer() {


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 5; i++) {
            js.executeScript("window.scrollBy(0,750)");
            BrowserUtils.sleep(2);
        }

    }

    @Then("users should see address presented in the page")
    public void users_should_see_address_presented_in_the_page() {

        WebElement address1 = Driver.getDriver().findElement(By.xpath("//a[text()='117 N. Jefferson St., Ste. 306']"));

        String expectedAddress = "117 N. Jefferson St., Ste. 306\nChicago, IL 60661";
        String actualAddress = address1.getText();

        Assert.assertEquals(expectedAddress, actualAddress);

    }


}
