package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class CommonFunctions {
    WebDriver driver;
    WebElement element;

    public CommonFunctions(WebDriver driver){
       this.driver=driver;
    }
    public void waitForElementToPresent(By by){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }
    public void waitElementToBeClickable(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitElementToBeClickable(By by){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void fluentWait(By by){
        Wait<WebDriver> fluentWait=new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(5))
                .withTimeout(Duration.ofSeconds(50))
                .ignoring(Exception.class) ;
        Function<WebDriver,WebElement> function=(var)->{
            System.out.println("wait until the element is available");
            waitElementToBeClickable(driver.findElement(by));
            return driver.findElement(by);
        };
        fluentWait.until(function);
    }
    public void enterTextWithJS(String text,WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='"+text+"';",element);
    }
    public void clickUsingJS(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);
    }
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public void scrollBy(int x,int y){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy("+x+","+y+");");
    }
    public void click(WebElement element){
        waitElementToBeClickable(element);
        element.click();
    }
    public  void click(By by){
      fluentWait(by);
      driver.findElement(by).click();
    }
    public String sendKeys(String str){
        waitElementToBeClickable(element);
        element.sendKeys(str);
        return str;
    }
    public WebElement getText(WebElement element){
        waitElementToBeClickable(element);
        element.getText();
        return element ;
    }

}

