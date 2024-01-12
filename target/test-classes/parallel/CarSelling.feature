Feature: This is to validate the Car Selling functionality

@New @Sell
  Scenario: Validate the Sell car feature
    Given I am on the  home page "https://www.carsguide.com.au/" of carsguide website
    When I move to menu
      | buy + sell |
      | reviews    |
      | news       |
    And I click on the Sell my car Link
    Then the Sell car page should open and the title should be "Sell my car online | CarsGuide"
    And Verify the Sell car page Header text is "Choose how to sell your car"
    And the Get Instant offer option should be available
    And the Start your listing option shpuld also be available
