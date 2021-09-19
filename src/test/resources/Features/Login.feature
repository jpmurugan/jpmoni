Feature: To validae order in adactin application

Scenario: TC01_validate the login  page
Given i launced the adactin application
When i enters the valid userid and valid password
And i clicks the login Button
Then i verify the home page is displayed
When i enters the location,hotel,room type
And i clicks on search Button
Then i verify the search hotel page displayed
And i clicks on radio Button and clicks continue Button
Then i verify the book a hotel page
When i enters name, billing address,credit card number and CCV number
And i clicks on book Button
Then i verify the order id
