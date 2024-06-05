package com.actitime.automation;

import org.example.FileUploadTest1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUploadTest extends BaseClass{
    WebDriver driver;
    LoginPage loginPage;
    CommonFunctions commonFunctions;
    FileUploadTest1 fileUploadTest1;
    @BeforeClass
    public void setUP() throws InterruptedException {
        driver=launchBrowser("chrome");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage=new LoginPage(driver);
        Thread.sleep(5000);
        loginPage.login("admin","admin123");
        commonFunctions=new CommonFunctions(driver);
        fileUploadTest1=new FileUploadTest1(driver);
    }
    @Test
    public void verifyFileUpload() throws IOException, InterruptedException {
      commonFunctions.click(fileUploadTest1.pim);
      commonFunctions.click(fileUploadTest1.addButton);
      commonFunctions.click(fileUploadTest1.plusicon);
      Thread.sleep(10000);
      Runtime.getRuntime().exec("D:\\ProfilePhoto.exe D:\\ProfileImage.PNG");
    }
}
