package com.vbsample;

/**
 * Created by dianabele on 19/10/14.
 */

        import com.vbsample.steps.EndUserStepsLogin;
        import com.vbsample.steps.EndUserStepsWizard;
        import net.thucydides.core.annotations.*;
        import net.thucydides.core.pages.Pages;
        import net.thucydides.junit.runners.ThucydidesRunner;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.openqa.selenium.WebDriver;

        import com.vbsample.requirements.Application;

        import static org.apache.commons.io.FileUtils.waitFor;


@Story(Application.LoginAndCreateApp.LoginAndCreateAppFlow.class)
@RunWith(ThucydidesRunner.class)

public class LoginAndCreateAppTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "https://viewerbuilder.adobe.com/")
    public Pages pages;

    @Steps
    public EndUserStepsLogin endUserStepsLogin;
    public EndUserStepsWizard endUserStepsWizard;



    @Issue("Testing the Login")
    @Test
    public void entering_credentials_and_submit() throws InterruptedException {

        endUserStepsLogin.user_opens_the_login_page();
        endUserStepsLogin.user_enters_email("dbele+live@adobetest.com");
        endUserStepsLogin.user_enters_password("13Adobe14");
        endUserStepsLogin.user_clicks_signin();
        endUserStepsLogin.verify_login_successful("DPS App Builder Sign In");
        Thread.sleep(10000);
        
    }


    @Issue("Testing the App Creation Wizard Android V32")
    @Test @Pending
    public void selecting_add_button_and_android_latest(){

    endUserStepsWizard.user_waits_until_add_button_visible_then_clicks();
    endUserStepsWizard.selects_app_type("041");
    endUserStepsWizard.selects_app_version("043");
    endUserStepsWizard.clicks_on_Next();

    }


}