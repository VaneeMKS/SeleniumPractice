package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 4
//		URL : https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997
//		NOTE: Click continue without enter the user id and handle popup.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).clear();
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
	}

}
