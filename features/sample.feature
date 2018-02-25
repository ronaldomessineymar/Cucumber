Feature: This is just a test for cucumber

Scenario: User searches item on google and check if the title matches the keyword
     Given I navigate to google homepage
     When I enter a keyword search
     And I click on search button
     Then I should be able to see the title contains the keyword