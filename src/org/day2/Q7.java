package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {

	public static void main(String[] args) {
//		QUESTION 7
//		----------
//		URL :https://www.snapdeal.com/login
//		NOTE: Enter mobile number/email.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("abc@gmail.com");
		
		

	}

}
