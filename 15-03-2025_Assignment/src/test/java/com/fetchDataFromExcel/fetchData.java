package com.fetchDataFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchData {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream("C:\\Users\\10000\\Downloads\\15-03-2025.xlsx");
		System.out.println("<-------Fetch file------->");
        Workbook bok = WorkbookFactory.create(file);
        String username = bok.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        String password = bok.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        
        if(actualUrl.equals(expectedUrl)) {
        	System.out.println("<---------Login Successfull--------->");
        }else {
        	System.out.println("<----------Login failed---------->");
        }
		
		
	}

}
