Feature: Login Functionality

Background: Browser Launch

Given User must be installed by user
When User enters in browsers
Then Application must open in browser

Scenario: User Login

Given User must login
When Use enters credentials and performs login
Then Use must be in the home page

Scenario: Search

Given Home page must be open
When seach for a product
Then prodct detail must be displayed


