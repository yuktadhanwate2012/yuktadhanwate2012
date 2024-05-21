package com.actitime.automation;

import org.example.BrowserTabOperation1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class BrowserTabOperations extends BaseClass{
    WebDriver driver;
    BrowserTabOperation1 tab;
    @BeforeMethod
    public void setUp() throws InterruptedException {
         driver =launchBrowser("chrome");
         driver.get("https://online.actitime.com/cybersuccess7/login.do");}
    @Test
     public void click(){
         Actions actions=new Actions(driver);
         tab=new BrowserTabOperation1(driver);
         WebElement actiTimeLink = driver.findElement(tab.actitime);
         actions.contextClick(actiTimeLink ).build().perform();
         actions.keyDown(Keys.ARROW_DOWN).build().perform();
         actions.keyUp(Keys.ARROW_DOWN).build().perform();
         actions.keyDown(Keys.ENTER).build().perform();
         actions.keyUp(Keys.ENTER).build().perform();
        //print the title of login page
        System.out.println("Title of login page :"+driver.getTitle());
        //get current tab/window id
        String loginWindowId= driver.getWindowHandle();
        System.out.println("Login window Id: "+loginWindowId);
        //get ids of all tabs/window
        Set<String> allWindowIds=driver.getWindowHandles();
        System.out.println(allWindowIds);
        //iterate through the set and check loginWindowId. if it is a loginWindowId
        //then ignore it and print other one
        for (String id:allWindowIds){
            if(!id.equals(loginWindowId)){
                System.out.println("second Tab/window Id "+id);

                //jump the control to second tab
                driver.switchTo().window(id);

                System.out.println("Second tab Title "+driver.getTitle());

                //close the second tab
                driver.close();

                //switch the control back to login page
                driver.switchTo().window(loginWindowId);

                //print the title of current page
                System.out.println("Current page title: "+driver.getTitle());

            }
        }



    }
}

