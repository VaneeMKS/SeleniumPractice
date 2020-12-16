package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 6
//		----------
//		URL : https://www.facebook.com/ 
//		NOTE: Print the email and password which was entered by user 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys("Test@test.com");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("Password");
		
		
		System.out.println(uname.getAttribute("value"));
		System.out.println(pwd.getAttribute("value"));
		driver.quit();
	}
}
