package com.fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		choosefile.sendKeys("C:\\Users\\10000\\Downloads\\Bug Report Write Wave - Sheet1.pdf");
		
		Thread.sleep(3000);
		
		WebElement upload_btn = driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload_btn.click();
		
		WebElement verify = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
		
		if(verify.isDisplayed()) {
			System.out.println("<--------file upload successful------->");
			Thread.sleep(2000);
		}else {
			System.out.println("<----------file upload fail--------->");
		}
		
		driver.close();
		
		
		
	}

}
