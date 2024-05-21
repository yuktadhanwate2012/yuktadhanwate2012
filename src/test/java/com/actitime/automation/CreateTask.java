package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateTask {
    public static void main(String[] args) throws InterruptedException{
        ChromeOptions options=new ChromeOptions();
        options.setBrowserVersion("122");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        //maximize the window
        driver.manage().window().maximize();

        //To navigate to URL
        driver.get("https://online.actitime.com/cybersuccess7/login.do");

        Actions actions=new Actions(driver);

        //for Username by using actions class
        actions.sendKeys(driver.findElement(By.name("username")),"cybersuccess@yopmail.com").build().perform();

        //for password by using actions class
        actions.click(driver.findElement(By.name("pwd"))).sendKeys("Test@1234").build().perform();

        //To click on login button
        actions.moveToElement(driver.findElement(By.xpath("//div[text()='Login ']"))).click().build().perform();

        //click on Task
        driver.findElement(By.xpath("//table[@id='topnav']/descendant::a[6]")).click();

        //1.click on Add New
        driver.findElement(By.xpath("//div[text()='Add New']")).click();

        //click on create task
        driver.findElement(By.xpath("//div[text()='+ New Tasks']")).click();


    }
}


