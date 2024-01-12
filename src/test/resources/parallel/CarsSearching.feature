Feature: This is to verify the car search functionality

  @New
  Scenario: Validate search new car feature
    Given I am on the  home page "https://www.carsguide.com.au/" of carsguide website
    When I move to menu
      | buy + sell |
      | reviews    |
      | news       |
    And I click on the Search cars Link
    And I select the make  "Hyundai" from Make dropdown
    And I select the model  "Tucson" from Model dropdown
    And I Select the location "NSW - Newcastle" from the Location dropdown
    And I select the price "$60,000" from the Price dropdown
    And I click on Find My Next Car button
    Then the searched cars header "136 Hyundai Tucsons for Sale Under $60,000 in Newcastle, NSW" should be displayed
    And the Page title should be "Hyundai Tucson Under 60,000 for Sale Newcastle NSW | CarsGuide"

  @New
  Scenario: Validate search used cars feature
    Given I am on the  home page "https://www.carsguide.com.au/" of carsguide website
    When I move to menu
      | buy + sell |
      | reviews    |
      | news       |
    And I click on the Search Used cars Link
    And I select the make  "Hyundai" from Make dropdown
    And I select the model  "Tucson" from Model dropdown
    And I Select the location "NSW - Newcastle" from the Location dropdown
    And I select the price "$60,000" from the Price dropdown
    And I click on Find My Next Car button
    Then the searched cars header "20 Used Hyundai Tucsons for Sale Under $60,000 in Newcastle, NSW" should be displayed
    And the Page title should be "Used Hyundai Tucson Under 60,000 for Sale Newcastle NSW - Second Hand Hyundai Tucson Under 60,000 in Newcastle | CarsGuide"