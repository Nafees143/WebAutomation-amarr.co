package com.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverSetup {

   public  WebDriver driver;
	public static String baseUrl = "https://www.amarr.com/us/en";
	
	//(//section[@id="why-Amarr-garage"])[2]
	
	public void Driversetup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	    driver.get(baseUrl);
	    new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
	
	
	public void scorllToElement(By scrollFind) throws InterruptedException {
		 WebElement scrollFindOne = driver.findElement(scrollFind);
		 JavascriptExecutor je = (JavascriptExecutor) driver;
		 je.executeScript("arguments[0].scrollIntoView();", scrollFindOne);
		 Thread.sleep(3000);
	}

}
