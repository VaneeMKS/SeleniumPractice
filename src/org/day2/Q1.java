package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
//		QUESTION 1
//		----------
//		URL : https://www.facebook.com/ 
//		NOTE: Enter Email or Phone and Password.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");
		//driver.quit();

	}

}
