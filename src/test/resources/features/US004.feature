@SigninPage
Feature: Login page should accessible only with valid credentials

  @login
  Scenario Outline: Verifying user login with correct username and password

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    When C Click on Account DropDownMenu button
    And Verify that Sign Out  is displayed
    Examples:
      | username    | password        |
      | admincemile | AdminCemile123! |

  @cancelLogin
  Scenario Outline: There should be a cancel login option
    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Verify that Cancel button is enable

    Examples:
      | username    | password        |
      | admincemile | AdminCemile123! |

  @rememberMe
  Scenario Outline: should be a remember me option

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    And C Verify that remember me checkbox is clickable
    Examples:
      | username    | password        |
      | admincemile | AdminCemile123! |

  @didYouForget
  Scenario Outline: There should be an option to update password if forgotten 'Did you forget your password'

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    And C Click on Did you forget your password? text box
    And C Verify that Reset your password? Header is visible
    And C Click on email text box
    And C Enter the "<email>" address you used to register
    And C Click on Reset password button
    And C Verify Alert Check your emails for details on how to reset your password is visible

    Examples:
      | email                 |
      | admincemile@gmail.com |


  @registration
  Scenario: There should be an option to navigate to registration page if not registered yet

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    And C Verify You don't have an account yet? Register a new account is visible
    And C Click on Register a new account
    And C Verify that  Registration Page is visible

  @loginWrongPassword @Negative
  Scenario Outline: Verifying user login with correct username and wrong password
    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter wrong "<wpassword>" Password
    Then C Click on Sign in button
    Then Verify that Failed to sign in!  is displayed
    Examples:
      | username    | wpassword |
      | admincemile | Admin123! |

  @loginWrongUsername @Negative
  Scenario Outline: Verifying user login with wrong username and correct password

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter wrong "<wusername>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And Verify that Failed to sign in!  is displayed
    Examples:
      | wusername | password        |
      | admin     | AdminCemile123! |

  @loginWrongUsernameAndWrongPassword @Negative
  Scenario Outline: Verifying user login with wrong username and wrong password

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter wrong "<wusername>" Username
    Then C Click on Password input box.
    Then C Enter wrong "<wpassword>" Password
    Then C Click on Sign in button
    And Verify that Failed to sign in!  is displayed
    Examples:
      | wusername | wpassword |
      | admin     | Admin123! |