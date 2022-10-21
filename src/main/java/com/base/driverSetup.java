package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverSetup {

   public static WebDriver driver;
	public static String baseUrl = "https://www.amarr.com/us/en";
	
	public void Driversetup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	    driver.get(baseUrl);
	    new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	 

	}

}
