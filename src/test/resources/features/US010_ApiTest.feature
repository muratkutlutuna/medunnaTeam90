
Feature: US010_ApiTest
@api10 @Api
  Scenario Outline: doctor should be able to see his/her appointment list in api
    When Doctor set Medunna base url with id <id>
    And Doctor send the GET request and GET the response
    And Doctor deserialize data json to java
    And Doctor saves the appointment data to correspondent files
    And Doctor validates expected data with API <patientId>, "<startDate>","<endDate>","<status>"
    Examples:
      | id | patientId |startDate|endDate|status|
    |49681| 49040    |2022-04-04T00:00:00Z|2022-04-04T01:00:00Z|PENDING|
    |45308|45110     |2022-04-04T03:00:00Z|2022-04-04T04:00:00Z|PENDING|
    |48768|49002     |2022-04-03T00:00:00Z|2022-04-03T01:00:00Z|UNAPPROVED|
    |47260|46779     |2022-04-01T00:00:00Z|2022-04-01T01:00:00Z|COMPLETED |
