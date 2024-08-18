Feature:This feature is for Verify login activity



Scenario:Verify user login
Given  open ecommerce "<URL>" application
Then click account link
Then Enter user name and password and click login

Then verify user login successfully
