package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) {
//		QUESTION 4
//		----------
//		URL : https://infinity.icicibank.com/corp/Login.jsp
//		NOTE: Enter username and password. 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.id("DUMMY1"));
		uname.sendKeys("testuser");
		
		

	}

}
