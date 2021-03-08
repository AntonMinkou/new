package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MishTest {
    @Test
    public void OpenMish() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        Thread.sleep(2000);
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
        public void negativeLoginTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //---- Open Mishpahug------
        driver.get("https://mishpahug.co.il/");
        Thread.sleep(2000);
        //------- Press on X on first window
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(2000);
        //----------- Press login button----
        driver.findElement(By.id("idsignin")).click();
        Thread.sleep(2000);
        //-----Fill in fields of the form---
        driver.findElement(By.id("logininput")).click();
        driver.findElement(By.id("logininput")).sendKeys("loginTest");
        driver.findElement(By.id("passwordinput")).click();
        driver.findElement(By.id("passwordinput")).sendKeys("passwordTest");
        //------Press SignIn button----
        // driver.findElement(By.id("signinrequest")).click();
        Thread.sleep(7000);
        /*System.out.println("System message: " + driver
                    .findElement(By.id("wrongloginorpassword")).getAttribute("class"));*/
        driver.quit();

    }
}
