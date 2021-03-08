package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) throws InterruptedException {
	System.out.println("Hello world");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title: " + driver.getTitle());
		//--------- Open Mishpahug
		driver.get("https://mishpahug.co.il/");
		Thread.sleep(2000);
		driver.findElement(By.id("closedIntro")).click();
//Thread.sleep(500);
		System.out.println("Name of element with tag 'select' is " + driver
				.findElement(By.tagName("select")).getAttribute("name"));
		for(WebElement element: driver.findElements(By.tagName("select"))){
			System.out.println("name: " + element.getAttribute("name"));
		}
		System.out.println("By className 'itemfilteradvanced' - "+ driver
				.findElements(By.className("itemfilteradvanced")).size());
		System.out.println("By name 'selectconfession' - " + driver
				.findElements(By.name("selectconfession")).size());
		driver.findElement(By.linkText("History of Israel.")).click();
		Thread.sleep(2000);
		driver.quit();
		driver.quit();
	    }
}
