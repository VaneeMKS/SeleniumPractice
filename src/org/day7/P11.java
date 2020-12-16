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
import org.openqa.selenium.interactions.Actions;

public class P11 {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
//		QUESTION 11
//		URL : https://www.flipkart.com/
//		NOTE: Mouse Over Kids & Baby  and Take the screenshot
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement baby_Wear= driver.findElement(By.xpath("(//span[@class='_2FZd5H'])[5]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(baby_Wear).perform();
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\Selenium Docs\\Softwares\\My Workspace\\Projects\\Selenium_Practice\\Day_1\\Screenshots\\P11_SS.png");
		
		FileUtils.copyFile(src, des);
	}

}
