Feature: Booking the hotel room in adactin app

Scenario: login the adactin application

Given user launch the website
When user enter the user name
And user enter the password
Then login the application 


 Scenario: search of hotel

When user can select the location by using dropdown
And user can select the hotel name by using dropdown
And user can select the room type by using dropdown
And user can select the number rooms needed by using dropdown
And user can enter the adult no of person by using dropdown
And user can enter the no of children by using dropdown
Then search the given details to next page

Scenario: check the details you have given
 
 When user can click the radio button you have selected
 Then continue to the next page
 
 Scenario: enter the personal details
 When user can enter the first name
 And user can enter the last name 
 And user can enter the billing address
 And user can enter the credit card no:
 And user can enter the card type
 And user can enter the expiry month 
 And user can enter the expiry year
 And user can enter the cvv number
 Then Book the hotel
 
  Scenario: booking confirmation
  Then confirmation of hotel room 
 























