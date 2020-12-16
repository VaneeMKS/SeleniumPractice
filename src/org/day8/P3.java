package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 3
//		URL : http://demo.automationtesting.in/Alerts.html
//		NOTE: Click Alert with textBox button and Click button to demonstrate an prompt box Perform prompt alert.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);

		a.sendKeys("Test Automtion");
		Thread.sleep(2000);
		a.accept();
		

	}

}
