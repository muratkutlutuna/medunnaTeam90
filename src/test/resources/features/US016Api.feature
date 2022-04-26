  @Api @apiAina    #calistirmadan once delete endpiont id degistir
  Feature: US_016 Validate rooms with API

    Scenario: TC_01605 Validate all rooms with API creating

      Given AY User set path params for room creation
      And AY User enters expected data for room creation
      And AY User sends request and receives response for room creation
      And AY User save all API information for room creation
      And AY User verify API records for room creation

    Scenario: TC_01606 Validate all rooms with API reading(get)

     Given AY User set path params for room read
     And AY User enters expected data for room read
     And AY User sends request and receives response for room read
     And AY User save all API information for room read
     And AY User verify API records for room read

    Scenario: TC_01607 Validate all rooms with API updating
     Given AY User set path params for room update
      And AY User enters expected data for room update
      And AY User sends request and receives response for room update
      And AY User save all API information for room update
      And AY User verify API records for room update


    Scenario: TC_01608 Validate all rooms with API deleting
      Given AY User set path params for room delete
      And AY User sends request and receives response for room delete
      And AY User verify API records for room delete
