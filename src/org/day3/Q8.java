package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) throws InterruptedException {
		
//		QUESTION 8
//		-----------
//		URL :http://greenstech.in/selenium-course-content.html
//		NOTE: Click Model Reume + and click Resume Model 1
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement modelResume = driver.findElement(By.xpath("//div[@id='heading201']"));
		modelResume.click();
		
		WebElement modelResume1 = driver.findElement(By.xpath("(//li[@class=\"pointer\"])[59]"));
		modelResume1.click();
		
	}

}
