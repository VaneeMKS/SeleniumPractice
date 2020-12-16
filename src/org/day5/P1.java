package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 1
//		----------
//		URL : http://demo.guru99.com/test/drag_drop.html 
//		NOTE: Drag and drop  bank  in Account ,5000 in amount  at debited side 
//		      Drag and drop  sales in Account ,5000 in amount  at credited side
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement debitbanksrc = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement debitbankdest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(debitbanksrc, debitbankdest).perform();

		WebElement debitamtsrc = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement debitamtdest = driver.findElement(By.xpath("//ol[@id='amt7']"));
		a.dragAndDrop(debitamtsrc, debitamtdest).perform();
		
		WebElement creditbanksrc = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement creditbankdest = driver.findElement(By.xpath("//ol[@id='loan']"));
		a.dragAndDrop(creditbanksrc, creditbankdest).perform();
		
		WebElement creditamtsrc = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement creditamtdest = driver.findElement(By.xpath("//ol[@id='amt8']"));
		a.dragAndDrop(creditamtsrc, creditamtdest).perform();
		
		
		
		
	}

}
