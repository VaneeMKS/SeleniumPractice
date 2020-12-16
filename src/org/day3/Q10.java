package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {

	public static void main(String[] args) throws InterruptedException {
		
//		QUESTION 10
//		-----------
//		URL : https://www.amazon.in/
//
//		NOTE: Click any  product and click search
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(1000);
		WebElement searchtext = driver.findElement(By.id("twotabsearchtextbox"));
		searchtext.sendKeys("Handbags");
		
		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbtn.click();
		
		
		
	}

}
