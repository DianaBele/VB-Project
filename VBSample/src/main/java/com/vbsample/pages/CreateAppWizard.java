package com.vbsample.pages;

import net.thucydides.core.pages.PageObject;
import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;


/**
 * Created by dianabele on 22/10/14.
 */
public class CreateAppWizard extends PageObject {

    public CreateAppWizard(WebDriver driver) {
        super(driver);
    }

    @FindBy(className ="icon-add")
    private WebElementFacade addAppButton;

    @FindBy(id ="coral-6")
    private WebElementFacade selectAppType;

    @FindBy(id ="coral-7")
    private WebElementFacade selectAppVersion;

    @FindBy(id ="new.publication.modal.footer.next")
    private WebElementFacade nextButton;


    public void wait_until_add_button_finishes_loading_then_click(){
        addAppButton.waitUntilPresent();
        addAppButton.click();

    }
    public void select_add_button(){
        addAppButton.click();
    }

    public void select_app_type(String appTypeValue){

        selectAppType.selectByValue(appTypeValue);
    }

    public void select_app_version(String appVersionValue){

        selectAppVersion.selectByValue(appVersionValue);
    }

    public void select_the_Next_button(){

        nextButton.click();
    }
}
