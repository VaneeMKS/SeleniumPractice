package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 2
//		-----------
//		URL:  http://www.amazon.in
//		NOTE: Try Prime first mouseover
//		      Click Free fast delievery on prime items
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		
		WebElement tryprime = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a=new Actions(driver);
		a.moveToElement(tryprime).perform();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
		
		
		
	}

}
