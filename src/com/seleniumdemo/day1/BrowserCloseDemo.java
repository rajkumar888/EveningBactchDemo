package com.seleniumdemo.day1;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCloseDemo {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.out.print("Start of the Program.........."+new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.selenium.dev/";
//		driver.get(url);
		
		driver.navigate().to(url);
		
		// page -> webelement - > action
		driver.findElement(By.xpath("//a//span[text()='Downloads']")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		

		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
