package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
//		QUESTION 1
//		----------
//		URL : http://www.greenstechnologys.com 
//		NOTE: Print Greens Technologys Software Training Centers in Chennai
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com");
		WebElement text = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		//System.out.println(text);
		String text1=text.getText();
		System.out.println(text1);
		driver.quit();
	}

}
