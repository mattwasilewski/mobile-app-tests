package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;

public class DriverFactory {
    private static AndroidDriver driver = null;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            UiAutomator2Options options = new UiAutomator2Options()
                    .setAppPackage("io.selendroid.testapp")
                    .setAppActivity(".HomeScreenActivity")
                    .amend("platformName", "Android")
                    .amend("automationName", "UiAutomator2")
                    .amend("noReset", true)
                    .amend("enforceXPath1", true);
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

