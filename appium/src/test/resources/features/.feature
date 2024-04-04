Feature: Main page buttons

  Scenario: User clicks the 'Displays a Toast' button
    Given the app is opened to the main screen
    When the user clicks the 'Displays a Toast' button
    Then a Toast message is displayed


  Scenario: User clicks the 'Display Popup Window' button
    Given the app is opened to the main screen
    When the user clicks the 'Display Popup Window' button
    Then a Popup is displayed
