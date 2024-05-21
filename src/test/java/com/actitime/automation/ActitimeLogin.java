package com.actitime.automation;

import org.example.ActitimeLogin1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActitimeLogin extends BaseClass{
    WebDriver driver;
    ActitimePage loginPage;
    CommonFunctions commonFunctions;
    ActitimeLogin1 login;
    @BeforeClass
    public void setUp() {
        driver = launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        login = new ActitimeLogin1(driver);
        loginPage = new ActitimePage(driver);
        commonFunctions = new CommonFunctions(driver);
    }
    @BeforeMethod
    public void loginin() throws InterruptedException {
        loginPage.login("yuktadhanwate2000@gmail.com", "Artz@SSp");
       Thread.sleep(10000);
    }
    @Test
    public void changeStatus(){
        /*String timeTrackText=driver.findElement(By.xpath("//h3[text()='Enter Time-Track for']")).getText();
        Thread.sleep(5000);
        if(timeTrackText.equalsBy.xpath("//div[text()='New Status:']/following::div[3]")"Enter Time-Track for")){
            System.out.println("Able to login : success landed on Time Track module");
        }else{
           throw new Exception("Unable to login on Time Track module");
        }*/
        //click on task
        commonFunctions.click(login.taskModule);
        //click on checkbox
        commonFunctions.click(login.checkBox);
        //click on change status
        commonFunctions.click(login.changeStatus);
        //click on dropdown
        commonFunctions.click(login.dropDown);
        //click on planning status
        commonFunctions.click(login.planningStatus);
        //click on Apply
        commonFunctions.click(login.apply);
    }
}


