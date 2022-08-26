package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import start.driver.DriverWrapper;

public class PageFunctions {
	
	public static void clickOn(By locator) throws InterruptedException {
		Thread.sleep(2000);
		
        DriverWrapper.getDriver().findElement(locator).click();
        Thread.sleep(3000);
         
    }
	
	public static void hoverOver(By locator) throws InterruptedException
	{
		
		Thread.sleep(1000);
		WebElement loginAvitar = DriverWrapper.getDriver().findElement(locator);
		Actions builder = new Actions(DriverWrapper.getDriver());
		builder.moveToElement(loginAvitar).build().perform();
	}
	public static void assertText(By locator, String text) throws InterruptedException {
        String textElement = DriverWrapper.getDriver().findElement(locator).getText();
        Thread.sleep(2000);
        Assert.assertEquals(textElement,text);
        
        
    }
	
	public static void setValue(By locator, String text) throws InterruptedException {
        DriverWrapper.getDriver().findElement(locator).sendKeys(text);
        Thread.sleep(2000);
        
        
    }

}
