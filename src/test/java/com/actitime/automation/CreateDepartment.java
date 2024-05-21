package com.actitime.automation;

import org.checkerframework.checker.units.qual.C;
import org.example.CreateDepartment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateDepartment extends BaseClass{
    WebDriver driver;
    CommonFunctions commonFunctions;
    ActitimePage loginPage;
    CreateDepartment1 dept;
    @BeforeClass
    public void setup() throws InterruptedException {
        driver = launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        loginPage = new ActitimePage(driver);
        dept = new CreateDepartment1(driver);
        commonFunctions = new CommonFunctions(driver);
    }
    @BeforeMethod
     public  void setLoginPage(){
        loginPage.login("yuktadhanwate2000@gmail.com","Artz@SSp");
    }
    @Test(priority = 1)
    public void department(){
        commonFunctions=new CommonFunctions(driver);
        //click on user
        commonFunctions.click(dept.user);
        //click on department
        commonFunctions.click(dept.dept);
        //add dept name
        WebElement element=driver.findElement(dept.deptName);
        element.sendKeys("Testing1");
        //click on add dept
       commonFunctions.click(dept.clickDept);
        //getText
        WebElement develop=driver.findElement(dept.text);
        String dev=develop.getText();
        System.out.println(dev);
    }

}

