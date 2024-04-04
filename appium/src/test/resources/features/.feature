Feature: Show Toast Message

  Scenario: User clicks the 'Show Toast' button
    Given the app is opened to the main screen
    When the user clicks the 'Show Toast' button
    Then a Toast message is displayed
