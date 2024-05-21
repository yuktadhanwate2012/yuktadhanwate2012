package com.actitime.automation;

import org.example.CreateProject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateProject extends BaseClass{
    WebDriver driver;
    ActitimePage login;
    CommonFunctions commonFunctions;
    CreateProject1 project;
    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = launchBrowser("chrome");
        login = new ActitimePage(driver);
        driver.get("https://online.actitime.com/google2");
        Actions action = new Actions(driver);
        project = new CreateProject1(driver);
        commonFunctions = new CommonFunctions(driver);
    }
    @BeforeMethod
    public void setLogin(){
        login.login("yuktadhanwate2000@gmail.com", "Artz@SSp");
    }
    @Test
    public void login(){
        //click on Task
        commonFunctions.click(project.taskModule);
        //click on Add New
        commonFunctions.click(project.addNew);
        //Click on Add Project
        commonFunctions.click(project.addProject);
        //enter Project name as blank
//        WebElement element=driver.findElement(project.blank);
//        element.sendKeys("");
        //click on customer dropdown
        commonFunctions.click(project.dropDown);
        //click on customer
        commonFunctions.click(project.customer);
        //click on create project
        commonFunctions.click(project.createProject);
        String errorMsg= driver.findElement(project.errorMsg).getText();
        System.out.println(errorMsg);
        //verify error mssg
        if(errorMsg.equals("Project name cannot be empty")){
            System.out.println("Test case pass: error msg displayed");
        }else{
            System.out.println("Test case fail: error msg not display");
        }
        //click on cancel
        commonFunctions.click(project.cancel);
}}
