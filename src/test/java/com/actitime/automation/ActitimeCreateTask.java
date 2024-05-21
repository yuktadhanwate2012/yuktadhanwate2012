package com.actitime.automation;

import org.example.ActitimeCreateTask1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class ActitimeCreateTask extends BaseClass{
    WebDriver driver;
    ActitimePage loginPage;
    CommonFunctions commonFunctions;
    ActitimeCreateTask1 taskPage;
   @BeforeClass
    public void setUp() throws InterruptedException {
       driver=launchBrowser("chrome");
       loginPage=new ActitimePage(driver);
       driver.get("https://online.actitime.com/google2");
       taskPage = new ActitimeCreateTask1(driver);
       commonFunctions = new CommonFunctions(driver);
   }
   @BeforeMethod
    public void login() throws InterruptedException {
       //loginPage = new ActitimePage(driver);
       loginPage.login("yuktadhanwate2000@gmail.com", "Artz@SSp");
       Thread.sleep(10000);
   }
   @Test
    public  void Task() throws AWTException {
       Robot robot =new Robot();
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_MINUS);
       robot.keyRelease(KeyEvent.VK_MINUS);
       robot.keyPress(KeyEvent.VK_MINUS);
       robot.keyRelease(KeyEvent.VK_MINUS);
       robot.keyPress(KeyEvent.VK_MINUS);
       robot.keyRelease(KeyEvent.VK_MINUS);
       robot.keyPress(KeyEvent.VK_MINUS);
       robot.keyRelease(KeyEvent.VK_MINUS);
       commonFunctions.click(taskPage.taskModule);
       commonFunctions.click(taskPage.project);
       commonFunctions.click(taskPage.addTask);
       WebElement ele=driver.findElement(taskPage.taskName);
       ele.sendKeys("ActitimeProject");
       //click on deadline-date
        commonFunctions.click(taskPage.deadLine);
        commonFunctions.click(taskPage.date);
       //Type of work
       commonFunctions.click(taskPage.work);
       commonFunctions.click(taskPage.type);
       //enter Priority
       commonFunctions.click(taskPage.priorityDrop);
       commonFunctions.click(taskPage.priority);
       //enter Value (custom field)
        commonFunctions.click(taskPage.custom);
        WebElement bud=driver.findElement(taskPage.budget);
        bud.sendKeys("5000");
      //enter Budget, $ (custom field)
       WebElement element=driver.findElement(taskPage.custom1);
       element.sendKeys("1234");
        //to add task
       commonFunctions.click(taskPage.addTask1);
    }
    }



