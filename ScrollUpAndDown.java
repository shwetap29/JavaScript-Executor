package com.company;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Script to scroll up And down on selenium official website
//2) Using executeScript() of JavascriptExecutor interface
public class ScrollUpAndDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.org/download");
		
		//typecasting driver object to javascriptExcutor interface type
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=1; i<10; i++) {
			
			//Scroll down on the webpage
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(3000);
			
		}
		
		for(int i=1; i<10; i++) {
			//Scroll up on the webpage
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(3000);
		}
		

}
}
