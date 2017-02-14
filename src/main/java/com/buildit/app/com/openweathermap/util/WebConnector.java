package com.buildit.app.com.openweathermap.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebConnector {
	// initialize properties file
	// logging
	// selenium/webdriver layer -  selenium commands
	
	//Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	Properties OR = null;
	Properties CONFIG=null;
	WebDriver driver =null;
	WebDriver mozilla=null;
	WebDriver chrome=null;
	WebDriver ie=null;
	static WebConnector w;
	
	private WebConnector(){
		FileInputStream fs;
		if(OR==null){
			try{
				// initialize OR
				OR = new Properties();
				 fs  = new FileInputStream("F:\\WorkSpace\\BuildIT\\src\\main\\java\\com\\buildit\\app\\com\\openweathermap\\config\\OR.properties");
				OR.load(fs);
				
			}catch(Exception e){
				System.out.println("Error on intializing properties files");
			}
			
			
			
		}
		
		if(CONFIG==null){
			try{
				
				// initialize CONFIG to corresponding env
				CONFIG= new Properties();
				fs  = new FileInputStream("F:\\WorkSpace\\BuildIT\\src\\main\\java\\com\\buildit\\app\\com\\openweathermap\\config\\config.properties");
				CONFIG.load(fs);
				
				//System.out.println(OR.getProperty("loginusername"));
				System.out.println(CONFIG.getProperty("URL"));
				
				
			}catch(Exception e){
				System.out.println("Error on intializing properties files");
			}
			
			
			
		}
		
	}
	
	/// ****************Application Independent functions************************ ///

	// opening the browser
	public void openBrowser(String browserType){
		
		if(browserType.equals("Mozilla") && mozilla==null){
			driver = new FirefoxDriver();
			mozilla=driver;
		}else if(browserType.equals("Mozilla") && mozilla!=null){
			driver=mozilla;
		}else if(browserType.equals("Chrome") && chrome==null){
			System.setProperty("webdriver.chrome.driver", "F://ChromeDriver//chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
			chrome=driver;
		}else if(browserType.equals("Chrome") && chrome==null){
			driver=chrome;
		}
		
		else if(browserType.equals("IE")){
			// set the IE server exe path and initialize
		}
		// max
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	// navigates to a URL
	public void navigate(String URL){
		
		System.out.println(CONFIG.getProperty("URL"));
		driver.get(CONFIG.getProperty("URL"));
	}
	// clicking on any object
	public void click(String objectName){
		
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
	}
	
	public void type(String objectName, String text ){
		
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	
	public void select(String text, String objectName){
		
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	
	public boolean isElementPresent(String objectName){
		
		int count = driver.findElements(By.xpath(OR.getProperty(objectName))).size();
		if(count==0)
			return false;
		else
			return true;
	}

	
      public String extract(String objectName){
		//System.out.println(driver.findElement(By.xpath(OR.getProperty(objectName))).getText());
		return (driver.findElement(By.xpath(OR.getProperty(objectName))).getText());
	}
	
	
	public void Scroll(){
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,450)", "");
	}
	
	/// ****************Application dependent functions************************ ///
	
	public boolean isLoggedIn(){
		
		if(isElementPresent("SearchBox"))
			return true;
		else
			return false;
	}
	
	public void doDefaultLogin(){
		navigate("URL");
		driver.findElement(By.xpath(OR.getProperty("SearchBox"))).sendKeys("coventry");
		driver.findElement(By.xpath(OR.getProperty("SearchButton"))).click();
		driver.findElement(By.xpath(OR.getProperty("SearchResult"))).click();
		
	}
	
	
	/********Singleton**********/
	public static WebConnector getInstance(){
		if(w==null)
			w= new WebConnector();
		
		return w;
	}
	
	/**************Logging***************/
	/*public void log(String msg){
		APPLICATION_LOGS.debug(msg);
	}*/
	
	
	
	
	
	
	
	
}
