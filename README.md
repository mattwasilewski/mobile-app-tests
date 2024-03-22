# Test plan for Selendroid-test-app.apk

This test plan is designed for beginners and outlines a basic approach to testing the Selendroid-test-app using Appium. It's a great starting point for those new to software testing and looking to showcase their skills on GitHub.

## Objective
The primary goal is to learn and demonstrate basic testing skills by automating tests for the Selendroid-test-app, focusing on key functionalities and user interface elements.

## Test Environment
- **Device**: Android Emulator (available in Android Studio).
- **Tools**: Appium for automation, Android Studio for managing the emulator and app.

## Scope of Testing
- **Functional Testing**: Verifying that the primary functions of the app work as expected.
- **UI Testing**: Checking the basic user interface elements for proper functionality.

## Test Approach
- **Test Cases**: Simple test scenarios that cover basic app functionalities. (Refer to the provided test cases)
- **Execution**: Using Appium to run automated tests on the emulator.


# Test Cases

## TC001: Show Toast Button Functionality
- **Objective**: Verify that the 'Show Toast' button displays a Toast message.
- **Preconditions**: App opened to the main screen.
- **Steps**:
  1. Click the 'Show Toast' button.
  2. Observe the response.
- **Expected Result**: A Toast message is displayed on the screen.

## TC002: Display Popup Window Button Functionality
- **Objective**: Verify that the 'Display Popup Window' button shows a popup window.
- **Preconditions**: App opened to the main screen.
- **Steps**:
  1. Click the 'Display Popup Window' button.
  2. Observe the response.
- **Expected Result**: A popup window is displayed.

## TC003: Text Input Functionality
- **Objective**: Verify that the text input field accepts and submits text.
- **Preconditions**: App opened to the screen with a text field.
- **Steps**:
  1. Enter text into the text field.
  2. Click the 'Submit' button.
  3. Observe the response.
- **Expected Result**: Entered text is accepted and a corresponding action is performed.

## TC004: Screen Orientation Change
- **Objective**: Verify the app's behavior when changing screen orientation.
- **Preconditions**: App opened to any screen.
- **Steps**:
  1. Change the device/emulator orientation from portrait to landscape.
  2. Observe the response.
- **Expected Result**: The app correctly adjusts to the new orientation.

## TC005: Response to Invalid Input
- **Objective**: Verify the app's response to invalid data input.
- **Preconditions**: App opened to the screen with a text field.
- **Steps**:
  1. Enter invalid data (e.g., special characters) into the text field.
  2. Click the 'Submit' button.
  3. Observe the response.
- **Expected Result**: The app displays an error message or refuses to accept the data.

## TC006: EN Button Functionality
- **Objective**: Verify the functionality of the 'EN Button'.
- **Preconditions**: App opened to the main screen.
- **Steps**:
  1. Click the 'EN Button'.
  2. Observe the response.
- **Expected Result**: The app performs a specific action (e.g., changing language).

## TC007: Start Webview Button Functionality
- **Objective**: Verify that the 'Start Webview' button opens a new screen with WebView.
- **Preconditions**: App opened to the main screen.
- **Steps**:
  1. Click the 'Start Webview' button.
  2. Observe the response.
- **Expected Result**: A new screen with WebView is displayed.

## TC008: User Registration Functionality
- **Objective**: Verify the user registration process.
- **Preconditions**: App opened to the 'User Registration' screen.
- **Steps**:
  1. Enter required data in the registration form.
  2. Click the 'Register' button.
  3. Observe the response.
- **Expected Result**: The app registers the user and displays a confirmation message.

## TC009: Display Toast and ProgressBar Function
- **Objective**: Verify the 'Display Toast and ProgressBar' function.
- **Preconditions**: App opened to the relevant screen.
- **Steps**:
  1. Click the button activating Toast and ProgressBar.
  2. Observe the response.
- **Expected Result**: A Toast message and a progress bar are displayed.

## TC010: Display Exception Function
- **Objective**: Verify the app's response to triggering an exception.
- **Preconditions**: App opened to the relevant screen.
- **Steps**:
  1. Click the button to trigger an exception.
  2. Observe the response.
- **Expected Result**: The app correctly handles the exception.

## TC011: Show Progress Bar for a While Button
- **Objective**: Verify the 'Show Progress Bar for a While' button functionality.
- **Preconditions**: App opened to the main screen.
- **Steps**:
  1. Click the 'Show Progress Bar for a While' button.
  2. Observe the response.
- **Expected Result**: A progress bar is displayed for a set duration and then disappears.

## TC012: Spinner Element Functionality
- **Objective**: Verify the functionality of the Spinner element.
- **Preconditions**: App opened to the screen with the Spinner element.
- **Steps**:
  1. Click the Spinner to expand the options list.
  2. Select an option.
  3. Observe the response.
- **Expected Result**: The app correctly registers the selected option.

## TC013: Throw Unhandled Exception Button
- **Objective**: Verify the app's response to an unhandled exception.
- **Preconditions**: App opened to the relevant screen.
- **Steps**:
  1. Click the 'Throw Unhandled Exception' button.
  2. Observe the response.
- **Expected Result**: The app displays an error message or crashes.

## TC014: Display Views Button Functionality
- **Objective**: Verify the functionality of the 'Display Views' button.
- **Preconditions**: App opened to the main screen.
- **Steps**:
  1. Click the 'Display Views' button.
  2. Observe the response.
- **Expected Result**: The app transitions to a new screen with various views.

## TC015: File Logging Function
- **Objective**: Verify the functionality of 'File Logging'.
- **Preconditions**: App opened to the relevant screen.
- **Steps**:
  1. Activate 'File Logging'.
  2. Perform actions in the app.
  3. Check for log recordings.
- **Expected Result**: The app logs actions in a file.

## TC018: Display and Focus on Layout Button Functionality
- **Objective**: Verify the 'Display and Focus on Layout' button shows a new layout screen.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Display and Focus on Layout' button.
  2. Observe the response.
- **Expected Result**: The app displays a new screen with a layout that automatically receives focus.

## TC019: Display Toast Button Functionality
- **Objective**: Verify the 'Display Toast' button shows a Toast message.
- **Preconditions**: App launched, screen with 'Display Toast' button displayed.
- **Steps**:
  1. Click the 'Display Toast' button.
  2. Observe the response.
- **Expected Result**: The app displays a Toast message.

## TC020: Show Exception Dialog Button Functionality
- **Objective**: Verify the 'Show Exception Dialog' button displays an exception dialog.
- **Preconditions**: App launched, relevant screen displayed.
- **Steps**:
  1. Click the 'Show Exception Dialog' button.
  2. Observe the response.
- **Expected Result**: The app displays a dialog with exception information.

## TC021: Show Progress Dialog Button Functionality
- **Objective**: Verify the 'Show Progress Dialog' button displays a progress dialog.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Show Progress Dialog' button.
  2. Observe the response.
- **Expected Result**: The app displays a progress dialog.

## TC022: Start Another Activity Button Functionality
- **Objective**: Verify the 'Start Another Activity' button launches a new activity.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Start Another Activity' button.
  2. Observe the response.
- **Expected Result**: The app launches a new activity.

## TC023: Checkbox Element Functionality
- **Objective**: Verify the functionality of the Checkbox element.
- **Preconditions**: App launched, screen with Checkbox element displayed.
- **Steps**:
  1. Check and uncheck the checkbox.
  2. Observe the response.
- **Expected Result**: The app responds to the checkbox state change as expected.

## TC024: Take Screenshot Functionality
- **Objective**: Verify the 'Take Screenshot' function captures and saves a screenshot.
- **Preconditions**: App launched, relevant screen displayed.
- **Steps**:
  1. Click the 'Take Screenshot' button.
  2. Check for the screenshot.
- **Expected Result**: The app takes and saves a screenshot.

## TC025: Show Custom Dialog Button Functionality
- **Objective**: Verify the 'Show Custom Dialog' button displays a custom dialog.
- **Preconditions**: App launched, relevant screen displayed.
- **Steps**:
  1. Click the 'Show Custom Dialog' button.
  2. Observe the response.
- **Expected Result**: The app displays a custom dialog.

## TC026: Open URL Button Functionality
- **Objective**: Verify the 'Open URL' button opens a new WebView screen with a URL.
- **Preconditions**: App launched, screen with 'Open URL' button displayed.
- **Steps**:
  1. Click the 'Open URL' button.
  2. Observe the response.
- **Expected Result**: The app opens a new activity with a WebView displaying a URL.

## TC027: Show Location Dialog Button Functionality
- **Objective**: Verify the 'Show Location Dialog' button displays a location dialog.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Show Location Dialog' button.
  2. Observe the response.
- **Expected Result**: The app displays a dialog with location information.

## TC028: Show Layout Button Functionality
- **Objective**: Verify the 'Show Layout' button displays a new layout screen.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Show Layout' button.
  2. Observe the response.
- **Expected Result**: The app displays a new screen with a specified layout.

## TC029: Start User Registration Button Functionality
- **Objective**: Verify the 'Start User Registration' button transitions to the registration screen.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Start User Registration' button.
  2. Observe the response.
- **Expected Result**: The app transitions to the user registration screen.

## TC030: Show Toast While Waiting for Location Button Functionality
- **Objective**: Verify the 'Show Toast While Waiting for Location' button displays a Toast message during location retrieval.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Show Toast While Waiting for Location' button.
  2. Observe the response.
- **Expected Result**: The app displays a Toast message while waiting for location information.

## TC031: Invoke Google Search Button Functionality
- **Objective**: Verify the 'Invoke Google Search' button initiates a Google search activity.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Invoke Google Search' button.
  2. Observe the response.
- **Expected Result**: The app initiates a Google search activity.

## TC032: Show Dialog Button Functionality
- **Objective**: Verify the 'Show Dialog' button displays a dialog.
- **Preconditions**: App launched, screen with 'Show Dialog' button displayed.
- **Steps**:
  1. Click the 'Show Dialog' button.
  2. Observe the response.
- **Expected Result**: The app displays a dialog.

## TC033: Create and Display a WebView Button Functionality
- **Objective**: Verify the 'Create and Display a WebView' button creates and shows a WebView.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Create and Display a WebView' button.
  2. Observe the response.
- **Expected Result**: The app creates and displays a WebView with specified content.

## TC034: Show and Hide Keyboard Button Functionality
- **Objective**: Verify the 'Show and Hide Keyboard' button displays and hides the keyboard.
- **Preconditions**: App launched, screen with text input capability displayed.
- **Steps**:
  1. Click on the text field to display the keyboard.
  2. Click the 'Hide Keyboard' button.
  3. Observe the response.
- **Expected Result**: The app displays and hides the keyboard according to user actions.

## TC035: Display a Toast Button Functionality
- **Objective**: Verify the 'Display a Toast' button shows a Toast message.
- **Preconditions**: App launched, main screen displayed.
- **Steps**:
  1. Click the 'Display a Toast' button.
  2. Observe the response.
- **Expected Result**: The app displays a Toast message.

