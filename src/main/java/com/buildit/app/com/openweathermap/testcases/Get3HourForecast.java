package com.buildit.app.com.openweathermap.testcases;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.buildit.app.com.openweathermap.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Get3HourForecast {

	WebConnector selenium = WebConnector.getInstance();
	int actualresult;

	@Given("^I am on the weather forecast site for a city on \"([^\"]*)\"$")
	public void weatherforecastsite(String browserType){
		
		
		selenium.openBrowser(browserType);
		if(!selenium.isLoggedIn()){
			
			selenium.doDefaultLogin();
		}
		
		
	}

	
	@And("^I click on  \"([^\"]*)\"$")
	public void submit1(String objectName){
		
	selenium.click(objectName);	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	
	@And("^I extract the first \"([^\"]*)\"$")
	public void extract(String objectName){
		
	selenium.click(objectName);	
	
	}
	
	
	@And("^I extract the slot$")
	public void slot(){
	
	String FirstTime=selenium.extract("FirstTime");
	if (FirstTime.equals("21:00")){
		System.out.println("There is no other slot");
		actualresult=3;
		
	}else{
		String SecondTime=selenium.extract("SecondTime");
		 System.out.println(FirstTime);
		 System.out.println(SecondTime);
		 String[] parts = SecondTime.split(":");
	     String[] parts1 = FirstTime.split(":");
	     System.out.println(Integer.parseInt(parts[0]));
	    System.out.println(Integer.parseInt(parts1[0]));
	    actualresult= Integer.parseInt(parts[0])-Integer.parseInt(parts1[0]);
	   System.out.println(actualresult);
		
		
	}
	
	 
	}
	

	@Then("^Difference should be  \"([^\"]*)\"$")
	public void result(int ExpectedResult){
		
	 System.out.println(actualresult);
	 
	
	 Assert.assertEquals(ExpectedResult,actualresult);
	 
	 
		
		
	}	








}
