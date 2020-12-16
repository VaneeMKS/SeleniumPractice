package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> allTable=driver.findElements(By.tagName("table"));
		System.out.println("No of Tables: "+allTable.size());
		System.out.println("\n");
		Thread.sleep(2000);
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		
			WebElement eachRow=allRows.get(3);
			String text=eachRow.getText();
			System.out.println(text);
			
	driver.quit();
			
	}
}
	
	

