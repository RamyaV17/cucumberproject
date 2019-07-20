Feature: Login Functionality
Scenario Outline: User Login

Given Use must login
When Use enters and login
Then User mut be in the home page

Examples:
|username||password|
|abc123||ram123|
|abcd123||ramya123|



