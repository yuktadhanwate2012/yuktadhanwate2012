package com.actitime.automation;

import org.example.PrintAllTask1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PrintAllTask extends BaseClass{
    WebDriver driver;
    CommonFunctions commonFunctions;
    ActitimePage loginPage;
    PrintAllTask1 task1;
    Actions actions;
    @BeforeClass
      public void setUp() throws InterruptedException {
        driver = launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        loginPage = new ActitimePage(driver);
        commonFunctions = new CommonFunctions(driver);
        task1 = new PrintAllTask1(driver);
    }
    @BeforeMethod
     public  void setLoginPage() {
        loginPage.login("yuktadhanwate2000@gmail.com", "Artz@SSp");
    }
    @Test
    public void printTask()
    {//click on task
        commonFunctions.click(task1.task);
        //click on spaceship building
        commonFunctions.click(task1.project);
        List<WebElement> elements = driver.findElements(task1.list);
        for (WebElement element : elements) {
            if (element.isDisplayed()) {
                System.out.println(element.getText());
            } else {
                actions = new Actions(driver);
                actions.scrollToElement(element).build().perform();
                System.out.println(element.getText());
                //click on check box of task
                commonFunctions.click(task1.checkBox);
                //click on move to
                commonFunctions.click(task1.moveTo);
                //click on customer dropdown
                commonFunctions.click(task1.custDropdown);
                //select customer
                commonFunctions.click(task1.selectCust);
                //click on project dropdown
                commonFunctions.click(task1.projectDrop);
                //click on project
                commonFunctions.click(task1.selectProject);
                //click on Move Button
                commonFunctions.click(task1.moveYo);
                //to check checkbox select or not
                WebElement checkbox = driver.findElement(task1.chechBox2);
                if (checkbox.isDisplayed()) {
                    checkbox.click();
                    if (checkbox.isSelected()) {
                        System.out.println("All Tasks are moved");
                    } else {
                        System.out.println("All Tasks are not  moved");
                    }
                } else {
                    System.out.println("checkbox is not displayed on webpage");
                }
            }}}}



