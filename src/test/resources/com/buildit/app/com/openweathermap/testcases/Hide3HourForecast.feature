Feature: Hide 3 hour Weather Forecast for a city

In order to hide 3 hour Weather Forecast for a city
As a user
I will go to openweathermap.org site, select a day and click on the Hourly link
and will scroll down


Scenario Outline: Hide 3 hour Weather Forecast for a city

Given I am on  weather forecast site for a city on "<Browser>"
And   I click the  "HourlyLink"
And   I scroll down 


Examples:
|Browser|   
|Chrome | 