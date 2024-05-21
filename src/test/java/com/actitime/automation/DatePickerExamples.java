package com.actitime.automation;

import org.example.ActitimeCreateTask1;
import org.example.DatePickerExample1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;

public class DatePickerExamples extends BaseClass{
    WebDriver driver;
    ActitimeCreateTask1 taskPage;
    CommonFunctions commonFunctions;
    ActitimePage login;
    @BeforeClass
    public void setUp() {//set the current day of month
        int dayOfMonth = LocalDateTime.now().getDayOfMonth();
        System.out.println("Date of month is " + dayOfMonth);
        String currentMonth = LocalDateTime.now().getMonth().name(); //MARCH
        String actualCurrentMonth = currentMonth.charAt(0) + currentMonth.substring(1, currentMonth.length()).toLowerCase(); //March
        System.out.println(actualCurrentMonth);
        //set browser version
        driver = launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        commonFunctions = new CommonFunctions(driver);
        //access login method
        login = new ActitimePage(driver);
    }
    @BeforeMethod
     public void login() {
        login.login("yuktadhanwate2000@gmail.com", "Artz@SSp");
    }
    @Test
     public  void task() throws AWTException {
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
        ele.sendKeys("OrangehrmProject");
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
        //
    }
}




