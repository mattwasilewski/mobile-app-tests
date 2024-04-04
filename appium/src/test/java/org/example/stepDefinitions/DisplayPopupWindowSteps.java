package org.example.stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.DriverFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DisplayPopupWindowSteps {

    private final AndroidDriver driver = DriverFactory.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("the app is opened to the main screen")
    public void the_app_is_opened_to_the_main_screen(){

    }

    @When("the user clicks the 'Display Popup Window' button")
    public void the_user_clicks_the_display_popup_button(){
    }

    @Then("a Popup is displayed")
    public void a_popup_is_displayed(){

    }
}
