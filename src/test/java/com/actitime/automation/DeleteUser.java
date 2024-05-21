package com.actitime.automation;

import org.example.DeleteUser1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteUser extends BaseClass{
    WebDriver driver;
    CommonFunctions commonFunctions;
    ActitimePage loginPage;
    DeleteUser1 user;
    @BeforeClass
    public void setup() {
        driver=launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        commonFunctions=new CommonFunctions(driver);
        loginPage=new ActitimePage(driver);
        user=new DeleteUser1(driver);
    }
    @Test(dataProvider = "getTestData")
    public void login(Object username,Object password) throws InterruptedException {
        loginPage.login(username.toString(),password.toString());
        //click on user
        commonFunctions.click(user.userModule);
        //click on New User
        commonFunctions.click(user.newUser);
        //enter on first name
       // WebElement use=driver.findElement(user.userName);
        WebElement element=driver.findElement(user.firstName);
        String str="Cyber1";
        commonFunctions.enterTextWithJS(str,element);
        //enter on last name
        WebElement ele1=driver.findElement(user.lastName);
        String lN="Success1";
        commonFunctions.enterTextWithJS(lN,ele1);
        //enter on email
        WebElement id=driver.findElement(user.email);
        String em="cybersuccess1@yopmail.com";
        commonFunctions.enterTextWithJS(em,id);
        //click on dept dropdown
         commonFunctions.click(user.dropDown);
        //click on dept
         commonFunctions.click(user.dept);
        //click on save and send
         commonFunctions.click(user.save);
        //click on close
        commonFunctions.click(user.close);
        //click on search icon
        commonFunctions.click(user.searchIcon);
        //Enter user name
       WebElement name=driver.findElement(user.userName);
       String sc="Success1, Cyber1";
       commonFunctions.enterTextWithJS(sc,name);
        String user="Cyber1 Success1";
        WebElement element1=driver.findElement(By.xpath("//span[text()='Success1']"));
        String name1=element.getText();
        if(user.equals(name1)){
            System.out.println("Test Csae pass : user display");
        }else{
            System.out.println("Test case fail : user not display");
        }
    }
    @DataProvider
    public Object[][] getTestData() {
        Object [][] obj=new Object[][]{
                {"yuktadhanwate2000@gmail.com","Artz@SSp"}
        };
        return obj;
    }}



