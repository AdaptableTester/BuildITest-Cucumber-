package com.buildit.app.com.openweathermap.testcases;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.buildit.app.com.openweathermap.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Hide3HourForecast {


	WebConnector selenium = WebConnector.getInstance();
	int actualresult;

	@Given("^I am on  weather forecast site for a city on \"([^\"]*)\"$")
	public void weatherforecastsite(String browserType){
		
		
		selenium.openBrowser(browserType);
		if(!selenium.isLoggedIn()){
			
			selenium.doDefaultLogin();
		}
		
		
	}

	
	@And("^I click the  \"([^\"]*)\"$")
	public void submit2(String objectName){
		
	selenium.click(objectName);	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	

	
	
	@And("^I scroll down$")
	public void scroll(){
	
	selenium.Scroll();
		
	}
	
	 
	





}
