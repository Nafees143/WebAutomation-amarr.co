package HomePage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.driverSetup;

public class homePageTest extends driverSetup {
	HomepageCarousel carousel = new HomepageCarousel(driver);

	
	String pageTitle = "Amarr Garage Doors & Commercial Doors";
	String logoSrcText = "https://www.amarr.com/content/dam/amarr/com/us/en/icons/amarr-logo.svg";

	By AcceptAll = By.xpath("//button[text()='Accept All']");
	By logoImg = By.xpath("//a/img[@alt='Amarr Garage Doors']");
	
	
	@BeforeSuite
	public void Browser() throws InterruptedException {
		Driversetup();

	}

	@Test(priority = 1)
	public void titleNacceptCook() throws InterruptedException {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, actualTitle);
		Thread.sleep(1000);
		
		driver.findElement(AcceptAll).click();
		Thread.sleep(1000);

	}

	@Test(priority = 2)
	public void logoTestNclick() throws InterruptedException {
		String logoText = driver.findElement(logoImg).getAttribute("src");
		Assert.assertEquals(logoSrcText, logoText);
		Thread.sleep(1000);
		
		driver.findElement(logoImg).click();
		Thread.sleep(1000);

		
	}
	
	@Test(priority = 3)
	
	public void HomeCarousel() throws InterruptedException {
		//First Carousel-
		carousel.CaroOne(driver);
		driver.findElement(logoImg).click();
		Thread.sleep(1000);
		
		//Second Carousel-
		carousel.CaroTwo(driver);
		driver.findElement(logoImg).click();
		Thread.sleep(1000);
		
		//Third Carousel-
		carousel.CaroThree(driver);
		driver.findElement(logoImg).click();
		Thread.sleep(1000);
		
		//fourth Carousel-
		carousel.CaroFour(driver);
		driver.findElement(logoImg).click();
		Thread.sleep(1000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
