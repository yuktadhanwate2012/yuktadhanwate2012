package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //method for login
    public void login(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    //method for logout
    public void logout() {
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']/following-sibling::i")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    //to verify error message
    public void verifyErrorMsg(String msg) throws Exception {
        if (msg.equals("Invalid credentials")) {
            System.out.println("Test pass with invalid credential");
        } else {
            throw new Exception("Test failed: error message is not displayed on login page with invalid credential");
        }


        //to verify Required message


    }

    public void requiredMsg(String requiredMsg) throws Exception {
        if (requiredMsg.equals("Required")) {
            System.out.println("Test Case Passed With 'Required' Massage Display ");
        } else {
            throw new Exception("Testcase Failed :Required Massage not displaying on fields");
        }

    }
}



