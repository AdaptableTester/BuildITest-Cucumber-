package com.buildit.app.com.openweathermap.testcases;

import org.junit.Assert;

import com.buildit.app.com.openweathermap.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WeatherForecast {

	WebConnector selenium = WebConnector.getInstance();

	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void gotosalesforce(String URL,String browserType){
		
		
		selenium.openBrowser(browserType);
		selenium.navigate(URL);
		
	}

	@And("^I enter the \"([^\"]*)\" in the \"([^\"]*)\"$")
	public void enterUsername(String City,String Object){
	
	 selenium.type(Object,City);
	 	
	}


	@And("^I click on the \"([^\"]*)\"$")
	public void submit(String objectName){
		
	selenium.click(objectName);	
	try {
		Thread.sleep(2500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}


	@Then("^Weather forecast should be \"([^\"]*)\"$")
	public void result(String ExpectedResult){
		
	 boolean result=selenium.isElementPresent("WFE");
	 String actualresult=null;
	 
	 System.out.println(result);
	 
	 if(result){
	 actualresult="success";
	 }else{
	 actualresult="failure";
	 }
	 
	 Assert.assertEquals(ExpectedResult,actualresult);
	 
	 
		
		
	}	









}
