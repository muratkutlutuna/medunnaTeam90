  @Api @apiAina
  Feature: US_016 Room creation / View / Update / Delete Validate them also with API and DB by Admin

    Scenario: TC_01605 Validate all rooms with API creating

      And AY User set path params for room creation
      And AY User enters expected data for room creation
      And AY User sends request and receives response for room creation
      And AY User save all API information for room creation
      And AY User verify API records for room creation

    Scenario: TC_01606 Validate all rooms with API reading

    # And AY User set path params for room reading
    # And AY User enters expected data for room reading
    # And AY User sends request and receives response for room reading
    # And AY User save all API information for room reading
    # And AY User verify API records for room reading

    Scenario: TC_01605 Validate all rooms with API updating

    Scenario: TC_01605 Validate all rooms with API deleting