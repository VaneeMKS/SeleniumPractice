package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {

	public static void main(String[] args) throws InterruptedException {
		
//		QUESTION 7
//		----------
//		URL : https://www.cleartrip.com/trains
//		NOTE: Enter From ,TO  and click search trains
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement from = driver.findElement(By.id("from_station"));
		from.sendKeys("Madurai Junction (MDU)");
		
		WebElement to = driver.findElement(By.id("to_station"));
		to.sendKeys("Bangalore Cy Junction (SBC)");
		
		WebElement search = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		search.click();
		
	}

}
