package com.actitime.automation;

import org.example.AddCost1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class AddCost extends BaseClass {
    WebDriver driver;
    ActitimePage loginPage;
    CommonFunctions commonFunctions;
    AddCost1 cost;
    @BeforeClass
    public void setUp()  {
        driver=launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        cost=new AddCost1(driver);
        loginPage=new ActitimePage(driver);
        commonFunctions=new CommonFunctions(driver);
    }
    @BeforeMethod
    public void loginIn(){
        loginPage.login("yuktadhanwate2000@gmail.com","Artz@SSp");
    }
    @Test
    public void addCost() throws InterruptedException, AWTException {
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
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        //click on user
         commonFunctions.click(cost.clickOnUser);
        //div[@id='container_users']
        //click on all filters
        commonFunctions.click(cost.filters);
        //click on radio button
        commonFunctions.click(cost.radioButton);
        //click on user
        commonFunctions.click(cost.user);
        //click on apply button
        commonFunctions.click(cost.applyButton);
        //verify correct user
        WebElement element=driver.findElement(cost.correctUser);
        String str=element.getText();
        System.out.println(str);
        //click on selected user
        commonFunctions.click(cost.selectedUser);
        //click on add rates
        commonFunctions.waitElementToBeClickable(cost.addRate);
        //enter rates
        WebElement ele1=driver.findElement(cost.enterRate);
        ele1.sendKeys("7000");
        //click on cross
        commonFunctions.click(cost.cross);
        //click on dollar sign
        commonFunctions.click(cost.dollarSign);
       //click on account settings
       commonFunctions.click(cost.accountSet);


    }
}



