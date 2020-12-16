package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P5 {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		QUESTION 5
//		URL : http://greenstech.in/selenium-course-content.html
//		NOTE: Click Model Resume and  rightClick resume model 4 the page and click save as.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.findElement(By.xpath("//div[@id='heading201']")).click();
		
		WebElement modelresume4 = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		
		Actions a=new Actions(driver);
		a.contextClick(modelresume4).perform();
		Thread.sleep(1000);
		Robot r=new Robot();
//DOWN AND ENTER
		for(int i=0;i<4;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
