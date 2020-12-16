package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 5
//		URL : https://netbanking.canarabank.in/entry/ENULogin.jsp
//		NOTE: Click sign in without enter the user id and print text appear and handle popup.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		//driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		String text=a.getText();
		a.accept();
		System.out.println(text);
	}

}
