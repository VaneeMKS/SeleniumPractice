package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P3 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 3
//		----------
//		URL : http://www.flipkart.com
//		NOTE: Home & Furniture is first mouseover 
//		      Click Bath Towels and print any product name 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		WebElement HomeFurn = driver.findElement(By.xpath("(//span[@class='_2FZd5H'])[6]"));
		Actions a=new Actions(driver);
		a.moveToElement(HomeFurn).perform();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='_1jkBF2'])[30]")).click();
		Thread.sleep(4000);
		String product=driver.findElement(By.xpath("(//a[@class='_2cLu-l'])[1]")).getText();
		System.out.println("Selected product is :"+product);
		driver.findElement(By.xpath("(//a[@class='_2cLu-l'])[1]")).click();
		
		
		
	}

}
