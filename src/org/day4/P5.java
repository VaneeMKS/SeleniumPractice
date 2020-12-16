package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 5
//		----------
//		URL : http://www.greenstechnologys.com/
//		NOTE: Print the paragraph starts with Greens Technology
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("//div[@id='article-wrapper']"));
		
		String text1=text.getText();
		if(text1.contains("Greens"))
		{
			System.out.println(text1);
		}

		driver.quit();
	}
}
