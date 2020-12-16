package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 6
//		URL : https://retail.onlinesbi.com/retail/login.htm
//		NOTE: Click Continue To Login and click Login without enter the user id.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		driver.findElement(By.xpath("//input[@title='Login']")).click();
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		
		a.accept();
		
	}

}
