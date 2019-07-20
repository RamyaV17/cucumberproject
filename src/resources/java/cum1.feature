Feature: Sign-in
Sign-up should be quick and friendly
Scenario: Successful sign-up
Given  Sign up
When I have to sign up with details
Then receive confirmation  mail
And greeting message
