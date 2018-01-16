Feature: GET functionality check

Scenario: To test the GET is working fine on Petstore webapp
  Given I'm using the staging API environment "https://qa-petstore.herokuapp.com"
  When I make a GET request to "/api/pets"
  Then I get a response code of "200"
