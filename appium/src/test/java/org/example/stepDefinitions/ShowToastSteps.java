package org.example.stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class ShowToastSteps {
    private final AndroidDriver driver = DriverFactory.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    @Given("the app is opened to the main screen")
    public void the_app_is_opened_to_the_main_screen() {
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized");
        }
    }

    @When("the user clicks the 'Displays a Toast' button")
    public void the_user_clicks_the_show_toast_button() {
        WebElement toastButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[normalize-space(@text)='Displays a Toast']")));
        toastButton.click();
    }

    @Then("a Toast message is displayed")
    public void a_toast_message_is_displayed() {
        String toastMessage = "Hello selendroid toast!";
        String xpath = String.format("//android.widget.Toast[@text='%s']", toastMessage);
        try {
            WebElement toast = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            assert(toast != null);
        } catch (Exception e) {
            throw new AssertionError("Toast message not displayed");
        }
    }

    @After
    public void tearDown() {
        DriverFactory.closeDriver();
    }
}
