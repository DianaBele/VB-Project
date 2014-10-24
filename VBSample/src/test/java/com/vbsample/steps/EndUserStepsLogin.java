package com.vbsample.steps;

/**
 * Created by dianabele on 19/10/14.
 */


import com.vbsample.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matcher;
import net.thucydides.core.pages.Pages;

import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;


public class EndUserStepsLogin extends ScenarioSteps{

    LoginPage loginPage;


    public EndUserStepsLogin(Pages pages){
        super(pages);
        loginPage = pages.getPage(LoginPage.class);
    }

    @Step
    public void user_enters_email(String email) {
        loginPage.enter_email(email);
    }

    @Step
    public void user_enters_password(String password) {loginPage.enter_password(password);}

    @Step
    public void user_clicks_signin(){loginPage.click_signin();}

    @Step
    public void verify_login_successful(String pageTitle){

        assertThat(loginPage.getTitle(), is(pageTitle));
    }

    @Step
    public void user_opens_the_login_page() {
        loginPage.open();
    }

}
