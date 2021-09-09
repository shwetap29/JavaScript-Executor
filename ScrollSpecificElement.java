package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3)Script to scroll down to a Specific element(Applitool webelement) on selenium official website

public class ScrollSpecificElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.org/download");
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.org/download");
		
		// find the Applitools element on the webpage
		WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
		
		// get the X-coordinate and store in a variable
		int x = ele.getLocation().getX();
		System.out.println("X-coordinate: "+x);
		// get the Y-coordinate and store in a variable
		int y = ele.getLocation().getY();
		System.out.println("Y-coordinate: "+y);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll to Applitools element’s x and y coordinate
		js.executeScript("window.scrollBy("+x+", "+y+")");
		Thread.sleep(3000);
		driver.close();
	}

	
	}

