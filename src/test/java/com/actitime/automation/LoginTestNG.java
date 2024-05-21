package com.actitime.automation;

import org.example.LoginTestNG1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestNG extends BaseClass {
    WebDriver driver;
    ActitimePage actitimePage;
    LoginTestNG1 loginTestNG1;
    CommonFunctions commonFunctions;
    @BeforeMethod
    public void setup() {
        driver=launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        actitimePage=new ActitimePage(driver);
        commonFunctions=new CommonFunctions(driver);
        loginTestNG1=new LoginTestNG1(driver);
    }

    @Test(priority = 1)
    public void loginWithValidCredentials() {
        //find username and enter username
        WebElement element=driver.findElement(loginTestNG1.username);
        String str1="yuktadhanwate2000@gmail.com";
        commonFunctions.enterTextWithJS(str1,element);
        //find password and enter password
        WebElement element1=driver.findElement(loginTestNG1.password);
        String str="Artz@SSp";
        commonFunctions.enterTextWithJS(str,element1);
        //find login and click
        commonFunctions.click(loginTestNG1.login);
    }
    @Test(priority = 2)
    public void loginWithInvalidCredentials() throws InterruptedException{
        //find username and enter username
        WebElement element=driver.findElement(loginTestNG1.username);
         String str2="yuktadhanwate2000@gmail.com";
         commonFunctions.enterTextWithJS(str2,element);
        //find login and click
         commonFunctions.click(loginTestNG1.login);
        //verify error message
        Thread.sleep(5000);
        String errorMsg1= driver.findElement(loginTestNG1.error).getText();
        if (errorMsg1.equals("Username or Password is invalid. Please try again.")) {
            System.out.println("Test case pass : user not able to login");
        } else {
            System.out.println("Test case fail: user able to login");
        }
        //refresh
        driver.navigate().refresh();
    }
    @Test(priority = 3)
    public void loginWithInvalidCredentialsPwd() throws InterruptedException {
        //find password and enter password
        WebElement element1=driver.findElement(loginTestNG1.password);
        String str3="Artz@SSp";
        commonFunctions.enterTextWithJS(str3,element1);
        //find login and click
        commonFunctions.click(loginTestNG1.login);
        //verify error message
        Thread.sleep(5000);
        String errorMsg= driver.findElement(loginTestNG1.error3).getText();
        if (errorMsg.equals("Username or Password is invalid. Please try again.")) {
            System.out.println("Test case pass : user not able to login");
        } else {
            System.out.println("Test case fail: user able to login");
        }
        //refresh
        driver.navigate().refresh();
    }
    @Test(priority = 4)
    public void loginWithInvalidCredentialsBothEmpty()throws Exception {
        //find login and click
         commonFunctions.click(loginTestNG1.login);
        //verify error message
        Thread.sleep(5000);
        String errorMsg = driver.findElement(loginTestNG1.error4).getText();
        if (errorMsg.equals("Username or Password is invalid. Please try again.")) {
            System.out.println("Test case pass : user not able to login");
        } else {
            System.out.println("Test case fail: user able to login");
        }
        //refresh
        driver.navigate().refresh();


    }

}
