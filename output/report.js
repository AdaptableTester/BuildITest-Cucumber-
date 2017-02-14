$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027com\\buildit\\app\\com\\openweathermap\\testcases\\DailyForecastSummaryData.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "Daily Forecast summary data for a city",
  "description": "\r\nIn order to get Daily Forecast summary data for a city\r\nAs a user\r\nI will go to openweathermap.org site, select a day and click on the Hourly link",
  "id": "daily-forecast-summary-data-for-a-city",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 16,
  "name": "Daily Forecast summary data for a city",
  "description": "",
  "id": "daily-forecast-summary-data-for-a-city;daily-forecast-summary-data-for-a-city;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I am on  weather forecast website for a city on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click   \"HourlyLink\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Wind direction,rainfall should be  \"Present\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 49
    }
  ],
  "location": "DailyForecastSummaryData.weatherforecast(String)"
});
formatter.result({
  "duration": 39704547807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HourlyLink",
      "offset": 11
    }
  ],
  "location": "DailyForecastSummaryData.submit4(String)"
});
formatter.result({
  "duration": 2121949892,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Present",
      "offset": 36
    }
  ],
  "location": "DailyForecastSummaryData.result(String)"
});
formatter.result({
  "duration": 258196246,
  "status": "passed"
});
formatter.uri("\u0027com\\buildit\\app\\com\\openweathermap\\testcases\\Get3HourForecast.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "3 hour Weather Forecast for a city",
  "description": "\r\nIn order to get 3 hour Weather Forecast for a city\r\nAs a user\r\nI will go to openweathermap.org site, select a day and click on the Hourly link",
  "id": "3-hour-weather-forecast-for-a-city",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 18,
  "name": "3 hour Weather Forecast for a city",
  "description": "",
  "id": "3-hour-weather-forecast-for-a-city;3-hour-weather-forecast-for-a-city;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I am on the weather forecast site for a city on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on  \"HourlyLink\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I extract the first \"Header\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I extract the slot",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Difference should be  \"3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 49
    }
  ],
  "location": "Get3HourForecast.weatherforecastsite(String)"
});
formatter.result({
  "duration": 192775773,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HourlyLink",
      "offset": 13
    }
  ],
  "location": "Get3HourForecast.submit1(String)"
});
formatter.result({
  "duration": 2046590126,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Header",
      "offset": 21
    }
  ],
  "location": "Get3HourForecast.extract(String)"
});
formatter.result({
  "duration": 140263036,
  "status": "passed"
});
formatter.match({
  "location": "Get3HourForecast.slot()"
});
formatter.result({
  "duration": 117778361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 23
    }
  ],
  "location": "Get3HourForecast.result(int)"
});
formatter.result({
  "duration": 33793951,
  "status": "passed"
});
formatter.uri("\u0027com\\buildit\\app\\com\\openweathermap\\testcases\\Hide3HourForecast.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "Hide 3 hour Weather Forecast for a city",
  "description": "\r\nIn order to hide 3 hour Weather Forecast for a city\r\nAs a user\r\nI will go to openweathermap.org site, select a day and click on the Hourly link\r\nand will scroll down",
  "id": "hide-3-hour-weather-forecast-for-a-city",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 18,
  "name": "Hide 3 hour Weather Forecast for a city",
  "description": "",
  "id": "hide-3-hour-weather-forecast-for-a-city;hide-3-hour-weather-forecast-for-a-city;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I am on  weather forecast site for a city on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click the  \"HourlyLink\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I scroll down",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 46
    }
  ],
  "location": "Hide3HourForecast.weatherforecastsite(String)"
});
formatter.result({
  "duration": 31684980,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HourlyLink",
      "offset": 14
    }
  ],
  "location": "Hide3HourForecast.submit2(String)"
});
formatter.result({
  "duration": 2053283854,
  "status": "passed"
});
formatter.match({
  "location": "Hide3HourForecast.scroll()"
});
formatter.result({
  "duration": 81363593,
  "status": "passed"
});
formatter.uri("\u0027com\\buildit\\app\\com\\openweathermap\\testcases\\WeatherForecast.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "Weather Forecast for a city",
  "description": "\r\nIn order to get Weather forecast for a city\r\nAs a user\r\nI will go to openweathermap.org site",
  "id": "weather-forecast-for-a-city",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 18,
  "name": "Weather Forecast",
  "description": "",
  "id": "weather-forecast-for-a-city;weather-forecast;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I go to \"URL\" on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I enter the \"Coventry\" in the \"SearchBox\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the \"SearchButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on the \"SearchResult\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Weather forecast should be \"success\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "URL",
      "offset": 9
    },
    {
      "val": "Chrome",
      "offset": 18
    }
  ],
  "location": "WeatherForecast.gotosalesforce(String,String)"
});
formatter.result({
  "duration": 1217913842,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Coventry",
      "offset": 13
    },
    {
      "val": "SearchBox",
      "offset": 31
    }
  ],
  "location": "WeatherForecast.enterUsername(String,String)"
});
formatter.result({
  "duration": 275299612,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SearchButton",
      "offset": 16
    }
  ],
  "location": "WeatherForecast.submit(String)"
});
formatter.result({
  "duration": 4031932202,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SearchResult",
      "offset": 16
    }
  ],
  "location": "WeatherForecast.submit(String)"
});
formatter.result({
  "duration": 4802223567,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success",
      "offset": 28
    }
  ],
  "location": "WeatherForecast.result(String)"
});
formatter.result({
  "duration": 71563084,
  "status": "passed"
});
});