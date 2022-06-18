package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OdezaBasePage {

    public OdezaBasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(xpath = "//*[@id=\"menu-odeza-main-nav-2\"]/li[2]/a")
//    public WebElement solutionTab;
//
//    @FindBy(xpath = "(//a[.='Appointment Autofill'])[2]")
//    public WebElement appointmentAutofillTab;
}
