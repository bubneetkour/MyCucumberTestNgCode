 Feature: This is to verify the car reviews functionality
@New
 
  Scenario: Validate the Car Reviews feature
    Given I am on the  home page "https://www.carsguide.com.au/" of carsguide website
    When I move to Reviews menu
      | buy + sell |
      | reviews    |
      | news       |
    And I click on the All Reviews Link
    Then the Reviews page should open and the title should be "Car Reviews Australia: Independent Car Reviews | CarsGuide"
    And the correct header should be displayed "Car reviews"  