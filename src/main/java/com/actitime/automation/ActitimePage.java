package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class ActitimePage {
    WebDriver driver;

    public  ActitimePage(WebDriver driver){

        this.driver=driver;
    }

    public void login(String username,String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("pwd")).sendKeys(password);
        driver.findElement(By.xpath("//div[text()='Login '] ")).click();
    }

    public void createCutomer() throws InterruptedException {
        //click on add new
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);

        //Click on Add Customer
        driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
        Thread.sleep(5000);

    }

    public void fluentWait(WebDriver driver,By by){
        Wait<WebDriver> fluentwait=new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(2))
                .withTimeout(Duration.ofSeconds(15))
                .ignoring(Exception.class);
        Function<WebDriver, WebElement> function=(var)->{
            return  driver.findElement(by);
        };
        fluentwait.until(function);
    }


}


