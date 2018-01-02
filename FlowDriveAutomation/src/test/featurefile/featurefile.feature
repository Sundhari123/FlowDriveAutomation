Feature: As a user I need to launch the FlowDrive APP
         to check the functionality

  @Regression
  Scenario: Validate the new user account with valid inputs

    Given User is on launch page
    When User clicks signup and provide valid inputs
    Then The account is created and user should redirect to login page

  @Regression
  Scenario: Validate the user login with valid inputs

    Given User is on launch page
    When User provide valid login inputs and submit
    Then The user should launch in homepage

  @Regression
  Scenario: Validate the user details provisioning in social page

    Given User is on launch page
    When User provide valid login inputs and submit
    And User clicks social page
    And User provides screen name
    And User provides profile picture
    And User provides about me
    Then The user should be displayed with scores, friend & my profile icon

  @Regression
  Scenario: Validate the journey is started correctly

    Given User is on launch page
    When User provide valid login inputs and submit
    And User clicks start button & get duration information
    Then The user should able to start journey correctly

  @Regression
  Scenario: Validate the journey is stopped correctly

    Given User is on launch page
    When User provide valid login inputs and submit
    And User clicks start button & get duration information
    And User clicks stop button & get duration information
    Then The user should able to stop journey correctly

  @Regression
  Scenario: Validate the accident emergency call assistance

    Given User is on launch page
    When User provide valid login inputs and submit
    And User clicks emergency button
    And User clicks accident button
    Then The user should be provided with call option

  @Regression
  Scenario: Validate the breakdown emergency call assistance

    Given User is on launch page
    When User provide valid login inputs and submit
    And User clicks emergency button
    And User clicks breakdown button
    Then The user should be provided with call option


  @Regression
  Scenario: Validate the user is able to edit profile information

    Given User is on launch page
    When User provide valid login inputs and submit
    And User clicks social page
    And User clicks my profile
    And User edit profile
    Then The user should be displayed with changed screen name