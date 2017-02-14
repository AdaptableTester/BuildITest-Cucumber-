Feature: 3 hour Weather Forecast for a city

In order to get 3 hour Weather Forecast for a city
As a user
I will go to openweathermap.org site, select a day and click on the Hourly link


Scenario Outline: 3 hour Weather Forecast for a city

Given I am on the weather forecast site for a city on "<Browser>"
And   I click on  "HourlyLink"
And   I extract the first "Header"
And   I extract the slot 
Then  Difference should be  "<expected>" 

Examples:
|Browser| expected |   
|Chrome |  3       |