package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.driverSetup;

public class homePageTest extends driverSetup {
	//WebDriver driver;
	

	// Title and text for assert
	String pageTitle = "Amarr Garage Doors & Commercial Doors";
	String logoSrcText = "https://www.amarr.com/content/dam/amarr/com/us/en/icons/amarr-logo.svg";
	By scrollFind = By.xpath("(//section[@id=\"why-Amarr-garage\"])[2]");

	// scroll test

	// Locators
	By AcceptAllCookie = By.xpath("//button[text()='Accept All']");
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

		driver.findElement(AcceptAllCookie).click();
		Thread.sleep(1000);

	}

	@Test(priority = 2)
	public void logoTestNclick() throws InterruptedException {
		String logoText = driver.findElement(logoImg).getAttribute("src");
		Assert.assertEquals(logoSrcText, logoText);
		Thread.sleep(3000);
		
		
//		scorllToElement(scrollFind);
//		Thread.sleep(5000);
		
		driver.findElement(logoImg).click();
		Thread.sleep(1000);

	}

	@Test(priority = 3)

	public void HomeCarousel() throws InterruptedException {
		HomepageCarousel carousel = new HomepageCarousel(driver);
		// First Carousel-
		carousel.CaroOne();
		driver.findElement(logoImg).click();
		Thread.sleep(1000);

		// Second Carousel-
		carousel.CaroTwo();
		driver.findElement(logoImg).click();
		Thread.sleep(1000);

		// Third Carousel-
		carousel.CaroThree();
		driver.findElement(logoImg).click();
		Thread.sleep(1000);

		// fourth Carousel-
		carousel.CaroFour();
		driver.findElement(logoImg).click();
		Thread.sleep(1000);

	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}