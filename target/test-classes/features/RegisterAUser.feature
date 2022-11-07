@SelendroidApp @SanityTest @RegisterUser
Feature: Feature to Validate RegisterAUser

Background:Navigate to HomeScreen
  When User Click on Continue
  And User Click on Ok on PopUp
  Then Navigate to HomeScreen


  @popupwindow
  Scenario: Display A popupWindow
    When Click on PopupwindowButton
    Then Click On Dismiss button


  Scenario Outline: Register A User Successfully.

    When Click on Folder Icon
    Then Navigate to Register User Screen
    When Enter User "<Name>"
    And Enter "<Password>"
    And Enter user "<Email>"
    Then Click RegisterUser Button
    Examples:
    |Name|Email|Password|
    |  Test  | test@gmail.com|test@123|

