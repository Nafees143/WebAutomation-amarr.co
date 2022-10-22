package HomePage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.driverSetup;

public class homePageTest extends driverSetup {
	// WebDriver driver;

	// Title and text for assert
	String pageTitle = "Amarr Garage Doors & Commercial Doors";
	String logoSrcText = "https://www.amarr.com/content/dam/amarr/com/us/en/icons/amarr-logo.svg";
	String WhyAmarVideoExpectdText = "https://www.amarr.com/content/dam/amarr/com/us/en/videos/Home%20Page%20Video%20Approved-1%20compressed.mp4";

	// scroll----- 1.ExploreProductsOne,2.DesignGarageDoor,3.WhyAmarVideoSection,4.FindAdealer.
	

	// Locators
	By AcceptAllCookie = By.xpath("//button[text()='Accept All']");
	By logoImg = By.xpath("//a/img[@alt='Amarr Garage Doors']");
	//ExploreProducts HomePage
	By ExploreProductsOne = By.xpath("//img[@alt='Garage Doors']");
	By ExploreProductsTwo = By.xpath("(//img[@alt='Commercial Doors'])[2]");
	//DesignGarageDoor HomePage
	By DesignGarageDoor = By.xpath("(//section[@id='why-Amarr-garage'])[1]");
	By DesignMyDoor = By.xpath("//span[contains(text(),'DESIGN MY DOOR')]");
	//Dealer Image section
	By FindAdealer = By.xpath("//img[@class='dealer-image']");
	By FindAdealerBtn = By.xpath("//span[contains(text(),'FIND A DEALER')]");
	//video section
	By WhyAmarVideo = By.xpath("//video[@class='video-display']");
	By WhyAmarVideoPath = By.xpath("//source[@src='/content/dam/amarr/com/us/en/videos/Home Page Video Approved-1 compressed.mp4']");
	By WhyAmarVideoBtn = By.xpath("//span[contains(text(),'SEE WHY')]");
	
	
	
	

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

		driver.findElement(logoImg).click();
		Thread.sleep(1000);

	}

	@Test(priority = 3)

	public void HomeCarousel() throws InterruptedException {
		HomepageCarousel carousel = new HomepageCarousel(driver);
		// First Carousel-
		carousel.CaroOne();
		driver.navigate().back();
		Thread.sleep(1000);

		// Second Carousel-
		carousel.CaroTwo();
		driver.navigate().back();
		Thread.sleep(1000);

		// Third Carousel-
		carousel.CaroThree();
		driver.navigate().back();
		Thread.sleep(1000);

		// fourth Carousel-
		carousel.CaroFour();
		driver.navigate().back();
		Thread.sleep(1000);

		// FiveNo Carousel-
		carousel.CaroFive();
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	
	@Test(priority=4)
	
	public void ExploreProducts() throws InterruptedException {
	scorllToElement(ExploreProductsOne);
	Thread.sleep(1000);
	driver.findElement(ExploreProductsOne).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	
	scorllToElement(ExploreProductsOne);
	Thread.sleep(2000);
	driver.findElement(ExploreProductsTwo).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	
	}
	
	@Test(priority=5)
	
	public void DesignYourGarageDoor() throws InterruptedException {
		scorllToElement(DesignGarageDoor);
		Thread.sleep(1000);
		driver.findElement(DesignMyDoor).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	}
	
	@Test(priority=6)
	public void FindDealerSection() throws InterruptedException {
		scorllToElement(FindAdealer);
		Thread.sleep(1000);
		driver.findElement(FindAdealerBtn).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	}
	
	@Test(priority=7)
	public void WhyAmarVideoSection() throws InterruptedException {
		scorllToElement(WhyAmarVideo);
		Thread.sleep(1000);
		
		String WhyAmarVideoActualText = driver.findElement(WhyAmarVideoPath).getAttribute("src");
		Assert.assertEquals(WhyAmarVideoExpectdText, WhyAmarVideoActualText);
		Thread.sleep(1000);
		
		driver.findElement(WhyAmarVideoBtn).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}


	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}