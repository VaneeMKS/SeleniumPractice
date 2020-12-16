package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P4 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 4
//		----------
//		URL : https://www.shopclues.com/wholesale.html
//		NOTE: Mobile and electronics is first mouseover 
//		      Click Smart Phones range Rs5001 - Rs10000
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//li[@id='nav_44']"));
		//Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(mobile).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@target='_blank'])[18]")).click();
		
		
	}

}
