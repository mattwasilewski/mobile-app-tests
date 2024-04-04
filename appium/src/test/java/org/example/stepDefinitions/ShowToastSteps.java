package org.example.stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.net.URL;

public class ShowToastSteps {
    AndroidDriver driver;

    @Given("the app is opened to the main screen")
    public void the_app_is_opened_to_the_main_screen() throws Exception {


         UiAutomator2Options options = new UiAutomator2Options()
                        .setAppPackage("io.selendroid.testapp")
                        .setAppActivity(".HomeScreenActivity")
                        .amend("platformName", "Android")
                        .amend("automationName", "UiAutomator2")
                        .amend("noReset", true);
                driver = new AndroidDriver(
                        new URL("http://127.0.0.1:4723"), options
                );

    }

    @When("the user clicks the 'Show Toast' button")
    public void the_user_clicks_the_show_toast_button() {
        WebElement toastButton = driver.findElement(By.id("io.selendroid.testapp:id/showToastButton"));
        toastButton.click();
    }

    @Then("a Toast message is displayed")
    public void a_toast_message_is_displayed() {
        try {
            Thread.sleep(500);
            String toastMessage = "Hello selendroid toast!";
            String xpath = String.format("//android.widget.Toast[@text='%s']", toastMessage);
            WebElement toast = driver.findElement(By.xpath(xpath));
            assert(toast != null);
        } catch (Exception e) {
            throw new AssertionError("Toast message not displayed");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
