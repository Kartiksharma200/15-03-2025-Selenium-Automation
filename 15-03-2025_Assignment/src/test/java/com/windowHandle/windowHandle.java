package com.windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);    // wait for 2 sec
		driver.findElement(By.xpath("//li[@id='Open New Window']")).click();  
		driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']")).click();
		Set<String> childid = driver.getWindowHandles();  
		Iterator<String> itr = childid.iterator();
		
		//next()
        String id1 = itr.next();   
        String id2 = itr.next();   
        
        Thread.sleep(3000); 
        driver.switchTo().window(id2);
       
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(id1);
		Thread.sleep(2000);
		String actualUrl = driver.getCurrentUrl();
		String expectedurl = "https://www.globalsqa.com/demo-site/frames-and-windows/#";
		if(actualUrl.equals(expectedurl)) {
			System.out.println("<---------Window handle successful--------->");
		}else {
			System.out.println("<-----------Failed----------->");
		}
	}
}
