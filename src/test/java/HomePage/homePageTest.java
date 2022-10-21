package HomePage;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.driverSetup;

public class homePageTest extends driverSetup {
	
	By AcceptAll = By.xpath("//button[text()='Accept All']");
	By Support = By.xpath("//header/section[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]");
	

	@BeforeSuite
	public void Browser() throws InterruptedException {
		Driversetup();
		
	}

	@Test(priority=1)
	public void notification() throws InterruptedException {
	driver.findElement(AcceptAll).click();
	Thread.sleep(2000);
	
	}

	
	 @Test(priority=2)
	 public void Support() throws InterruptedException {
	 driver.findElement(Support).click();
	 Thread.sleep(10000);
	 
	 
	 }
	 

	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
