package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		QUESTION 3
//		URL : http://greenstech.in/selenium-course-content.html
//		NOTE: Click interview question and Right click cts interview question and Select open link in new window
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.findElement(By.xpath("//h2[@class='title mb-0 center']")).click();
		
		Thread.sleep(1000);
		WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		Actions a=new Actions(driver);
		a.contextClick(cts).perform();
		Thread.sleep(1000);
		Robot r=new Robot();
//DOWN AND ENTER
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
			
	}

}
