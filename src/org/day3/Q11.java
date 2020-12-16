package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {

	public static void main(String[] args) throws InterruptedException {
		
//		QUESTION 11
//		-----------
//		URL : https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp
//
//		NOTE: Give details and register the form.
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		//Thread.sleep(1000);
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Vanee");
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("MKS");
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("test@test.com");
		WebElement pwd = driver.findElement(By.name("Passwd"));
		pwd.sendKeys("Password");
		WebElement cpwd = driver.findElement(By.name("ConfirmPasswd"));
		cpwd.sendKeys("Password");
		
//		WebElement signup = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
//		signup.click();
		
		
		
	}

}
