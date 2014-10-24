package com.vbsample.steps;

/**
 * Created by dianabele on 22/10/14.
 */

import com.vbsample.pages.CreateAppWizard;
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


public class EndUserStepsWizard extends ScenarioSteps {

    CreateAppWizard createAppWizard;

    public EndUserStepsWizard(Pages pages){
        super(pages);
        createAppWizard = pages.getPage(CreateAppWizard.class);
    }

    @Step
    public void user_waits_until_add_button_visible_then_clicks(){
        createAppWizard.wait_until_add_button_finishes_loading_then_click();
    }
    @Step
    public void user_clicks_on_add_button(){
        createAppWizard.select_add_button();
    }
    @Step
    public void selects_app_type(String appTypeCode){

        createAppWizard.select_app_type(appTypeCode);
    }

    @Step
    public void  selects_app_version(String appVersionCode){
        createAppWizard.select_app_version(appVersionCode);
    }

    @Step
    public void clicks_on_Next(){
        createAppWizard.select_the_Next_button();
    }

}
