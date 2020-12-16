package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 7
//		----------
//		URL : http://www.google.com/
//		NOTE: Search greens velmurugan and click the 1st link.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Greens Velmurugan");;
		driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
		//driver.quit();
	}
}
