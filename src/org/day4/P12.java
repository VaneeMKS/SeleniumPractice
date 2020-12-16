package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 12
//		-----------
//		URL : https://www.flipkart.com/ 
//		NOTE: Search any product and click 1st product
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.className("LM6RPg"));
		search.sendKeys("kurtis");
		
		WebElement sbutton=driver.findElement(By.className("vh79eN"));
		sbutton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='_2mylT6'])[1]")).click();
	

	}
}
