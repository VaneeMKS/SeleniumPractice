package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P9 {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		QUESTION 9
//		URL : https://www.amazon.in/
//		NOTE: Click login and type a  email in email textbox and select email and right click and click cut 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String emailID="vanee@test.com";
		
		WebElement login_over=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions a=new Actions(driver);
		a.moveToElement(login_over).perform();
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys(emailID);
		
		Robot r=new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		a.contextClick(email).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
