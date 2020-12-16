package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		QUESTION 2
//		URL : https://www.google.co.in/webhp 
//		NOTE: Enter Vel Murugan and select Vel Murugan using double Click
//		      Cut Vel Murugan using Keyboard shortcut[Ctrl+x]
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		
		WebElement searchtxt=driver.findElement(By.xpath("//input[@title='Search']"));
		searchtxt.sendKeys("Velmurugan");
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		a.doubleClick(searchtxt).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
//Cut
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
			
			
	}

}
