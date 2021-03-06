package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
//		QUESTION 6
//		URL : http://greenstech.in/selenium-course-content.html
//		NOTE: Scrolldown till "Top Selenium Trends In 2020" and takes Screenshot 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(3000);
		WebElement s_down= driver.findElement(By.xpath("//h3[contains(text(),'Top Selenium Trends In 2020')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",s_down);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\Selenium Docs\\Softwares\\My Workspace\\Projects\\Selenium_Practice\\Day_1\\Screenshots\\P6_SS.png");
		
		FileUtils.copyFile(src, des);
	}

}
