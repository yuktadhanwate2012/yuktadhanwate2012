package com.actitime.automation;

import org.example.DeleteCustomer1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteCustomer extends BaseClass{
    WebDriver driver;
    CommonFunctions commonFunctions;
    ActitimePage loginPage;
    DeleteCustomer1 delete;
    @BeforeClass
    public void setup() {
       driver=launchBrowser("chrome");
       driver.get("https://online.actitime.com/google2");
       commonFunctions=new CommonFunctions(driver);
       loginPage=new ActitimePage(driver);
       delete=new DeleteCustomer1(driver);
    }
    @BeforeMethod
    public void login(){
        loginPage.login("yuktadhanwate2000@gmail.com","Artz@SSp");
    }
    @Test(dataProvider = "getTestData")
    public void login(Object username,Object password) throws InterruptedException {
        //click on task
        commonFunctions.click(delete.task);
        commonFunctions.click(delete.addNew);
        commonFunctions.click(delete.newCustomer);
        Thread.sleep(10000);
        WebElement element= driver.findElement(delete.custName);
        element.sendKeys("SaiEdge1");
        commonFunctions.waitElementToBeClickable(delete.createCustomer);
        //click on customer
        commonFunctions.click(delete.customer);
        commonFunctions.click(delete.custName);
        //click on settingicon beside the customer name
        commonFunctions.click(delete.customerName);
        //click on 3 dots
        commonFunctions.click(delete.dots);
        //click on delete
        commonFunctions.click(delete.delete);
        //click on permanent
        commonFunctions.click(delete.permanent);
    }
    @DataProvider
    public Object[][] getTestData() {
        Object [][] obj=new Object[][]{
                {"yuktadhanwate2000@gmail.com","DEG%tMz3"}
        };
        return obj;
    }
}


