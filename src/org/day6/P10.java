package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P10 {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		QUESTION 10
//		URL : https://www.snapdeal.com/offers/quirky
//		NOTE: Select any item and then right click and press open in a new window
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/offers/quirky");
		
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("Saree");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(2000);
		WebElement product=driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		Actions a=new Actions(driver);
		a.contextClick(product).perform();
	
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
