package com_Base_File;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Utility_File_MMT {
	
	public static WebDriver driver;
	
	public static void Browserlaunch() {
		driver = new ChromeDriver();
	}

	public static void url(WebDriver driver, String url) {
		driver.get(url);		
	}
	
	public static void Click(WebElement element) {
		element.click();
	}
    public static void Clear(WebElement element) {
		element.clear();
	}
	public static void Enter_Data(WebElement element, String value) {
	 element.sendKeys(value);
	}
	public static void Maximize(WebDriver driver) {
		driver.manage().window().maximize(); 
	}

	public static void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public static void jsClick(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public static void frame(WebDriver driver) {
		WebElement iframe = driver.findElement(By.id("iframe1"));
        driver.switchTo().frame(iframe);
	}
	
	public static void jsScroll(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void TakeScreenshot(String path) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}
	
	public static void quit(WebDriver driver) {
		driver.quit();
	}
	
}
