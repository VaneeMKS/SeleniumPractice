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

public class P5 {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
//		QUESTION 5
//		URL : http://greenstech.in/selenium-course-content.html
//		NOTE: ScrollDown till "job opening" and Take the screenshot and  scroll up Online Classroom
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(3000);
		WebElement s_down= driver.findElement(By.xpath("(//h2[@class='mb-0'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",s_down);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\Selenium Docs\\Softwares\\My Workspace\\Projects\\Selenium_Practice\\Day_1\\Screenshots\\P5_SS.png");
		
		FileUtils.copyFile(src, des);
		Thread.sleep(3000);
		WebElement s_up=driver.findElement(By.xpath("//h3[contains(text(),'Online Classroom')]"));
		js.executeScript("arguments[0].scrollIntoView(false)",s_up);
	}

}
