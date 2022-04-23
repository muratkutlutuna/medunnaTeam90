Feature: Contact Test

  @UIContact
  Scenario: Contact Testing

    Given AG user enter the MainPage
    Given AG user click Contact Button
    Given AG user enter Name  "<Name>"
    Then AG user enter Email "<Email>"
    And AG user enter Subject "<Subject>"
    And AG user enter Message "<Message>"
    Then AG user click Send Button
