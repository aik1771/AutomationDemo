package automaion.test;

import static org.testng.Assert.assertEquals;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SauceLabsDemo {
	
	static String driverPath = (new java.io.File("").getAbsolutePath());
	public static ChromeDriver driver;
	public String getLocation;
	public static String getHours,currentDay;
	@BeforeSuite
	public static void startBrowserAndOpenURL() throws InterruptedException
	{
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath + "/chromedriver");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setVersion("60.0.3112.101");
		capabilities.setCapability("chrome.switches",
			    Arrays.asList("--verbose"));
		
		ChromeOptions options = new ChromeOptions();
        
		options.addArguments("--test-type");
		options.addArguments("--allow-running-insecure-content");
		options.addArguments("no-sandbox");
		options.addArguments("--disable-extensions");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setPlatform(org.openqa.selenium.Platform.YOSEMITE);
		Thread.sleep(5000);
		driver = new ChromeDriver();
		 driver.navigate().to("https://www.saucedemo.com/");
	}

	

	

	
	@Test(priority=1)
	public void CanUserLogin() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		WebElement textbox = driver.findElement(By.id("password"));
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		
		
	}
	
	@Test(priority=2)
	public void CanUSerAddToCard() throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;	
		
		jse.executeScript  ("document.querySelector('#add-to-cart-sauce-labs-backpack').click()");
		Thread.sleep(3000);
		jse.executeScript  ("document.querySelector('#shopping_cart_container > a > span').click()");
		driver.findElement(By.id("checkout")).click();
		
		
		
	}
	
	@Test(priority=3)
	public void CanUSerCompleteCheckoutInformation() throws InterruptedException
	{
		driver.findElement(By.id("first-name")).sendKeys("Test");
		driver.findElement(By.id("last-name")).sendKeys("Tester");
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
	}
	
	
	
	@Test(priority=4)
	public static void ConfirmSuccessfullOrdertIsCreated() throws InterruptedException
	{
		
		WebElement thankYouTextFound= driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]"));
		Assert.assertTrue(thankYouTextFound.isDisplayed());

        
        
        
        
        
        

		
	}
	
	@AfterSuite
	public void stopScript()
	{
		driver.quit();
	}
	
	
	 
}
