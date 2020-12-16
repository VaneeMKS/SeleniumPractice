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

public class P4 {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
//		QUESTION 4
//		URL : http://www.greenstechnologys.com/
//		NOTE: Scroll Down till "Greens technology Perumbakkam. address "and Take  screenshot 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(2000);
		WebElement sdown= driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",sdown);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\Selenium Docs\\Softwares\\My Workspace\\Projects\\Selenium_Practice\\Day_1\\Screenshots\\P4_SS.png");
		
		FileUtils.copyFile(src, des);
	}

}
