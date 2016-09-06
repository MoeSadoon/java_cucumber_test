#Feature: Fill in the contact form and send
#
#Scenario: Ensure you can fill in the contact
#Given I am on the zoo page
#When I click on the contact page
#And I fill in the form with the following details
#| Field    | Value          |
#| Name     | Moe            |
#| Address  | Barnet         |
#| Postcode | NW8            |
#| Email    | moe@sadoon.com |
#Then I check I am on the confirmation page

Feature: Check I'm on the correct page titles

  Scenario Outline: Ensure page title is right
    Given I am on the zoo page
    When I click on <link>
    Then the title should be <title>
    And I close the browser

    Examples: 
      | link          | title     |
      | adoption_link | Adoption  |
      | about_link    | About Zoo |
      | contact_link  | Contact   |
