@US006
Feature: US006 User info segment (User Settings) should be editable on Homepage

  @PositiveTests @SmokeTest
  Scenario Outline: TC00601 There should be user firstname textbox to update
    Given MKT user enter the mainpage
    And MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And MKT user inputs his or her "<us06Password>" to password
    And MKT user click the Sign in button
    And MKT user click the top left the button that have same name with username
    And MKT user click settings at dropdown window
    And MKT user click firstname textbox
    And MKT user clear firstname textbox
    And MKT user input "<us06NewFirstName>" in firstname textbox
    And MKT user clicks save button
    And MKT user click the top left the button that have same name with username
    And MKT user click signout button in dropdown page
    And MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And MKT user inputs his or her "<us06Password>" to password
    And MKT user click the Sign in button
    And MKT user click the top left the button that have same name with username
    And MKT user click settings at dropdown window
    And MKT verify firstname textbox has "<us06NewFirstName>" value
    Examples: User Credentials
      |us06Username|us06Password|us06NewFirstName|
      |Team90userstory06user|Team90userstory06|tim|
      |Team90userstory06user|Team90userstory06|userstory06user|

    @PositiveTests
  Scenario Outline: TC00602 There should be user lastname textbox to update
    Given MKT user enter the mainpage
    And MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And MKT user inputs his or her "<us06Password>" to password
    And MKT user click the Sign in button
    And MKT user click the top left the button that have same name with username
    And MKT user click settings at dropdown window
    And MKT user click lastname textbox
    And MKT user clear lastname textbox
    And MKT user input "<us06NewLastName>" in lastname textbox
    And MKT user clicks save button
    And MKT user click the top left the button that have same name with username
    And MKT user click signout button in dropdown page
    And MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And MKT user inputs his or her "<us06Password>" to password
    And MKT user click the Sign in button
    And MKT user click the top left the button that have same name with username
    And MKT user click settings at dropdown window
    And MKT verify lastname textbox has "<us06NewLastName>" value
    Examples: User Credentials
      |us06Username|us06Password|us06NewLastName|
      |Team90userstory06user|Team90userstory06|nanny|
      |Team90userstory06user|Team90userstory06|team90|

    @PositiveTests
  Scenario Outline: TC00603 There should be user email textbox to update
    Given MKT user enter the mainpage
    And MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And MKT user inputs his or her "<us06Password>" to password
    And MKT user click the Sign in button
    And MKT user click the top left the button that have same name with username
    And MKT user click settings at dropdown window
    And MKT user click email textbox
    And MKT user input "<us06NewEmail>" in email textbox
    And MKT user clicks save button
    And MKT user click the top left the button that have same name with username
    And MKT user click signout button in dropdown page
    And MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And MKT user inputs his or her "<us06Password>" to password
    And MKT user click the Sign in button
    And MKT user click the top left the button that have same name with username
    And MKT user click settings at dropdown window
    And MKT verify email textbox has "<us06NewEmail>" value
    Examples: User Credentials
      |us06Username|us06Password|us06NewEmail|
      |Team90userstory06user|Team90userstory06|timnanny@gmail.com|
      |Team90userstory06user|Team90userstory06|team90userstory06user@gmail.com|

    @NegativeTests
  Scenario Outline: TC00604 There should be user language textbox to update
    Given MKT user enter the mainpage
    And MKT user click the left top user sign in button
    Then MKT user inputs his or her "<us06Username>" to username
    And MKT user inputs his or her "<us06Password>" to password
    And MKT user click the Sign in button
    And MKT user click the top left the button that have same name with username
    And MKT user click settings at dropdown window
    And MKT user check there no any language textbox in page
      Examples: User Credentials
        |us06Username|us06Password|
        |Team90userstory06user|Team90userstory06|