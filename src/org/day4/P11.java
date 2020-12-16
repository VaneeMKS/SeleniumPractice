package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 11
//		-----------
//		URL : https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp 
//		NOTE: Register form 
//		      Print all which was entered by user
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		//Thread.sleep(1000);
		WebElement fname,lname,email,pwd,cpwd;
		fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Vanee");
		
		lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("MKS");
		
		email=driver.findElement(By.id("username"));
		email.sendKeys("vanee@gmail.com");
		
		pwd=driver.findElement(By.name("Passwd"));
		pwd.sendKeys("Password");
		
		cpwd=driver.findElement(By.name("ConfirmPasswd"));
		cpwd.sendKeys("Password");
		
		System.out.println(fname.getAttribute("value"));
		System.out.println(lname.getAttribute("value"));
		System.out.println(email.getAttribute("value"));
		System.out.println(pwd.getAttribute("value"));
		System.out.println(cpwd.getAttribute("value"));
		

	}
}
