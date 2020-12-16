package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) {
//		QUESTION 2
//		----------
//		URL : https://www.redbus.in/ 
//		NOTE: Enter from and to textbox.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement fromAddress = driver.findElement(By.id("src"));
		fromAddress.sendKeys("Madurai (All Locations)");
		
		WebElement toAddress = driver.findElement(By.id("dest"));
		toAddress.sendKeys("Bangalore (All Locations)");
		

	}

}
