package com.actitime.automation;

import org.example.MoveTask1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class MoveTask extends BaseClass{
    WebDriver driver;
    CommonFunctions commonFunctions;
    ActitimePage actitimePage;
    MoveTask1 move;
    @DataProvider
    public Object[][] getTestData(){
        Object[][] obj=new Object[][]{
                {"yuktadhanwate2000@gmail.com", "Artz@SSp"},
        };
        return obj;
    }
    @BeforeClass
    public void setUp(){
        driver=launchBrowser("chrome");
    }
    @Test(dataProvider = "getTestData")
    public void moveTask(Object username,Object password) throws InterruptedException, AWTException {
        ActitimePage actitimePage=new ActitimePage(driver);
        driver.get("https://online.actitime.com/google2");
        actitimePage.login(username.toString(),password.toString());
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
        //click on task
        commonFunctions.click(move.task);
        //click on project
       commonFunctions.click(move.clickProject);
        //click on dropdown
        commonFunctions.click(move.dropDown);
        //click on select radio button
        commonFunctions.click(move.radioButton);
        //click on new status
         commonFunctions.click(move.newStatus);
        //click on APPLY button
        commonFunctions.click(move.apply);
        //Verifying all task with planning status
        List<WebElement> webElementList=driver.findElements(move.list);
        for(WebElement element:webElementList){
            String task=element.getText();
            System.out.println(task);
            //click on checkbox
            commonFunctions.click(move.checkBox);
            //click on move
            commonFunctions.click(move.move);
            //click on select customer
             commonFunctions.click(move.selectCust);
            //click on customer
            commonFunctions.click(move.customer);
            //click on project drop down
             commonFunctions.click(move.projectDrop);
            //click on project
            commonFunctions.click(move.project);
            //click on move button
             commonFunctions.click(move.moveButton);
            //check checkBox select or not
            WebElement checkBox=driver.findElement(move.check);
            if(checkBox.isSelected()){
                System.out.println("Tasks are not move");
            }else{
                System.out.println("Tasks are moved");
                // driver.findElement(By.xpath("//div[@class='components-DataFilters-reset--Eu7kyt6m']/child::button")).click();


            }

        }
    }
}


