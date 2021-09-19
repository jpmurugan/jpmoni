Feature: To verify different order Id number in adaction webpag

Scenario Outline: TC_01 to validate different users order number in adactin webpage
Given i launced the adactin application
When i enters the valid "<userId>" and valid "<password>"
And i clicks the login Button
Then i verify the navigation and the home page is displayed
When i enters the "<location>","<hotel>","<roomType>"
And i clicks on search Button
Then i verify the navigation and search hotel page displayed
And i clicks on radio Button and clicks continue Button
Then i verify the book a hotel page
When i enters "<firstName>","<lastName>" "<billingAddress>","<creditCardNumber>","<cardType>""<month>","<year>"and "<ccvNumber>"
And i clicks on book Button
Then i verify the order id is displayed

Examples: 
|userId|password|location|hotel|roomType|firstName|lastName|billingAddress|creditCardNumber|cardType|month|year|ccvNumber|
|prakashmurugan|Jpshiva@96|Sydney|Hotel Creek|Double|Jay|sathish|salem|1894567896321456|MAST|7|2020|895|
|prakashmurugan|Jpshiva@96|Brisbane|Hotel Sunshine|Deluxe|raj|ravi|salem|1987567896321456|MAST|7|2020|955|
|prakashmurugan|Jpshiva@96|Adelaide|Hotel Hervey|Standard|Jay|kumar|salem|1635567896321896|AMEX|7|2020|485|
|prakashmurugan|Jpshiva@96|London|Hotel Sunshine|Deluxe|arun|ravi|salem|1234567896365456|MAST|7|2020|425|
|prakashmurugan|Jpshiva@96|New York|Hotel Cornice|Standard|Jay|prakash|salem|1234567896321456|VISA|7|2020|555|