package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		
//		QUESTION 6
//		----------
//		URL : https://www.redbus.in/
//		NOTE: Click ^[opposite of this] and  signin/signup 
//		      Enter Mobilenumber and click Generate OTP
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
			
		WebElement to_signup = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		to_signup.click();
		
		WebElement signin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		signin.click();
		Thread.sleep(2000);
		WebElement mob_No = driver.findElement(By.xpath("//input[@type='number']"));
		mob_No.sendKeys("9874585455");
		WebElement captcha = driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
		captcha.click();
		Thread.sleep(3000);
		WebElement gen_OTP = driver.findElement(By.xpath("//div[@id='otp-container']"));
		gen_OTP.click();
		
		
		
		
		
	}

}
