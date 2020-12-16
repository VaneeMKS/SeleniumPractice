package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) {
//		QUESTION 8
//		-----------
//		URL : https://www.instagram.com/accounts/login/?hl=en) login page 
//		NOTE: Enter username and password. 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("abc@gmail.com");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("123456");
		
		

	}

}
