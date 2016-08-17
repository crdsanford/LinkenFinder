package com.handsomechuck.qa.LinkenFinder;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkenFinder {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","/usr/local/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement ele:links)
			System.out.println(ele.getAttribute("href"));
		driver.close();
		driver.quit();
		
	}

}
