package com.actitime.automation;

import org.example.AddUserWithBlank1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddUserWithBlank extends BaseClass{
    WebDriver driver;
    ActitimePage loginPage;
    CommonFunctions commonFunctions;
    AddUserWithBlank1 adduser;

    @BeforeClass
    public void setup() {
       driver=launchBrowser("chrome");
       driver.get("https://online.actitime.com/google2");
       loginPage=new ActitimePage(driver);
       commonFunctions=new CommonFunctions(driver);
       adduser=new AddUserWithBlank1(driver);
    }
    @BeforeMethod
    public  void setLoginPage() throws InterruptedException {
        loginPage.login("yuktadhanwate2000@gmail.com","Artz@SSp");
        Thread.sleep(10000);
    }
    @Test
    public void emptyUser() {
        //click on user
        commonFunctions.click(adduser.clickOnUser);
        //click on New User
       commonFunctions.click(adduser.clickOnNewUser);
        //enter on first name
        commonFunctions.waitElementToBeClickable(adduser.firstName);
        driver.findElement(adduser.firstName).sendKeys("");
        //enter on last name
        commonFunctions.waitElementToBeClickable(adduser.lastName);
        driver.findElement(adduser.lastName).sendKeys("");
        //enter on email
        commonFunctions.waitElementToBeClickable(adduser.email);
        driver.findElement(adduser.email).sendKeys("cybersuccess@yopmail.com");
        //click on dept dropdown
        commonFunctions.click(adduser.dropdown);
        //click on dept
        commonFunctions.click(adduser.dept);
        //click on save and send
        commonFunctions.click(adduser.save);
        //verify empty msg
        WebElement empty=driver.findElement(adduser.emptyMsg);
        String emptyMsg=empty.getText();
        if(emptyMsg.equals("cannot be empty")){
            System.out.println("Test case pass");
        }else{
            System.out.println("Test case fail");
        }
        //click on cancel
        commonFunctions.click(adduser.cancel);
       /* Alert alert = driver.switchTo().alert();
        alert.accept();
        //click on New User
        driver.findElement(By.xpath("//div[text()='New User']")).click();
        Thread.sleep(7000);

        //enter on first name
        driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("");

        //enter on last name
        driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("Success");

        //enter on email
        driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("cybersuccess@yopmail.com");
        Thread.sleep(10000);
        //click on dept dropdown
        driver.findElement(By.xpath("//div[@id='createUserPanel_accessToOtherProductSelectorPlaceholder']/following::div[9]")).click();
        Thread.sleep(5000);
        //click on dept
        driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']/following::div[text()='HR & Finance']")).click();

        //click on save and send
        driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();

        //verify empty msg
        WebElement empty1=driver.findElement(By.xpath("//div[@id='createUserPanel_lastNameEmptyError']"));
        String emptyMsg1=empty.getText();
        if(emptyMsg1.equals(empty1)){
            System.out.println("Test case pass");
        }else{
            System.out.println("Test case fail");
        }*/


    }}

