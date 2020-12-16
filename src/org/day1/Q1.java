package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in");
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		

	}

}
