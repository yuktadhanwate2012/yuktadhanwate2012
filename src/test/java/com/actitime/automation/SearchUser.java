package com.actitime.automation;

import org.example.DeleteUser1;
import org.example.SearchUser1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchUser extends BaseClass{
    WebDriver driver;
    CommonFunctions commonFunctions;
    ActitimePage login;
    DeleteUser1 delete;
    @BeforeClass
    public void setup() {
        driver=launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        login=new ActitimePage(driver);
        delete=new  DeleteUser1(driver);
        commonFunctions=new CommonFunctions(driver);
    }
    @Test(dataProvider = "getTestData")
    public void login(Object username,Object password) throws InterruptedException {
        login.login(username.toString(),password.toString());
        //click on user
        commonFunctions.click(delete.userModule);
        //click on New User
        commonFunctions.click(delete.newUser);
        //enter on first name
        WebElement element=driver.findElement(delete.firstName);
        String fn="CYBER";
        commonFunctions.enterTextWithJS(fn,element);
        //enter on last name
        WebElement last=driver.findElement(delete.lastName);
        String ln="SUCCESS";
        commonFunctions.enterTextWithJS(ln,last);
        //enter on email
        WebElement email=driver.findElement(delete.email);
        String em="cybersuccess1@yopmail.com";
        commonFunctions.enterTextWithJS(em,email);
        //click on dept dropdown
        commonFunctions.click(delete.dropDown);
        //click on dept
         commonFunctions.click(delete.dept);
        //click on save and send
         commonFunctions.click(delete.save);
    }
    @DataProvider
    public Object[][] getTestData() {
        Object [][] obj=new Object[][]{
                {"yuktadhanwate2000@gmail.com","Artz@SSp"}
        };
        return obj;
    }}

