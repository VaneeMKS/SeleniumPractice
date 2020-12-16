package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P11 {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		QUESTION 11
//		URL : https://www.flipkart.com/
//		NOTE: Select any item and then right click and press Save link as
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("(//button[@class='_2AkmmA _29YdH8'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("Saree");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();

		Thread.sleep(4000);
		WebElement product=driver.findElement(By.xpath("(//img[@class='_3togXc'])[1]"));
		Actions a=new Actions(driver);
		a.contextClick(product).perform();
	
		Robot r=new Robot();
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
			{
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
