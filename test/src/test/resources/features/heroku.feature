@heroku @web
Feature: Heroku Search Feature

Background:
   Given User is on the Threely login page

Scenario: Verify valid login
When I enter username as "wek_92@yahoo.com" and password as "aik1771"
And I click on submit button
Then I verify logout button is displayed 