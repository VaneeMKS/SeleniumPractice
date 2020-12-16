package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		
//		QUESTION 4
//		-----------
//		URL : http://toolsqa.com/automation-practice-form/
//		NOTE: Give details and register the form.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Vijayavanee");
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("MKS");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("test@test.com");
		Thread.sleep(1000);
		WebElement gender=driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
		gender.click();
		WebElement mobile = driver.findElement(By.id("userNumber"));
		mobile.sendKeys("9588447414");
		
//		WebElement subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']"));
//		subject.sendKeys("Maths");
		
		WebElement hobby1 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
		hobby1.click();
		WebElement hobby2 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
		hobby2.click();
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("Madurai");
		
		
		
	}

}
