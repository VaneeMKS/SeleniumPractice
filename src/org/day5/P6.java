package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P6 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 6 
//		----------
//		URL : http://greenstech.in/selenium-course-content.html
//		NOTE: Course is first mouseover
//		      Software testing training is second mouseover  
//		      Click selenium training 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);
		WebElement courses = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		//Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(courses).perform();
		Thread.sleep(1000);
		WebElement softTesting=driver.findElement(By.xpath("//div[@title='Software Testing']"));
		a.moveToElement(softTesting).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Selenium Certification Training']")).click();
		
		
	}

}
