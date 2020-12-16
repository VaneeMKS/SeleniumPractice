package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P11 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 11
//		URL : https://www.homedepot.com/
//		NOTE: Alldepartment  is first mouseover
//		      Heating and cooling  is second  mouseover
//		      Air conditioners is third mouseover 
//		      Click portable air conditioners.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		Thread.sleep(2000);
		WebElement allDepartment = driver.findElement(By.xpath("(//li[@class='ShoppingLinks__item'])[1]"));
		//Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(allDepartment).perform();
		Thread.sleep(1000);
		WebElement heating=driver.findElement(By.xpath("//a[@title='Heating & Cooling']"));
		heating.click();
		//a.moveToElement(heating).perform();
		Thread.sleep(1000);
		WebElement ac=driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		ac.click();
		//a.moveToElement(ac).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])[1]")).click();
		
		
	}

}
