package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationTestingSite extends BaseClass{
    WebDriver driver;
    AmazonImg apply;
    @BeforeMethod
    public void setUp() {
        driver = launchBrowser("chrome");
        //navigate to url
        driver.get("https://demo.automationtesting.in/Register.html");
    }
    @Test
    public void test(){
        //getTitle Method
        String title=driver.getTitle();
        System.out.println(title);
        //getCurrentUrl Method
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
       /* //Enter text
        apply=new AmazonImg(driver);
        driver.findElement(apply.appeal);*/

    }
}


