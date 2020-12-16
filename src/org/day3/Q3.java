package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		
//		QUESTION 3
//		-----------
//		URL : http://demo.automationtesting.in/Register.html
//		NOTE: Give details and register the form.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[1]"));
		fname.sendKeys("Vijayavanee");
		
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lname.sendKeys("MKS");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		address.sendKeys("Madurai");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("test@test.com");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@type='tel']"));
		mobile.sendKeys("9588447414");
		
		WebElement gender=driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]"));
		gender.click();
		
		WebElement hobby1=driver.findElement(By.id("checkbox1"));
		hobby1.click();
		
		WebElement hobby2=driver.findElement(By.id("checkbox2"));
		hobby2.click();
		
//		WebElement lang=driver.findElement(By.xpath("//div[@id='msdd']"));
//		lang.sendKeys("English");
		
		WebElement pwd=driver.findElement(By.id("firstpassword"));
		pwd.sendKeys("password");
		
		WebElement cpwd=driver.findElement(By.id("secondpassword"));
		cpwd.sendKeys("password");
	}

}
