Feature: Application login 

@Regression
Scenario: Home page defaultlogin
Given User is on netbanking landing page
When User login to the application and enter username and password
Then Home page should be populated 
And Cards are displayed 


Scenario Outline: User page default login
Given User is on netbanking landing page
When User login to the application with Username "<Username>" and Password "<Password>"
Then Home page should be populated 
And Cards are displayed 

Examples: 
 | Username | Password |
 | DebitUser | 1234 |
 | CreditUser | 4321 |