package org.day9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
//		QUESTION 1
//		URL : http://demoqa.com/automation-practice-form/
//		NOTE: print all the even option in State and City
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/automation-practice-form/");
		Thread.sleep(3000);
		
		WebElement state =driver.findElement(By.xpath("(//div[@class='col-md-4 col-sm-12'])[1]"));
		Select s=new Select(state);
		
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		List<WebElement> l= s.getOptions();
		
		for(int i=0;i<l.size();i++)
		{
			WebElement element=l.get(i);
			String name=element.getText();
			System.out.println(name);
		}
		
	}

}
