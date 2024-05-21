package com.actitime.automation;

import org.example.FilterTaskNew1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifySearchBox extends BaseClass {
    WebDriver driver;
    CommonFunctions commonFunctions;
    ActitimePage loginPage;
    FilterTaskNew1 search;
    @BeforeClass
    public void setup() {
        driver=launchBrowser("chrome");
        driver.get("https://online.actitime.com/google2");
        loginPage=new ActitimePage(driver);
        commonFunctions=new CommonFunctions(driver);
        search=new FilterTaskNew1(driver);
    }
    @BeforeMethod
    public void setLoginPage(){
        loginPage.login("yuktadhanwate2000@gmail.com","Artz@SSp");
    }
    @Test
    public void searchBox() {
        //click on Task
        commonFunctions.click(search.task);
        //find search box
        WebElement element=driver.findElement(search.searchBox);
        String str="ABC1234";
        commonFunctions.enterTextWithJS(str,element);
        //customer getText
        WebElement ele=driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]"));
        if(!ele.equals(str)){
            System.out.println("customer found");
        }else{
            System.out.println("customer not found");
        }
    }
}


