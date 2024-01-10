 Feature: This is to verify the car reviews functionality
@new
 
  Scenario: Validate the Car Reviews feature
    Given I am on the  home page "https://www.carsguide.com.au/" of carsguide website
    When I move to Reviews menu
      | buy + sell |
      | reviews    |
      | news       |
    And I click on the All Reviews Link
    Then the Reviews page should open