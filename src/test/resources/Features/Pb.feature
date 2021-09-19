Feature: TO validate the order ID in  adactin web page 

Scenario: TC_01 to validate the Adactin webpage
Given i launced the adactin application in browser
When i enters the valid userid and valid password
And i clicks the login Button
Then i verify navigation of home page is displayed
When i enters the location,hotel,room type
And i clicks on search Button
Then i verify the navigation of search hotel page displayed
And i clicks on radio Button and clicks continue Button
Then i verify the book a hotel page
When i enters name, billing address,credit card number and CCV number
And i clicks on book Button
Then i verify navigation of order id