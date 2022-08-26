package com.herokuapp;

import org.openqa.selenium.By;

import data.function.CheckAssertion;

public class PageElements extends PageFunctions{
	
	private static By emailField = By.xpath("//input[@id='email']");
	private static By passwordField = By.xpath("//input[@id='password']");
	private static By loginButton = By.xpath("//button[@type='submit']");
	private static By logOutButton = By.xpath("//a[contains(@href,'logout')]");
	private static By moveOverElement = By.xpath("//img[@class='img-circle']");
	

	
	public static void findAvitar() throws InterruptedException
	{
		hoverOver(moveOverElement);
	}
	public static void clickOnAvitar() throws InterruptedException
	 {
		 Thread.sleep(1000); 
			clickOn(moveOverElement);
	 }
	
	public static void clickOnEmail() throws InterruptedException
	 {
		 Thread.sleep(1000); 
			clickOn(loginButton);
	 }
	
	 public static void checkLogout() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 assertText(logOutButton,"Logout");
	 }
	
	public static void clickOnPassword()throws InterruptedException
	 {
		 Thread.sleep(1000); 
			clickOn(passwordField);
	 }
	
	public static void clickOnLogin()throws InterruptedException
	 {
		 Thread.sleep(1000); 
			clickOn(passwordField);
	 }
	
	public static void setEmail(String text) throws InterruptedException
	{
		
		setValue(emailField,text);
		 Thread.sleep(5000);
		  
	}
	
	public static void setPassword(String text) throws InterruptedException
	{
		
		setValue(passwordField,text);
		 Thread.sleep(5000);
		  
	}
	
}
