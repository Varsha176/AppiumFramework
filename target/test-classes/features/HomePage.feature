@SelendroidApp @SmokeTest
Feature: Feature to Validate selendroid App HomePage


  @HomeScreen
  Scenario: Verify SelendroidApp HomePage Feature

    When User Click on Continue
    And User Click on Ok on PopUp
    Then Navigate to HomeScreen

@EnButton
    Scenario: Verify EN button functionality

      When User Click on Continue
      And User Click on Ok on PopUp
      Then Navigate to HomeScreen
      When User Click on EnButton
      Then Navigate to Confirmation Popup
      When Click on I Agree
      Then Application Closes Successfully

  @DisplayTextView
  Scenario: Verify DisplayTextView button functionality
    When User Click on Continue
    And User Click on Ok on PopUp
    Then Navigate to HomeScreen
    When User Click on DisplayTextViewButton
    Then Verify Text displayed
