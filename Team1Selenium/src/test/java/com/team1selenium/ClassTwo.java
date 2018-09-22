package com.team1selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTwo {

	public ClassTwo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", //We changed the system property. Setting up the driver property
		        "/Users/shiblee/chromedriver/chromedriver");

	WebDriver driver = new ChromeDriver();	
	
	driver.navigate().to("https://ebay.com");
	driver.manage().window().maximize();

	}

}
