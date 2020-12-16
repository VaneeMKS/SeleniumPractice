package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 7
//		URL : https://netbanking.hdfcbank.com/netbanking/
//		NOTE: Enter the userId,click continue.Enter password.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("1234567");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("Password01");		
	}

}
