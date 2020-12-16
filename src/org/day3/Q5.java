package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) throws InterruptedException {
		
//		QUESTION 5
//		-----------
//		URL : http://greenstech.in/selenium-course-content.html
//		NOTE: Click interview question +.
//		      Click cts  interview question
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);
		WebElement int_ques = driver.findElement(By.xpath("//div[@id='heading20']"));
		int_ques.click();
		
		WebElement cts_ques = driver.findElement(By.xpath("(//li[@class='pointer'])[6]"));
		cts_ques.click();
		
		
		
	}

}
