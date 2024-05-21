package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class AmazonImg extends BaseClass{
    WebDriver driver;
   @Test
   public void setUp() throws AWTException {
        driver=launchBrowser("chrome");
        //navigate to url
        driver.get("https://www.amazon.in/");
        //for second window
        Actions actions=new Actions(driver);
        WebElement window= driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
        //Right click on link
        actions.contextClick(window).build().perform();
        Robot robot = new Robot();
        //click for new window
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //get title of first window
        System.out.println(driver.getTitle());
        //get id of first window
        String windowId1= driver.getWindowHandle();
        System.out.println("first window id "+windowId1);
        //get id's of all windows
        Set<String> allWindowIds=driver.getWindowHandles();
        System.out.println(allWindowIds);

}}
