Feature: To validate the Adactin web page

Background:
Given I launced the adactin web application in browser
Then i verify the navigation of homepage

Scenario: TC_01 to validate the Adactin webpage
When I enters the invalid username and invalid password
And I clicks the login Button 

Scenario Outline: TC_02 to validate the Adactin webpage
When I enters the valid "<userName>" and valid "<passWord>"
And I clicks the login Button

Examples:
|userName|passWord|
|prakashmurugan|Jpshiva@96|