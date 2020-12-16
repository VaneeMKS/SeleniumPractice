package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {

	public static void main(String[] args) {
//		QUESTION 10
//		-----------
//		URL : http://adactinhotelapp.com/
//		NOTE: Enter Email or Phone and Password.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("test@test.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Password01");

		

	}

}
