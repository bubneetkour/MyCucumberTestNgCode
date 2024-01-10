Feature: Verify the Search car page functionality for carsguide site 

Scenario: Validate Search Car page 

Given I am on the  home page "https://www.carsguide.com.au/" of carsguide website
When I move to menu 
|buy + sell|
|reviews|
|news|
And I click on the Search cars Link
And I select the make  "BMW" from Make dropdown
And I select the model  "1 Series" from Model dropdown
And I Select the location "NSW - All" from the Location dropdown
And I select the price "$1,000" from the Price dropdown
And I click on Find My Next Car button
Then the searched cars header "1 BMW 1 Series for Sale Under $1,000 in NSW" should be displayed 
And the Page title should be "Cheap BMW 1 Series Under 1,000 for Sale NSW | CarsGuide"




