package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya Vanee\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> allTable=driver.findElements(By.tagName("table"));
		System.out.println("No of Tables: "+allTable.size());
		Thread.sleep(2000);
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		
		
		for(int k=0;k<allRows.size();k++)
		{
			WebElement eachRow=allRows.get(k);
			List<WebElement> allHeaders=eachRow.findElements(By.tagName("th"));
			for(int i=0;i<allHeaders.size();i++)
			{
				WebElement headerName=allHeaders.get(i);
				//allHeaders.indexOf(i);
				System.out.println(headerName.getText());
				for(int j=0;j<allRows.size();j++)
				{
//		
					eachRow=allRows.get(i);
					List<WebElement> allData=eachRow.findElements(By.tagName("td"));
					for(int l=0;l<allData.size();l++)
						{
							
							WebElement eachData=allData.get(l);
							String name=eachData.getText();
							System.out.println(name);
							
						}
					}
					
				}
			
		}
		driver.quit();
			
	}
}
	
	

