package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
//		QUESTION 5
//		----------
//		URL : https://netbanking.hdfcbank.com/ 
//
//		NOTE: Enter customer id .
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.name("fldLoginUserId"));
		uname.sendKeys("12345678");
		
		

	}

}
