package com.iframeHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World!");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		driver.switchTo().frame("[src=\"MultipleFrames.html\"]");
		
		driver.switchTo().frame("[style='float: left;height: 250px;width: 400px']");
		
		driver.findElement(By.xpath("This element is in iframe - html")).sendKeys("Hello World!!!");
		
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
