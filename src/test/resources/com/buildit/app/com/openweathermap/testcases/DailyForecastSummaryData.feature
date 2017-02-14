Feature: Daily Forecast summary data for a city

In order to get Daily Forecast summary data for a city
As a user
I will go to openweathermap.org site, select a day and click on the Hourly link


Scenario Outline: Daily Forecast summary data for a city

Given I am on  weather forecast website for a city on "<Browser>"
And   I click   "HourlyLink"
Then  Wind direction,rainfall should be  "<expected>" 

Examples:
|Browser| expected |   
|Chrome |  Present |