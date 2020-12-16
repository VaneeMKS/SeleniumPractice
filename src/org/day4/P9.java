package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION  9
//		------------
//		URL : http://adactinhotelapp.com/
//		NOTE: Print the UserName and Password that you are entered.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

		//Thread.sleep(2000);
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("test");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("Password");
		
		System.out.println(uname.getAttribute("value"));
		System.out.println(pwd.getAttribute("value"));
		driver.quit();
	}
}
