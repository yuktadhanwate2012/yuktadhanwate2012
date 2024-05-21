package com.actitime.automation;

import org.example.OrangehrmLogin1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangehrmLogin extends BaseClass{
    WebDriver driver;
    LoginPage loginPage;
    String errorMsg;
    CommonFunctions commonFunctions;
    OrangehrmLogin1 orange;
    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser) throws InterruptedException {
        driver=launchBrowser(browser);
        driver.get("https://online.actitime.com/google2");
    }
    @Test(dataProvider = "getTextData")
    public void login(Object username1,Object pasword1,Object status) throws Exception {
        loginPage = new LoginPage(driver);
        loginPage.login(username1.toString(),pasword1.toString());
        String test=status.toString();
        if(test.equals("test1")){
            // Locate the Dashboard text and get the text
            WebElement dashboard = driver.findElement(orange.dashboard);
            String dashboardText = dashboard.getText();
            System.out.println(dashboardText);
            //verify the dashboardText value
            if (dashboardText.equals("Dashboard")) {
                System.out.println("Successfully landed on Dashboard module");
            } else {
                throw new Exception("Unable to login application");
            }
            //perform logout operation
            loginPage.logout();
        } else if (test.equals("test2")) {
            String errorMsg=driver.findElement(orange.errorMsg).getText();
            loginPage.verifyErrorMsg(errorMsg);
            driver.navigate().refresh();
        } else if (test.equals("test3")) {
            errorMsg=driver.findElement(orange.getErrorMsg2).getText();
            loginPage.verifyErrorMsg(errorMsg);
            driver.navigate().refresh();
        } else if (test.equals("test4")){
            //required message
            String requiredMsg1 = driver.findElement(orange.reqMsg1).getText();
            String requiredMsg2 = driver.findElement(orange.reqMsg2).getText();
            if (requiredMsg1.equals("Required") && requiredMsg2.equals("Required"))
            {
                System.out.println("Both Blank Test is Pass");
            }
            else{
                throw new Exception("Both Blank Test is fail");
            }
            driver.navigate().refresh();
        } else if (test.equals("test5")) {
            errorMsg= driver.findElement(orange.getErrorMsg5).getText();
            loginPage.requiredMsg(errorMsg);
            driver.navigate().refresh();
        }
        else if (test.equals("test6"))
        {Thread.sleep(5000);
            errorMsg=driver.findElement(orange.getErrorMsg6).getText();
            loginPage.requiredMsg(errorMsg);
            driver.navigate().refresh();
        }else if (test.equals("test7")){
            errorMsg=driver.findElement(orange.getErrorMsg7).getText();
            loginPage.verifyErrorMsg(errorMsg);
            driver.navigate().refresh();
        }
    }

    @DataProvider
    public Object[][] getTextData() {

        Object[][] obj = new Object[][]{
                {"Admin", "admin123","test1"},
                {"Admin#$%", "admin123","test2"},
                {"admin", "1234","test3"},
                {"", "","test4"},
                {"Admin","","test5"},
                {"","admin123","test6"},
                {"Admin","true","test7"},
        };
        return obj;
    }
}
