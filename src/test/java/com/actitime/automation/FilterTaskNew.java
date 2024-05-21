package com.actitime.automation;

import org.example.FilterTaskNew1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class FilterTaskNew extends BaseClass {
    WebDriver driver;
    ActitimePage loginPage;
    CommonFunctions commonFunctions;
    FilterTaskNew1 task;
    @BeforeClass
    public void setup() {
        driver=launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        loginPage=new ActitimePage(driver);
        commonFunctions=new CommonFunctions(driver);
        task=new FilterTaskNew1(driver);
    }
    @Test(dataProvider = "getTestData")
    public void login(Object username,Object password) throws InterruptedException {
        loginPage.login(username.toString(),password.toString());
        //click on task module
        commonFunctions.click(task.taskModule);
        //click on add filters
       commonFunctions.click(task.filters);
        //click on status
       commonFunctions.click(task.status);
        //click on Apply button
       commonFunctions.click(task.apply);
        //click on status dropdown
       commonFunctions.click(task.dropDown);
        //click on select radio button
       commonFunctions.click(task.radioButton);
        //click on new status
       commonFunctions.click(task.newStatus);
        //click on APPLY button
       commonFunctions.click(task.apply);
        //to verify all task with new status
        List<WebElement> elementList = driver.findElements(task.list);
        for (WebElement element : elementList) {
            if (element.isDisplayed()) {
                System.out.println(element.getText());
            } else {
                Actions actions = new Actions(driver);
                actions.scrollToElement(element).build().perform();
                System.out.println(element.getText());


            }

        }}
    @DataProvider
    public Object[][] getTestData() {
        Object[][] obj = new Object[][]{
                {"yuktadhanwate2000@gmail.com","Artz@SSp"}
        };
        return obj;
    }

}
