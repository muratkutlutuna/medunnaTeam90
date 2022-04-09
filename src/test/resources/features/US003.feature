@US003
Feature: User should be able to see the level chart change accordingly

  @US003_TC001

  Scenario Outline:
    Given FY User navigates to Medunna home page
    And FY User clicks on human icon
    And FY User clicks on Register button
    And FY User provides the new password "<password>"
    Then FY User validates the password strength "<strength>"


    Examples: test data
      | password | strength |
      | qwertyU  | 2        |
      | asdfgh1  | 2        |
      | zxcvbn@  | 2        |
      | zxcvbn?  | 2        |
      | 123456a  | 2        |
      | ABCDEFg  | 2        |
      | ?&!.$%a  | 2        |
      | ?&!.$%B  | 2        |
      | ?&!.$%7  | 2        |
      | 1234Ab!  | 5        |
      | abcDE1@  | 5        |
