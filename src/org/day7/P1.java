package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws IOException {
//		QUESTION 1
//		----------
//		URL : http://www.greenstechnologys.com/
//		NOTE: Take screenshot of homepage.
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.findElement(By.xpath("//a[@class='activeLink']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File("E:\\Selenium Docs\\Softwares\\My Workspace\\Projects\\Selenium_Practice\\Day_1\\Screenshots\\P1_SS.png");
		
		FileUtils.copyFile(src, des);
		

	}

}
