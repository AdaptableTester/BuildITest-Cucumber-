Feature: Weather Forecast for a city

In order to get Weather forecast for a city
As a user
I will go to openweathermap.org site


Scenario Outline: Weather Forecast

Given I go to "URL" on "<Browser>"
And   I enter the "<City>" in the "SearchBox"
And   I click on the "SearchButton"
And   I click on the "SearchResult"
Then  Weather forecast should be "<expected>" 

Examples:
|Browser|  City    |expected |   
|Chrome | Coventry | success |

