package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {

	public static void main(String[] args) {
//		QUESTION 9
//		-----------
//		URL : http://demo.automationtesting.in/Register.html
//		NOTE: Just enter the values for the textbox only.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		firstName.sendKeys("Vanee");
		
		WebElement lastName = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
		lastName.sendKeys("MKS");
		
		WebElement email = driver.findElement(By.className("form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched"));
		email.sendKeys("test@test.com");
		
		WebElement phNo = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched"));
		phNo.sendKeys("912345678");
		
		WebElement pwd = driver.findElement(By.id("firstpassword"));
		pwd.sendKeys("Password01");
		
		WebElement confirmPwd = driver.findElement(By.id("secondpassword"));
		confirmPwd.sendKeys("Password01");
		
		

	}

}
