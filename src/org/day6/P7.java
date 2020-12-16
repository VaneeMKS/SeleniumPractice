package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P7 {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		QUESTION 7
//		URL : http://greenstech.in/selenium-course-content.html
//		NOTE: Click Selenium Test Papaers Right Click Day 6 Robot and select Inspect
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.findElement(By.xpath("//div[@id='heading303']")).click();
		WebElement day6 = driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
		Actions a=new Actions(driver);
		a.contextClick(day6).perform();
		Thread.sleep(1000);
		Robot r=new Robot();
//DOWN AND ENTER
		for(int i=0;i<6;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
