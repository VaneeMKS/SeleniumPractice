package org.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 2
//		----------
//		URL : http://greenstech.in/selenium-course-content.html
//		NOTE: Print paragaraph starts with vel murugan.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//a[@id='home-tab']")).click();
		Thread.sleep(2000);
		//List<WebElement> list = driver.findElements(By.xpath("//p[contains(text(),'Velmurugan')]"));
		WebElement text = driver.findElement(By.xpath("(//b[contains(text(),'Velmurugan')])[1]"));
		WebElement text1 = driver.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[1]"));
		WebElement text2 = driver.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[2]"));
		WebElement text3 = driver.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[3]"));
		
		Thread.sleep(2000);
		
		System.out.println(text.getText()+"\n"+text1.getText()+"\n"+text2.getText()+"\n"+text3.getText()+"\n");

		
		driver.quit();
	}
}
