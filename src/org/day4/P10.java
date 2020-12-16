package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 10
//		-----------
//		URL : https://www.snapdeal.com/ 
//		NOTE: Search any product and click 1st product
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		Thread.sleep(1000);
		driver.findElement(By.id("pushDenied")).click();
		WebElement searchtext=driver.findElement(By.id("inputValEnter"));
		searchtext.sendKeys("iphone");
		Thread.sleep(2000);
		WebElement searchbtn=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		searchbtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();

	}
}
