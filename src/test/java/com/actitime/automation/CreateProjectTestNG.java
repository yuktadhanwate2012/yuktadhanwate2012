package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateProjectTestNG {
    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("122");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        Thread.sleep(3000);
        driver.get("https://online.actitime.com/google2");
        //maximize the window
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void beforeLogin() throws InterruptedException {
        //navigate to url
        ActitimePage login = new ActitimePage(driver);
        login.login("yuktadhanwate2000@gmail.com", "Artz@SSp");
        Thread.sleep(4000);
        //click on task
        driver.findElement(By.xpath("//div[@id='container_tasks']")).click();

    }

    @BeforeMethod
    public void ClickOnNew() throws InterruptedException {
        Thread.sleep(4000);
        //click on add new
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);

        //Click on Add Project
        driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void projectWithInvalidCredentials() throws InterruptedException {
        //enter Project name as blank
        driver.findElement(By.xpath("//div[text()='Project name cannot be empty']/preceding::input[1]")).sendKeys("");

        //click on customer dropdown
        driver.findElement(By.xpath("//div[text()='-- Please Select Customer to Add Project for  --']")).click();

        //click on customer
        driver.findElement(By.xpath("//div[text()='-- New Customer --']/following-sibling::div[2]")).click();

        //click on create project
        driver.findElement(By.xpath("//div[text()='Create Project']")).click();
        Thread.sleep(5000);
        String errorMsg= driver.findElement(By.xpath("//div[text()='Project name cannot be empty']")).getText();
        System.out.println(errorMsg);

        //verify error mssg
        if(errorMsg.equals("Project name cannot be empty")){
            System.out.println("Test case pass: error msg displayed");
        }else{
            System.out.println("Test case fail: error msg not display");
        }

        driver.navigate().refresh();
    }
    @Test(priority = 2)
    public void projectWithInvalidCredential1(){
        //enter Project name as number
        driver.findElement(By.xpath("//div[text()='Project name cannot be empty']/preceding::input[1]")).sendKeys("1234");

        //click on customer dropdown
        driver.findElement(By.xpath("//div[text()='-- Please Select Customer to Add Project for  --']")).click();

        //click on customer
        driver.findElement(By.xpath("//div[text()='-- New Customer --']/following-sibling::div[2]")).click();

        //click on create Project
        driver.findElement(By.xpath("//div[text()='Create Project']")).click();
    }

}


