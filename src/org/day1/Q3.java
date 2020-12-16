package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Q3 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
//		driver.get("http://www.greenstechnologys.com/");
//		driver.get("https://www.facebook.com/");
//		driver.get("https://www.amazon.in");
		driver.get("http://greenstech.in/selenium-course-content.html");
	}

}
