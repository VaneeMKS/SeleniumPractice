package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 8
//		----------
//		URL : http://www.google.com/
//		NOTE: Click :: and Click Drive
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='gb_D gb_wc']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@pid='49']")).click();
		driver.findElement(By.xpath("(//div[@class='CgwTDb'])[10]")).click();
		driver.quit();
	}
}
