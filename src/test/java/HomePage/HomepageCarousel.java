package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageCarousel {
	public WebDriver driver;

	
	 public HomepageCarousel(WebDriver driver) {
		 this.driver = driver; 
		 }
	
	
	By carOne = By.xpath("//li[@data-target='#home-carousel'][1]");
	By carOneBtn = By.xpath("//body/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/amarr-carousel[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]/span[1]");
	By carTwo = By.xpath("//li[@data-target='#home-carousel'][2]");
	By carTwoBtn = By.xpath("//button/span[text()='TELL ME HOW']");
	By carTrd = By.xpath("//li[@data-target='#home-carousel'][3]");
	By carTrdBtn = By.xpath("//button/span[text()='SHOW ME']");
	By carFrth = By.xpath("//li[@data-target='#home-carousel'][4]");
	By carFrthBtn = By.xpath("/html[1]/body[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/amarr-carousel[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]/span[1]");
	By carFive = By.xpath("//li[@data-target='#home-carousel'][5]");
	By carFiveBtn = By.xpath("//button/span[text()='SHOW ME HOW']");
	
	
	public void CaroOne() throws InterruptedException {
	driver.findElement(carOne).click();
	Thread.sleep(1000);
	driver.findElement(carOneBtn).click();
	Thread.sleep(1000);
	}
	
	public void CaroTwo() throws InterruptedException {
	driver.findElement(carTwo).click();
	Thread.sleep(1000);
	driver.findElement(carTwoBtn).click();
	Thread.sleep(1000);
	}
	
	public void CaroThree() throws InterruptedException {
	driver.findElement(carTrd).click();
	Thread.sleep(1000);
	driver.findElement(carTrdBtn).click();
	Thread.sleep(1000);
	}
	
	public void CaroFour() throws InterruptedException {
	driver.findElement(carFrth).click();
	Thread.sleep(1000);
	driver.findElement(carFrthBtn).click();
	Thread.sleep(1000);
	}
	
	public void CaroFive() throws InterruptedException {
	driver.findElement(carFive).click();
	Thread.sleep(1000);
	driver.findElement(carFiveBtn).click();
	Thread.sleep(1000);
	}
	
	

}
