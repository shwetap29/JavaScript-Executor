package com.company;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1) Textbox disabled

public class DisabledTextBox1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shweta/Desktop/Bridgelabz/DisabledTextBox.html");
		
		//Typecast the driver object toJavascript interface type
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//Enter admin in first textbox using javascript
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		
		//Clear the value in second textbox using javascript
		js.executeScript("document.getElementById('t2').value=''");
		
		//Enter "manager" in second textbox using javascript
		js.executeScript("document.getElementById('t2').value='manager'");
		
		//Change the second text box to button type using javascript
		js.executeScript("document.getElementById('t2').value='button'");
		Thread.sleep(3000);
		driver.close();
	}
}
	