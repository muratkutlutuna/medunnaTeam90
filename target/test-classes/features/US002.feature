
Feature: US002 : Registration should be successful using email and username and validate them with Backend (API and DB)

  @UIRana
  Scenario Outline: TC00201 User can see and able to click the profile icon on the top of the right and able to fill the registration boxes

    Given RT goes to the home page
    And RT Click the profile icon on the top of the right
    And RT Click on registration
    And RT Enter "<SSN>" in SSN box
    And RT Enter the "<firstname>" in firstname box
    Then RT Enter "<lastname>" in lastname box
    Then RT Enter "<username>" in username box
    Then RT Enter "<email>" in an email box
    And RT Enter the "<password>" in password box
    And Enter the same "<password>" in new password confirmation box
    Then RT clicks on the register button
    Examples: test data
    |SSN|          firstname|  lastname| email|  username|  password|
    |213-54-3289|  rana89  |  kurt89     |kurt89@hotmail.com |kurt890 |kurt890|

    @UIRana2
   Scenario Outline: TC00202 Given username has to contain character and can not left blank. Negative Test: User left the username box blank

     Given RT goes to the home page
     And RT Click the profile icon on the top of the right
     And RT Click on registration
     And RT Enter "<SSN>" in SSN box
     And RT Enter the "<firstname>" in firstname box
     Then RT Enter "<lastname>" in lastname box
     Then RT Do not enter username in username box
     Then RT Enter "<email>" in an email box
     And RT Enter the "<password>" in password box
     And Enter the same "<password>" in new password confirmation box
     Then RT clicks on the register button
     And RT Warning message Your username is required is displayed
      Examples: test data
       |SSN|          firstname|  lastname| email|   password|
       |253-54-3236|  rana500  |  kurt500     |kurt500@hotmail.com| kurt00|

    @UIRana3
    Scenario Outline: TC00203 UsernameEmail ID has to created with "@" sign and ".com" extension and can't left blank. Negative test: User enters email without "@" and ".com"

      Given RT goes to the home page
      And RT Click the profile icon on the top of the right
      And RT Click on registration
      And RT Enter "<SSN>" in SSN box
      And RT Enter the "<firstname>" in firstname box
      Then RT Enter "<lastname>" in lastname box
      Then RT Enter "<username>" in username box
      Then RT Enter invalid email in email box
      And RT Enter the "<password>" in password box
      And Enter the same "<password>" in new password confirmation box
      Then RT clicks on the register button
      And RT Verify Warning message this field is invalid displayed
      Examples: test data
        |SSN |   firstname|  lastname| email|  username|  password|
        |223-54-3236|  rana200  |  kurt200     |kurt00hotmailcom |kurtt200 |kurtt200|

    @UIRana4
    Scenario Outline: TC00204 User can not leave Email box blank . Negative test: User leave Email box blank.

      Given RT goes to the home page
      And RT Click the profile icon on the top of the right
      And RT Click on registration
      And RT Enter "<SSN>" in SSN box
      And RT Enter the "<firstname>" in firstname box
      Then RT Enter "<lastname>" in lastname box
      Then RT Enter "<username>" in username box
      Then RT leaves email box blank
      And RT Enter the "<password>" in password box
      And Enter the same "<password>" in new password confirmation box
      And RT Verify warning message Your email is required is displayed
     Examples: test data

  |SSN|firstname|  lastname|  username|  password|
  |323-54-3235| rana100  |  kurt100   |kurtt100 |kurtt100|

