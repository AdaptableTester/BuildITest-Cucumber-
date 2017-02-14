package com.buildit.app.com.openweathermap.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F://ChromeDriver//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://openweathermap.org/city");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='hourly_list_a']")).click();
		/*System.out.println(driver.findElement(By.xpath("//*[@id='hourly_long_list']/table/tbody/tr[2]/td[1]")).getText());
		String time=driver.findElement(By.xpath("//*[@id='hourly_long_list']/table/tbody/tr[2]/td[1]")).getText();
		if (time.equals("21:00")){
			System.out.println("apurba");
		}else{
			
			System.out.println("apurba1");
		}
	    List<WebElement> rows =driver.findElements(By.xpath("//*[@id='hourly_long_list']/table/tbody/tr")); 
	    System.out.println(rows.size());*/
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// WebElement  Scroll = driver.findElement(By.xpath("html"));
     	  
  	     //Scroll.sendKeys(Keys.PAGE_DOWN);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,450)", "");
	    
	   
	    		
	
	}

}
