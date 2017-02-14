package com.buildit.app.com.openweathermap.testcases;

import org.junit.Assert;

import com.buildit.app.com.openweathermap.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DailyForecastSummaryData {

WebConnector selenium = WebConnector.getInstance();
	

	@Given("^I am on  weather forecast website for a city on \"([^\"]*)\"$")
	public void weatherforecast(String browserType){
		
		
		selenium.openBrowser(browserType);
		if(!selenium.isLoggedIn()){
			
			selenium.doDefaultLogin();
		}
		
		
	}

	
	@And("^I click   \"([^\"]*)\"$")
	public void submit4(String objectName){
		
	selenium.click(objectName);	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	

	@Then("^Wind direction,rainfall should be  \"([^\"]*)\"$")
	public void result(String ExpectedResult){
	
		 boolean result=selenium.isElementPresent("WD");
		 boolean result1=selenium.isElementPresent("Rain");
		 String actualresult=null;
		 
		 System.out.println(result);
		 
		 if(result && result1){
		 actualresult="Present";
		 }else{
		 actualresult="NotPresent";
		 }
		 
		 Assert.assertEquals(ExpectedResult,actualresult);
		 System.out.println("Wind direction,rainfall is displayed.");
		
	}
	






}
